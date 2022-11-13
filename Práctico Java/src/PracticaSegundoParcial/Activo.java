package PracticaSegundoParcial;

public class Activo implements Informe {

    private String nombre;
    private int monto;
    private int tipo;
    private String[] tipos = {"Accion","Inmueble","Mueble"};

    public Activo(String nombre, int monto, int tipo) {
        this.nombre = nombre;
        this.monto = monto;
        setTipo(tipo);
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getMonto() {
        return monto;
    }

    public void setMonto(int monto) {
        this.monto = monto;
    }

    public void setTipo(int tipo) {
        tipo++;
        if (tipo >= 0 && tipo <= 2){
            this.tipo = tipo;
        }else {
            tipo = 1;
        }
    }

    @Override
    public String toString() {
        return informe();
    }

    @Override
    public String informe() {
        return "Activo: \n" +
                "\t" + "Nombre: " + this.nombre + "\n" +
                "\t" + "Monto: " + this.monto+ "\n" +
                "\t" + "Tipo: " + tipos[tipo] + "\n";
    }
}
