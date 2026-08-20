package com.programandoenjava.07_poo.interfaces;

/**
 * INTERFACES EN JAVA
 * 
 * Una interfaz define un contrato que las clases deben cumplir.
 * Una clase "implementa" una interfaz y DEBE implementar todos sus metodos.
 * 
 * Diferencias con clase abstracta:
 * - Una clase puede implementar MULTIPLES interfaces.
 * - Una interfaz solo puede tener metodos abstractos (hasta Java 7).
 * - Java 8+: puede tener metodos default y static.
 * - Las interfaces no tienen constructores ni atributos de instancia.
 * 
 * Para ejecutar:
 *   mvn compile exec:java -Dexec.mainClass="com.programandoenjava.07_poo.interfaces.InterfacesJava
 */
public class InterfacesJava {
    public static void main(String[] args) {
        System.out.println("=== INTERFACES EN JAVA ===\n");

        // --- Interfaz basica ---
        System.out.println("--- Implementando Interfaz Basica ---");
        GatoInterfaz gato = new GatoInterfaz("Mishi");
        PerroInterfaz perro = new PerroInterfaz("Firulais");

        gato.hacerSonido();
        perro.hacerSonido();

        // --- Interfaz como tipo ---
        System.out.println("\n--- Interfaz como Tipo ---");
        AnimalInterfaz[] animales = {gato, perro};
        for (AnimalInterfaz a : animales) {
            a.hacerSonido();
            a.comer();
        }

        // --- Multiples interfaces ---
        System.out.println("\n--- Multiples Interfaces ---");
        Robot robot = new Robot("Wall-E");
        robot.hacerSonido();  // De AnimalInterfaz
        robot.trabajar();     // De Trabajador
        robot.cargar();       // De Cargable

        // --- Interface como referencia ---
        System.out.println("\n--- Interface como Referencia ---");
        Cargable cargador = robot;  // Referencia de tipo Cargable
        cargador.cargar();

        // --- Metodos default ---
        System.out.println("\n--- Metodos Default ---");
        Volador pajaro = new Pajaro("Piolin");
        pajaro.volar();     // Metodo default de la interfaz
        pajaro.aterrizar(); // Metodo default
        pajaro.cantar();    // Metodo implementado

        // --- Metodos estaticos ---
        System.out.println("\n--- Metodos Estaticos de Interfaz ---");
        double area = FiguraGeometrica.calcularCirculo(5);
        System.out.println("Area del circulo (radio 5): " + String.format("%.2f", area));

        // --- Ejemplo: multiples interfaces ---
        System.out.println("\n--- Ejemplo Completo: Vehiculo ---");
        VehiculoElectricoAuto tesla = new VehiculoElectricoAuto("Tesla", "Model 3");
        tesla.arrancar();   // De Vehiculo
        tesla.acelerar();   // De Vehiculo
        tesla.cargar();     // De Cargable
        tesla.frenar();     // De Frenable
    }
}

// --- Interfaces definidas ---

interface AnimalInterfaz {
    void hacerSonido();  // Metodo abstracto
    void comer();        // Metodo abstracto
}

interface Trabajador {
    void trabajar();
}

interface Cargable {
    void cargar();

    // Metodo default (Java 8+)
    default void mostrarEstado() {
        System.out.println("  Dispositivo cargando...");
    }
}

interface Frenable {
    void frenar();
}

interface Volador {
    void volar();

    // Metodo default
    default void aterrizar() {
        System.out.println("  Aterrizando...");
    }

    default void catapultar() {
        System.out.println("  Catapultando...");
    }
}

interface FiguraGeometrica {
    double calcularArea();

    // Metodo estatico
    static double calcularCirculo(double radio) {
        return Math.PI * radio * radio;
    }

    static double calcularRectangulo(double ancho, double alto) {
        return ancho * alto;
    }
}

// --- Implementaciones ---

class GatoInterfaz implements AnimalInterfaz {
    private String nombre;

    GatoInterfaz(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public void hacerSonido() {
        System.out.println(nombre + " dice: ¡Miau!");
    }

    @Override
    public void comer() {
        System.out.println(nombre + " esta comiendo pescado");
    }
}

class PerroInterfaz implements AnimalInterfaz {
    private String nombre;

    PerroInterfaz(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public void hacerSonido() {
        System.out.println(nombre + " dice: ¡Guau guau!");
    }

    @Override
    public void comer() {
        System.out.println(nombre + " esta comiendo hueso");
    }
}

class Robot implements AnimalInterfaz, Trabajador, Cargable {
    private String nombre;

    Robot(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public void hacerSonido() {
        System.out.println(nombre + " dice: Beep boop");
    }

    @Override
    public void comer() {
        System.out.println(nombre + " no come, usa electricidad");
    }

    @Override
    public void trabajar() {
        System.out.println(nombre + " esta trabajando en la fabrica");
    }

    @Override
    public void cargar() {
        System.out.println(nombre + " se esta cargando");
    }
}

class Pajaro implements Volador, AnimalInterfaz {
    private String nombre;

    Pajaro(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public void hacerSonido() {
        System.out.println(nombre + " dice: ¡Pio pio!");
    }

    @Override
    public void comer() {
        System.out.println(nombre + " esta comiendo semillas");
    }

    @Override
    public void volar() {
        System.out.println(nombre + " esta volando alto");
    }

    public void cantar() {
        System.out.println(nombre + " esta cantando una hermosa cancion");
    }
}

// --- Ejemplo vehiculo con multiples interfaces ---

class VehiculoElectricoAuto implements Cargable, Frenable {
    private String marca;
    private String modelo;

    VehiculoElectricoAuto(String marca, String modelo) {
        this.marca = marca;
        this.modelo = modelo;
    }

    void arrancar() {
        System.out.println(marca + " " + modelo + " arranco");
    }

    void acelerar() {
        System.out.println(marca + " esta acelerando electricamente");
    }

    @Override
    public void cargar() {
        System.out.println(marca + " cargando bateria...");
    }

    @Override
    public void frenar() {
        System.out.println(marca + " frenando con regeneracion");
    }
}
