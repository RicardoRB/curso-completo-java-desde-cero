package com.programandoenjava.03_operadores;

/**
 * OPERADORES LOGICOS EN JAVA
 * 
 * &&   AND logico (ambos deben ser true)
 * ||   OR logico (al menos uno debe ser true)
 * !    NOT logico (invierte el valor booleano)
 * 
 * Cortocircuito:
 *   Si el lado izquierdo de && es false, no evalua el derecho.
 *   Si el lado izquierdo de || es true, no evalua el derecho.
 * 
 * Para ejecutar:
 *   mvn compile exec:java -Dexec.mainClass="com.programandoenjava.03_operadores.OperadoresLogicos"
 */
public class OperadoresLogicos {
    public static void main(String[] args) {
        System.out.println("=== OPERADORES LOGICOS ===\n");

        boolean a = true;
        boolean b = false;

        // --- AND logico ---
        System.out.println("--- AND (&&) ---");
        System.out.println("true && true = " + (true && true));     // true
        System.out.println("true && false = " + (true && false));   // false
        System.out.println("false && true = " + (false && true));   // false
        System.out.println("false && false = " + (false && false)); // false

        // --- OR logico ---
        System.out.println("\n--- OR (||) ---");
        System.out.println("true || true = " + (true || true));     // true
        System.out.println("true || false = " + (true || false));   // true
        System.out.println("false || true = " + (false || true));   // true
        System.out.println("false || false = " + (false || false)); // false

        // --- NOT logico ---
        System.out.println("\n--- NOT (!) ---");
        System.out.println("!true = " + (!true));    // false
        System.out.println("!false = " + (!false));  // true

        // --- Ejemplos practicos ---
        System.out.println("\n--- Ejemplos Practicos ---");
        int edad = 25;
        boolean tienePermiso = true;

        // AND: ambas condiciones deben cumplirse
        boolean puedeConducir = edad >= 18 && tienePermiso;
        System.out.println("Edad: " + edad + ", Tiene permiso: " + tienePermiso);
        System.out.println("Puede conducir (edad>=18 && permiso): " + puedeConducir);

        // OR: al menos una condicion se cumple
        boolean esFinDeSemana = true;
        boolean esFeriado = false;
        boolean noTrabaja = esFinDeSemana || esFeriado;
        System.out.println("\nEs fin de semana: " + esFinDeSemana + ", Es feriado: " + esFeriado);
        System.out.println("No trabaja (finDeSemana || feriado): " + noTrabaja);

        // NOT: invierte el valor
        boolean estaLloviendo = false;
        boolean saleElSol = !estaLloviendo;
        System.out.println("\nEsta lloviendo: " + estaLloviendo);
        System.out.println("Sale el sol (!lloviendo): " + saleElSol);

        // --- Cortocircuito ---
        System.out.println("\n--- Cortocircuito ---");
        int x = 5;
        // Si x > 10 es false, no evalua laDivisionPorCero
        boolean resultado = x > 10 && (10 / 0 == 0);
        System.out.println("x=5, x>10 && (10/0==0): " + resultado); // false, sin error
        System.out.println("(El lado derecho NO se evalua por cortocircuito)");

        // --- Ejemplo completo ---
        System.out.println("\n--- Ejemplo Completo: Calificacion ---");
        double nota = 7.5;
        int asistencias = 85;
        boolean aprobado = nota >= 6.0 && asistencias >= 80;
        boolean mencionHonora = nota >= 9.0 && asistencias >= 95;
        boolean recuperacion = !aprobado && nota >= 4.0;

        System.out.println("Nota: " + nota + ", Asistencias: " + asistencias + "%");
        System.out.println("Aprobado: " + aprobado);
        System.out.println("Mencion honor: " + mencionHonora);
        System.out.println("Recuperacion: " + recuperacion);
    }
}
