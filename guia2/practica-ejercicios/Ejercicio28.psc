Algoritmo Ejercicio28
	//Defino mi variable
	Definir diaSemana Como Entero
	
	///Pido al usuario que ingrese un numero para decirle el dia
	Escribir "Ingrese un numero ( 1 - 7 ) para indicarle que d�a de la semana es: "
	Leer diaSemana
	
	Segun diaSemana Hacer
	     1:
			Escribir "El d�a ingresaado ", diaSemana, " corresponde al Lunes"
		2:
			Escribir "El d�a ingresaado ", diaSemana, " corresponde al Martes"
		3:
			Escribir "El d�a ingresaado ", diaSemana, " corresponde al Miercoles"
		4:
			Escribir "El d�a ingresaado ", diaSemana, " corresponde al Jueves"
		5:
			Escribir "El d�a ingresaado ", diaSemana, " corresponde al Viernes"
		6:
			Escribir "El d�a ingresaado ", diaSemana, " corresponde al S�bado"
		7:
			Escribir "El d�a ingresaado ", diaSemana, " corresponde al Domingo"
		De Otro Modo:
			Escribir "No ingres� un d�a correcto "
	Fin Segun
FinAlgoritmo

//Solicitar al usuario que ingrese un valor entre 1 y 7.
//El programa debe mostrar por pantalla un mensaje que indique a qu� d�a de 
//la semana corresponde. Considere que el n�mero 1 corresponde al d�a �Lunes�, y as� sucesivamente.