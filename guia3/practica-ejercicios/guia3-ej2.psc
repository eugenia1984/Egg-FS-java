Algoritmo CalculoParImpar
	Definir num Como Real ///Defino mi variable
	Definir residuo Como Entero
	Definir numero_par Como Logico
	
	Escribir " Ingrese un número para decirle si es par o impar: "
	Leer num   ///Leo el valor ingresado y lo asigno a la variable num
	
	Si EsParImpar(num) == 0 Entonces
		numero_par = Verdadero
	SiNo
		numero_par = Falso
	Fin Si
	
	Escribir " Es ", numero_par," que el número ingresado ", num, " sea par." 
FinAlgoritmo

Funcion residuo <- EsParImpar(num)
	Definir residuo Como Entero
	residuo = num MOD 2
Fin Funcion