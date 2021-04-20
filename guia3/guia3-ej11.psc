Algoritmo Ejercicio11
	Definir num1 Como Entero
	
	Escribir "Ingrese un número entero para decirle la suma de sus divisores: "
	Leer num1
	
	Escribir "La suma de los divisores de ", num1, " es de: ", sumaDivisores(num1)
	
FinAlgoritmo

Funcion suma_divisores <- sumaDivisores(num1)
	
	Definir suma_divisores Como Real
	Definir i Como Entero
	
	i=1
	
	Para i=1 Hasta num1 Con Paso 1 Hacer //Para ir sumando de uno en uno desde 0 al numero ingresado asi vemos si son divisibles
		Si num1 MOD i = 0 Entonces
			suma_divisores = num1 + sumaDivisores(num1-1)
		SiNo
			i = num1 + 1
		Fin Si
	Fin Para
Fin Funcion

	
//Realizar una función que calcule y retorne la suma de todos los divisores del número n distintos de n.
// El valor de n debe ser ingresado por el usuario.