package com.programandoenjava.02_variables;

/**
 * VARIABLES EN JAVA
 * 
 * Las variables son contenedores de datos. En Java debes declarar el tipo antes de usar.
 * 
 * Tipos de datos en Java:
 * 
 * ENTEROS:
 *   byte    - 1 byte  (-128 a 127)
 *   short   - 2 bytes (-32,768 a 32,767)
 *   int     - 4 bytes (-2^31 a 2^31-1) -> MAS USADO
 *   long    - 8 bytes (-2^63 a 2^63-1) -> usa sufijo L
 * 
 * DECIMALES:
 *   float   - 4 bytes -> usa sufijo f
 *   double  - 8 bytes -> MAS USADO
 * 
 * CARACTER:
 *   char    - 2 bytes -> entre comillas simples: 'A'
 * 
 * BOOLEANO:
 *   boolean - true o false
 * 
 * TEXTO:
 *   String  - no es primitivo, es una clase -> entre comillas dobles
 * 
 * Para ejecutar:
 *   mvn compile exec:java -Dexec.mainClass="com.programandoenjava.02_variables.VariablesYT"
 */
public class VariablesYT {
    public static void main(String[] args) {
        System.out.println("=== VARIABLES EN JAVA ===\n");

        // --- ENTEROS ---
        System.out.println("--- Tipos Enteros ---");
        byte edad = 25;
        short poblacion = 35000;
        int salario = 3500;
        long poblacionMundial = 8_000_000_000L; // El guion bajo mejora la legibilidad

        System.out.println("byte (edad): " + edad);
        System.out.println("short (poblacion): " + poblacion);
        System.out.println("int (salario): " + salario);
        System.out.println("long (poblacionMundial): " + poblacionMundial);

        // --- DECIMALES ---
        System.out.println("\n--- Tipos Decimales ---");
        float precio = 19.99f;
        double precioDoble = 19.99;

        System.out.println("float (precio): " + precio);
        System.out.println("double (precioDoble): " + precioDoble);

        // --- CARACTER ---
        System.out.println("\n--- Tipo Char ---");
        char letra = 'A';
        char numero = '7';
        System.out.println("char (letra): " + letra);
        System.out.println("char (numero): " + numero);

        // --- BOOLEANO ---
        System.out.println("\n--- Tipo Boolean ---");
        boolean esMayorDeEdad = true;
        boolean tieneDinero = false;
        System.out.println("boolean (esMayorDeEdad): " + esMayorDeEdad);
        System.out.println("boolean (tieneDinero): " + tieneDinero);

        // --- STRING ---
        System.out.println("\n--- Tipo String ---");
        String nombre = "Carlos Garcia";
        String curso = "Java desde cero";
        System.out.println("String (nombre): " + nombre);
        System.out.println("String (curso): " + curso);

        // --- TIPOS DERIVADOS ---
        System.out.println("\n--- Metodos utiles de los tipos ---");
        System.out.println("Long.MAX_VALUE: " + Long.MAX_VALUE);
        System.out.println("Integer.MAX_VALUE: " + Integer.MAX_VALUE);
        System.out.println("Double.MAX_VALUE: " + Double.MAX_VALUE);

        // --- TAMANO DE TIPOS ---
        System.out.println("\n--- Tamano en bytes ---");
        System.out.println("byte: " + Byte.BYTES + " byte");
        System.out.println("short: " + Short.BYTES + " bytes");
        System.out.println("int: " + Integer.BYTES + " bytes");
        System.out.println("long: " + Long.BYTES + " bytes");
        System.out.println("float: " + Float.BYTES + " bytes");
        System.out.println("double: " + Double.BYTES + " bytes");
        System.out.println("char: " + Character.BYTES + " byte");
    }
}
