Algoritmo Elegir
	Definir num1, num2, suma, resta, multiplicacion Como Entero ///Defino la varaible
	Definir division Como Real
	Definir eleccion Como Caracter
	
	num1 = 0 ///Inicializo la variable
	num2 = 0
	suma = 0
	resta = 0
	multiplicacion = 0
	division = 0
	eleccion = ''
	
	Escribir "ingrese dos n�mero enteros: " ///Pido ingrese los n�meros
	Leer num1, num2 ///Leo datos ingresados y los asigno a las variables 
	Escribir "Dado los n�meros ingresados elegir una operaci�n aritm�tica inresando la letra correspondiente: S (suma), R (resta), M (multiplicacion), D (division) : "
	Leer eleccion
	eleccion = Mayusculas(eleccion)
	
	Segun eleccion Hacer
		'S':
			suma = num1 + num2
			Escribir "La suma de los dos n�meros ingresados es: ", suma
		'R':
			resta = num1 - num2
			Escribir "La resta de los dos n�meros ingresados es: ", resta
		'M':
			multiplicacion = num1 * num2
			Escribir "La multiplicacion de los dos n�meros ingresados es: ", multiplicacion
		'D':
			division = num1 / num2
			Escribir "La division de los dos n�meros ingresados es: ", division
		De Otro Modo:
			Escribir "No elegi� la opci�n correcta."
	Fin Segun
	
FinAlgoritmo