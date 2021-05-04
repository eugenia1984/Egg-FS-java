Algoritmo DivisionEntreNumeros
	Definir num1, num2 Como Entero ///Defino las variables
	
	num1 = 0  ///Inicializo variables
	num2 = 1
	Hacer
		Escribir "Ingrese los numeros a dividir: "
		Leer num1, num2
	Hasta Que num1 > num2
	
	restaSucesiva(num1, num2)
	
FinAlgoritmo

SubProceso restaSucesiva(n1, n2)
	Definir resto, cociente, resultado Como Entero
	cociente =  0
	
	Mientras n1 >= n2 Hacer
		n1 = n1 - n2
		cociente = cociente + 1
	FinMientras
	
	Escribir "El resto de la divsion es ", n1, " y el cociente es ", cociente
	
FinSubProceso


