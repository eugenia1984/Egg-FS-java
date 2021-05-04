Algoritmo IntercambioValores
	
	Definir num1, num2 Como Entero  ///Defino mis variables
	
	num1 = 0  ///Inicializo las variables
	num2 = 0
	
	Escribir "Ingrese dos numero para mostrarlos con su orden intercambiado: "
	Leer num1, num2
	
	intercambiarValores(num1, num2)  ///Llamo al subproceso para intercambiar valores
	Escribir "Intercambiando los números, es primero es: ", num1, " y el segundo es : ", num2, " ."
	
FinAlgoritmo

SubProceso intercambiarValores(n1 Por Referencia, n2 Por Referencia)
	Definir auxiliar Como Entero   ///Defino mi variable
	
	auxiliar = n1
	n1 = n2
	n2 = auxiliar
	
FinSubProceso
