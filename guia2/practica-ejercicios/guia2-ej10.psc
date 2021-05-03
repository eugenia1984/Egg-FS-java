Algoritmo LetraPrimeraUltima
	Definir frase Como Cadena ///Defino mis variables
	Definir primer_letra, ultima_letra Como Caracter
	
	frase = ""  ///Inicializo mis variables
	primer_letra = ''
	ultima_letra = ''
	
	Escribir "Ingrese una palabra o frase y le diré si empieza con A: " ///Pido la palabra/frase
	Leer frase  ///Leo la palabra/frase y la asigno como valor de la varaible frase
	frase = Mayusculas(frase)  ///Paso todo a mayuscula para poder comparar letras 
	primer_letra = Subcadena(frase,0,0)  ///Asigno la primer letra de la frase a la variable primer_letra
	ultima_letra = Subcadena(frase,longitud(frase)-1,Longitud(frase)-1)  ///Asigno la última letra a la variable ultima_letra
	
	Si primer_letra == ultima_letra Entonces
		Escribir "CORRECTO"
	SiNo
		Escribir "INCORRECTO"
	Fin Si
FinAlgoritmo
