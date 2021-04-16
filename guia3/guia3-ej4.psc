Algoritmo sin_titulo
	//Realizar un programa que pida al usuario una frase y una letra a buscar en esa frase. La
	//función debe devolver la cantidad de veces que encontró la letra. Nota: recordar el uso
	//de la función Subcadena().
	
	Definir frase, letra Como Caracter
	frase = " "
	letra = " "
	
	Escribir " Por favor ingrese una frase: "
	Leer frase
	Escribir " Por favor ingrese una letra para buscarla en la frase ingresada: "
	Leer letra
	Escribir "Se encontró: ", CantidadVeces(frase, letra) , " veces la letra ", letra, "."
FinAlgoritmo

Funcion x <- CantidadVeces(frase, letra)
	
	Definir  x Como Entero
	Definir i Como Entero
	
	x = 0
	Para i = 0 Hasta longitud(frase)-1 Con Paso 1 Hacer
		Si letra = subcadena(frase, i, i) Entonces
			x = x + 1
		Fin Si
	Fin Para
	
Fin Funcion