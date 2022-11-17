package Practica_TAD;

public class Nodo {

    public String valor;
    public Nodo siguiente;

    public Nodo(String valor){
        this.valor = valor;
        this.siguiente = null;
    }

    @Override
    public String toString() {
        return this.valor;
    }
}
