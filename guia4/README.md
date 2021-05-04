# Guia 4 de Full Stack con Java (Egg)

## Qué hice? 🚀

Comenzamos a ver Arreglos: unidimensionales (vectores) , bidimensionales (matrices) y multidimencionales. <br>
También vimos matrices


---

## Preguntas de aprendizaje

* 1 -  Dada la siguiente sentencia correcta: uno[dos] = verdadero, se puede afirmar…
	a) dos es una variable de tipo lógico
	b) uno es una variable de tipo lógico
	c) uno es una variable de tipo de vector de lógico
	d) dos es una variable de tipo vector de lógico

**La respuesta correcta es la B.**

* 2 - Dada la siguiente sentencia correcta: uno[dos] = “auto”, se puede afirmar...
	a) uno es una variable de tipo de vector de carácter
	b) uno es una variable de tipo carácter
	c) dos es una variable de tipo entero
	d) dos es una variable de tipo vector de carácter

**La respuesta correcta es la C. A es falso. B es faldo porque caracter es una sola letra. D es falso.**

* 3 - Señale cuál de las siguientes afirmaciones es verdadera:
	a) Los vectores sólo almacenan elementos del mismo tipo
	b) Las cadenas se implementan como un arreglo de caracteres
	c) Los vectores pueden almacenar datos de distinto tipo
	d) Los vectores no pueden pasarse como parámetro a un subprograma
	
**La respuesta correcta es la A, los vectores solo almacenan elementos del mismo tipo.**

* 4 - Para sumar dos matrices de orden 3x3:
	a) Se requieren dos bucles
	b) Se requieren tres bucles
	c) Sólo se requiere un bucle
	d) No requiere ningún bucle

**La respuesta correcta es la A, pueden ser solo 2 matrices porque el tercer bucle puede ser la suma de las dos anteriores.**

* 5 - Indique cuál de las siguientes sentencias es verdadera:
	a) Un arreglo es una estructura de datos heterogénea
	b) Un arreglo es una estructura de datos homogénea
	c) Los arreglos no pueden tener más de tres dimensiones.
	d) Ninguna de las anteriores
	
**La respuesta corrrecta es la A, porque dentro de un arreglo sus elementos deben ser del mismo tipo**

* 6 - Para recorrer una matriz de orden NxMxP:
	a) Se requieren dos bucles
	b) Sólo se requiere un bucle
	c) Se requieren tres bucles
	d) No requiere ningún bucle
	
**La respuesta correcta es la C, se requiere el orden de 3 x 3, y tenemos: fila, columna y profundidad**

* 7 - Un subíndice puede ser representado por:
	a) Una variable de tipo entero
	b) Una constante numérica de tipo entero
	c) Una expresión algebraica cuyo resultado sea equivalente a un valor entero
	d) Todas las anteriores
	
**La respuesta correcta es la D**

* 8 - Dado el siguiente fragmento de código:

	... <br>
	Dimension dias(7)  <br>
	Definir dias Como Real <br>
	Definir tempAux Como Real <br>
	Definir sabado como Entero <br>
	dias(1) = 17 //asignación con índice constante <br>
	sabado = 6 <br>
	leer dias(sabado) //asignación mediante una función <br>
	tempAux = dias(sabado) //acceso con índice variable <br>
... <br>

Indique con una cruz cuál/es de las siguientes sentencias es incorrecta: <br>
a) días(0) = “lunes” <br>
b) tempAux = días <br> 
c) tempAux = días(0) <br>
d) tempAux = días(sabado – 1) <br>
e) tempAux = días(sabado + 5) <br>
f) tempAux = días(días(sábado)) <br>

**La respuesta es C, D y F(si sábado va de 0 a 6)**

---

## Ejercicios de aprendizaje

* 1 - Realizar un programa que rellene un vector con 5 valores ingresados por el usuario y los
muestre por pantalla.

***guia4-ej1*

* 2 - Realizar un programa que lea 10 números reales por teclado, los almacene en un arreglo
y muestre por pantalla la suma, resta y multiplicación de todos los números ingresados
al arreglo.

***guia4-ej2**

* 3 - Realizar un programa que rellene un vector de tamaño N, con valores ingresados por el
usuario. A continuación, se debe buscar un elemento dentro del arreglo (el número a
buscar también debe ser ingresado por el usuario). El programa debe indicar la posición
donde se encuentra el valor. En caso que el número se encuentre repetido dentro del
arreglo se deben imprimir todas las posiciones donde se encuentra ese valor.
Finalmente, en caso que el número a buscar no está adentro del arreglo se debe mostrar
un mensaje.

***guia4-ej3**

* 4 - Realizar un programa que rellene un vector de tamaño N, con valores ingresados por el
usuario. A continuación, se deberá crear una función que reciba el vector y devuelva el
valor más grande del vector.

