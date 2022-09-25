package PraticaPrimerParcial.Ejercicio1;

public class Empleado extends Persona{

    private int sueldo;

    public Empleado(String nombre, int dni, int sueldo) {
        super(nombre, dni);
        this.sueldo = sueldo;
    }

    public String toString() {
        return "Empleado{" +
                "nombre='" + getNombre() + '\'' +
                ", dni=" + getDni() + '\'' +
                ", sueldo" + this.sueldo +
                '}';
    }
}
