package com.programandoenjava.04_condiciones;

/**
 * CONDICION SWITCH EN JAVA
 * 
 * Switch evalua una variable y ejecuta el caso que coincida.
 * Es mas legible que multiples if-else cuando se compara un valor exacto.
 * 
 * Soporta: String, int, char, enum, y tipos wrapper.
 * 
 * Para ejecutar:
 *   mvn compile exec:java -Dexec.mainClass="com.programandoenjava.04_condiciones.SwitchCondicion"
 */
public class SwitchCondicion {
    public static void main(String[] args) {
        System.out.println("=== CONDICION SWITCH ===\n");

        // --- Switch basico ---
        System.out.println("--- Switch Basico (Dia de la semana) ---");
        int dia = 3;

        switch (dia) {
            case 1:
                System.out.println("Lunes");
                break;
            case 2:
                System.out.println("Martes");
                break;
            case 3:
                System.out.println("Miercoles");
                break;
            case 4:
                System.out.println("Jueves");
                break;
            case 5:
                System.out.println("Viernes");
                break;
            case 6:
                System.out.println("Sabado");
                break;
            case 7:
                System.out.println("Domingo");
                break;
            default:
                System.out.println("Dia no valido");
                break;
        }

        // --- Switch con String ---
        System.out.println("\n--- Switch con String (Dia en ingles) ---");
        String diaIngles = "Monday";

        switch (diaIngles) {
            case "Monday":
                System.out.println("Lunes");
                break;
            case "Tuesday":
                System.out.println("Martes");
                break;
            case "Wednesday":
                System.out.println("Miercoles");
                break;
            default:
                System.out.println("Otro dia");
                break;
        }

        // --- Switch con char ---
        System.out.println("\n--- Switch con char (Calificacion) ---");
        char nota = 'B';

        switch (nota) {
            case 'A':
                System.out.println("Excelente (90-100)");
                break;
            case 'B':
                System.out.println("Bueno (80-89)");
                break;
            case 'C':
                System.out.println("Regular (70-79)");
                break;
            case 'D':
                System.out.println("Malo (60-69)");
                break;
            case 'F':
                System.out.println("Reprobado (0-59)");
                break;
            default:
                System.out.println("Calificacion no valida");
        }

        // --- Switch con multiplicar cascases ---
        System.out.println("\n--- Multiples casos (Trimestre) ---");
        int mes = 11;
        String trimestre;

        switch (mes) {
            case 1: case 2: case 3:
                trimestre = "Primer trimestre";
                break;
            case 4: case 5: case 6:
                trimestre = "Segundo trimestre";
                break;
            case 7: case 8: case 9:
                trimestre = "Tercer trimestre";
                break;
            case 10: case 11: case 12:
                trimestre = "Cuarto trimestre";
                break;
            default:
                trimestre = "Mes no valido";
                break;
        }
        System.out.println("Mes " + mes + " -> " + trimestre);

        // --- Ejemplo: Calculadora ---
        System.out.println("\n--- Calculadora con Switch ---");
        double num1 = 10;
        double num2 = 3;
        char operador = '+';
        double resultado;

        switch (operador) {
            case '+':
                resultado = num1 + num2;
                break;
            case '-':
                resultado = num1 - num2;
                break;
            case '*':
                resultado = num1 * num2;
                break;
            case '/':
                if (num2 != 0) {
                    resultado = num1 / num2;
                } else {
                    System.out.println("Error: Division por cero");
                    return;
                }
                break;
            case '%':
                resultado = num1 % num2;
                break;
            default:
                System.out.println("Operador no valido");
                return;
        }
        System.out.println(num1 + " " + operador + " " + num2 + " " + resultado);
    }
}
