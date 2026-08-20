package com.cursojava.07_poo;

/**
 * CLASES Y OBJETOS EN JAVA
 * 
 * Una CLASE es un molde/plantilla que define atributos y comportamientos.
 * Un OBJETO es una instancia concreta de una clase.
 * 
 * - Clase: "Perro" (el concepto)
 * - Objeto: "Firulais" (una instancia concreta)
 * 
 * Para ejecutar:
 *   mvn compile exec:java -Dexec.mainClass="com.cursojava.07_poo.ClasesYObjetos"
 */
public class ClasesYObjetos {
    public static void main(String[] args) {
        System.out.println("=== CLASES Y OBJETOS ===\n");

        // --- Crear objetos de la clase Persona ---
        System.out.println("--- Creando Objetos ---");
        Persona persona1 = new Persona();
        persona1.nombre = "Carlos";
        persona1.edad = 25;
        persona1.email = "carlos@email.com";

        Persona persona2 = new Persona();
        persona2.nombre = "Maria";
        persona2.edad = 30;
        persona2.email = "maria@email.com";

        // --- Usar metodos ---
        System.out.println("\n--- Usando Metodos ---");
        persona1.saludar();
        persona2.saludar();

        // --- Acceder a atributos ---
        System.out.println("\n--- Acceder a Atributos ---");
        System.out.println(persona1.nombre + " tiene " + persona1.edad + " años");
        System.out.println(persona2.nombre + " tiene " + persona2.edad + " años");

        // --- Objeto de la clase Coche ---
        System.out.println("\n--- Objeto Coche ---");
        Coche coche1 = new Coche();
        coche1.marca = "Toyota";
        coche1.modelo = "Corolla";
        coche1.anio = 2023;
        coche1.color = "Rojo";

        coche1.mostrarInfo();
        coche1.arrancar();
        coche1.acelerar();
        coche1.frenar();

        // --- Multiples objetos ---
        System.out("\n--- Cada objeto es independiente ---");
        Coche coche2 = new Coche();
        coche2.marca = "Honda";
        coche2.modelo = "Civic";
        coche2.anio = 2022;
        coche2.color = "Azul";

        coche1.mostrarInfo();
        coche2.mostrarInfo();
    }
}

/**
 * Clase Persona - Ejemplo basico de clase
 */
class Persona {
    // Atributos (variables de instancia)
    String nombre;
    int edad;
    String email;

    // Metodo saludar
    void saludar() {
        System.out.println("Hola, soy " + nombre + " y tengo " + edad + " años");
    }
}

/**
 * Clase Coche - Otro ejemplo
 */
class Coche {
    String marca;
    String modelo;
    int anio;
    String color;

    void mostrarInfo() {
        System.out.println(marca + " " + modelo + " (" + anio + ") - Color: " + color);
    }

    void arrancar() {
        System.out.println(marca + " " + modelo + " ha arrancado");
    }

    void acelerar() {
        System.out.println(marca + " esta acelerando...");
    }

    void frenar() {
        System.out.println(marca + " ha frenado");
    }
}
