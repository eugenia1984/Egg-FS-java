Algoritmo PorcentajeNiniosNinias
	Definir total, total_ninios, total_ninias Como Entero         ///Declaro las varaibles
	Definir porcentaje_ninios, porcentaje_ninias Como Real
	
	total = 0         ///Inicializo las variables
	total_ninios = 0
	total_ninias = 0
	porcentaje_ninios = 0
	porcentaje_ninias = 0
	
	Escribir " Ingrese la cantidad total de niños y niñas del curso :"           ///Pido ingrese la cantidad de niños y niñas y asigno a variables
	Leer total_ninios, total_ninias
	
	total = total_ninios + total_ninias                ///Calculo el total
	porcentaje_ninios = total_ninios * 100 / total      ///Calculo los porcentajes
	porcentaje_ninias = total_ninias * 100 / total
	
	Escribir " El porcentaje de niños es de ", porcentaje_ninios, " % y el porcentaje de niñas es de ", porcentaje_ninias, "% ."
	
FinAlgoritmo

// Un colegio desea saber qué porcentaje de niños y qué porcentaje de niñas hay en  el curso actual.
// Diseñar un algoritmo para este propósito.
// El programa debe solicitar al usuario que ingrese la cantidad de niños y niñas que hay en el curso.
