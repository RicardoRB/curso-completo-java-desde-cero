package com.cursojava.07_poo;

/**
 * CONSTRUCTORES EN JAVA
 * 
 * Un constructor es un metodo especial que se ejecuta al crear un objeto.
 * Tiene el mismo nombre que la clase y NO tiene tipo de retorno.
 * 
 * - Constructor por defecto: Java lo crea automaticamente si no defines ninguno.
 * - Constructor con parametros: permite inicializar atributos al crear el objeto.
 * - Constructor sobrecargado: puedes tener multiples constructores con diferentes parametros.
 * 
 * Para ejecutar:
 *   mvn compile exec:java -Dexec.mainClass="com.cursojava.07_poo.Constructores"
 */
public class Constructores {
    public static void main(String[] args) {
        System.out.println("=== CONSTRUCTORES ===\n");

        // --- Constructor vacio ---
        System.out.println("--- Constructor Vacio ---");
        Vehiculo v1 = new Vehiculo();
        v1.mostrarInfo();

        // --- Constructor con parametros ---
        System.out.println("\n--- Constructor con Parametros ---");
        Vehiculo v2 = new Vehiculo("Toyota", "Corolla", 2023);
        v2.mostrarInfo();

        // --- Constructor sobrecargado ---
        System.out.println("\n--- Constructores Sobrecargados ---");
        Estudiante e1 = new Estudiante("Carlos");
        Estudiante e2 = new Estudiante("Maria", 22);
        Estudiante e3 = new Estudiante("Pedro", 20, "Ingenieria");

        e1.mostrarInfo();
        e2.mostrarInfo();
        e3.mostrarInfo();

        // --- Constructor con validaciones ---
        System.out.println("\n--- Constructor con Validaciones ---");
        CuentaBancaria cuenta1 = new CuentaBancaria("Juan", 1000);
        CuentaBancaria cuenta2 = new CuentaBancaria("Ana", -500); // Balance negativo

        cuenta1.mostrarInfo();
        cuenta2.mostrarInfo();
    }
}

class Vehiculo {
    String marca;
    String modelo;
    int anio;
    boolean encendido;

    // Constructor vacio
    Vehiculo() {
        marca = "Desconocida";
        modelo = "Desconocido";
        anio = 2024;
        encendido = false;
        System.out.println("Vehiculo creado con constructor vacio");
    }

    // Constructor con parametros
    Vehiculo(String marca, String modelo, int anio) {
        this.marca = marca;
        this.modelo = modelo;
        this.anio = anio;
        this.encendido = false;
        System.out.println("Vehiculo " + marca + " " + modelo + " creado");
    }

    void mostrarInfo() {
        System.out.println(marca + " " + modelo + " (" + anio + ") - " +
            (encendido ? "Encendido" : "Apagado"));
    }
}

class Estudiante {
    String nombre;
    int edad;
    String carrera;

    // Constructor con 1 parametro
    Estudiante(String nombre) {
        this.nombre = nombre;
        this.edad = 18;
        this.carrera = "No asignada";
    }

    // Constructor con 2 parametros
    Estudiante(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
        this.carrera = "No asignada";
    }

    // Constructor con 3 parametros
    Estudiante(String nombre, int edad, String carrera) {
        this.nombre = nombre;
        this.edad = edad;
        this.carrera = carrera;
    }

    void mostrarInfo() {
        System.out.println(nombre + ", " + edad + " años, Carrera: " + carrera);
    }
}

class CuentaBancaria {
    String titular;
    double balance;

    // Constructor con validacion
    CuentaBancaria(String titular, double balanceInicial) {
        this.titular = titular;
        if (balanceInicial >= 0) {
            this.balance = balanceInicial;
        } else {
            System.out.println("Error: Balance inicial no puede ser negativo. Se establece en 0.");
            this.balance = 0;
        }
    }

    void mostrarInfo() {
        System.out.println("Cuenta de " + titular + ": $" + balance);
    }
}
