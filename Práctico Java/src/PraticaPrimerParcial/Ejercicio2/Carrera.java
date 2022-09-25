package PraticaPrimerParcial.Ejercicio2;

import java.util.LinkedList;

public class Carrera {
    private String nombre;
    private LinkedList<Materia> coleccionMaterias = new LinkedList<>();

    public Carrera(String nombre){
        this.nombre = nombre;
    }

    void agregarMateria(Materia materia){
        coleccionMaterias.add(materia);
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public LinkedList<Materia> getColeccionMaterias() {
        return coleccionMaterias;
    }

    public void setColeccionMaterias(LinkedList<Materia> coleccionMaterias) {
        this.coleccionMaterias = coleccionMaterias;
    }

    public void listarMaterias(){
        for (Materia materia:coleccionMaterias){
            materia.toString();
        }
    }

    @Override
    public String toString() {
        return "Carrera{" +
                "nombre='" + nombre + '\'' +
                ", coleccionMaterias=" + coleccionMaterias.toString() +
                '}';
    }
}
