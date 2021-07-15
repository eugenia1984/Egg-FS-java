# Guia 5 : Introduccion a Java


## Java

Es un **lenguaje de programacion de alto nivel**. <br>

---



## Compilador de Java

Traduce todo un programa de una sola vez. <br>
Se compila a un lenguaje intermedio (ByteCode) que es interpretado por JVM (Java Virtual Machine) del JRE (Java Runtime Enviroment) y asi es portable a distintas plataformas. <br>


## Ejecucion de una aplicacion

en Java el cñodigo fuente se guarda en archivos .java y al compilar el codigo fuente se realiza un analisis de sintaxis de codigo escrito en archivos .java y de estar ok son compilados a archivos .class <br>


## Archivo fuente en Java

Tiene la sigueinte forma:

```
<declaracion_paquete>
<declaracion_importacion>
<modificador> <declaracion_clase>
	<atributos>
	<constructores>
	<metodos>
```

El nombre del archivo fuente debe ser el mismo de la declaracion de clase publica(la mian class).<br>



## Estructura de un programa Java


```
/*
*El siguiente programa muestra un mensaje "Hola mundo" en la consola utilizando el método System.out.println()
*/

package primerprograma;

public class HolaMundo{
  public static void main(String[] args) {
     System.out.println("Hola Mundo");
  }	
}
```

Los **comentarios** van entre /* */.<br>

Los **paquetes** son contenedores de clases, son analogos a las carpetas y archivos utilizados en el sistema operativo. <br>
Se escriben en minuscula.<br>

Las **clases** moldean los objetos que serán utilizados por los programas. Una clase se forma asi: <br>

Declaracion de clase { <br>
Cuerpo de clase <br>
} <br>


Siempre tienen la palabra reservada *class* y se cierran y abren entre llaves: { }. <br>



## Métodos

Un método es una secuencia de sentencias ejecutables, y son delimitadas por las { }
. <br>


## Método Main()

El *mian()* sirve para que un programa se pueda ejecutar, es como el Algoritmo de Pseint. <br>

¿ Cómo de declara ? <br>

```
public static void main(String[] args)
```


**public** : tipo de acceso, puede ser llamado desde otras clases. <br>

**static** : un modificador que indica que la clase no necesita ser instancia para poder utilizar el método. Y dicho método es el mismo para todas las instancias que pueden crearse.<br>

**void** : el étodo main no devuelve valor. <br>

El *método main()* siempre debe aceptar *String* como parámetro. <br>



## Sentencia

Las unidades ejecutables más pequeñas de un programa (las líneas de código escrito). <br>
Tienen una *palabra clave* o *reservada* como expresiones, declaraciones de varaibles o llamadas a funciones. <br>

Todas las sentencias deben terminar con **;** . <br>



## Elementos de un programa


### Palabra reservada

Palabra dentro del lenguaje que significan la ejecucion de una instruccion determinada, por lo que no pueden ser utilizadas con otro fin. <br>


### Identificador

Los nombres que se usan para identificar cada uno de los elementos del lenguaje (nombre de variables, nombre de clases, interfaces, atributos y métodos). <br>


### Variables y Constantes


Son como pequeñas cajas que guardan informacion. <br>

Poseen un identificador (su nombre) que facilita distinguirla una de otra. <br>

Si la información que guarda no debe cambiar, entonces tenemos uan **constante**. <br>

Si los valores pueden cambiar (variar) entonces tenemos uan **variable** . <br>



## Declaracion de variables 

Siempre deben ser declaradas antes de usarse, se deben declarar al principio del programa. <br>

Su sintaxis. <br>

```
<tipo_de_dato> <nombre_varaible>;
```


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

= es de asignación simple


### Aritméticos

+suma , -resta, *multiplicacion, /division, %modulo <br>


### Unarios

+suma, -resta, ++operador de incremento, --operador de decremento,  !operador logico de negacion


### De igualdad y relacion

==igual, !=distinto, >mayor, >=mayor igual, <menor, <=menor igual.


### Condicionales

&& and , || or , ?: ternario


### De comparacion de tipo

*instance of*


---

## Tipos de instrucciones


