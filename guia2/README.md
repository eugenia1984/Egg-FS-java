# Guia 2 de Full Stack con Java (Egg)

## Qué hice? 🚀

Comenzamos a ver estructuras de control: <br>

  * **Estructura secuencial**: una acción después de otra; la salida de la primera decisión es la entrada de la segunda acción y así sucesivamente una tras otra en el orden que se listan.
  * 
  * **Estructura Selectiva o de Decisión**: habrá que tomar decisiones de ejecutar o no una acción. Es para tomar decisiones lógicas, hay un nro. posible de alternativas, en base a una evalución de condición y su resultado, el algoritmo realiza una determinada acción. Las estrucutras pueden ser:<br>
**Condición Simple** <br>
**Condición Doble** <br>
**Condición Múltiple** <br>

  * **Estructura Repetitiva**: habrá que realizar repeticiones.

---

## Preguntas de aprendizaje

* 1 - Un condicional es: <br>
  a) Una sentencia que permite decidir si se ejecuta o no un bloque de código <br>
  b) Una sentencia que ejecuta otra sentencia que a su vez ejecuta la primera sentencia <br>
  c) Una sentencia que permite ejecutar un bloque de código varias veces <br>
  d) Ninguna de las anteriores <br>
  **Respuesta correcta a, porque la b refiere a un condicional anidado o en casacada y la c se refiere a estructuras repetitivas**

* 2 - En una expresión condicional se pueden utilizar: <br>
  a) Operadores lógicos y de comparación simultáneamente <br>
  b) Operadores lógicos únicamente <br>
  c) Operadores de comparación únicamente <br>
  d) Operadores lógicos o de comparación, pero nunca ambos simultáneamente <br>
  **Respuesta correcta a, porque al analizar una expresión condicional lógica (comparando la conjunción ( Y, and, &&), disyunción (O, or, ||) ó negación (NO, not)) se comparan otras relaciones lógicas o relaciones de comparación (mayor que > , mayor o igual que >= , menor que < , menor o igual que <= , igual == , distinto <> )**

* 3 - Estructuras que se aplican en problemas donde hay varias posibilidades para nuestra condición: <br>
  a) Estructura selectiva doble "si entonces /sino" <br>
  b) Estructura simple " si entonces" <br>
  c) Estructura selectiva múltiple "si múltiple" <br>
  d) Estructura selectiva en cascada (anidadas) <br>
**Respuesta correcta c, en la Condición Múltiple tenemos más de dos alternativas para elegir, una variable puede tomar varios valores. La respuesta 'a' aplica a problemas con solo dos opciones, es la Condición Doble: Si / sino. La respuesta 'b' aplica a problemas de Condición Simple: Si - entonces, lleva a cabo una acción simple y cuando se cumpla una determinada acción. La respuesta 'd' se refiere a Condición Anidada: instrucción Si para diseñar estructuras de selección que contengan más de dos alternativas.**

* 4 - Dado el siguiente pseudocódigo, en el cual la sentencia leer permite al usuario introducir un valor entero, ¿cuál será el valor final de la variable "i"? <br>
  **Algoritmo valorFinal** <br>
  **Definir i, n como entero** <br>
  **i = 0** <br>
  **leer n** <br>
  **Mientras i < n hacer** <br>
  **i = i + 1** <br>
  **Fin Mientras** <br>
  **escribir “El valor de i es”, i** <br>
  **FinAlgoritmo** <br>
  a) 0 si el valor introducido es igual o menor que 0; el valor introducido menos uno en cualquier otro caso <br>
  b) 0 si el valor introducido es igual o menor que 0; el valor introducido en cualquier otro caso <br>
  c) 0 si el valor introducido es igual o menor que 0; el valor introducido más uno en cualquier otro caso <br>
  d) Ninguna de las anteriores <br>
  **Respuesta correcta**

