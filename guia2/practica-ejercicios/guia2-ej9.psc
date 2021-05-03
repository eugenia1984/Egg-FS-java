Algoritmo LetraA
	Definir frase Como Cadena ///Defino mis variables
	Definir letra Como Caracter
	
	frase = ""  ///Inicializo mis variables
	letra='A' ///La variable letra ya la incializo en A, pra luego ver si la primer letra es A
	
	Escribir "Ingrese una palabra o frase y le diré si empieza con A: " ///Pido la palabra/frase
	Leer frase  ///Leo la palabra/frase y la asigno como valor de la varaible frase
	frase = Mayusculas(frase) ///Paso a mayúscula toda la palabra/frase ingresada para saber si empieza con A, ya que puede ingresar tanto en mayúscula como en minúscula
	
	Si Subcadena(frase,0,0) = letra Entonces
		Escribir "CORRECTO"
	SiNo
		Escribir "INCORRECTO"
	Fin Si
	
FinAlgoritmo
