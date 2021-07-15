# Guia 5 : Introduccion a Java

## Java

Es un **lenguaje de programacion de alto nivel**. <br>

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

*public static void main(String[] args)*

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
*<tipo_de_dato> <nombre_varaible>;* <br>

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

&&and, ||or, ?:ternario

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