* 5 - Un bucle es: <br>
  a) Una sentencia que permite decidir si se ejecuta o no se ejecuta una sola vez un bloque de código <br>
  b) Una sentencia que ejecuta otra sentencia que a su vez ejecuta la primera sentencia <br>
  c) Una sentencia que permite ejecutar un bloque de código varias veces hasta que se cumpla (o deje de cumplirse) la condición asignada al bucle<br>
  d) Ninguna de las anteriores<br>
  **Respuesta correcta c**

* 6 - ¿Qué diferencia hay entre un bucle mientras y un bucle para? <br>
  a) El bucle para puede no llegar a ejecutarse nunca pero el bucle mientras siempre se ejecuta al menos una vez <br>
  b) El bucle para se ejecuta un número determinado de veces y el mientras un número indeterminado de veces. <br>
  c) El bucle para no puede convertirse en un bucle mientras, pero sí al contrario <br>
  d) El bucle mientras permite su inicialización, pero el bucle para no <br>
  **Respuesta correcta b**

* 7 - De acuerdo a la sintaxis del bucle mientras, señalar cuál es la afirmación falsa:<br>
  **Mientras condición hacer** <br>
  **sentencias** <br>
  **Fin Mientras** <br>
  a) La condición debe ser una expresión lógica <br>
  b) La condición se evalúa cada vez que se ejecuta una nueva iteración del bucle <br>
  c) Si la condición es falsa, no se ejecuta el bloque de sentencias <br>
  d) Ninguna de las anteriores es falsa <br>
  **Respuesta correcta d**

* 8 - Si, según, mientras, hacer-mientras y para son: <br>
  a) Funciones de acceso a datos <br>
  b) Instrucciones de acceso a datos <br>
  c) Sentencias de control <br>
  d) Tipos de datos <br>
  **Respuesta correcta c**

* 9 - ¿Qué diferencia hay entre un bucle mientras y un hacer-mientras? <br>
  a) El bucle hacer-mientras puede no llegar a ejecutarse nunca pero el bucle mientras siempre se ejecuta al menos una vez <br>
  b) El bucle hacer-mientras se ejecuta un número determinado de veces y el mientras un número indeterminado de veces.<br>
  c) El bucle mientras puede no llegar a ejecutarse nunca pero el hacer-mientras siempre se ejecuta al menos una vez<br>
  d) El bucle mientras permite utilizar contadores y el hacer-mientras no lo permite<br>
  **Respuesta correcta c**

* 10 - De acuerdo a la sintaxis del bucle hacer-mientras, señalar cuál es la afirmación falsa:<br>
  **Hacer** <br>
  **sentencias** <br>
  **Mientras Que condición** <br>
  a) Si condición = verdadero, entonces el bucle se sigue ejecutando <br>
  b) Aunque se cumpla condición = falso, el bucle se llega a ejecutar alguna vez <br>
  c) Si condición = falso, el bucle no se llega a ejecutar nunca <br>
  d) Ninguna de las anteriores es falsa <br>
  **Respuesta correcta d**

* 11 - La estructura repetitiva Para se caracteriza por: <br>
  a) No conocer el número de repeticiones <br>
  b) No se puede repetir más de 10000 veces <br>
  c) Conocer de antemano el número de repeticiones <br>
  d) Ninguna de las anteriores <br>
  **Respuesta correcta c**

---

## Van a encontrar todos los ejercicios realizados en PseInt en archivos subidos con el nombre guia2-ej(nro de ejercicio). Estos son los ejercicios

**Condicional Simple**

* 1 - Escriba un programa en donde se pida la edad del usuario. Si el usuario es mayor de edad se debe mostrar un mensaje por pantalla indicándolo. <br>

-Subido en archivo guia2-ej1.psc

* 2 - Un hombre desea saber si su sueldo es mayor al sueldo mínimo, el programa le pedirá al usuario su sueldo actual y el sueldo mínimo. Si el sueldo es mayor al mínimo se debe mostrar un mensaje por pantalla indicándolo. <br>

-Subido en archivo guia2-ej2.psc

**Condicional Doble**

