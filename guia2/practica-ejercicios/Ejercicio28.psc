Algoritmo Ejercicio28
	//Defino mi variable
	Definir diaSemana Como Entero
	
	///Pido al usuario que ingrese un numero para decirle el dia
	Escribir "Ingrese un numero ( 1 - 7 ) para indicarle que día de la semana es: "
	Leer diaSemana
	
	Segun diaSemana Hacer
	     1:
			Escribir "El día ingresaado ", diaSemana, " corresponde al Lunes"
		2:
			Escribir "El día ingresaado ", diaSemana, " corresponde al Martes"
		3:
			Escribir "El día ingresaado ", diaSemana, " corresponde al Miercoles"
		4:
			Escribir "El día ingresaado ", diaSemana, " corresponde al Jueves"
		5:
			Escribir "El día ingresaado ", diaSemana, " corresponde al Viernes"
		6:
			Escribir "El día ingresaado ", diaSemana, " corresponde al Sábado"
		7:
			Escribir "El día ingresaado ", diaSemana, " corresponde al Domingo"
		De Otro Modo:
			Escribir "No ingresó un día correcto "
	Fin Segun
FinAlgoritmo

//Solicitar al usuario que ingrese un valor entre 1 y 7.
//El programa debe mostrar por pantalla un mensaje que indique a qué día de 
//la semana corresponde. Considere que el número 1 corresponde al día “Lunes”, y así sucesivamente.