package com.programandoenjava.06_arrays;

/**
 * USANDO BUCLE FOR CON ARRAYS
 * 
 * Ejemplos practicos de manipulacion de arrays usando bucles.
 * 
 * Para ejecutar:
 *   mvn compile exec:java -Dexec.mainClass="com.programandoenjava.06_arrays.ArraysConBucleFor"
 */
public class ArraysConBucleFor {
    public static void main(String[] args) {
        System.out.println("=== ARRAYS CON BUCLE FOR ===\n");

        // --- Buscar un elemento ---
        System.out.println("--- Buscar un Elemento ---");
        int[] numeros = {15, 23, 7, 42, 89, 31};
        int buscar = 42;
        boolean encontrado = false;

        for (int i = 0; i < numeros.length; i++) {
            if (numeros[i] == buscar) {
                System.out.println("Elemento " + buscar + " encontrado en indice " + i);
                encontrado = true;
                break;
            }
        }
        if (!encontrado) {
            System.out.println("Elemento " + buscar + " no encontrado");
        }

        // --- Invertir un array ---
        System.out.println("\n--- Invertir un Array ---");
        int[] original = {1, 2, 3, 4, 5};
        int[] invertido = new int[original.length];

        for (int i = 0; i < original.length; i++) {
            invertido[i] = original[original.length - 1 - i];
        }

        System.out.print("Original:  ");
        for (int num : original) System.out.print(num + " ");
        System.out.println();
        System.out.print("Invertido: ");
        for (int num : invertido) System.out.print(num + " ");
        System.out.println();

        // --- Ordenar un array (Bubble Sort) ---
        System.out.println("\n--- Ordenar Array (Bubble Sort) ---");
        int[] desordenado = {64, 34, 25, 12, 22, 11, 90};
        System.out.print("Antes:  ");
        for (int num : desordenado) System.out.print(num + " ");
        System.out.println();

        for (int i = 0; i < desordenado.length - 1; i++) {
            for (int j = 0; j < desordenado.length - 1 - i; j++) {
                if (desordenado[j] > desordenado[j + 1]) {
                    int temp = desordenado[j];
                    desordenado[j] = desordenado[j + 1];
                    desordenado[j + 1] = temp;
                }
            }
        }

        System.out.print("Despues: ");
        for (int num : desordenado) System.out.print(num + " ");
        System.out.println();

        // --- Copiar un array ---
        System.out.println("\n--- Copiar un Array ---");
        String[] originalStr = {"Java", "Python", "C++", "JavaScript"};
        String[] copia = new String[originalStr.length];
        for (int i = 0; i < originalStr.length; i++) {
            copia[i] = originalStr[i];
        }
        System.out.print("Original: ");
        for (String s : originalStr) System.out.print(s + " ");
        System.out.println();
        System.out.print("Copia:    ");
        for (String s : copia) System.out.print(s + " ");
        System.out.println();

        // --- Contar ocurrencias ---
        System.out.println("\n--- Contar Ocurrencias ---");
        char[] letras = {'a', 'b', 'a', 'c', 'a', 'b', 'd', 'a'};
        char buscarLetra = 'a';
        int ocurrencias = 0;
        for (char letra : letras) {
            if (letra == buscarLetra) {
                ocurrencias++;
            }
        }
        System.out.println("La letra '" + buscarLetra + "' aparece " + ocurrencias + " veces");

        // --- Combinar dos arrays ---
        System.out.println("\n--- Combinar Dos Arrays ---");
        int[] arr1 = {1, 2, 3};
        int[] arr2 = {4, 5, 6};
        int[] combinado = new int[arr1.length + arr2.length];

        for (int i = 0; i < arr1.length; i++) {
            combinado[i] = arr1[i];
        }
        for (int i = 0; i < arr2.length; i++) {
            combinado[arr1.length + i] = arr2[i];
        }

        System.out.print("Array 1: ");
        for (int n : arr1) System.out.print(n + " ");
        System.out.println();
        System.out.print("Array 2: ");
        for (int n : arr2) System.out.print(n + " ");
        System.out.println();
        System.out.print("Combinado: ");
        for (int n : combinado) System.out.print(n + " ");
        System.out.println();
    }
}
