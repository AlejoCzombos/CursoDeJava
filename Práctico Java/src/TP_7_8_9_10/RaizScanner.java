package TP_7_8_9_10;

import java.util.Scanner;

public class RaizScanner {

 public static void main(String []args){
     Scanner scanner = new Scanner(System.in);
     int numero;
     double raiz;

     System.out.print("Ingrese un Nro\n");
     numero = scanner.nextInt();

     raiz = Math.sqrt(numero);
     System.out.print(raiz);
 }
}
