package PraticaPrimerParcial.Ejercicio2;

import java.util.Scanner;

import static java.lang.Integer.parseInt;

public abstract class Persona {

    private String nombre;
    private String apellido;
    private int legajo;

    public Persona(String nombre, String apellido, String legajo) {
        this.nombre = nombre;
        this.apellido = apellido;
        try {
            this.legajo = parseInt(legajo);
        } catch (RuntimeException e){
            System.out.println(e);
        }
    }
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public int getLegajo() {
        return legajo;
    }

    public void setLegajo(String legajo) {
        this.legajo = parseInt(legajo);
    }

    abstract void modificarDatos(String nombre, String apellido, String legajo);

    @Override
    public String toString() {
        return "Persona{" +
                "nombre='" + nombre + '\'' +
                ", apellido='" + apellido + '\'' +
                ", legajo=" + legajo +
                '}';
    }
}
