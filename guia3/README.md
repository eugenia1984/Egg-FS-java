# Guia 3 de Full Stack con Java (Egg)

## Qué hice? 🚀

Comenzamos a ver Subprogramas

---

## Preguntas de aprendizaje

* 1 - Un subprograma es: 

	* a) Un código especial que se utiliza para resolver distintos tipos de problemas. <br>
	* b) Un método de solucionar un problema complejo dividiéndolo en subproblemas. <br>
	* c) Un método que siempre debe retornar algún resultado. <br>
	* d) Ninguna de las anteriores. <br>

**Respuesta b. Un método muy útil para solucionar un problema complejo es dividirlo en subproblemas -problemas más sencillos— y a continuación dividir estos subproblemas en otros más simples, hasta que los problemas más pequeños sean fáciles de resolver**


* 2 - Un argumento es: 
 
	* a) El valor enviado por el programa principal al subprograma. <br>
	* b) Una variable local. <br>
	* c) El valor que recibe el subprograma enviado del programa principal. <br>
	* d) Ninguna de las anteriores. <br>

**Respuesta a. El valor que envía el algoritmo a la función.**


* 3 -	 Un parámetro es: 

	* a) El valor enviado por el programa principal al subprograma. <br>
	* b) Una variable global. <br>
	* c) El valor que recibe el subprograma enviado del programa principal. <br>
	* d) Ninguna de las anteriores. <br>

**Respuesta c. El valor que recibe el subprograma enviado del programa principal.**

* 4 -  Una variable puede pasarse como argumento a un subprograma: <br>
	* a) Sólo por valor <br>
	* b) Sólo por referencia <br>
	* c) Por valor y por referencia <br>
	* d) No puede pasarse como argumento <br>

**Respuesta c :  Una variable puede pasarse como argumento a un subprograma: por valor y por referencia**


* 5 - ¿Qué características tienen los elementos locales? 

	* a) Son visibles en su ámbito y fuera <br>
	* b) Son invisibles en su ámbito y fuera <br>
	* c) Son invisibles en su ámbito y visibles fuera <br>
	* d) Son visibles en su ámbito e invisibles fuera <br>

**Respuesta d: los elementos locales on visibles en su ámbito e invisibles fuera**


* 6 - ¿Qué características tienen los elementos globales?

	* a) Son visibles en su ámbito y fuera <br>
	* b) Son invisibles en su ámbito y fuera <br>
	* c) Son visibles en su ámbito e invisibles fuera <br>
	* d) Son invisibles en su ámbito y visibles fuera <br>

**Respuesta a: los elementos globales son visibles en su ámbito y fuera**


* 7 - Una función de un programa siempre debe 

	* a) Recibir al menos un argumento <br>
	* b) Ser llamado en el algoritmo principal <br>
	* c) Ser recursivo <br>
	* d) Ninguna de las anteriores <br>

**Respuesta b :  Una función de un programa siempre debe ser llamado en el algoritmo principal **


* 8 - Cuando se escribe una función PSeInt 

	* a) Es necesario definir el tipo de dato de la variable de retorno <br>
	* b) No es necesario definir el tipo de dato de la variable de retorno <br>
	* c) Es indiferente si el tipo de dato de la variable de retorno se define o no <br>
	* d) Ninguna de las anteriores <br>

**Respuesta a : Cuando se escribe una función PSeInt es necesario definir el tipo de dato de la variable de retorno **


---

## Ejercicios de aprendizaje

**Subprogramas: Funciones**


* 1 - Realizar una función que calcule la suma de dos números. En el algoritmo principal le pediremos al usuario los dos números para pasárselos a la función. Después la función calculará la suma y lo devolverá para imprimirlo en el algoritmo. <br>

