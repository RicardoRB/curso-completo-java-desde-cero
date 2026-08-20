package com.programandoenjava.07_poo;

/**
 * METODOS EN LAS CLASES
 * 
 * Los metodos definen el comportamiento de un objeto.
 * Pueden recibir parametros y retornar valores.
 * 
 * Sintaxis:
 *   tipoRetorno nombreMetodo(parametros) {
 *       // codigo
 *   }
 * 
 * Para ejecutar:
 *   mvn compile exec:java -Dexec.mainClass="com.programandoenjava.07_poo.MetodosEnClases"
 */
public class MetodosEnClases {
    public static void main(String[] args) {
        System.out.println("=== METODOS EN LAS CLASES ===\n");

        Calculadora calc = new Calculadora();

        // --- Metodos sin retorno ---
        System.out.println("--- Metodos sin Retorno (void) ---");
        calc.sumar(10, 5);
        calc.restar(10, 5);

        // --- Metodos con retorno ---
        System.out.println("\n--- Metodos con Retorno ---");
        double resultado = calc.multiplicar(4, 3);
        System.out.println("4 x 3 = " + resultado);

        double division = calc.dividir(10, 3);
        System.out.println("10 / 3 = " + division);

        // --- Metodos con multiples parametros ---
        System.out.println("\n--- Metodos con Multiples Parametros ---");
        PersonaCompleta persona = new PersonaCompleta();
        persona.setNombre("Carlos");
        persona.setEdad(25);
        persona.setCiudad("Madrid");

        persona.mostrarInfo();

        // --- Metodos que retornan boolean ---
        System.out.println("\n--- Metodos que retornan Boolean ---");
        System.out.println("Es mayor de edad: " + persona.esMayorDeEdad());
        System.out.println("Nombre contiene 'a': " + persona.nombreContiene("a"));

        // --- Metodos con logica ---
        System.out.println("\n--- Metodos con Logica ---");
        int factorial = calcularFactorial(5);
        System.out.println("Factorial de 5 = " + factorial);

        boolean esPrimo = esPrimo(17);
        System.out.println("17 es primo: " + esPrimo);
    }

    static int calcularFactorial(int n) {
        int resultado = 1;
        for (int i = 2; i <= n; i++) {
            resultado *= i;
        }
        return resultado;
    }

    static boolean esPrimo(int num) {
        if (num < 2) return false;
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) return false;
        }
        return true;
    }
}

class Calculadora {
    // Metodo sin retorno
    void sumar(double a, double b) {
        System.out.println(a + " + " + b + " = " + (a + b));
    }

    void restar(double a, double b) {
        System.out.println(a + " - " + b + " = " + (a - b));
    }

    // Metodo con retorno
    double multiplicar(double a, double b) {
        return a * b;
    }

    double dividir(double a, double b) {
        if (b == 0) {
            System.out.println("Error: Division por cero");
            return 0;
        }
        return a / b;
    }
}

class PersonaCompleta {
    private String nombre;
    private int edad;
    private String ciudad;

    void setNombre(String nombre) { this.nombre = nombre; }
    void setEdad(int edad) { this.edad = edad; }
    void setCiudad(String ciudad) { this.ciudad = ciudad; }

    void mostrarInfo() {
        System.out.println("Nombre: " + nombre + ", Edad: " + edad + ", Ciudad: " + ciudad);
    }

    boolean esMayorDeEdad() {
        return edad >= 18;
    }

    boolean nombreContiene(String letra) {
        return nombre.toLowerCase().contains(letra.toLowerCase());
    }
}
