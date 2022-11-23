package Practica_TAD;

public class Pruebas {
    public static void main(String[] args){
        String[] vertices = {"A","B","C","D","E","F","G"};
        Grafooo grafo = new Grafooo(vertices);

        grafo.conectar("A","B",7);
        grafo.conectar("A","D",5);
        grafo.conectar("D","B",9);
        grafo.conectar("B","C",8);
        grafo.conectar("B","E",7);
        grafo.conectar("C","E",5);
        grafo.conectar("D","E",15);
        grafo.conectar("D","F",6);
        grafo.conectar("F","G",11);
        grafo.conectar("F","E",8);
        grafo.conectar("E","G",9);

        grafo.imprimir();
        grafo.impimirListaAdyasencia();
        grafo.nodosProximos("B");
    }
}
