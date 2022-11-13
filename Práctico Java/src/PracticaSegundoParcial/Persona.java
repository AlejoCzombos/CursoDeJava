package PracticaSegundoParcial;

public abstract class Persona implements Informe {

    private String nombre;
    private String apellido;
    private int DNI;
    private String direccion;

    public Persona(String nombre, String apellido, int DNI, String direccion) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.DNI = DNI;
        this.direccion = direccion;
    }

    @Override
    public String toString() {
        return "nombre: " + nombre + '\'' +
                ", apellido: " + apellido + '\'' +
                ", DNI: " + DNI +
                ", direccion: " + direccion + '\n';
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public int getDNI() {
        return DNI;
    }

    public void setDNI(int DNI) {
        this.DNI = DNI;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    @Override
    public String informe() {
         return "\tNombre: " + nombre + '\n' +
                "\tApellido: " + apellido + '\n' +
                "\tDNI: " + DNI +  "\n" +
                "\tDireccion: " + direccion + '\n';
    }
}
