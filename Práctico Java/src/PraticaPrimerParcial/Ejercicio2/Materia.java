package PraticaPrimerParcial.Ejercicio2;

import java.util.LinkedList;

public class Materia {

    private String nombre;
    private Profesor titular;
    private LinkedList<Estudiante> coleccionEstudiantes = new LinkedList<>();

    public Materia(String nombre, Profesor titular) {
        this.nombre = nombre;
        this.titular = titular;
    }
    void agregarEstudiante(Estudiante estudiante){
        coleccionEstudiantes.add(estudiante);
    }

    @Override
    public String toString() {
        return "Materia{" +
                "nombre='" + nombre + '\'' +
                ", titular=" + titular +
                ", coleccionEstudiantes=" + coleccionEstudiantes.toString() +
                '}';
    }

    void listarEstudiantes(){
        for (Estudiante estudiante : coleccionEstudiantes) {
            System.out.println(estudiante.toString());
        }
    }
}
