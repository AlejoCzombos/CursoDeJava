package Segundo_Parcial_Programacion;

import java.util.LinkedList;

public class Main {
    public static void main(String[] args){
        String[] vertices = {"A","B","C","D","E","F"};
        LinkedList aristasA = new LinkedList();
        Grafo grafo = new Grafo(vertices);

        aristasA.add("E");
        aristasA.add("E");
        aristasA.add("B");
        aristasA.add("F");

        //grafo.conectar("A", aristasA); //Punto 4: coneccion a partir del conjunto de aristas
        grafo.conectar("A","B");
        grafo.conectar("A","E");
        grafo.conectar("E","A");
        grafo.conectar("A","F");
        grafo.conectar("B","E");//Punto 4: coneccion a partir del conjunto de vertices
        grafo.conectar("B","C");
        grafo.conectar("C","B");
        grafo.conectar("C","E");
        grafo.conectar("C","D");
        grafo.conectar("D","F");
        grafo.conectar("F","D");
        grafo.conectar("D","E");
        grafo.conectar("F","E");

        System.out.println("La siguiente coneccion tira error porque no se puede conectar mas de 2 veces cada par de nodos");
        grafo.conectar("A", "E"); //Punto 7

        grafo.impimirListaAdyasencia();

        System.out.println("Eliminar conexion entre B y C");
        grafo.eliminarConexion("B", "C");

        grafo.impimirListaAdyasencia();//Punto 10
        grafo.nodosProximos("F");//Punto 9
    }
}
