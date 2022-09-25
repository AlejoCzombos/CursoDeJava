package PraticaPrimerParcial.Ejercicio1;

public abstract class Persona implements Informaciones {

    private String nombre;
    private int dni;

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getDni() {
        return dni;
    }

    public void setDni(int dni) {
        this.dni = dni;
    }

    public Persona(String nombre, int dni) {
        this.nombre = nombre;
        this.dni = dni;
    }

    @Override
    public String toString() {
        return "Persona{" +
                "nombre='" + nombre + '\'' +
                ", dni=" + dni +
                '}';
    }

    @Override
    public String getNombre() {
        return this.nombre;
    }
}
