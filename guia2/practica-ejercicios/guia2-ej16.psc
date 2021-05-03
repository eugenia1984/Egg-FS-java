Algoritmo calcularPromedio
	Definir num, suma, promedio, contador Como Real   ///Defino las variables
	
	suma = 0  ///Inicializo variables
	contador = 0
	
	Escribir "Ingresar numero: "
	Leer num
	
	Mientras num > -1
		suma = suma + num
		Escribir "Ingresar numero: "
		Leer num
		contador = contador + 1
	FinMientras
	

	promedio = suma / contador
	Escribir "El promedio es: ", promedio
	
FinAlgoritmo
