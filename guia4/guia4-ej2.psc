Algoritmo Ejercicio2
	Definir input, vector, suma, resta, multiplicacion Como Real
	Definir i Como Entero
	Dimension vector(10)
	
	suma=0
	resta=0
	multiplicacion=1
	input=0
	
	Para i=0 Hasta 9 Con Paso 1 Hacer //INGRESO VALORES AL VECTOR
		Escribir "Ingrese el n�mero para la posici�n ", i
		Leer input
		vector(i)= input
	FinPara
	
	Para i=0 Hasta 9 Con Paso 1 Hacer //MUESTRO MI VECTOR
		Escribir Sin Saltar vector(i) ","
	FinPara 
	
	Para i=0 Hasta 9 Con Paso 1 Hacer //HAGO SUMA , RESTA Y MULTIPLICACION
		suma = suma + vector(i)
		
		Si i=0 Entonces
			resta = vector(i)
			multiplicacion = vector(i)
		SiNo
			resta = resta - vector(i)
			multiplicacion = multiplicacion * vector(i)
		Fin Si
		
	Fin Para
	
	Escribir "La suma de todos los n�meros ingresados es de: ", suma
	Escribir "La resta de todos los n�meros ingresados es de: ", resta
	Escribir "LA multiplicaci�n entre los n�meros ingresados es de: ", multiplicacion
	
	
	
FinAlgoritmo
