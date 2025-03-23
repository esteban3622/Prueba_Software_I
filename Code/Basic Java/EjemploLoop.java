/*
 * Este código realiza las siguientes operaciones:
 * 
 * 1. For loop: Itera sobre la lista utilizando un índice para acceder a cada elemento.
 * 2. For-each loop: Itera sobre la lista de manera más simple y directa, sin necesidad 
 * de un índice.
 * 3. While loop: Utiliza un índice manualmente para iterar sobre la lista.
 * 4. Iterator: Utiliza un Iterator para iterar sobre la lista, proporcionando una forma 
 * segura de eliminar elementos durante la iteración si es necesario.
 */

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class EjemploLoop {
    public static void main(String[] args) {
        // Crear una lista de enteros
        List<Integer> lista = new ArrayList<Integer>();
        lista.add(1);
        lista.add(2);
        lista.add(3);
        lista.add(4);
        lista.add(5);

        // Uso de for loop para iterar sobre la lista
        System.out.println("Iteración con for loop:");
        for (int i = 0; i < lista.size(); i++) {
            System.out.println("Elemento en el índice " + i + ": " + lista.get(i));
        }

        // Uso de for-each loop para iterar sobre la lista
        System.out.println("\nIteración con for-each loop:");
        for (Integer elemento : lista) {
            System.out.println("Elemento: " + elemento);
        }

        // Uso de while loop para iterar sobre la lista
        System.out.println("\nIteración con while loop:");
        int index = 0;
        while (index < lista.size()) {
            System.out.println("Elemento en el índice " + index + ": " + lista.get(index));
            index++;
        }

        // Uso de Iterator para iterar sobre la lista
        System.out.println("\nIteración con Iterator:");
        Iterator<Integer> iterator = lista.iterator();
        while (iterator.hasNext()) {
            Integer elemento = iterator.next();
            System.out.println("Elemento: " + elemento);
        }
    }
}