**instuccones de inicio/fin** : para delimitar bloques de codigo. <br>


**instrucciones de asignacion* : para asignar el resultado de la evalucacion de una expresion a una variable. <br>

```
nombre_de_la_variable = expresion
```


**instrucciones de lectura** : para leer datos de un dispositivo de entrada y se asignan a una variable. <br>


**instrucciones de escritura**: escribir o mostrar mensajes o contenido de las variables en un dispositivo de salida. <br>


**instrucciones de bifurcacion**: se interrumpe el desarrollo lineal de un programa.<br>

---


## Instrucciones primitivas



### Asignacion

Permite almacenar un valor en una variable, previamente definida. <br>

```
<variable> =  <expresion>
```

Se puede definir una variable y al mismo tiempo asignarle valor: <br>

```
<tipo de variable> <variable> = <expresion>
```


Primero de evalúa la expresión de la derecha y luego se asigna el resultado a al varaible de la izquierda. <br>
El tipo de la variable y el de la expresión deben coincidir. <br>

---

## Entrada y Salida de información

### Escritura en Java

```
System.out.println();
```

Permite mostrar valores en el *output*, la interfaz gráfica de Java. <br>
Siempre entre comillas dobles (si es String) y dentro de los paréntesis, si es una variable va sin comillas. <br>

Para concetanar *mensaje* con *variable* se utiliza el + . <br>

Si se quiere escribir sin saltos de línea: <br>

```
System.out.print();
```

Va sin el *ln* por next line. <br>

### Lectura o entrada en Java

Hay muchas maneras de ingresar información en el output por teclado en nuestro programa Java. <br>

*Scanner* es una clase en el paquete *java.util* utilizada para obtener la entrada de los tipos primitivos: int, double, etc, y también String. <br>

Ejemplo: <br>

```
Scanner leer = new Scanner(System.in);
```

Para poder usar el Objeto Scanner hay que *importarlo* para poder usarlo: <br>

```
import java.util.Scanner;
```

Para crear un objeto de clase Scanner pasamos un objeto predefinido *System.in* que representa el flujo de entrada standard. <br>

Se le dio el nombre *leer* pero puede nombrarse como quieran. <br>

Para utilizar las funciones del objeto Scanner se usa el nombre que le asignamos (leer) y luego un punto (.), para llamar a los métodos del Scanner. <br>

Para leer valores numéricos de un determinado tipo de datos, la funcion que se utilizará es : <br>
**naxtT()** <br>
Por ejemplo, para leer un tipo entero: **leer.nextInt()** o para ller un double: **leer.nextDouble()**.<br>

Se puede usar cuando se define la variable. <br>

```
int numero = leer.nextInt()
```

Se puede usar como una varaible pre definida: <br>

```
int numero;
numero = leer.nextInt();
```

---


# Instrucciones de bfurcacion


## Estructuras de control

Construcciones a partir de palabras reservadas que permiten modificar el flujo de ejecución dle programa. <br>


## Estructuras condicionales

Estructuras de control que cambian el flujo de ejecución de un programa de acuerdo a si se cumple o no una condición. <br>
Cuando el flujo de control del programa llega al condicional, el programa evalúa la condición y determina el camino a seguir. <br>


### if / else

**IF** es la más básica de las estructuras de control de flujo. Se ejecuta cierta parte del código si la condición evaluada es verdadera (TRUE). <br>


```
if( condición ) {
 //sentencias
}
```


La *condición* es una expresión condicional cuyo resultado luego de la evaluación es un dato booleano, si es TRUE se ejecutan las sentencias. <br>


En el **if / else** primero se evalua la condición si es TRUE se ejecuta la sentencia1, si es false se ejecuta al sentencia2. <br>


```
if( condición ) {
 //sentencias1
} else {
 //sentencias2
}
```

En el **if / else if / else** son condiciones anidadas, primero se evalua la *condicion* si es true se ejecuta *sentencias1*, sino pasa a evaluar *condicion2* si es true se ejecuta *sentencias2* y sino pasa a ejecutar *sentencias3* dentro del *else*. <br>

```
if( condición ) {
 //sentencias1
} else if (condicion2) {
 //sentencias2
} else {
  //sentencias3	
}
```

