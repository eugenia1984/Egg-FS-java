Algoritmo ConvertirDias
	Definir dia, hora, minutos, segundoss Como Entero
	Escribir "Por favor ingrese una cierta cantidad de días (en números, por ejemplo para un día ingrese 1, para dos días ingrese 2...) :" 
	Leer dia
	hora = dia * 24
	minutos = hora * 60
	segundoss = minutos * 60
	Escribir "Sus días ingresados equivalen a: ", hora, " horas, ", minutos, " minutos, ", segundoss, " segundos."
	
FinAlgoritmo
