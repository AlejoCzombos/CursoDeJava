package Clase_01_09_22;

import java.util.Scanner;

public class MainContraseña{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese la cantidad de contraseñas que desea crear: ");
        int numeroConstraseñas = scanner.nextInt();

        Contraseña listaContraseñas[] = new Contraseña[numeroConstraseñas];

        for (int i = 0; i < numeroConstraseñas; i++){
            System.out.println("Numero de caracteres para la contraseña " + i+1);
            int numeroCaracteres = scanner.nextInt();
            listaContraseñas[i] = new Contraseña(numeroCaracteres);
        }

        for (Contraseña contraseña:listaContraseñas){
            int contador = 1;
            System.out.println(contraseña.getContraseña() + " " + contraseña.esFuerte());
        }
    }
}

class Contraseña {
    private int longitud;
    private String contraseña;

    public Contraseña(){
        this.longitud = 8;
        contraseña = generarContraseña(longitud);
    }
    public Contraseña(int longitud){
        this.longitud = longitud;
        contraseña = generarContraseña(longitud);
    }
    String generarContraseña(int longitud){
        String contraseñaAleatorea = "";
        char[] caracteres = { '0','1','2','3','4','5','6','7','8','9',
                'A','B','C','D','E','F','G','H','I','J',
                'K','L','M','N','O','P','Q','R','S','T',
                'U','V','W','X','Y','Z','a','b','c','d',
                'e','f','g','h','i','j','k','l','m','n',
                'o','p','q','r','s','t','u','v','w','x',
                'y','z'};

        for (int i=0;i < longitud; i++){
            int numeroRandom;
            numeroRandom = (int) (Math.random() * 62);

            contraseñaAleatorea = contraseñaAleatorea + caracteres[numeroRandom];
        }
        return contraseñaAleatorea;
    }
    boolean esFuerte(){
        int minusculas = 0;
        int mayusculas = 0;
        int numeros = 0;
        for (int i=0; i < this.contraseña.length(); i++ ){
            char caracter = this.contraseña.charAt(i);
            if (caracter >= 65 && caracter <= 90){
                mayusculas++;
            }else if (caracter >= 97 && caracter <=122){
                minusculas++;
            } else if (caracter >= 48 && caracter <= 57) {
                numeros++;
            }
        }
        return mayusculas > 2 && minusculas > 1 && numeros > 1;
    }
    public int getLongitud() {
        return longitud;
    }
    public String getContraseña() {
        return contraseña;
    }
    public void setLongitud(int longitud) {
        this.longitud = longitud;
    }
}