### Switch

Evalúa el valor que tiene la variable y de acuerdo al valor que posee ejecuta las sentencias del bloque correspondiente. <br>

```
switch( varaible) {
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

**break** va detrás de cada sentencia, para cortar el switch y que se salga del bucle. <br>

Las instrucciones dentro del bloque default se ejecutan cuando la variable que se está evaluando no coincide con ninguno de los valores case. <br>


---

## Estructuras repetitivas

Cuando hay operaciones qeu deben repetirse muchas veces. <br>
Son los bucles. <br>

La *iteracion* es cuando se repite la ejecución de una secuenacia, es cada vuelta del ciclo. <br>

Todo bucle tiene una *condición* que es la que determina cuándo se repite el bucle. <br>


### While

```
while (  condicion ) {
   //sentencias
}
```

Ejecuta un bloque de instrucciones mientras se cumple una condición.<br>
La condición se comprueba *antes* de empezar a ejecutar por primera vez el bucle; por lo que si la condición es falsa, nunca se ejecuta.<br>

### Do / While

El bloque se ejecuta siempre al menos una vez, proqeu primero se ejecuta y luego se ve si se cumple con la condición. <br>

```
do {
  //sentencias
}  while ( condicion );

```

### For


Es una forma comparcta de recorrer un rango de valores cuando la cantidad de veces que se debe iterar un bloque de codigo es conocida.


```
for ( inicializacion ; terminacion ; incremento ) {
   //sentencias
}
```

*inicializacion* inicializa el bucle y se ejecuta una sola vez al iniciar el bucle. <br>

*terminacion* es la condición que permite que el bucle pase de true a false y corte, sino es un bule infinito.<br>

*incremento* se invoca luego de cada iteración, puede tanto incrementar como decrementar.<br>



## Sentencias de Salto

### Break

Sirve para abandonar una esructura de control, en : if-else , switch, for, do-while, while. <br>
cuadno se ejecuta la instrucción break, el control del programa sale de la estructura en la que encuetnra contenida y continua con el programa. <br>

### Continue

Corta la iteración en donde se encuentra el continue, pero en lugar de salir del bucle, continúa con la sigueinte iteración. <br>
Transfiere el control del programa desde la instrucción continue directamente a la cabecera del bucle: for, do-while, while. <br>

---

# Clases de utilidad

## Clase String

Cadenas de caracteres. <br>

Sus métodos: <br>

**charAt( int index)**: retorna el caracter especificado en la posicion index. <br>

**equals(String str)**: sirve para comparar si dos cadenas son iguales. Devuelve True si son iguales y false si no. <br>

**equalsIgnoreCase(String str)** :  sirve para comparar si dos cadenas son iguales, ignorando la grafía de la palabra. devuelve true si son iguales y false si no.<br>

**compareTo(string otraCadena)** : compara dos cadenas de caracteres alfabéticamente. Retorna 0 si son iguales, entero negativo si la primera es menor o entero positivo si la primera es mayor. <br>

**concat(String str)** : concatena la cadena del parámetro al final de la primera cadena. <br>

**contains(charSequence s)** : retorna si la cadena contiene la secuencia tipo char del parámetro. <br>

**endsWith(String str)** : retrna verdadero si la cadena es igual al objeto del parámetro. <br>

**indexOf(String str)** : retorna e índice de la primera ocurrencia de la cadena del parámetro. <br>

**isEmpty()** : retorna verdadero si la longitud de la cadena es 0.<br>

**length()**: retorna la longitud de la cadena. <br>

**replace(char oldChar, char newChar)** : renueva una nueva cadena reemplazando los caracteres del primer parámetro con el carácter del segundo parámetro. <br>

**split(Sting regex)** : retorna un arreglo de cadenas separadas por la cadena del parámetro. <br>

**startsWith(String prefix)** : retorna verdadero si el comienzo de la cadena es igual al prefijo del parámetro. <br>


**cubstring(int beginIndex, int endIndex)** : retorna la sub cadena desde el caracter del primer parámetro hasta el carácter del segundo parámetro. <br>

**toCharArray()** : retorna el conjunto de caracteres de la cadena. <br>

**toLowerCase()** : retorna la cadena en minúscula. <br>

**toUpperCase()** : retorna la cadena en mayúscula. <br>



jave es un lenguaje de tipado estático, para convertir cualquier tipo de dato a un String, utilizamos la función **valueOf(n)**. <br>

Ejempo: <br>

```
int numeroEntero = 4;
String numCadena = String.valueOf(numentero);
```

Si lo quiero hacer al reves: <br>

```
String numCadena = "1";
int numEntero = integer.parseInt(numCadena);
```

---

## Clase Math

Sus métodos: <br>

**abs(double a)** : devuelve el valor absoluto de un valor doble introducido como parámetro. <br>

**abs(int a)** : devuelve el valor absoluto de un valor Entero introducido como parámetro. <br>

**abs(long a)** : devuelve el valor absoluto de un valor long introducido como parámetro. <br>

**max(double a, double b)** : devuelve el mayor de dos valores dobles.<br>

**max(int a, int b)** : devuelve el mayor de dos valores Enteros. <br>

**max(long a, long b)** . devuelve el mayor de los valores long.

**min(double a, double b)** : devuelve el menor de dos valores dobles. <br>

**min(int a, int b)** : devuelve el menor de dos valores enteros.<br>

**min(long , long b)** : devuelve el menor de dos valores long.<br>

**pow(double a, double b)** : devuelve el valor del primer argumento elevado a la potencia del segundo argumento. <br>

**random()**: devuelve un doble con un signo positivo, mayor o igula que 0 y menor que 1.0 . <br>

**roud(double a)**: devuelve el long redondeado más cercano al double inroducido.<br>

**sqrt(double a)** : devuelve la raiz positiva correctamente redondeada de un doble.<br>

**floor(double a)** : devuelve el entero más cerno por debajo.<br>



## Método random() de la clase Math

Se puede usar para generar números al azar. <br>
El rango o margen con el que trabaja el método random oscila entre 0.0 y 1.0 (este último no incluido). <br>

Por lo tanto , para generar un núemro entero entre 0 y 9 hay que escribir la sentencia: <br>

```
int numero = (int) (Marth.random() * 10);
```

---

## Subprogramas

Para solucionar un problema complejo es lo mejor dividir en subproblemas ( subprogrmas ) . <br>

Divide y vencerás. <br>

El problema principal se soluciona por el correspondiente programa o algoritmo principal mientras que la solución de los subproblemas será a través de subprogrmas, conocidos como **procedimeintos** o **funciones**. <br>

Un subprograma es como un mini algoritmo. <br>


## Funciones


Son un conjunto de líneas de código encapsulados en un bloque, recibe argumentos, cuyos valores se utilizan para efectuar operaciones y adicionalmente retorna un valor. <br>

Según sus parámetros, puede recibir argumentos (algunas no reciben nada), hace usp de dichos valores recibidos como sea necesario y retorna un valor usando la instrucción **return**, si no retorna es otro tipo de función. <br>

Los tipos que pueden usarse en la función son: int, double, long, boolean, Strinf, char. <br>



```
[acceso]  [modificador]  [tipo]  nombreFuncion( [tipo] nombreArgumento, ...) {
  //bloque de instrucciones
}
```


## Procedimientos (Funciones sin retorno)


```
[acceso]  [modificador]  void  nombreFuncion( [tipo] nombreArgumento, ...) {
  //bloque de instrucciones
}
```

---

# Arreglos: Vectores y Matrices

## Vector


**Declaración y creación** <br>

```
tipo[]  arregloV = new tipo[tamanio];
```

**Asignar elementos manualmente**<br>
```
vector[0] = 5;
```

**Asigar elementos con for**<br>

```
for (int i = 0 ; i < 5 ; i++) {
  vector[i] = 5;
}
```


## Matriz

**Declaración y creación** <br>
```
tipo[] [] arregloM = new tipo[filas][columnas]:
```

**Asignar elementos** <br>
```
matriz[0][0]=6;
```

**Asigar elementos con for**<br>

```
for (int i = 0 ; i < 5 ; i++) {
  for (int j = 0 ; j < 5; j++) {
    matriz[i][j] = 6;
  }
}
```


