Algoritmo Ejercicio30
	
//Hacer un algoritmo que lea un número por el teclado y determine si tiene tres dígitos
	
	///Defino la variable
	Definir numeroIngresado Como Real
	
	///Inicializo mi variable
	numeroIngresado = 0
	
	///Pido al usuario que ingrese el numero y lo asigno a la variable
	Escribir "Ingrese un numero para decirle si es de tres digitos "
	Leer numeroIngresado
	
	Si numeroIngresado >= 100 Y numeroIngresado <= 999  Entonces
		Escribir " El numero ingresado ", numeroIngresado, " es de 3 dígitos."
	SiNo
		Escribir " El numero ingresado ", numeroIngresado, " NO es de 3 dígitos."
	Fin Si
	
FinAlgoritmo

