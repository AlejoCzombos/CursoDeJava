package PraticaPrimerParcial.Ejercicio3;

import java.util.LinkedList;

public class Personal {

    private LinkedList<Persona> personal = new LinkedList();

    public void listarpersonal(){
        personal.toString();
    }

    public void addPersona(Persona persona){
       personal.add(persona);
    }

    public void eliminarPersona(int dniEliminar){
        for (Persona persona: personal){
            if (persona.getDni() == dniEliminar){
                personal.remove();
            }
        }
    }

    public void modificarPersona(int dniBusca){
        for (Persona persona: personal){
            if (persona.getDni() == dniBusca){
                persona.modificarDatos();
            }
        }
    }

    public void buscarPersona(int dniBusca){
        for (Persona persona: personal){
            if (persona.getDni() == dniBusca){
                persona.toString();
            }
        }
    }

    public void verSueldo(int dniBusca){
        for (Persona persona: personal){
            if (persona.getDni() == dniBusca){
                persona.getDni();
            }
        }
    }

    public void aumentarSueldo(int dniBusca,double incremento){
        for (Persona persona: personal){
            if (persona.getDni() == dniBusca){
                persona.subirSueldo(incremento);
            }
        }
    }

}
