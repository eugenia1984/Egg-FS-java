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

1- La relación más fuerte es la... 

a) Agregación 

b) Composición 

c) Dependencia 

d) Ninguna de las anteriores 

**Respuesta : b - composición, es una relación de vida. El tiempo de vida de un objeto está condicionado por el tiempo de visa del objeto que lo incluye; como el caso del cliente del banco, si se va se va su cuenta.** 


2- La relación más débil es la ...

a) Agregación 

b) Compisición 

c) Dependencia 

d) Ninguna de las anteriores 

**Respuesta : a - agregación**


3- La relación es entre ...

a) Clases

b) Interfaces

c) Métodos 

d) Ninguna de las anteriores 

**Respuesta : a - las clases están relacionadas unas con otras**


4- La relación se representa en una clase con un ...

a) Método 

b) constructor 

c) Atributo abjeto de esa clase 

d) Ninguna de las anteriores 

**Respuesta : c - atributo objeto de esa clase** 


5- El modificador de acceso public de los UML se representa con  un...

a) Menos (-) 

b) Más (+)

c) Numeral (#)

d) ninguna de las anteriores 


**Respuesta : b - con el más ( + )**


6- El modificador de acceso private en los UML se representa con un...

a) Menos (-)

b) Más (+)

c) Numeral (#) 

d) Ninguna de las anteriores 


**Respuesta : a - con el menos (- )**


/ / / / / / / / / / / / / / / / / / / / / / / / / / / / / / / / / / / / / / / / / / / / / / / / / / / / / / / / / / / / / / / / / / / /


# Videos

Introducción UML -> https://www.youtube.com/watch?v=KRas8Q9QAQk&list=PLgwlfcqa5h3y5vpitxQyKhiNYq3Y83Sa2 <br>

Asociación Simple -> https://www.youtube.com/watch?v=W5u4UCFFEEk&list=PLgwlfcqa5h3y5vpitxQyKhiNYq3Y83Sa2 <br>

Asociación de Agregación -> https://www.youtube.com/watch?v=cz0rRCwbh3A&list=PLgwlfcqa5h3y5vpitxQyKhiNYq3Y83Sa2&index=4 <br>

Asociación de Composición ->  https://www.youtube.com/watch?v=PqGHnyHe-kQ&list=PLgwlfcqa5h3y5vpitxQyKhiNYq3Y83Sa2&index=5 <br>


/ / / / / / / / / / / / / / / / / / / / / / / / / / / / / / / / / / / / / / / / / / / / / / / / / / / / / / / / / / / / / / / / / / / / 

# Ejercicios

## EJERCICIO  1

Realizar un programa para que una Persona pueda adoptar un Perro. Vamos a contar de dos clases. Perro, que tendrá como atributos: nombre, raza, edad y tamaño; y la clase Persona con atributos: nombre, apellido, edad, documento y Perro. <br>
Ahora deberemos en el main crear dos Personas y dos Perros. <br>
Después, vamos a tener que pensar la lógica necesaria para asignarle a cada Persona un Perro y por ultimo, mostrar desde la clase Persona, la información del Perro y de la Persona. <br>

💻 Se puede ver en la carpeta **ejercicio1** <br>

## EJERCICIO  2

Realizar el juego de la ruleta rusa de agua en Java. Como muchos saben, el juego se trata de un número de jugadores, que, con un revolver de agua, el cual posee una sola carga de agua, se dispara y se moja. Las clases a hacer del juego son las siguientes: <br>

**Clase Revolver de agua**: esta clase posee los siguientes atributos: posición actual (posición del tambor que se dispara, puede que esté el agua o no) y posición agua (la posición del tambor donde se encuentra el agua). Estas dos posiciones, se generarán aleatoriamente. <br>

Métodos: <br>

   * llenarRevolver(): le pone los valores de posición actual y de posición del agua. Los valores deben ser aleatorios.
   * mojar(): devuelve true si la posición del agua coincide con la posición actual
   * siguienteChorro(): cambia a la siguiente posición del tambor
   * toString(): muestra información del revolver (posición actual y donde está el agua)


**Clase Jugador**: esta clase posee los siguientes atributos: id (representa el número del jugador), nombre (Empezara con Jugador más su ID, “Jugador 1” por ejemplo) y mojado (indica si está mojado o no el jugador). El número de jugadores será decidido por el usuario, pero debe ser entre 1 y 6. Si no está en este rango, por defecto será 6. <br>

