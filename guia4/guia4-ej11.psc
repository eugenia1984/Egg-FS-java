Algoritmo sin_titulo
	Definir mat,tam Como Entero
	
	Escribir "Ingrese el tamaño de la matriz:"
	Leer tam
	
	Dimension mat[tam,tam]
	
	LlenarMatriz(mat,tam,tam)
	MostrarMatriz2D(mat,tam,tam)
FinAlgoritmo

SubProceso LlenarMatriz(matriz,m,n)
	Definir i,j Como Entero
	Para i = 0 Hasta m-1
		Para j = 0 Hasta n-1
			Si i=j // A lo largo de la diagonal coinciden i y j
				matriz[i,j]=0
			SiNo
				matriz[i,j]=Aleatorio(1,9) // De 1 dígito para que salga más ordenado
			FinSi
		FinPara
	FinPara
FinSubProceso

SubProceso MostrarMatriz2D(matriz,m,n)
	Definir i,j Como Entero
	Escribir "Matriz:"
	Para i = 0 Hasta m-1
		Para j = 0 Hasta n-1
			Escribir Sin Saltar matriz[i,j] " "
		FinPara
		Escribir ""
	FinPara
FinSubProceso
