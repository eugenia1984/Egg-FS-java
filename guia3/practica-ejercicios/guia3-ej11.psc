Algoritmo Ejercicio11
	Definir num1 Como Entero ///Declaro mi variable
	
	Escribir "Ingrese un número entero para decirle la suma de sus divisores: "
	Leer num1
	
	Escribir "La suma de los divisores de ", num1, " es de: ", sumaDivisores(num1) ///Llamo a la función
	
FinAlgoritmo

///Función fuera del Algoritmo Principal
Funcion suma_divisores <- sumaDivisores(num1)
	
	Definir suma_divisores Como Real ///defino mis variables de la función
	Definir i Como Entero
	
	i=1  ///Inicializo las variables de la función
	
	Para i=1 Hasta num1 Con Paso 1 Hacer ///Para ir sumando de uno en uno desde 0 al numero ingresado asi veo si son divisibles
		Si num1 MOD i = 0 Entonces
			suma_divisores = num1 + sumaDivisores(num1-1)
		SiNo
			i = num1 + 1
		Fin Si
	Fin Para
Fin Funcion
