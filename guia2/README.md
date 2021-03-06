ENGLISH

# Guide 2 of Full Stack with Java (Egg)

## What did I do? 馃殌

We begin to see control structures: <br>

  * **Sequential structure**: one action after another; the output of the first decision is the input of the second action, and so on one after the other in the order they are listed.
  
  * **Selective or Decision Structure**: decisions will have to be made whether or not to execute an action. It is to make logical decisions, there is a no. possible of alternatives, based on a condition evaluation and its result, the algorithm performs a certain action. The structures can be: <br>
**Simple Condition** <br>
**Double Condition** <br>
**Multiple Condition**: According to (like the switch) or Yes / Else Nested8 in cascade) <br>

  * **Repetitive Structure**: it will be necessary to perform repetitions, they are the loops. for
**While**: first evaluate the condition and then execute. for
**Do While** - Run at least the first time, the condition goes last. for
**Structure For**: initialization (i,, k), completion (when the condition stops being true), increment (which varies in each iteration).


---

ESPA脩OL

# Guia 2 de Full Stack con Java (Egg)

## Qu茅 hice? 馃殌

Comenzamos a ver estructuras de control: <br>

  * **Estructura secuencial**: una acci贸n despu茅s de otra; la salida de la primera decisi贸n es la entrada de la segunda acci贸n y as铆 sucesivamente una tras otra en el orden que se listan.
  
  * **Estructura Selectiva o de Decisi贸n**: habr谩 que tomar decisiones de ejecutar o no una acci贸n. Es para tomar decisiones l贸gicas, hay un nro. posible de alternativas, en base a una evaluci贸n de condici贸n y su resultado, el algoritmo realiza una determinada acci贸n. Las estrucutras pueden ser:<br>
**Condici贸n Simple** <br>
**Condici贸n Doble** <br>
**Condici贸n M煤ltiple** : Seg煤n (como el switch) 贸 Si /Sino Anidados8en cascada) <br>

  * **Estructura Repetitiva**: habr谩 que realizar repeticiones, son los bucles. <br>
**Mientras** : primero eval煤a la condici贸n y luego ejecuta. <br>
**Hacer Mientras** : se ejecuta al menos la primera vez, la condici贸n va al final. <br>
**Estructura Para** : inicializaci贸n (i, , k), finalizaci贸n (cuando la condici贸n deja de ser true), incremento (lo que var铆a en cada iteraci贸n).
  

---

## Preguntas de aprendizaje

* 1 - Un condicional es: <br>
  a) Una sentencia que permite decidir si se ejecuta o no un bloque de c贸digo <br>
  b) Una sentencia que ejecuta otra sentencia que a su vez ejecuta la primera sentencia <br>
  c) Una sentencia que permite ejecutar un bloque de c贸digo varias veces <br>
  d) Ninguna de las anteriores <br>
  
  **Respuesta correcta a, porque la b refiere a un condicional anidado o en casacada y la c se refiere a estructuras repetitivas**


* 2 - En una expresi贸n condicional se pueden utilizar: <br>
  a) Operadores l贸gicos y de comparaci贸n simult谩neamente <br>
  b) Operadores l贸gicos 煤nicamente <br>
  c) Operadores de comparaci贸n 煤nicamente <br>
  d) Operadores l贸gicos o de comparaci贸n, pero nunca ambos simult谩neamente <br>
  
  **Respuesta correcta a, porque al analizar una expresi贸n condicional l贸gica (comparando la conjunci贸n ( Y, and, &&), disyunci贸n (O, or, ||) 贸 negaci贸n (NO, not)) se comparan otras relaciones l贸gicas o relaciones de comparaci贸n (mayor que > , mayor o igual que >= , menor que < , menor o igual que <= , igual == , distinto <> )**


* 3 - Estructuras que se aplican en problemas donde hay varias posibilidades para nuestra condici贸n: <br>
  a) Estructura selectiva doble "si entonces /sino" <br>
  b) Estructura simple " si entonces" <br>
  c) Estructura selectiva m煤ltiple "si m煤ltiple" <br>
  d) Estructura selectiva en cascada (anidadas) <br>
  
**Respuesta correcta c, en la Condici贸n M煤ltiple tenemos m谩s de dos alternativas para elegir, una variable puede tomar varios valores. La respuesta 'a' aplica a problemas con solo dos opciones, es la Condici贸n Doble: Si / sino. La respuesta 'b' aplica a problemas de Condici贸n Simple: Si - entonces, lleva a cabo una acci贸n simple y cuando se cumpla una determinada acci贸n. La respuesta 'd' se refiere a Condici贸n Anidada: instrucci贸n Si para dise帽ar estructuras de selecci贸n que contengan m谩s de dos alternativas.**


