package Clase_18_08_22;

import javax.swing.*;
import java.util.ArrayList;

public class SumaConsecutiva {
    public static void main(String[] args){

        String clave = "f";
        String respuesta;
        int resultado = 0;

        ArrayList<String> numeros = new ArrayList<>();

        do {
            respuesta = JOptionPane.showInputDialog("Ingrese un número para sumarlo o ingrese 'f' para salir");
            numeros.add(respuesta);
        }while (!respuesta.equals(clave));

        numeros.remove(numeros.size() - 1);

        for (String numero:numeros){
            resultado += Integer.parseInt(numero);
        }
        JOptionPane.showMessageDialog(null,( "El resultado de las sumas es: " + resultado));
    }
}