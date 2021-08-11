Algoritmo Ejercicio32
	///Defino la variable
	Definir anioIngresado Como Entero
	
	Escribir "Ingrese un año: "
	Leer anioIngresado
	
	Si anioIngresado MOD 4 = 0 Y anioIngresado MOD 100 <> 0 Entonces
		Escribir "El año ingresado ", anioIngresado, " es bisiesto"
	SiNo
		
		Si anioIngresado MOD 100 = 0 Y anioIngresado MOD 400 = 0 Entonces
			Escribir "El año ingresado ", anioIngresado, " es bisiesto"
		SiNo
			Escribir "El año ingresado ", anioIngresado, " NO es bisiesto"
		Fin Si
	Fin Si
	
FinAlgoritmo

//Realice un programa que, dado un año, nos diga si es bisiesto o no. 
//Un año es bisiesto bajo las siguientes condiciones: 
//Un año divisible por 4 es bisiesto y no debe ser divisible por 100. 
//Si un año es divisible por 100 y además es divisible por 400, también resulta bisiesto. 