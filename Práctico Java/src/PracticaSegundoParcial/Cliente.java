package PracticaSegundoParcial;

import java.io.Serializable;
import java.util.LinkedList;

public class Cliente extends Persona implements Serializable {

    private LinkedList<Activo> activos = new LinkedList<>();

    public Cliente(String nombre, String apellido, int DNI, String direccion) {
        super(nombre, apellido, DNI, direccion);
    }

    public void cargarActivo(Activo activo){
        activos.add(activo);
    }

    @Override
    public String toString() {
        return super.toString();
    }

    @Override
    public String informe() {
        return super.informe() + activos.toString();
    }

}
