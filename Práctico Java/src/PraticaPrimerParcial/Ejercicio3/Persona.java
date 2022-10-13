package PraticaPrimerParcial.Ejercicio3;

import java.util.Scanner;

public abstract class Persona {

    private String nombre;
    private String apellido;
    private int dni;
    private double sueldoBasico;

    public Persona(String nombre, String apellido, int dni, double sueldoBasico) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese el nombre nuevo");
        try {
            this.nombre = nombre;
        }catch (Exception e){
            e.printStackTrace();
            System.out.println("Error en el ingreso de datos!");
        }

        System.out.println("Ingrese el apellido nuevo");
        try {
            this.apellido = apellido;
        }catch (Exception e){
            e.printStackTrace();
            System.out.println("Error en el ingreso de datos!");
        }

        System.out.println("Ingrese el dni nuevo");
        try {
            this.dni = dni;
        }catch (Exception e){
            e.printStackTrace();
            System.out.println("Error en el ingreso de datos!");
        }

        System.out.println("Ingrese el sueldo nuevo");
        try {
            this.sueldoBasico = sueldoBasico;
        }catch (Exception e){
            e.printStackTrace();
            System.out.println("Error en el ingreso de datos!");
        }
    }

    public void modificarDatos() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese el nombre nuevo");
        try {
            this.nombre = sc.nextLine();
        }catch (Exception e){
            e.printStackTrace();
            System.out.println("Error en el ingreso de datos!");
        }

        System.out.println("Ingrese el apellido nuevo");
        try {
            this.apellido = sc.nextLine();
        }catch (Exception e){
            e.printStackTrace();
            System.out.println("Error en el ingreso de datos!");
        }

        System.out.println("Ingrese el dni nuevo");
        try {
            this.dni = sc.nextInt();
        }catch (Exception e){
            e.printStackTrace();
            System.out.println("Error en el ingreso de datos!");
        }

        System.out.println("Ingrese el sueldo nuevo");
        try {
            this.sueldoBasico = sc.nextDouble();
        }catch (Exception e){
            e.printStackTrace();
            System.out.println("Error en el ingreso de datos!");
        }
    }

    public void subirSueldo(double incremento) {
        this.sueldoBasico = sueldoBasico + incremento;
    }

    public String getNombre() {
        return nombre;
    }
    public double getSueldoBasico() {
        return sueldoBasico;
    }
    public int getDni(){
        return dni;
    }
    public void setSueldoBasico(double sueldoBasico) {
        this.sueldoBasico = sueldoBasico;
    }

    @Override
    public String toString() {
        return "Persona{" +
                "nombre='" + nombre + '\'' +
                ", apellido='" + apellido + '\'' +
                ", dni=" + dni +
                ", sueldoBasico=" + sueldoBasico +
                '}';
    }
}
