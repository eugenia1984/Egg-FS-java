Algoritmo Ejercicio26
	///Defino las variables
	Definir numero1, numero2 Como Entero
	
	///Veo si son pares su modulo es 0 y si son impares su modulo es 1
	Escribir " Ingrese un numero para decirle si es par o impar : "
	Leer numero1
	
	Escribir " Ingrese otro numero para decirle si es par o impar : "
	Leer numero2
	
	///Calculo si ambos son pares
	Si numero1 MOD 2 = 0 Y numero2 MOD 2 = 0 Entonces
		Escribir "Ambos numeros son pares. "
	SiNo
		Escribir "Los n�meros no son pares, o uno de ellos no es par  "
	Fin Si
	
	
FinAlgoritmo

// Solicitar al usuario que ingrese dos n�meros enteros y determinar si ambos 
//son pares o impares. 
// Mostrar en pantalla un mensaje que indique Ambos n�meros son pares
//siempre y cuando cumplan con la condici�n. 
//En caso contrario se deber� imprimir el siguiente mensaje 
//Los n�meros no son pares, o uno de ellos no es par 
