Algoritmo OperacionesAritmeticas
	Definir S, R, M, D Como Caracter
	Definir operacion Como Caracter
	Definir numero1, numero2, suma, resta, multiplicacion, division Como Real
	
	S = " "
	R = " "
	M = " "
	D = " "
	operacion = " "
	numero1 = 0
	numero2 = 0
	
	Escribir "Por favor ingrese un n�mero: "
	Leer numero1
	Escribir " Por favor ingrese un segundo n�mero : "
	Leer numero2
	Escribir " En base a los dos n�meros ingresado, realizaremos una operaci�n, escriba S si desea sumarlos, R si desea restarlos, M si desea multiplicarlos o D si desea dividirlos" 
	Leer operacion
	operacion = mayusculas(operacion)
	
	Segun operacion Hacer
		'S':
			suma = numero1 + numero2
			Escribir " La suma de ambos n�meros es: " , suma
		'R':
			resta = numero1 - numero2
			Escribir " La resta de ambos n�meros es: " , resta
		'M':
			multiplicacion = numero1 * numero2
			Escribir " La multiplicaci�n de ambos n�meros es: ", multiplicacion
		'D':
			division = numero1 / numero2
			Escribir " La divisi�n entre ambos n�meros es: ", division
			
 		De Otro Modo:
			Escribir " No eligi� una operaci�n correcta"
	Fin Segun
	
FinAlgoritmo
