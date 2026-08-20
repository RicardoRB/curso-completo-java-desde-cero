package com.programandoenjava.07_poo;

/**
 * CLASES VS OBJETOS EN JAVA
 * 
 * CLASE = Molde/Plantilla (el plano de una casa)
 * OBJETO = Instancia concreta (la casa construida)
 * 
 * Puedes crear miles de objetos de una misma clase,
 * cada uno con sus propios valores de atributos.
 * 
 * Para ejecutar:
 *   mvn compile exec:java -Dexec.mainClass="com.programandoenjava.07_poo.ClasesVsObjetos"
 */
public class ClasesVsObjetos {
    public static void main(String[] args) {
        System.out.println("=== CLASES VS OBJETOS ===\n");

        System.out.println("--- Un molde, multiples instancias ---");
        
        // Todos son de la misma clase, pero con diferentes valores
        Animal perro = new Animal();
        perro.nombre = "Firulais";
        perro.especie = "Perro";
        perro.edad = 5;
        perro.sonido = "Guau guau";

        Animal gato = new Animal();
        gato.nombre = "Mishi";
        gato.especie = "Gato";
        gato.edad = 3;
        gato.sonido = "Miau";

        Animal lorito = new Animal();
        lorito.nombre = "Pepe";
        lorito.especie = "Loro";
        lorito.edad = 2;
        lorito.sonido = "Hola!";

        System.out.println("Objeto 1: " + perro.nombre);
        perro.hacerSonido();

        System.out.println("\nObjeto 2: " + gato.nombre);
        gato.hacerSonido();

        System.out.println("\nObjeto 3: " + lorito.nombre);
        lorito.hacerSonido();

        // --- Demostrar que son objetos independientes ---
        System.out.println("\n--- Cada objeto tiene su propio estado ---");
        Animal[] animales = {perro, gato, lorito};
        for (Animal a : animales) {
            System.out.println(a.nombre + " (" + a.especie + ", " + a.edad + " años)");
        }

        // --- Modificar uno no afecta a otros ---
        System.out.println("\n--- Modificar uno NO afecta a otros ---");
        perro.edad = 6;
        System.out.println(perro.nombre + " ahora tiene " + perro.edad + " años");
        System.out.println(gato.nombre + " sigue teniendo " + gato.edad + " años");
    }
}

class Animal {
    String nombre;
    String especie;
    int edad;
    String sonido;

    void hacerSonido() {
        System.out.println(nombre + " dice: " + sonido);
    }
}
