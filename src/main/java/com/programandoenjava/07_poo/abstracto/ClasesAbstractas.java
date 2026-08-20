package com.programandoenjava.07_poo.abstracto;

/**
 * CLASES Y METODOS ABSTRACTOS EN JAVA
 * 
 * Clase abstracta: no puede instanciarse directamente. Sirve como plantilla.
 * Metodo abstracto: no tiene cuerpo, las subclases DEBEN implementarlo.
 * 
 * - Una clase abstracta puede tener metodos concretos (con cuerpo).
 * - Una clase abstracta puede tener atributos normales.
 * - Una clase hija DEBE implementar todos los metodos abstractos.
 * 
 * Para ejecutar:
 *   mvn compile exec:java -Dexec.mainClass="com.programandoenjava.07_poo.abstracto.ClasesAbstractas
 */
public class ClasesAbstractas {
    public static void main(String[] args) {
        System.out.println("=== CLASES Y METODOS ABSTRACTOS ===\n");

        // No se puede instanciar una clase abstracta:
        // Figura f = new Figura();  // ERROR: Figura is abstract

        // Se instancian las clases hijas
        System.out.println("--- Creando Figuras Concretas ---");
        Figura circulo = new CirculoAbstract(5);
        Figura rectangulo = new RectanguloAbstract(4, 6);
        Figura triangulo = new TrianguloAbstract(3, 4);

        // Polimorfismo con clase abstracta
        System.out.println("\n--- Polimorfismo con Clases Abstractas ---");
        Figura[] figuras = {circulo, rectangulo, triangulo};

        for (Figura f : figuras) {
            System.out.println(f.getNombre() +
                " -> Area: " + String.format("%.2f", f.calcularArea()) +
                ", Perimetro: " + String.format("%.2f", f.calcularPerimetro()));
        }

        // Metodo concreto de la clase abstracta
        System.out.println("\n--- Metodo Concreto de Clase Abstracta ---");
        for (Figura f : figuras) {
            System.out.println(f.getNombre() + ": " + f.descripcion());
        }

        // Ejemplo: forma abstracta con implementacion parcial
        System.out.println("\n--- Implementacion Parcial ---");
        Forma forma1 = new CirculoAbstract(7);
        Forma forma2 = new RectanguloAbstract(5, 3);

        System.out.println(forma1.toString());
        System.out.println(forma2.toString());
    }
}

/**
 * Clase abstracta: define el contrato que todas las figuras deben cumplir.
 */
abstract class Forma {
    protected String nombre;

    Forma(String nombre) {
        this.nombre = nombre;
    }

    String getNombre() { return nombre; }

    // Metodo abstracto: cada figura calcula su area de forma diferente
    abstract double calcularArea();

    // Metodo abstracto: cada figura calcula su perimetro de forma diferente
    abstract double calcularPerimetro();

    // Metodo concreto: implementado en la clase abstracta
    @Override
    public String toString() {
        return getNombre() + " [area=" + String.format("%.2f", calcularArea()) + "]";
    }
}

/**
 * Clase abstracta intermedia: Figura
 * Agrega un metodo concreto que usan todas las figuras.
 */
abstract class Figura extends Forma {
    Figura(String nombre) {
        super(nombre);
    }

    // Metodo concreto: todas las figuras pueden describirse
    String descripcion() {
        return getNombre() + ": area=" + String.format("%.2f", calcularArea()) +
            ", perimetro=" + String.format("%.2f", calcularPerimetro());
    }
}

class CirculoAbstract extends Figura {
    private double radio;

    CirculoAbstract(double radio) {
        super("Circulo");
        this.radio = radio;
    }

    @Override
    double calcularArea() {
        return Math.PI * radio * radio;
    }

    @Override
    double calcularPerimetro() {
        return 2 * Math.PI * radio;
    }
}

class RectanguloAbstract extends Figura {
    private double ancho;
    private double alto;

    RectanguloAbstract(double ancho, double alto) {
        super("Rectangulo");
        this.ancho = ancho;
        this.alto = alto;
    }

    @Override
    double calcularArea() {
        return ancho * alto;
    }

    @Override
    double calcularPerimetro() {
        return 2 * (ancho + alto);
    }
}

class TrianguloAbstract extends Figura {
    private double base;
    private double altura;

    TrianguloAbstract(double base, double altura) {
        super("Triangulo");
        this.base = base;
        this.altura = altura;
    }

    @Override
    double calcularArea() {
        return (base * altura) / 2;
    }

    @Override
    double calcularPerimetro() {
        return base * 3;  // Equilatero para simplificar
    }
}
