package com.programandoenjava.08_avanzados.generics;

import java.util.ArrayList;

/**
 * GENERICOS EN JAVA
 * 
 * Los genericos permiten crear clases y metodos que trabajan con cualquier tipo
 * de dato, manteniendo la seguridad de tipos en tiempo de compilacion.
 * 
 * Se usan con <> despues del nombre de la clase/metodo.
 * Convencion: T (Type), E (Element), K (Key), V (Value).
 * 
 * Para ejecutar:
 *   mvn compile exec:java -Dexec.mainClass="com.programandoenjava.08_avanzados.generics.CajaGenerica
 */
public class CajaGenerica {
    public static void main(String[] args) {
        System.out.println("=== GENERICOS EN JAVA ===\n");

        // --- Caja de Strings ---
        System.out.println("--- Caja<String> ---");
        Caja<String> cajaTexto = new Caja<>();
        cajaTexto.setElemento("Hola Mundo");
        System.out.println("Contenido: " + cajaTexto.getElemento());
        System.out.println("Tipo: " + cajaTexto.getTipo());

        // --- Caja de enteros ---
        System.out.println("\n--- Caja<Integer> ---");
        Caja<Integer> cajaNumero = new Caja<>();
        cajaNumero.setElemento(42);
        System.out.println("Contenido: " + cajaNumero.getElemento());
        System.out.println("Tipo: " + cajaNumero.getTipo());

        // --- Caja de decimales ---
        System.out.println("\n--- Caja<Double> ---");
        Caja<Double> cajaDecimal = new Caja<>();
        cajaDecimal.setElemento(3.14);
        System.out.println("Contenido: " + cajaDecimal.getElemento());

        // --- Par generico ---
        System.out.println("\n--- Par<K,V> (como un diccionario) ---");
        Par<String, Integer> edadCarlos = new Par<>("Carlos", 25);
        Par<String, Integer> edadMaria = new Par<>("Maria", 30);
        System.out.println(edadCarlos);
        System.out.println(edadMaria);

        // --- Lista generica ---
        System.out.println("\n--- ListaGenerica<T> ---");
        ListaGenerica<String> listaStr = new ListaGenerica<>();
        listaStr.agregar("Java");
        listaStr.agregar("Python");
        listaStr.agregar("JavaScript");
        System.out.println("Lista de strings: " + listaStr);

        ListaGenerica<Integer> listaNum = new ListaGenerica<>();
        listaNum.agregar(10);
        listaNum.agregar(20);
        listaNum.agregar(30);
        System.out.println("Lista de enteros: " + listaNum);

        // --- Metodo generico ---
        System.out.println("\n--- Metodos genericos ---");
        System.out.println("max(5, 10) = " + maximo(5, 10));
        System.out.println("max(3.14, 2.71) = " + maximo(3.14, 2.71));
        System.out.println("max(\"Banana\", \"Apple\") = " + maximo("Banana", "Apple"));
    }

    // Metodo generico
    static <T extends Comparable<T>> T maximo(T a, T b) {
        return a.compareTo(b) >= 0 ? a : b;
    }
}

// Clase generica
class Caja<T> {
    private T elemento;

    public void setElemento(T elemento) {
        this.elemento = elemento;
    }

    public T getElemento() {
        return elemento;
    }

    public String getTipo() {
        return elemento.getClass().getSimpleName();
    }
}

// Par de valores genericos
class Par<K, V> {
    private K clave;
    private V valor;

    Par(K clave, V valor) {
        this.clave = clave;
        this.valor = valor;
    }

    public K getClave() { return clave; }
    public V getValor() { return valor; }

    @Override
    public String toString() {
        return clave + " -> " + valor;
    }
}

// Lista generica simple
class ListaGenerica<T> {
    private ArrayList<T> elementos = new ArrayList<>();

    public void agregar(T elemento) {
        elementos.add(elemento);
    }

    public T obtener(int indice) {
        return elementos.get(indice);
    }

    public int tamano() {
        return elementos.size();
    }

    @Override
    public String toString() {
        return elementos.toString();
    }
}
