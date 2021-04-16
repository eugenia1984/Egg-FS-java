Algoritmo EsPrimoElNumero
	//Realizar una función que reciba un numero ingresado por el usuario y averigüe si el
	//numero es primo o no. Un número es primo cuando es divisible sólo por 1 y por sí
	//mismo, por ejemplo: 2, 3, 5, 7, 11, 13, 17, etc. Nota: recordar el uso del MOD.
	Definir num1 Como Real
	num1 = 0
	
	Escribir " Por favor ingrese un número para decirle si es número primo o no: "
	Leer num1
	Escribir " El número ", num1, " ingresado es primo ? ", EsPrimo(num1)
FinAlgoritmo

Funcion x <- EsPrimo(num1)
	Definir x Como Logico
	Definir i, contador Como Real
	contador = 0
	Para i= 1 Hasta num1 Con Paso 1 Hacer
		Si num1 MOD i = 0 Entonces
			contador = contador + 1 
		FinSi
	Fin Para
	Si contador = 2 Entonces
		x = Verdadero
	SiNo
		x = Falso
	FinSi
Fin Funcion
