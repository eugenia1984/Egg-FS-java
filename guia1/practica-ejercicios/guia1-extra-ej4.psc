Algoritmo Horarios
	Definir dias, horas, minutos, segundos_calculados  Como Entero ///Defino mis variables
	
	dias = 0  ///Inicializo mis variables
	horas = 0
	minutos = 0
	segundos_calculados = 0
	
	Escribir "Ingrese una cantidad de días, para indicarle su equiivalente en horas, minutos y segundos: "  ///Pido ingrese la cantidad de días
	Leer dias ///Leo ca cantidad de días ingresada y la asigno como valor a mi varaible
	
	horas = dias * 24 ///Calculo el equivalente en horas
	minutos = dias * 24 * 60 ///Calculo el equivalente en minutos 
	segundos_calculados = dias * 24 * 60 * 60  ///Calculo el equivalente en segundos_calculados
	
	Escribir "Los ", dias, " ingresados equivalen a: ", horas, " horas, ", minutos, " minutos, ",segundos_calculados, " segundos."   ///Muestro por pantalla las equivalencias
	
FinAlgoritmo
