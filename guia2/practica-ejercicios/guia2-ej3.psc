Algoritmo NumeroMayorMenor
	Definir num Como Real  ///Defino la variable
	
	num = 0   ///Inicializo la variable
	
	Escribir "Ingrese un número y le dire si es mayor o igual a 100: "   ///Pido el valor al usuario
	Leer num ///Leo el valor y lo asigno a la variable num
	
	Si num > 100 Entonces
		Escribir "Es Mayor."
	SiNo
		Si num = 100 Entonces
			Escribir "Es igual."
		SiNo
			Escribir "Es Menor."
		Fin Si
	Fin Si
	
	
FinAlgoritmo
