Algoritmo TieneA
	Definir frases Como Caracter
	Definir LetraAComparar1 Como Caracter
	Definir LetraAComparar2 Como Caracter
	
	frases = " "
	Escribir " Por favor ingrese una frase o palabra"
	Leer frases
	LetraAcomparar1 = mayusculas(Subcadena(frases,0,0))
	LetraAComparar2 = mayusculas(subcadena(frases,longitud(frases)-1,longitud(frases)-1))

	Si (LetraAcomparar1 = LetraAComparar2 ) Entonces
		Escribir " CORRECTO "
	SiNo
		Escribir " INCORRECTO "
	Fin Si
	
FinAlgoritmo
