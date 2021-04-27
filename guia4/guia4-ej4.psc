Algoritmo Ejercicio4
	Definir n, i Como Entero
	Definir vector, mayor Como Real
	
	i=0
	
	Escribir " Ingrese el tamanio del vector: " //PIDO AL USUARIO QUE INGRESE EL TAMAÑO
	Leer n
	Dimension vector(n)
	
	Escribir "ingrese ", n, " números enteros: " //PIDO AL USUARIO QUE INGRESE LOS NÚMEROS 
	Para i=0 Hasta n-1 Con Paso 1 Hacer
		Leer vector(i)
	Fin Para
	
	mayor = valorMayor(vector,n)
	Escribir "El valor más grande del vector es : " , mayor
FinAlgoritmo

Funcion mayor = valorMayor(vector,n)
	Definir mayor Como Real
	Definir i Como Entero
	mayor = 0
	
	Para i=0 Hasta n-1 Con Paso 1 Hacer
		Si vector(i)>=mayor Entonces
			mayor = vector(i)
		Fin Si
	Fin Para
	
Fin Funcion
//Realiza un programa que rellene un vector de tamaño N, con valores ingresados por el usuario.
//A continuación se deberá crear una función que reciba el vector 
//y devuelva el valor más grande del vector