Algoritmo SumarNumeros
	//Realizar una función que calcule la suma de dos números. En el algoritmo principal le
	//pediremos al usuario los dos números para pasárselos a la función. Después la función
	//calculará la suma y lo devolverá para imprimirlo en el algoritmo
	Definir n1, n2 Como Real
	Escribir " Por favor ingrese dos números: "
	Leer n1, n2
	Escribir " La suma de los dos números ingresados es: ", CalcularSuma(n1,n2)
	
FinAlgoritmo

Funcion suma <- CalcularSuma ( n1, n2 )
	Definir suma Como Real
	suma = n1 + n2
Fin Funcion	
