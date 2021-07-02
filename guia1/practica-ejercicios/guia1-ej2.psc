Algoritmo CalcularAreaPerimetro
	Definir radio, area, perimetro Como Real  ///Defino mis variables a utilizar
	
	radio=0       ///Inicializo mis variables
	area=0
	perimetro=0
	
	Escribir "Ingrese el valor del radio de una circunferencia, para calcular y mostrar su área y perímetro: "
	
	Leer radio      ///Leo y asigno al valor ingresado por el usuario a la variable radio
	area = PI * radio ^ 2     ///calculo el area con la circunferencia dada
	perimetro = 2 * PI * radio     ///calculo el perimetro con la circunferencia dada
	
	Escribir "En base a su radio ingresado ( ", radio, " ), su área es de : ", area, " y su perímetro es: ", perimetro
	
FinAlgoritmo
// Conocido el número en matemática PI, pedir la usuario que ingrese el valor del radio de 
// una crcunferencia y calcular por pantalla el área y perímetro.
// Recuerda que para calcular el área hacemos PI por radio al cuadrado
// y para calcular el perímetro hacemos 2 veces PI por radio
