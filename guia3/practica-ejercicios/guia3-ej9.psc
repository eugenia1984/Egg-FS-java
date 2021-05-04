Algoritmo Ejercicio9
	Definir frase Como Caracter ///Defino las variables
	Definir codificada Como Cadena
	
	Escribir "Ingrese una frase: "
	Leer frase
	
	codificada = nuevaFrase(frase)
	Escribir codificada
FinAlgoritmo

Funcion codificada <- nuevaFrase(frase)
	Definir codificada, letra Como Caracter  ///Defino las variables
	Definir i Como Entero
	
	codificada =''
	i = 0
	letra=''
	
	Para i = 0  Hasta Longitud(frase)-1 Con Paso 1 Hacer
		letra = Subcadena (frase,i,i)
		
		Segun letra Hacer
			'a':
				codificada =concatenar(codificada,'@')
			'e':
				codificada =concatenar(codificada,'#')
			'i':
				codificada =concatenar(codificada,'$')
			'o':
				codificada =concatenar(codificada,'%')
			'u':
				codificada =concatenar(codificada,'*')
			De Otro Modo:
				codificada =concatenar(codificada,letra)
		Fin Segun
	Fin Para
	
Fin Funcion
