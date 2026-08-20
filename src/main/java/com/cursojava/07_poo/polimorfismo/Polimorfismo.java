package com.cursojava.07_poo.polimorfismo;

/**
 * POLIMORFISMO Y SOBRESCRITURA DE METODOS
 * 
 * Polimorfismo: un mismo metodo puede comportarse de diferentes formas
 * dependiendo del tipo de objeto que lo invoque.
 * 
 * - Polimorfismo de subtipo: un objeto hijo se trata como su padre.
 * - Se usa la referencia del tipo padre, pero el objeto es del hijo.
 * - El metodo que se ejecuta es el del objeto REAL (el hijo).
 * 
 * Para ejecutar:
 *   mvn compile exec:java -Dexec.mainClass="com.cursojava.07_poo.polimorfismo.Polimorfismo
 */
public class Polimorfismo {
    public static void main(String[] args) {
        System.out.println("=== POLIMORFISMO ===\n");

        // --- Referencia padre, objeto hijo ---
        System.out.println("--- Polimorfismo con Referencia Padre ---");
        Forma circulo = new Circulo(5);
        Forma rectangulo = new Rectangulo(4, 6);
        Forma triangulo = new Triangulo(3, 4);

        System.out.println("Circulo area: " + circulo.calcularArea());
        System.out.println("Rectangulo area: " + rectangulo.calcularArea());
        System.out.println("Triangulo area: " + triangulo.calcularArea());

        // --- Array polimorfico ---
        System.out.println("\n--- Array de Formas (polimorfico) ---");
        Forma[] formas = {
            new Circulo(3),
            new Rectangulo(5, 2),
            new Triangulo(6, 4),
            new Circulo(7)
        };

        for (Forma f : formas) {
            System.out.println(f.getNombre() + ": area = " + f.calcularArea());
        }

        // --- Metodo que acepta tipo padre (recibe hijos) ---
        System.out.println("\n--- Metodo generico con Polimorfismo ---");
        mostrarDetalles(new Circulo(5));
        mostrarDetalles(new Rectangulo(3, 7));
        mostrarDetalles(new Triangulo(8, 5));

        // --- instanceof ---
        System.out.println("\n--- Verificar tipo con instanceof ---");
        for (Forma f : formas) {
            if (f instanceof Circulo) {
                System.out.println(f.getNombre() + " es un Circulo (radio: " + ((Circulo) f).getRadio() + ")");
            } else if (f instanceof Rectangulo) {
                System.out.println(f.getNombre() + " es un Rectangulo");
            } else if (f instanceof Triangulo) {
                System.out.println(f.getNombre() + " es un Triangulo");
            }
        }
    }

    static void mostrarDetalles(Forma forma) {
        System.out.println(forma.getNombre() + " -> area: " + forma.calcularArea() +
            ", perimetro: " + forma.calcularPerimetro());
    }
}

// Clase padre abstracta
abstract class Forma {
    protected String nombre;

    Forma(String nombre) {
        this.nombre = nombre;
    }

    String getNombre() { return nombre; }

    abstract double calcularArea();
    abstract double calcularPerimetro();
}

class Circulo extends Forma {
    private double radio;

    Circulo(double radio) {
        super("Circulo");
        this.radio = radio;
    }

    double getRadio() { return radio; }

    @Override
    double calcularArea() {
        return Math.PI * radio * radio;
    }

    @Override
    double calcularPerimetro() {
        return 2 * Math.PI * radio;
    }
}

class Rectangulo extends Forma {
    private double ancho;
    private double alto;

    Rectangulo(double ancho, double alto) {
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

class Triangulo extends Forma {
    private double base;
    private double altura;

    Triangulo(double base, double altura) {
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
        // Asumiendo triangulo equilatero para simplificar
        return base * 3;
    }
}
