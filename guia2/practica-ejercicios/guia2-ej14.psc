Algoritmo ValidarNota
	Definir nota Como Real  /// Defino la variable
		
	Escribir "Ingrese una nota entre 0 y 10: "
	Leer nota ///Leo el dato ingresado
	
	Mientras nota < 0  O nota > 10 Hacer
		Escribir "Ingrese una nota entre 0 y 10: "
		Leer nota ///Leo el dato ingresado
	Fin Mientras
	
	Escribir "Ingreso bien la nota."
	
FinAlgoritmo
