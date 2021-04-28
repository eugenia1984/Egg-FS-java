Algoritmo Ejercicio7
	Definir vector1,vector2,tam Como Entero
	
	Escribir "Tamaño de los vectores:"
	Leer tam
	
	Dimension vector1[tam]
	Dimension vector2[tam]
	
	LlenarVectores(vector1,vector2,tam)
	
	Escribir Sin Saltar "Vector 1: "
	MostrarVector(vector1,tam)
	Escribir Sin Saltar "Vector 2: "
	MostrarVector(vector2,tam)
	
	Escribir "Los vectores son iguales? -> " VectoresIguales(vector1,vector2,tam)	
FinAlgoritmo

SubProceso LlenarVectores(vector1 Por Referencia,vector2 Por Referencia,tamanio)
	Definir i Como Entero
	Para i= 0 Hasta tamanio-1
		vector1[i]=Aleatorio(-100,100)
		//vector2[i]=vector1[i]  //Descomentar esta línea y comentar la de abajo para que ambos sean iguales.
		vector2[i]=Aleatorio(-100,100)
	FinPara
FinSubProceso

Funcion ret=VectoresIguales(vector1,vector2,tamanio)
	Definir ret Como Logico
	Definir i Como Entero
	ret=Verdadero
	Para i = 0 Hasta tamanio-1
		Si vector1[i] <> vector2[i]
			ret=Falso
		FinSi
	FinPara
FinFuncion

SubProceso MostrarVector(vector,tamanio)
	Definir i Como Entero
	Para i= 0 Hasta tamanio-1
		Si i<tamanio-1
			Escribir Sin Saltar vector[i] ", "
		SiNo
			Escribir Sin Saltar vector[i] //Si es el último ítem, no mostrar la coma.
		FinSi
	FinPara
	Escribir ""
FinSubProceso
