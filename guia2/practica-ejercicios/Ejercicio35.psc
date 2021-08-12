Algoritmo Ejercicio35
	///Defino mis variables
	Definir comision, salario, precioPorHoraTrabajada, horasTrabajadas Como Real
	Definir montoPorVentas Como Entero
	Definir formaContratacion Como Caracter
	
	///Pido que ingrese el modo de contratacion y lo guardo en variable
	Escribir "Ingrese la condición de contratación: A - por comision / B - por salario fijo + comision / C - por salario fijo : "
	Leer formaContratacion
	///Pido la cantidad de ventas semanales y asigno a variable
	Escribir " Ingrese el monto total de ventas semanales: "
	Leer montoPorVentas
	
	///con un segun (switch) calculo el sueldo acorde al modo de contratacion
	Si formaContratacion = 'A' Entonces
		salario = montoPorVentas * 0.40 
		Escribir " El sueldo para la contratacion por comision es de: $ ", salario
		
	SiNo
		Escribir "Ingrese el precio por hora para modalidad salario fijo: "
		Leer precioPorHoraTrabajada
		Escribir "Ingrese la cantidad de horas trabajadas: "
		Leer horasTrabajadas
		
		///Si la forma de contratacion es opcion B
		Si formaContratacion = 'B'  Entonces
			
			///No se contemplan horas extras o trabajar mas de 40 horas
			Si horasTrabajadas > 40 Entonces
				horasTrabajadas = 40
				salario = horasTrabajadas * precioPorHoraTrabajada + montoPorVentas * 0.25
				Escribir " El sueldo es de : $ ", salario
				
			SiNo
				salario = horasTrabajadas * precioPorHoraTrabajada + montoPorVentas * 0.25
				Escribir " El sueldo es de : $ ", salario
			Fin Si
			
		SiNo
			///Si la forma de contratacion es opcion C
			Si formaContratacion = 'C' Entonces
				
				///Si trabaja hasta 40 horas no tiene suplemento por horas extras
				Si horasTrabajadas >= 40 Entonces
					salario = horasTrabajadas * precioPorHoraTrabajada
					Escribir " El salario es de : $ ", salario
				SiNo
					salario = precioPorHoraTrabajada * 40 + (horasTrabajadas - 40 ) * precioPorHoraTrabajada * 1.5
					Escribir " El salario es de : $ ", salario
				Fin Si
				
			///Eligio una opcion no valida	
			SiNo
				Escribir " no es una opcion valida "
			Fin Si
		Fin Si
		
	Fin Si
	
	
	
	
FinAlgoritmo
//Una empresa tiene personal de distintas áreas con distintas condiciones de contratación 
//y formas de pago. El departamento de contabilidad necesita calcular 
//los sueldos semanales (lunes a viernes) en base a las 3 modalidades de sueldo: 
// A  - comisión
// B - salario fijo + comisión
// C - salario fijo
// A - Para la modalidad salario por comisión se debe ingresar el monto total 
//de las ventas realizadas en la semana, y el 40% de ese monto total corresponde 
//al salario del empleado. 
//B - Para la condición de salario fijo + comisión, se debe ingresar el valor que se paga
//por hora, la cantidad de horas trabajadas semanalmente y el monto total de las ventas 
//en esa semana. En este tipo de contrato las horas extras no están contempladas y
//se fija como máximo 40 horas por semana. La comisión por las ventas se calcula como 25% del valor de venta total.
// C -  Finalmente, para la modalidad de salario fijo se debe ingresar 
//el valor que se paga por hora y la cantidad de horas trabajadas en la semana. 
//En el caso de exceder las 40 horas semanales, las horas extras se deben pagar 
//con un extra del 50% del valor de la hora. Realizar un menú de opciones para poder 
//elegir el tipo de contrato que tiene un empleado.