Algoritmo EncontrarLetra
	
	Definir frase Como Cadena ///Defino las variables
	Definir letra como Caracter
	
	Escribir  "Ingrese una frase y la letra que desea le informemos cuántas veces se encuentra en la frase: "
	Leer frase, letra ///Leo los valores y los asigno a las variables
	frase = Minusculas(frase)
	letra = Minusculas(letra)
	
	Escribir "La letra ", letra, " aparece ", CantidadVeces(frase,letra), " en la frase: ", frase, " ."
	
FinAlgoritmo

Funcion veces_que_aparece <-  CantidadVeces(frase,letra)
	Definir i, veces_que_aparece Como Entero
	
	veces_que_aparece = 0
	
	Para i = 0 Hasta Longitud(frase)-1 Con Paso 1 Hacer
		Si letra = Subcadena(frase,i,i) Entonces
			veces_que_aparece = veces_que_aparece + 1
		SiNo
			veces_que_aparece = 0
		Fin Si
	Fin Para
Fin Funcion