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
	
	Escribir "Por favor ingrese un número: "
	Leer numero1
	Escribir " Por favor ingrese un segundo número : "
	Leer numero2
	Escribir " En base a los dos números ingresado, realizaremos una operación, escriba S si desea sumarlos, R si desea restarlos, M si desea multiplicarlos o D si desea dividirlos" 
	Leer operacion
	operacion = mayusculas(operacion)
	
	Segun operacion Hacer
		'S':
			suma = numero1 + numero2
			Escribir " La suma de ambos números es: " , suma
		'R':
			resta = numero1 - numero2
			Escribir " La resta de ambos números es: " , resta
		'M':
			multiplicacion = numero1 * numero2
			Escribir " La multiplicación de ambos números es: ", multiplicacion
		'D':
			division = numero1 / numero2
			Escribir " La división entre ambos números es: ", division
			
 		De Otro Modo:
			Escribir " No eligió una operación correcta"
	Fin Segun
	
FinAlgoritmo
