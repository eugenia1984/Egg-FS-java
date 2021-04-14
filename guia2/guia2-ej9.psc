Algoritmo TieneA
	Definir frases Como Caracter
	Definir LetraAComparar Como Caracter
	
	frases = " "
	Escribir " Por favor ingrese una frase o palabra"
	Leer frases
	frases = Mayusculas(frases)
	LetraAcomparar = Subcadena(frases,0,0)

	Si (LetraAcomparar = 'A' ) Entonces
		Escribir " CORRECTO "
	SiNo
		Escribir " INCORRECTO "
	Fin Si
	
FinAlgoritmo
