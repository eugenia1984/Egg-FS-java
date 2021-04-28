Algoritmo Ejercicio9
	
	Definir matriz Como Real
	Definir filas,columnas,num Como Entero
	
	filas=5
	columnas=5
	num=0
	
	Dimension matriz(filas,columnas)
	
	LlenarMatriz(matriz,filas,columnas)
	MostrarMatriz(matriz,filas,columnas)
	
	Escribir "Ingrese número a buscar: "
	Leer num	
	BuscarNum(matriz,filas,columnas,num)
	
	
FinAlgoritmo

Subproceso LlenarMatriz(matriz,filas,columnas)
	Definir i,j Como Entero
	
	Para i=0 hasta filas-1 Hacer
		Para j=0 hasta columnas-1 Hacer
			matriz(i,j)=aleatorio(1,99)
		FinPara
	FinPara
	
FinSubProceso

Subproceso MostrarMatriz(matriz,filas,columnas)
	Definir i,j Como Entero	
	
	Para i=0 hasta filas-1 Hacer
		Para j=0 hasta columnas-1 Hacer
			Si matriz[i, j] < 10 Entonces
				Escribir Sin Saltar "[ 0" matriz(i,j) " ]"
			SiNo
				Escribir sin saltar "[ " matriz(i,j) " ]"
			Fin Si
		FinPara
		Escribir " "
	FinPara
	
FinSubProceso

Subproceso BuscarNum(matriz,filas,columnas,num)
	Definir i,j como entero
	Definir existe como logico
	
	existe=Falso
	
	Para i=0 hasta filas-1 Hacer
		Para j=0 hasta columnas-1 Hacer
			Si matriz(i,j)= num Entonces
				Escribir "El número se encuentra en la posición (" i "," j ") de la matriz"
				existe=verdadero
			FinSi
		FinPara
	FinPara
	
	Si !existe Entonces
		Escribir "El número no se encuentra en ninguna posición"
	FinSi
FinSubProceso
//Escribir un programa que realice la busqueda lineal de un número ingresado por el usuario
//en una matriz de 5 x 5, llena de números aleatorios y devuelva por pantalla
//las coordenadas donde se encuentra el valor, es decir en que fila y columna
//se encuentra. En caso de no encontrar el valor dentro de la matriz
//se debe mostrar un mensaje