package Practica_TAD;

public class NodoColaRecorridoAnchura {
    public NodoColaRecorridoAnchura siguiente;
    public NodoBinario valor;

    public NodoColaRecorridoAnchura(NodoBinario valor) {
        this.valor = valor;
        this.siguiente = null;
    }
}
