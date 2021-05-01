Algoritmo Equivalente
	Definir metros, centimetros, milimetros, pulgadas Como Real
	
	metros=0
	centimetros = 0
	milimetros = 0
	pulgadas = 0
	
	Escribir "Ingrese una cantidad de metros, para decirle su equivalente en centímetros, milímetros y pulgadas: "  ///Pido que ingrese el valor
	Leer metros   ///Leo el valor y lo asigno a la varaible
	centimetros = metros * 100
	milimetros = metros * 1000
	pulgadas = metros * 100 * 2.54
	
	Escribir "Los ", metros, "metros ingresados equivalen a: ", centimetros," centímetros , ", milimetros, " milímetros y ", pulgadas, " pulgadas."
FinAlgoritmo
