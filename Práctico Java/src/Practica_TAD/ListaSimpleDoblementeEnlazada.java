package Practica_TAD;

public class ListaSimpleDoblementeEnlazada {

    private Nodo primero;
    private Nodo ultimo;
    public int tamaño;

    public ListaSimpleDoblementeEnlazada(){
        this.primero = null;
        this.ultimo = null;
        this.tamaño = 0;
    }

    public boolean vacia(){
        return this.primero == null;
    }

    public void agregar(String valor){
        Nodo nuevo = new Nodo(valor);

        if(vacia()){
            this.primero = nuevo;
            this.ultimo = nuevo;
            this.ultimo.siguiente = primero;
        }else {
            this.ultimo.siguiente = nuevo;
            nuevo.siguiente = primero;
            ultimo = nuevo;
        }
        this.tamaño++;
    }
    public void eliminarUltimo() {
        if (vacia()) {
            System.out.println("Lista vacia");
        } else {
            Nodo aux = primero;
            Nodo ult;

            while (aux.siguiente != ultimo) {
                aux = aux.siguiente;
            }
            ult = aux.siguiente;
            ult = null;

            ultimo = aux;
            aux.siguiente = primero;

            this.tamaño--;
        }
    }

    public void imprimir() {
        if (vacia()) {
            System.out.println("Lista vacia");
        } else {
            Nodo aux = this.primero;
            for(int i = 0; i<this.tamaño; i++) {
                System.out.println(aux.valor);
                aux = aux.siguiente;
            }
        }
    }
    public void ultimo(){
        System.out.println(ultimo.siguiente);
    }
    public void imprimir(int lugar){
        if (vacia()) {
            System.out.println("Lista vacia");
        }else if (lugar+1 > tamaño){
            System.out.println("Lugar inexistente");
        } else {
            Nodo aux = this.primero;
            for(int i = 0; i<lugar; i++) {
                aux = aux.siguiente;
            }
            System.out.println(aux.valor);
        }
    }
    public void eliminar(int lugar){
        if (vacia()) {
            System.out.println("No se puede eliminar porque esta vacia");
        }else if (lugar+1 > tamaño){
            System.out.println("Lugar inexistente");
        }else if (lugar+1 == tamaño){
            eliminarUltimo();
        }else if (lugar == 0){
            this.primero = primero.siguiente;
            ultimo.siguiente = primero;
            tamaño--;
        }
        else {
            Nodo aux = this.primero;
            Nodo siguiente;
            for(int i = 0; i<lugar-1; i++) {
                aux = aux.siguiente;
            }
            siguiente = aux.siguiente.siguiente;
            aux.siguiente = siguiente;
            tamaño--;
        }
    }
}
