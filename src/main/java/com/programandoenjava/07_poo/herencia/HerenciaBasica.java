package com.programandoenjava.07_poo.herencia;

/**
 * JERARQUIA CON EXTENDS (HERENCIA)
 * 
 * La herencia permite que una clase (hija) herede atributos y metodos
 * de otra clase (padre). Usa la palabra clave "extends".
 * 
 * - La clase hija hereda TODO lo publico y protected del padre.
 * - La clase hija puede agregar sus propios atributos y metodos.
 * - La clase hija puede sobrescribir metodos del padre (override).
 * 
 * Para ejecutar:
 *   mvn compile exec:java -Dexec.mainClass="com.programandoenjava.07_poo.herencia.HerenciaBasica"
 */
public class HerenciaBasica {
    public static void main(String[] args) {
        System.out.println("=== HERENCIA CON EXTENDS ===\n");

        // --- Objeto de la clase padre ---
        System.out.println("--- Clase Padre: Animal ---");
        Animal animal = new Animal("Generico", 5);
        animal.comer();
        animal.dormir();
        animal.mostrarInfo();

        // --- Objeto de la clase hija ---
        System.out.println("\n--- Clase Hija: Perro ---");
        Perro perro = new Perro("Firulais", 3, "Labrador");
        perro.comer();     // Heredado de Animal
        perro.dormir();    // Heredado de Animal
        perro.ladrar();    // Metodo propio de Perro
        perro.mostrarInfo(); // Sobrescrito en Perro
        perro.jugar();     // Metodo propio de Perro

        // --- Otro objeto hijo ---
        System.out.println("\n--- Clase Hija: Gato ---");
        Gato gato = new Gato("Mishi", 2);
        gato.comer();      // Heredado de Animal
        gato.maullar();    // Metodo propio de Gato
        gato.mostrarInfo(); // Sobrescrito en Gato

        // --- Verificar herencia ---
        System.out.println("\n--- Verificar Herencia ---");
        System.out.println("Perro es Animal: " + (perro instanceof Animal));
        System.out.println("Gato es Animal: " + (gato instanceof Animal));
    }
}

// Clase padre
class Animal {
    String nombre;
    int edad;

    Animal(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }

    void comer() {
        System.out.println(nombre + " esta comiendo...");
    }

    void dormir() {
        System.out.println(nombre + " esta durmiendo...");
    }

    void mostrarInfo() {
        System.out.println("Animal: " + nombre + ", " + edad + " años");
    }
}

// Clase hija de Animal
class Perro extends Animal {
    String raza;

    Perro(String nombre, int edad, String raza) {
        super(nombre, edad);  // Llama al constructor del padre
        this.raza = raza;
    }

    void ladrar() {
        System.out.println(nombre + " dice: ¡Guau guau!");
    }

    void jugar() {
        System.out.println(nombre + " esta jugando con la pelota");
    }

    @Override
    void mostrarInfo() {
        System.out.println("Perro: " + nombre + ", " + edad + " años, Raza: " + raza);
    }
}

// Otra clase hija
class Gato extends Animal {
    Gato(String nombre, int edad) {
        super(nombre, edad);
    }

    void maullar() {
        System.out.println(nombre + " dice: ¡Miau!");
    }

    @Override
    void mostrarInfo() {
        System.out.println("Gato: " + nombre + ", " + edad + " años");
    }
}
