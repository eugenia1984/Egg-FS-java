Algoritmo Caracteres4
	Definir palabra Como Cadena ///Defino la variable
	
	palabra= "" ///Inicializo la variable
	
	Escribir "Ingrese una frase o palabras de 6 caracteres: " ///Pido el dato
	Leer palabra  ///Leo el dato ingresado y lo asigno a mi variable
	
	Si Longitud(palabra) == 4 Entonces
		palabra = Concatenar(palabra,'!')
		Escribir palabra
	SiNo
		palabra = Concatenar(palabra,'?')
		Escribir palabra
	Fin Si
FinAlgoritmo
