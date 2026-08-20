package com.programandoenjava.07_poo;

/**
 * ATRIBUTOS EN LAS CLASES
 * 
 * Los atributos (campos/variables de instancia) definen el estado de un objeto.
 * Pueden ser de cualquier tipo: primitivos, objetos, arrays, etc.
 * Se declaran dentro de la clase pero fuera de los metodos.
 * 
 * Para ejecutar:
 *   mvn compile exec:java -Dexec.mainClass="com.programandoenjava.07_poo.AtributosEnClases"
 */
public class AtributosEnClases {
    public static void main(String[] args) {
        System.out.println("=== ATRIBUTOS EN LAS CLASES ===\n");

        // --- Objeto con diferentes tipos de atributos ---
        System.out.println("--- Creando un Producto ---");
        Producto p1 = new Producto();
        p1.nombre = "Laptop";
        p1.precio = 999.99;
        p1.stock = 15;
        p1.disponible = true;
        p1.categoria = "Tecnologia";

        p1.mostrarInfo();

        // --- Multiples objetos con diferentes estados ---
        System.out.println("\n--- Multiples Productos ---");
        Producto p2 = new Producto();
        p2.nombre = "Mouse";
        p2.precio = 29.99;
        p2.stock = 50;
        p2.disponible = true;
        p2.categoria = "Accesorios";

        Producto p3 = new Producto();
        p3.nombre = "Monitor";
        p3.precio = 349.99;
        p3.stock = 0;
        p3.disponible = false;
        p3.categoria = "Tecnologia";

        Producto[] productos = {p1, p2, p3};
        for (Producto p : productos) {
            p.mostrarInfo();
        }

        // --- Atributos con valores por defecto ---
        System.out.println("\n--- Valores por Defecto de Atributos ---");
        Producto p4 = new Producto();
        System.out.println("String (nombre): " + p4.nombre);    // null
        System.out.println("double (precio): " + p4.precio);    // 0.0
        System.out.println("int (stock): " + p4.stock);          // 0
        System.out.println("boolean (disponible): " + p4.disponible); // false
    }
}

class Producto {
    // Atributos de diferentes tipos
    String nombre;
    double precio;
    int stock;
    boolean disponible;
    String categoria;

    void mostrarInfo() {
        String estado = disponible ? "Disponible" : "Agotado";
        System.out.println("[" + categoria + "] " + nombre +
            " - $" + precio + " | Stock: " + stock + " | " + estado);
    }
}
