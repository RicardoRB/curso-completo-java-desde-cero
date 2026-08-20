package com.cursojava.05_bucles;

/**
 * BUCLE FOR EN JAVA
 * 
 * El bucle for es ideal cuando sabes cuantas veces quieres iterar.
 * Tiene 3 partes: inicializacion, condicion, y actualizacion.
 * 
 * Sintaxis:
 *   for (inicializacion; condicion; actualizacion) {
 *       // codigo
 *   }
 * 
 * Para ejecutar:
 *   mvn compile exec:java -Dexec.mainClass="com.cursojava.05_bucles.BucleFor"
 */
public class BucleFor {
    public static void main(String[] args) {
        System.out.println("=== BUCLE FOR ===\n");

        // --- For basico ---
        System.out.println("--- For Basico (1-10) ---");
        for (int i = 1; i <= 10; i++) {
            System.out.print(i + " ");
        }
        System.out.println();

        // --- Tabla de multiplicar ---
        System.out.println("\n--- Tabla de multiplicar del 7 ---");
        int numero = 7;
        for (int i = 1; i <= 10; i++) {
            System.out.println(numero + " x " + i + " = " + (numero * i));
        }

        // --- Factorial ---
        System.out.println("\n--- Factorial de 10 ---");
        long factorial = 1;
        for (int i = 1; i <= 10; i++) {
            factorial *= i;
        }
        System.out.println("10! = " + factorial);

        // --- Invertir un numero ---
        System.out.println("\n--- Invertir un numero ---");
        int original = 12345;
        int invertido = 0;
        int temp = original;
        while (temp > 0) {
            invertido = invertido * 10 + temp % 10;
            temp /= 10;
        }
        System.out.println("Original: " + original);
        System.out.println("Invertido: " + invertido);

        // --- For con multiples variables ---
        System.out.println("\n--- For con multiples variables ---");
        for (int i = 0, j = 10; i < j; i++, j--) {
            System.out.println("i=" + i + ", j=" + j + ", suma=" + (i + j));
        }

        // --- Patron de asteriscos ---
        System.out.println("\n--- Triangulo de asteriscos ---");
        int filas = 5;
        for (int i = 1; i <= filas; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }

        // --- Numeros primos ---
        System.out.println("\n--- Numeros primos del 1 al 30 ---");
        for (int num = 2; num <= 30; num++) {
            boolean esPrimo = true;
            for (int div = 2; div <= Math.sqrt(num); div++) {
                if (num % div == 0) {
                    esPrimo = false;
                    break;
                }
            }
            if (esPrimo) {
                System.out.print(num + " ");
            }
        }
        System.out.println();

        // --- Fibonacci ---
        System.out.println("\n--- Fibonacci (primeros 15 numeros) ---");
        int a = 0, b = 1;
        for (int i = 1; i <= 15; i++) {
            System.out.print(a + " ");
            int tempFib = a + b;
            a = b;
            b = tempFib;
        }
        System.out.println();
    }
}
