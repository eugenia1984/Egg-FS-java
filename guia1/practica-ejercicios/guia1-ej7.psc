Algoritmo Calcular
	Definir num1, num2, suma, resta, multiplicacion Como Entero        ///Defino las variables
	Definir division Como Real
	
	num1 = 0        ///Inicializo las variables
	num2 = 0
	suma = 0
	resta = 0
	multiplicacion = 0
	division = 0
	
	Escribir "Ingrese dos números enteros para hacer cuentas entre los mismos: "
	Leer num1,num2               ///Asigno a las varaibles el valor ingresado
	
	suma = num1 + num2                 ///Realizo los calculos de suma, reta, multiplicacion y division
	resta = num1 - num2
	multiplicacion = num1 * num2
	division = num1 / num2
	
	Escribir "Dado ", num1, " y ", num2, " la suma es de: ", suma, " la resta es de ", resta, " la multiplicación es de ", multiplicacion, " y la división es de ", division, "."
	
FinAlgoritmo

// Escribir un programa que lea dos números enteros y realice el cálculo de la suma, resta, multiplicación y división entre ambos valores.
// Los resultados deben mostrarse por pantalla.
