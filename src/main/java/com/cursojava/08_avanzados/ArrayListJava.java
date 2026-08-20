package com.cursojava.08_avanzados;

import java.util.ArrayList;

/**
 * ARRAYLIST EN JAVA
 * 
 * ArrayList es una coleccion dinamica (crece y se reduce automaticamente).
 * A diferencia de un array, su tamano no es fijo.
 * 
 * Import: java.util.ArrayList
 * 
 * Metodos principales:
 * - add(elemento): agrega al final
 * - add(indice, elemento): agrega en posicion especifica
 * - get(indice): obtiene elemento
 * - set(indice, elemento): reemplaza elemento
 * - remove(indice): elimina por posicion
 * - remove(elemento): elimina primera ocurrencia
 * - size(): retorna tamano
 * - contains(elemento): verifica si existe
 * - indexOf(elemento): retorna indice
 * - isEmpty(): verifica si esta vacio
 * - clear(): elimina todos los elementos
 * 
 * Para ejecutar:
 *   mvn compile exec:java -Dexec.mainClass="com.cursojava.08_avanzados.ArrayListJava
 */
public class ArrayListJava {
    public static void main(String[] args) {
        System.out.println("=== ARRAYLIST EN JAVA ===\n");

        // --- Crear ArrayList ---
        System.out.println("--- Crear y Agregar Elementos ---");
        ArrayList<String> frutas = new ArrayList<>();
        frutas.add("Manzana");
        frutas.add("Pera");
        frutas.add("Naranja");
        frutas.add("Platano");

        System.out.println("Frutas: " + frutas);
        System.out.println("Tamano: " + frutas.size());

        // --- Acceder a elementos ---
        System.out.println("\n--- Acceder a Elementos ---");
        System.out.println("Primera fruta: " + frutas.get(0));
        System.out.println("Ultima fruta: " + frutas.get(frutas.size() - 1));

        // --- Modificar elementos ---
        System.out.println("\n--- Modificar Elementos ---");
        frutas.set(1, "Fresa");
        System.out.println("Despues de cambiar [1]: " + frutas);

        // --- Eliminar elementos ---
        System.out.println("\n--- Eliminar Elementos ---");
        frutas.remove("Naranja");
        System.out.println("Despues de eliminar Naranja: " + frutas);

        frutas.remove(0);
        System.out.println("Despues de eliminar indice 0: " + frutas);

        // --- Verificar existencia ---
        System.out.println("\n--- Verificar y Buscar ---");
        System.out.println("Contiene Platano: " + frutas.contains("Platano"));
        System.out.println("Indice de Fresa: " + frutas.indexOf("Fresa"));
        System.out.println("Esta vacia: " + frutas.isEmpty());

        // --- ArrayList de enteros ---
        System.out.println("\n--- ArrayList de Enteros ---");
        ArrayList<Integer> numeros = new ArrayList<>();
        numeros.add(10);
        numeros.add(20);
        numeros.add(30);
        numeros.add(40);
        numeros.add(50);

        System.out.println("Numeros: " + numeros);

        // Sumar todos
        int suma = 0;
        for (int num : numeros) suma += num;
        System.out.println("Suma: " + suma);

        // Encontrar mayor
        int mayor = numeros.get(0);
        for (int num : numeros) {
            if (num > mayor) mayor = num;
        }
        System.out.println("Mayor: " + mayor);

        // --- ArrayList de objetos personalizados ---
        System.out.println("\n--- ArrayList de Personas ---");
        ArrayList<PersonaArrayList> personas = new ArrayList<>();
        personas.add(new PersonaArrayList("Carlos", 25));
        personas.add(new PersonaArrayList("Maria", 30));
        personas.add(new PersonaArrayList("Pedro", 22));

        System.out.println("Personas:");
        for (PersonaArrayList p : personas) {
            System.out.println("  " + p);
        }

        // --- Metodos utiles ---
        System.out.println("\n--- Metodos Utiles ---");
        ArrayList<String> lenguajes = new ArrayList<>();
        lenguajes.add("Java");
        lenguajes.add("Python");
        lenguajes.add("JavaScript");
        lenguajes.add("C++");
        lenguajes.add("Java");

        System.out.println("Original: " + lenguajes);
        System.out.println("Contains Java: " + lenguajes.contains("Java"));
        System.out.println("IndexOf Python: " + lenguajes.indexOf("Python"));
        System.out.println("LastIndexOf Java: " + lenguajes.lastIndexOf("Java"));

        // Sublista
        ArrayList<String> sub = new ArrayList<>(lenguajes.subList(1, 3));
        System.out.println("Sublista(1,3): " + sub);

        // Eliminar todos
        lenguajes.clear();
        System.out.println("Despues de clear(): " + lenguajes);
        System.out.println("Vacio: " + lenguajes.isEmpty());
    }
}

class PersonaArrayList {
    private String nombre;
    private int edad;

    PersonaArrayList(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }

    @Override
    public String toString() {
        return nombre + " (" + edad + " años)";
    }
}
