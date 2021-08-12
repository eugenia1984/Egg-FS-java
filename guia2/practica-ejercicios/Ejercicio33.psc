Algoritmo Ejercicio33
	///Defino mis variables
	Definir kilosManzanas, precioFinal Como Real
	
	///Inicializo mis variables
	kilosManzanas = 0
	precioFinal = 0
	
	///Pido al usuario los kilos que va a comprar
	///Como no me dice supongo que el kilo esta 200, sin descuento
	Escribir " EL kilo de manzana está $ 200. Tnemos descuento por cantidad. Indique la cantidad de kilos de manzanas que va a comprar: "
	Leer kilosManzanas ///Lo asigno a mi variable
	
	///Con SI ENTONCES (IF / ELSE ) anidados voy a ir calculando el precio acorde a los kilosManzanas
	Si kilosManzanas < 2 Entonces
		precioFinal = kilosManzanas * 200
		Escribir " El precio final es de : $ ", precioFinal
	SiNo
		Si kilosManzanas >= 2.00 Y kilosManzanas < 5 Entonces
			precioFinal = kilosManzanas * 200  - ( kilosManzanas * 200 * 0.10 )
			Escribir " El precio final es de : $ ", precioFinal
		SiNo
			Si kilosManzanas >= 5.00 Y kilosManzanas < 10 Entonces
				precioFinal = kilosManzanas * 200 - ( kilosManzanas * 200 * 0.15 )
				Escribir " El precio final es de : $ ", precioFinal
			SiNo
				precioFinal = kilosManzanas * 200 - ( kilosManzanas * 200 * 0.20 )
				Escribir " El precio final es de : $ ", precioFinal
			Fin Si
		Fin Si
	Fin Si
	
	
FinAlgoritmo

//Una verdulería ofrece las manzanas con descuento según la siguiente tabla: 
//Nº de kilos comprados - % descuento 
// 0 - 2 / 0% 
// 2.01 - 5 / 10% 
// 5.01 - 10 / 15% 
// 10.01 en adelante / 20% 
//Determinar cuánto pagará una persona que compre manzanas en esa verdulería.
