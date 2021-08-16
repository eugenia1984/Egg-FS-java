# Guia 6 : programacion orientada a objetos

---

## Ejercicios

Guarde en cada carpeta un ejercicio de la guia.

---

## Teoría

Un **paradigma** es una manera o estilo de programación. 

Es un conjunto de métodos sistemáticos aplicables en todos los niveles del diseño de programas para resolver problemas. 

La **Progrmación orientada a Objetos** es un paradigma de programación, un modelo o estilo de programación que se basa en el concepto de **clases** y **objetos**. 

Se enfoca en los **objetos**, sus **atributos** y las **interacciones** que se producen entre ellos para diseñar programas. 

Hay un conjunto de objetos que se crean, interaccionan entre sí y dejan de existir cuando ya no son útiles durane la ejecución de un programa. 



## ¿ Por qué POO?

Porque el código es reutilizable, organizado y fácil de mantener. 

Sigue el principio de DRY don't repeat yourself.

Evita el acceso no deseado a los datos mediante la encapsulación y la abstracción. 


---


## Clases y Objetos

Una **clase** es un molde para crear múltiples objetos que encapsula datos ( **atributos** ) y comportamiento ( **métodos** ). 

Una clase se define con la palabra reservada **class** seguida del nombre de la clase, que debe comenzar por mayúscula. Si el nombre es compuesto, debe tilizarse UpperCamelCase. <


```JAVA
public class nombreClase{
  //atributos
  //constructores
  //metodos
}
```

Una vez que se declara una clase se pueden crear ( **instanciar** ) objetos a partir de ella. 

Por eso se dice que un objeto es una instancia de una clase. 

Pasos para INSTANCIAR OBJETOS: 

```JAVA
NombreClase nombreObjeto = new NombreClase();
```

Primero declaro la variable de alguno de los tipos de las clases definitivas. 
Segundo isntancia el objeto con new que reserva espacio en memoria para los atributos. 


---


# PREGUNTAS DE APRENDIZAJE

## 1) Responda Verdadero (V) o Falso (F)

Cuando se coloca la palabra final precediendo la declaración de una variable la misma se transforma en una constante 

Una variable local no puede ser declarada en cualquier lugar del cuerpo de una clase o método 

El método constructor de una clase puede tener cualquier nombre 

Cuando un método no devuelve ningún valor se utiliza la palabra reservada void para indicar que no devuelve nada

La palabra reservada final determina que un atributo no puede ser redefinido

La devolución de un valor a través de un método se hace con la sentencia restore


##  2) ¿Cuál es la descripción que crees que define mejor el concepto clase en la programación orientada a objetos?

a) Es un concepto similar al de array

b) Es un tipo particular de variable

c) Es un modelo o plantilla a partir de la cual creamos objetos

d) Es una categoría de datos ordenada secuencialmente


## 3) ¿Qué elementos crees que definen a un objeto?

a) Su cardinalidad y su tipo

b) Sus atributos y sus métodos

c) La forma en que establece comunicación e intercambia mensajes

d) Su interfaz y los eventos asociados


## 4) Una clase es:

a) Un molde para crear múltiples objetos

b) Un tipo de variable

c) Un tipo de modificador de acceso

d) Ninguna de las anteriores


## 5) El modificador de acceso private, hace que los datos puedan ser accedidos por

a) Cualquier clase

b) La clase donde se encuentran

c) El método main

d) Ninguna de las anteriores


## 6) ¿Qué significa instanciar una clase?

a) Duplicar una clase

b) Eliminar una clase

c) Crear un objeto a partir de la clase

d) Conectar dos clases entre sí


## 7) Queremos crear una clase Java con atributos que puedan ser accedidos, ¿qué opción elegirías como la mejor?

a) Atributos públicos

b) Atributos static

c) Atributos privados con getters y setters

d) Ninguna de las anteriores


## 8) Se crean anteponiendo la palabra static a su declaración:

a) Atributos de objeto

b) Atributos de clase estáticos

c) Variables finales

d) Ninguna de las anteriores


## 9) No puede cambiar su valor durante la ejecución del programa:

a) Atributos de objeto

b) Atributos de clase

c) Variables finales

d) Todas las anteriores


---

# EJERCICIOS DE APRENDIZAJE

## Ejercicio 1

Crear una clase llamada Libro que contenga los siguientes atributos: ISBN, Título, Autor, Número de páginas, y un constructor con todos los atributos pasados por parámetro y un constructor vacío. 

Crear un método para cargar un libro pidiendo los datos al usuario y luego informar mediante otro método el número de ISBN, el título, el autor del libro y el numero de páginas.
