package PraticaPrimerParcial.Ejercicio1;

import java.util.Scanner;

public class CineMain {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        char opcion = 'a';
        String nombre;
        int dni;
        int sala;
        int contador = 0;

        SalaDeCine s1 = new SalaDeCine("Sala 1", 200, new Pelicula("Harry Potter y el Pricionero de Azkaban", 126));
        SalaDeCine s2 = new SalaDeCine("Sala 2", 170, new Pelicula("Harry Potter y el Caliz de Fuego", 152));


        while (opcion != 'n'){
            System.out.println("Ingrese los datos del espectador numero " + (contador + 1));

            System.out.println("Ingrese el nombre del espectador: ");
            nombre = sc.nextLine();

            System.out.println("Ingrese el DNI del espectador: ");
            dni = sc.nextInt();

            System.out.println("Ingrese a que sala quiere agregar el espectador: ");
            sala = sc.nextInt();

            switch (sala){
                case 1:
                    s1.agregarEspectador(new Espectador(nombre, dni));
                    break;
                case 2:
                    s2.agregarEspectador(new Espectador(nombre, dni));
                    break;
                default:
                    System.out.println("Opcion no valida");
                    break;
            }

            System.out.println("Ingrese 's' si quiere seguir \n o 'n' si no quiere");
            opcion = sc.next().charAt(0);
            sc.nextLine();
        }

        System.out.println(s1);
        System.out.println(s2);
    }
}
