Algoritmo FraseConEspacio
	
	Definir frase como Cadena     ///Defino mis varibales
	Definir i, longitudFrase como entero
	
	frase = "" ///Inicializo la variable
	
	Escribir "Ingrese una frase o palabra: "
	Leer frase
	
	// Otro modosería declarando la variable: longitudFrase = Longitud(frase) - 1 y utilizarla luego del Hasta en el Para
	
	Para i = 0 Hasta Longitud(frase) - 1 Con Paso 1 Hacer
		Escribir Sin Saltar Subcadena(frase, i, i), " "
	FinPara
	
FinAlgoritmo
