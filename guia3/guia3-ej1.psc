Algoritmo SumarNumeros
	//Realizar una funci�n que calcule la suma de dos n�meros. En el algoritmo principal le
	//pediremos al usuario los dos n�meros para pas�rselos a la funci�n. Despu�s la funci�n
	//calcular� la suma y lo devolver� para imprimirlo en el algoritmo
	Definir n1, n2 Como Real
	Escribir " Por favor ingrese dos n�meros: "
	Leer n1, n2
	Escribir " La suma de los dos n�meros ingresados es: ", CalcularSuma(n1,n2)
	
FinAlgoritmo

Funcion suma <- CalcularSuma ( n1, n2 )
	Definir suma Como Real
	suma = n1 + n2
Fin Funcion	
