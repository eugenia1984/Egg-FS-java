# Guia 5 : Introduccion a Java

---

# Teoría

## Java

Es un **lenguaje de programacion de alto nivel**.

---



## Compilador de Java

Traduce todo un programa de una sola vez.

Se compila a un lenguaje intermedio (**ByteCode**) que es interpretado por **JVM** (Java Virtual Machine) del **JRE** (Java Runtime Enviroment) y asi es portable a distintas plataformas.


## Ejecucion de una aplicacion

En Java el código fuente se guarda en archivos **.java** y al compilar el codigo fuente se realiza un analisis de sintaxis de codigo escrito en archivos .java y de estar ok son compilados a archivos **.class**.


## Archivo fuente en Java

Tiene la siguiente forma:

```JAVA
<declaracion_paquete>

<declaracion_importacion>

<modificador> <declaracion_clase>

	<atributos>
	
	<constructores>
	
	<metodos>
	
```

El nombre del archivo fuente debe ser el mismo de la declaracion de clase publica(la main class).



## Estructura de un programa Java


```JAVA
/*
*El siguiente programa muestra un mensaje "Hola mundo" en la consola utilizando el método System.out.println()
*/

package primerPrograma;

public class HolaMundo{

  public static void main(String[] args) {
     System.out.println("Hola Mundo");
  }
  
}
```

Los **comentarios** van entre /* */.

Los **paquetes** son contenedores de **clases**, son analogos a las carpetas y archivos utilizados en el sistema operativo. Se escriben en minuscula.

Las **clases** moldean los objetos que serán utilizados por los programas. Una clase se forma asi:

**Declaracion de clase {** <br>
**Cuerpo de clase** <br>
**}** <br>


Siempre tienen la palabra reservada **class** y se cierran y abren entre llaves: **{ }**.



## Métodos

Un método es una secuencia de sentencias ejecutables, y son delimitadas por las { }. 


## Método Main()

El **main()** sirve para que un programa se pueda ejecutar, es como el Algoritmo de Pseint. 


## ¿ Cómo de declara ? 


```JAVA
public static void main(String[] args) {

}
```


**public** : tipo de acceso, puede ser llamado desde otras clases.

**static** : un modificador que indica que la clase no necesita ser instancia para poder utilizar el método. Y dicho método es el mismo para todas las instancias que pueden crearse.

**void** : el método main no devuelve valor. 

El **método main()** siempre debe aceptar **String** como parámetr : **(String[] args)**.



## Sentencia

Las unidades ejecutables más pequeñas de un programa (las líneas de código escrito). 

Tienen una *palabra clave* o *reservada* como expresiones, declaraciones de varaibles o llamadas a funciones. 

Todas las sentencias deben terminar con **;**. 



## Elementos de un programa


### Palabra reservada

Palabra dentro del lenguaje que significan la ejecucion de una instruccion determinada, por lo que no pueden ser utilizadas con otro fin. 


### Identificador

Los nombres que se usan para identificar cada uno de los elementos del lenguaje (nombre de variables, nombre de clases, interfaces, atributos y métodos). 


### Variables y Constantes


Son como pequeñas cajas que guardan informacion. 

Poseen un identificador (su nombre) que facilita distinguirla una de otra.

Si la información que guarda no debe cambiar, entonces tenemos una **constante**. 

Si los valores pueden cambiar (variar) entonces tenemos uan **variable** . 



## Declaracion de variables 

Siempre deben ser declaradas antes de usarse, se deben declarar al principio del programa. 

Su sintaxis:

```JAVA
<tipo_de_dato> <nombre_varaible>;
```

---

## Tipos de datos

### Primitivos

**Byte**<br>
**Short**<br>
**Integer**<br>
**Long**<br>
**Float**<br>
**Double**<br>
**Boolean**<br> 
**Character**<br>
**String**<br>

---


## Operadores


### De asignacion

| signo | operador significado |
| ----- | -------------------- |
| = | es de asignación simple |


### Aritméticos

| signo | operador significado |
| ----- | -------------------- |
| + | suma |
| - | resta |
| * | multiplicacion |
| / | division |
| % | modulo |


### Unarios


| signo | operador significado |
| ----- | -------------------- |
| + | suma |
| - | resta |
| ++ | operador de incremento | 
| -- | operador de decremento |
| ! |operador logico de negacion |


### De igualdad y relacion


| signo | operador significado |
| ----- | -------------------- |
| == | igual |
| != | distinto |
| > | mayor |
| >= | mayor igual |
| < | menor |
| <= | menor igual |


### Condicionales