* 3 - Realizar un programa que pida un número al usuario. Si el número es mayor que 100 se deberá de imprimir en pantalla “Es Mayor”, y en caso contrario se deberá imprimir “Es Menor”. <br>

-Subido en archivo guia2-ej3.psc

* 4 - Realiza un programa que sólo permita introducir los caracteres ‘S’ y ‘N’. Si el usuario ingresa alguno de esos dos caracteres se deberá de imprimir un mensaje por pantalla que diga “CORRECTO”, en caso contrario, se deberá imprimir “INCORRECTO”. <br>

-Subido en archivo guia2-ej4.psc

* 5 - Realizar un programa que pida un numero y determine si ese numero es par o impar. Mostrar en pantalla un mensaje que indique si el numero es par o impar. (para que un   número sea par, se debe dividir entre dos y su resto debe ser igual a 0). <br>
**Nota: investigar la función mod de Pseint.**

-Subido en archivo guia2-ej5.psc

* 6 - Realizar un programa que pida introducir solo frases o palabras de 6 caracteres. Si el usuario ingresa una frase o palabra de 6 caracteres se deberá de imprimir un mensaje por pantalla que diga “CORRECTO”, en caso contrario, se deberá imprimir “INCORRECTO”. <br>
**Nota: investigar la función Longitud() de Pseint.**

-Subido en archivo guia2-ej6.psc

* 7 - Realizar un programa que pida una frase o palabra y si la frase o palabra es de 4 caracteres de largo, el programa le concatenara un signo de exclamación al final, y si no  es de 4 caracteres el programa le concatenara un signo de interrogación al final. El programa mostrará después la frase final. <br>
**Nota: investigar la función Longitud() y Concatenar() de Pseint.**

-Subido en archivo guia2-ej7.psc

* 8 - Escriba un programa que pida 3 notas y valide si esas notas están entre 1 y 10. Si están entre esos parámetros se debe poner en verdadero una variable de tipo lógico y si no ponerla en falso. Al final el programa debe decir si las 3 notas son correctas usando la variable de tipo lógico.

* 9 - Escriba un programa que pida una frase o palabra y valide si la primera letra de esa frase es una ‘A’. Si la primera letra es una ‘A’, se deberá de imprimir un mensaje por pantalla que diga “CORRECTO”, en caso contrario, se deberá imprimir “INCORRECTO”. <br>
**Nota: investigar la función Subcadena de Pseint.**

-Subido en archivo guia2-ej9.psc

* 10 - Continuando el ejercicio anterior, ahora se pedirá una frase o palabra y se validara si la primera letra de la frase es igual a la ultima letra de la frase. Se deberá de imprimir un mensaje por pantalla que diga “CORRECTO”, en caso contrario, se deberá imprimir “INCORRECTO”.

-Subido en archivo guia2-ej10.psc

**Condicional Múltiple**


* 11 - Construir un programa que simule un menú de opciones para realizar las cuatro operaciones aritméticas básicas (suma, resta, multiplicación y división) con dos valores numéricos enteros. El usuario, además, debe especificar la operación con el primer carácter de la operación que desea realizar: ‘S' o ‘s’ para la suma, ‘R’ o ‘r’ para la resta, ‘M’ o ‘m’ para la multiplicación y ‘D’ o ‘d’ para la división.

**Condicional Anidado**

* 12 - Realizar un programa que, dado un número entero, visualice en pantalla si es par o impar. En caso de que el valor ingresado sea 0, se debe mostrar “el número no es par ni impar”. <br>
**Nota: investigar la función mod de PSeInt.**

* 13 - Escriba un programa para obtener el grado de eficiencia de un operario de una fábrica de tornillos, de acuerdo a las siguientes dos condiciones que se le imponen para un período de prueba: <br>

  * Producir menos de 200 tornillos defectuosos.
  * Producir más de 10000 tornillos sin defectos. <br>
    El grado de eficiencia se determina de la siguiente manera: <br>
  * Si no cumple ninguna de las condiciones, grado 5.
  * Si sólo cumple la primera condición, grado 6.
  * Si sólo cumple la segunda condición, grado 7.
  * Si cumple las dos condiciones, grado 8
