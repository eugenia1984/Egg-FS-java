Algoritmo Limite
	Definir limite_positivo, suma, numero_introducido Como Entero ///Nombro mis variables
	Escribir "Ingrese un numero que sirva como limite: "
	
	Leer limite_positivo ///Inicializo las variables
	suma=0
	
	Mientras suma < limite_positivo Hacer
		Escribir "Ingresar un numero para sumar: "
		Leer numero_introducido
		suma = suma + numero_introducido
		
		Si suma < limite_positivo Entonces
			Escribir "La suma por el momento es ", suma, " y el limite es ", limite_positivo
		SiNo
			Escribir "La suma supero al limite"
		FinSi
		
	FinMientras
	
FinAlgoritmo
