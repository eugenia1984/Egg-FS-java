Algoritmo Ejercicio10
	Definir matriz, total Como Real
	Definir n, m, i, j Como Entero
	
	Escribir "Por favor ingrese el orden de la matriz que desea se rellene aleatoriamente (dos numeros): " //PIDO QUE INGRESE DOS NUMEROS PARA ESTABLECER LA DIMENSION DE LA MATRIZ
	Leer n, m
	Dimension matriz(n,m)
	LlenarMatriz(matriz,n,m)  //LLAMO AL SUBPROCESO QUE ME VA A LLENAR LA MATRIZ
	MostrarSuma(matriz,n,m)  //LLAMO AL SUBPROCESO QUE ME VA A MOSTRAR EL RESULTADO DE LA SUMA DE TODOS LOS NUMEROS DE LA MATRIZ
	MostrarMatriz(matriz,n,m) //LLAMO AL SUBPROCESO QUE ME VA A MOSTRAR LA MATRIZ
	
FinAlgoritmo

Subproceso LlenarMatriz(matriz,n,m)  // SUBRPROCESO PARA LLENAR LA MATRIZ
	Definir i,j Como Entero
	
	Para i=0 hasta n-1 Hacer
		Para j=0 hasta m-1 Hacer
			matriz(i,j)=aleatorio(1,99)  //SE VA LLENANDO CON NUMEROS ALEATORIOS
		FinPara
	FinPara
	
FinSubProceso

SubProceso MostrarSuma(matriz,n,m) //SUBPROCESO DE SUMAR TODOS LOS NUMEROS DE LA MATRIZ Y MOSTRAR EL RESULTADO
	Definir i,j Como Entero
	Definir total Como Real
	total = 0
	
	Para i=0 hasta n-1 Hacer
		Para j=0 hasta m-1 Hacer
			total = total + matriz(i,j)
		FinPara
	FinPara
	Escribir "Suma de todos los elementos de la matriz = " total
FinSubProceso

Subproceso MostrarMatriz(matriz,n,m) //SUMPROCESO PARA MOSTRAR LA MATRIZ QUE SE COMPLETO CON NUMEROS ALEATORIOS
	Definir i,j Como Entero	
	
	Para i=0 hasta n-1 Hacer
		Para j=0 hasta m-1 Hacer
			Si matriz[i, j] < 10 Entonces
				Escribir Sin Saltar "[ 0" matriz(i,j) " ]"
			SiNo
				Escribir sin saltar "[ " matriz(i,j) " ]"
			Fin Si
		FinPara
		Escribir " "
	FinPara
	
FinSubProceso
//Dada una matriz de onden n * m (donde n y m son valores ingresados por el usuario)
//realizar un subprograma que llene la matriz de números aleatorios.
//Después creamos otro subprograma que calcule y muestre la suma de los elementos de la matriz
//Mostrar la matriz y los resultados por pantalla