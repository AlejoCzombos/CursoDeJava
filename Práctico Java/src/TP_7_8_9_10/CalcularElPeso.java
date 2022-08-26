package TP_7_8_9_10;

import java.util.Scanner;

public class CalcularElPeso {
    public static void main(String []args){
        Scanner scanner = new Scanner(System.in);
        int altura;
        String genero;
        int pesoIdeal = 0;


        System.out.println("Ingrese su altura en cm");
        altura = scanner.nextInt();
        System.out.println("Ingrese 'm' si es mujer o 'h' si es hombre");
        genero = scanner.next();

        switch (genero){
            case("m"):
                pesoIdeal = altura - 120;
                break;
            case("h"):
                pesoIdeal = altura - 110;
                break;
            default:
                System.out.println("Se introdujo un caracter invalido");
                break;
        }
        System.out.print("Tu peso ideal es: " + pesoIdeal);
    }
}
