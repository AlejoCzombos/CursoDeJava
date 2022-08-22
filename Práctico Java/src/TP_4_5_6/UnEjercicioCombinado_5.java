package TP_4_5_6;

public class UnEjercicioCombinado_5 {
    public static void main(String[] args){
        float fraccion1 = (float)6/5;
        float fraccion2 = (float)2/3;
        float fraccion3 = (float)7/2;
        float fraccion4 = (float)2/30;
        float fraccion5 = (float)1/3;

        double resultado = (fraccion1 - (fraccion2 * fraccion3) + fraccion4 / (fraccion5 / 5));

        System.out.println(resultado);
    }
}
