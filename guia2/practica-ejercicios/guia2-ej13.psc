Algoritmo GradoEficiencia
	Definir grado_eficiencia, tornillos_defectuosos, tornillos_sin_defecto Como Entero  ///Defino las variables
	
	grado_eficiencia = 0 ///Las inicializo
	tornillos_defectuosos = 0
	tornillos_sin_defecto = 0
	
	Escribir "Para determinar el grado de eficiencia, indique (en números enteros) ¿cuántos tornillos defectuosos produce? ¿cuántos tornillos sin defecto produce?: "
	Leer tornillos_defectuosos, tornillos_sin_defecto ///Leo las variables y las asigno a las variables
	
	Si tornillos_defectuosos > 200 Y tornillos_sin_defecto < 1000 Entonces
		grado_eficiencia = 5
		Escribir "El grado de eficiencia es de: ", grado_eficiencia
	SiNo
		Si tornillos_defectuosos < 200 Y tornillos_sin_defecto < 1000 Entonces
			grado_eficiencia = 6
			Escribir "El grado de eficiencia es de: ", grado_eficiencia
		SiNo
			Si tornillos_defectuosos > 200 Y tornillos_sin_defecto > 1000 Entonces
				grado_eficiencia = 7
				Escribir "El grado de eficiencia es de: ", grado_eficiencia
			SiNo
				grado_eficiencia = 8
				Escribir "El grado de eficiencia es de: ", grado_eficiencia
			Fin Si
		Fin Si
	Fin Si
	
FinAlgoritmo
