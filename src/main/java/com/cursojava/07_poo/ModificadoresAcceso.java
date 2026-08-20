package com.cursojava.07_poo;

/**
 * MODIFICADORES DE ACCESO: PUBLIC, PRIVATE, PROTECTED
 * 
 * public:    accesible desde cualquier lugar.
 * private:   accesible solo dentro de la misma clase.
 * protected: accesible dentro del mismo paquete y en subclases.
 * (default): sin modificador, accesible solo dentro del mismo paquete.
 * 
 * Para ejecutar:
 *   mvn compile exec:java -Dexec.mainClass="com.cursojava.07_poo.ModificadoresAcceso"
 */
public class ModificadoresAcceso {
    public static void main(String[] args) {
        System.out.println("=== MODIFICADORES DE ACCESO ===\n");

        System.out.println("--- Public: accesible desde cualquier lugar ---");
        PersonaAcceso persona = new PersonaAcceso();
        persona.nombre = "Carlos";      // public: OK
        persona.setEdad(25);             // public (metodo): OK
        System.out.println("Nombre: " + persona.nombre);
        System.out.println("Edad: " + persona.getEdad());

        System.out.println("\n--- Private: solo accesible dentro de la clase ---");
        // persona.edad = 30;  // ERROR: 'edad' es privado
        // persona.password = "123";  // ERROR: es privado
        persona.setPassword("miPassword123");
        System.out.println("Password (via getter): " + persona.getPassword());

        System.out.println("\n--- Protected: accesible en subclases y mismo paquete ---");
        PersonaAdmin admin = new PersonaAdmin("Admin", 30, "admin@email.com");
        admin.mostrarInfo();
        // admin.email es protected, accesible en la misma clase/mismo paquete
    }
}

class PersonaAcceso {
    public String nombre;       // public: accesible desde cualquier lugar
    private int edad;           // private: solo dentro de esta clase
    private String password;    // private
    protected String email;     // protected: misma clase + subclases + mismo paquete

    // Metodo public para acceder a atributo privado (getter)
    public int getEdad() {
        return edad;
    }

    // Metodo public para modificar atributo privado (setter)
    public void setEdad(int edad) {
        if (edad > 0 && edad < 150) {
            this.edad = edad;
        }
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getPassword() {
        // En produccion, aqui iria logica de encriptacion
        return password;
    }

    // Metodo privado: solo esta clase puede llamarlo
    private String encriptar(String texto) {
        return "ENCRIPTADO:" + texto;
    }

    public void guardarPassword(String pass) {
        this.password = encriptar(pass);  // OK: metodo privado se llama desde la misma clase
    }
}

class PersonaAdmin extends PersonaAcceso {
    private String rol;

    PersonaAdmin(String nombre, int edad, String email) {
        this.nombre = nombre;
        setEdad(edad);  // Usar el metodo public (no se puede acceder directamente a private)
        this.email = email;  // protected: accesible en subclase
        this.rol = "Administrador";
    }

    void mostrarInfo() {
        // public: OK
        // private: NO accedido directamente (usamos getters)
        // protected: OK (heredado)
        System.out.println("Nombre: " + nombre + " (public)");
        System.out.println("Edad: " + getEdad() + " (via getter de private)");
        System.out.println("Email: " + email + " (protected)");
        System.out.println("Rol: " + rol);
    }
}
