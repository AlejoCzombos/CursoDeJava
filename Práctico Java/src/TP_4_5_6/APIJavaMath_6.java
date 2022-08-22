package TP_4_5_6;

public class APIJavaMath_6 {
    public static void main(String[] args){

        float radio = (float)34;
        float radio2 = (float)12.31;
        int numero = 2;
        int numero2 = 12;

        //Trigonomertria
        System.out.println(Math.sin(radio));
        System.out.println(Math.cos(radio));
        System.out.println(Math.tan(radio));
        System.out.println(Math.atan(radio));
        System.out.println(Math.atan2(radio,radio2));

        //Funciones exponenciales y su inversa
        System.out.println("e elevado a la 2 es: " + Math.exp(numero));
        System.out.println("La base neutral de 12 es: " + Math.log(numero2));

        //Las dos constantes PI y e
        System.out.println("PI es igual a: " + Math.PI);
        System.out.println("e es igual a: " + Math.E);

    }
}
