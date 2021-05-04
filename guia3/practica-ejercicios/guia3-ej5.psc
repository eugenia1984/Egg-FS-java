Algoritmo EsPrimoONo
	Definir num Como Real ///Defino mis variables
	Definir x Como Logico
	
	Escribir " Ingresa un número entero para decir si es primo o no: "
	Leer num
	
	Si num < 0 Entonces
		Repetir
			Escribir "No ingreso un número entero, intente de nuevo : "
			Leer num
		Mientras Que num < 0
	SiNo
		Escribir "Es ", EsPrimo(num), " que el número ", num, " es primo."
	Fin Si
	
FinAlgoritmo

Funcion x <- EsPrimo(num)
	
	Definir i, contador Como Entero
	i = 1
	contador = 0
	
	Para i = 1 Hasta num Con Paso 1 Hacer
		Si num MOD i = 0 Entonces
			contador = contador + 1
		Fin Si
	Fin Para
	
	Definir x Como Logico
	
	Si num = 1 O contador = 2 Entonces
		x = Verdadero
	SiNo
		x = Falso
	Fin Si
Fin Funcion
