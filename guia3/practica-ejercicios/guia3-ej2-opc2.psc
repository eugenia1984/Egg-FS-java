Algoritmo ParOImpar
	Definir num1 Como Real
	num1 = 0
	
	Escribir " Por favor ingrese un número para decirle si es par o impar : "
	Leer num1
	
	Escribir num1, " es par, ", EsPar(num1)
FinAlgoritmo

Funcion resultado_par <- EsPar(num1)
	Definir resultado_par Como Logico
	Si num1 MOD 2 = 0  Entonces
		resultado_par = Verdadero
	SiNo
		resultado_par = Falso
	Fin Si
Fin Funcion