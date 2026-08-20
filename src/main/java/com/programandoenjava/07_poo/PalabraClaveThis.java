package com.programandoenjava.07_poo;

/**
 * PALABRA CLAVE THIS EN JAVA
 * 
 * "this" se refiere al objeto actual que esta ejecutando el codigo.
 * 
 * Usos:
 * 1. Diferenciar atributo de parametro (cuando tienen el mismo nombre).
 * 2. Llamar a otro constructor de la misma clase (this()).
 * 3. Pasar el objeto actual como parametro.
 * 4. Retornar el objeto actual (return this).
 * 
 * Para ejecutar:
 *   mvn compile exec:java -Dexec.mainClass="com.programandoenjava.07_poo.PalabraClaveThis
 */
public class PalabraClaveThis {
    public static void main(String[] args) {
        System.out.println("=== PALABRA CLAVE THIS ===\n");

        // --- Diferenciar atributo de parametro ---
        System.out.println("--- 1. Diferenciar Atributo de Parametro ---");
        PersonaThis p1 = new PersonaThis();
        p1.setNombre("Carlos");
        p1.setEdad(25);
        System.out.println("Nombre: " + p1.getNombre());
        System.out.println("Edad: " + p1.getEdad());

        // --- Llamar a otro constructor ---
        System.out.println("\n--- 2. Llamar a otro Constructor (this()) ---");
        PersonaThis p2 = new PersonaThis("Maria", 30);
        PersonaThis p3 = new PersonaThis("Pedro", 22, "pedro@email.com");

        System.out.println(p2);
        System.out.println(p3);

        // --- Retornar el objeto actual (method chaining) ---
        System.out.println("\n--- 3. Method Chaining (return this) ---");
        PersonaThis persona = new PersonaThis()
            .setNombre("Ana")
            .setEdad(28)
            .setEmail("ana@email.com");

        System.out.println("Persona creada: " + persona);

        // --- Pasar el objeto actual ---
        System.out.println("\n--- 4. Pasar Objeto Actual ---");
        ComparadorPersonas comparador = new ComparadorPersonas();
        comparador.comparar(persona, p2);
    }
}

class PersonaThis {
    private String nombre;
    private int edad;
    private String email;

    // Constructor vacio
    PersonaThis() {
        this("Sin nombre", 0);  // Llama al constructor de 2 parametros
    }

    // Constructor con 2 parametros
    PersonaThis(String nombre, int edad) {
        this(nombre, edad, "sin@email.com");  // Llama al constructor de 3 parametros
    }

    // Constructor con 3 parametros
    PersonaThis(String nombre, int edad, String email) {
        this.nombre = nombre;  // "this.nombre" es el atributo, "nombre" es el parametro
        this.edad = edad;
        this.email = email;
    }

    // Getters y Setters con this para method chaining
    PersonaThis setNombre(String nombre) {
        this.nombre = nombre;
        return this;  // Retorna el objeto actual
    }

    PersonaThis setEdad(int edad) {
        this.edad = edad;
        return this;
    }

    PersonaThis setEmail(String email) {
        this.email = email;
        return this;
    }

    String getNombre() { return nombre; }
    int getEdad() { return edad; }

    @Override
    public String toString() {
        return nombre + " (" + edad + " años) - " + email;
    }
}

class ComparadorPersonas {
    void comparar(PersonaThis a, PersonaThis b) {
        System.out.println("Comparando:");
        System.out.println("  A: " + a);
        System.out.println("  B: " + b);
        System.out.println("  Mismo nombre: " + a.getNombre().equals(b.getNombre()));
        System.out.println("  Misma edad: " + (a.getEdad() == b.getEdad()));
    }
}