| signo | operador significado |
| ----- | -------------------- |
| &&  | and / Y |
| || | or / O |
| ?: | ternario |


### De comparacion de tipo

*instance of*


---

## Tipos de instrucciones


**instuccones de inicio/fin** : para delimitar bloques de codigo. 


**instrucciones de asignacion** : para asignar el resultado de la evalucacion de una expresion a una variable. Ejemplo:


```JAVA
nombre_de_la_variable = expresion
```


**instrucciones de lectura** : para leer datos de un dispositivo de entrada y se asignan a una variable. ( Scanner ).


**instrucciones de escritura**: escribir o mostrar mensajes o contenido de las variables en un dispositivo de salida. ( System.out.print ).


**instrucciones de bifurcacion**: se interrumpe el desarrollo lineal de un programa.

---


## Instrucciones primitivas



### Asignacion

Permite almacenar un valor en una variable, previamente definida.

```JAVA
<variable> =  <expresion>
```

Se puede definir una variable y al mismo tiempo asignarle valor: 

```JAVA
<tipo de variable> <variable> = <expresion>
```


Primero de evalúa la expresión de la derecha y luego se asigna el resultado a al variable de la izquierda. 

El tipo de la variable y el de la expresión deben coincidir.


---

## Entrada y Salida de información


### Escritura en Java

```JAVA
System.out.println();
```

Permite mostrar valores en el **output**, la interfaz gráfica de Java.

Siempre entre comillas dobles (si es String) y dentro de los paréntesis, si es una variable va sin comillas. 

Para concetanar *mensaje* con *variable* se utiliza el **+** . 

Si se quiere escribir sin saltos de línea va sin ln(next line): 

```JAVA
System.out.print();
```



### Lectura o entrada en Java

Hay muchas maneras de ingresar información en el output por teclado en nuestro programa Java.

**Scanner** es una clase en el paquete **java.util** utilizada para obtener la entrada de los tipos primitivos: int, double, etc, y también String. 

Ejemplo: 

```JAVA
Scanner leer = new Scanner(System.in);
```

Para poder usar el Objeto Scanner hay que **importarlo** para poder usarlo: 

```JAVA
import java.util.Scanner;
```

Para crear un objeto de clase Scanner pasamos un objeto predefinido **System.in** que representa el flujo de entrada standard. 

Se le dio el nombre **leer** pero puede nombrarse como quieran. 

Para utilizar las funciones del objeto Scanner se usa el nombre que le asignamos (leer) y luego un punto (.), para llamar a los métodos del Scanner. 

Para leer valores numéricos de un determinado tipo de datos, la funcion que se utilizará es : 

**naxtT()** donde **Y** es el tipo de dato, por ejemplo, para leer un tipo entero: **leer.nextInt()** o para leer un double: **leer.nextDouble()**.

Se puede usar cuando se define la variable. 

```JAVA
int numero = leer.nextInt()
```

Se puede usar como una variable pre definida: 

```JAVA
int numero;
numero = leer.nextInt();
```


---

