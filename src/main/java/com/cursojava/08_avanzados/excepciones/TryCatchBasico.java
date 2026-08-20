package com.cursojava.08_avanzados.excepciones;

/**
 * EXCEPCIONES Y TRY-CATCH EN JAVA
 * 
 * Las excepciones son errores que ocurren durante la ejecucion.
 * Try-catch permite manejar errores sin que el programa se detenga.
 * 
 * Estructura:
 *   try {
 *       // codigo que puede fallar
 *   } catch (TipoExcepcion e) {
 *       // que hacer si falla
 *   } finally {
 *       // se ejecuta siempre (opcional)
 *   }
 * 
 * Para ejecutar:
 *   mvn compile exec:java -Dexec.mainClass="com.cursojava.08_avanzados.excepciones.TryCatchBasico
 */
public class TryCatchBasico {
    public static void main(String[] args) {
        System.out.println("=== EXCEPCIONES Y TRY-CATCH ===\n");

        // --- ArithmeticException ---
        System.out.println("--- ArithmeticException (division por cero) ---");
        try {
            int resultado = 10 / 0;
            System.out.println("Resultado: " + resultado);
        } catch (ArithmeticException e) {
            System.out.println("Error: " + e.getMessage());
        }

        // --- ArrayIndexOutOfBoundsException ---
        System.out.println("\n--- ArrayIndexOutOfBoundsException ---");
        try {
            int[] numeros = {1, 2, 3};
            System.out.println("Elemento [5]: " + numeros[5]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Error: Indice fuera de rango - " + e.getMessage());
        }

        // --- NullPointerException ---
        System.out.println("\n--- NullPointerException ---");
        try {
            String texto = null;
            System.out.println("Longitud: " + texto.length());
        } catch (NullPointerException e) {
            System.out.println("Error: Referencia nula");
        }

        // --- NumberFormatException ---
        System.out.println("\n--- NumberFormatException ---");
        try {
            String texto = "abc";
            int numero = Integer.parseInt(texto);
            System.out.println("Numero: " + numero);
        } catch (NumberFormatException e) {
            System.out.println("Error: No es un numero valido - " + e.getMessage());
        }

        // --- Multiple catch ---
        System.out.println("\n--- Multiples Catch ---");
        try {
            int[] arr = {10, 20, 30};
            int indice = 5;
            int valor = arr[indice];
            int division = 100 / valor;
            System.out.println("Division: " + division);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Error de indice: " + e.getMessage());
        } catch (ArithmeticException e) {
            System.out.println("Error aritmetico: " + e.getMessage());
        }

        // --- finally ---
        System.out.println("\n--- Finally (se ejecuta siempre) ---");
        try {
            System.out.println("En try: abriendo recurso...");
            int x = 10 / 0;
        } catch (ArithmeticException e) {
            System.out.println("En catch: " + e.getMessage());
        } finally {
            System.out.println("En finally: cerrando recurso...");
        }

        // --- Ejemplo practico ---
        System.out.println("\n--- Ejemplo Practico: Division Segura ---");
        System.out.println("10 / 5 = " + dividirSeguro(10, 5));
        System.out.println("10 / 0 = " + dividirSeguro(10, 0));
        System.out.println("10 / 2 = " + dividirSeguro(10, 2));

        // --- Stack trace ---
        System.out.println("\n--- Stack Trace (para debug) ---");
        try {
            metodoA();
        } catch (Exception e) {
            System.out.println("Excepcion capturada: " + e.getMessage());
            e.printStackTrace();  // Muestra la pila completa de llamadas
        }
    }

    static double dividirSeguro(double a, double b) {
        try {
            return a / b;
        } catch (ArithmeticException e) {
            System.out.println("  Error en division: " + e.getMessage());
            return 0;
        }
    }

    static void metodoA() throws Exception {
        metodoB();
    }

    static void metodoB() throws Exception {
        metodoC();
    }

    static void metodoC() throws Exception {
        throw new Exception("Error en metodoC()");
    }
}
