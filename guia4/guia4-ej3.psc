Algoritmo Ejercicio3
	Definir vector, buscar Como Real
	Definir tamanio, i Como Entero
	Definir encontrado Como Logico
	
	i=0
	tamanio=0
	encontrado= falso
	
	Escribir " Ingrese el tama�o del vector:  " //PIDO QUE INGRESE EL TAMA�O N DEL VECTOR
	Leer tamanio
	Dimension vector(tamanio)
	
	Escribir "Ingrese ", tamanio, " valores: " //PIDO QUE INGRESE LOS VALORES
	Para i=0 Hasta tamanio-1 Con Paso 1 Hacer
		Leer vector(i)
	Fin Para
	
	Escribir "Ingrese un n�mero a buscar: " //PIDO QUE INGRESE EL NUMERO A BUSCAR
	Leer buscar
	
	Para i=0 Hasta tamanio-1 Con Paso 1 Hacer
		Si vector(i) = buscar
			encontrado= Verdadero
			Escribir "El n�mero ", buscar, "se encontr� en la posici�n ", i
		FinSi
	Fin Para
	
	SI !encontrado
		Escribir "El n�mero ", buscar, " no se encontr�."
	FinSi
FinAlgoritmo
//Realiza un programa que rellene un vector de tama�o N, con los valores ingresados por el usuario.
//A continuaci�n, se debe buscar un elemento dentro del arreglo
//(el n�mero a buscar tambi�n debe ser ingresado por el usuario).
//EL programa debe indicar la posici�on donde se encuetnra el valor.
//En caso de que el n�mero se encuentre repetido dentro del arreglo
//se deben imprimir todas las posiciones donde se encuentra ese valor.
//Finalmente en caso que el n�mero a buscar no est� dentro del arreglo 
//se debe mostrar un mensaje
