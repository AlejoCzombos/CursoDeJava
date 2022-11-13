package PracticaSegundoParcial;

import java.util.LinkedList;
import java.util.Scanner;

public class AdministrarClientes {

    private LinkedList<Cliente> clientes = new LinkedList<>();

    public AdministrarClientes() {
    }

    public void agregarCliente(Cliente cliente){
        clientes.add(cliente);
    }

    public void listarClientes(){
        for(Cliente cliente:clientes){
            System.out.println(cliente.toString());
        }
    }
    public void eliminarCliente(int DNI){
        for (Cliente cliente:clientes){
            if (cliente.getDNI() == DNI){
                clientes.remove();
            }
        }
    }
    public Cliente buscarCliente(String nombre){
        for (Cliente cliente:clientes){
            if (cliente.getNombre().equals(nombre)){
                return cliente;
            }
        }
        return clientes.get(0);
    }

    public void agregarActivo(String nombrecliente,String nombreActivo, int Monto, int Tipo){
        for (Cliente cliente:clientes){
            if (cliente.getNombre().equals(nombrecliente)){
                cliente.cargarActivo(new Activo(nombreActivo, Monto, Tipo));
            }
        }
    }

}
