package Segundo_Parcial;

import PracticaSegundoParcial.Cliente;

import java.util.InputMismatchException;
import java.util.LinkedList;
import java.util.Scanner;

public class AdministarContactos {
    LinkedList<Contacto> contactos;

    public AdministarContactos(){
        contactos = new LinkedList<>();
    }

    public void agregarContacto(Contacto contacto){
        contactos.add(contacto);
    }

    public void listarContactos(){
        if (contactos.isEmpty()) {
            System.out.println("La lista esta vacia\n");
        }else {
            System.out.println("");
            for(Contacto contacto:contactos){
                System.out.println(contacto.toString());
            }
        }
        System.out.println("\nNumero de contactos: " + contactos.size() + "\n");
    }
    public void eliminarContacto(int DNI){
        int cont = 0;
        for (Contacto contacto:contactos){
            if (contacto.getDNI() == DNI){
                contactos.remove();
                cont++;
                System.out.println("Contacto eliminado con exito!\n");
                break;
            }
        }
        if (cont == 0){
            System.out.println("\nNO EXISTEN CONTACTOS CON DNI: " + DNI + "\n");
        }
    }
    public void buscarContacto(int dni){
        int cont = 0;
        for (Contacto contacto:contactos){
            if (contacto.getDNI() == dni){
                System.out.println(contacto.toString());
                cont++;
            }
        }
        if (cont == 0){
            System.out.println("\nNO EXISTEN CONTACTOS CON DNI: " + dni + "\n");
        }else {
            System.out.println("Se encontraron " + cont + " coincidencia/as\n");
        }
    }
    public void buscarContacto(String nombreOapellido){
        int cont = 0;
        for (Contacto contacto:contactos){
            if (contacto.getNombre().equals(nombreOapellido) || contacto.getApellido().equals(nombreOapellido)){
                System.out.println(contacto.toString());
                cont++;
            }
        }
        if (cont == 0){
            System.out.println("\nNO EXISTE CONTACTOS QUE COINCIDAN CON EL CRITERIO\n");
        }else {
            System.out.println("Se encontraron " + cont + " coincidencia/as\n");
        }
    }
    public int numContactos(){
        return contactos.size();
    }

    public void modificarContacto(int DNI){
        Scanner sc = new Scanner(System.in);
        int opcion;
        String nombre = "";
        String apellido = "";
        String telefono = "";
        String email = "";
        int Dni = 0;
        boolean error = false;
        for (Contacto contacto:contactos){
            if (contacto.getDNI() == DNI){
                DoWhileCreacionContacto:
                do{
                    error = false;
                    try{
                        System.out.println("\nIngrese el nombre del contacto: ");
                        nombre = sc.nextLine();
                        System.out.println("Ingrese el apellido del contacto: ");
                        apellido = sc.nextLine();
                        System.out.println("Ingrese la telefono del contacto: ");
                        telefono = sc.nextLine();
                        System.out.println("Ingrese la email del contacto: ");
                        email = sc.nextLine();
                        System.out.println("Ingrese el DNI del contacto: ");
                        Dni = sc.nextInt();
                    }catch (InputMismatchException e){
                        System.out.println("ERROR EN EL INGRESO DE DATOS\n");
                        sc.nextLine();
                        error = true;
                    }

                    if (!error){
                        contacto.setNombre(nombre);
                        contacto.setApellido(apellido);
                        contacto.setDNI(Dni);
                        contacto.setEmail(email);
                        contacto.setTelelfono(telefono);
                        System.out.println("\nEl Contacto fue modificado con exito!\n");
                        sc.nextLine();
                        break DoWhileCreacionContacto;
                    }
                }while (error);
            }
        }
    }

    public LinkedList<Contacto> getContactos() {
        return contactos;
    }

    public void setContactos(LinkedList<Contacto> contactos) {
        this.contactos = contactos;
    }
}
