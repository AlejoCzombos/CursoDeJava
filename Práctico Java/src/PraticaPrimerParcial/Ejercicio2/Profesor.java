package PraticaPrimerParcial.Ejercicio2;

public class Profesor extends Persona {

    public Profesor(String nombre, String apellido, String legajo) {
        super(nombre, apellido, legajo);
    }

    @Override
    void modificarDatos(String nombre, String apellido, String legajo) {
        this.setNombre(nombre);
        this.setApellido(apellido);
        this.setLegajo(legajo);
    }

    @Override
    public String toString() {
        return "Profesor{" +
                "nombre='" + this.getNombre() + '\'' +
                ", apellido='" + this.getApellido() + '\'' +
                ", legajo=" + this.getLegajo() +
                '}';
    }
}
