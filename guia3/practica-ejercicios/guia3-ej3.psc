Algoritmo EsMultiploONo
	Definir num1, num2, x, z Como Real ///Defino las variables
	
	num1 = 0  ///Inicializo las variables
	num2 = 0
	
	Escribir " Por favor ingrese dos número para decirle si el primero es múltiplo del segundo : "
	Leer num1, num2
	
	Escribir "Es ", EsMultiplo(num1,num2), " que ", num1, " es múltiplo de ", num2, " ." 
FinAlgoritmo

Funcion resultado_multiplo <- EsMultiplo(x,z)
	Definir resultado_multiplo Como Logico
	Si  x MOD z = 0  Entonces
		resultado_multiplo = Verdadero
	SiNo
		resultado_multiplo = Falso
	Fin Si
Fin Funcion
