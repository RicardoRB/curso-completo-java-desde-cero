package com.cursojava.08_avanzados;

/**
 * ENUM EN JAVA
 * 
 * Un enum (enumeracion) es un tipo de dato especial que define un conjunto
 * de constantes nombradas. Es mas seguro y legible que usar Strings o ints.
 * 
 * - Los valores son constantes y no pueden cambiar.
 * - Pueden tener atributos, constructores y metodos.
 * - Comparar con == (no necesita .equals()).
 * 
 * Para ejecutar:
 *   mvn compile exec:java -Dexec.mainClass="com.cursojava.08_avanzados.EnumJava
 */
public class EnumJava {
    public static void main(String[] args) {
        System.out.println("=== ENUM EN JAVA ===\n");

        // --- Enum basico ---
        System.out.println("--- Enum Basico (DiasSemana) ---");
        DiaSemana dia = DiaSemana.MARTES;
        System.out.println("Hoy es: " + dia);
        System.out.println("Nombre: " + dia.name());
        System.out.println("Ordinal: " + dia.ordinal());
        System.out.println("Es laboral: " + dia.esLaboral());

        // --- Iterar sobre enum ---
        System.out.println("\n--- Todos los dias ---");
        for (DiaSemana d : DiaSemana.values()) {
            System.out.println(d.ordinal() + ": " + d + " - " + (d.esLaboral() ? "Laboral" : "Descanso"));
        }

        // --- Switch con enum ---
        System.out.println("\n--- Switch con Enum ---");
        DiaSemana hoy = DiaSemana.VIERNES;
        switch (hoy) {
            case LUNES:
                System.out.println("Inicio de semana");
                break;
            case MARTES:
            case MIERCOLES:
            case JUEVES:
                System.out.println("Mitad de semana");
                break;
            case VIERNES:
                System.out.println("Viernes! Se acerca el finde");
                break;
            case SABADO:
            case DOMINGO:
                System.out.println("Fin de semana!");
                break;
        }

        // --- Enum con atributos ---
        System.out.println("\n--- Enum con Atributos (Moneda) ---");
        Moneda dollar = Moneda.DOLLAR;
        Moneda euro = Moneda.EURO;

        System.out.println(dollar.getSimbolo() + " " + dollar.getNombre());
        System.out.println(euro.getSimbolo() + " " + euro.getNombre());

        for (Moneda m : Moneda.values()) {
            System.out.println(m.getSimbolo() + " " + m.getNombre() +
                " (tasa: " + m.getTasaCambio() + ")");
        }

        // --- Enum con metodo ---
        System.out.println("\n--- Enum con Metodo (EstadoPedido) ---");
        EstadoPedido estado = EstadoPedido.ENVIADO;
        System.out.println("Estado: " + estado);
        System.out.println("Descripcion: " + estado.getDescripcion());

        // --- Usar enum para validacion ---
        System.out.println("\n--- Enum para Validacion ---");
        String nivelStr = "ADMIN";
        NivelAcceso nivel = NivelAcceso.valueOf(nivelStr);
        System.out.println("Nivel: " + nivel);
        System.out.println("Puede ver admin: " + nivel.puedeVerAdmin());
        System.out.println("Puede editar: " + nivel.puedeEditar());
    }
}

enum DiaSemana {
    LUNES(true),
    MARTES(true),
    MIERCOLES(true),
    JUEVES(true),
    VIERNES(true),
    SABADO(false),
    DOMINGO(false);

    private final boolean laboral;

    DiaSemana(boolean laboral) {
        this.laboral = laboral;
    }

    public boolean esLaboral() {
        return laboral;
    }
}

enum Moneda {
    DOLLAR("Dolar", "$", 1.0),
    EURO("Euro", "\u20AC", 0.85),
    PESO("Peso", "$", 20.15),
    YEN("Yen", "\u00A5", 110.5);

    private final String nombre;
    private final String simbolo;
    private final double tasaCambio;

    Moneda(String nombre, String simbolo, double tasaCambio) {
        this.nombre = nombre;
        this.simbolo = simbolo;
        this.tasaCambio = tasaCambio;
    }

    public String getNombre() { return nombre; }
    public String getSimbolo() { return simbolo; }
    public double getTasaCambio() { return tasaCambio; }
}

enum EstadoPedido {
    RECIBIDO("Pedido recibido y en procesamiento"),
    PREPARANDO("Preparando tu pedido"),
    ENVIADO("Tu pedido esta en camino"),
    ENTREGADO("Pedido entregado exitosamente"),
    CANCELADO("Pedido cancelado");

    private final String descripcion;

    EstadoPedido(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getDescripcion() {
        return descripcion;
    }
}

enum NivelAcceso {
    VISITANTE(false, false),
    USUARIO(true, false),
    EDITOR(true, true),
    ADMIN(true, true);

    private final boolean verAdmin;
    private final boolean editar;

    NivelAcceso(boolean verAdmin, boolean editar) {
        this.verAdmin = verAdmin;
        this.editar = editar;
    }

    public boolean puedeVerAdmin() { return verAdmin; }
    public boolean puedeEditar() { return editar; }
}