* 4 - Dado el siguiente pseudoc贸digo, en el cual la sentencia leer permite al usuario introducir un valor entero, 驴cu谩l ser谩 el valor final de la variable "i"? <br>
* 
  **Algoritmo valorFinal** <br>
  **Definir i, n como entero** <br>
  **i = 0** <br>
  **leer n** <br>
  **Mientras i < n hacer** <br>
  **i = i + 1** <br>
  **Fin Mientras** <br>
  **escribir 鈥淓l valor de i es鈥?, i** <br>
  **FinAlgoritmo** <br>
  
  a) 0 si el valor introducido es igual o menor que 0; el valor introducido menos uno en cualquier otro caso <br>
  b) 0 si el valor introducido es igual o menor que 0; el valor introducido en cualquier otro caso <br>
  c) 0 si el valor introducido es igual o menor que 0; el valor introducido m谩s uno en cualquier otro caso <br>
  d) Ninguna de las anteriores <br>
  
  **Respuesta correcta c, porque si el valor introducido es menor o igual a 0, nunca va acumplir con la condici贸n de mientras i < n (ya que i es 0 y n es un n煤mero de (0,-infinito), en cambio si n es mayor a 0 si va a cumplir con la condici贸n de mientras 0 < n va a sumar 1 a n y mosstrar谩 el resultado de esa adici贸n**


* 5 - Un bucle es: <br>
  a) Una sentencia que permite decidir si se ejecuta o no se ejecuta una sola vez un bloque de c贸digo <br>
  b) Una sentencia que ejecuta otra sentencia que a su vez ejecuta la primera sentencia <br>
  c) Una sentencia que permite ejecutar un bloque de c贸digo varias veces hasta que se cumpla (o deje de cumplirse) la condici贸n asignada al bucle<br>
  d) Ninguna de las anteriores<br>
  
  **Respuesta correcta c, la c se refiere a la estructura selectiva donde se toma desici贸n de ejecutar o no una acci贸n, la b se refiere a una estructura secuencial, la salida de la 1ra es la entrada de la 2da**


* 6 - 驴Qu茅 diferencia hay entre un bucle mientras y un bucle para? <br>
  a) El bucle para puede no llegar a ejecutarse nunca pero el bucle mientras siempre se ejecuta al menos una vez <br>
  b) El bucle para se ejecuta un n煤mero determinado de veces y el mientras un n煤mero indeterminado de veces. <br>
  c) El bucle para no puede convertirse en un bucle mientras, pero s铆 al contrario <br>
  d) El bucle mientras permite su inicializaci贸n, pero el bucle para no <br>
  
  **Respuesta correcta b, el BUCLE MIENTRAS se ejecuta siempre y cuando la condici贸n sea verdadera, no sabemos desde un principio cu谩ntas veces se ejecuta. En cambio el BUCLE PARA tiene un valor inicial, su incremento por cada iteraci贸n y un valor final, es decir que sabemos cu谩ntas veces se ejecutar谩**


* 7 - De acuerdo a la sintaxis del bucle mientras, se帽alar cu谩l es la afirmaci贸n falsa:<br>

*   **Mientras condici贸n hacer** <br>
    **sentencias** <br>
    **Fin Mientras** <br>
  
  a) La condici贸n debe ser una expresi贸n l贸gica <br>
  b) La condici贸n se eval煤a cada vez que se ejecuta una nueva iteraci贸n del bucle <br>
  c) Si la condici贸n es falsa, no se ejecuta el bloque de sentencias <br>
  d) Ninguna de las anteriores es falsa <br>
  
  **Respuesta correcta d, porque la condici贸n es una expresi贸n l贸gica, por cada iteraci贸n del bucle la condici贸n se vuelve a evaluar y si se cumple sigue ejecutando el bloque de sentencias sino sale del bloque de sentencias.**

* 8 - Si, seg煤n, mientras, hacer-mientras y para son: <br>
  a) Funciones de acceso a datos <br>
  b) Instrucciones de acceso a datos <br>
  c) Sentencias de control <br>
  d) Tipos de datos <br>
  
  **Respuesta correcta c, todas son sentencias de control, permiten que se realice una instrucci贸n y omite otras de acuerdo a la evalucaci贸n de una condici贸n.**


* 9 - 驴Qu茅 diferencia hay entre un bucle mientras y un hacer-mientras? <br>
  a) El bucle hacer-mientras puede no llegar a ejecutarse nunca pero el bucle mientras siempre se ejecuta al menos una vez <br>
  b) El bucle hacer-mientras se ejecuta un n煤mero determinado de veces y el mientras un n煤mero indeterminado de veces.<br>
  c) El bucle mientras puede no llegar a ejecutarse nunca pero el hacer-mientras siempre se ejecuta al menos una vez<br>
  d) El bucle mientras permite utilizar contadores y el hacer-mientras no lo permite<br>
  
  **Respuesta correcta c, porque en el bucle HACER MIENTRAS la evaluaci贸n l贸gica est谩 al final por lo que al menos una vez se ejecuta, en cambio en el bucle MIENTRAS la evaluaci贸n l贸gica (condici贸n a evaluar) est谩 al principio, si no se cumple no se ejecuta**


