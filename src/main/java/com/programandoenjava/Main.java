package com.programandoenjava;

import com.programandoenjava.01_primeros_pasos.HolaMundo;
import com.programandoenjava.02_variables.VariablesYT;
import com.programandoenjava.03_operadores.OperadoresAritmeticos;
import com.programandoenjava.04_condiciones.CondicionesIfElse;
import com.programandoenjava.05_bucles.BucleFor;
import com.programandoenjava.06_arrays.ArraysBasicos;
import com.programandoenjava.07_poo.ClasesYObjetos;
import com.programandoenjava.08_avanzados.ArrayListJava;

/**
 * MENU PRINCIPAL DEL CURSO DE JAVA
 * 
 * Este programa muestra un menu para ejecutar los diferentes temas del curso.
 * 
 * Basado en:
 *   https://www.codeja.dev/courses/curso-de-java-introduccion-a-la-programacion-java
 *   https://www.youtube.com/watch?v=oz9wPzx6-ew
 * 
 * Para ejecutar:
 *   mvn compile exec:java -Dexec.mainClass="com.programandoenjava.Main"
 */
public class Main {
    public static void main(String[] args) {
        System.out.println("╔══════════════════════════════════════════════════╗");
        System.out.println("║     CURSO DE JAVA - Introduccion a la          ║");
        System.out.println("║     Programacion con Java                      ║");
        System.out.println("║                                                  ║");
        System.out.println("║  Basado en: https://www.codeja.dev              ║");
        System.out.println("║  Video: https://www.youtube.com/watch?v=oz9wPzx6-ew ║");
        System.out.println("╚══════════════════════════════════════════════════╝");
        System.out.println();

        String[] temas = {
            "01. Primeros Pasos (Hola Mundo, Sintaxis, Main)",
            "02. Variables y Tipos de Datos",
            "03. Operadores (Aritmeticos y Logicos)",
            "04. Condiciones (if/else, switch)",
            "05. Bucles (while, do-while, for, break/continue)",
            "06. Arrays (basicos, con for, multidimensionales)",
            "07. Programacion Orientada a Objetos",
            "08. Conceptos Avanzados (final, Enum, Exception, Threads)"
        };

        System.out.println("TEMAS DISPONIBLES:");
        System.out.println("─".repeat(50));
        for (String tema : temas) {
            System.out.println("  " + tema);
        }
        System.out.println("─".repeat(50));
        System.out.println();

        System.out.println("INSTRUCCIONES:");
        System.out.println("Para ejecutar cada tema individualmente, usa:");
        System.out.println("  mvn compile exec:java -Dexec.mainClass=\"com.programandoenjava.<paquete>.<Clase>\"");
        System.out.println();
        System.out.println("Ejemplos de ejecucion:");
        System.out.println("  mvn compile exec:java -Dexec.mainClass=\"com.programandoenjava.01_primeros_pasos.HolaMundo\"");
        System.out.println("  mvn compile exec:java -Dexec.mainClass=\"com.programandoenjava.02_variables.VariablesYT\"");
        System.out.println("  mvn compile exec:java -Dexec.mainClass=\"com.programandoenjava.07_poo.ClasesYObjetos\"");
        System.out.println();
        System.out.println("Para ejecutar desde Eclipse:");
        System.out.println("  1. Clic derecho en el archivo Java");
        System.out.println("  2. Run As -> Java Application");
        System.out.println();
        System.out.println("¡Empieza a aprender Java ahora! 💻");
    }
}
