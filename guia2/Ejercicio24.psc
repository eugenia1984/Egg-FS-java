Algoritmo Ejercicio24
	///Defino mis variables
	Definir nota1, nota2, nota3, promedio Como Real
	///Las inicializo en 0
	nota1 = 0.0
	nota2 = 0.0
	nota3 = 0.0
	promedio = 0.0
	
	///Pido el ingreso de las tres notas y las asigno a variables
	Escribir "Ingrese la primer nota ( 0 - 100 ) : "
	Leer nota1
	Escribir "Ingrese la segundar nota ( 0 - 100 ) : "
	Leer nota2
	Escribir "Ingrese la tercer nota ( 0 - 100 ) : "
	Leer nota3	
	
	///Calculo el promedio
	promedio = ( nota1 + nota2 + nota3 ) / 3 
	
	Si promedio >= 70  Entonces
		Escribir "Felicitaciones, el alumno aprobo, con un promedio de: ", promedio
	SiNo
		Escribir "El alumno desaprobo, tiene un promedio de: ", promedio
	Fin Si
	
FinAlgoritmo
// Realizar un programa que pida tres notas y determine si un alumno aprueba o reprueba 
//un curso, sabiendo que aprobará el curso si su promedio de tres calificaciones es mayor 
//o igual a 70; y reprueba en caso contrario.
