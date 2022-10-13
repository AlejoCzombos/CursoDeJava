package PraticaPrimerParcial.ListIterators;

import java.util.LinkedList;
import java.util.ListIterator;

public class Prueba_1 {

    public static void main(String[] args) {
        LinkedList<String> paises = new LinkedList<String>();

        paises.add("Espania");
        paises.add("Colombia");
        paises.add("Mexico");
        paises.add("Peru");

        LinkedList<String> capitales = new LinkedList<String>();

        capitales.add("Madrid");
        capitales.add("Bogota");
        capitales.add("DF");
        capitales.add("Lima");

        System.out.println("Paises: " + paises);
        System.out.println("Capitales: " + capitales);

        ListIterator<String> itPaises = paises.listIterator();
        ListIterator<String> itCapitales = capitales.listIterator();

        itCapitales = capitales.listIterator();
        itPaises = paises.listIterator();

        while (itCapitales.hasNext()){
            if (itPaises.hasNext()){
                itPaises.next();
                itPaises.add(itCapitales.next());
            }
        }

        System.out.println("Paises y capitales: " + paises);

        int contador = 0;

        itPaises = paises.listIterator();

        while(itPaises.hasNext()){
            contador++;
            itPaises.next();
            if (contador % 2 == 0)
                itPaises.remove();
        }

        System.out.println("sin pares: " + paises);

    }
}
