package Segundo_Parcial_Programacion;

import java.util.LinkedList;

public class Grafo {

    protected Vertice[] listaAdyacencia;
    private String[] vertices;
    int[][] matrizPesos;

    public Grafo(String[] vertices) {
        listaAdyacencia = new Vertice[vertices.length];
        this.vertices = vertices;
        for (int i = 0;i<vertices.length; i++){
            listaAdyacencia[i] = new Vertice(vertices[i]);
        }
    }

    public void conectar(String v1, LinkedList aristas){ //Punto 4
        for (int i = 0; i < vertices.length; i++){
            if(listaAdyacencia[i].getValor().equals(v1)) {
                listaAdyacencia[i].setNodosAdyacentes(aristas);
            }
        }
    }

    public void conectar(String v1, String v2) { //Punto 4, 5, 6 ,7
        for (int i = 0; i < vertices.length; i++){
            if(listaAdyacencia[i].getValor().equals(v1)){
                if (listaAdyacencia[i].contadorConex(v2) < 2){
                    listaAdyacencia[i].getNodosAdyacentes().add(v2);
                }else {
                    System.out.println("Los nodos cumplieron el maximo de conecciones que es 2");
                }
            }else if (listaAdyacencia[i].getValor().equals(v2)){
                if (listaAdyacencia[i].contadorConex(v1) < 2){
                     listaAdyacencia[i].getNodosAdyacentes().add(v1);
                }
            }
        }
    }

    public void eliminarConexion(String v1, String v2){
        for (int i = 0; i < vertices.length; i++){
            if(listaAdyacencia[i].getValor().equals(v1)) {
                listaAdyacencia[i].eliminarConexion(v2);
            }else if (listaAdyacencia[i].getValor().equals(v2)) {
                listaAdyacencia[i].eliminarConexion(v1);
            }
        }
    }

    public void nodosProximos(String nodo) { // Punto 9
        for (int i = 0; i < vertices.length; i++) {
            if (listaAdyacencia[i].getValor().equals(nodo)) {
                System.out.println("Nodos Proximos al nodo " + nodo + " : " + listaAdyacencia[i].Proximos());
            }
        }
    }
    public void impimirListaAdyasencia(){
        for (int i = 0; i < vertices.length; i++){
            System.out.println(listaAdyacencia[i].toString());
        }
    }
    private int busquedaIndex(String v) {
        int resultado = -1;

        for (int i = 0; i < vertices.length; i++) {
            if (vertices[i].equals(v)) {
                resultado = i;
                break;
            }
        }
        return resultado;
    }
}