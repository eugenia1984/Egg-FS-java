Algoritmo Aumento
	Definir precio_inicial, precio_final, aumento_anual Como Real        ///Defino mis variables
	
	precio_inicial = 0         ///Inicializo mis variables
	precio_final = 0
	aumento_anual = 0
	
	Escribir "Ingresar el precio del producto al inicio del año y al final, para decirle el % de aumento: "         ///Pido el precio inicial y el final
	Leer precio_inicial, precio_final           ///Leo los datos ingresados y los asigno a las variables
	
	aumento_anual= (precio_final - precio_inicial) * 100 / precio_inicial     ///calculo le % de aumento_anual
	
	Escribir "El porcentaje de aumento del precio es de: ", aumento_anual, "% ."
	
FinAlgoritmo

// Crear un programa que solicite al usuario que ingrese el precio de un producto al inicio del año,
// y el precio del mismo producto al finalizar el año.
// El programa debe calcular cuál due el porcentaje de aumento que tuvo ese producto en el año y mostrarlo por pantalla.
