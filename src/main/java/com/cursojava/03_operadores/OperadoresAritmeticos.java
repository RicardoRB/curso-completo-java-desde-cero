package com.cursojava.03_operadores;

/**
 * OPERADORES ARITMETICOS EN JAVA
 * 
 * +   Suma
 * -   Resta
 * *   Multiplicacion
 * /   Division
 * %   Modulo (resto de la division)
 * ++  Incremento
 * --  Decremento
 * 
 * IMPORTANTE: La division de enteros trunca el resultado.
 * Para obtener decimales, al menos uno debe ser double/float.
 * 
 * Para ejecutar:
 *   mvn compile exec:java -Dexec.mainClass="com.cursojava.03_operadores.OperadoresAritmeticos"
 */
public class OperadoresAritmeticos {
    public static void main(String[] args) {
        System.out.println("=== OPERADORES ARITMETICOS ===\n");

        // --- Operadores basicos ---
        System.out.println("--- Operadores Basicos ---");
        int a = 10;
        int b = 3;

        System.out.println(a + " + " + b + " = " + (a + b));   // 13
        System.out.println(a + " - " + b + " = " + (a - b));   // 7
        System.out.println(a + " * " + b + " = " + (a * b));   // 30
        System.out.println(a + " / " + b + " = " + (a / b));   // 3 (division de enteros)
        System.out.println(a + " % " + b + " = " + (a % b));   // 1 (resto)

        // --- Division con decimales ---
        System.out.println("\n--- Division con decimales ---");
        double x = 10.0;
        System.out.println("10.0 / 3 = " + (x / b));          // 3.333...
        System.out.println("10 / 3 (enteros) = " + (10 / 3)); // 3

        // --- Incremento y Decremento ---
        System.out.println("\n--- Incremento y Decremento ---");
        int contador = 5;
        System.out.println("contador original: " + contador);

        contador++;  // contador = contador + 1
        System.out.println("despues de contador++: " + contador);

        contador--;  // contador = contador - 1
        System.out.println("despues de contador--: " + contador);

        // Pre-incremento vs Post-incremento
        int valor = 10;
        System.out.println("\nvalor = " + valor);
        System.out.println("++valor (pre): " + (++valor));  // 11
        System.out.println("valor++ (post): " + (valor++)); // 11, luego se incrementa
        System.out.println("valor actual: " + valor);       // 12

        // --- Operaciones combinadas ---
        System.out.println("\n--- Ejemplo Practico ---");
        double precio = 100.0;
        double descuento = 15.0;
        double total = precio - (precio * descuento / 100);
        System.out.println("Precio: $" + precio);
        System.out.println("Descuento: " + descuento + "%");
        System.out.println("Total: $" + total);

        // --- Precedencia ---
        System.out.println("\n--- Precedencia de Operadores ---");
        System.out.println("2 + 3 * 4 = " + (2 + 3 * 4));     // 14 (multiplicacion primero)
        System.out.println("(2 + 3) * 4 = " + ((2 + 3) * 4)); // 20 (parentesis primero)
    }
}
