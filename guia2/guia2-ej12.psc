Algoritmo NumeroParOImpar
	Definir numerosParOImpar Como Real
	numerosParOImpar = 0
	Escribir " Por favor ingrese un n�mero entero, para decirle si es par o impar: "
	Leer numerosParOImpar
	
	Si ( numerosParOImpar = 0 ) Entonces
		Escribir " El n�mero ingresado no es par ni impar."
	SiNo
		Si (numerosParOImpar mod 2 = 0) Entonces
			Escribir " El n�mero ingresado es par"
		SiNo
			Escribir  " El n�mero ingresado es impar"
		Fin Si
	Fin Si
	
FinAlgoritmo
