Algoritmo Ejercicio4
	Definir n, i Como Entero
	Definir vector, mayor Como Real
	
	i=0
	
	Escribir " Ingrese el tamanio del vector: " //PIDO AL USUARIO QUE INGRESE EL TAMA�O
	Leer n
	Dimension vector(n)
	
	Escribir "ingrese ", n, " n�meros enteros: " //PIDO AL USUARIO QUE INGRESE LOS N�MEROS 
	Para i=0 Hasta n-1 Con Paso 1 Hacer
		Leer vector(i)
	Fin Para
	
	mayor = valorMayor(vector,n)
	Escribir "El valor m�s grande del vector es : " , mayor
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
//Realiza un programa que rellene un vector de tama�o N, con valores ingresados por el usuario.
//A continuaci�n se deber� crear una funci�n que reciba el vector 
//y devuelva el valor m�s grande del vector