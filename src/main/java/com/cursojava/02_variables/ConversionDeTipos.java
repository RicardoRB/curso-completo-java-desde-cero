package com.cursojava.02_variables;

/**
 * CONVERSION DE TIPOS EN JAVA
 * 
 * Implicita (widening): se hace automaticamente cuando no hay perdida de datos.
 *   int -> long -> float -> double
 * 
 * Explicita (narrowing/casting): se hace manualmente con parentesis, puede haber perdida de datos.
 *   double -> float -> int -> short -> byte
 * 
 * Para ejecutar:
 *   mvn compile exec:java -Dexec.mainClass="com.cursojava.02_variables.ConversionDeTipos"
 */
public class ConversionDeTipos {
    public static void main(String[] args) {
        System.out.println("=== CONVERSION DE TIPOS ===\n");

        // --- Conversion Implicita (Widening) ---
        System.out.println("--- Conversion Implicita (Widening) ---");
        int entero = 100;
        long largo = entero;          // int -> long (automatico)
        float flotante = entero;      // int -> float (automatico)
        double doble = entero;        // int -> double (automatico)

        System.out.println("int -> long: " + largo);
        System.out.println("int -> float: " + flotante);
        System.out.println("int -> double: " + doble);

        // --- Conversion Explicita (Narrowing/Casting) ---
        System.out.println("\n--- Conversion Explicita (Narrowing/Casting) ---");
        double numeroDecimal = 9.78;
        int enteroTruncado = (int) numeroDecimal;  // double -> int (pierde decimales)
        System.out.println("double 9.78 -> int: " + enteroTruncado);  // 9

        int numeroEntero = 256;
        byte byteDesbordado = (byte) numeroEntero;  // int -> byte (desbordamiento)
        System.out.println("int 256 -> byte: " + byteDesbordado);  // 0 (overflow)

        // --- Conversion con Strings ---
        System.out.println("\n--- Conversion con Strings ---");
        String edadTexto = "25";
        int edad = Integer.parseInt(edadTexto);
        double peso = Double.parseDouble("72.5");
        boolean activo = Boolean.parseBoolean("true");

        System.out.println("String \"25\" -> int: " + edad);
        System.out.println("String \"72.5\" -> double: " + peso);
        System.out.println("String \"true\" -> boolean: " + activo);

        // --- De tipos a String ---
        int numero = 42;
        String numeroComoTexto = String.valueOf(numero);
        String numeroConcat = "" + numero;  // forma comun
        System.out.println("\nint 42 -> String: " + numeroComoTexto);
        System.out.println("int 42 -> String (concat): " + numeroConcat);

        // --- Ejemplo practico ---
        System.out.println("\n--- Ejemplo Practico ---");
        int temperatura = 30;
        double temperaturaCelsius = temperatura;
        System.out.println("Temperatura en int: " + temperatura);
        System.out.println("Temperatura en double: " + temperaturaCelsius + "°C");
    }
}
