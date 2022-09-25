package PraticaPrimerParcial.Ejercicio1;

public class Espectador extends Persona{

    private char butacaFila;
    private int butacaColumna;

    public Espectador(String nombre, int dni) {
        super(nombre, dni);
        this.butacaColumna = asignarColumna();
        this.butacaFila = asignarFila();
    }

    char asignarFila(){
        char letras[] = {'a', 'b', 'c', 'd','e','f','g','h','i','j','k','l','m','n','ñ','o','p','q','r','s','t','u','v','w','x','y','z'} ;
        return letras[(int) (Math.random()*28)];
    }
    int asignarColumna(){
        return (int) Math.random()*25;
    }

    @Override
    public String toString() {
        return "Espectador{" +
                "nombre='" + getNombre() + '\'' +
                ", dni=" + getDni() + '\'' +
                ", Butacafila=" + this.butacaFila + '\'' +
                ", Butacacolumna=" + this.butacaColumna +
                '}';
    }
}
