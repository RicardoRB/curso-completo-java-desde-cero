package com.programandoenjava.01_primeros_pasos;

/**
 * METODO MAIN(String[] args)
 * 
 * El metodo main es el punto de entrada de toda aplicacion Java.
 * Su firma siempre es: public static void main(String[] args)
 * 
 * - public: accesible desde cualquier lugar
 * - static: se puede ejecutar sin crear una instancia de la clase
 * - void: no retorna ningun valor
 * - String[] args: array de Strings que contiene los argumentos de linea de comandos
 * 
 * Para ejecutar con argumentos:
 *   mvn compile exec:java -Dexec.mainClass="com.programandoenjava.01_primeros_pasos.MetodoMain" -Dexec.args="Juan 25"
 */
public class MetodoMain {
    public static void main(String[] args) {
        System.out.println("=== Metodo Main en Java ===");
        System.out.println("Numero de argumentos recibidos: " + args.length);

        if (args.length > 0) {
            System.out.println("Argumentos recibidos:");
            for (int i = 0; i < args.length; i++) {
                System.out.println("  args[" + i + "] = " + args[i]);
            }
        } else {
            System.out.println("No se recibieron argumentos.");
            System.out.println("Para pasar argumentos, ejecuta:");
            System.out.println("  mvn compile exec:java -Dexec.mainClass=\"com.programandoenjava.01_primeros_pasos.MetodoMain\" -Dexec.args=\"Juan 25\"");
        }

        // Ejemplo: usar argumentos
        if (args.length >= 2) {
            String nombre = args[0];
            int edad = Integer.parseInt(args[1]);
            System.out.println("\nHola " + nombre + ", tienes " + edad + " años");
        }
    }
}
