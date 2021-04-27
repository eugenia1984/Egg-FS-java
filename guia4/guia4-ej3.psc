Algoritmo Ejercicio3
	Definir vector, buscar Como Real
	Definir tamanio, i Como Entero
	Definir encontrado Como Logico
	
	i=0
	tamanio=0
	encontrado= falso
	
	Escribir " Ingrese el tamaño del vector:  " //PIDO QUE INGRESE EL TAMAÑO N DEL VECTOR
	Leer tamanio
	Dimension vector(tamanio)
	
	Escribir "Ingrese ", tamanio, " valores: " //PIDO QUE INGRESE LOS VALORES
	Para i=0 Hasta tamanio-1 Con Paso 1 Hacer
		Leer vector(i)
	Fin Para
	
	Escribir "Ingrese un número a buscar: " //PIDO QUE INGRESE EL NUMERO A BUSCAR
	Leer buscar
	
	Para i=0 Hasta tamanio-1 Con Paso 1 Hacer
		Si vector(i) = buscar
			encontrado= Verdadero
			Escribir "El número ", buscar, "se encontró en la posición ", i
		FinSi
	Fin Para
	
	SI !encontrado
		Escribir "El número ", buscar, " no se encontró."
	FinSi
FinAlgoritmo
//Realiza un programa que rellene un vector de tamaño N, con los valores ingresados por el usuario.
//A continuación, se debe buscar un elemento dentro del arreglo
//(el número a buscar también debe ser ingresado por el usuario).
//EL programa debe indicar la posiciñon donde se encuetnra el valor.
//En caso de que el número se encuentre repetido dentro del arreglo
//se deben imprimir todas las posiciones donde se encuentra ese valor.
//Finalmente en caso que el número a buscar no está dentro del arreglo 
//se debe mostrar un mensaje
