package PraticaPrimerParcial.Ejercicio2;

import java.util.LinkedList;

public class Facultad {

    private String nombre;
    private LinkedList<Carrera> coleccionCarrera = new LinkedList<>();

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public LinkedList<Carrera> getColeccionCarrera(LinkedList<Carrera> carreras) {
        return coleccionCarrera;
    }
    public void setColeccionCarrera(LinkedList<Carrera> coleccionCarrera) {
        this.coleccionCarrera = coleccionCarrera;
    }
    public Facultad(String nombre){
        this.nombre = nombre;
    }
    void agregarCarrera(Carrera nuevaCarrera){
        this.coleccionCarrera.add(nuevaCarrera);
    }
    void mostrarCarreras(){
        for (Carrera carrera:coleccionCarrera){
            System.out.println(carrera.toString());
        }
    }
}
