package Segundo_Parcial_Programacion;

import java.util.LinkedList;
import java.util.Objects;

public class Vertice {

    private String valor;
    private LinkedList nodosAdyacentes;

    public Vertice(String valorV){
        this.valor = valorV;
        nodosAdyacentes = new LinkedList();
    }

    public void eliminarConexion(String nodo){ //Punto 8
        for (Object vertice:nodosAdyacentes){
            if (vertice.equals(nodo)){
                nodosAdyacentes.remove();
                break;
            }
        }
    }

    public int contadorConex(String nodo){
        int cont = 0;
        for (Object vertice:nodosAdyacentes){
            if (vertice.equals(nodo)){
                cont++;
            }
        }
        return cont;
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
        return valor + "|" + nodosAdyacentes.toString();
    }
    public String getValor() {
        return valor;
    }

    public void setValor(String valor) {
        this.valor = valor;
    }

    public LinkedList getNodosAdyacentes() {
        return nodosAdyacentes;
    }

    public void setNodosAdyacentes(LinkedList nodosAdyacentes) {
        this.nodosAdyacentes = nodosAdyacentes;
    }
}
