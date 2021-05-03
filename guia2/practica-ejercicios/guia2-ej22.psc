Algoritmo DibujarCuadrado
	
	Definir i, j, lado Como Entero ///Defino las variables
		
	Escribir "Ingrese cuanto mide el lado del cuadrado (en número entero) : "
	Leer lado
	
	Para i = 1 Hasta lado Con Paso 1 Hacer
		Para j = 1 Hasta lado Con Paso 1 Hacer
			Si i = 1 O j = 1 O i = lado O j = lado Entonces
				Escribir Sin Saltar "*"
			SiNo
				Escribir Sin Saltar " "
			FinSi
		FinPara
		Escribir ""
	FinPara
	
FinAlgoritmo
