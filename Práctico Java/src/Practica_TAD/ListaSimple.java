package Practica_TAD;

public class ListaSimple {

    private Nodo primero;
    public int tamaño;

    public ListaSimple(){
        this.primero = null;
        this.tamaño = 0;
    }

    public boolean vacia(){
        return this.primero == null;
    }

    public void agregar(String valor){
        Nodo nuevo = new Nodo(valor);

        if(vacia()){
            this.primero = nuevo;
        }else {
            Nodo aux = this.primero;
            while (aux.siguiente != null){
                aux = aux.siguiente;
            }
            aux.siguiente = nuevo;
        }
        this.tamaño++;
    }
    public void eliminarUltimo() {
        if (vacia()) {
            System.out.println("Lista vacia");
        } else {
            Nodo aux = primero;
            Nodo nodoAnterior = aux;

            while (aux.siguiente != null) {
                nodoAnterior = aux;
                aux = aux.siguiente;
            }
            if (aux == this.primero) {
                this.primero = null;
            } else {
                nodoAnterior.siguiente = null;
            }
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

    @Override
    public String toString() {
        String string = "";
        Nodo aux = this.primero;
        for(int i = 0; i<this.tamaño; i++) {
            if (i==0){
                string = aux.valor;
            }else {
                string = string + "\t" + aux.valor;
            }
            aux = aux.siguiente;
        }
        return string;
    }
}
