Algoritmo Ejercicio32
	///Defino la variable
	Definir anioIngresado Como Entero
	
	Escribir "Ingrese un a�o: "
	Leer anioIngresado
	
	Si anioIngresado MOD 4 = 0 Y anioIngresado MOD 100 <> 0 Entonces
		Escribir "El a�o ingresado ", anioIngresado, " es bisiesto"
	SiNo
		
		Si anioIngresado MOD 100 = 0 Y anioIngresado MOD 400 = 0 Entonces
			Escribir "El a�o ingresado ", anioIngresado, " es bisiesto"
		SiNo
			Escribir "El a�o ingresado ", anioIngresado, " NO es bisiesto"
		Fin Si
	Fin Si
	
FinAlgoritmo

//Realice un programa que, dado un a�o, nos diga si es bisiesto o no. 
//Un a�o es bisiesto bajo las siguientes condiciones: 
//Un a�o divisible por 4 es bisiesto y no debe ser divisible por 100. 
//Si un a�o es divisible por 100 y adem�s es divisible por 400, tambi�n resulta bisiesto. 