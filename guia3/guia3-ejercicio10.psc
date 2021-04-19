Algoritmo FuncionRecursiva
	Definir N Como Entero
	Escribir " Por favor ingrese un numero para calcular la suma de sus primeros números enteros: "
	Leer N
	Escribir "La suma de ", N, " y sus primeros números enteros es de: ", Suma(N)
	
	
FinAlgoritmo

Funcion x <- Suma(N)
	Definir x Como Entero
	Si N = 1 Entonces
		x = 1
	SiNo
		x = N + Suma(N-1)
	FinSi
	
Fin Funcion

//Escribir una función recursiva que devuelva la suma de los primeros N enteros
