Algoritmo Consumo
	Definir litros_combustible, kilometros_recorridos, consumo_real Como Real
	
	litros_combustible=0
	kilometros_recorridos=0
	consumo_real=0
	
	Escribir "Ingrese los litros de combustibles cargados y los kilómetros recorridos, para calcular el consumo: "
	Leer litros_combustible, kilometros_recorridos
	consumo_real = kilometros_recorridos / litros_combustible
	
	Escribir "El consumo es de: ", consumo_real
	
FinAlgoritmo
