Algoritmo IngreseFrase 
	Definir ingrese_frase Como Caracter
	ingrese_frase = " "
	Escribir " Por favor ingrese una frase o palabra de 6 caracteres: "
	Leer ingrese_frase
	
	Si longitud(ingrese_frase) = 6 Entonces
		Escribir "CORRECTO"
	SiNo
		Escribir "INCORRECTO"
	Fin Si
	
FinAlgoritmo