[**-Subido en guia3-ej1.psc**](https://github.com/eugenia1984/Egg-FS-java/blob/master/guia3/practica-ejercicios/guia3-ej1.psc)


* 2 - Realizar una función que valide si un numero es impar o no. Si es impar la función debe devolver un verdadero, si no es impar debe devolver falso. Nota: la función no debe tener mensajes que digan si es par o no, eso debe pasar en el Algoritmo. <br>

[**-Subido en guia3-ej2.psc](https://github.com/eugenia1984/Egg-FS-java/blob/master/guia3/practica-ejercicios/guia3-ej2.psc)  y [guia3-ej2-opc2.psc**](https://github.com/eugenia1984/Egg-FS-java/blob/master/guia3/practica-ejercicios/guia3-ej2-opc2.psc)


* 3 - Crea una función EsMultiplo que reciba los dos números pasados por el usuario, validando que el primer numero múltiplo del segundo y devuelva verdadero si el primer numero es múltiplo del segundo, sino es múltiplo que devuelva falso. <br>

[**-Subido en guia3-ej3.psc**](https://github.com/eugenia1984/Egg-FS-java/blob/master/guia3/practica-ejercicios/guia3-ej3.psc)


* 4 - Realizar un programa que pida al usuario una frase y una letra a buscar en esa frase. La función debe devolver la cantidad de veces que encontró la letra. Nota: recordar el uso de la función Subcadena(). <br>

[**-Subido en guia3-ej4.psc**](https://github.com/eugenia1984/Egg-FS-java/blob/master/guia3/practica-ejercicios/guia3-ej4.psc)


* 5 - Realizar una función que reciba un numero ingresado por el usuario y averigüe si el numero es primo o no. Un número es primo cuando es divisible sólo por 1 y por sí mismo, por ejemplo: 2, 3, 5, 7, 11, 13, 17, etc. Nota: recordar el uso del MOD. <br>

[**-Subido en guia3-ej5.psc**](https://github.com/eugenia1984/Egg-FS-java/blob/master/guia3/practica-ejercicios/guia3-ej5.psc)


**Subprograma : procedimientos**

* 6 - Realizar un procedimiento que permita intercambiar el valor de dos variables de tipo entero. La variable A, debe terminar con el valor de la variable B. 

[**-Subido en guia3-ej6.psc**](https://github.com/eugenia1984/Egg-FS-java/blob/master/guia3/practica-ejercicios/guia3-ej6.psc)


* 7 - Crear una procedimiento que calcule la temperatura media de un día a partir de la temperatura máxima y mínima. Crear un programa principal, que utilizando un procedimiento, vaya pidiendo la temperatura máxima y mínima de n días y vaya mostrando la media de cada día. El programa pedirá el número de días que se van a introducir. 

[**-Subido en guia3-ej7.psc**](https://github.com/eugenia1984/Egg-FS-java/blob/master/guia3/practica-ejercicios/guia3-ej7.psc)


* 8 -  Realizar un procedimiento que permita realizar la división entre dos números y muestre el cociente y el resto utilizando el método de restas sucesivas. <br>
El método de división por restas sucesivas consiste en restar el dividendo con el divisor hasta obtener un resultado menor que el divisor, este resultado es el residuo, y el número de restas realizadas es el cociente. <br>
Por ejemplo: 50 / 13: <br>
50 – 13 = 37 una resta realizada <br>
37 – 13 = 24 dos restas realizadas <br>
24 – 13 = 11 tres restas realizadas <br>

Dado que 11 es menor que 13, entonces: el residuo es 11 y el cociente es 3. 

[**-Subido en guia3-ej8.psc**] (https://github.com/eugenia1984/Egg-FS-java/blob/master/guia3/practica-ejercicios/guia3-ej8.psc)

* 9 - Escribir un programa que procese una secuencia de caracteres ingresada por teclado y terminada en punto, y luego codifique la palabra o frase ingresada de la siguiente manera: cada vocal se reemplaza por el carácter que se indica en la tabla y el resto de los caracteres (incluyendo a las vocales acentuadas) se mantienen sin cambios. 

a  e  i  o  u 

@  #  $  %  * 

Realice un subprograma que reciba una secuencia de caracteres y retorne la codificación correspondiente. Utilice la estructura “según” para la transformación. 

Por ejemplo, si el usuario ingresa: Ayer, lunes, salimos a las once y 10. 

La salida del programa debería ser: @y#r, l*n#s, s@l$m%s @ l@s %nc# y 10. 

NOTA: investigue el uso de la función concatenar de PSeInt para armar la palabra/frase. 

[**-Subido en guia3-ej9.psc**](https://github.com/eugenia1984/Egg-FS-java/blob/master/guia3/practica-ejercicios/guia3-ej9.psc)



**Recursión**


* 10 - Escribir una función recursiva que devuelva la suma de los primeros N enteros. <br>

[**-Subido en guia3-ej10.psc**](https://github.com/eugenia1984/Egg-FS-java/blob/master/guia3/practica-ejercicios/guia3-ej10.psc)


**Ejercicios de aprendizaje extra**


**Funciones**

* 11 -  Realizar una función que calcule y retorne la suma de todos los divisores del número n distintos de n. El valor de n debe ser ingresado por el usuario. 

[**-Subido en guia3-ej11.psc**](https://github.com/eugenia1984/Egg-FS-java/blob/master/guia3/practica-ejercicios/guia3-ej11.psc)


* 12 - Diseñar una función que reciba un numero en forma de cadena y lo devuelva como numero entero. El programa podrá recibir números de hasta 3 dígitos. Nota: no poner números con decimales.


* 13 - Crear una función llamada “Login”, que recibe un nombre de usuario y una contraseña y que devuelve Verdadero si el nombre de usuario es “usuario1” y si la contraseña es “asdasd”. Además la función calculara el número de intentos que se ha usado para
loguearse, tenemos solo 3 intentos, si nos quedamos sin intentos la función devolverá Falso. 

[**-Subido en guia3-ej13.psc**](https://github.com/eugenia1984/Egg-FS-java/blob/master/guia3/practica-ejercicios/guia3-ej13.psc)


* 14 - Los empleados de una fábrica trabajan en dos turnos: Diurno y Nocturno. Se desea calcular el jornal diario de acuerdo con las siguientes reglas: 

a) La tarifa de las horas diurnas es de $ 90 

b) La tarifa de las horas nocturnas es de $ 125 

c) En caso de ser feriado, la tarifa se incrementa en un 10% si el turno es diurno y en un 15% si el turno es nocturno. 

El programa debe solicitar la siguiente información al usuario: el nombre del trabajador, el día de la semana, el turno (diurno o nocturno) y la cantidad de horas trabajadas. Además, debemos preguntarle al usuario si el día de la semana (lunes, martes, miércoles, etc.) era festivo o no, para poder calcular el jornal diario. Utilice una función para realizar el cálculo. <br>


* 15 - Realizar una función que calcule la suma de los dígitos de un numero. 

Ejemplo: 25 = 2 + 5 = 7 

Nota: Para obtener el último numero de un digito de 2 cifras o más debemos pensar en el resto de una división entre 10. Recordar el uso de la función Mod y Trunc. 


* 16 - Realizar una función que reciba un numero ingresado por el usuario y averigüe si el número tiene todos sus dígitos impares (ejemplo: 333, 55, etc.). Para esto vamos a tener que separar el numero en partes (si es un numero de más de un digito) y ver si cada numero es par o impar. 

Nota: recordar el uso de la función Mod y Trunc(). No podemos pasar el numero a cadena para realizar el ejercicio. 

* 17 - Realizar una función que permita obtener el término n de la sucesión de Fibonacci. La sucesión de Fibonacci es la sucesión de los siguientes números: 

1, 1, 2, 3, 5, 8, 13, 21, 34, ... 


Donde cada uno de los números se calcula sumando los dos anteriores a él. Por ejemplo: 

La sucesión del número 2 se calcula sumando (1+1)  <br>
Análogamente, la sucesión del número 3 es (1+2),  <br>
Y la del 5 es (2+3),  <br>
Y así sucesivamente…  <br>

La sucesión de Fibonacci se puede formalizar de acuerdo a la siguiente fórmula:

Fibonacci (n) = Fibonacci (n-1) + Fibonacci (n-2) para todo n > 1 <br>
Fibonacci (n) = 1 para todo n <= 1 <br>

Por lo tanto, si queremos calcular el término “n” debemos escribir una función que reciba como argumento el valor de “n” y que calcule la serie hasta llegar a ese valor. 

Para conocer más acerca de la serie de Fibonacci consultar el siguiente link:
**https://quantdare.com/numeros-de-fibonacci/** 

* 18 - Realizar una función que reciba un numero ingresado por el usuario y averigüe si el numero es capicúa o no (Por ejemplo: 12321). 

Nota: recordar el uso del MOD y el Trunc. No podemos transformar el numero a cadena para realizar el ejercicio. 


* 19 - El número de combinaciones de m elementos tomados de n es: 

( m / n) = ( m! / n! ( m - n)!) 

Diseñar una función que permita calcular el número combinatorio de (m / n) 

Nota: n debe ser mayor a 0 y menor que m. 


**Procedimientos**

* 20 -  Crea un procedimiento “convertirEspaciado”, que reciba como argumento un texto y muestra una cadena con un espacio adicional tras cada letra. 

Por ejemplo, “Hola, tú” devolverá “H o l a , t ú “. Crea un programa principal donde se use dicho procedimiento. 


* 21 - Realizar un subproceso que reciba una letra y muestre un mensaje si esa letra esta entre las letras “M” y “T”. Recordar que Pseint le da un valor numérico a cada letra a través del Código Ascii. 


* 22 - Crear un programa que dibuje una escalera de números, donde cada línea de números comience en uno y termine en el número de la línea. Solicitar la altura de la escalera al usuario al comenzar. Ejemplo: si se ingresa el número 3: 

1 <br>
12 <br>
123 <br>


* 23 - Realice un algoritmo que solicite al usuario una fecha y muestre por pantalla la fecha anterior. Para ello se deberá utilizar un procedimiento llamado diaAnterior que reciba una fecha representada a través de tres enteros dia, mes y anio, y retorne la fecha anterior. 

Puede asumir que dia, mes y anio representan una fecha válida. 

Realice pruebas de escritorio para los valores dia=5, mes=10, anio=2012 y para dia=1, mes=3, anio=2004. 


**Recursión**

* 25 - Crear un programa que calcule la suma de los enteros positivos pares desde N hasta 2. <br>
Chequear que si N es impar se muestre un mensaje de error. 


* 26 - Implemente de forma recursiva una función que le dé la vuelta a una cadena de caracteres. <br<
NOTA: Si la cadena es un palíndromo, la cadena y su inversa coincidirán.


* 27 - Realice nuevamente un programa que calcule la función de Fibonacci pero esta vez de manera recursiva.
19. 


* 28 -  Escribir un programa que calcule el máximo común divisor (MCD) de dos enteros positivos. Si M >= N una función recursiva para MCD es: 

MCD = M, si N =0 <br>
MCD = MCD (N, M mod N), si N <> 0 <br>

El programa le debe permitir al usuario ingresar los valores para M y N. Una función recursiva es entonces llamada para calcular el MCD. El programa debe imprimir el valor para el MCD.





