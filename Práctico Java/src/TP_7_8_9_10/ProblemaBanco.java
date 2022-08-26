package TP_7_8_9_10;

public class ProblemaBanco {

}

class UsoCuenta{
    public static void main(String []args){
        CuentaCorriente cuenta1 = new CuentaCorriente("Agustin Mansilla", 2500);
        CuentaCorriente cuenta2 = new CuentaCorriente("Rodrigo Vallejos", 2500);

        System.out.print(cuenta1.toString());
        System.out.print(cuenta2.toString());

        cuenta1.Transferencia(cuenta2, 2500);

        System.out.print(cuenta1.toString());
        System.out.print(cuenta2.toString());
    }
}
class CuentaCorriente{
    private double saldo;
    private String nombreTitular;
    private long numeroCuenta;

    public CuentaCorriente(String nombre, float saldo){
        this.nombreTitular = nombre;
        this.saldo = saldo;
        this.numeroCuenta = (int) (Math.random()*100);
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public String getNombreTitular() {
        return nombreTitular;
    }

    public void setNombreTitular(String nombreTitular) {
        this.nombreTitular = nombreTitular;
    }

    public void Transferencia(CuentaCorriente cuentaQueRecibe, double monto){
            this.saldo -= monto;
            cuentaQueRecibe.saldo += monto;
            System.out.print("\nTrasferencia por importe de: " + monto + " realizada con exito");
    }

    @Override
    public String toString() {
        return "\nNombre: " + this.nombreTitular + "\nNumero de Cuenta: " + this.numeroCuenta + "\nSaldo: " + this.saldo + "\n" ;
    }
}
