Algoritmo Ejercicio9
	
	Definir frase Como Caracter
	Definir codificada Como Cadena
	
	Escribir " Por favor ingrese una frase: "
	Leer frase
	
	codificada = NuevaFrase(frase)
	Escribir codificada
	
FinAlgoritmo

Funcion codificada <- NuevaFrase(frase)
	
	Definir codificada Como Caracter
	Definir i Como Entero
	Definir letra Como Caracter
	
	codificada=""
	i=0
	letra=""
	
	Para i<-0 Hasta Longitud(frase)-1 Con Paso 1 Hacer  //Recorremos la cadena letra por letra
		letra = Subcadena(frase,i,i)   //Par ir tomando letra por letra de la cadena
		Segun letra Hacer
			'a':
				codificada= concatenar(codificada,"@")
			'e':
				codificada= concatenar(codificada,"#")
			'i':
				codificada= concatenar(codificada,"$")
			'o':
				codificada= concatenar(codificada,"%")
			'u':
				codificada= concatenar(codificada,"*")
			De Otro Modo:
				codificada= concatenar(codificada,letra)
		Fin Segun
	Fin Para
	
Fin Funcion
//Escribir un programa que procese una secuencia de caracteres ingresada por teclado y terminada en punto, 
//y luego codifique la palabra o frase ingresada de la siguiente
//manera: cada vocal se reemplaza por el carácter que se indica en la tabla y 
//el resto de los caracteres (incluyendo a las vocales acentuadas) se mantienen sin cambios.
//Realice un subprograma que reciba una secuencia de caracteres y retorne la
//codificación correspondiente. Utilice la estructura “según” para la transformación.
//Por ejemplo, si el usuario ingresa: Ayer, lunes, salimos a las once y 10.
//La salida del programa debería ser: @y#r, l*n#s, s@l$m%s @ l@s %nc# y 10.
//NOTA: investigue el uso de la función concatenar de PSeInt para armar la palabra/frase.
