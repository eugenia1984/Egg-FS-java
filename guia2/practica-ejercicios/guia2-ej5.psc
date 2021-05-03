Algoritmo NumeroParImpar
	Definir num Como Entero ///Defino la varaible
	
	num = 0 ///Inicializo la variable
	
	Escribir "ingrese un número entero para decirle si es par o impar: " ///Pido ingrese el número
	Leer num ///Leo dato ingresado y lo asigno a la variable num
	
	Si num MOD 2 == 0 Entonces
		Escribir "El número ", num, " es número par. "
	SiNo
		Escribir "El número ", num, "es número impar."
	Fin Si
	
FinAlgoritmo
