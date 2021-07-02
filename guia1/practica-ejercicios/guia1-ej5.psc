Algoritmo Consumo
	Definir litros_combustible, kilometros_recorridos, consumo_real Como Real     ///Defino mis variables
	
	litros_combustible=0    ///Inicializo mis variables
	kilometros_recorridos=0
	consumo_real=0
	
	Escribir "Ingrese los litros de combustibles cargados y los kilómetros recorridos, para calcular el consumo: "        ///Pido que ingrese los litros y kilometros
	Leer litros_combustible, kilometros_recorridos             ///Asigno los valores
	consumo_real = kilometros_recorridos / litros_combustible         ///Calculo el consumo real
	
	Escribir "El consumo es de: ", consumo_real            ///Lo muestro por pantalla
	
FinAlgoritmo

// Escribir un programa que calcule cuántos litros de combustible que consumió el auto.
// El usuario ingresase una cantidad de litros de combustible cargados en la estación y una cantidad
// de kilómetros recorridos, después, el programa calculará el consumo y se lo mostrará al usuario
