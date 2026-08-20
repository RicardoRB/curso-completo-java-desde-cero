package com.cursojava.06_arrays;

/**
 * ARRAYS EN JAVA
 * 
 * Un array es una coleccion de elementos del mismo tipo con tamano fijo.
 * Los indices comienzan en 0.
 * 
 * Declarar: tipo[] nombreArray = new tipo[tamano];
 *           tipo[] nombreArray = {valor1, valor2, ...};
 * 
 * Acceder: nombreArray[indice]
 * Longitud: nombreArray.length
 * 
 * Para ejecutar:
 *   mvn compile exec:java -Dexec.mainClass="com.cursojava.06_arrays.ArraysBasicos"
 */
public class ArraysBasicos {
    public static void main(String[] args) {
        System.out.println("=== ARRAYS EN JAVA ===\n");

        // --- Declaracion e inicializacion ---
        System.out.println("--- Declaracion e Inicializacion ---");
        int[] numeros = new int[5];  // Array de 5 elementos (todos valen 0)
        String[] frutas = {"Manzana", "Pera", "Naranja", "Platano"};
        double[] precios = {9.99, 19.99, 29.99};

        // --- Asignar valores ---
        numeros[0] = 10;
        numeros[1] = 20;
        numeros[2] = 30;
        numeros[3] = 40;
        numeros[4] = 50;

        // --- Acceder a elementos ---
        System.out.println("--- Acceder a Elementos ---");
        System.out.println("numeros[0] = " + numeros[0]);  // 10
        System.out.println("numeros[4] = " + numeros[4]);  // 50
        System.out.println("frutas[1] = " + frutas[1]);    // Pera

        // --- Longitud del array ---
        System.out.println("\n--- Longitud ---");
        System.out.println("numeros.length = " + numeros.length);   // 5
        System.out.println("frutas.length = " + frutas.length);     // 4
        System.out.println("precios.length = " + precios.length);   // 3

        // --- Recorrer con for clasico ---
        System.out.println("\n--- Recorrer con For ---");
        for (int i = 0; i < numeros.length; i++) {
            System.out.println("numeros[" + i + "] = " + numeros[i]);
        }

        // --- Recorrer con for-each ---
        System.out.println("\n--- Recorrer con For-Each ---");
        System.out.println("Frutas:");
        for (String fruta : frutas) {
            System.out.println("  - " + fruta);
        }

        // --- Modificar elementos ---
        System.out.println("\n--- Modificar Elementos ---");
        frutas[0] = "Fresa";
        System.out.println("frutas[0] ahora es: " + frutas[0]);

        // --- Array de strings ---
        System.out.println("\n--- Array de Nombres ---");
        String[] nombres = {"Ana", "Carlos", "Maria", "Pedro", "Laura"};
        System.out.println("Nombres: ");
        for (String nombre : nombres) {
            System.out.println("  " + nombre);
        }
        System.out.println("Total de nombres: " + nombres.length);

        // --- Operaciones con arrays ---
        System.out.println("\n--- Encontrar el mayor ---");
        int[] edades = {25, 30, 18, 42, 35, 28};
        int mayor = edades[0];
        for (int i = 1; i < edades.length; i++) {
            if (edades[i] > mayor) {
                mayor = edades[i];
            }
        }
        System.out.println("La edad mayor es: " + mayor);

        System.out.println("\n--- Sumar todos los elementos ---");
        int[] valores = {10, 20, 30, 40, 50};
        int suma = 0;
        for (int valor : valores) {
            suma += valor;
        }
        System.out.println("Suma total: " + suma);
        System.out.println("Promedio: " + (suma / (double) valores.length));
    }
}
