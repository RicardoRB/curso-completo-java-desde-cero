package com.programandoenjava.01_primeros_pasos;

/**
 * SINTAXIS EN JAVA
 * 
 * Java es un lenguaje de tipado estatico, orientado a objetos.
 * Cada sentencia termina con punto y coma (;).
 * Las clases comienzan con mayuscula (PascalCase).
 * Los metodos y variables comienzan con minuscula (camelCase).
 * 
 * Para ejecutar:
 *   mvn compile exec:java -Dexec.mainClass="com.programandoenjava.01_primeros_pasos.SintaxisJava"
 */
public class SintaxisJava {
    public static void main(String[] args) {
        // 1. Declaracion de variables
        String nombre = "Carlos";
        int edad = 25;
        double salario = 3500.50;
        boolean activo = true;

        // 2. Impresion en consola
        System.out.println("Nombre: " + nombre);
        System.out.println("Edad: " + edad);
        System.out.println("Salario: " + salario);
        System.out.println("Activo: " + activo);

        // 3. Sentencias condicionales basicas
        if (edad >= 18) {
            System.out.println(nombre + " es mayor de edad");
        }

        // 4. Bucle basico
        for (int i = 1; i <= 3; i++) {
            System.out.println("Iteracion " + i);
        }

        // 5. Comentarios
        // Esto es un comentario de una linea
        /* Esto es un comentario
           de multiples lineas */
        System.out.println("Fin del ejemplo de sintaxis");
    }
}