:computer: [ver el primer programa en Java](https://github.com/eugenia1984/Egg-FS-java/tree/master/guia5-java/primerPrograma)

---


# Instrucciones de bifurcacion


## Estructuras de control

Construcciones a partir de palabras reservadas que permiten modificar el flujo de ejecución del programa.


## Estructuras condicionales

Estructuras de control que cambian el flujo de ejecución de un programa de acuerdo a si se cumple o no una condición. 

Cuando el flujo de control del programa llega al condicional, el programa evalúa la condición y determina el camino a seguir.


### if / else

**IF** es la más básica de las estructuras de control de flujo. 

Se ejecuta cierta parte del código si la condición evaluada es verdadera (TRUE).


```JAVA
if( condición ) {

 //sentencias
 
}
```


La **condición** es una expresión condicional cuyo resultado luego de la evaluación es un dato booleano, si es TRUE se ejecutan las sentencias.


En el **if / else** primero se evalua la condición si es TRUE se ejecuta la sentencia1, si es false se ejecuta al sentencia2. 


```JAVA
if( condición ) {

 //sentencias1
 
} else {

 //sentencias2
 
}
```

En el **if / else if / else** son condiciones anidadas, primero se evalua la **condicion** si es true se ejecuta **sentencias1**, sino pasa a evaluar **condicion2** si es true se ejecuta **sentencias2** y sino pasa a ejecutar **sentencias3** dentro del **else**. 

```JAVA
if( condición ) {

 //sentencias1
 
} else if (condicion2) {

 //sentencias2
 
} else {

  //sentencias3	
  
}
```

### Switch

Evalúa el valor que tiene la variable y de acuerdo al valor que posee ejecuta las sentencias del bloque correspondiente.

```JAVA
switch( variable) {

  case valor1:
              sentencia1;
	      break;
	      
  case valor2:
              sentencia2;
	      break;
	      
   default:
           sentencia3;
}
```

**break** va detrás de cada sentencia, para cortar el switch y que se salga del bucle. 

Las instrucciones dentro del bloque default se ejecutan cuando la variable que se está evaluando no coincide con ninguno de los valores case.


---

## Estructuras repetitivas

Cuando hay operaciones que deben repetirse muchas veces. 

Son los **bucles** / **ciclos** / **loops**.

La **iteracion** es cuando se repite la ejecución de una secuenacia, es cada vuelta del ciclo. 

Todo bucle tiene una **condición** que es la que determina cuándo se repite el bucle. 


### While

```JAVA
while (  condicion ) {

   //sentencias
   
}
```

Ejecuta un bloque de instrucciones mientras se cumple una condición.

La condición se comprueba **antes** de empezar a ejecutar por primera vez el bucle; por lo que si la condición es falsa, nunca se ejecuta.


### Do / While

El bloque se ejecuta siempre al menos una vez, porque primero se ejecuta y luego se ve si se cumple con la condición. 

```JAVA
do {

  //sentencias
  
}  while ( condicion );

```

Tener en cuenta que esta sentencia de ciclo finaliza con **;**


### For


Es una forma comparcta de recorrer un rango de valores cuando la cantidad de veces que se debe iterar un bloque de codigo es conocida.


```JAVA
for ( inicializacion ; terminacion ; incremento ) {

   //sentencias
   
}
```

**inicializacion** inicializa el bucle y se ejecuta una sola vez al iniciar el bucle.

**terminacion** es la condición que permite que el bucle pase de true a false y corte, sino es un bule infinito

**incremento** se invoca luego de cada iteración, puede tanto incrementar como decrementar.



## Sentencias de Salto

### Break

Sirve para abandonar una estructura de control, en : if-else , switch, for, do-while, while.

Cuando se ejecuta la instrucción break, el control del programa sale de la estructura en la que encuetnra contenida y continua con el programa. 

### Continue

Corta la iteración en donde se encuentra el continue, pero en lugar de salir del bucle, continúa con la sigueinte iteración. 

Transfiere el control del programa desde la instrucción continue directamente a la cabecera del bucle: for, do-while, while.

---

:computer: [ver ejemplo de Condionales](https://github.com/eugenia1984/Egg-FS-java/tree/master/guia5-java/condicionales)

:computer: [ver ejemplo de bucles y sentancias de salto - break y continue-](https://github.com/eugenia1984/Egg-FS-java/tree/master/guia5-java/buclesYsentenciasDeSalto)

---

# Clases de utilidad

## Clase String

Cadenas de caracteres. 

Sus métodos: 

| **nombre del método** | **descripcion de qué hace** |
| --------------------- | --------------------------- |
| **charAt( int index)** |  retorna el caracter especificado en la posicion index. |
| **equals(String str)** | sirve para comparar si dos cadenas son iguales. Devuelve True si son iguales y false si no |
| **equalsIgnoreCase(String str)** | sirve para comparar si dos cadenas son iguales, ignorando la grafía de la palabra. devuelve true si son iguales y false si no |
| **compareTo(string otraCadena)** | compara dos cadenas de caracteres alfabéticamente. Retorna 0 si son iguales, entero negativo si la primera es menor o entero positivo si la primera es mayor. |
| **concat(String str)** | concatena la cadena del parámetro al final de la primera cadena |
| **contains(charSequence s)** | retorna si la cadena contiene la secuencia tipo char del parámetro |
| **endsWith(String str)** | retorna verdadero si la cadena es igual al objeto del parámetro |
| **indexOf(String str)** | retorna e índice de la primera ocurrencia de la cadena del parámetro |
| **isEmpty()** | retorna verdadero si la longitud de la cadena es 0. |
| **length()** | etorna la longitud de la cadena |
| **replace(char oldChar, char newChar)** | renueva una nueva cadena reemplazando los caracteres del primer parámetro con el carácter del segundo parámetro |
| **split(Sting regex)** | retorna un arreglo de cadenas separadas por la cadena del parámetro |
| **startsWith(String prefix)** | retorna verdadero si el comienzo de la cadena es igual al prefijo del parámetro |
| **cubstring(int beginIndex, int endIndex)** : retorna la sub cadena desde el caracter del primer parámetro hasta el carácter del segundo parámetro. <br>
| **toCharArray()** | retorna el conjunto de caracteres de la cadena |
| **toLowerCase()** | retorna la cadena en minúscula |
| **toUpperCase()** | retorna la cadena en mayúscula |



Java es un lenguaje de tipado estático, para convertir cualquier tipo de dato a un String, utilizamos la función **valueOf(n)**. 

Ejempo: 

```JAVA
int numeroEntero = 4;

String numCadena = String.valueOf(numentero);

```

Si lo quiero hacer al reves: 

```JAVA
String numCadena = "1";

int numEntero = integer.parseInt(numCadena);
```

---

## Clase Math

Sus métodos: 

| **nombre del método** | **descripcion de qué hace** |
| --------------------- | --------------------------- |
| **abs(double a)** | devuelve el valor absoluto de un valor doble introducido como parámetro |
| **abs(int a)** | devuelve el valor absoluto de un valor Entero introducido como parámetro |
| **abs(long a)** | devuelve el valor absoluto de un valor long introducido como parámetro |
| **max(double a, double b)** | devuelve el mayor de dos valores dobles |
| **max(int a, int b)** | devuelve el mayor de dos valores Enteros |
| **max(long a, long b)** | devuelve el mayor de los valores long |
| **min(double a, double b)** | devuelve el menor de dos valores dobles |
| **min(int a, int b)** | devuelve el menor de dos valores enteros |
| **min(long , long b)** | devuelve el menor de dos valores long |
| **pow(double a, double b)** | devuelve el valor del primer argumento elevado a la potencia del segundo argumento |
| **random()** | devuelve un doble con un signo positivo, mayor o igula que 0 y menor que 1.0  |
| **roud(double a)** | devuelve el long redondeado más cercano al double inroducido |
| **sqrt(double a)** | devuelve la raiz positiva correctamente redondeada de un doble |
| **floor(double a)** | devuelve el entero más cerno por debajo |



## Método random() de la clase Math

Se puede usar para generar números al azar.

El rango o margen con el que trabaja el método random oscila entre 0.0 y 1.0 (este último no incluido)

Por lo tanto , para generar un núemro entero entre 0 y 9 hay que escribir la sentencia: 

```JAVA
int numero = (int) (Marth.random() * 10);
```

---

## Subprogramas

Para solucionar un problema complejo es lo mejor dividir en subproblemas ( subprogrmas ) . 

Divide y vencerás. 

El problema principal se soluciona por el correspondiente programa o algoritmo principal mientras que la solución de los subproblemas será a través de subprogrmas, conocidos como **procedimientos** o **funciones**. 

Un subprograma es como un mini algoritmo. 


## Funciones


Son un conjunto de líneas de código encapsulados en un bloque, recibe argumentos, cuyos valores se utilizan para efectuar operaciones y adicionalmente retorna un valor.

Según sus parámetros, puede recibir argumentos (algunas no reciben nada), hace uso de dichos valores recibidos como sea necesario y retorna un valor usando la instrucción **return**, si no retorna es otro tipo de función. 

Los tipos que pueden usarse en la función son: int, double, long, boolean, Strinf, char. 



```JAVA

[acceso]  [modificador]  [tipo]  nombreFuncion( [tipo] nombreArgumento, ...) {

  //bloque de instrucciones
  
}
```


## Procedimientos (Funciones sin retorno)


```JAVA
[acceso]  [modificador]  void  nombreFuncion( [tipo] nombreArgumento, ...) {

  //bloque de instrucciones
  
}
```


---


# Arreglos: Vectores y Matrices


# Vector


**Declaración y creación** 

```JAVA
tipo[]  arregloV = new tipo[tamanio];
```


**Asignar elementos manualmente**

```JAVA
vector[0] = 5;
```


**Asigar elementos con for**

```JAVA
for (int i = 0 ; i < 5 ; i++) {

  vector[i] = 5;
  
}
```


**En un subprograma**

```JAVA
public static int devolverVector() {

   int[] vector = new int[5];
   return vector;
   
}
```



# Matriz


**Declaración y creación**

```JAVA
tipo[] [] arregloM = new tipo[filas][columnas]:
```


**Asignar elementos**

```JAVA
matriz[0][0]=6;
```


**Asigar elementos con for**

```JAVA
for (int i = 0 ; i < 5 ; i++) {

  for (int j = 0 ; j < 5; j++) {
    matriz[i][j] = 6;
  }
  
}
```


---

:computer: [ver ejemplo de vectores y matrices](https://github.com/eugenia1984/Egg-FS-java/tree/master/guia5-java/vectoresYMatrices)

Se utiliza el **bucle for mejorado** que permite recorrer los arreglos sin necesidad de acceder mediante subíndices, sino accediendo directamente a los elementos del arreglo 

---

# Preguntas de aprendizaje



**1) El archivo de un programa en Java debe terminar con la extensión de archivo:**

a) .class

b) .java

c) .jar

