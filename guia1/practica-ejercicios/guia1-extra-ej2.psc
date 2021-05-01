Algoritmo Medidas
	Definir base, altura, area, perimetro Como Real  ///Defino las variables
	
	base= 0   ///Inicializo las variables
	altura = 0
	area = 0
	perimetro = 0
	
	Escribir "Ingrese la base y la altura del rectángulo, para calcular el ñarea y el perímetro: " ///Pido base y altura
	Leer base, altura ///Asigno los valores a base y altura
	
	area = base * altura ///Calculo el área
	perimetro = 2 * altura + 2 * base   ///calculo el perímetro
	
	Escribir " El área del rectángulo es ", area, " y el perímetro es ", perimetro, "."
FinAlgoritmo
