# Guia 8 : Relaciones entre clases

Una **relación**  es una **conexión semántica** entre **clases**.<br>
Permite que una clase *conozca los atributos, operaciones y relaciones de otras clases*. <br>
Las clases están relacionadas unas con otras. <br>

En la Programación Orientada a Objetos, un objeto se comunica con otro objeto para utilizar la funcionalidad y los servicios proporcionados por ese objetivo. <br>

La relación entre dos clases separadas se establece a través de sus objetos. <br>
Las ralaciones entre clases significan que *una clase contiene una referencia a un objeto u objetos, de la otra clase en la forma de un atributo*. <br>

---

## Asociación

Es la relación entre dos objetos.  Y puede ser : <br>

**Bidireccional** : los objetos que están al extremo de una relación pueden conocerse entre sí.<br>
Por ejemplo: <br>
Padre <-> Hijo <br>

**Unidireccional** : solamente uno de ellos conoce a otro .<br>
Por ejemplo : <br>
Curso -> Alumno <br>

Dentro de la **asociación simple** existe la **composición** y la **agregación**. <br>

### Agregación

**Una clase es instanciada por otro objeto y clase**. <br>

El momento en que dos objetos se unen para trabajar juntos y así alcanzar una meta. <br>

Ambos objetos son independientes entre sí, existen más allá de que exista o no el otro objeto al que se unen.<br>
Ambos objetos pueden sobrevivir individualmente, al borrar un objeto no afectará a la otra entidad. <br>

### Composición

Es una *relación más fuerte*, es una **relación de vida**, el tiempo de un objeto está condicionado por el tiempo de vida del objeto que lo incluye. <br>
Es un tipo de relación dependeinte en dónde un objeto más complejo es conformado por objetos más pequeños. <br>

---

## Relaciones en código

Las relaciones entre clases significan que uan clase contiene una referencia a un objeto u objetos, de la otra clase en la forma de un atributo. Pero a la hora de poner un *atributo* en una clase, debemos ver el tipo de *relación* de eas clases.<br>

El tipo de relación se ve representada a la hora de poner el objeto como forma de atributo en la clase que recibe la relación, que puede ser: <br>

**uno a uno** : por cada ubjeto tenemos una relación con un solo objeto.<br>
Por ejemplo para un *curso* tengo un *profesor*.<br>

**uno a muchos** : por cada objeto tenemos una relación con muchos onjetos de una clase. <br>
Por ejemplo, para un *curso* tengo muchos *alumnos* . <br>
Utilizamos *colecciones* y las **listas** son las colecciones más rápidas de llenar. <br>

**muchos a muchos** <br>

---

## UML (Unified Model Language / Lenguaje de Modelado Unificado)

Es un lenguaje de modelado de propósito general, que permite visualizar la forma en que se ha diseñado un sistema mediante diagramas. <br>
Es un *lenguaje visual*. <br>
Nos ayuda a representar el comportamiento y la estructura de un sistema. <br>

Hay varios diagramas, se va a hacer incapié en *diagrama de clase*.<br>

## Diagramas de clases

Para representar la estructura de un sistema mostrando las clases del sistema, sus métodos y atributos. <br>

Ayudan a identificar la relación entre diferentes clases u objetos. <br>

Cada clase está representada por un rectángulo que tiene  una subdivisión de tres compartimentos: <br>
//////////// <br>
nombre <br>
//////////// <br>
atributos <br>
///////////// <br>
métodos<br>
///////////// <br>

Hay tres tipos de modificadores: <br>

(+) para modificador de **acceso público** <br>
(#) para modificador de **acceso protected** <br>
(-) para modificar de **acceso private** <br>

Por ejemplo: <br>

//////////////////////<br>
Libro<br>
//////////////////////<br>
-String titulo <br>
-Integer ejemplares<br>
/////////////////////// <br>
+void prestamo() <br>
-void devolucion() <br>
////////////////////// <br>

### Relaciones entre clases

Se representan con flechas entre las clases. <br>
Las clases que recibe la relación de la otra clase, como un objeto de la otra clase, es la clase a la que le toca el rombo. <br>

Si el rombo está pintado es *composición* y si está vacío es *asociación*. <br>

Para representar: relación de uno a uno **(1...1)**, relación de uno a muchos **(1 ...*)**. <br>

### Herencia

Se representa con -> <br>

---

## Preguntas del aprendizaje

1- La relación más fuerte es la... <br>
a) Agregación <br>
b) Composición <br>
c) Dependencia <br>
d) Ninguna de las anteriores <br>

**Respuesta : a - composición, es una relación de vida. El tiempo de vida de un objeto está condicionado por el tiempo de visa del objeto que lo incluye; como el caso del cliente del banco, si se va se va su cuenta.** <br>

2- La relación más débil es la ...<br>
a) Agregación <br>
b) Compisición <br>
c) Dependencia <br>
d) Ninguna de las anteriores <br>

**Respuesta : a - agregación**<br>

3- La relación es entre ...<br>
a) Clases<br>
b) Interfaces<br>
c) Métodos <br>
d) Ninguna de las anteriores <br>

**Respuesta : a - las clases están relacionadas unas con otras**<br>

4- La relación se representa en una clase con un ...<br>
a) Método <br>
b) constructor <br>
c) Atributo abjeto de esa clase <br>
d) Ninguna de las anteriores <br>

**Respuesta : c - atributo objeto de esa clase** <br>

5- El modificador de acceso public de los UML se representa con  un...<br>
a) Menos (-) <br>
b) Más (+)<br>
c) Numeral (#)<br>
d) ninguna de las anteriores <br>

**Respuesta : b - con el más ( + )**

6- El modificador de acceso private en los UML se representa con un...<br>
a) Menos (-)<br>
b) Más (+)<br>
c) Numeral (#) <br>
d) Ninguna de las anteriores <br>

**Respuesta : a - con el menos (- )**<br>


/ / / / / / / / / / / / / / / / / / / / / / / / / / / / / / / / / / / / / / / / / / / / / / / / / / / / / / / / / / / / / / / 


# Videos

Introducción UML -> https://www.youtube.com/watch?v=KRas8Q9QAQk&list=PLgwlfcqa5h3y5vpitxQyKhiNYq3Y83Sa2 <br>

Asociación Simple -> https://www.youtube.com/watch?v=W5u4UCFFEEk&list=PLgwlfcqa5h3y5vpitxQyKhiNYq3Y83Sa2 <br>

Asociación de Agregación -> https://www.youtube.com/watch?v=cz0rRCwbh3A&list=PLgwlfcqa5h3y5vpitxQyKhiNYq3Y83Sa2&index=4 <br>

Asociación de Composición ->  https://www.youtube.com/watch?v=PqGHnyHe-kQ&list=PLgwlfcqa5h3y5vpitxQyKhiNYq3Y83Sa2&index=5 <br>


/ / / / / / / / / / / / / / / / / / / / / / / / / / / / / / / / / / / / / / / / / / / / / / / / / / / / / / / / / / / / / / / 

# Ejercicios

## 1

Realizar un programa para que una Persona pueda adoptar un Perro. Vamos a contar de dos clases. Perro, que tendrá como atributos: nombre, raza, edad y tamaño; y la clase Persona con atributos: nombre, apellido, edad, documento y Perro. <br>
Ahora deberemos en el main crear dos Personas y dos Perros. <br>
Después, vamos a tener que pensar la lógica necesaria para asignarle a cada Persona un Perro y por ultimo, mostrar desde la clase Persona, la información del Perro y de la Persona. <br>

💻 Se puede ver en la carpeta **ejercicio1** <br>


