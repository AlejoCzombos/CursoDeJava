package TP_4_5_6;

public class UnEjercicioCombinado_5 {
    public static void main(String[] args){
        float fraccion1 = 6/5.f;
        float fraccion2 = 2/3.f;
        float fraccion3 = 7/2.f;
        float fraccion4 = 2/30.f;
        float fraccion5 = 1/3.f;

        float resultado = (fraccion1 - (fraccion2 * fraccion3) + fraccion4) / (fraccion5 / 5);

        System.out.println(resultado);
    }
}