**Nota: para trabajar este ejercicio de manera prolija, ir probando cada inciso que pide el ejercicio. No hacer todos al mismo tiempo y después probar.**

**Bucle Mientras**

* 14 - Escriba un programa que valide si una nota está entre 0 y 10, sino está entre 0 y 10 la nota se pedirá de nuevo hasta que la nota sea correcta.

* 15 - Escriba un programa en el cual se ingrese un valor límite positivo, y a continuación solicite números al usuario hasta que la suma de los números introducidos supere el límite inicial.

* 16 - Dada una secuencia de números ingresados por teclado que finaliza con un –1, por ejemplo: 5,3,0,2,4,4,0,0,2,3,6,0,......,-1; realizar un programa que calcule el promedio de los números ingresados. Suponemos que el usuario no insertará número negativos.

**bucle Hacer - Mientras Que**

* 17 - Teniendo en cuenta que la clave es “eureka”, escribir un programa que nos pida ingresar una clave. Sólo se cuenta con 3 intentos para acertar, si fallamos los 3 intentos se deberá mostrar un mensaje indicándonos que hemos agotado esos 3 intentos. Si acertamos la clave se deberá mostrar un mensaje que indique que se ha ingresado al sistema correctamente.

* 18 - Escribir un programa que lea números enteros hasta teclear 0 (cero). Al finalizar el programa se debe mostrar el máximo número ingresado, el mínimo, y el promedio de todos ellos.

**Bucle Para**

* 19 - Escribir un programa que calcule el cuadrado de los 9 primeros números naturales e imprima por pantalla el número seguido de su cuadrado. Ejemplo: “2 elevado al cuadrado es igual a 4”, y así sucesivamente.

* 20 - Realizar un programa que pida una frase y el programa deberá mostrar la frase con un espacio entre cada letra. La frase se mostrara así: **H o l a**. **Nota**: recordar el funcionamiento de la función Subcadena(). <br>
**NOTA**:. En PSeInt, si queremos escribir sin que haya saltos de línea, al final de la operación “escribir” escribimos “sin saltar”. Por ejemplo: <br>
Escribir sin saltar “Hola, ” <br>
Escribir sin saltar “cómo estás?” <br>
**Imprimirá por pantalla**: Hola, cómo estás? <br>

* 21 - Un docente de Programación tiene un listado de 3 notas registradas por cada uno de sus N estudiantes. La nota final se compone de un trabajo práctico Integrador (35%), una Exposición (25%) y un Parcial (40%). El docente requiere los siguientes informes claves de sus estudiantes: <br>

  * Nota promedio final de los estudiantes que reprobaron el curso. Un estudiante reprueba el curso si tiene una nota final inferior a 6.5. <br>
  * Porcentaje de alumnos que tienen una nota de integrador mayor a 7.5.
  * La mayor nota obtenida en las exposiciones.
  * Total de estudiantes que obtuvieron en el Parcial entre 4.0 y 7.5. El programa pedirá la cantidad de alumnos que tiene el docente y en cada alumno pedirá las 3 notas y calculará todos informes claves que requiere el docente.<br>
**Nota: para trabajar este ejercicio de manera prolija, ir probando cada inciso que pide el ejercicio. No hacer todos al mismo tiempo y después probar.**

**Bucles Anidados**

* 22 - Realizar un programa que lea un número entero (tamaño del lado) y a partir de él cree un cuadrado de asteriscos de ese tamaño. Los asteriscos sólo se verán en el borde del cuadrado, no en el interior. Por ejemplo, si se ingresa el número 4 se debe mostrar: <br>
  . . . . <br>
  . . <br>
  . . <br>
  . . . . <br>
**Nota**: Recordar el uso del escribir sin saltar en Pseint.

