package Segundo_Parcial;

import java.io.FileWriter;
import java.io.IOException;
import java.util.InputMismatchException;
import java.util.Scanner;

public class main {

    public static void main(String[] args){

        AdministarContactos administrarContactos = new AdministarContactos();
        Scanner sc = new Scanner(System.in);
        int opcion;
        String nombre = "";
        String apellido = "";
        String telefono = "";
        String email = "";
        int Dni = 0;
        boolean error = false;

        while (true){
            opcion = opcionMenu();

            switch (opcion){
                case 1:
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
                            administrarContactos.agregarContacto(new Contacto(nombre,apellido,Dni,telefono,email));
                            System.out.println("\nEl Contacto fue creando con exito!\n");
                            sc.nextLine();
                            break DoWhileCreacionContacto;
                        }
                    }while (error);
                    break;
                case 2://Caso 2---------------------------------------------------------------------------------------------------------
                    administrarContactos.listarContactos();
                    break;
                case 3: //Caso 3---------------------------------------------------------------------------------------------------------
                    System.out.println("\nIngrese el nombre o apellido del contacto que quiere buscar");
                    nombre = sc.nextLine();
                    administrarContactos.buscarContacto(nombre);
                    break;
                case 4:
                    DoWhileBusquedaDNIContacto:
                    do {
                        error = false;
                        try {
                            System.out.println("\nIngrese el Dni del contacto que quiere buscar");
                            Dni = sc.nextInt();
                        } catch (InputMismatchException e) {
                            System.out.println("\nERROR EN EL INGRESO DE DATOS\n");
                            sc.nextLine();
                            error = true;
                        }
                        if (!error) {
                            administrarContactos.buscarContacto(Dni);
                            sc.nextLine();
                            break DoWhileBusquedaDNIContacto;
                        }
                    }while (true);
                    break;
                case 5: //Caso 4---------------------------------------------------------------------------------------------------------
                    DoWhileEliminacionContacto:
                    do {
                        try {
                            System.out.println("\nIngrese el Dni del contacto que quiere eliminar");
                            Dni = sc.nextInt();
                        }catch (InputMismatchException e){
                            System.out.println("\nERROR EN EL INGRESO DE DATOS\n");
                            sc.nextLine();
                        }
                        if (!error) {
                            administrarContactos.eliminarContacto(Dni);
                            sc.nextLine();
                            break DoWhileEliminacionContacto;
                        }
                    }while (true);
                    break;
                case 6: //Caso 5---------------------------------------------------------------------------------------------------------
                    System.out.println("Ingrese el nombre del archivo .txt");
                    nombre = sc.nextLine();
                    nombre = nombre + ".txt";
                    String texto;
                    Archivo archivo = new Archivo(nombre);
                    texto = "\t\t\t\t\t\t\t\tLISTA DE CONTACTOS\n\n";
                    for (int i = 0; i < administrarContactos.numContactos(); i++) {
                        texto = texto + (i+1) + ") \t" + administrarContactos.getContactos().get(i).toString() + "\n";
                    }
                    archivo.imprimir(texto);
                    break;
                case 7://Caso 6-----------------------------------------------------------------------------------------------------------
                    DoWhileModificarContacto:
                    do {
                        error = false;
                        try {
                            System.out.println("\nIngrese el Dni del contacto que quiere modificar");
                            Dni = sc.nextInt();
                        }catch (InputMismatchException e){
                            System.out.println("\nERROR EN EL INGRESO DE DATOS\n");
                            sc.nextLine();
                        }
                        if (!error) {
                            administrarContactos.modificarContacto(Dni);
                            sc.nextLine();
                            break DoWhileModificarContacto;
                        }
                    }while (true);
                    break;
                case 99: //Caso 99-----------------------------------------------------------------------------------------------------------
                    System.exit(0);
                    break;
                default://defalut---------------------------------------------------------------------------------------------------------
                    break;
            }
        }

    }
    public static int opcionMenu(){
        Scanner sc = new Scanner(System.in);
        int opcion = 0;
        System.out.println("ADMINISTRADOR DE CONTACTOS:");
        System.out.println("[1] Nuevo Contacto \n[2] Listar todos los Contactos \n[3] Buscar Contacto por nombre o apellido \n[4] Buscar Contacto por DNI \n[5] Eliminar Contacto por DNI \n[6] Imprimir en un archivo \n[7] Editar Contacto\n[99] salir");
        System.out.println("Ingrese una opcion: ");

        try{
            opcion = sc.nextInt();
        }catch (InputMismatchException e){
            System.out.println("\nOPCION INCORRECTA \n");
            opcionMenu();
        }
        return opcion;
    }

}

