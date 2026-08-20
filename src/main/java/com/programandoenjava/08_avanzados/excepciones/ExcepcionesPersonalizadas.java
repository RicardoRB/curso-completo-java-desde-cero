package com.programandoenjava.08_avanzados.excepciones;

/**
 * EXCEPCIONES PERSONALIZADAS Y THROW
 * 
 * Puedes crear tus propias excepciones extendiendo Exception o RuntimeException.
 * La palabra clave "throw" lanza una excepcion manualmente.
 * 
 * Para ejecutar:
 *   mvn compile exec:java -Dexec.mainClass="com.programandoenjava.08_avanzados.excepciones.ExcepcionesPersonalizadas
 */
public class ExcepcionesPersonalizadas {
    public static void main(String[] args) {
        System.out.println("=== EXCEPCIONES PERSONALIZADAS Y THROW ===\n");

        // --- Excepcion personalizada ---
        System.out.println("--- Excepcion: EdadInvalidaException ---");
        try {
            PersonaExcepcion persona1 = new PersonaExcepcion("Carlos", 25);
            System.out.println("Creada: " + persona1);

            PersonaExcepcion persona2 = new PersonaExcepcion("Maria", -5);
            System.out.println("Creada: " + persona2);
        } catch (EdadInvalidaException e) {
            System.out.println("Error: " + e.getMessage());
        }

        // --- Excepcion: SaldoInsuficienteException ---
        System.out.println("\n--- Excepcion: SaldoInsuficienteException ---");
        CuentaExcepcion cuenta = new CuentaExcepcion("Juan", 1000);
        cuenta.mostrarSaldo();

        try {
            cuenta.retirar(500);
            System.out.println("Retiro de $500 exitoso");
            cuenta.mostrarSaldo();

            cuenta.retirar(800);
        } catch (SaldoInsuficienteException e) {
            System.out.println("Error: " + e.getMessage());
            System.out.println("Saldo actual: $" + cuenta.getSaldo());
        }

        // --- throw con validaciones ---
        System.out.println("\n--- throw con Validaciones ---");
        try {
            validarEdad(200);
        } catch (EdadInvalidaException e) {
            System.out.println("Error de validacion: " + e.getMessage());
        }

        try {
            validarEdad(25);
            System.out.println("Edad 25: VALIDA");
        } catch (EdadInvalidaException e) {
            System.out.println("Error: " + e.getMessage());
        }

        // --- Ejemplo completo: Registro de usuario ---
        System.out.println("\n--- Registro de Usuario ---");
        String[] emails = {"usuario@email.com", "", "admin@", "valido@email.com"};
        for (String email : emails) {
            try {
                registrarUsuario("Usuario", email);
            } catch (DatoInvalidoException e) {
                System.out.println("Registro fallido (" + email + "): " + e.getMessage());
            }
        }
    }

    static void validarEdad(int edad) throws EdadInvalidaException {
        if (edad < 0 || edad > 150) {
            throw new EdadInvalidaException("La edad " + edad + " no es valida (debe ser 0-150)");
        }
    }

    static void registrarUsuario(String nombre, String email) throws DatoInvalidoException {
        if (nombre == null || nombre.trim().isEmpty()) {
            throw new DatoInvalidoException("El nombre no puede estar vacio");
        }
        if (email == null || email.trim().isEmpty()) {
            throw new DatoInvalidoException("El email no puede estar vacio");
        }
        if (!email.contains("@")) {
            throw new DatoInvalidoException("El email no es valido: " + email);
        }
        System.out.println("Usuario registrado: " + nombre + " (" + email + ")");
    }
}

// Excepcion personalizada checked
class EdadInvalidaException extends Exception {
    public EdadInvalidaException(String mensaje) {
        super(mensaje);
    }
}

// Otra excepcion personalizada checked
class SaldoInsuficienteException extends Exception {
    public SaldoInsuficienteException(String mensaje) {
        super(mensaje);
    }
}

// Excepcion personalizada unchecked (RuntimeException)
class DatoInvalidoException extends RuntimeException {
    public DatoInvalidoException(String mensaje) {
        super(mensaje);
    }
}

class PersonaExcepcion {
    private String nombre;
    private int edad;

    PersonaExcepcion(String nombre, int edad) throws EdadInvalidaException {
        if (edad < 0 || edad > 150) {
            throw new EdadInvalidaException("Edad invalida: " + edad);
        }
        this.nombre = nombre;
        this.edad = edad;
    }

    @Override
    public String toString() {
        return nombre + " (" + edad + " años)";
    }
}

class CuentaExcepcion {
    private String titular;
    private double saldo;

    CuentaExcepcion(String titular, double saldoInicial) {
        this.titular = titular;
        this.saldo = Math.max(0, saldoInicial);
    }

    double getSaldo() { return saldo; }

    void mostrarSaldo() {
        System.out.println("Titular: " + titular + " | Saldo: $" + saldo);
    }

    void retirar(double cantidad) throws SaldoInsuficienteException {
        if (cantidad > saldo) {
            throw new SaldoInsuficienteException(
                "Saldo insuficiente: tiene $" + saldo + ", intento retirar $" + cantidad);
        }
        saldo -= cantidad;
    }
}
