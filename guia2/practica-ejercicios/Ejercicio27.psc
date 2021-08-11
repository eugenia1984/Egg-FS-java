Algoritmo Ejercicio27
	///Defino mis variables
	Definir cantidadLitros, horasDeUso, precioFinal Como Real
	
	///Pido al cliente que aclare los litros y horas de uso y guardo en variable
	Escribir "Ingrese las horas de alquiler: "
	Leer horasDeUso
	
	Si horasDeUso < 2 Entonces
		Escribir "El precio a abonar es de $ 400 y te regalamos la nafta. "
	SiNo
		Escribir "Ingrese los litros utilizados: "
		Leer cantidadLitros
		
		precioFinal = cantidadLitros * 40 + ( horasDeUso * 60 ) * 5.2
		Escribir "El total a pagar es de: $ ", precioFinal
		
	Fin Si
	
FinAlgoritmo

//La empresa “Te llevo a todos lados” está destinada al alquiler de autos y 
//tiene un sistema de tarifa que consiste en cobrar el alquiler por hora. 
//Si el cliente devuelve el auto dentro de las 2 horas de uso el valor que corresponde
//pagar es de $400 pesos y la nafta va de regalo. 
//Cuando el cliente regresa a la empresa pasadas las 2 horas, 
//se ingresan la cantidad de litros de nafta gastados y el tiempo transcurrido en horas.
//Luego, se le cobra 40 pesos por litro de nafta gastado, 
//y la hora se fracciona en minutos, cobrando un total de $5,20 el minuto de uso. 
//Realice un programa que permita registrar esa información y 
//el total a pagar por el cliente.
