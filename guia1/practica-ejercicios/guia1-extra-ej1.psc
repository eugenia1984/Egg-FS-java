Algoritmo PorcentajeNiniosNinias
	Definir total, total_ninios, total_ninias Como Entero ///Declaro las varaibles
	Definir porcentaje_ninios, porcentaje_ninias Como Real
	
	total = 0   ///Las inicializo
	total_ninios = 0
	total_ninias = 0
	porcentaje_ninios = 0
	porcentaje_ninias = 0
	
	Escribir " Ingrese la cantidad total de ni�os y ni�as del curso :" ///Pido ingrese la cantidad de ni�os y ni�as y asigno a variables
	Leer total_ninios, total_ninias
	
	total = total_ninios + total_ninias   ///Calculo el total
	porcentaje_ninios = total_ninios * 100 / total ///Calculo los porcentajes
	porcentaje_ninias = total_ninias * 100 / total
	
	Escribir " El porcentaje de ni�os es de ", porcentaje_ninios, " % y el porcentaje de ni�as es de ", porcentaje_ninias, "% ."
	
FinAlgoritmo
