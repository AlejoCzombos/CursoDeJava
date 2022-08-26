package TP_7_8_9_10;

import java.util.Scanner;

public class AdivinaElNumero {
    public static void main(String []args){

        Scanner scanner = new Scanner(System.in);
        int numeroElegido = 0;
        int numeroAleatorio = (int) (Math.random() * 100);
        int intentos = 0;

        do {
            System.out.println("INGRESE UN NUMERO ENTRE 0 Y 100");
            numeroElegido = scanner.nextInt();
            if (numeroElegido > numeroAleatorio){
                System.out.println("El numero aleatorio es menor\n");
            }else if (numeroElegido < numeroAleatorio){
                System.out.println("El numero aleatorio es mayor\n");
            }

            intentos++;
        }while (numeroAleatorio != numeroElegido);

        System.out.println("Correcto!");
        System.out.println("El numero de intentos consumidos es de " + intentos + " intentos");

    }
}
