Algoritmo Sueldo
	Definir sueldo_actual, sueldo_minimo Como Entero  ///Defino las variables
	
	sueldo_actual = 0  ///Inicializo las variables
	sueldo_minimo = 0 
	
	Escribir " Ingrese su sueldo actual y el sueldo m�nimo (en n�meros enteros): " ///Pido los datos de sueldo actual y sueldo m�nimo
	Leer sueldo_actual, sueldo_minimo ///Leo los datos ingresados y los asigno a las variables.
	
	Si sueldo_actual > sueldo_minimo Entonces
		Escribir "Su sueldo es mayor al sueldo m�nimo."
	SiNo
		Si sueldo_actual == sueldo_minimo Entonces
			Escribir "Su sueldo es igual al sueldo m�nimo."
		SiNo
			Escribir "Su sueldo es menor al sueldo m�nimo." 
		Fin Si
	Fin Si
	
FinAlgoritmo
