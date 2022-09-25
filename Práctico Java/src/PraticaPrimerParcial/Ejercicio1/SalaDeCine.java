package PraticaPrimerParcial.Ejercicio1;

import java.util.LinkedList;

public class SalaDeCine {

    private String nombre;
    private int capacidad;
    private Pelicula pelicula;
    private LinkedList<Espectador> coleccionEspectadores = new LinkedList();
    private LinkedList<Empleado> coleccionEmpleados = new LinkedList();

    public SalaDeCine(String nombre, int capacidad, Pelicula pelicula) {
        this.nombre = nombre;
        this.capacidad = capacidad;
        this.pelicula = pelicula;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getCapacidad() {
        return capacidad;
    }

    public void setCapacidad(int capacidad) {
        this.capacidad = capacidad;
    }

    public Pelicula getPelicula() {
        return pelicula;
    }

    public void setPelicula(Pelicula pelicula) {
        this.pelicula = pelicula;
    }

    public LinkedList<Espectador> getColeccionEspectadores() {
        return coleccionEspectadores;
    }

    public void setColeccionEspectadores(LinkedList<Espectador> coleccionEspectadores) {
        this.coleccionEspectadores = coleccionEspectadores;
    }

    public LinkedList<Empleado> getColeccionEmpleados() {
        return coleccionEmpleados;
    }

    public void setColeccionEmpleados(LinkedList<Empleado> coleccionEmpleados) {
        this.coleccionEmpleados = coleccionEmpleados;
    }

    void agregarEspectador(Espectador espectador){
        coleccionEspectadores.add(espectador);
    }

    void agregarEmpleado(Empleado empleado){
        coleccionEmpleados.add(empleado);
    }

    void listarEspectadores(){
        if (coleccionEspectadores != null){
            for (Espectador espectador : coleccionEspectadores){
                System.out.println(espectador.toString());
            }
        }else {
            System.out.println("SIN ESPECTADORES CARGADOS");
        }
    }

    void listarEmpleados(){
        if (coleccionEmpleados != null){
            for (Empleado empleado : coleccionEmpleados){
                System.out.println(empleado.toString());
            }
        }else {
            System.out.println("SIN ESPECTADORES CARGADOS");
        }
    }

    @Override
    public String toString() {
        return "SalaDeCine{" +
                "nombre='" + nombre + '\'' +
                ", capacidad=" + capacidad +
                ", pelicula=" + pelicula.toString() +
                ", coleccionEspectadores=" + coleccionEspectadores.toString() +
                ", coleccionEmpleados=" + coleccionEmpleados.toString() +
                '}';
    }
}