***guia4-ej4**

* 5 - Realizar un programa con el siguiente menú y le pregunte al usuario que quiere hacer
hasta que ingrese la opción Salir:

	a. Llenar Vector A. Este vector es de tamaño N y se debe llenar de manera aleatoria usando la función Aleatorio(valorMin, valorMax) de PseInt. <br>
	b. Llenar Vector B. Este vector también es de tamaño N y se llena de manera aleatoria.  <br>
	c. Llenar Vector C con la suma de los vectores A y B. La suma se debe realizar elemento a elemento. Ejemplo: C = A + B  <br>
	d. Llenar Vector C con la resta de los vectores B y A. La resta se debe realizar elemento a elemento. Ejemplo: C = B - A  <br>
	e. Mostrar. Esta opción debe permitir al usuario decidir qué vector quiere mostrar: Vector A, B, o C.  <br>
	f. Salir.  <br>
	
NOTA: El rango de los números aleatorios para los Vectores será de [-100 a 100]. La
longitud para todos los vectores debe ser la misma, por lo tanto, esa información sólo se
solicitará una vez.

* 6 - Disponemos de un vector unidimensional de 20 elementos de tipo carácter. Se pide
desarrollar un programa que:

	a. Pida una frase al usuario y luego ingrese la frase dentro del arreglo letra por letra. Ayuda: utilizar la función Subcadena de PSeInt. <br>
	b. Una vez completado lo anterior, pedirle al usuario un carácter cualquiera y una posición dentro del arreglo, y el programa debe intentar ingresar el carácter en la posición indicada, si es que hay lugar (es decir la posición está vacía o es un espacio en blanco). De ser posible debe mostrar el vector con la frase y el carácter ingresado, de lo contrario debe darle un mensaje al usuario de que esa posición estaba ocupada.
	
Por ejemplo, suponiendo la siguiente frase y los subíndices del vector: <br>

H o l a   m u n d o     c  r  u  e  l  !  ! <br>
0 1 2 3 2 5 6 7 8 9 10 11 12 13 14 15 16 17  <br>

Si se desea ingresar el carácter “%” en la posición 10, entonces el resultado sería: <br>

H o l a   m u n d o  %  c  r  u  e  l  !  ! <br>
0 1 2 3 2 5 6 7 8 9 10 11 12 13 14 15 16 17  <br>

* 7 - Crear un subproceso que rellene dos arreglos de tamaño n, con números aleatorios. <br>
Después, hacer una función que reciba los dos arreglos y diga si todos sus valores son iguales o no. La función debe devolver el resultado de está validación, para mostrar el mensaje en el algoritmo. Nota: recordar el uso de las variables de tipo lógico.

**Arreglos : Matrices**

* 8 - Realizar un programa que rellene una matriz de 3x3 con 9 valores ingresados por el usuario y los muestre por pantalla

* 9 - Escribir un programa que realice la búsqueda lineal de un número entero ingresado por el usuario en una matriz de 5x5, llena de números aleatorios y devuelva por pantalla las coordenadas donde se encuentra el valor, es decir en que fila y columna se encuentra. <br>
En caso de no encontrar el valor dentro de la matriz se debe mostrar un mensaje.

* 10 - Dada una matriz de orden n * m (donde n y m son valores ingresados por el usuario) realizar un subprograma que llene la matriz de numeros aleatorios. <br>
Despues, crearemos otro subprograma que calcule y muestre la suma de los elementos de la matriz. <br>
Mostrar la matriz y los resultados por pantalla.

* 11 - Rellenar en un subproceso una matriz cuadrada con números aleatorios salvo en la diagonal principal, la cual debe rellenarse con ceros. Una vez llena la matriz debe generar otro subproceso para imprimir la matriz.

* 12 - Rellenar una matriz, de 3 x 3, con una palabra de 9 de longitud, pedida por el usuario, encontrando la manera de que la frase se muestre de manera continua en la matriz. <br>
Por ejemplo, si tenemos la palabra habilidad, nuestra matriz se debería ver así: <br>

H A B  <br>
I L I <br>
D A D <br>

Nota: recordar el uso de la función Subcadena().

* 13 - Una matriz mágica es una matriz cuadrada (tiene igual número de filas que de columnas) que tiene como propiedad especial que la suma de las filas, las columnas y las diagonales es igual. Por ejemplo: <br>

2 7 6 <br>
9 5 1  <br>
4 3 8 <br>

En la matriz de ejemplo las sumas son siempre 15. Considere el problema de construir un algoritmo que compruebe si una matriz de datos enteros es mágica o no, y en caso de que sea mágica escribir la suma. <br>
Además, el programa deberá comprobar que los números introducidos son correctos, es decir, están entre el 1 y el 9. <br>
El usuario ingresa el tamaño de la matriz que no debe superar orden igual a 10.


