package com.cursojava.08_avanzados.threads;

/**
 * THREADS EN JAVA
 * 
 * Un Thread (hilo) permite ejecutar codigo en paralelo.
 * Java es multihilo por defecto: el hilo principal (main) siempre se ejecuta.
 * 
 * Formas de crear threads:
 * 1. Extender Thread.
 * 2. Implementar Runnable.
 * 
 * Para ejecutar:
 *   mvn compile exec:java -Dexec.mainClass="com.cursojava.08_avanzados.threads.ThreadsBasico
 */
public class ThreadsBasico {
    public static void main(String[] args) {
        System.out.println("=== THREADS EN JAVA ===\n");

        // --- Thread basico extendiendo Thread ---
        System.out.println("--- 1. Extendiendo Thread ---");
        MiThread t1 = new MiThread("Hilo-A");
        MiThread t2 = new MiThread("Hilo-B");

        t1.start();  // start() inicia el hilo (NO run())
        t2.start();

        try {
            t1.join();  // Esperar a que termine t1
            t2.join();  // Esperar a que termine t2
        } catch (InterruptedException e) {
            System.out.println("Hilo interrumpido");
        }

        System.out.println("Hilos terminados\n");

        // --- Thread con Runnable ---
        System.out.println("--- 2. Implementando Runnable ---");
        Runnable tarea1 = new MiTarea("Tarea-1");
        Runnable tarea2 = new MiTarea("Tarea-2");

        Thread hilo1 = new Thread(tarea1);
        Thread hilo2 = new Thread(tarea2);

        hilo1.start();
        hilo2.start();

        try {
            hilo1.join();
            hilo2.join();
        } catch (InterruptedException e) {
            System.out.println("Hilo interrumpido");
        }

        System.out.println("Tareas terminadas\n");

        // --- Lambda Runnable (Java 8+) ---
        System.out.println("--- 3. Lambda Runnable ---");
        Thread hiloLambda = new Thread(() -> {
            System.out.println("[" + Thread.currentThread().getName() + "] Ejecutando con lambda");
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
            System.out.println("[" + Thread.currentThread().getName() + "] Terminado");
        });

        hiloLambda.start();
        try {
            hiloLambda.join();
        } catch (InterruptedException e) {
            System.out.println("Hilo interrumpido");
        }

        // --- Sincronizacion basica ---
        System.out.println("\n--- 4. Sincronizacion ---");
        ContadorSincronizado contador = new ContadorSincronizado();

        Runnable incrementar = () -> {
            for (int i = 0; i < 1000; i++) {
                contador.incrementar();
            }
        };

        Thread hiloA = new Thread(incrementar);
        Thread hiloB = new Thread(incrementar);

        hiloA.start();
        hiloB.start();

        try {
            hiloA.join();
            hiloB.join();
        } catch (InterruptedException e) {
            System.out.println("Hilo interrumpido");
        }

        System.out.println("Contador final (deberia ser 2000): " + contador.getContador());

        // --- Informacion del hilo ---
        System.out.println("\n--- Informacion del Hilo Principal ---");
        Thread principal = Thread.currentThread();
        System.out.println("Nombre: " + principal.getName());
        System.out.println("ID: " + principal.getId());
        System.out.println("Prioridad: " + principal.getPriority());
        System.out.println("Estado: " + principal.getState());
        System.out.println("Es vivo: " + principal.isAlive());
    }
}

// Forma 1: Extender Thread
class MiThread extends Thread {
    private String nombre;

    MiThread(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public void run() {
        for (int i = 1; i <= 5; i++) {
            System.out.println("[" + nombre + "] Iteracion " + i);
            try {
                Thread.sleep(200);  // Pausar 200ms
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
                return;
            }
        }
        System.out.println("[" + nombre + "] Terminado");
    }
}

// Forma 2: Implementar Runnable
class MiTarea implements Runnable {
    private String nombre;

    MiTarea(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public void run() {
        for (int i = 1; i <= 5; i++) {
            System.out.println("[" + nombre + "] Paso " + i);
            try {
                Thread.sleep(200);
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
                return;
            }
        }
        System.out.println("[" + nombre + "] Completado");
    }
}

// Contador con sincronizacion
class ContadorSincronizado {
    private int contador = 0;

    synchronized void incrementar() {
        contador++;
    }

    int getContador() {
        return contador;
    }
}
