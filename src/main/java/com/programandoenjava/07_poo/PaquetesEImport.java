package com.programandoenjava.07_poo;

/**
 * PAQUETES E IMPORT EN JAVA
 * 
 * Los paquetes organizan las clases en carpetas.
 * La palabra clave import permite usar clases de otros paquetes.
 * 
 * Reglas:
 * - Paquete: declara en que "carpeta" esta la clase.
 * - import: trae clases de otros paquetes para usarlas.
 * - java.lang no necesita import (String, System, Math, etc.).
 * - * importa todas las clases de un paquete (no recomendado en produccion).
 * 
 * Para ejecutar:
 *   mvn compile exec:java -Dexec.mainClass="com.programandoenjava.07_poo.PaquetesEImport
 */
public class PaquetesEImport {
    public static void main(String[] args) {
        System.out.println("=== PAQUETES E IMPORT ===\n");

        // --- Clases de java.lang (NO necesitan import) ---
        System.out.println("--- java.lang (sin import) ---");
        String texto = "Hola Java";
        System.out.println("String longitud: " + texto.length());
        System.out.println("Math.PI: " + Math.PI);
        System.out.println("Math.max(5,3): " + Math.max(5, 3));
        System.out.println("Integer.MAX_VALUE: " + Integer.MAX_VALUE);

        // --- Usar clase del mismo paquete (no necesita import) ---
        System.out.println("\n--- Clase del mismo paquete ---");
        UtilidadComun util = new UtilidadComun();
        System.out.println("Fecha actual: " + util.obtenerFecha());
        System.out.println("Convertir mayuscula: " + util.aMayusculas("hola mundo"));

        // --- Ejemplo de como se veria con import ---
        System.out.println("\n--- Ejemplo de Import ---");
        System.out.println("En un archivo real, verias:");
        System.out.println("  import java.util.ArrayList;");
        System.out.println("  import java.util.Date;");
        System.out.println("  import com.otro.paquete.MiClase;");
        System.out.println("  import com.otro.paquete.*; // todas las clases del paquete");

        // --- Demostrar uso de utilidades ---
        System.out.println("\n--- Demostrando Utilidad ---");
        String[] palabras = {"java", "es", "genial"};
        String oracion = String.join(" ", palabras);
        System.out.println("Unir palabras: " + oracion);

        int numero = 42;
        String binario = Integer.toBinaryString(numero);
        System.out.println("42 en binario: " + binario);
    }
}

/**
 * Clase de utilidad en el mismo paquete.
 * No necesita import porque esta en com.programandoenjava.07_poo
 */
class UtilidadComun {
    String obtenerFecha() {
        // En produccion usarias java.time.LocalDate.now()
        return "2024-01-15";
    }

    String aMayusculas(String texto) {
        return texto.toUpperCase();
    }
}
