package PraticaPrimerParcial.IteradoresYHashCode;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class Main {
    public static void main(String[] args){
        Banco b1 = new Banco();

        b1.agregarCliente(new Cliente("Alejo", 87747416));
        b1.agregarCliente(new Cliente("Matias", 12747415));
        b1.agregarCliente(new Cliente("Gasu", 42432432));
        b1.agregarCliente(new Cliente("Jose", 67732891));
        b1.agregarCliente(new Cliente("Campa", 993034));

        b1.mostrarContenido();

      //  b1.eliminarCliente();

      //  b1.mostrarContenido();

        System.out.println("Ordenados");


        TreeSet<Cliente> clientesOrdenados = new TreeSet<>();

        clientesOrdenados.add(new Cliente("Alejo", 12747416));
        clientesOrdenados.add(new Cliente("Matias", 34747415));
        clientesOrdenados.add(new Cliente("Gasu", 68432432));
        clientesOrdenados.add(new Cliente("Jose", 99732891));
        clientesOrdenados.add(new Cliente("Campa", 93034));

        for(Cliente cliente:clientesOrdenados){
            System.out.println(cliente);
        }
    }
}
