package PraticaPrimerParcial.Ejercicio2;

public class FacultadMain {

    public static void main(String[] args){

       Profesor p1 = new Profesor("Facundo", "Uferer", "23458");
       Profesor p2 = new Profesor("Facundo", "Matoff", "24673");

       Materia m1 = new Materia("Laboratorio II", p1);
       Materia m2 = new Materia("Programacion II", p2);

        Estudiante e1 = new Estudiante("Alejo", "Czombos", "53903");
        Estudiante e2 = new Estudiante("Agustin", "Campanella", "87234");
        Estudiante e3 = new Estudiante("Matias", "Barboza", "012345");
        Estudiante e4 = new Estudiante("Jose", "Alegre", "023732");

        m1.agregarEstudiante(e1);
        m1.agregarEstudiante(e2);

        m2.agregarEstudiante(e3);
        m2.agregarEstudiante(e4);

       Carrera c1 = new Carrera("ISI");
       Carrera c2 = new Carrera("TUP");
       Carrera c3 = new Carrera("LAR");

       c2.agregarMateria(m1);
       c2.agregarMateria(m2);

       Facultad f1 = new Facultad("UTN");

        f1.agregarCarrera(c1);
        f1.agregarCarrera(c2);
        f1.agregarCarrera(c3);

        f1.mostrarCarreras();
    }
}
