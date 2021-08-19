# MANEJO DE EXCEPCIONES

## EXCEPCIONES

El término excepción es una abreviación de la frase “Evento Excepcional”. Una excepción es
un evento que ocurre durante la ejecución de un programa que interrumpe el flujo normal
de las instrucciones del programa.

Existen muchas clases de errores que pueden provocar una excepción, desde un
desbordamiento de memoria o un disco duro estropeado hasta un intento de dividir por cero
o intentar acceder a un vector fuera de sus límites. Cuando esto ocurre, la máquina virtual
Java crea un objeto de la clase exception o error y se notifica el hecho al sistema de
ejecución. Se dice que se ha lanzado una excepción (“Throwing Exception”). Luego, el objeto,
llamado excepción, contiene información sobre el error, incluyendo su tipo y el estado del
programa cuando el error ocurrió.

Después de que un método lanza una excepción, el sistema, en tiempo de ejecución, intenta
encontrar algo que maneje esa excepción. El conjunto de posibles “algo” para manejar la
excepción es la lista ordenada de los métodos que habían sido llamados hasta llegar al
método que produjo el error. Esta lista de métodos se conoce como pila de llamadas. Luego,
el sistema en tiempo de ejecución busca en la pila de llamadas el método que contenga un
bloque de código que pueda manejar la excepción. Este bloque de código es llamado
manejador de excepciones.

Concretamente, una excepción en java es un objeto que modela un evento excepcional, el
cual no debería haber ocurrido. Como observamos anteriormente, al ocurrir estos tipos de
evento la máquina virtual no debe continuar con la ejecución normal del programa. Es
evidente que las excepciones son objetos especiales, son objetos con la capacidad de
cambiar el flujo normal de ejecución. Cuando se detecta un error, una excepción debe ser
lanzada.

Ejemplos de situaciones que provocan una excepción:

• No hay memoria disponible para asignar

• Acceso a un elemento de un array fuera de rango

• Leer por teclado un dato de un tipo distinto al esperado

• Error al abrir un fichero

• División por cero


---

## JERARQUIA DE EXCEPCIONES

En Java, todas las excepciones están representadas por clases. Todas las clases de
excepción se derivan de una clase llamada Throwable. Por lo tanto, cuando se produce una
excepción en un programa, se genera un objeto de algún tipo de clase de excepción.

Hay dos subclases directas de Throwable: Exception y Error:

1. **Las excepciones de tipo Error** están relacionadas con errores que ocurren en
la Máquina Virtual de Java y no en tu programa. Este tipo de excepciones escapan a
su control y, por lo general, tu programa no se ocupará de ellas. Por lo tanto, este tipo
de excepciones no se describen aquí.



2. **Los errores que resultan de la actividad del programa están representados por
subclases de Exception**. Por ejemplo, dividir por cero, límite de matriz y errores de
archivo caen en esta categoría. En general, tu programa debe manejar excepciones
de estos tipos. Una subclase importante de Exception es RuntimeException, que se
usa para representar varios tipos comunes de errores en tiempo de ejecución.

---

## MANEJADOR DE EXCEPCIONES

El manejo de excepciones Java se gestiona a través de cinco palabras clave: try, catch, throw, throws, y finally. 

Forman un subsistema interrelacionado en el que el uso de uno implica el uso de otro.

Las declaraciones del programa que desea supervisar para excepciones están contenidas dentro de un bloque **try**. 

Si se produce una excepción dentro del bloque try, se lanza. 

Tu código puede atrapar esta excepción usando **catch** y manejarlo de una manera racional. 

Las excepciones generadas por el sistema son lanzadas automáticamente por el sistema de tiempo de ejecución de Java. 

Para lanzar manualmente una excepción, use la palabra clave **throw**. 

En algunos casos, una excepción arrojada por un método debe ser especificada como tal por una cláusula **throws**. 

Cualquier código que debe ejecutarse al salir de un bloque try se coloca en un bloque **finally**.

Ahora vamos a ver en detalle cada palabra clave dentro del manejo de excepciones.

### El bloque try

Lo primero que hay que hacer para que un método sea capaz de tratar una excepción
generada por la máquina virtual Java o por el propio programa mediante una instrucción
throw es encerrar las instrucciones susceptibles de generarla en un bloque try. En el bloque
try vamos a poner una serie de instrucciones que creemos que puede llegar a tirar una
excepción durante su ejecución y queremos manejarla para evitar la finalización del
programa.

```JAVA
try {
  Instrucción1;
  Intruscción2;
  Instrucción3;
  Instrucción4
  ...
}
```

Cualquier excepción que se produzca por alguna instrucción, dentro del bloque try será
analizada por el bloque o bloques catch. En el momento en que se produzca la excepción,
se abandona el bloque try, y las instrucciones que sigan al punto donde se produjo la
excepción no son ejecutadas. Cada bloque try debe tener asociado por lo menos un bloque
catch.

### El bloque catch

Por cada bloque try pueden declararse uno o varios bloques catch, cada uno de ellos capaz
de tratar un tipo u otro de excepción. Para declarar el tipo de excepción que es capaz de
tratar un bloque catch, se declara un objeto cuya clase es la clase de la excepción que se
desea tratar o una de sus superclases.

```JAVA
try {
  BloqueDeIntrucciones
} catch (TipoExcepción nombreVariable) {
  BloqueCatch
} catch (TipoExcepción nombreVariable) {
  BloqueCatch
}
```

Al producirse la excepción dentro de un bloque try, la ejecución del programa se pasa al
primer bloque catch. Si la clase de la excepción se corresponde con la clase o alguna
subclase de la clase declarada en el bloque catch, se ejecuta el bloque de instrucciones
catch y a continuación se pasa el control del programa a la primera instrucción a partir de
los bloques try-catch. Lo más adecuado es utilizar excepciones lo más cercanas al tipo de
error previsto, ya que lo que se pretende es recuperar al programa de alguna condición de
error y si “se meten todas las condiciones en la misma bolsa”, seguramente habrá que
averiguar después qué condición de error se produjo para poder dar una respuesta
adecuada.

```JAVA
try {
  // Se intenta hacer la división
  int division = 10 / 0;
} catch (ArithmeticException a) {
  // Si la división falla el programa va al bloque catch y se ejecuta el
  System.out.println
  System.out.println(“Error: división por cero”);
}
```

En este ejemplo en el bloque try hacemos una división por cero, las divisiones por cero
generan un tipo de excepción llamado, ArithmeticExcepction. En el bloque catch ponemos
como tipo de excepción la ArithmeticException y dentro del bloque ponemos un mensaje
que explique cual ha sido el error.


### Métodos Throwable

Dentro del bloque catch, utilizamos un System.out.print para mostrar el error, pero no hemos
estado haciendo nada con el objeto de excepción en sí mismo. Como muestran todos los
ejemplos anteriores, una cláusula catch especifica un tipo de excepción y un parámetro. El
parámetro recibe el objeto de excepción. Como todas las excepciones son subclases de
Throwable, todas las excepciones admiten los métodos definidos por Throwable.

Estos métodos son:

| Método | Sintaxis | Descripción |
| ------ | -------- | ----------- |
| getMessage | String getMessage() | Devuelve una descripción de la excepción |
| fillInStackTrace | Throwable fillInStackTrace() | Devuelve un objeto Throwable que contiene un seguimiento de pila completo. Este objeto se puede volver a lanzar. |
| toString |String toString() |Devuelve un objeto String que contiene una descripción completa de la excepción. Este método lo llama println() cuando se imprime un objeto
Throwable. |


