Algoritmo Ejercicio25
	
	///Defino las variables
	Definir mes Como Entero
	Definir precio, montoTotal Como Real
	
	///Inicializo las variables
	mes = 0
	precio = 0.0
	montoTotal = 0.0
	
	Repetir
		///Pido los datos y los guardo en las variables
		Escribir "Ingrese el mes de la compra ( 1- Enero / 2 - Febrero / 3 - Marzo / 4 - Abril / 5 - Mayo / 6 - Junio / 7 - Julio / 8 - Agosto / 9 - Septiembre / 10 - Octubre / 11 - Noviembre / 12 - Diciembre "
		Leer mes
	Mientras Que mes < 0  O mes > 12
	
	Escribir "Ingrese el importe de la compra: "
	Leer precio
	
	Si mes = 9 O mes = 10 O mes = 11 Entonces
		montoTotal = precio - (precio * 0.10)
		Escribir "El precio es de: $ ", montoTotal
	SiNo
		Escribir "El precio es de: $ ", precio
	Fin Si
FinAlgoritmo

//Una tienda ofrece para los meses de septiembre, octubre y noviembre un descuento 
//del 10% sobre el total de la compra que realiza un cliente. Solicitar al usuario 
//que ingrese un mes y el importe de la compra. El programa debe calcular cuál es 
//el monto total que se debe cobrar al cliente e imprimirlo por pantalla.
