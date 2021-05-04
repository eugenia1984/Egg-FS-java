Algoritmo Calculo
	Definir num1, num2 Como Real  ///Defino las variables
	
	Escribir "Ingrese dos números para sumarlos y darles el resultado: "
	Leer num1, num2  ///Leo los valores ingresados y los asigno a las variables
	
	Escribir "La suma de los números ingresados: ", num1, " y ", num2, " es de: ", SumarNumeros(num1,num2), "."
	
FinAlgoritmo

Funcion suma <- SumarNumeros(num1,num2)
	Definir suma Como Real
	suma = num1 + num2
Fin Funcion
