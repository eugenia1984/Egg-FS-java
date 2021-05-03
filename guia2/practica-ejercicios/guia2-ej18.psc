Algoritmo LeerNumeros
	Definir num, mayor, menor, contador, suma Como Entero ///Declaro las variables
	Definir promedio Como Real
	
	contador = 0  ///Las inicializo
	promedio = 0
	suma = 0
	
	Escribir "Ingresar un numero: "
	Leer num
	
	mayor = num
	menor = num
	
	Hacer
		suma = suma + num
		
		Escribir "Ingresar un numero: "
		Leer num
		
		Si num <> 0 Entonces
			Si num > mayor Entonces
				mayor = num
			SiNo
				Si num < menor Entonces
					menor = num
				FinSi
			FinSi
		FinSi
		
		contador = contador + 1  ///Agrego un contador para después sacar el promedio
		
	Hasta Que num = 0
	
	promedio = suma / contador
	
	Escribir "El promedio es: ", promedio
	Escribir "El mayor es: ", mayor
	Escribir "El menor es: " menor
	
FinAlgoritmo
