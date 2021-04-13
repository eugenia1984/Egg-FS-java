Algoritmo IngreseFrase
	Definir frase_ingresada Como Caracter
	frase_ingresada = " "
	Escribir  " Por favor ingrese una palabra o frase: "
	Leer frase_ingresada
	
	Si longitud(frase_ingresada) = 4 Entonces
		Escribir concatenar(frase_ingresada,"!")
	SiNo
		Escribir concatenar(frase_ingresada,"?")
		
	Fin Si
FinAlgoritmo