* 10 - De acuerdo a la sintaxis del bucle hacer-mientras, se帽alar cu谩l es la afirmaci贸n falsa:<br>

  **Hacer** <br>
  **sentencias** <br>
  **Mientras Que condici贸n** <br>
  
  a) Si condici贸n = verdadero, entonces el bucle se sigue ejecutando <br>
  b) Aunque se cumpla condici贸n = falso, el bucle se llega a ejecutar alguna vez <br>
  c) Si condici贸n = falso, el bucle no se llega a ejecutar nunca <br>
  d) Ninguna de las anteriores es falsa <br>
  
  **Respuesta correcta C, se ejecuta al menos la primer vez.. La a es correcta mientras que la condici贸n sea verdadera el bucle se seguir谩 ejecutando. La  b es correcta porque primero se ejecuta el bloque y luego se ve si la condici贸n se cumple, por lo que aunque al condici贸n sea falsa se va a ejecutar esa primera vez (luego chequea que es falsa y sale del bucle).**


* 11 - La estructura repetitiva Para se caracteriza por: <br>
  a) No conocer el n煤mero de repeticiones <br>
  b) No se puede repetir m谩s de 10000 veces <br>
  c) Conocer de antemano el n煤mero de repeticiones <br>
  d) Ninguna de las anteriores <br>
  
  **Respuesta correcta c, sabemos de ane mano cuantas veces itera (se repite el ciclo). La a no es correcta porque sabemos el n煤mero de repeticiones. La b es incorrecta proque no hay un m谩ximo de repeticiones.**


---

## Van a encontrar todos los ejercicios realizados en PseInt en archivos subidos con el nombre guia2-ej(nro de ejercicio). Estos son los ejercicios

**Condicional Simple**

* 1 - Escriba un programa en donde se pida la edad del usuario. Si el usuario es mayor de edad se debe mostrar un mensaje por pantalla indic谩ndolo. <br>