d) Ninguna de las anteriores

**Respuesta B: .java**


**2) Cuando se compila un programa en Java, el archivo producido por el compilador 
termina con la extensión:**

a) .class

b) .java

c) .jar

d) Ninguna de las anteriores

**Respuesta A: .class**


**3) ¿Qué es el bytecode en Java?**

a) El formato de intercambio de datos

b) El formato que obtenemos tras compilar un código fuente .java

c) Un tipo de variable

d) Un depurador de código

**Respuesta B: El formato que obtenemos tras compilar un código fuente .java**


**4) Una aplicación ejecutable que representa un procesador genérico sobre el cual se
ejecutan los bytecodes de Java es:**

a) La máquina virtual de Java (JVM)

b) Ambiente de ejecución de Java

c) Librerías de clases Java

d) Ninguna de las anteriores

**Respuesta A: La máquina virtual de Java (JVM)**


**5) ¿Con qué se comienza la ejecución de un programa Java?**

a) Con package

b) Con códigos

c) Con el programa o método main()

d) Todas las anteriores

**Respuesta A: package**


**6) Teniendo en cuenta que los paquetes y las clases son análogos a las carpetas y archivos utilizados por el sistema operativo, ¿el nombre de la clase debe ser diferente al del paquete?**

a) Siempre

