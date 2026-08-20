package com.programandoenjava.08_avanzados;

/**
 * VARIABLES CONSTANTES CON PALABRA CLAVE FINAL
 * 
 * final: una vez asignado, NO puede cambiar su valor.
 * 
 * - final en variable: valor constante.
 * - final en metodo: no puede ser sobrescrito.
 * - final en clase: no puede ser heredada.
 * 
 * Convencion: constantes en MAYUSCULAS_CON_GUIONES.
 * 
 * Para ejecutar:
 *   mvn compile exec:java -Dexec.mainClass="com.programandoenjava.08_avanzados.ConstanesFinal
 */
public class ConstanesFinal {
    // Constantes de clase
    public static final double PI = 3.141592653589793;
    public static final String EMPRESA = "Tech Corp";
    public static final int MAX_USUARIOS = 100;
    public static final String[] DIAS_SEMANA = {"Lunes", "Martes", "Miercoles", "Jueves", "Viernes", "Sabado", "Domingo"};

    public static void main(String[] args) {
        System.out.println("=== VARIABLES CONSTANTES (FINAL) ===\n");

        // --- Constantes de clase ---
        System.out.println("--- Constantes de Clase ---");
        System.out.println("PI = " + PI);
        System.out.println("Empresa: " + EMPRESA);
        System.out.println("Max usuarios: " + MAX_USUARIOS);
        System.out.print("Dias: ");
        for (String dia : DIAS_SEMANA) System.out.print(dia + " ");
        System.out.println();

        // --- Final en variables locales ---
        System.out.println("\n--- Final en Variables Locales ---");
        final int MAX_INTENTOS = 3;
        final String MENSAJE_BIENVENIDA = "Bienvenido al sistema";
        final double IVA = 0.21;

        System.out.println(MENSAJE_BIENVENIDA);
        System.out.println("IVA: " + (IVA * 100) + "%");
        System.out.println("Max intentos: " + MAX_INTENTOS);

        // Intentar cambiar una constante (esto daria error):
        // MAX_INTENTOS = 5;  // ERROR: cannot assign a value to final variable

        // --- Final con objetos (la referencia es constante, el contenido no) ---
        System.out.println("\n--- Final con Objetos ---");
        final int[] numeros = {1, 2, 3, 4, 5};
        numeros[0] = 100;  // OK: el contenido puede cambiar
        System.out.println("numeros[0] = " + numeros[0]);
        // numeros = new int[]{6, 7, 8};  // ERROR: no se puede reasignar la referencia

        // --- Ejemplo Practico ---
        System.out.println("\n--- Ejemplo Practico: Configuracion ---");
        final ConfiguracionApp config = new ConfiguracionApp();
        config.tema = "oscuro";
        config.idioma = "es";

        System.out.println("Tema: " + config.tema);
        System.out.println("Idioma: " + config.idioma);
        config.tema = "claro";  // OK: cambiar campo
        System.out.println("Nuevo tema: " + config.tema);
        // config = new ConfiguracionApp();  // ERROR: referencia final
    }
}

class ConfiguracionApp {
    String tema;
    String idioma;
}