* 23 - Una compañía de seguros tiene contratados a n vendedores. Cada vendedor realiza múltiples ventas a la semana. La política de pagos de la compañía es que cada vendedor recibe un sueldo base más un 10% extra por comisiones de sus ventas. El gerente de la compañía desea saber, por un lado, cuánto dinero deberá pagar en la semana a cada vendedor por concepto de comisiones de las ventas realizadas, y por otro lado, cuánto deberá pagar a cada vendedor como sueldo total (sueldo base + comisiones). Para cada vendedor ingresar cuanto es su sueldo base, cuantas ventas realizó y cuanto cobró por cada venta.

## Material Extra

**Condicional Doble**

* 24 - Realizar un programa que pida tres notas y determine si un alumno aprueba o reprueba un curso, sabiendo que aprobará el curso si su promedio de tres calificaciones es mayor o igual a 70; y reprueba en caso contrario.

* 25 - Una tienda ofrece para los meses de septiembre, octubre y noviembre un descuento del 10% sobre el total de la compra que realiza un cliente. Solicitar al usuario que ingrese un mes y el importe de la compra. El programa debe calcular cuál es el monto total que se debe cobrar al cliente e imprimirlo por pantalla.

* 26 - Solicitar al usuario que ingrese dos números enteros y determinar si ambos son pares o impares. Mostrar en pantalla un mensaje que indique “Ambos números son pares” siempre y cuando cumplan con la condición. En caso contrario se deberá imprimir el siguiente mensaje “Los números no son pares, o uno de ellos no es par”. <br>
**Nota: investigar la función mod de Pseint.**

* 27 - La empresa “Te llevo a todos lados” está destinada al alquiler de autos y tiene un sistema de tarifa que consiste en cobrar el alquiler por hora. Si el cliente devuelve el auto dentro de las 2 horas de uso el valor que corresponde pagar es de $400 pesos y la nafta va de regalo. Cuando el cliente regresa a la empresa pasadas las 2 horas, se ingresan la cantidad de litros de nafta gastados y el tiempo transcurrido en horas. Luego, se le cobra 40 pesos por litro de nafta gastado, y la hora se fracciona en minutos, cobrando un total de $5,20 el minuto de uso. Realice un programa que permita registrar esa información y el total a pagar por el cliente.

**Condicional Múltiple**

* 28 - Solicitar al usuario que ingrese un valor entre 1 y 7. EL programa debe mostrar por pantalla un mensaje que indique a qué día de la semana corresponde. Considere que el número 1 corresponde al día “Lunes”, y así sucesivamente.

* 29 - Leer tres números que denoten una fecha (día, mes, año) y comprobar que sea una fecha válida. Si la fecha no es válida escribir un mensaje de error por pantalla. Si la fecha es válida se debe imprimir la fecha cambiando el número que representa el mes por su nombre. Por ejemplo: si se introduce 1 2 2006, se deberá imprimir “1 de febrero de 2006”.

* 30 - Hacer un algoritmo que lea un número por el teclado y determine si tiene tres dígitos.

**Condicionales Anidados**

* 31 - Si se compran menos de cinco llantas el precio es de $3000 cada una, si se compran entre 5 y 10 el precio es de $2500, y si se compran más de 10 el precio es $2000. Obtener la cantidad de dinero que una persona tiene que pagar por cada una de las llantas que compra, y el monto total que tiene que pagar por el total de la compra.

* 32 - Realice un programa que, dado un año, nos diga si es bisiesto o no. Un año es bisiesto bajo las siguientes condiciones: Un año divisible por 4 es bisiesto y no debe ser divisible por 100. Si un año es divisible por 100 y además es divisible por 400, también resulta bisiesto. <br>
  **Nota: recuerde la función mod de PSeInt.**

* 33 - Una verdulería ofrece las manzanas con descuento según la siguiente tabla: <br>
  Nº de kilos comprados / % desceunto <br>
  0 - 2 0% <br>
  2.01 - 5 10% <br>
  5.01 - 10 15% <br>
  10.01 en adelante 20% <br>
  Determinar cuánto pagará una persona que compre manzanas en esa verdulería.

