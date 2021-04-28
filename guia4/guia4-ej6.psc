Algoritmo Ejercicio6
	
	Definir vector,car Como Caracter
	Definir frase como cadena
	Definir n,pos Como Entero
	frase = ""
	n = 20
	car =''
	pos = 0
	Dimension vector(n)
	
	Escribir "Ingrese frase: "
	Leer frase
	
	Mientras longitud(frase)>20 hacer
		Escribir "Error. La frase no debe ser de más de 20 caracteres."
		Escribir "Ingrese otra frase: "
		Leer frase
	Fin Mientras
	
	RellenarVector(vector,n,frase)
	Escribir sin saltar "Vector: " 
	MostrarVector(vector,n)
	
	Escribir " "
	Escribir "Ingrese caracter: "
	Leer car
	
	Mientras longitud(car)<>1 hacer
		Escribir "Error. Se debe ingresar un solo caracter. "
		Escribir "Ingrese caracter:"
		Leer car
	Fin Mientras
	
	Escribir "Ingrese posición dentro del arreglo (de 0 a 19):"
	Leer pos
	
	Mientras pos<0 o pos>n-1 hacer
		Escribir "Error. Se debe ingresar una posición de 0 a 19."
		Escribir "Ingrese otra posición:"
		Leer pos
	Fin Mientras
	
	CambiarCar(vector,n,car,pos)
	
FinAlgoritmo

Subproceso RellenarVector(vector,n,frase)
	Definir i Como Entero
	
	Para i=0 hasta n-1 Hacer
		
		Si Subcadena(frase, i, i)<>""
			vector(i)=Subcadena(frase, i, i)
		SiNo
			vector(i)=" "
		Fin Si
	FinPara
	
FinSubProceso

Subproceso MostrarVector(vector,n)
	Definir i Como Entero
	
	Escribir sin saltar "["
	Para i=0 hasta n-1 Hacer
		Escribir sin saltar vector(i)
	FinPara
	Escribir sin saltar "]"
FinSubProceso

Subproceso CambiarCar(vector,n,car,pos)
	
	Definir i Como Entero
	
	
	Si vector(pos)=" " o vector(pos)="" Entonces
		vector(pos)=car
		Escribir sin saltar "Vector Final: "
		MostrarVector(vector,n)
		Escribir " "
		Escribir "El caracter " car " se insertó en la posición " pos
	Sino
		Escribir "Error. La posición " pos " se encuentra ocupada por el caracter " vector(i)
	FinSi
	
FinSubProceso
	
