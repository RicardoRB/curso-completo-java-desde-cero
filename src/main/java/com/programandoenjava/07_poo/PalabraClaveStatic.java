package com.programandoenjava.07_poo;

/**
 * PALABRA CLAVE STATIC EN JAVA
 * 
 * static = pertenece a la CLASE, no a una instancia.
 * 
 * - Variables estaticas: compartidas por todas las instancias.
 * - Metodos estaticos: se llaman sin crear un objeto (Clase.metodo()).
 * - Bloques estaticos: se ejecutan una vez cuando se carga la clase.
 * 
 * Para ejecutar:
 *   mvn compile exec:java -Dexec.mainClass="com.programandoenjava.07_poo.PalabraClaveStatic"
 */
public class PalabraClaveStatic {
    public static void main(String[] args) {
        System.out.println("=== PALABRA CLAVE STATIC ===\n");

        // --- Variable estatica ---
        System.out.println("--- Variable Estatica (contadores) ---");
        System.out.println("Contador antes: " + Contador.getContador());

        Contador c1 = new Contador();
        Contador c2 = new Contador();
        Contador c3 = new Contador();

        System.out.println("Contador despues de crear 3 objetos: " + Contador.getContador());

        // --- Metodo estatico ---
        System.out.println("\n--- Metodos Estaticos (CalculadoraUtil) ---");
        System.out.println("Suma: " + CalculadoraUtil.sumar(5, 3));
        System.out.println("Resta: " + CalculadoraUtil.restar(10, 4));
        System.out.println("Maximo: " + CalculadoraUtil.max(15, 20));
        System.out.println("Absoluto: " + CalculadoraUtil.abs(-42));

        // --- Constantes estaticas ---
        System.out.println("\n--- Constantes Estaticas ---");
        System.out.println("PI = " + Constantes.PI);
        System.out.println("E = " + Constantes.E);
        System.out.println("VERSION = " + Constantes.VERSION);

        // --- Bloque estatico ---
        System.out.println("\n--- Bloque Estatico ---");
        System.out.println("La clase Singleton ha sido cargada");
        Singleton s1 = Singleton.getInstancia();
        Singleton s2 = Singleton.getInstancia();
        System.out.println("Son el mismo objeto: " + (s1 == s2));
    }
}

class Contador {
    private static int contador = 0;  // Compartida por todas las instancias

    Contador() {
        contador++;  // Se incrementa cada vez que se crea un objeto
    }

    static int getContador() {
        return contador;
    }
}

class CalculadoraUtil {
    // Metodos estaticos: se llaman sin crear objeto
    static double sumar(double a, double b) { return a + b; }
    static double restar(double a, double b) { return a - b; }
    static double multiplicar(double a, double b) { return a * b; }
    static double dividir(double a, double b) { return a / b; }
    static int max(int a, int b) { return a > b ? a : b; }
    static int abs(int a) { return a < 0 ? -a : a; }
}

class Constantes {
    static final double PI = 3.141592653589793;
    static final double E = 2.718281828459045;
    static final String VERSION = "1.0.0";
}

class Singleton {
    private static Singleton instancia;
    private String datos;

    // Bloque estatico: se ejecuta una vez al cargar la clase
    static {
        System.out.println("Bloque estatico: inicializando Singleton");
    }

    private Singleton() {
        datos = "Datos unicos";
    }

    static Singleton getInstancia() {
        if (instancia == null) {
            instancia = new Singleton();
        }
        return instancia;
    }

    String getDatos() { return datos; }
}
