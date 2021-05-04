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

* 6 - 6. Para recorrer una matriz de orden NxMxP:
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

...
Dimension dias(7)
Definir dias Como Real
Definir tempAux Como Real
Definir sabado como Entero
dias(1) = 17 //asignación con índice constante
sabado = 6
leer dias(sabado) //asignación mediante una función
tempAux = dias(sabado) //acceso con índice variable
...

Indique con una cruz cuál/es de las siguientes sentencias es incorrecta:
a) días(0) = “lunes”
b) tempAux = días
c) tempAux = días(0)
d) tempAux = días(sabado – 1)
e) tempAux = días(sabado + 5)
f) tempAux = días(días(sábado))

**La respuesta es C, D y F(si sábado va de 0 a 6)**

---

## Ejercicios de aprendizaje

1* Realizar un programa que rellene un vector con 5 valores ingresados por el usuario y los
muestre por pantalla.

2* Realizar un programa que lea 10 números reales por teclado, los almacene en un arreglo
y muestre por pantalla la suma, resta y multiplicación de todos los números ingresados
al arreglo.

3* Realizar un programa que rellene un vector de tamaño N, con valores ingresados por el
usuario. A continuación, se debe buscar un elemento dentro del arreglo (el número a
buscar también debe ser ingresado por el usuario). El programa debe indicar la posición
donde se encuentra el valor. En caso que el número se encuentre repetido dentro del
arreglo se deben imprimir todas las posiciones donde se encuentra ese valor.
Finalmente, en caso que el número a buscar no está adentro del arreglo se debe mostrar
un mensaje.

4* Realizar un programa que rellene un vector de tamaño N, con valores ingresados por el
usuario. A continuación, se deberá crear una función que reciba el vector y devuelva el
valor más grande del vector.
