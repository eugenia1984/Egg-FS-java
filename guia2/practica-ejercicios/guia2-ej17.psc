Algoritmo IngresarClave
	Definir clave Como Caracter ///Defino las variables
	Definir intentos Como Entero
	
	clave=""  ///Inicializo variables
	intentos = 3
	
	Hacer
		Escribir "Ingrese una clave: "               ///Pido ingrese la clave e informo cuantos intentos tiene
		Escribir "Ustedes tiene ", intentos, " intentos."
		
		Leer clave 
		clave = Minusculas(clave) ///paso a min�scula por si ingres� alguna may�scula ya que en m condici�n eureka est� en min�scula
		intentos = intentos - 1   ///voy descontando los itnentos que hizo
	Hasta Que  intentos = 0 O clave = "eureka"
	
	Si intentos = 0 Entonces
		Escribir " Se le terminaron los 3 intentos. "
	SiNo
		Escribir " Se ingreso correctamente al sistema." 
	Fin Si
	
FinAlgoritmo
