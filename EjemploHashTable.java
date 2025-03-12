/*
 * Este código realiza las siguientes operaciones:
 * 
 * 1. Crea una nueva Hashtable de String para las claves y los valores.
 * 2. Agrega tres elementos a la hashtable usando el método .put.
 * 3. Imprime el contenido de la hashtable después de agregar los elementos.
 * 4. Obtiene y muestra un valor de la hashtable usando el método .get.
 * 5. Verifica si la hashtable está vacía usando el método .isEmpty.
 * 6. Elimina un elemento de la hashtable usando el método .remove.
 * 7. Imprime el contenido de la hashtable después de eliminar un elemento.
 * 8. Verifica nuevamente si la hashtable está vacía después de la eliminación.
 */

import java.util.Hashtable;

public class EjemploHashTable {
    public static void main(String[] args) {
        // Crear una nueva Hashtable
        Hashtable<String, String> hashtable = new Hashtable<String, String>();

        // Agregar elementos a la hashtable
        hashtable.put("clave1", "valor1");
        hashtable.put("clave2", "valor2");
        hashtable.put("clave3", "valor3");
        System.out.println("Hashtable después de agregar elementos: " + hashtable);

        // Obtener un valor de la hashtable por su clave
        String valor = hashtable.get("clave2");
        System.out.println("Valor asociado a 'clave2': " + valor);

        // Verificar si la hashtable está vacía
        boolean isEmpty = hashtable.isEmpty();
        System.out.println("¿Está vacía la hashtable?: " + isEmpty);

        // Eliminar un elemento de la hashtable por su clave
        hashtable.remove("clave1");
        System.out.println("Hashtable después de eliminar 'clave1': " + hashtable);

        // Verificar nuevamente si la hashtable está vacía después de la eliminación
        isEmpty = hashtable.isEmpty();
        System.out.println("¿Está vacía la hashtable después de eliminar 'clave1'?: " + isEmpty);
    }
}
