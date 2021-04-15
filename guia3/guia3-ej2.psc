Algoritmo ParOImpar
	//Realizar una función que valide si un numero es impar o no. Si es impar la función debe
	//devolver un verdadero, si no es impar debe devolver falso. Nota: la función no debe
	//tener mensajes que digan si es par o no, eso debe pasar en el Algoritmo.
	Definir num1 Como Real
	num1 = 0
	
	Escribir " Por favor ingrese un número para decirle si es par o impar : "
	Leer num1
	
	Si num1 MOD 2 = 0 Entonces
		Escribir num1, " es par, ", EsPar( num1)
	SiNo
		Escribir num1, " es par, ", EsPar(num1)
	Fin Si
FinAlgoritmo

Funcion resultado_par <- EsPar ( num1 )
	Definir resultado_par Como Logico
	Si num1 MOD 2 = 0  Entonces
		resultado_par = Verdadero
	SiNo
		resultado_par = Falso
	Fin Si
Fin Funcion
