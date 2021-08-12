Algoritmo Ejercicio34
	///Defino las variables
	Definir nota1, nota2, nota3, nota4, promedio Como Real
	
	///Se pide que ingrese las tres notas y se guardan en variables
	Escribir "Ingrese la primer nota : "
	Leer nota1
	Escribir "Ingrese la segunda nota : "
	Leer nota2
	Escribir "Ingrese la tercer nota : "
	Leer nota3
	Escribir "Ingrese la cuarta nota : "
	Leer nota4
	
	Si ( nota1 < nota2 ) Y ( nota1 < nota3 ) Y ( nota1 < nota4 ) Entonces
		promedio = ( nota2 + nota3 + nota4) / 3
		Escribir " El promedio de las notas es de : " , promedio
	SiNo
		Si ( nota2 < nota1 ) Y ( nota2 < nota3 ) Y ( nota2 < nota4 ) Entonces
			promedio = ( nota1 + nota3 + nota4) / 3
			Escribir " El promedio de las notas es de : " , promedio
		SiNo
			Si ( nota3 < nota1 ) Y ( nota3 < nota2 ) Y ( nota3 < nota4 ) Entonces
				promedio = ( nota1 + nota2 + nota4) / 3
				Escribir " El promedio de las notas es de : " , promedio
			SiNo
				Si  ( nota4 < nota1 ) Y ( nota4 < nota2 ) Y ( nota4 < nota3 ) Entonces
					promedio = ( nota1 + nota2 + nota3) / 3
					Escribir " El promedio de las notas es de : " , promedio
				Fin Si
			Fin Si
		Fin Si
	Fin Si
	
FinAlgoritmo

//El promedio de los trabajos prácticos de un curso se calcula en base a cuatro notas 
//de las cuales se elimina la nota menor y se promedian las tres notas más altas. 
//Escriba un programa que determine cuál es la nota eliminada y el promedio de los 
//trabajos prácticos de un estudiante.
