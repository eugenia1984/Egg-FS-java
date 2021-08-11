Algoritmo sin_titulo
	
	///Defino mis variables
	Definir dia, mes, anio Como Enteros
	
	///Incializo mis variables
	dia = 0
	mes = 0
	anio = 0
	
	///Pido al usuario que ingrese los datos
	Escribir "Piense en una fecha e ingrese su día en números: "
	Leer dia
	Escribir "Ingrese el mes de esa misma fecha en números: "
	Leer mes
	Escribir "Ingrese el año de esa fecha en numeros: "
	Leer anio
	
	Si ( dia >= 1 Y dia <= 31 ) Y ( mes >= 1 Y mes <= 12 ) Y anio > 0 Entonces
		
		///con un switch veo el mes para mandar en letra en vez de numero
		Escribir "Su fecha ingresada es: "
		Segun mes Hacer
			1:
				Escribir dia, " Enero de ", anio
			2:
				Escribir dia, " Febrero de ", anio
			3:
				Escribir dia, " Marzo de ", anio
			4:
				Escribir dia, " Abril de ", anio
			5:
				Escribir dia, " Mayo de ", anio
			6:
				Escribir dia, " Junio de ", anio
			7:
				Escribir dia, " Julio de ", anio
			8:
				Escribir dia, " Agosto de ", anio
			9:
				Escribir dia, " Septiembre de ", anio
			10:
				Escribir dia, " Octubre de ", anio	
			11:
				Escribir dia, " Noviembre de ", anio	
			12:
				Escribir dia, " Diciembre de ", anio
		Fin Segun
		
	SiNo
		Escribir "ERROR, no ingreso una fecha valida"
	Fin Si
	
FinAlgoritmo


