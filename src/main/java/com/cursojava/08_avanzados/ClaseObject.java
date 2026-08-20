package com.cursojava.08_avanzados;

/**
 * CLASE PADRE OBJECT EN JAVA
 * 
 * Object es la clase padre de TODAS las clases en Java.
 * Si una clase no extiende explicitamente a otra, extiende a Object.
 * 
 * Metodos importantes de Object:
 * - toString(): representacion en texto del objeto.
 * - equals(): compara si dos objetos son iguales.
 * - hashCode(): retorna un codigo hash del objeto.
 * - getClass(): retorna la clase del objeto.
 * - clone(): crea una copia del objeto.
 * 
 * Para ejecutar:
 *   mvn compile exec:java -Dexec.mainClass="com.cursojava.08_avanzados.ClaseObject
 */
public class ClaseObject {
    public static void main(String[] args) {
        System.out.println("=== CLASE PADRE OBJECT ===\n");

        // --- toString() por defecto ---
        System.out.println("--- toString() por Defecto ---");
        PersonaObject p1 = new PersonaObject("Carlos", 25);
        System.out.println("toString(): " + p1.toString());
        System.out.println("println() usa toString() automaticamente: " + p1);

        // --- equals() por defecto ---
        System.out.println("\n--- equals() por Defecto (compara referencias) ---");
        PersonaObject p2 = new PersonaObject("Carlos", 25);
        PersonaObject p3 = p1;

        System.out.println("p1 == p2: " + (p1 == p2));        // false (diferentes objetos)
        System.out.println("p1.equals(p2): " + p1.equals(p2)); // false (por defecto)
        System.out.println("p1 == p3: " + (p1 == p3));        // true (misma referencia)
        System.out.println("p1.equals(p3): " + p1.equals(p3)); // true

        // --- Sobrescribir equals y toString ---
        System.out.println("\n--- Sobrescribir equals y toString ---");
        PersonaObject p4 = new PersonaObject("Carlos", 25);
        PersonaObject p5 = new PersonaObject("Maria", 30);

        System.out.println("p4.toString(): " + p4);
        System.out.println("p5.toString(): " + p5);
        System.out.println("p4.equals(p5): " + p4.equals(p5));

        PersonaObject p6 = new PersonaObject("Carlos", 25);
        System.out.println("p4.equals(p6): " + p4.equals(p6));

        // --- getClass() ---
        System.out.println("\n--- getClass() ---");
        System.out.println("Clase de p1: " + p1.getClass().getName());
        System.out.println("Clase simple: " + p1.getClass().getSimpleName());

        // --- hashCode() ---
        System.out.println("\n--- hashCode() ---");
        System.out.println("p1 hashCode: " + p1.hashCode());
        System.out.println("p4 hashCode: " + p4.hashCode());
        System.out.println("p5 hashCode: " + p5.hashCode());
        System.out.println("(Objetos iguales deben tener el mismo hashCode)");

        // --- instanceof con Object ---
        System.out.println("\n--- instanceof ---");
        System.out.println("p1 es Object: " + (p1 instanceof Object));
        System.out.println("p1 es PersonaObject: " + (p1 instanceof PersonaObject));
        System.out.println("\"Hola\" es String: " + ("Hola" instanceof String));
    }
}

class PersonaObject {
    private String nombre;
    private int edad;

    PersonaObject(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }

    // Sobrescribir toString
    @Override
    public String toString() {
        return "PersonaObject{nombre='" + nombre + "', edad=" + edad + "}";
    }

    // Sobrescribir equals
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        PersonaObject otro = (PersonaObject) obj;
        return edad == otro.edad && nombre.equals(otro.nombre);
    }

    // Sobrescribir hashCode (debe ser consistente con equals)
    @Override
    public int hashCode() {
        int result = nombre.hashCode();
        result = 31 * result + edad;
        return result;
    }
}
