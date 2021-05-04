Algoritmo FuncionRecursiva
	
	Definir N Como Entero ///Defino la variable
	
	N = 0   ///Inicializo la varaible
	
	Escribir " Por favor ingrese un numero para calcular la suma de sus primeros números enteros: "
	Leer N
	Escribir "La suma de ", N, " y sus primeros números enteros es de: ", Suma(N) ///Llamo a la funcion
	
FinAlgoritmo
///Funcion fuera del Algoritmo Principal
Funcion x <- Suma(N)
	Definir x Como Entero
	Si N = 1 Entonces
		x = 1
	SiNo
		x = N + Suma(N-1)
	FinSi
	
FinFuncion