b) Nunca

c) No importa

d) Ninguna de las anteriores

**Respuesta B: nunca, el nombre del paquete debe ser el mismo al de la clase principal**


**7) ¿El llamado a una librería se hace haciendo uso de la sentencia: **

a) String

b) Continue

c) Package

d) Import

**Respuesta D : Import**



**8) El double se aplica para datos tipo:**

a) Entero

b) Decimal

c) Carácter

d) Ninguno de los anteriores

**Respuesta B: DECIMAL**


**9) Para mostrar mensajes por pantalla se usa:**

a) System.out.printer()

b) System.out.prin()

c) System.out.println()

d) Ninguna de las anteriores

**Respuesta C:  System.out.println()**


**10) ¿Cuáles son las sentencias de iteración?**

a) El Bucle for, while y do/while

b) Bucle for e if/else

c) Bucle while y switch

d) Ninguna de las anteriores

**Respuesta A:  Bucle for, while y do/while**


**11) ¿Cuáles son las sentencias de salto?**

a) Try y break

b) Break y continue

c) Continue y switch

d) While y break

**Respuesta B: Break y continue **


**12) ¿Qué diferencia hay entre un bucle while y un bucle for?**

a) El bucle for puede llegar a ejecutarse nunca pero el while siempre se ejecuta al menos una vez.

b) El bucle for se ejecuta un número determinado de veces y el while un número indeterminado de veces

c) El bucle for no puede convertirse en un bucle while, pero sí al contrario.

d) El bucle while permite su inicialización, pero el bucle for no lo permite.

**Respuesta B: El bucle for se ejecuta un número determinado de veces y el while un número indeterminado de veces**


**PREGUNTAS EXTRA:**

Investigar la documentación de la clase System y responder:

• ¿Que representa la clase System?

La clase System representa al sistema donde se esta ejecutando el programa Java. 

Puede accederse a la salida estándar del proceso, a la salida de error del proceso y a la entrada estándar del proceso mediante, System.

Por lo tanto se la puede utilizar para interactuar con el entorno en el que corre, y utilizar las propiedades del entorno, sistema operativo, usuario y demás.

• ¿Para qué sirve el atributo out de la clase System?

• ¿Para qué sirve el atributo in de la clase System?

• ¿Para qué sirve el atributo err de la clase System?

Esta clase nos permite trabajar con los diferentes canales de datos de nuestro programa. La clase posee tres atributos staticos, uno por cada canal.

in. Standard Input stream. -> INGRESO DATOS

out. Standard Output stream. -> MUESTRO DATOS

err. Standard Error stream.

---

# EJERCICIOS DE APRENDIZAJE


## Ejercicio 1

Escribir un programa que pida dos números enteros por teclado y calcule la suma de los dos. El programa deberá después mostrar el resultado de la suma

