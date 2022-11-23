package Practica_TAD;

import java.util.Objects;

public class VerticeP {

    String valor;
    ListaSimple nodosAdyacentes;

    public VerticeP(String valorV){
        this.valor = valorV;
        nodosAdyacentes = new ListaSimple();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Verticee vertice = (Verticee) o;
        return Objects.equals(valor, vertice.valor);
    }

    @Override
    public int hashCode() {
        return Objects.hash(valor);
    }

    @Override
    public String toString() {
        return valor + "\t|" + nodosAdyacentes.toString();
    }
}
