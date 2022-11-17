package Practica_TAD;

import java.util.LinkedList;
import java.util.Objects;

public class Vertice {

    String valor;
    ListaSimple nodosAdyacentes;

    public Vertice(String valorV){
        this.valor = valorV;
        nodosAdyacentes = new ListaSimple();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Vertice vertice = (Vertice) o;
        return Objects.equals(valor, vertice.valor);
    }

    @Override
    public int hashCode() {
        return Objects.hash(valor);
    }
    public String Proximos(){
        return nodosAdyacentes.toString();
    }
    @Override
    public String toString() {
        return valor + "\t|" + nodosAdyacentes.toString();
    }
}
