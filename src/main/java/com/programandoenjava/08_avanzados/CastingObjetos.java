package com.programandoenjava.08_avanzados;

/**
 * CASTEANDO OBJETOS EN JAVA
 * 
 * Casting de objetos: convertir una referencia de un tipo a otro.
 * 
 * - Upcasting: hijo -> padre (automatico, seguro).
 * - Downcasting: padre -> hijo (manual, puede lanzar ClassCastException).
 * - instanceof: verificar tipo antes de castear.
 * 
 * Para ejecutar:
 *   mvn compile exec:java -Dexec.mainClass="com.programandoenjava.08_avanzados.CastingObjetos
 */
public class CastingObjetos {
    public static void main(String[] args) {
        System.out.println("=== CASTEANDO OBJETOS ===\n");

        // --- Upcasting (automatico) ---
        System.out.println("--- Upcasting (Hijo -> Padre) ---");
        AnimalCasting perro = new PerroCasting("Firulais", "Labrador");
        AnimalCasting gato = new GatoCasting("Mishi");

        // Upcasting es automatico
        AnimalCasting animal1 = perro;  // OK: perro es un Animal
        AnimalCasting animal2 = gato;   // OK: gato es un Animal

        animal1.hacerSonido();  // Polimorfismo: ejecuta el metodo del hijo
        animal2.hacerSonido();

        // --- Downcasting (manual) ---
        System.out.println("\n--- Downcasting (Padre -> Hijo) ---");
        // Necesitamos verificar con instanceof antes de castear
        if (animal1 instanceof PerroCasting) {
            PerroCasting perroCast = (PerroCasting) animal1;  // Downcasting manual
            perroCast.buscarPelota();  // Metodo exclusivo de Perro
        }

        if (animal2 instanceof GatoCasting) {
            GatoCasting gatoCast = (GatoCasting) animal2;
            gatoCast.trepar();  // Metodo exclusivo de Gato
        }

        // --- ClassCastException (error comun) ---
        System.out.println("\n--- ClassCastException (cuidado!) ---");
        AnimalCasting otroAnimal = new PerroCasting("Rex", "Pastor Aleman");

        // Esto funcionaria:
        if (otroAnimal instanceof PerroCasting) {
            PerroCasting p = (PerroCasting) otroAnimal;
            System.out.println("Cast exitoso: " + p.getRaza());
        }

        // Esto lanzaria ClassCastException:
        // GatoCasting gatoMal = (GatoCasting) otroAnimal;  // ERROR!

        // --- Ejemplo pratico: procesar lista mixta ---
        System.out.println("\n--- Procesar Lista Mixta ---");
        AnimalCasting[] animales = {
            new PerroCasting("Max", "Bulldog"),
            new GatoCasting("Luna"),
            new PerroCasting("Rocky", "Pastor"),
            new GatoCasting("Simba")
        };

        for (AnimalCasting a : animales) {
            System.out.print(a.getNombre() + ": ");
            a.hacerSonido();

            if (a instanceof PerroCasting) {
                PerroCasting p = (PerroCasting) a;
                System.out.println("  Raza: " + p.getRaza());
            } else if (a instanceof GatoCasting) {
                System.out.println("  Es un gato domesticado");
            }
        }
    }
}

class AnimalCasting {
    protected String nombre;

    AnimalCasting(String nombre) {
        this.nombre = nombre;
    }

    String getNombre() { return nombre; }

    void hacerSonido() {
        System.out.println(nombre + " hace un sonido generico");
    }
}

class PerroCasting extends AnimalCasting {
    private String raza;

    PerroCasting(String nombre, String raza) {
        super(nombre);
        this.raza = raza;
    }

    String getRaza() { return raza; }

    void buscarPelota() {
        System.out.println(nombre + " busca la pelota con entusiasmo");
    }

    @Override
    void hacerSonido() {
        System.out.println(nombre + " dice: ¡Guau guau!");
    }
}

class GatoCasting extends AnimalCasting {
    GatoCasting(String nombre) {
        super(nombre);
    }

    void trepar() {
        System.out.println(nombre + " trepa por los arboles");
    }

    @Override
    void hacerSonido() {
        System.out.println(nombre + " dice: ¡Miau!");
    }
}