:computer: [ver ejercicio 1](https://github.com/eugenia1984/Egg-FS-java/blob/master/guia5-java/Ejercicio1.java)


## Ejercicio 2 

Escribir un programa que pida tu nombre, lo guarde en una variable y lo muestre por pantalla.

:computer: [ver ejercicio 2](https://github.com/eugenia1984/Egg-FS-java/blob/master/guia5-java/Ejercicio2.java)


## Ejercicio 3

Escribir un programa que pida una frase y la muestre toda en mayúsculas y después toda en minúsculas. 

Nota: investigar la función **toUpperCase()** y **toLowerCase()** en Java.

:computer: [ver ejercicio 3](https://github.com/eugenia1984/Egg-FS-java/blob/master/guia5-java/Ejercicio3.java)


## Ejercicio 4

Dada una cantidad de grados centígrados se debe mostrar su equivalente en grados Fahrenheit. La fórmula correspondiente es: F = 32 + (9 * C / 5).

:computer: [ver ejercicio 4](https://github.com/eugenia1984/Egg-FS-java/blob/master/guia5-java/Ejercicio4.java)


## Ejercicio 5

Escribir un programa que lea un número entero por teclado y muestre por pantalla el doble, el triple y la raíz cuadrada de ese número. 

Nota: investigar la función **Math.sqrt()**.

:computer: [ver ejercicio 5](https://github.com/eugenia1984/Egg-FS-java/blob/master/guia5-java/Ejercicio5.java)


## Ejercicio 6

Implementar un programa que dado dos números enteros determine cuál es el mayor y lo muestre por pantalla

:computer: [ver ejercicio 6](https://github.com/eugenia1984/Egg-FS-java/blob/master/guia5-java/Ejercicio6.java)


## Ejercicio 7

Crear un programa que dado un numero determine si es par o impar.

:computer: [ver ejercicio 7](https://github.com/eugenia1984/Egg-FS-java/blob/master/guia5-java/Ejercicio7.java)


## Ejercicio 8

Crear un programa que pida una frase y si esa frase es igual a “eureka” el programa pondrá un mensaje de Correcto, sino mostrará un mensaje de Incorrecto. 

Nota: investigar la función **equals()** en Java.

:computer: [ver ejercicio 8](https://github.com/eugenia1984/Egg-FS-java/blob/master/guia5-java/Ejercicio8.java)


## Ejercicio 9

Realizar un programa que solo permita introducir solo frases o palabras de 8 de largo. 

Si el usuario ingresa una frase o palabra de 8 de largo se deberá de imprimir un mensaje por pantalla que diga “CORRECTO”, en caso contrario, se deberá imprimir “INCORRECTO”. 

Nota: investigar la función **Lenght()** en Java.

:computer: [ver ejercicio 9](https://github.com/eugenia1984/Egg-FS-java/blob/master/guia5-java/Ejercicio9.java)


## Ejercicio 10

Escriba un programa que pida una frase o palabra y valide si la primera letra de esa frase es una ‘A’. 

Si la primera letra es una ‘A’, se deberá de imprimir un mensaje por pantalla que diga “CORRECTO”, en caso contrario, se deberá imprimir
“INCORRECTO”.

Nota: investigar la función **Substring** y **equals()** de Java.

:computer: [ver ejercicio 10](https://github.com/eugenia1984/Egg-FS-java/blob/master/guia5-java/Ejercicio10.java)


## Ejercicio 11

Considera que estás desarrollando una web para una empresa que fabrica motores (suponemos que se trata del tipo de motor de una bomba para mover fluidos).

Definir una variable tipoMotor y permitir que el usuario ingrese un valor entre 1 y 4.

El programa debe mostrar lo siguiente:

o Si el tipo de motor es 1, mostrar un mensaje indicando “La bomba es una bomba de agua”.

o Si el tipo de motor es 2, mostrar un mensaje indicando “La bomba es una bomba de gasolina”.

o Si el tipo de motor es 3, mostrar un mensaje indicando “La bomba es una bomba de hormigón”.

o Si el tipo de motor es 4, mostrar un mensaje indicando “La bomba es una bomba de pasta alimenticia”.

o Si no se cumple ninguno de los valores anteriores mostrar el mensaje “No existe un valor válido para tipo de bomba”

:computer: [ver ejercicio 11](https://github.com/eugenia1984/Egg-FS-java/blob/master/guia5-java/Ejercicio11.java)


## Ejercicio 12

Escriba un programa que valide si una nota está entre 0 y 10, sino está entre 0 y 10 la nota se pedirá de nuevo hasta que la nota sea correcta.

:computer: [ver ejercicio 12](https://github.com/eugenia1984/Egg-FS-java/blob/master/guia5-java/Ejercicio12.java)


## Ejercicio 13

Escriba un programa en el cual se ingrese un valor límite positivo, y a continuación solicite números al usuario hasta que la suma de los números introducidos supere el límite inicial.

:computer: [ver ejercicio 13](https://github.com/eugenia1984/Egg-FS-java/blob/master/guia5-java/Ejercicio13.java)


## Ejercicio 14

Realizar un programa que pida dos números enteros positivos por teclado y muestre por pantalla el siguiente menú:

MENU

1. Sumar

2. Restar

3. Multiplicar

4. Dividir

5. Salir

Elija opción:

El usuario deberá elegir una opción y el programa deberá mostrar el resultado por pantalla y luego volver al menú. 

El programa deberá ejecutarse hasta que se elija la opción 5. 

Tener en cuenta que, si el usuario selecciona la opción 5, en vez de salir del programa directamente, se debe mostrar el siguiente mensaje de confirmación:

¿Está seguro que desea salir del programa (S/N)? 

Si el usuario selecciona el carácter ‘S’ se sale del programa, caso contrario se vuelve a mostrar el menú.

:computer: [ver ejercicio 14](https://github.com/eugenia1984/Egg-FS-java/blob/master/guia5-java/Ejercicio14.java)


## Ejercicio 15

Escriba un programa que lea 20 números. 

Si el número leído es igual a cero se debe salir del bucle y mostrar el mensaje "Se capturó el numero cero". 

El programa deberá calcular y mostrar el resultado de la suma de los números leídos, pero si el número es negativo no debe sumarse. 

Nota: recordar el uso de la sentencia **break**.

:computer: [ver ejercicio 15](https://github.com/eugenia1984/Egg-FS-java/blob/master/guia5-java/Ejercicio15.java)


## Ejercicio 16

Realizar un programa que simule el funcionamiento de un dispositivo RS232, este tipo de dispositivo lee cadenas enviadas por el usuario. 

Las cadenas deben llegar con un formato fijo: tienen que ser de un máximo de 5 caracteres de largo, el primer carácter tiene que ser X y el último tiene que ser una O.

Las secuencias leídas que respeten el formato se consideran correctas, la secuencia especial “&&&&&” marca el final de los envíos (llamémosla FDE), y toda secuencia distinta de FDE, que no respete el formato se considera incorrecta.

Al finalizar el proceso, se imprime un informe indicando la cantidad de lecturas correctas e incorrectas recibidas. 

Para resolver el ejercicio deberá investigar cómo se utilizan las siguientes funciones de Java **Substring()**, **Length()**, **equals()**.

:computer: [ver ejercicio 16](https://github.com/eugenia1984/Egg-FS-java/blob/master/guia5-java/Ejercicio16.java)


## Ejercicio 17

Necesitamos mostrar un contador con 3 dígitos (X-X-X), que muestre los números del 0-0-0 al 9-9-9, con la particularidad que cada vez que aparezca un 3 lo sustituya por una E. Ejemplo:

0-0-0

0-0-1

0-0-2

0-0-E

0-0-4

.

.

0-1-2

0-1-E

Nota: investigar función equals() y como convertir números a String.

:computer: [ver ejercicio 17](https://github.com/eugenia1984/Egg-FS-java/blob/master/guia5-java/Ejercicio17.java)


## Ejercicio 18

Dibujar un cuadrado de N elementos por lado utilizando el carácter “*”. 

Por ejemplo, si el cuadrado tiene 4 elementos por lado se deberá dibujar lo siguiente:

```
* * * *

*     *

*     *

* * * *
```

:computer: [ver ejercicio 18](https://github.com/eugenia1984/Egg-FS-java/blob/master/guia5-java/Ejercicio18.java)


## Ejercicio 19

Realizar un programa que lea 4 números (comprendidos entre 1 y 20) e imprima el número ingresado seguido de tantos asteriscos como indique su valor. Por ejemplo:

5 *****

3 ***

11 ***********

2 **

:computer: [ver ejercicio 19](https://github.com/eugenia1984/Egg-FS-java/blob/master/guia5-java/Ejercicio19.java)


## Ejercicio 20

Crea una aplicación que a través de una función nos convierta una cantidad de euros introducida por teclado a otra moneda, estas pueden ser a dólares, yenes o libras. 

La función tendrá como parámetros, la cantidad de euros y la moneda a converir que será una cadena, este no devolverá ningún valor y mostrará un
mensaje indicando el cambio (void).

El cambio de divisas es:

* 0.86 libras es un 1 €

* 1.28611 $ es un 1 €

* 129.852 yenes es un 1 €

:computer: [ver ejercicio 20](https://github.com/eugenia1984/Egg-FS-java/blob/master/guia5-java/Ejercicio20.java)


## Ejercicio 21

Realizar un algoritmo que rellene un vector con los 100 primeros números enteros y los muestre por pantalla en orden descendente

:computer: [ver ejercicio 21](https://github.com/eugenia1984/Egg-FS-java/blob/master/guia5-java/Ejercicio21.java)


## Ejercicio 22

Realizar un algoritmo que rellene un vector de tamaño N con valores aleatorios y le pida al usuario un numero a buscar en el vector. 

El programa mostrará donde se encuentra el numero y si se encuentra repetido.

:computer: [ver ejercicio 22](https://github.com/eugenia1984/Egg-FS-java/blob/master/guia5-java/Ejercicio22.java)


## Ejercicio 23

Recorrer un vector de N enteros contabilizando cuántos números son de 1 dígito, cuántos de 2 dígitos, etcétera (hasta 5 dígitos).

:computer: [ver ejercicio 23](https://github.com/eugenia1984/Egg-FS-java/blob/master/guia5-java/Ejercicio23.java)


## Ejercicio 24

Realizar un programa que rellene un matriz de 4 x 4 de valores aleatorios y la muestre ordenada por sus columnas

:computer: [ver ejercicio 24](https://github.com/eugenia1984/Egg-FS-java/blob/master/guia5-java/Ejercicio24.java)


## Ejercicio 25

Realice un programa que compruebe si una matriz dada es anti simétrica. 

Se dice que una matriz A es anti simétrica cuando ésta es igual a su propia traspuesta, pero cambiada de signo. 

Es decir, A es anti simétrica si A = -AT. La matriz traspuesta de una matriz A se denota por AT y se obtiene cambiando sus filas por columnas (o
viceversa).


MATRIZ

```
 0  -2   4
 2   0   2
-4  -2   0
```

MATRIZ TRASPUESTA

```
 0   2  -4
-2   0  -2
 4   2   0
```

:computer: [ver ejercicio 25](https://github.com/eugenia1984/Egg-FS-java/blob/master/guia5-java/Ejercicio25.java)


## Ejercicio 26

Un cuadrado mágico 3 x 3 es una matriz 3 x 3 formada por números del 1 al 9 donde la suma de sus filas, sus columnas y sus diagonales son idénticas. 

Crear un programa que permita introducir un cuadrado por teclado y determine si este cuadrado es mágico o no. 

El programa deberá comprobar que los números introducidos son correctos, es decir, están entre el 1 y el 9.

*En vez de ingresarlos por teclado los fui asignando con Math.random()

:computer: [ver ejercicio 26](https://github.com/eugenia1984/Egg-FS-java/blob/master/guia5-java/Ejercicio26.java)


## Ejercicio 27

Dadas dos matrices cuadradas de números enteros, la matriz M de 10x10 y la matriz P de 3x3, se solicita escribir un programa en el cual se compruebe si la matriz P está
contenida dentro de la matriz M. 

Para ello se debe verificar si entre todas las submatrices de 3x3 que se pueden formar en la matriz M, desplazándose por filas o columnas, existe al menos una que coincida con la matriz P. 

En ese caso, el programa debe indicar la fila y la columna de la matriz M en la cual empieza el primer elemento de la submatriz P.

Ejemplo:

MATRIZ DE 10 X 10

```
1   26   36   47   5    6   72   81   95   10
11  12   13   21   41   22  67   20   10   61
56  78   87   90   09   90  17   12   87   67
41  87   24   56   97   74  87   42   64   35
32  76   79    1   36    5  67   96   12   11
99  13   54   88   89   90  75   12   41   76
67  78   87   45   14   22  26   42   56   78
98  45   34   23   32   56  74   16   19   18
24  67   97   46   87   13  67   89   93   24
21  68   78   98   90   67  12   41   65   12
```


MATRIZ DE 3 X 3 

```
36   5   67
89   90  75
14   22  26
```


Como podemos observar nuestra submatriz P se encuentra en la matriz M en los índices: 4,4 - 4,5 - 4,6 - 5,4 - 5,5 - 5,6 - 6,4 - 6,5 - 6,6.


:computer: [ver ejercicio 27](https://github.com/eugenia1984/Egg-FS-java/blob/master/guia5-java/Ejercicio28.java)

:computer: [ver ejercicio 27 alternativo](https://github.com/eugenia1984/Egg-FS-java/blob/master/guia5-java/Ejercicio28Opcion2.java)
