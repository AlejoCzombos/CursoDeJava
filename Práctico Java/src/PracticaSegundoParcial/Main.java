package PracticaSegundoParcial;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args){

        AdministrarClientes administrarClientes = new AdministrarClientes();
        Scanner sc = new Scanner(System.in);
        int opcion;
        String nombre = "";
        String apellido = "";
        String direccion = "";
        String nombreActivo= "";
        int montoActivo = 0;
        int tipoActivo = 0;
        int Dni = 0;
        boolean error = false;

        while (true){
            opcion = opcionMenu();

            switch (opcion){
                case 1:
                    DoWhileCreacionCliente:
                    do{
                        error = false;
                        try{
                            System.out.println("Ingrese el nombre del cliente: ");
                            nombre = sc.nextLine();
                            System.out.println("Ingrese el apellido del cliente: ");
                            apellido = sc.nextLine();
                            System.out.println("Ingrese la direccion del cliente: ");
                            direccion = sc.nextLine();
                            System.out.println("Ingrese el DNI del cliente: ");
                            Dni = sc.nextInt();
                        }catch (InputMismatchException e){
                            System.out.println("Error: el campo 'DNI' solo admite numeros\n");
                            sc.nextLine();
                            error = true;
                        }

                        if (!error){
                            administrarClientes.agregarCliente(new Cliente(nombre,apellido,Dni,direccion));
                            System.out.println("El cliente fue creando con exito!\n");
                            sc.nextLine();
                            break DoWhileCreacionCliente;
                        }
                    }while (error);
                    break;
                case 2://Caso 2---------------------------------------------------------------------------------------------------------
                    administrarClientes.listarClientes();
                    break;
                case 3: //Caso 3---------------------------------------------------------------------------------------------------------
                    DoWhileBusquedaCliente:
                    do {
                        System.out.println("Ingrese el nombre del cliente que quiere buscar");
                        nombre = sc.nextLine();
                        System.out.println("El cliente deseado es el siguiente? : " + administrarClientes.buscarCliente(nombre).toString());
                        System.out.println("[1] Si \n[2] No\n");
                        try {
                            opcion = sc.nextInt();
                        }catch (InputMismatchException e){
                            System.out.println("Error: " + "Ingrese un numero por favor  \n");
                            sc.nextLine();
                        }
                        switch (opcion){
                            case 1:
                                System.out.println("Informe completo: \n" + administrarClientes.buscarCliente(nombre).informe());
                                sc.nextLine();
                                break DoWhileBusquedaCliente;
                            case 2:
                                sc.nextLine();
                            default:
                                break;
                        }
                    }while (true);
                    break;
                case 4: //Caso 4---------------------------------------------------------------------------------------------------------
                    DoWhileEliminacionCliente:
                    do {
                        System.out.println("Ingrese el nombre del cliente que quiere eliminar");
                        nombre = sc.nextLine();
                        System.out.println("El cliente deseado es el siguiente? : " + administrarClientes.buscarCliente(nombre).toString());
                        System.out.println("[1] Si \n[2] No\n");
                        try {
                            opcion = sc.nextInt();
                        }catch (InputMismatchException e){
                            System.out.println("Error: " + "Ingrese un numero por favor  \n");
                            sc.nextLine();
                        }
                        switch (opcion){
                            case 1:
                                administrarClientes.eliminarCliente(administrarClientes.buscarCliente(nombre).getDNI());
                                System.out.println("Cliente eliminado con exito!\n");
                                sc.nextLine();
                                break DoWhileEliminacionCliente;
                            case 2:
                                sc.nextLine();
                            default:
                                break;
                        }
                    }while (true);
                    break;
                case 5: //Caso 5---------------------------------------------------------------------------------------------------------
                    DoWhileAgregarActivo:
                    do{
                        System.out.println("Ingrese el nombre del cliente al que quiere agregar un Activo");
                        nombre = sc.nextLine();
                        System.out.println("El cliente deseado es el siguiente? : " + administrarClientes.buscarCliente(nombre).toString());
                        System.out.println("[1] Si \n[2] No\n");
                        try {
                            opcion = sc.nextInt();
                        }catch (InputMismatchException e){
                            System.out.println("Error: " + "Ingrese un numero por favor  \n");
                            sc.nextLine();
                        }
                        switch (opcion){
                            case 1:
                                try{
                                    sc.nextLine();
                                    System.out.println("Ingrese nombre del Activo: ");
                                    nombreActivo = sc.nextLine();
                                    System.out.println("Ingrese el Monto del Activo: ");
                                    montoActivo = sc.nextInt();
                                    System.out.println("Ingreses el Tipo de Activo");
                                    System.out.println("[1] Accion \n[2] Inmueble\n[3] Mueble\n");
                                    tipoActivo = sc.nextInt();
                                }catch (InputMismatchException e){
                                    System.out.println("Error: " + "Ingrese un numero por favor  \n");
                                    sc.nextLine();
                                    error = true;
                                }
                                if (!error){
                                    administrarClientes.agregarActivo(nombre,nombreActivo,montoActivo,tipoActivo);
                                    System.out.println("Activo agregado al cliente con exito!\n");
                                    sc.nextLine();
                                    error = false;
                                    break DoWhileAgregarActivo;
                                }
                            case 2:
                                sc.nextLine();
                            default:
                                break;
                        }
                    }while (error);
                    break;
                case 6://Caso 6-----------------------------------------------------------------------------------------------------------
                    System.exit(0);
                default://defalut---------------------------------------------------------------------------------------------------------
                    break;
            }
        }

    }
    public static int opcionMenu(){
        Scanner sc = new Scanner(System.in);
        int opcion = 0;
        System.out.println("Seleccione una opcion: ");
        System.out.println("[1] Crear Cliente \n[2] Listar Clientes \n[3] Buscar Cliente \n[4] Eliminar Cliente \n[5] Agregar Activo a un Cliente \n[6] Salir");

        try{
            opcion = sc.nextInt();
        }catch (InputMismatchException e){
            System.out.println("Error: " + e.getMessage() + " Ingrese un numero por favor  \n");
            opcionMenu();
        }
        return opcion;
    }

}
