Algoritmo SueldoVendedores
	
	Definir sueldoBase, extraPorComision, venta, totalVendido Como Real ///Definir las variables 
	Definir comisionesAPagar, totalAPagar Como Real
	Definir i, j, ventasRealizadas, cantidadVendedores Como Entero
	
	comisionesAPagar = 0 ///Inicializar las variables
	totalVendido = 0
	totalAPagar = 0
	
	Escribir "Ingrese la cantidad de vendedores: "
	Leer cantidadVendedores
	
	Para i = 1 hasta cantidadVendedores Con Paso 1 Hacer
		Escribir "Ingresar sueldo base del ", i ,"º vendedor: "    ///Pido el sueldo base y lo guardo en variable
		Leer sueldoBase
		
		Escribir "Ingresar cantidad de ventas del ", i, "º vendedor:"   ///Pido cantidad de ventas y las guardo en variable
		Leer ventasRealizadas
		
		Para j = 1 Hasta ventasRealizadas Con Paso 1 Hacer ///Con un PARA pido que ingrese el precio de cada venta y las voy sumando en totalVendido
			Escribir "Del ", i, "º vendedor ingresar el precio de la ", j, "º venta: "
			Leer venta
			totalVendido = totalVendido + venta
		FinPara
		
		extraPorComision = totalVendido * 0.10 ///Calculo la  comision por vente
		comisionesAPagar =  comisionesAPagar + extraPorComision  ///Voy sumando las comisiones de cada venta
		totalAPagar = totalAPagar + sueldoBase + extraPorComision  ///Voy sumando el sueldo base y las comisiones
		totalVendido = 0
	FinPara
	
	Escribir "Se debera pagar comisiones por un total de: $ ", comisionesAPagar
	Escribir "Se debera pagar sueldos por un total de: $ ", totalAPagar
	
	
FinAlgoritmo
