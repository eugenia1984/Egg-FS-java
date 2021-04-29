Algoritmo Ejercicio12
	Definir palabra, matriz Como Cadena
	Definir n, m Como Entero
	palabra = ""
	n = 0
	m = 0
	
	Escribir "Ingrese una palabra o conjunto de letras, que sea de 9 letras: "
	Leer palabra
	
	Mientras longitud(palabra)<>9 hacer
		Escribir "Error. La palabra debe ser de 9 letras. Ingrese la palabra: "
		Leer palabra
		
	FinMientras
	RellenarMatriz(matriz,n,m,palabra)
	MostrarMatriz(matriz,n,m)
	
FinAlgoritmo

SubProceso RellenarMatriz(matriz,n,m,palabra)
	Definir i,j,k Como Entero
	k=0
	Para i=0 hasta n-1 Hacer
		Para j=0 hasta m-1 Hacer
			matriz(i,j)=subcadena(palabra,k,k)
			k=k+1
		FinPara
	FinPara
FinSubProceso
	
SubProceso MostrarMatriz(matriz,n,m)
	Definir i,j Como Entero
	
	Para i=0 hasta n-1 Hacer
		Para j=0 hasta m-1 Hacer
			Escribir sin saltar "[" matriz(i,j)  "]"
		FinPara
		Escribir " "
	FinPara
FinSubProceso
//Rellenar una matriz de 3 x 3, con una palabra de 9 de longitud pedida por el usuario encontrando la manera
//de que la frase se muestre de manera continua en la matriz
//por ejemplo si tenemos la palabra habilidad, la matriz debe verse:
//hab
//ili
//dad
//*Nota, recorda el usa de la funcion subcadena