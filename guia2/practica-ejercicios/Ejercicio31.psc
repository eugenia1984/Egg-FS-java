Algoritmo Ejercicio31
	///Defino mis variables
	Definir cantidadLlantas, montoTotal Como Entero
	
	///inicializo mis variables
	cantidadLlantas = 0
	montoTotal = 0
	
	///pido al usuario que ingrese la cantidad de llantas a comprar
	Escribir " Ingrese cuantas llantas va a compar: "
	Leer cantidadLlantas  ///La asigno a mi variable
	
	Si cantidadLlantas > 5 Entonces
		Escribir " El precio de cada llanta es de $ 3000"
		montoTotal = cantidadLlantas * 3000
		Escribir "El precio final es de: $ ", montoTotal
	SiNo
		
		Si cantidadLlantas> 5 Y cantidadLlantas <= 10 Entonces
			Escribir " El precio de cada llanta es de $ 2500"
			montoTotal = cantidadLlantas * 2500
			Escribir "El precio final es de: $ ", montoTotal
		SiNo
			Escribir " El precio de cada llanta es de $ 2000"
			montoTotal = cantidadLlantas * 2000
			Escribir "El precio final es de: $ ", montoTotal
		Fin Si
		
	Fin Si
	
	
	
FinAlgoritmo

// Si se compran menos de cinco llantas el precio es de $3000 cada una,
//si se compran entre 5 y 10 el precio es de $2500, y si se compran más de 10 el precio 
//es $2000. Obtener la cantidad de dinero que una persona tiene que pagar por cada una 
//de las llantas que compra, y el monto total que tiene que pagar por el total de la compra.