Algoritmo NumeroParImpar
	Definir num Como Entero ///Defino la variable
	
	num = 0 ///Inicializo la variable
	
	Escribir "ingrese un número entero para decirle si es par o impar: " ///Pido ingrese el número
	Leer num ///Leo dato ingresado y lo asigno a la variable num
	
	Si num MOD 2 == 0 Y num <>0 Entonces
		Escribir "El número ", num, " es número par. "
	SiNo
		Si num MOD 2 == 1 Y num <> 0 Entonces
			Escribir "El número ", num, " es número impar. "
		SiNo
			Escribir "El número ", num, " no es par ni impar,"
		Fin Si
	Fin Si
	
FinAlgoritmo