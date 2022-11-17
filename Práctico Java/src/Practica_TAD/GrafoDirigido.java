package Practica_TAD;

public class GrafoDirigido {

    boolean[][] matrizAdyacencia;
    int[][] matrizPesos;
    String[] vertices;

    public GrafoDirigido(String[] vertices) {
        this.vertices = vertices;
        matrizAdyacencia = new boolean[vertices.length][vertices.length];
        matrizPesos = new int[vertices.length][vertices.length];
    }

    public void conectar(String v1,String v2,int peso){
        int index1 = busquedaIndex(v1);
        int index2 = busquedaIndex(v2);

        if (index1 != -1 && index2 != -1) {
            matrizPesos[index1][index2] = peso;
            matrizAdyacencia[index1][index2] = true;
        }
    }

    public void imprimirPesos(){
        for (int i = 0; i < vertices.length; i++){
            for (int j = 0; j < vertices.length; j++){
                System.out.print(matrizPesos[i][j]+ "\t");
            }
            System.out.println();
        }
    }

    public void imprimirAdyacencia(){
        for (int i = 0; i < vertices.length; i++){
            for (int j = 0; j < vertices.length; j++){
                System.out.print(matrizAdyacencia[i][j]+ "\t");
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
