Algoritmo ValorLimite
	//Escriba un programa en el cual se ingrese un valor límite positivo,
	//y a continuación solicite números al usuario hasta que la suma de los números introducidos 
	//supere el límite inicial.
	Definir i, valor_limite, valor_final, num1 Como Real
	i = 0
	valor_limite = 0
	valor_final = 0
	num1 = 0
	
	Escribir " Por favor ingrese un número positivo para que sea nuestro límite positivo: "
	Leer valor_limite
	
	Mientras valor_final < valor_limite Hacer
		Escribir " Por favor ingrese otro número positivo: "
		Leer num1
		valor_final = valor_final + num1
	Fin Mientras

FinAlgoritmo
