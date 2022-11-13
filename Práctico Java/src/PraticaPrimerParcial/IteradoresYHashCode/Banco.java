package PraticaPrimerParcial.IteradoresYHashCode;

import java.io.IOException;
import java.util.*;

public class Banco {
    private Set<Cliente> clientes = new HashSet<>();
    private Iterator<Cliente> iteCliente = clientes.iterator();

    public void agregarCliente(Cliente cliente){
        clientes.add(cliente);
    }
    public void eliminarCliente(){
            Scanner sc = new Scanner(System.in);
            System.out.println("Nombre de DNI del cliente que quiere eliminar");
            int dni = sc.nextInt();
            iteCliente = clientes.iterator();
            while (iteCliente.hasNext()){
                int dnicliente = iteCliente.next().getDni();
                if (dnicliente == dni)
                    iteCliente.remove();
            }
    }
    public void mostrarContenido(){
        for (Cliente cliente: clientes){
            System.out.println(cliente.toString());
        }
    }
    public Banco() {
    }
}
