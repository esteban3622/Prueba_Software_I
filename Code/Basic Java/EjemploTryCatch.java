/*
 * Este código realiza las siguientes operaciones: 
 * 
 * 1. Intenta dividir un número por cero, lo cual lanza una ArithmeticException. 
 * Esta excepción es capturada y manejada en el bloque catch.
 * 2. Intenta acceder a un índice fuera de los límites de un array, lo cual lanza 
 * una ArrayIndexOutOfBoundsException. Esta excepción es capturada y manejada en 
 * el bloque catch. 
 * 3. Intenta convertir una cadena no numérica a un entero, lo cual lanza una 
 * NumberFormatException. Esta excepción es capturada y manejada en el bloque catch.
 * 4. También incluye un bloque catch genérico para capturar cualquier otra excepción 
 * inesperada.
 */

public class EjemploTryCatch {
    public static void main(String[] args) {
        // Ejemplo de manejo de excepciones con try-catch
        try {
            // Intentar dividir por cero, lo cual lanzará una ArithmeticException
            int resultado = dividir(10, 0);
            System.out.println("Resultado: " + resultado);
        } catch (ArithmeticException e) {
            // Capturar la excepción y manejarla
            System.out.println("Error: No se puede dividir por cero.");
        }

        // Otro ejemplo con manejo de excepciones
        try {
            // Intentar acceder a un índice fuera de los límites de un array
            int[] numeros = {1, 2, 3};
            int numero = numeros[5];
            System.out.println("Número: " + numero);
        } catch (ArrayIndexOutOfBoundsException e) {
            // Capturar la excepción y manejarla
            System.out.println("Error: Índice fuera de los límites del array.");
        }

        // Ejemplo de manejo de excepciones múltiples
        try {
            // Intentar convertir una cadena no numérica a un entero
            String cadena = "abc";
            int numero = Integer.parseInt(cadena);
            System.out.println("Número: " + numero);
        } catch (NumberFormatException e) {
            // Capturar la excepción y manejarla
            System.out.println("Error: No se puede convertir la cadena a un número.");
        } catch (Exception e) {
            // Capturar cualquier otra excepción
            System.out.println("Error: Ocurrió una excepción inesperada.");
        }
    }

    // Método para dividir dos números
    public static int dividir(int a, int b) {
        return a / b;
    }
}
