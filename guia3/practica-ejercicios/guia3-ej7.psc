Algoritmo AvriguaLaTemperaturaMedia
	Definir cantidad_dias, i Como Entero  ///Declaro la variable
	Definir temperatura_maxima, temperatura_minima  Como Real

	
	Escribir " Ingres una cantidad de días para calcular las temperaturas medias: "
	Leer cantidad_dias

	Para i = 1 Hasta cantidad_dias Con Paso 1 Hacer
		
		Escribir " Ingrese la temperatura máxima del día ", i, " : "
		Leer temperatura_maxima
		Escribir " Ingrese la temperatura mínima del día ", i, " : "
		Leer temperatura_maxima, temperatura_minima
		
		Escribir "La temperatura media del día ", i, " es : ", TemperaturaMedia(temperatura_maxima,temperatura_minima)
	Fin Para
	
FinAlgoritmo

Funcion x <-  TemperaturaMedia(temperatura_maxima,temperatura_minima)
	Definir x Como Real
	x = 0
	x = (temperatura_maxima + temperatura_minima ) / 2
Fin Funcion

