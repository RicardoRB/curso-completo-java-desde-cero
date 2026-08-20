package com.cursojava.07_poo.herencia;

/**
 * SUPER() Y @Override EN JAVA
 * 
 * super(): llama al constructor o metodos de la clase padre.
 * @Override: indica que un metodo sobrescribe al del padre.
 * 
 * Para ejecutar:
 *   mvn compile exec:java -Dexec.mainClass="com.cursojava.07_poo.herencia.SuperYOverride
 */
public class SuperYOverride {
    public static void main(String[] args) {
        System.out.println("=== SUPER() Y @OVERRIDE ===\n");

        // --- super() en constructores ---
        System.out.println("--- Constructor con super() ---");
        Empleado emp1 = new Empleado("Carlos", 25, "Desarrollador", 3000);
        emp1.mostrarInfo();

        // --- @Override ---
        System.out.println("\n--- @Override (sobrescribir metodos) ---");
        VehiculoHerencia v1 = new VehiculoHerencia("Toyota", "Corolla");
        VehiculoElectrico v2 = new VehiculoElectrico("Tesla", "Model 3", 75);

        v1.arrancar();
        v1.frenar();
        System.out.println();

        v2.arrancar();   // Sobrescrito
        v2.frenar();     // Sobrescrito
        v2.cargarBateria();

        // --- toString sobrescrito ---
        System.out.println("\n--- @Override toString() ---");
        System.out.println("Vehiculo 1: " + v1);
        System.out.println("Vehiculo 2: " + v2);
    }
}

class PersonaSuper {
    protected String nombre;
    protected int edad;

    PersonaSuper(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }

    void mostrarInfo() {
        System.out.println("Nombre: " + nombre + ", Edad: " + edad);
    }

    @Override
    public String toString() {
        return "PersonaSuper{nombre='" + nombre + "', edad=" + edad + "}";
    }
}

class Empleado extends PersonaSuper {
    private String cargo;
    private double salario;

    Empleado(String nombre, int edad, String cargo, double salario) {
        super(nombre, edad);  // Llama al constructor del padre
        this.cargo = cargo;
        this.salario = salario;
    }

    @Override
    void mostrarInfo() {
        super.mostrarInfo();  // Llama al metodo del padre
        System.out.println("Cargo: " + cargo + ", Salario: $" + salario);
    }

    @Override
    public String toString() {
        return "Empleado{nombre='" + nombre + "', cargo='" + cargo + "'}";
    }
}

class VehiculoHerencia {
    protected String marca;
    protected String modelo;

    VehiculoHerencia(String marca, String modelo) {
        this.marca = marca;
        this.modelo = modelo;
    }

    void arrancar() {
        System.out.println(marca + " " + modelo + " arranco");
    }

    void frenar() {
        System.out.println(marca + " " + modelo + " freno");
    }

    @Override
    public String toString() {
        return marca + " " + modelo;
    }
}

class VehiculoElectrico extends VehiculoHerencia {
    private int bateriaKWh;

    VehiculoElectrico(String marca, String modelo, int bateriaKWh) {
        super(marca, modelo);
        this.bateriaKWh = bateriaKWh;
    }

    @Override
    void arrancar() {
        System.out.println(marca + " " + modelo + " arranco silenciosamente (electrico)");
    }

    @Override
    void frenar() {
        System.out.println(marca + " " + modelo + " freno con regeneracion de energia");
    }

    void cargarBateria() {
        System.out.println(marca + " esta cargando (" + bateriaKWh + " kWh)");
    }

    @Override
    public String toString() {
        return marca + " " + modelo + " (Electrico " + bateriaKWh + " kWh)";
    }
}
