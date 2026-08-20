package com.cursojava.04_condiciones;

/**
 * CONDICIONES IF Y ELSE EN JAVA
 * 
 * Estructura:
 *   if (condicion) {
 *       // codigo si es true
 *   } else {
 *       // codigo si es false
 *   }
 * 
 * Puede usar else if para multiples condiciones.
 * 
 * Para ejecutar:
 *   mvn compile exec:java -Dexec.mainClass="com.cursojava.04_condiciones.CondicionesIfElse"
 */
public class CondicionesIfElse {
    public static void main(String[] args) {
        System.out.println("=== CONDICIONES IF Y ELSE ===\n");

        // --- If basico ---
        System.out.println("--- If Basico ---");
        int edad = 20;
        if (edad >= 18) {
            System.out.println("Eres mayor de edad");
        }

        // --- If-Else ---
        System.out.println("\n--- If-Else ---");
        int numero = 7;
        if (numero % 2 == 0) {
            System.out.println(numero + " es par");
        } else {
            System.out.println(numero + " es impar");
        }

        // --- If-ElseIf-Else ---
        System.out.println("\n--- If-ElseIf-Else (Calificaciones) ---");
        double nota = 8.5;
        String calificacion;

        if (nota >= 9.0) {
            calificacion = "Sobresaliente";
        } else if (nota >= 7.0) {
            calificacion = "Notable";
        } else if (nota >= 6.0) {
            calificacion = "Aprobado";
        } else if (nota >= 4.0) {
            calificacion = "Suficiente";
        } else {
            calificacion = "Suspenso";
        }
        System.out.println("Nota: " + nota + " -> " + calificacion);

        // --- Condiciones anidadas ---
        System.out.println("\n--- Condiciones Anidadas ---");
        boolean tieneEntrada = true;
        boolean esMayor = true;

        if (tieneEntrada) {
            if (esMayor) {
                System.out.println("Puede entrar a la zona VIP");
            } else {
                System.out.println("Puede entrar solo a la zona general");
            }
        } else {
            System.out.println("No puede entrar sin entrada");
        }

        // --- Ejemplo: Calculadora de impuestos ---
        System.out.println("\n--- Ejemplo: Impuestos ---");
        double ingresos = 45000;
        double impuesto;

        if (ingresos <= 15000) {
            impuesto = ingresos * 0.10;
        } else if (ingresos <= 30000) {
            impuesto = 15000 * 0.10 + (ingresos - 15000) * 0.20;
        } else {
            impuesto = 15000 * 0.10 + 15000 * 0.20 + (ingresos - 30000) * 0.30;
        }

        System.out.println("Ingresos: $" + ingresos);
        System.out.println("Impuesto a pagar: $" + impuesto);
        System.out.println("Ingresos netos: $" + (ingresos - impuesto));
    }
}
