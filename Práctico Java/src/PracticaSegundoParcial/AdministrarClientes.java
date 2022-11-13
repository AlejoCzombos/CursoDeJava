package PracticaSegundoParcial;

import java.io.*;
import java.util.LinkedList;
import java.util.Scanner;

public class AdministrarClientes implements Serializable{

    private LinkedList<Cliente> clientes = new LinkedList<>();
    File datosClientes = new File("datosClientes.txt");

    public AdministrarClientes() {
        if(datosClientes.isFile()){
            try {
                ObjectInputStream lecturaClientes = new ObjectInputStream(new FileInputStream("datosClientes.txt"));
                LinkedList<?> clientesRecuperados = (LinkedList<?>) lecturaClientes.readObject();
                lecturaClientes.close();
                for (Object object:clientesRecuperados) {
                    if(object instanceof Cliente){
                        clientes.add((Cliente) object);
                    }
                }
            }catch (Exception e){
                e.printStackTrace();
            }
        }
    }



    public void agregarCliente(Cliente cliente){
        clientes.add(cliente);
    }

    public void listarClientes(){
        if (clientes.isEmpty()) {
            System.out.println("La lista está vacía");
        }else {
            for(Cliente cliente:clientes){
                System.out.println(cliente.toString());
            }
        }
    }
    public void eliminarCliente(int DNI){
        for (Cliente cliente:clientes){
            if (cliente.getDNI() == DNI){
                clientes.remove();
                break;
            }
        }
        try {
            ObjectOutputStream escrituraClientes = new ObjectOutputStream(new FileOutputStream("datosClientes.txt"));
            escrituraClientes.writeObject(clientes);
            escrituraClientes.close();
        }catch (Exception e){
            e.printStackTrace();
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
        try {
            ObjectOutputStream escrituraClientes = new ObjectOutputStream(new FileOutputStream("datosClientes.txt"));
            escrituraClientes.writeObject(clientes);
            escrituraClientes.close();
        }catch (Exception e){
            e.printStackTrace();
        }
    }

}