* 34 - El promedio de los trabajos prácticos de un curso se calcula en base a cuatro notas de las cuales se elimina la nota menor y se promedian las tres notas más altas. Escriba un programa que determine cuál es la nota eliminada y el promedio de los trabajos prácticos de un estudiante.

* 35 - Una empresa tiene personal de distintas áreas con distintas condiciones de contratación y formas de pago. El departamento de contabilidad necesita calcular los sueldos semanales (lunes a viernes) en base a las 3 modalidades de sueldo: <br>
  a) comisión <br>
  b) salario fijo + comisión, y <br>
  c) salario fijo. <br>

  * a) Para la modalidad salario por comisión se debe ingresar el monto total de las ventas realizadas en la semana, y el 40% de ese monto total corresponde al salario del empleado. <br>
  * b) Para la condición de salario fijo + comisión, se debe ingresar el valor que se paga por hora, la cantidad de horas trabajadas semanalmente y el monto total de las ventas en esa semana. En este tipo de contrato las horas extras no están contempladas y se fija como máximo 40 horas por semana. La comisión por las ventas se calcula como 25% del valor de venta total.
  * c) Finalmente, para la modalidad de salario fijo se debe ingresar el valor que se paga por hora y la cantidad de horas trabajadas en la semana. En el caso de exceder las 40 horas semanales, las horas extras se deben pagar con un extra del 50% del valor de la hora. Realizar un menú de opciones para poder elegir el tipo de contrato que tiene un empleado.

**Buecle Mientras**

* 36 - Escriba un programa en el cual se ingrese un numero y mientras ese numero sea mayor de 10, se pedirá el numero de nuevo.

* 37 - Escriba un programa que solicite dos números enteros (mínimo y máximo). A continuación, se debe pedir al usuario que ingrese números enteros situados entre el máximo y mínimo. Cada vez que un numero se encuentre entre ese intervalo, se sumara uno a una variable. El programa terminará cuando se escriba un número que no pertenezca a ese intervalo, y al finalizar se debe mostrar por pantalla la cantidad de
  números ingresados dentro del intervalo.

* 38 - Escriba un programa que solicite al usuario números decimales mientras que el usuario escriba números mayores al primero que se ingresó. Por ejemplo: si el usuario ingresa como primer número un 3.1, y luego ingresa un 4, el programa debe solicitar un tercer número. El programa continuará solicitando valores sucesivamente mientras los valores ingresados sean mayores que 3.1, caso contrario, el programa finaliza.

* 39 - Calcular las calificaciones de un grupo de alumnos. La nota final de cada alumno se calcula según el siguiente criterio: la parte práctica vale el 10%; la parte de problemas vale el 50% y la parte teórica el 40%. El programa leerá el nombre del alumno, las tres notas obtenidas, mostrará el resultado por pantalla, y a continuación volverá a pedir los datos del siguiente alumno hasta que el nombre sea una cadena vacía. Las notas deben estar comprendidas entre 0 y 10, y si no están dentro de ese rango no se imprimirá el promedio y se mostrará un mensaje de error.

* 40 - Escribir un programa que calcule cuántos dígitos tiene un número entero positivo sin convertirlo a cadena (pista: se puede hacer dividiendo varias veces entre 10). <br>
**Nota: investigar la función trunc().**

**Bucle Hacer - Mientras Que**

* 41 - Realizar un programa que solicite al usuario su código de usuario (un número entero mayor que cero) y su contraseña numérica (otro número entero positivo). El programa no le debe permitir continuar hasta que introduzca como código 1024 y como contraseña 4567. El programa finaliza cuando ingresa los datos correctos.

* 42 - Se debe realizar un programa que: <br>
  1o) Pida por teclado un número (entero positivo). <br>
  2o) Pregunte al usuario si desea introducir o no otro número. <br>
  3o) Repita los pasos 1o y 2o mientras que el usuario no responda n/N (no). <br>
  4o) Muestre por pantalla la suma de los números introducidos por el usuario. <br>

