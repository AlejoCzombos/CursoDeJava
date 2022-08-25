package Clase_25_08_22;

import java.util.Arrays;

public class BancoEjercicio {
    public static void main(String[] args){
        Cliente clientes[] = {
                new Cliente("Alejo", 20000),
                new Cliente("Mati", 30000),
                new Cliente("Campa", 40000),
                new Cliente("Jose", 50000),
                new Cliente("Gasu", 60000)
        };

        Banco bancoNacion = new Banco(clientes);
        Caja caja = new Caja();

        for (Cliente cliente:clientes){
            System.out.println(cliente);
            caja.extraer(cliente, 10000);
        }

        System.out.print(bancoNacion.toString());
    }
}

class Banco {
    private Caja caja;
    private Cliente clientes[];

    public Banco(Cliente clientela []){
        this.clientes =  clientela;
    }

    @Override
    public String toString() {
        return "Banco{ \n" +
                "Clientes= \n" +  Arrays.toString(clientes) +
                "}";
    }

}
class Caja {
    public void depositar(Cliente cliente,float monto){
        if (monto > 0){
            cliente.aumentar(monto);
            System.out.println("Deposito hecho con exito\n" +
                    "Su saldo es de: " + cliente.getSaldo() + "\n");
        }
    }
    public void extraer(Cliente cliente, float monto){
        if (cliente.getSaldo() >= monto){
            cliente.descontar(monto);
            System.out.println("Extracion hecha con exito\n" +
                    "Su saldo es de: " + cliente.getSaldo() + "\n");
        }
    }
}
class Cliente{
    private int numeroCliente;
    private String nombre;
    private float saldo;

    public Cliente(String nombre, float saldo){
        this.nombre = nombre;
        this.saldo = saldo;
        this.numeroCliente = (int) (Math.random()*100);
    }

    public int getNumeroCliente() {
        return numeroCliente;
    }

    public void setNumeroCliente(int numeroCliente) {
        this.numeroCliente = numeroCliente;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public float getSaldo() {
        return saldo;
    }

    public void descontar(float monto){
            this.saldo -= monto;
    }
    public void aumentar(float monto){
        this.saldo += monto;
    }

    public void setSaldo(float saldo) {
        this.saldo = saldo;
    }

    @Override
    public String toString() {
        return "\nNombre: " + this.nombre + "\nsaldo: " + this.saldo + "\nNroCliente: " + this.numeroCliente;
    }
}

