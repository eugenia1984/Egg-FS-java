Algoritmo ValorLimite
	//Escriba un programa en el cual se ingrese un valor l�mite positivo,
	//y a continuaci�n solicite n�meros al usuario hasta que la suma de los n�meros introducidos 
	//supere el l�mite inicial.
	Definir i, valor_limite, valor_final, num1 Como Real
	i = 0
	valor_limite = 0
	valor_final = 0
	num1 = 0
	
	Escribir " Por favor ingrese un n�mero positivo para que sea nuestro l�mite positivo: "
	Leer valor_limite
	
	Mientras valor_final < valor_limite Hacer
		Escribir " Por favor ingrese otro n�mero positivo: "
		Leer num1
		valor_final = valor_final + num1
	Fin Mientras

FinAlgoritmo