[**Subido en archivo guia2-ej1.psc**](https://github.com/eugenia1984/Egg-FS-java/blob/master/guia2/practica-ejercicios/guia2-ej1.psc)


* 2 - Un hombre desea saber si su sueldo es mayor al sueldo m铆nimo, el programa le pedir谩 al usuario su sueldo actual y el sueldo m铆nimo. Si el sueldo es mayor al m铆nimo se debe mostrar un mensaje por pantalla indic谩ndolo. <br>

[**Subido en archivo guia2-ej2.psc**](https://github.com/eugenia1984/Egg-FS-java/blob/master/guia2/practica-ejercicios/guia2-ej2.psc)


**Condicional Doble**

* 3 - Realizar un programa que pida un n煤mero al usuario. Si el n煤mero es mayor que 100 se deber谩 de imprimir en pantalla 鈥淓s Mayor鈥?, y en caso contrario se deber谩 imprimir 鈥淓s Menor鈥?. 

[**Subido en archivo guia2-ej3.psc**](https://github.com/eugenia1984/Egg-FS-java/blob/master/guia2/practica-ejercicios/guia2-ej3.psc)


* 4 - Realiza un programa que s贸lo permita introducir los caracteres 鈥楽鈥? y 鈥楴鈥?. Si el usuario ingresa alguno de esos dos caracteres se deber谩 de imprimir un mensaje por pantalla que diga 鈥淐ORRECTO鈥?, en caso contrario, se deber谩 imprimir 鈥淚NCORRECTO鈥?. 

[**Subido en archivo guia2-ej4.psc**](https://github.com/eugenia1984/Egg-FS-java/blob/master/guia2/practica-ejercicios/guia2-ej4.psc)


* 5 - Realizar un programa que pida un numero y determine si ese numero es par o impar. Mostrar en pantalla un mensaje que indique si el numero es par o impar. (para que un   n煤mero sea par, se debe dividir entre dos y su resto debe ser igual a 0). 

**Nota: investigar la funci贸n mod de Pseint.**

[**Subido en archivo guia2-ej5.psc**](https://github.com/eugenia1984/Egg-FS-java/blob/master/guia2/practica-ejercicios/guia2-ej5.psc)


* 6 - Realizar un programa que pida introducir solo frases o palabras de 6 caracteres. Si el usuario ingresa una frase o palabra de 6 caracteres se deber谩 de imprimir un mensaje por pantalla que diga 鈥淐ORRECTO鈥?, en caso contrario, se deber谩 imprimir 鈥淚NCORRECTO鈥?. 

**Nota: investigar la funci贸n Longitud() de Pseint.**

[**Subido en archivo guia2-ej6.psc**](https://github.com/eugenia1984/Egg-FS-java/blob/master/guia2/practica-ejercicios/guia2-ej6.psc)


* 7 - Realizar un programa que pida una frase o palabra y si la frase o palabra es de 4 caracteres de largo, el programa le concatenara un signo de exclamaci贸n al final, y si no  es de 4 caracteres el programa le concatenara un signo de interrogaci贸n al final. El programa mostrar谩 despu茅s la frase final. <br>

**Nota: investigar la funci贸n Longitud() y Concatenar() de Pseint.**

[**Subido en archivo guia2-ej7.psc**](https://github.com/eugenia1984/Egg-FS-java/blob/master/guia2/practica-ejercicios/guia2-ej7.psc)


* 8 - Escriba un programa que pida 3 notas y valide si esas notas est谩n entre 1 y 10. Si est谩n entre esos par谩metros se debe poner en verdadero una variable de tipo l贸gico y si no ponerla en falso. Al final el programa debe decir si las 3 notas son correctas usando la variable de tipo l贸gico.

[**Subido en archivo guia2-ej8.psc**](https://github.com/eugenia1984/Egg-FS-java/blob/master/guia2/practica-ejercicios/guia2-ej8.psc)


* 9 - Escriba un programa que pida una frase o palabra y valide si la primera letra de esa frase es una 鈥楢鈥?. Si la primera letra es una 鈥楢鈥?, se deber谩 de imprimir un mensaje por pantalla que diga 鈥淐ORRECTO鈥?, en caso contrario, se deber谩 imprimir 鈥淚NCORRECTO鈥?. 

**Nota: investigar la funci贸n Subcadena de Pseint.**

[**Subido en archivo guia2-ej9.psc**](https://github.com/eugenia1984/Egg-FS-java/blob/master/guia2/practica-ejercicios/guia2-ej9.psc)


* 10 - Continuando el ejercicio anterior, ahora se pedir谩 una frase o palabra y se validara si la primera letra de la frase es igual a la ultima letra de la frase. Se deber谩 de imprimir un mensaje por pantalla que diga 鈥淐ORRECTO鈥?, en caso contrario, se deber谩 imprimir 鈥淚NCORRECTO鈥?.

[**Subido en archivo guia2-ej10.psc**](https://github.com/eugenia1984/Egg-FS-java/blob/master/guia2/practica-ejercicios/guia2-ej10.psc)


**Condicional M煤ltiple**


* 11 - Construir un programa que simule un men煤 de opciones para realizar las cuatro operaciones aritm茅ticas b谩sicas (suma, resta, multiplicaci贸n y divisi贸n) con dos valores num茅ricos enteros. El usuario, adem谩s, debe especificar la operaci贸n con el primer car谩cter de la operaci贸n que desea realizar: 鈥楽' o 鈥榮鈥? para la suma, 鈥楻鈥? o 鈥榬鈥? para la resta, 鈥楳鈥? o 鈥榤鈥? para la multiplicaci贸n y 鈥楧鈥? o 鈥榙鈥? para la divisi贸n.

[**Subido en archivo guia2-ej11.psc**](https://github.com/eugenia1984/Egg-FS-java/blob/master/guia2/practica-ejercicios/guia2-ej11.psc)



**Condicional Anidado**

* 12 - Realizar un programa que, dado un n煤mero entero, visualice en pantalla si es par o impar. En caso de que el valor ingresado sea 0, se debe mostrar 鈥渆l n煤mero no es par ni impar鈥?. 

**Nota: investigar la funci贸n mod de PSeInt.**

[**Subido en archivo guia2-ej12.psc**](https://github.com/eugenia1984/Egg-FS-java/blob/master/guia2/practica-ejercicios/guia2-ej12.psc)


* 13 - Escriba un programa para obtener el grado de eficiencia de un operario de una f谩brica de tornillos, de acuerdo a las siguientes dos condiciones que se le imponen para un per铆odo de prueba: <br>

  * Producir menos de 200 tornillos defectuosos.
  * Producir m谩s de 10000 tornillos sin defectos. <br>
    El grado de eficiencia se determina de la siguiente manera: <br>
  * Si no cumple ninguna de las condiciones, grado 5.
  * Si s贸lo cumple la primera condici贸n, grado 6.
  * Si s贸lo cumple la segunda condici贸n, grado 7.
  * Si cumple las dos condiciones, grado 8
  
**Nota: para trabajar este ejercicio de manera prolija, ir probando cada inciso que pide el ejercicio. No hacer todos al mismo tiempo y despu茅s probar.**

[**Subido en archivo guia2-ej13.psc**](https://github.com/eugenia1984/Egg-FS-java/blob/master/guia2/practica-ejercicios/guia2-ej13.psc)


**Bucle Mientras**

* 14 - Escriba un programa que valide si una nota est谩 entre 0 y 10, sino est谩 entre 0 y 10 la nota se pedir谩 de nuevo hasta que la nota sea correcta.

[**Subido en archivo guia2-ej14.psc**](https://github.com/eugenia1984/Egg-FS-java/blob/master/guia2/practica-ejercicios/guia2-ej14.psc)


* 15 - Escriba un programa en el cual se ingrese un valor l铆mite positivo, y a continuaci贸n solicite n煤meros al usuario hasta que la suma de los n煤meros introducidos supere el l铆mite inicial.

[**Subido en archivo guia2-ej15.psc**](https://github.com/eugenia1984/Egg-FS-java/blob/master/guia2/practica-ejercicios/guia2-ej15.psc)


* 16 - Dada una secuencia de n煤meros ingresados por teclado que finaliza con un 鈥?1, por ejemplo: 5,3,0,2,4,4,0,0,2,3,6,0,......,-1; realizar un programa que calcule el promedio de los n煤meros ingresados. Suponemos que el usuario no insertar谩 n煤mero negativos.

[**Subido en archivo guia2-ej16.psc**](https://github.com/eugenia1984/Egg-FS-java/blob/master/guia2/practica-ejercicios/guia2-ej16.psc)


**bucle Hacer - Mientras Que**


* 17 - Teniendo en cuenta que la clave es 鈥渆ureka鈥?, escribir un programa que nos pida ingresar una clave. S贸lo se cuenta con 3 intentos para acertar, si fallamos los 3 intentos se deber谩 mostrar un mensaje indic谩ndonos que hemos agotado esos 3 intentos. Si acertamos la clave se deber谩 mostrar un mensaje que indique que se ha ingresado al sistema correctamente.

[**Subido en archivo guia2-ej17.psc**](https://github.com/eugenia1984/Egg-FS-java/blob/master/guia2/practica-ejercicios/guia2-ej17.psc)


* 18 - Escribir un programa que lea n煤meros enteros hasta teclear 0 (cero). Al finalizar el programa se debe mostrar el m谩ximo n煤mero ingresado, el m铆nimo, y el promedio de todos ellos.

[**Subido en archivo guia2-ej18.psc**](https://github.com/eugenia1984/Egg-FS-java/blob/master/guia2/practica-ejercicios/guia2-ej18.psc)


**Bucle Para**

* 19 - Escribir un programa que calcule el cuadrado de los 9 primeros n煤meros naturales e imprima por pantalla el n煤mero seguido de su cuadrado. Ejemplo: 鈥?2 elevado al cuadrado es igual a 4鈥?, y as铆 sucesivamente.

[**Subido en archivo guia2-ej19.psc**](https://github.com/eugenia1984/Egg-FS-java/blob/master/guia2/practica-ejercicios/guia2-ej19.psc)



* 20 - Realizar un programa que pida una frase y el programa deber谩 mostrar la frase con un espacio entre cada letra. La frase se mostrara as铆: **H o l a**. **Nota**: recordar el funcionamiento de la funci贸n Subcadena(). <br>
**NOTA**:. En PSeInt, si queremos escribir sin que haya saltos de l铆nea, al final de la operaci贸n 鈥渆scribir鈥? escribimos 鈥渟in saltar鈥?. Por ejemplo: <br>
Escribir sin saltar 鈥淗ola, 鈥? <br>
Escribir sin saltar 鈥渃贸mo est谩s?鈥? <br>
**Imprimir谩 por pantalla**: Hola, c贸mo est谩s? <br>

[**Subido en archivo guia2-ej20.psc**](https://github.com/eugenia1984/Egg-FS-java/blob/master/guia2/practica-ejercicios/guia2-ej20.psc)


* 21 - Un docente de Programaci贸n tiene un listado de 3 notas registradas por cada uno de sus N estudiantes. La nota final se compone de un trabajo pr谩ctico Integrador (35%), una Exposici贸n (25%) y un Parcial (40%). El docente requiere los siguientes informes claves de sus estudiantes: <br>

  * Nota promedio final de los estudiantes que reprobaron el curso. Un estudiante reprueba el curso si tiene una nota final inferior a 6.5. <br>
  * Porcentaje de alumnos que tienen una nota de integrador mayor a 7.5.
  * La mayor nota obtenida en las exposiciones.
  * Total de estudiantes que obtuvieron en el Parcial entre 4.0 y 7.5. El programa pedir谩 la cantidad de alumnos que tiene el docente y en cada alumno pedir谩 las 3 notas y calcular谩 todos informes claves que requiere el docente.<br>
**Nota: para trabajar este ejercicio de manera prolija, ir probando cada inciso que pide el ejercicio. No hacer todos al mismo tiempo y despu茅s probar.**

[**Subido en archivo guia2-ej21.psc**](https://github.com/eugenia1984/Egg-FS-java/blob/master/guia2/practica-ejercicios/guia2-ej21.psc)


**Bucles Anidados**

* 22 - Realizar un programa que lea un n煤mero entero (tama帽o del lado) y a partir de 茅l cree un cuadrado de asteriscos de ese tama帽o. Los asteriscos s贸lo se ver谩n en el borde del cuadrado, no en el interior. Por ejemplo, si se ingresa el n煤mero 4 se debe mostrar: <br>
  . . . . <br>
  . . <br>
  . . <br>
  . . . . <br>
**Nota**: Recordar el uso del escribir sin saltar en Pseint.

[**Subido en archivo guia2-ej22.psc**](https://github.com/eugenia1984/Egg-FS-java/blob/master/guia2/practica-ejercicios/guia2-ej22.psc)


* 23 - Una compa帽铆a de seguros tiene contratados a n vendedores. Cada vendedor realiza m煤ltiples ventas a la semana. La pol铆tica de pagos de la compa帽铆a es que cada vendedor recibe un sueldo base m谩s un 10% extra por comisiones de sus ventas. El gerente de la compa帽铆a desea saber, por un lado, cu谩nto dinero deber谩 pagar en la semana a cada vendedor por concepto de comisiones de las ventas realizadas, y por otro lado, cu谩nto deber谩 pagar a cada vendedor como sueldo total (sueldo base + comisiones). Para cada vendedor ingresar cuanto es su sueldo base, cuantas ventas realiz贸 y cuanto cobr贸 por cada venta.

[**Subido en archivo guia2-ej23.psc**](https://github.com/eugenia1984/Egg-FS-java/blob/master/guia2/practica-ejercicios/guia2-ej23.psc)


## Material Extra


**Condicional Doble**

* 24 - Realizar un programa que pida tres notas y determine si un alumno aprueba o reprueba un curso, sabiendo que aprobar谩 el curso si su promedio de tres calificaciones es mayor o igual a 70; y reprueba en caso contrario.

[**Subido en archivo Ejercicio24.psc**](https://github.com/eugenia1984/Egg-FS-java/blob/master/guia2/practica-ejercicios/Ejercicio24.psc)


* 25 - Una tienda ofrece para los meses de septiembre, octubre y noviembre un descuento del 10% sobre el total de la compra que realiza un cliente. Solicitar al usuario que ingrese un mes y el importe de la compra. El programa debe calcular cu谩l es el monto total que se debe cobrar al cliente e imprimirlo por pantalla.

[**Subido en archivo Ejercicio25.psc**](https://github.com/eugenia1984/Egg-FS-java/blob/master/guia2/practica-ejercicios/Ejercicio25.psc)


* 26 - Solicitar al usuario que ingrese dos n煤meros enteros y determinar si ambos son pares o impares. 

Mostrar en pantalla un mensaje que indique 鈥淎mbos n煤meros son pares鈥? siempre y cuando cumplan con la condici贸n. En caso contrario se deber谩 imprimir el siguiente mensaje 鈥淟os n煤meros no son pares, o uno de ellos no es par鈥?. 

**Nota: investigar la funci贸n mod de Pseint.**

[**Subido en archivo Ejercicio26.psc**](https://github.com/eugenia1984/Egg-FS-java/blob/master/guia2/practica-ejercicios/Ejercicio26.psc)


* 27 - La empresa 鈥淭e llevo a todos lados鈥? est谩 destinada al alquiler de autos y tiene un sistema de tarifa que consiste en cobrar el alquiler por hora. Si el cliente devuelve el auto dentro de las 2 horas de uso el valor que corresponde pagar es de $400 pesos y la nafta va de regalo. Cuando el cliente regresa a la empresa pasadas las 2 horas, se ingresan la cantidad de litros de nafta gastados y el tiempo transcurrido en horas. Luego, se le cobra 40 pesos por litro de nafta gastado, y la hora se fracciona en minutos, cobrando un total de $5,20 el minuto de uso. Realice un programa que permita registrar esa informaci贸n y el total a pagar por el cliente.

[**Subido en archivo Ejercicio27.psc**](https://github.com/eugenia1984/Egg-FS-java/blob/master/guia2/practica-ejercicios/Ejercicio27.psc)


**Condicional M煤ltiple**


* 28 - Solicitar al usuario que ingrese un valor entre 1 y 7. El programa debe mostrar por pantalla un mensaje que indique a qu茅 d铆a de la semana corresponde. Considere que el n煤mero 1 corresponde al d铆a 鈥淟unes鈥?, y as铆 sucesivamente.

[**Subido en archivo Ejercicio28.psc**](https://github.com/eugenia1984/Egg-FS-java/blob/master/guia2/practica-ejercicios/Ejercicio28.psc)


* 29 - Leer tres n煤meros que denoten una fecha (d铆a, mes, a帽o) y comprobar que sea una fecha v谩lida. Si la fecha no es v谩lida escribir un mensaje de error por pantalla. Si la fecha es v谩lida se debe imprimir la fecha cambiando el n煤mero que representa el mes por su nombre. Por ejemplo: si se introduce 1 2 2006, se deber谩 imprimir 鈥?1 de febrero de 2006鈥?.

[**Subido en archivo Ejercicio29.psc**](https://github.com/eugenia1984/Egg-FS-java/blob/master/guia2/practica-ejercicios/Ejercicio29.psc)


* 30 - Hacer un algoritmo que lea un n煤mero por el teclado y determine si tiene tres d铆gitos.

[**Subido en archivo Ejercicio30.psc**](https://github.com/eugenia1984/Egg-FS-java/blob/master/guia2/practica-ejercicios/Ejercicio30.psc)


**Condicionales Anidados**

* 31 - Si se compran menos de cinco llantas el precio es de $3000 cada una, si se compran entre 5 y 10 el precio es de $2500, y si se compran m谩s de 10 el precio es $2000. Obtener la cantidad de dinero que una persona tiene que pagar por cada una de las llantas que compra, y el monto total que tiene que pagar por el total de la compra.


[**Subido en archivo Ejercicio31.psc**](https://github.com/eugenia1984/Egg-FS-java/blob/master/guia2/practica-ejercicios/Ejercicio31.psc)


* 32 - Realice un programa que, dado un a帽o, nos diga si es bisiesto o no. Un a帽o es bisiesto bajo las siguientes condiciones: Un a帽o divisible por 4 es bisiesto y no debe ser divisible por 100. Si un a帽o es divisible por 100 y adem谩s es divisible por 400, tambi茅n resulta bisiesto. 

**Nota: recuerde la funci贸n mod de PSeInt.**

[**Subido en archivo Ejercicio32.psc**](https://github.com/eugenia1984/Egg-FS-java/blob/master/guia2/practica-ejercicios/Ejercicio32.psc)

* 33 - Una verduler铆a ofrece las manzanas con descuento seg煤n la siguiente tabla: 

| N潞 de kilos comprados | % descuento |
| --------------------- | ----------- |
| 0 - 2 | 0% |
| 2.01 - 5 | 10% |
| 5.01 - 10 | 15% |
| 10.01 en adelante | 20% |

Determinar cu谩nto pagar谩 una persona que compre manzanas en esa verduler铆a.


[**Subido en archivo Ejercicio33.psc**](https://github.com/eugenia1984/Egg-FS-java/blob/master/guia2/practica-ejercicios/Ejercicio33.psc)


* 34 - El promedio de los trabajos pr谩cticos de un curso se calcula en base a cuatro notas de las cuales se elimina la nota menor y se promedian las tres notas m谩s altas. Escriba un programa que determine cu谩l es la nota eliminada y el promedio de los trabajos pr谩cticos de un estudiante.

[**Subido en archivo Ejercicio34.psc**](https://github.com/eugenia1984/Egg-FS-java/blob/master/guia2/practica-ejercicios/Ejercicio34.psc)


* 35 - Una empresa tiene personal de distintas 谩reas con distintas condiciones de contrataci贸n y formas de pago. El departamento de contabilidad necesita calcular los sueldos semanales (lunes a viernes) en base a las 3 modalidades de sueldo: <br>
  a) comisi贸n <br>
  b) salario fijo + comisi贸n, y <br>
  c) salario fijo. <br>

  * a) Para la modalidad salario por comisi贸n se debe ingresar el monto total de las ventas realizadas en la semana, y el 40% de ese monto total corresponde al salario del empleado. <br>
  * b) Para la condici贸n de salario fijo + comisi贸n, se debe ingresar el valor que se paga por hora, la cantidad de horas trabajadas semanalmente y el monto total de las ventas en esa semana. En este tipo de contrato las horas extras no est谩n contempladas y se fija como m谩ximo 40 horas por semana. La comisi贸n por las ventas se calcula como 25% del valor de venta total.
  * c) Finalmente, para la modalidad de salario fijo se debe ingresar el valor que se paga por hora y la cantidad de horas trabajadas en la semana. En el caso de exceder las 40 horas semanales, las horas extras se deben pagar con un extra del 50% del valor de la hora. Realizar un men煤 de opciones para poder elegir el tipo de contrato que tiene un empleado.

[**Subido en archivo Ejercicio35.psc**](https://github.com/eugenia1984/Egg-FS-java/blob/master/guia2/practica-ejercicios/Ejercicio35.psc)

**Bucle Mientras**


* 36 - Escriba un programa en el cual se ingrese un numero y mientras ese numero sea mayor de 10, se pedir谩 el numero de nuevo.

[**Subido en archivo Ejercicio36.psc**](https://github.com/eugenia1984/Egg-FS-java/blob/master/guia2/practica-ejercicios/Ejercicio36.psc)

* 37 - Escriba un programa que solicite dos n煤meros enteros (m铆nimo y m谩ximo). A continuaci贸n, se debe pedir al usuario que ingrese n煤meros enteros situados entre el m谩ximo y m铆nimo. Cada vez que un numero se encuentre entre ese intervalo, se sumara uno a una variable. El programa terminar谩 cuando se escriba un n煤mero que no pertenezca a ese intervalo, y al finalizar se debe mostrar por pantalla la cantidad de n煤meros ingresados dentro del intervalo.


* 38 - Escriba un programa que solicite al usuario n煤meros decimales mientras que el usuario escriba n煤meros mayores al primero que se ingres贸. Por ejemplo: si el usuario ingresa como primer n煤mero un 3.1, y luego ingresa un 4, el programa debe solicitar un tercer n煤mero. El programa continuar谩 solicitando valores sucesivamente mientras los valores ingresados sean mayores que 3.1, caso contrario, el programa finaliza.


* 39 - Calcular las calificaciones de un grupo de alumnos. La nota final de cada alumno se calcula seg煤n el siguiente criterio: la parte pr谩ctica vale el 10%; la parte de problemas vale el 50% y la parte te贸rica el 40%. El programa leer谩 el nombre del alumno, las tres notas obtenidas, mostrar谩 el resultado por pantalla, y a continuaci贸n volver谩 a pedir los datos del siguiente alumno hasta que el nombre sea una cadena vac铆a. Las notas deben estar comprendidas entre 0 y 10, y si no est谩n dentro de ese rango no se imprimir谩 el promedio y se mostrar谩 un mensaje de error.


* 40 - Escribir un programa que calcule cu谩ntos d铆gitos tiene un n煤mero entero positivo sin convertirlo a cadena (pista: se puede hacer dividiendo varias veces entre 10). <br>
**Nota: investigar la funci贸n trunc().**


**Bucle Hacer - Mientras Que**


* 41 - Realizar un programa que solicite al usuario su c贸digo de usuario (un n煤mero entero mayor que cero) y su contrase帽a num茅rica (otro n煤mero entero positivo). El programa no le debe permitir continuar hasta que introduzca como c贸digo 1024 y como contrase帽a 4567. El programa finaliza cuando ingresa los datos correctos.


* 42 - Se debe realizar un programa que: <br>
  1o) Pida por teclado un n煤mero (entero positivo). <br>
  2o) Pregunte al usuario si desea introducir o no otro n煤mero. <br>
  3o) Repita los pasos 1o y 2o mientras que el usuario no responda n/N (no). <br>
  4o) Muestre por pantalla la suma de los n煤meros introducidos por el usuario. <br>


* 43 - Hacer un algoritmo para calcular la media de los n煤meros pares e impares, s贸lo se ingresar谩 diez n煤meros.


* 44 - Se pide escribir un programa que calcule la suma de los N primeros n煤meros pares. Es decir, si ingresamos el n煤mero 5 como valor de N, el algoritmo nos debe realizar la suma de los siguientes valores: 2+4+6+8+10.


* 45 - Programar un juego donde la computadora elige un n煤mero al azar entre 1 y 10, y a continuaci贸n el jugador tiene que adivinarlo. La estructura del programa es la siguiente: <br>
  * 1ro) El programa elige al azar un n煤mero n entre 1 y 10. <br>
  * 2do) El usuario ingresa un n煤mero x. <br>
  * 3ro) Si x no es el n煤mero exacto, el programa indica si n es m谩s grande o m谩s peque帽o que el n煤mero ingresado.<br>
  * 4to) Repetimos desde 2) hasta que x sea igual a n.<br>
El programa tiene que imprimir los mensajes adecuados para informarle al usuario qu茅 hacer y qu茅 pas贸 hasta que adivine el n煤mero.<br>
**NOTA: Para generar un n煤mero aleatorio entre 1 y 10 se puede utilizar la funci贸n Aleatorio(limite_inferior, limite_superior) de PSeInt.**


**Bucle Para**


* 46 - Realizar un programa que muestre la cantidad de n煤meros que son m煤ltiplos de 2 o de 3 comprendidos entre 1 y 100.


* 47 - Escribir un programa que calcule la suma de los N primeros n煤meros naturales. El valor de N se leer谩 por teclado.


* 48 - Siguiendo el ejercicio 20 de los ejercicios principales, ahora deberemos hacer lo mismo pero que la cadena se muestre al rev茅s. Por ejemplo, si tenemos la cadena: Hola, deberemos mostrar **a l o H**.


**Bucles Anidados**


* 49 - Escriba un programa que lea un n煤mero entero (altura) y a partir de 茅l cree una escalera invertida de asteriscos con esa altura. Por ejemplo, si ingresamos una altura de 5 se deber谩 mostrar: <br>
  . . . . . <br>
  . . . . <br>
  . . . <br>
  . . <br>
  . <br>


* 50 - La funci贸n factorial se aplica a n煤meros enteros positivos. El factorial de un n煤mero entero positivo (!n) es igual al producto de los enteros positivos desde 1 hasta n: <br>
  **n! = 1 _ 2 _ 3 _ 4 _ 5 _ (n-1) _ n** <br>
  Escriba un programa que calcule los factoriales de todos los n煤meros enteros desde el 1 hasta el 5. El programa deber谩 mostrar la siguiente salida: <br>
  **!1 = 1** <br>
  **!2 = 1\*2 = 2** <br>
  **...** <br>
  **!5 = 1*2*3*4*5 = 120** <br>


* 51 - Realizar un programa que calcule la siguiente sumatoria:<br>
  **1 + 1/2! + 1/3! + ... + 1/n!** <br>
  donde n es un valor entero ingresado por el usuario y n! es el factorial de ese n煤mero. <br>


* 52 - Escribir un programa que calcule los primeros 4 centros num茅ricos. Un centro num茅rico es un n煤mero que separa una lista de n煤meros enteros (comenzando en 1) en dos grupos de n煤meros, cuyas sumas son iguales. <br>
El primer centro num茅rico es el 6, el cual separa la lista (1 a 8) en los grupos: (1, 2, 3, 4, 5) y (7, 8) cuyas sumas son ambas iguales a 15. <br>
El segundo centro num茅rico es el 35, el cual separa la lista (1 a 49) en los grupos:   (1 a 34) y (36 a 49) cuyas sumas son ambas iguales a 595. <br>
**Nota: investigar que es un centro num茅rico en caso de no saber que es.**

---

## Por favor: 馃巵

- comparte este proyecto con otros 馃摙
- Invita una cerveza 馃嵑 o un caf茅 鈽? a alguien del equipo.
- Muchas gracias 馃.

---

## Notas

## Aprecio tu inter茅s en este repositorio 鈱笍 con 鉂わ笍 de [Mar铆a Eugenia Costa](https://github.com/eugenia1984) 馃槉 seguime en [LinkedIn](http://www.linkedin.com/in/mar铆aeugeniacosta)