Métodos: <br>

   * disparo(Revolver r): el método, recibe el revolver de agua y llama a los métodos de mojar() y siguienteChorro() de Revolver. El jugador se apunta, aprieta el gatillo y si el revolver tira el agua, el jugador se moja. El atributo mojado pasa a false y el método devuelve true, sino false.
  
**Clase Juego**: esta clase posee los siguientes atributos: Jugadores (conjunto de Jugadores) y Revolver.<br>

Métodos: <br>
   * llenarJuego(ArrayList<Jugador>jugadores, Revolver r): este método recibe los jugadores y el revolver para guardarlos en los atributos del juego.
   * ronda(): cada ronda consiste en un jugador que se apunta con el revolver de agua y aprieta el gatillo. Sí el revolver tira el agua el jugador se moja y se termina el juego, sino se moja, se pasa al siguiente jugador hasta que uno se moje. Si o si alguien se tiene que mojar. Al final del juego, se debe mostrar que jugador se mojó.
Pensar la lógica necesaria para realizar esto, usando los atributos de la clase Juego.<br>
  
:computer: <br>

## EJERCICIO 3
  
Nos piden hacer un programa sobre un Cine, que tiene una sala con un conjunto de asientos (8 filas por 6 columnas). De Cine nos interesa conocer la película que se está reproduciendo, la sala con los espectadores y el precio de la entrada. Luego, de las películas nos interesa saber el título, duración, edad mínima y director. Por último, del espectador, nos interesa saber su nombre, edad y el dinero que tiene disponible. <br>
  
Para representar la sala con los espectadores vamos a utilizar una matriz. Los asientos son etiquetados por una letra y un número la fila A1 empieza al final del mapa como se muestra en la tabla. También deberemos saber si el asiento está ocupado por un espectador o no, si esta ocupado se muestra una X, sino un espacio vacío.<br>

```  
8 A X | 8 B X | 8 C X | 8 D   | 8 E X | 8 F X 
7 A X | 7 B X | 7 C X | 7 D X | 7 E   | 7 F X 
6 A   | 6 B X | 6 C   | 6 D X | 6 E X | 6 F 
5 A X | 5 B   | 5 C X | 5 D X | 5 E X | 5 F X 
4 A X | 4 B X | 4 C X | 4 D X | 4 E X | 4 F X 
3 A   | 3 B X | 3 C X | 3 D   | 3 E X | 3 F X 
2 A X | 2 B   | 2 C X | 2 D X | 2 E X | 2 F
1 A X | 1 B X | 1 C X | 1 D X | 1 E X | 1 F X  
```  
  
Se debe realizar una pequeña simulación, en la que se generen muchos espectadores y se los ubique en los asientos aleatoriamente (no se puede ubicar un espectador donde ya este ocupado el asiento).   <br>
  
Los espectadores serán ubicados de uno en uno y para ubicarlos tener en cuenta que sólo se podrá sentar a un espectador si tiene el dinero suficiente para pagar la entrada, si hay espacio libre en la sala y si tiene la edad requerida para ver la película. En caso de que el asiento este ocupado se le debe buscar uno libre.<br>
  
Al final del programa deberemos mostrar la tabla, podemos mostrarla con la letra y numero de cada asiento o solo las X y espacios vacíos.  <br>
  
:computer: <br>

## EJERCICIO 4
  
Realizar una baraja de cartas españolas orientada a objetos. Una carta tiene un número entre 1 y 12 (el 8 y el 9 no los incluimos) y un palo (espadas, bastos, oros y copas). Esta clase debe contener un método toString() que retorne el número de carta y el palo. La baraja estará compuesta por un conjunto de cartas, 40 exactamente.  <br>
  
Las operaciones que podrá realizar la baraja son: <br>
  
   * barajar(): cambia de posición todas las cartas aleatoriamente.  
   * siguienteCarta(): devuelve la siguiente carta que está en la baraja, cuando no haya más o se haya llegado al final, se indica al usuario que no hay más cartas.
   * cartasDisponibles(): indica el número de cartas que aún se puede repartir.
   * darCartas(): dado un número de cartas que nos pidan, le devolveremos ese número de cartas. En caso de que haya menos cartas que las pedidas, no devolveremos nada, pero debemos indicárselo al usuario.
   * cartasMonton(): mostramos aquellas cartas que ya han salido, si no ha salido ninguna indicárselo al usuario
   * mostrarBaraja(): muestra todas las cartas hasta el final. Es decir, si se saca una carta y luego se llama al método, este no mostrara esa primera carta.
  
 :computer: 
  
