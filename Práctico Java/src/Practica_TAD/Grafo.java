package Practica_TAD;

public class Grafo {

    int[][] matrizPesos;
    Vertice[] listaAdyacencia;
    String[] vertices;

    public Grafo(String[] vertices) {
        listaAdyacencia = new Vertice[vertices.length];
        this.vertices = vertices;
        matrizPesos = new int[vertices.length][vertices.length];
        for (int i = 0;i<vertices.length; i++){
            listaAdyacencia[i] = new Vertice(vertices[i]);
        }
    }

    public void conectar(String v1, String v2, int peso) {
        int index1 = busquedaIndex(v1);
        int index2 = busquedaIndex(v2);

        if (index1 != -1 && index2 != -1) {
            matrizPesos[index1][index2] = peso;
            matrizPesos[index2][index1] = peso;
        }

        for (int i = 0; i < vertices.length; i++){
            if(listaAdyacencia[i].valor.equals(v1)){
                listaAdyacencia[i].nodosAdyacentes.agregar(v2);
            }else if (listaAdyacencia[i].valor.equals(v2)){
                listaAdyacencia[i].nodosAdyacentes.agregar(v1);
            }
        }
    }

    public void nodosProximos(String nodo) {
        for (int i = 0; i < vertices.length; i++) {
            if (listaAdyacencia[i].valor.equals(nodo)) {
                System.out.println("Nodos Proximos al nodo " + nodo + " : " + listaAdyacencia[i].Proximos());
            }
        }
    }
    public void impimirListaAdyasencia(){
        for (int i = 0; i < vertices.length; i++){
            System.out.println(listaAdyacencia[i].toString());
        }
    }
    public void impimirParesAdyacencia(){
        for (int i = 0; i < vertices.length; i++){
        }
    }

    public void imprimir() {
        for (int i = 0; i < matrizPesos.length; i++) {
            for (int j = 0; j < matrizPesos.length; j++) {
                System.out.print(matrizPesos[i][j] + "\t");
            }
            System.out.println();
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
