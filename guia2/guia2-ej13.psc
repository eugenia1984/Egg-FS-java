Algoritmo Produccion
	Definir tornillosDefectuosos Como Caracter
	Definir tornillosSinDefecto Como Caracter
	
	tornillosDefectuosos = " "
	tornillosSinDefecto = " "
	
	Escribir " Por favor ingrese S si produce menos de 200 tornillos defectuosos o cualquier otra letra si produce más de 200 tornillos defectuosos : "
	Leer tornillosDefectuosos
	tornillosDefectuosos = mayusculas(tornillosDefectuosos)
	Escribir " Por favor ingrese S si produce más de 100000 tornillos sin defecto o cualquier otra letra si produce menos de 10000 tornillos sin defecto : "
	Leer tornillosSinDefecto
	tornillosSinDefecto = mayusculas(tornillosSinDefecto)
	
	Si ( (tornillosDefectuosos != 'S') Y (tornillosSinDefecto != 'S') )  Entonces
		Escribir " Grado de eficiencia 5"
	SiNo
		Si ( (tornillosDefectuosos = 'S') Y (tornillosSinDefecto != 'S' ) )  Entonces
			Escribir " Grado de eficiencia 6"
		SiNo
			Si ( (tornillosDefectuosos != 'S' ) Y (tornillosSinDefecto = 'S' ) )  Entonces
				Escribir " Grado de eficiencia 7"
			SiNo
				Escribir " Grado de eficiencia 8"
			Fin Si
		Fin Si
	Fin Si
	
FinAlgoritmo
