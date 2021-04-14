Algoritmo Notas
	Definir nota1 Como Real
	Definir nota2 Como Real
	Definir nota3 Como Real
	Definir cumpleEnunciado Como Logico
	
	nota1 = 0
	nota2 = 0
	nota3 = 0
	
	Escribir " Por favor ingrese la primer nota, entre 1 y 10: "
	Leer nota1
	Escribir " Por favor ingrese la segunda nota, entre 1 y 10: "
	Leer nota2
	Escribir " Por favor ingrese la tercer nota, entre 1 y 10: "
	Leer nota3
	
	Si (  ((nota1>=1 Y nota1<=10)  Y (nota2>=1 Y nota2<=10))  Y (nota3>=1 Y nota3<=10) ) Entonces
		cumpleEnunciado = Verdadero
		Escribir  cumpleEnunciado
	SiNo
		cumpleEnunciado = Falso
		Escribir cumpleEnunciado
	Fin Si
	
FinAlgoritmo
