package com.cursojava.05_bucles;

/**
 * BUCLE WHILE EN JAVA
 * 
 * El bucle while ejecuta un bloque de codigo mientras la condicion sea true.
 * Se evalua la condicion ANTES de cada iteracion.
 * Si la condicion es false desde el inicio, el codigo NO se ejecuta ni una vez.
 * 
 * Sintaxis:
 *   while (condicion) {
 *       // codigo
 *   }
 * 
 * PARA CUIDADO: Si la condicion nunca es false, tendrás un bucle infinito.
 * 
 * Para ejecutar:
 *   mvn compile exec:java -Dexec.mainClass="com.cursojava.05_bucles.BucleWhile"
 */
public class BucleWhile {
    public static void main(String[] args) {
        System.out.println("=== BUCLE WHILE ===\n");

        // --- Contador basico ---
        System.out.println("--- Contador del 1 al 5 ---");
        int contador = 1;
        while (contador <= 5) {
            System.out.println("Iteracion: " + contador);
            contador++;
        }

        // --- Suma acumulada ---
        System.out.println("\n--- Suma de los primeros 10 numeros ---");
        int suma = 0;
        int i = 1;
        while (i <= 10) {
            suma += i;  // suma = suma + i
            i++;
        }
        System.out.println("Suma total: " + suma);  // 55

        // --- Busqueda en una cadena ---
        System.out.println("\n--- Contar vocales en una palabra ---");
        String palabra = "murcielago";
        int count = 0;
        int indice = 0;
        while (indice < palabra.length()) {
            char letra = palabra.charAt(indice);
            if (letra == 'a' || letra == 'e' || letra == 'i' || letra == 'o' || letra == 'u') {
                count++;
            }
            indice++;
        }
        System.out.println("La palabra \"" + palabra + "\" tiene " + count + " vocales");

        // --- Ejemplo: Juego simple de adivinanza ---
        System.out.println("\n--- Juego de Adivinanza (simulado) ---");
        int secreto = 7;
        int intento = 1;
        while (intento <= 3) {
            // Simulamos que el usuario adivina en el intento 2
            int[] intentosSimulados = {3, 7, 5};
            int adivinanza = intentosSimulados[intento - 1];
            System.out.println("Intento " + intento + ": " + adivinanza);

            if (adivinanza == secreto) {
                System.out.println("¡Correcto! Adivinaste en " + intento + " intentos");
                break;
            } else if (adivinanza < secreto) {
                System.out.println("Muy bajo");
            } else {
                System.out.println("Muy alto");
            }
            intento++;
        }
        if (intento > 3) {
            System.out.println("Se acabaron los intentos. El numero era: " + secreto);
        }

        // --- Ejemplo: FizzBuzz ---
        System.out.println("\n--- FizzBuzz (1-20) ---");
        int n = 1;
        while (n <= 20) {
            if (n % 3 == 0 && n % 5 == 0) {
                System.out.print("FizzBuzz ");
            } else if (n % 3 == 0) {
                System.out.print("Fizz ");
            } else if (n % 5 == 0) {
                System.out.print("Buzz ");
            } else {
                System.out.print(n + " ");
            }
            n++;
        }
        System.out.println();
    }
}
