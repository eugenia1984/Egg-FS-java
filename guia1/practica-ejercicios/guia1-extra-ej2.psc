Algoritmo Medidas
	Definir base, altura, area, perimetro Como Real  ///Defino las variables
	
	base= 0   ///Inicializo las variables
	altura = 0
	area = 0
	perimetro = 0
	
	Escribir "Ingrese la base y la altura del rect�ngulo, para calcular el �area y el per�metro: " ///Pido base y altura
	Leer base, altura ///Asigno los valores a base y altura
	
	area = base * altura ///Calculo el �rea
	perimetro = 2 * altura + 2 * base   ///calculo el per�metro
	
	Escribir " El �rea del rect�ngulo es ", area, " y el per�metro es ", perimetro, "."
FinAlgoritmo
