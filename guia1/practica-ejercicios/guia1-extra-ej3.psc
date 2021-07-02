Algoritmo Volumen
	Definir radio, volumen_cilindro, altura Como Real        ///Defino mis variables
	
	radio = 0             ///Inicializo mis variables
	volumen_cilindro = 0
	altura = 0
	
	Escribir "Ingresar el radio y la altura de su cilindro para informar el volumen: "         ///solicito el valor del radio y la altura
	Leer radio, altura          ///Leo el valor de radio y altura y lo asigno a sus variables
	
	volumen_cilindro = PI * radio ^ 2 *  altura      ///Calculo el volumen_cilindro
	
	Escribir "El volumen del cilindro es de: ", volumen_cilindro, "."      ///Muestro por pantalla el volumen
	
FinAlgoritmo

// Escribir un programa que calcule el volumen de un cilindro.
// Para ello se deberá solicitar al usuario que ingrese el radio y la altura.
// Mostrar el resultado por pantalla.
