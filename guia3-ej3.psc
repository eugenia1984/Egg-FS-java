Algoritmo sin_titulo
	//Crea una funci�n EsMultiplo que reciba los dos n�meros pasados por el usuario,
	//validando que el primer numero m�ltiplo del segundo y devuelva verdadero si el
	//primer numero es m�ltiplo del segundo, sino es m�ltiplo que devuelva falso.
	Definir num1, num2 Como Real
	num1 = 0
	num2 = 0
	
	Escribir " Por favor ingrese dos n�meros para decirle si son m�ltiplos: "
	Leer num1, num2
	
	Escribir num1, " es multiplo de ", num2, " ", EsMultiplo( num1, num2)
FinAlgoritmo

Funcion resultado_multiplo <- EsMultiplo(num1, num2)
	
	Definir resultado_multiplo Como Logico
	
	Si num1 MOD num2 = 0  Entonces
		resultado_multiplo = Verdadero
	SiNo
		resultado_multiplo = Falso
	Fin Si
	
Fin Funcion


