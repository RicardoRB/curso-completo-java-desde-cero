package com.cursojava.07_poo;

/**
 * ENCAPSULACION: GETTERS Y SETTERS
 * 
 * La encapsulacion oculta los datos internos de un objeto y solo permite
 * acceder a traves de metodos publicos (getters y setters).
 * 
 * Beneficios:
 * - Protege la integridad de los datos.
 * - Permite validaciones al modificar.
 * - Facilita el mantenimiento del codigo.
 * 
 * Para ejecutar:
 *   mvn compile exec:java -Dexec.mainClass="com.cursojava.07_poo.Encapsulacion
 */
public class Encapsulacion {
    public static void main(String[] args) {
        System.out.println("=== ENCAPSULACION: GETTERS Y SETTERS ===\n");

        // --- Crear cuenta bancaria ---
        System.out.println("--- Creando Cuenta Bancaria ---");
        CuentaBancariaEnc cuenta = new CuentaBancariaEnc("Juan Perez", 1000);
        cuenta.mostrarInfo();

        // --- Usar setters con validaciones ---
        System.out.println("\n--- Usando Setters con Validaciones ---");
        cuenta.depositar(500);
        cuenta.mostrarInfo();

        cuenta.retirar(200);
        cuenta.mostrarInfo();

        // Intentar retirar mas de lo que hay
        System.out.println("\nIntentando retirar $2000 (no hay suficiente):");
        cuenta.retirar(2000);
        cuenta.mostrarInfo();

        // Intentar depositar cantidad negativa
        System.out.println("\nIntentando depositar -$100:");
        cuenta.depositar(-100);

        // --- Usar getters ---
        System.out.println("\n--- Usando Getters ---");
        System.out.println("Titular: " + cuenta.getTitular());
        System.out.println("Balance: $" + cuenta.getBalance());
        System.out.println("Numero Cuenta: " + cuenta.getNumeroCuenta());

        // --- Ejemplo: Persona encapsulada ---
        System.out.println("\n--- Persona Encapsulada ---");
        PersonaEnc persona = new PersonaEnc();
        persona.setNombre("Maria Garcia");
        persona.setEdad(28);
        persona.setEmail("maria@email.com");

        System.out.println("Nombre: " + persona.getNombre());
        System.out.println("Edad: " + persona.getEdad());
        System.out.println("Email: " + persona.getEmail());
        System.out.println("Mayor de edad: " + persona.esMayorDeEdad());

        // Intentar edad invalida
        System.out.println("\nIntentando edad -5:");
        persona.setEdad(-5);
        System.out.println("Edad (no cambio): " + persona.getEdad());
    }
}

class CuentaBancariaEnc {
    private String titular;
    private double balance;
    private String numeroCuenta;

    public CuentaBancariaEnc(String titular, double balanceInicial) {
        this.titular = titular;
        this.balance = Math.max(0, balanceInicial);
        this.numeroCuenta = "CUENTA-" + (int)(Math.random() * 100000);
    }

    // Getters
    public String getTitular() { return titular; }
    public double getBalance() { return balance; }
    public String getNumeroCuenta() { return numeroCuenta; }

    // Metodos con logica de negocio
    public void depositar(double cantidad) {
        if (cantidad > 0) {
            balance += cantidad;
            System.out.println("Deposito de $" + cantidad + " exitoso");
        } else {
            System.out.println("Error: La cantidad debe ser positiva");
        }
    }

    public void retirar(double cantidad) {
        if (cantidad > 0 && cantidad <= balance) {
            balance -= cantidad;
            System.out.println("Retiro de $" + cantidad + " exitoso");
        } else if (cantidad > balance) {
            System.out.println("Error: Fondos insuficientes");
        } else {
            System.out.println("Error: La cantidad debe ser positiva");
        }
    }

    public void mostrarInfo() {
        System.out.println("Cuenta: " + numeroCuenta + " | Titular: " + titular + " | Balance: $" + balance);
    }
}

class PersonaEnc {
    private String nombre;
    private int edad;
    private String email;

    public String getNombre() { return nombre; }
    public void setNombre(String nombre) {
        if (nombre != null && !nombre.trim().isEmpty()) {
            this.nombre = nombre;
        }
    }

    public int getEdad() { return edad; }
    public void setEdad(int edad) {
        if (edad >= 0 && edad <= 150) {
            this.edad = edad;
        } else {
            System.out.println("Edad invalida. Debe ser entre 0 y 150.");
        }
    }

    public String getEmail() { return email; }
    public void setEmail(String email) {
        if (email != null && email.contains("@")) {
            this.email = email;
        } else {
            System.out.println("Email invalido.");
        }
    }

    public boolean esMayorDeEdad() {
        return edad >= 18;
    }
}
