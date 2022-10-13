package PraticaPrimerParcial.Ejercicio3;

public class Jefe extends Persona{

    private double porcentaje;

    public Jefe(String nombre, String apellido, int dni, double sueldoBasico,double porcentaje) {
        super(nombre, apellido, dni, sueldoBasico);
        try {
            this.porcentaje = porcentaje;
        }catch (Exception e){
            e.printStackTrace();
            System.out.println("Error en el ingreso de datos!");
        }
    }

    public double verSueldo(){
       return getSueldoBasico();
    }

}
