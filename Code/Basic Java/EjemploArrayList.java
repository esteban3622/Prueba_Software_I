/*
 * Este código realiza las siguientes operaciones:
 * 
 * 1. Crea una nueva ArrayList de String.
 * 2. Agrega tres elementos a la lista usando el método .add.
 * 3. Imprime el tamaño de la lista usando el método .size.
 * 4. Obtiene y muestra un elemento de la lista usando el método .get.
 * 5. Modifica un elemento de la lista usando el método .set.
 * 6. Elimina un elemento de la lista usando el método .remove.
 * 7. Limpia todos los elementos de la lista usando el método .clear.
 */

import java.util.*;

public class EjemploArrayList {
    public static void main(String[] args) {
        // Crear una nueva ArrayList de Strings
        ArrayList<String> lista = new ArrayList<String>();

        // Agregar elementos a la lista
        lista.add("Elemento 1");
        lista.add("Elemento 2");
        lista.add("Elemento 3");
        System.out.println("Lista después de agregar elementos: " + lista);

        // Obtener el tamaño de la lista
        int size = lista.size();
        System.out.println("Tamaño de la lista: " + size);

        // Obtener un elemento de la lista por su índice
        String elemento = lista.get(1); // Obtener el segundo elemento (índice 1)
        System.out.println("Elemento en el índice 1: " + elemento);

        // Modificar un elemento de la lista
        lista.set(1, "Elemento Modificado");
        System.out.println("Lista después de modificar el elemento en el índice 1: " + lista);

        // Eliminar un elemento de la lista por su índice
        lista.remove(0); // Eliminar el primer elemento (índice 0)
        System.out.println("Lista después de eliminar el elemento en el índice 0: " + lista);

        // Limpiar todos los elementos de la lista
        lista.clear();
        System.out.println("Lista después de limpiar todos los elementos: " + lista);
    }
}
