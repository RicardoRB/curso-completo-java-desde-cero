package com.cursojava.05_bucles;

/**
 * BUCLE DO-WHILE EN JAVA
 * 
 * Similar al while, pero se ejecuta al menos UNA VEZ antes de evaluar la condicion.
 * La condicion se evalua DESPUES de cada iteracion.
 * 
 * Sintaxis:
 *   do {
 *       // codigo
 *   } while (condicion);
 * 
 * NOTA: Hay punto y coma al final del while.
 * 
 * Para ejecutar:
 *   mvn compile exec:java -Dexec.mainClass="com.cursojava.05_bucles.BucleDoWhile"
 */
public class BucleDoWhile {
    public static void main(String[] args) {
        System.out.println("=== BUCLE DO-WHILE ===\n");

        // --- Ejemplo basico ---
        System.out.println("--- Ejemplo Basico (numeros 1-5) ---");
        int contador = 1;
        do {
            System.out.println("Numero: " + contador);
            contador++;
        } while (contador <= 5);

        // --- Diferencia con while ---
        System.out.println("\n--- Diferencia: Do-While se ejecuta al menos una vez ---");
        int x = 10;
        System.out.println("x = " + x);
        System.out.println("El codigo dentro del do-while se ejecuta aunque x > 5:");
        do {
            System.out.println("  Se ejecuto una vez (aunque x=10 > 5)");
        } while (x < 5);

        // --- Menu interactivo simulado ---
        System.out.println("\n--- Menu Simulado ---");
        int[] menuSeleccionado = {1, 2, 3, 0}; // Simula: ver menu, opcion 1, opcion 2, salir
        int paso = 0;

        do {
            int opcion = menuSeleccionado[paso];
            paso++;

            switch (opcion) {
                case 1:
                    System.out.println("Opcion 1: Ver perfil del usuario");
                    break;
                case 2:
                    System.out.println("Opcion 2: Configuracion");
                    break;
                case 3:
                    System.out.println("Opcion 3: Ver historial");
                    break;
                default:
                    System.out.println("Saliendo del programa...");
                    break;
            }
        } while (menuSeleccionado[paso - 1] != 0);

        // --- Ejemplo: Validar entrada ---
        System.out.println("\n--- Validar Edad (simulado) ---");
        int[] edadesSimuladas = {-5, -1, 200, 25};
        int intento = 0;

        do {
            int edad = edadesSimuladas[intento];
            System.out.println("Intento " + (intento + 1) + ": Edad ingresada = " + edad);

            if (edad >= 0 && edad <= 150) {
                System.out.println("Edad valida: " + edad + " años");
                break;
            } else {
                System.out.println("Error: Edad no valida. Intenta de nuevo.");
            }
            intento++;
        } while (intento < edadesSimuladas.length);

        // --- Ejemplo: Generar numeros aleatorios ---
        System.out.println("\n--- Generar numeros hasta obtener par ---");
        int[] numerosSimulados = {3, 7, 11, 8, 5};
        int idx = 0;
        do {
            int num = numerosSimulados[idx];
            System.out.println("Numero generado: " + num + (num % 2 == 0 ? " (PAR - encontrado!)" : " (impar)"));
            if (num % 2 == 0) break;
            idx++;
        } while (idx < numerosSimulados.length);
    }
}
