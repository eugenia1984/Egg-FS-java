# Guia 1 de Full Stack con Java (Egg)

## Qué hice? 🚀
Comenzamos con pseudocódigo viendo los siguientes temas: 
* programación
* lenguaje de programación
* algoritmo (escritura, sección de acciones, primitivas secuenciales)
* programa: sus elementos: palabras reservadas, identificadores, variables y constantes, tipo de datos:
  * Entero: solo números enteros.
  * Real: números con cifras decimales. Para separar decimales se utiliza el punto. Ejemplo: 3.14
  * Carácter: cuando queremos guardar un carácter. Caracteres se encierran entre comillas simples. un carácter (unidimensional): ‘a’, 'A'.
  * Lógico: cuando necesitamos guardar una expresión lógica (verdadero o falso)
  * Cadena: cuando queremos guardar cadenas de caracteres. Cadenas se encierran entre comillas dobles. una cadena (multidimensional): “esto es una cadena”, "hola mundo"
* IDE
* codificación
* prueba y depuración
* operadores: 
  * relacionales:  >,  >=, < , <=, =, <>
  * lógicos: conjunción (Y, and, &&), disyunción (O, or, ||), negación (NO, not)  
  * algebraicos (aritméticas): suma (+), resta (-), multiplicación (*), división (/), potenciación (^), módulo (% o MOD)
* Reglas de prioridad:
  * 1 - Las operaciones que están encerradas entre paréntesis se evalúan primero. Si existen diferentes paréntesis anidados (interiores unos a otros), las expresiones más internas se evalúan primero. 
  * 2-Las operaciones aritméticas dentro de una expresión suelen seguir el siguiente orden
de prioridad: <br>
✓ operador ( ) <br>
✓ operadores unitarios (potenciación), <br>
✓ operadores *, /, % (producto, división, módulo) ✓ operadores +, – (suma y resta). <br>
  * 3- Las operaciones lógicas dentro de una expresión suelen seguir el siguiente orden de
prioridad:<br>
✓ operador ( ) <br>
✓ operador negación NO / not <br>
✓ operador conjunción Y / and / && <br>
✓ operador disyunción O / or / || <br>
En caso de coincidir varios operadores de igual prioridad en una expresión o sub
expresión encerrada entre paréntesis, el orden de prioridad en este caso es de izquierda aderecha, y a esta propiedad se denomina asociatividad.
---
## Preguntas de aprendizaje

* 1 - Los dispositivos de entrada permiten: <br>
a) Guardar datos en la computadora <br>
b) Desplegar información almacenada en el equipo <br>
c) Ingresar datos a la computadora <br>
d) Ninguna de las anteriores <br>
**Respuesta correcta C**

* 2 - Los dispositivos de salida permiten: <br>
a) Guardar datos en la computadora <br>
b) Desplegar información almacenada en el equipo <br>
c) Ingresar datos a la computadora <br> 
d) Ninguna de las anteriores <br>
**Respuesta correcta b, la A y la C refieren a los disponitivos de entrada (INPUT)**

* 3- ¿Qué es un algoritmo? <br>
a) Un conjunto de instrucciones o reglas bien definidas, ordenadas y finitas que permiten realizar una actividad mediante pasos sucesivos que no generen dudas a quien deba realizar dicha actividad <br>
b) Es una igualdad entre dos expresiones algebraicas, denominadas miembros, en las que aparecen valores conocidos o datos, y desconocidos o incógnitas, relacionados mediante operaciones <br>
c) Es una relación de variables que pueden ser cuantificadas para calcular el valor de otras de muy difícil o imposible cálculo y que suministra una solución para un problema <br>
d) Ninguna de las anteriores <br>
**Respuesta correcta a**

* 4- La prueba de escritorio se usa para:  <br>
a) Programar órdenes  <br>
b) Verificar si el algoritmo es correcto  <br>
c) Eliminar virus informáticos  <br>
d) Todas las anteriores  <br>
**Respuesta correcta b, verifica  que el algoritmo esté bien realizado, ve si está ok o debe modificarse**

* 5- Una variable es: <br>
a) Un lugar de almacenamiento, cuyo contenido podrá variar durante el proceso y finalmente se obtendrán los resultados con los datos contenidos en ellas <br>
b) Un lugar de almacenamiento, cuyo contenido no varía durante el proceso y finalmente se obtendrán los resultados con los datos contenidos en ellas <br>
c) Una palabra reservada del lenguaje de programación <br>
d) Ninguna de las anteriores <br>
**Respuesta correcta a, la b no es porque puede variar su contenido, la c no porque las palabras reservadas ejecutan una acción determinada, no son variables.**

* 6- La ejecución de la siguiente sentencia de asignación: A = “4.5”  <br>
a) A debe ser una variable de tipo real  <br>
b) A debe ser una variable de tipo entero  <br>
c) A debe ser una variable de tipo cadena  <br>
d) A puede ser tanto una variable de tipo real como de tipo cadena  <br>
**Respuesta correcta a, porque es un número decimal**

* 7- Entero, carácter, lógico y real son: <br>
a) Funciones de acceso a datos <br>
b) Instrucciones de acceso a datos <br>
c) Sentencias de control <br>
d) Tipos de datos <br>
**Respuesta correcta d**

