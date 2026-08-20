package com.cursojava.04_condiciones;

/**
 * CONDICIONES CONCATENADAS CON IF-ELSE
 * 
 * Puedes combinar multiples condiciones usando operadores logicos (&&, ||).
 * Esto permite evaluar varias condiciones en una sola sentencia if.
 * 
 * Para ejecutar:
 *   mvn compile exec:java -Dexec.mainClass="com.cursojava.04_condiciones.CondicionesConcatenadas"
 */
public class CondicionesConcatenadas {
    public static void main(String[] args) {
        System.out.println("=== CONDICIONES CONCATENADAS ===\n");

        // --- Ejemplo 1: Sistema de becas ---
        System.out.println("--- Sistema de Becas ---");
        double promedio = 8.5;
        int ingresoFamiliar = 2000;
        int edad = 20;

        if (promedio >= 9.0 && ingresoFamiliar <= 1500) {
            System.out.println("Beca completa (100%)");
        } else if (promedio >= 8.0 && ingresoFamiliar <= 2500) {
            System.out.println("Beca parcial (50%)");
        } else if (promedio >= 7.0 || ingresoFamiliar <= 1000) {
            System.out.println("Beca basica (25%)");
        } else {
            System.out.println("Sin beca");
        }

        // --- Ejemplo 2: Validacion de usuario ---
        System.out.println("\n--- Validacion de Usuario ---");
        String usuario = "admin";
        String contrasena = "1234";
        boolean activo = true;

        if (usuario.equals("admin") && contrasena.equals("1234") && activo) {
            System.out.println("Inicio de sesion exitoso");
        } else if (usuario.equals("admin") && !activo) {
            System.out.println("Cuenta deshabilitada");
        } else {
            System.out.println("Credenciales incorrectas");
        }

        // --- Ejemplo 3: Rango de edades ---
        System.out.println("\n--- Clasificacion por Edad ---");
        int edadPersona = 25;

        if (edadPersona >= 0 && edadPersona <= 12) {
            System.out.println("Nino");
        } else if (edadPersona >= 13 && edadPersona <= 17) {
            System.out.println("Adolescente");
        } else if (edadPersona >= 18 && edadPersona <= 64) {
            System.out.println("Adulto");
        } else if (edadPersona >= 65) {
            System.out.println("Adulto mayor");
        } else {
            System.out.println("Edad no valida");
        }

        // --- Ejemplo 4: Dia de la semana ---
        System.out.println("\n--- Dia de la Semana ---");
        int dia = 3;  // 1=Lunes, 7=Domingo

        if (dia >= 1 && dia <= 5) {
            System.out.println("Dia " + dia + " es dia laboral");
            if (dia == 1) {
                System.out.println("Lunes: inicio de semana");
            } else if (dia == 5) {
                System.out.println("Viernes: fin de semana se acerca!");
            }
        } else if (dia == 6 || dia == 7) {
            System.out.println("Dia " + dia + " es fin de semana");
        } else {
            System.out.println("Dia no valido (debe ser 1-7)");
        }
    }
}
