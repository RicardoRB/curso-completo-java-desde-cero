package com.cursojava.06_arrays;

/**
 * ARRAYS MULTIDIMENSIONALES EN JAVA
 * 
 * Un array multidimensional es un array de arrays (matrices).
 * Lo mas comun son arrays de 2 dimensiones (filas x columnas).
 * 
 * Declarar: int[][] matriz = new int[filas][columnas];
 *           int[][] matriz = {{1,2}, {3,4}, {5,6}};
 * 
 * Para ejecutar:
 *   mvn compile exec:java -Dexec.mainClass="com.cursojava.06_arrays.ArraysMultidimensionales"
 */
public class ArraysMultidimensionales {
    public static void main(String[] args) {
        System.out.println("=== ARRAYS MULTIDIMENSIONALES ===\n");

        // --- Crear matriz ---
        System.out.println("--- Crear y Acceder a Matriz ---");
        int[][] matriz = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };

        // Acceder a elementos: matriz[fila][columna]
        System.out.println("matriz[0][0] = " + matriz[0][0]);  // 1
        System.out.println("matriz[1][2] = " + matriz[1][2]);  // 6
        System.out.println("matriz[2][1] = " + matriz[2][1]);  // 8

        // --- Recorrer matriz ---
        System.out.println("\n--- Recorrer Matriz ---");
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.print(matriz[i][j] + "\t");
            }
            System.out.println();
        }

        // --- Suma de filas ---
        System.out.println("\n--- Suma por Fila ---");
        for (int i = 0; i < matriz.length; i++) {
            int sumaFila = 0;
            for (int j = 0; j < matriz[i].length; j++) {
                sumaFila += matriz[i][j];
            }
            System.out.println("Fila " + i + ": " + sumaFila);
        }

        // --- Suma de columnas ---
        System.out.println("\n--- Suma por Columna ---");
        for (int j = 0; j < matriz[0].length; j++) {
            int sumaCol = 0;
            for (int i = 0; i < matriz.length; i++) {
                sumaCol += matriz[i][j];
            }
            System.out.println("Columna " + j + ": " + sumaCol);
        }

        // --- Matriz de calificaciones ---
        System.out.println("\n--- Matriz de Calificaciones ---");
        String[] materias = {"Java", "BaseDatos", "Redes"};
        String[] alumnos = {"Ana", "Carlos", "Maria"};
        double[][] calificaciones = {
            {9.0, 8.5, 7.0},
            {7.5, 9.0, 8.0},
            {8.0, 7.0, 9.5}
        };

        System.out.printf("%-10s", "Alumno");
        for (String materia : materias) System.out.printf("%-12s", materia);
        System.out.printf("%-10s%n", "Promedio");

        for (int i = 0; i < alumnos.length; i++) {
            System.out.printf("%-10s", alumnos[i]);
            double suma = 0;
            for (int j = 0; j < calificaciones[i].length; j++) {
                System.out.printf("%-12.1f", calificaciones[i][j]);
                suma += calificaciones[i][j];
            }
            System.out.printf("%-10.2f%n", suma / calificaciones[i].length);
        }

        // --- Matriz identidad ---
        System.out.println("\n--- Matriz Identidad (4x4) ---");
        int n = 4;
        int[][] identidad = new int[n][n];
        for (int i = 0; i < n; i++) {
            identidad[i][i] = 1;  // Solo diagonales
        }
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(identidad[i][j] + " ");
            }
            System.out.println();
        }

        // --- Transpuesta ---
        System.out.println("\n--- Transpuesta de Matriz ---");
        int[][] original = {{1, 2, 3}, {4, 5, 6}};
        int[][] transpuesta = new int[original[0].length][original.length];

        for (int i = 0; i < original.length; i++) {
            for (int j = 0; j < original[i].length; j++) {
                transpuesta[j][i] = original[i][j];
            }
        }

        System.out.println("Original:");
        for (int[] fila : original) {
            for (int val : fila) System.out.print(val + " ");
            System.out.println();
        }
        System.out.println("Transpuesta:");
        for (int[] fila : transpuesta) {
            for (int val : fila) System.out.print(val + " ");
            System.out.println();
        }
    }
}
