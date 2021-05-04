Algoritmo MiAlgoritmo
	Definir num1, num2 Como Caracter  ///Defino variables
	
	num1=""  ///Inicializo
	num2=""
	
	Escribir "Por favor ingrese su usuario: "
	Leer num1
	Escribir "Por favor ingrese la contraseña: "
	Leer num2
	Escribir chequeoLoguin(num1,num2)  ///Llamo a la funcion
FinAlgoritmo

///Funcion fuera dle Algoritmo principal
Funcion resultado <- chequeoLoguin(num1,num2)
	Definir resultado Como Logico ///Defino las variables de la función
	Definir i Como Entero
	i = 0 ///Inicializo variable
	
	Repetir
		i = i + 1
		Si num1="usuario1" Y num2="asdasd" Entonces
			resultado=Verdadero
		SiNo
			Escribir " Por favor ingrese nuevamente el usuario y la contraseña: "
			Leer num1,num2
		Fin Si
	Mientras Que i <2 y num1 <>"usuario1" Y num2<>"asdasd"
	
	Si i=3 Entonces
		suma= Falso
	Fin Si
	
	Escribir "La cantidad de intentos es: ", i	
Fin Funcion
