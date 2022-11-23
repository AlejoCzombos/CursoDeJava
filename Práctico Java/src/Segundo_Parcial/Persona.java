package Segundo_Parcial;

public abstract class Persona {
    private String nombre;
    private String apellido;
    private int DNI;
    private String telelfono;
    private String email;

    public Persona(String nombre, String apellido, int DNI, String telelfono, String email) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.DNI = DNI;
        this.telelfono = telelfono;
        this.email = email;
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

    public String getTelelfono() {
        return telelfono;
    }

    public void setTelelfono(String telelfono) {
        this.telelfono = telelfono;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "nombre: " + nombre + '\'' +
                ", apellido: " + apellido + '\'' +
                ", DNI: " + DNI +
                ", telelfono: " + telelfono + '\'' +
                ", email: " + email + '\'';
    }
}