* 43 - Hacer un algoritmo para calcular la media de los números pares e impares, sólo se ingresará diez números.

* 44 - Se pide escribir un programa que calcule la suma de los N primeros números pares. Es decir, si ingresamos el número 5 como valor de N, el algoritmo nos debe realizar la suma de los siguientes valores: 2+4+6+8+10.

* 45 - Programar un juego donde la computadora elige un número al azar entre 1 y 10, y a continuación el jugador tiene que adivinarlo. La estructura del programa es la siguiente: <br>
  * 1ro) El programa elige al azar un número n entre 1 y 10. <br>
  * 2do) El usuario ingresa un número x. <br>
  * 3ro) Si x no es el número exacto, el programa indica si n es más grande o más pequeño que el número ingresado.<br>
  * 4to) Repetimos desde 2) hasta que x sea igual a n.<br>
El programa tiene que imprimir los mensajes adecuados para informarle al usuario qué hacer y qué pasó hasta que adivine el número.<br>
**NOTA: Para generar un número aleatorio entre 1 y 10 se puede utilizar la función Aleatorio(limite_inferior, limite_superior) de PSeInt.**

**Buecle Para**

* 46 - Realizar un programa que muestre la cantidad de números que son múltiplos de 2 o de 3 comprendidos entre 1 y 100.

* 47 - Escribir un programa que calcule la suma de los N primeros números naturales. El valor de N se leerá por teclado.

* 48 - Siguiendo el ejercicio 20 de los ejercicios principales, ahora deberemos hacer lo mismo pero que la cadena se muestre al revés. Por ejemplo, si tenemos la cadena: Hola, deberemos mostrar **a l o H**.

**Bucles Anidados**

* 49 - Escriba un programa que lea un número entero (altura) y a partir de él cree una escalera invertida de asteriscos con esa altura. Por ejemplo, si ingresamos una altura de 5 se deberá mostrar: <br>
  . . . . . <br>
  . . . . <br>
  . . . <br>
  . . <br>
  . <br>

* 50 - La función factorial se aplica a números enteros positivos. El factorial de un número entero positivo (!n) es igual al producto de los enteros positivos desde 1 hasta n: <br>
  **n! = 1 _ 2 _ 3 _ 4 _ 5 _ (n-1) _ n** <br>
  Escriba un programa que calcule los factoriales de todos los números enteros desde el 1 hasta el 5. El programa deberá mostrar la siguiente salida: <br>
  **!1 = 1** <br>
  **!2 = 1\*2 = 2** <br>
  **...** <br>
  **!5 = 1*2*3*4*5 = 120** <br>

* 51 - Realizar un programa que calcule la siguiente sumatoria:<br>
  **1 + 1/2! + 1/3! + ... + 1/n!** <br>
  donde n es un valor entero ingresado por el usuario y n! es el factorial de ese número. <br>

* 52 - Escribir un programa que calcule los primeros 4 centros numéricos. Un centro numérico es un número que separa una lista de números enteros (comenzando en 1) en dos grupos de números, cuyas sumas son iguales. <br>
El primer centro numérico es el 6, el cual separa la lista (1 a 8) en los grupos: (1, 2, 3, 4, 5) y (7, 8) cuyas sumas son ambas iguales a 15. <br>
El segundo centro numérico es el 35, el cual separa la lista (1 a 49) en los grupos:   (1 a 34) y (36 a 49) cuyas sumas son ambas iguales a 595. <br>
**Nota: investigar que es un centro numérico en caso de no saber que es.**

---

## Por favor: 🎁

- comparte este proyecto con otros 📢
- Invita una cerveza 🍺 o un café ☕ a alguien del equipo.
- Muchas gracias 🤓.

---

## Notes

## Aprecio tu interés en este repositorio ⌨️ con ❤️ de [María Eugenia Costa](https://github.com/eugenia1984) 😊 seguime en [LinkedIn](http://www.linkedin.com/in/maríaeugeniacosta)