* 8- Un operador es:   <br>
a) Un lugar de almacenamiento de datos <br>
b) Un símbolo especial que indica al compilador que se debe realizar una operación matemática o lógica <br>
c) Una variable <br>
d) Ninguna de las anteriores <br>
**Respuesta correcta b, porque la A se refiere a la memoria, la C a una variable**

* 9- Los operadores relacionales se usan en:  <br>
a) Operaciones de comparación  <br>
b) Operaciones de suma y resta  <br>
c) Operaciones de multiplicación y división  <br>
d) Ninguna de las anteriores  <br>
**Respuesta correcta a, son mayor(igual), menor(igual), igual, distinto**

* 10- Una estructura secuencial es aquella que ejecuta:  <br>
a) Una evaluación de una expresión y, dependiendo del resultado, se decide la siguiente sentencia a ejecutar  <br>
b) Una sentencia detrás de otra  <br>
c) Una repetición de un bloque de sentencias mientras sea verdadera una determinada condición  <br>
d) Ninguna de las anteriores  <br>
**Respuesta correcta**

* 11- La instrucción leer base,altura permite: <br>
a) Almacenar los datos ingresados por el usuario en algún lugar de la computadora <br>
b) Almacenar los datos ingresados por el teclado en las variables base y altura <br>
c) Almacenar tres datos ingresados por teclado en las variables leer, base y altura <br>
d) Ninguna de las anteriores <br>
**Respuesta correcta b**

* 12- La instrucción escribir "Ingrese 25 números enteros" permite: <br>
a) Visualizar en pantalla el mensaje entre comillas <br>
b) Guardar en la variable pantalla los datos ingresados por teclado <br>
c) Verificar si el algoritmo está bien hecho <br>
d) Ninguna de las anteriores <br>
**Respuesta correcta a**

* 13- Seleccione la expresión que da como resultado el valor lógico falso.

a) (4 >= 40 y 8 <= 10) o (2 < 20 o 10 > 100) <br>
(False y True) o (True o False) <br>
(False) o (True) = **True** <br>

b) (8 >= 10 o 4 <= 8) y (3 <> 10 y 10 >= 4) <br>
(False o True) y (True y True) <br>
(True) y (True) = **True** <br>

c) (8 >= 4 y 8 >= 10) o (5 = 5 y 4 < 8) <br>
(True y False) o (True y True) <br>
(False) o (True) = **True**<br>

d) (4 > 4 o 10 >= 8) y (2 > 5 o 8 < 4) <br>
(False o True) y (False o False) <br>
(True) y (False) = **False** <br>
**Respuesta correcta d**

* 14- Seleccione la expresión que da como resultado el valor lógico verdadero. <br>

a) (50 > 49 y 7 = 5) o (15 <= 14 o 10 > 100) <br>
 (True y False) o (False o False) <br>
 False o False = **False**<br>

b) (6 <> 6 o 4 = 5) y (10 > 9 y 20 <= 20) <br>
(False o False ) y ( True y True) <br>
False y True = **False**<br>

c) no(no(10 >= 8) y 1 > 3) o (2 <> 3 y 2 < 8) <br>
no(no(True) y False) o ( True y True) <br>
no(False y False) o ( True y True) <br>
no(False) o ( True) <br>
True o  True = **True** <br>

d) (4 > 2 o 7 > 6) y no(3 < 6 o 2 > 0) <br>
(True o True) y no(True o True) <br>
(True) y no(True) = **False** <br>
**Respuesta correcta c**

* 15- Si a = verdadero y b = falso, la expresión no (no (a o b) y no (a)) toma el mismo resultado que: <br>

no ( no(True o False) y no(True)) <br>
no ( no(True) y no(True)) <br>
no ( False y False) <br>
no (False) = **True**

a) a y b <br>
True y False = **False**

b) no (a o no b) <br>
no (True o no(False)) <br>
no(True o True) <br>
no(True) = **False**

c) b o (a y b) <br>
False o ( True y False) <br>
False o False = **False**

d) no (no a o b) o no b <br>
no (no(True) o False) o no(False) <br>
no (False o False) o no(False) <br>
no (False) o no(False) <br>
True o True = **True** <br>
**Respuesta correcta d**
---

## Van a encontrar todos los ejercicios realizados en PseInt, en comentario está la consigna al comienzo de cada uno.

*  1- Escribir un algoritmo en el cual se consulte al usuario que ingrese ¿cómo está el día de hoy? (soleado, nublado, lloviendo). A continuación, mostrar por pantalla un mensaje que indique “El día de hoy está ...”, completando el mensaje con el dato que ingreso el usuario. <br>
**archivo: guia1-ej1.psc**

*  2 - Conocido el número en matemática PIπpedir al usuario que ingrese el valor del radio de una circunferencia y calcular y mostrar por pantalla el área y perímetro. Recuerde que para calcular el área y el perímetro se utilizan las siguientes fórmulas: area = PI * radio2 / perimetro = 2 * PI * radio. <br>
***archivo: guia1-ej2.psc**


---
## Por favor: 🎁

* comparte este proyecto con otros 📢
* Invita una cerveza 🍺 o un café ☕ a alguien del equipo. 
* Muchas gracias 🤓.

---
## Notes
Aprecio tu interés en este repositorio ⌨️ con  ❤️ de [María Eugenia Costa](https://github.com/eugenia1984) 😊 seguime en [LinkedIn](http://www.linkedin.com/in/maríaeugeniacosta) 
---
