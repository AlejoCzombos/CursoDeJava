package PraticaPrimerParcial.Ejercicio3;

public class Empleado extends Persona {

    private double sueldo;

    public Empleado(String nombre, String apellido, int dni, double sueldoBasico) {
        super(nombre, apellido, dni, sueldoBasico);
    }

    public double verSueldo(){
        return getSueldoBasico();
    }
}
