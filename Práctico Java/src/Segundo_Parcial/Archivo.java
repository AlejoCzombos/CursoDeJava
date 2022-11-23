package Segundo_Parcial;

import java.io.FileWriter;
import java.io.IOException;

public class Archivo implements Impresion {

    FileWriter archivo;

    public Archivo(String nombre) {
        try {
            archivo = new FileWriter(nombre,true);
        }catch (IOException ex) {
            System.out.println(ex);
        }
    }

    @Override
    public void imprimir(String texto) {
        try {
           archivo.write(texto);
           archivo.close();
        }catch (IOException ex) {
            System.out.println(ex);
        }
    }
}
