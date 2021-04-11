Algoritmo VariacionPrecio
	Definir precio_inicio, precio_final, variacion_precio Como Real
	Escribir "Por favor ingrese el precio del producto a principio de año: "
	leer precio_inicio
	Escribir "Por favor ingrese el precio del producto a final de año: "
	leer precio_final
	variacion_precio = (precio_final - precio_inicio) * 100 / precio_inicio
	Escribir "El porcentaje de aumento que tuvo el producto es de : ", variacion_precio, " %."
	
FinAlgoritmo
