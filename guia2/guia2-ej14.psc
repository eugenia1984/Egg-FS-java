Algoritmo NotaPedida
	Definir NotasPedida Como Real
	NotasPedida = 0
	
	Escribir " Por favor ingrese una nota entre el 1 y el 10 : "
	Leer NotasPedida
	
	Mientras NotasPedida < 0  O NotasPedida > 10 Hacer
		Escribir " Por favor ingrese una nota entre el 1 y el 10 : "
		Leer NotasPedida
	Fin Mientras
	
FinAlgoritmo
