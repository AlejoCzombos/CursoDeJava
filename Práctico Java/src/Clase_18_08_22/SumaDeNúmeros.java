package Clase_18_08_22;

import javax.swing.*;

public class SumaDeNúmeros {


        public static void main(String[] args) {

            int numero1 = Integer.parseInt(JOptionPane.showInputDialog("Ingrese su numero:")) ;
            int numero2 = Integer.parseInt(JOptionPane.showInputDialog("Ingrese otro numero:"));
            int resultado = numero1 + numero2;

            String mensaje = "El primer numero sumnado al segundo es: " + (numero1 + numero2);

            if(numero1 + numero2 == 100){
                JOptionPane.showMessageDialog(null,"Es 100");
            } else if(numero1 + numero2 >= 100){
                JOptionPane.showMessageDialog(null,"Es mayor a 100");
            } else if (numero1 + numero2 < 0){
                JOptionPane.showMessageDialog(null,"Es negativo");
            }else{
                JOptionPane.showMessageDialog(null,"Es menor que 100");
            }
        }
}
