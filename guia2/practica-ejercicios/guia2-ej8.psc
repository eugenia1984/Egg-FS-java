Algoritmo ValidarNota
	Definir nota1, nota2, nota3 Como Real  ///Defino las variables
	Definir  validacion Como Logico
	
	nota1 = 0 ///Inicializo las variables
	nota2 = 0
	nota3 = 0
	validacion = Verdadero
	
	Escribir "Ingrese tres notas 1 y 10: "  ///Pido las 3 notas
	Leer nota1, nota2, nota3  ///Leo las 3 notas ingresadas y las asigno a las variables
	
	Si (nota1 >= 1 Y nota1 <= 10) Y  (nota2 >= 1 Y nota2 <= 10)Y (nota3 >= 1 Y nota3 <= 10) Entonces ///Si las 3 notas están entre 1 y 10
		Escribir validacion
	SiNo
		validacion = Falso
		Escribir validacion
	Fin Si
	
FinAlgoritmo
