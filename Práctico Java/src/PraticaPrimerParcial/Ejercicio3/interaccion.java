package PraticaPrimerParcial.Ejercicio3;

import java.util.Scanner;

public class interaccion {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int opcion = 0;
        Personal miPersonal = new Personal();
        int dni = 0;
        String nombre = "",apellido = "";
        double sueldoBasico = 0.0, porcentaje = 0.0;

        do {
            System.out.println("\n¿Que desea hacer? Ingrese el numero correspondiente");
            System.out.println("1. Para agregar un empleado/jefe \n2. Listar personal y sus datos \n3. Ver el sueldo del personal");
            System.out.println("4. Salir");
            System.out.print("Ingrese el numero correspondiente: ");
            try {
                opcion = sc.nextInt();
            } catch (Exception e) {
                e.printStackTrace();
                System.out.println("Error en el ingreso de datos!");
            }

            if (opcion == 1) {

                System.out.println("\n¿Que tipo de empleado desea agregar?");
                System.out.println("1. Para agregar un jefe \n2. Para agregar un empleado");
                System.out.print("Ingrese el numero correspondiente: ");

                try {
                    opcion = sc.nextInt();
                } catch (Exception e) {
                    e.printStackTrace();
                    System.out.println("¡ERROR en el ingreso de datos!");
                }

                if (opcion == 1) {
                    System.out.println("\nIngrese el nombre del jefe a agregar:");
                    nombre = sc.nextLine();
                    System.out.println("Ingrese el apellido del jefe a agregar:");
                    apellido = sc.nextLine();
                    System.out.println("Ingrese el DNI del jefe a agregar:");
                    dni = sc.nextInt();
                    System.out.println("Ingrese el sueldo basico del jefe a agregar:");
                    sueldoBasico = sc.nextDouble();
                    System.out.println("Ingrese el porcentaje del jefe a agregar:");
                    porcentaje = sc.nextDouble();
                    miPersonal.addPersona(new Jefe(nombre, apellido, dni, sueldoBasico, porcentaje));
                } else if (opcion == 2) {
                    System.out.println("\nIngrese el nombre del jefe a agregar:");
                    nombre = sc.nextLine();
                    System.out.println("Ingrese el apellido del jefe a agregar:");
                    apellido = sc.nextLine();
                    System.out.println("Ingrese el DNI del jefe a agregar:");
                    dni = sc.nextInt();
                    System.out.println("Ingrese el sueldo basico del jefe a agregar:");
                    sueldoBasico = sc.nextDouble();
                    System.out.println("Ingrese el porcentaje del jefe a agregar:");
                    porcentaje = sc.nextDouble();
                    miPersonal.addPersona(new Empleado(nombre, apellido, dni, sueldoBasico));
                }
            } else if (opcion == 2) {
                System.out.println("\nListado de personal:");
                miPersonal.listarpersonal();
            }else if(opcion == 3) {
                System.out.println("Ingrese el dni de la persona que quieras buscar:");
                opcion = sc.nextInt();
                miPersonal.verSueldo(opcion);
            }else if(opcion == 4){
                System.out.println("\n¡Hasta pronto!");
            }else{
                System.out.println("\nOpcion ingresada invalida");
            }
        } while (opcion == 1 || opcion == 2 || opcion == 3) ;
    }
}
