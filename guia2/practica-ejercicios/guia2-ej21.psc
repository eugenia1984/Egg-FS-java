Algoritmo CursoAEvaluar
	
	Definir totalAlumnos, i, cantidadReprobados como Entero ///Declaro las variables
	Definir nota, notaIntegrador, notaExposicion, notaParcial, notaTotal, mayorNotaExpocision Como Real
	Definir porcentajeIntegradorExcelente, promedioNotaFinalReprobados Como Real
	Definir notaFinalReprobados, promedioFinalAlumno Como Real
	Definir totalAlumnosRegulares, totalAlumnosIntegradorAprobado Como Entero
	
	cantidadReprobados = 0  ///Inicializo las variables
	notaFinalReprobados = 0
	totalAlumnosIntegradorAprobado = 0
	mayorNotaExpocision = 0
	totalAlumnosRegulares = 0
	
	Escribir "Ingresar la cantidad de alumnos: "
	Leer totalAlumnos
	
	Para i = 1 Hasta totalAlumnos Con Paso 1 Hacer
		
		//calcula la nota del integrador
		Escribir "Ingresar nota del trabajo practico integrador del ", i, "º alumno : "
		Leer nota
		notaIntegrador = nota * 0.35
		
		Si nota >= 7.5 Entonces
			totalAlumnosIntegradorAprobado = totalAlumnosIntegradorAprobado + 1
		FinSi
		
		//calcula la nota de la exposicion
		Escribir "Ingresar nota de la expocision del ", i, "º alumno : "
		Leer nota
		notaExposicion = nota * 0.25
		
		Si nota > mayorNotaExpocision o mayorNotaExpocision = 0 Entonces
			mayorNotaExpocision = nota
		FinSi
		
		//calcula la nota del parcial
		Escribir "Ingresar nota del pacial del ", i, "º alumno : "
		Leer nota
		notaParcial = nota * 0.40
		
		Si nota >= 4.0 Y notaParcial <= 7.5 Entonces
			totalAlumnosRegulares = totalAlumnosRegulares + 1
		FinSi
		
		notaTotal = notaIntegrador + notaExposicion + notaParcial
		
		Si notaTotal < 6.5 Entonces
			
			notaFinalReprobados = notaFinalReprobados + notaTotal
			cantidadReprobados = cantidadReprobados + 1
		FinSi
		
		
	FinPara
	
	porcentajeIntegradorExcelente = (totalAlumnosIntegradorAprobado * 100) / totalAlumnos
	Si cantidadReprobados = 0 Entonces
		promedioNotaFinalReprobados = -1
	SiNo
		promedioNotaFinalReprobados = notaFinalReprobados/cantidadReprobados
	FinSi
	
	
	Escribir "Nota promedio final de los estudiantes reprobados (-1 si no hay reprobados): ", promedioNotaFinalReprobados
	Escribir "Porcentaje de alumnos que tienen nota de integrador mayor a 7.5: ", porcentajeIntegradorExcelente, "%"
	Escribir "Mayor nota obtenida en expocisiones: ", mayorNotaExpocision
	Escribir "Total de estudiantes que obtuvieron un parcial entre 4.0 y 7.5: ", totalAlumnosRegulares
	
	
FinAlgoritmo
