package com.cursojava.05_bucles;

/**
 * BREAK Y CONTINUE EN JAVA
 * 
 * break: Termina el bucle completamente y sale de el.
 * continue: Salta a la siguiente iteracion del bucle, saltando el codigo restante.
 * 
 * Para ejecutar:
 *   mvn compile exec:java -Dexec.mainClass="com.cursojava.05_bucles.BreakContinue"
 */
public class BreakContinue {
    public static void main(String[] args) {
        System.out.println("=== BREAK Y CONTINUE ===\n");

        // --- Break basico ---
        System.out.println("--- Break: Buscar el primer multiplo de 7 ---");
        for (int i = 1; i <= 50; i++) {
            if (i % 7 == 0) {
                System.out.println("Encontrado: " + i);
                break;  // Sale del bucle al encontrar el primero
            }
        }

        // --- Break en bucle anidado ---
        System.out.println("\--- Break en bucle anidado (sale del externo) ---");
        for (int i = 1; i <= 3; i++) {
            for (int j = 1; j <= 3; j++) {
                if (i == 2 && j == 2) {
                    System.out.println("Encontrado i=" + i + ", j=" + j + " - break");
                    break;  // Solo sale del bucle interno
                }
                System.out.println("i=" + i + ", j=" + j);
            }
        }

        // --- Continue basico ---
        System.out.println("\n--- Continue: Saltar numeros pares ---");
        for (int i = 1; i <= 10; i++) {
            if (i % 2 == 0) {
                continue;  // Saltar la iteracion actual
            }
            System.out.print(i + " ");
        }
        System.out.println();

        // --- Continue con Array ---
        System.out.println("\n--- Continue: Filtrar negativos ---");
        int[] numeros = {5, -3, 8, -1, 12, -7, 4};
        System.out.print("Positivos: ");
        for (int num : numeros) {
            if (num < 0) {
                continue;  // Saltar numeros negativos
            }
            System.out.print(num + " ");
        }
        System.out.println();

        // --- Etiquetas (labels) con break ---
        System.out.println("\n--- Etiquetas: Break en bucle externo ---");
        externo:
        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= 5; j++) {
                if (i * j > 10) {
                    System.out.println("Break en i=" + i + ", j=" + j);
                    break externo;  // Sale del bucle externo
                }
            }
        }

        // --- Ejemplo: Buscar en matriz ---
        System.out.println("\n--- Buscar valor en matriz ---");
        int[][] matriz = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };
        int buscar = 5;
        boolean encontrado = false;

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                if (matriz[i][j] == buscar) {
                    System.out.println("Valor " + buscar + " encontrado en posicion [" + i + "][" + j + "]");
                    encontrado = true;
                    break;
                }
            }
            if (encontrado) break;
        }
        if (!encontrado) {
            System.out.println("Valor " + buscar + " no encontrado");
        }

        // --- Ejemplo: Numero de 3 digitos sin repetidos ---
        System.out.println("\n--- Numeros de 3 digitos sin digitos repetidos ---");
        int count = 0;
        for (int i = 100; i <= 999 && count < 5; i++) {
            int centena = i / 100;
            int decena = (i / 10) % 10;
            int unidad = i % 10;

            if (centena != decena && centena != unidad && decena != unidad) {
                if (count == 0) {
                    System.out.print("Ejemplos: ");
                }
                System.out.print(i + " ");
                count++;
            }
        }
        System.out.println();
    }
}
