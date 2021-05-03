Algoritmo IntroducirSN
	Definir letra Como Caracter  ///Defino la varaible
	
	letra = '' ///Inicializo la variable
	
	Escribir "Introduzca los caracteres S o N : "  ///Pido al usuario ingrese el valor
	Leer letra  ///Leo el valor y se lo asigno a la varaibles
	
	letra = Mayusculas(letra)  ///Por si el usuario loingresó en minúscula paso a mayñuscula el caracter
	
	Si letra = 'S' O letra = 'N' Entonces
		Escribir "CORRECTO"
	SiNo
		Escribir "INCORRECTO"
	Fin Si
FinAlgoritmo
