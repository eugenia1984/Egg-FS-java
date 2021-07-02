Algoritmo Intercambiar
	Definir num1, num2, auxiliar Como Entero       ///Defino las variables
	
	num1 = 0     ///Inicializo las variables
	num2= 0
	auxiliar = 0
	
	Escribir " Ingresa dos números enteros para poder mostrarlos con el orden intercambiado "
	Leer num1, num2        ///Asigno los valores ingresados a mis variables
	
	auxiliar = num1
	num1 = num2
	num2 = auxiliar
	
	Escribir "Los números ingresados invertidos son: ", num1, " y ", num2, "."
	
	
FinAlgoritmo

// Escriba un programa que permita al usuario ingresar el valor de dos variables numéricas de tipo entero.
// Posteriormente, el programa debe intercambiar los valores de ambas variables y mostrar el resultado final por pantalla
