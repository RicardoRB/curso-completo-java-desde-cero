# Curso de Java - Introduccion a la Programacion

> Aprende Java desde cero con ejemplos ejecutables y explicaciones detalladas en cada archivo.

Basado en el curso: [https://www.codeja.dev/courses/curso-de-java-introduccion-a-la-programacion-java](https://www.codeja.dev/courses/curso-de-java-introduccion-a-la-programacion-java)

Video: [https://www.youtube.com/watch?v=oz9wPzx6-ew](https://www.youtube.com/watch?v=oz9wPzx6-ew)

---

## Requisitos Previos

- **Java 21** o superior ([descargar](https://www.oracle.com/java/technologies/downloads/))
- **Maven** ([descargar](https://maven.apache.org/download.cgi))
- **IDE** recomendado: Eclipse, IntelliJ IDEA o VS Code

## Como Ejecutar

### Opcion 1: Maven (recomendado)

```bash
# Ejecutar un tema especifico
mvn compile exec:java -Dexec.mainClass="com.cursojava.01_primeros_pasos.HolaMundo"
mvn compile exec:java -Dexec.mainClass="com.cursojava.02_variables.VariablesYT"

# Ejecutar con argumentos (ejemplo: MetodoMain)
mvn compile exec:java -Dexec.mainClass="com.cursojava.01_primeros_pasos.MetodoMain" -Dexec.args="Juan 25"
```

### Opcion 2: Eclipse

1. Importar proyecto: `File > Import > Maven > Existing Maven Projects`
2. Seleccionar la carpeta del proyecto
3. Clic derecho en cualquier archivo `.java` > `Run As > Java Application`

### Opcion 3: IntelliJ IDEA

1. `File > Open` y seleccionar la carpeta del proyecto
2. Esperar a que Maven sincronice
3. Clic derecho en cualquier archivo `.java` > `Run`

### Opcion 4: javac directo

```bash
# Compilar un archivo
javac -d out src/main/java/com/cursojava/01_primeros_pasos/HolaMundo.java

# Ejecutar
java -cp out com.cursojava.01_primeros_pasos.HolaMundo
```

---

## Estructura del Proyecto

```
java-intro-course/
├── pom.xml                          # Configuracion Maven (Java 21)
├── README.md                        # Este archivo
└── src/main/java/com/cursojava/
    ├── Main.java                    # Menu principal
    │
    ├── 01_primeros_pasos/           # Tema 1: Primeros pasos
    │   ├── HolaMundo.java           # Tu primer programa en Java
    │   ├── SintaxisJava.java        # Sintaxis basica del lenguaje
    │   └── MetodoMain.java          # El metodo main y argumentos
    │
    ├── 02_variables/                 # Tema 2: Variables
    │   ├── VariablesYT.java         # Tipos de datos primitivos
    │   └── ConversionDeTipos.java   # Casting implicito y explicito
    │
    ├── 03_operadores/               # Tema 3: Operadores
    │   ├── OperadoresAritmeticos.java  # +, -, *, /, %, ++, --
    │   └── OperadoresLogicos.java      # &&, ||, !
    │
    ├── 04_condiciones/              # Tema 4: Condiciones
    │   ├── CondicionesIfElse.java       # if, else if, else
    │   ├── CondicionesConcatenadas.java # Condiciones con &&, ||
    │   └── SwitchCondicion.java         # switch-case
    │
    ├── 05_bucles/                   # Tema 5: Bucles
    │   ├── BucleWhile.java          # while
    │   ├── BucleDoWhile.java        # do-while
    │   ├── BucleFor.java            # for
    │   └── BreakContinue.java       # break y continue
    │
    ├── 06_arrays/                   # Tema 6: Arrays
    │   ├── ArraysBasicos.java       # Declaracion y uso basico
    │   ├── ArraysConBucleFor.java   # Buscar, ordenar, invertir
    │   └── ArraysMultidimensionales.java  # Matrices 2D
    │
    ├── 07_poo/                      # Tema 7: POO
    │   ├── ClasesYObjetos.java          # Clases vs Objetos
    │   ├── ClasesVsObjetos.java         # Conceptos de clase y objeto
    │   ├── AtributosEnClases.java       # Atributos de diferentes tipos
    │   ├── MetodosEnClases.java         # Metodos con y sin retorno
    │   ├── PalabraClaveStatic.java      # Variables y metodos estaticos
    │   ├── Constructores.java           # Constructores y sobrecarga
    │   ├── ModificadoresAcceso.java     # public, private, protected
    │   ├── Encapsulacion.java           # Getters y Setters
    │   ├── PaquetesEImport.java         # Paquetes e import
    │   ├── PalabraClaveThis.java        # Uso de la palabra clave this
    │   ├── herencia/
    │   │   ├── HerenciaBasica.java      # extends y super()
    │   │   └── SuperYOverride.java      # @Override y super
    │   ├── polimorfismo/
    │   │   └── Polimorfismo.java        # Polimorfismo y sobrescritura
    │   ├── abstracto/
    │   │   └── ClasesAbstractas.java    # Clases y metodos abstractos
    │   └── interfaces/
    │       └── InterfacesJava.java      # Interfaces y multiples interfaces
    │
    └── 08_avanzados/                # Tema 8: Conceptos Avanzados
        ├── ConstanesFinal.java          # Variables constantes (final)
        ├── EnumJava.java                # Enumeraciones
        ├── ClaseObject.java             # Clase padre Object
        ├── CastingObjetos.java           # Upcasting y downcasting
        ├── ArrayListJava.java           # ArrayList dinamico
        ├── generics/
        │   └── CajaGenerica.java        # Clases y metodos genericos
        ├── excepciones/
        │   ├── TryCatchBasico.java      # try-catch-finally
        │   └── ExcepcionesPersonalizadas.java  # Excepciones propias y throw
        └── threads/
            └── ThreadsBasico.java       # Hilos y concurrencia basica
```

---

## Temas del Curso

### 1. Primeros Pasos
| Archivo | Temas |
|---------|-------|
| `HolaMundo.java` | System.out.println, comentarios |
| `SintaxisJava.java` | Sentencias, variables basicas, bucles simples |
| `MetodoMain.java` | Metodo main, argumentos de linea de comandos |

### 2. Variables y Tipos de Datos
| Archivo | Temas |
|---------|-------|
| `VariablesYT.java` | byte, short, int, long, float, double, char, boolean, String |
| `ConversionDeTipos.java` | Widening, narrowing, parsing, String.valueOf() |

### 3. Operadores
| Archivo | Temas |
|---------|-------|
| `OperadoresAritmeticos.java` | +, -, *, /, %, ++, --, precedencia |
| `OperadoresLogicos.java` | &&, ||, !, cortocircuito |

### 4. Condiciones
| Archivo | Temas |
|---------|-------|
| `CondicionesIfElse.java` | if, else if, else, condiciones anidadas |
| `CondicionesConcatenadas.java` | Multiples condiciones con && y \|\| |
| `SwitchCondicion.java` | switch-case con int, String, char, casos multiples |

### 5. Bucles
| Archivo | Temas |
|---------|-------|
| `BucleWhile.java` | while, ciclos, FizzBuzz |
| `BucleDoWhile.java` | do-while, menus, validacion |
| `BucleFor.java` | for, tablas, factorial, primos, Fibonacci |
| `BreakContinue.java` | break, continue, etiquetas, busqueda en matriz |

### 6. Arrays
| Archivo | Temas |
|---------|-------|
| `ArraysBasicos.java` | Declaracion, for, for-each, busqueda |
| `ArraysConBucleFor.java` | Invertir, ordenar (bubble sort), combinar |
| `ArraysMultidimensionales.java` | Matrices 2D, transpuesta, identidad |

### 7. Programacion Orientada a Objetos
| Archivo | Temas |
|---------|-------|
| `ClasesYObjetos.java` | Crear clases e instanciar objetos |
| `ClasesVsObjetos.java` | Diferencia entre clase y objeto |
| `AtributosEnClases.java` | Tipos de atributos, valores por defecto |
| `MetodosEnClases.java` | Metodos void, con retorno, parametros |
| `PalabraClaveStatic.java` | Variables/metodos estaticos, singleton |
| `Constructores.java` | Constructor vacio, parametrizado, sobrecargado |
| `ModificadoresAcceso.java` | public, private, protected |
| `Encapsulacion.java` | Getters, setters, validaciones |
| `PaquetesEImport.java` | Organizacion con paquetes |
| `PalabraClaveThis.java` | this, method chaining, constructores encadenados |
| `HerenciaBasica.java` | extends, super(), herencia |
| `SuperYOverride.java` | @Override, super para metodos |
| `Polimorfismo.java` | Referencia padre, objeto hijo, instanceof |
| `ClasesAbstractas.java` | abstract, metodos abstractos |
| `InterfacesJava.java` | implements, multiples interfaces, default |

### 8. Conceptos Avanzados
| Archivo | Temas |
|---------|-------|
| `ConstanesFinal.java` | final en variables, metodos, clases |
| `EnumJava.java` | Enum con atributos, metodos, switch |
| `ClaseObject.java` | toString, equals, hashCode, getClass |
| `CastingObjetos.java` | Upcasting, downcasting, instanceof |
| `ArrayListJava.java` | ArrayList, add, remove, get, size |
| `CajaGenerica.java` | Genericos, <T>, metodos genericos |
| `TryCatchBasico.java` | try-catch-finally, excepciones comunes |
| `ExcepcionesPersonalizadas.java` | throw, extends Exception, validaciones |
| `ThreadsBasico.java` | Thread, Runnable, lambda, sincronizacion |

---

## Notas para el Estudiante

1. **Ejecuta cada archivo individualmente** para ver los resultados.
2. **Modifica el codigo** y observa que cambia. Aprender haciendo es la mejor forma.
3. **Lee los comentarios** en cada archivo: explican los conceptos con ejemplos.
4. **Orden recomendado**: Sigue el orden de la estructura (01 -> 02 -> ... -> 08).
5. **No te saltes los temas**: cada uno se basa en el anterior.

---

## Recursos Adicionales

- [Documentacion oficial de Java](https://docs.oracle.com/en/java/)
- [Codecademy - Learn Java](https://www.codecademy.com/learn/learn-java)
- [Ejercicios Java](https://www.w3resource.com/java-exercises/)
- [Java Brains (YouTube)](https://www.youtube.com/c/JavaBrainsChannel)

---

## Licencia

Este proyecto es educativo y de uso libre. Puedes copiarlo, modificarlo y compartirlo.
