Algoritmo Ejercicio1
	Dimension valores(5)
	Definir i, valores Como Entero
	
	Escribir "Ingrese 5 valores enteros: "
	
	Para i=0 Hasta 4 Hacer
		Leer valores(i)
	FinPara
	
	Escribir "Los valores ingresados son: "
	Para i=0 Hasta 4 Con Paso 1 Hacer
		Si i = 4
			Escribir valores(i)
		Sino 
			Escribir valores(i) "," Sin Saltar
		FinSi
	Fin Para
FinAlgoritmo
