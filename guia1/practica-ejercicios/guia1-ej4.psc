Algoritmo Equivalente
	Definir metros, centimetros, milimetros, pulgadas Como Real       ///Defino mis variables
	 
	metros=0         ///Inicializo mis variables en cero.
	centimetros = 0
	milimetros = 0
	pulgadas = 0
	
	Escribir "Ingrese una cantidad de metros, para decirle su equivalente en centímetros, milímetros y pulgadas: "  ///Pido que ingrese el valor
	Leer metros   ///Leo el valor y lo asigno a la variable metros
	centimetros = metros * 100             ///Calculo los centimeros
	milimetros = metros * 1000             ///Calculo los metros
	pulgadas = metros * 100 * 2.54         ///Calculo las pulgadas
	
	///Muesro por pantalla las equivalencias
	Escribir "Los ", metros, "metros ingresados equivalen a: ", centimetros," centímetros , ", milimetros, " milímetros y ", pulgadas, " pulgadas."
FinAlgoritmo

// A partir de una conocida cantidad de metros que el usuario ingresa a través del teclado se debe obtener
// su equivalente en centímetros, en milímetros y en pulgadas.
// Ayuda: 1 pulgada = 254 centimetros
