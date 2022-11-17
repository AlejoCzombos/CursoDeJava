package Practica_TAD;

public class NodoBinario {
    public String valor;

    public NodoBinario izq;
    public NodoBinario der;

    public NodoBinario(String valor) {
        this.valor = valor;
        this.izq = null;
        this.der = null;
    }

    @Override
    public String toString() {
        return this.valor;
    }
}
