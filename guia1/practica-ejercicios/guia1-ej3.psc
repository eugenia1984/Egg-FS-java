Algoritmo PrecioPromedio
	//Escribir un programa que calcule el precio promedio de un producto. 
	//El precio promedio se debe calcular a partir del precio del mismo producto en tres establecimientos distintos.
	Definir precio1, precio2, precio3, precio_promedio Como Real
	
	precio1=0
	precio2=0
	precio3=0
	
	Escribir "Ingrese el precio del mismo producto en tres establecimientos distintos: "  ///Pido que ingrese los 3 precios
	Leer precio1, precio2, precio3   ///Los leo y asigno valores a cada variable
	precio_promedio = REDON(precio1 + precio2 + precio3) / 3 ///Calculo el precio promedio
	
	Escribir "El PRECIO PROMEDIO del producto en base a los 3 establemientos es de: ", precio_promedio  ///Muestro por pantalla el precio promedio
FinAlgoritmo
