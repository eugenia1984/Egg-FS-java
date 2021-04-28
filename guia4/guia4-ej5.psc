Algoritmo Ejercicio5
	Definir op,op2 Como Caracter
	Definir salir,salir2 Como Logico
	Definir vectorA,vectorB,vectorC,tam,i Como Entero
	Definir tamOk,Alleno,Blleno,Clleno Como Logico
	
	tamOk = Falso
	Alleno = Falso
	Blleno = Falso
	Clleno = Falso
	op = ""
	
	MostrarMenu
	
	salir = Falso
	Mientras !salir
		Escribir "Elija una opción:"
		Leer op
		
		Segun Minusculas(op)
			"": MostrarMenu
			"a":
				Si !tamOk
					Escribir "Ingrese el tamaño del vector:"
					Leer tam	
					Dimension vectorA[tam]
					Dimension vectorB[tam]
					Dimension vectorC[tam]
					tamOk=Verdadero
				FinSi
				
				Para i= 0 Hasta tam-1
					vectorA[i]=Aleatorio(-100,100)
				FinPara
				
				Alleno=Verdadero
				Escribir "Se llenó el vector A con números aleatorios entre -100 y 100"
			"b":
				Si !tamOk
					Escribir "Ingrese el tamaño del vector:"
					Leer tam	
					Dimension vectorA[tam]
					Dimension vectorB[tam]
					Dimension vectorC[tam]
					tamOk=Verdadero
				FinSi
				
				Para i= 0 Hasta tam-1
					vectorB[i]=Aleatorio(-100,100)
				FinPara
				
				Blleno=Verdadero
				Escribir "Se llenó el vector B con números aleatorios entre -100 y 100"
			"c":
				Si Alleno & Blleno
					Para i= 0 Hasta tam-1
						vectorC[i]=vectorA[i]+vectorB[i]
					FinPara
					Clleno=Verdadero
					Escribir "Se llenó el vector C con la suma de los vectores A y B."
				SiNo
					Escribir "Error. Algún vector está vacío."
				FinSi
			"d":
				Si Alleno & Blleno
					Para i= 0 Hasta tam-1
						vectorC[i]=vectorB[i]-vectorA[i]
					FinPara
					Clleno=Verdadero
					Escribir "Se llenó el vector C con la resta entre los vectores B y A."
				SiNo
					Escribir "Error. Algún vector está vacío."
				FinSi
			"e":
				salir2=Falso
				Mientras !salir2
					Escribir "Qué vector quiere mostrar? (A,B o C)."
					Leer op2
					Segun Minusculas(op2)
						"": salir2=Verdadero
						"a": 
							Si Alleno
								Escribir "Valores del Vector A: "
								MostrarVector(vectorA,tam)
							SiNo
								Escribir "El vector A está vacío."
							FinSi
						"b": 
							Si Blleno
								Escribir "Valores del Vector B: "
								MostrarVector(vectorB,tam)
							SiNo
								Escribir "El vector B está vacío."
							FinSi
						"c":
							Si Clleno
								Escribir "Valores del Vector C: "
								MostrarVector(vectorC,tam)
							SiNo
								Escribir "El vector C está vacío."
							FinSi
						De Otro Modo:
							Escribir "Opción incorrecta. Enter para volver al menú anterior."
					FinSegun
				FinMientras
				
			"f": salir=Verdadero
			De Otro Modo:
				Escribir "Opción incorrecta. Enter para volver a mostrar el menú."
		FinSegun
	FinMientras
FinAlgoritmo

SubProceso MostrarMenu
	Escribir "Menú de opciones:"
	Escribir "-----------------"
	Escribir "a. Llenar Vector A con números aleatorios."
	Escribir "b. Llenar Vector B con números aleatorios."
	Escribir "c. Llenar Vector C con la suma de los vectores A y B."
	Escribir "d. Llenar Vector C con la resta de los vectores B y A."
	Escribir "e. Mostrar Vectores."
	Escribir "f. Salir."
	Escribir ""
FinSubProceso

SubProceso MostrarVector(vector,tamanio)
	Definir i Como Entero
	Para i= 0 Hasta tamanio-1
		Si i<tamanio-1
			Escribir Sin Saltar vector[i] ", "
		SiNo
			Escribir Sin Saltar vector[i]
		FinSi
	FinPara
	Escribir ""
FinSubProceso
	
//Realiza un programa con el siguiente menú y le pregunte al usuario que quiere hacer hasta que ingrese la opción Salir:
//a- Llenar Vector A: este vector es de tamaño N y se debe llenar de manera aleatoria usando la suncion Aleatorio(valorMin,valorMax) de PseInt
//b-Llenar vector B: este vector tambien es de tamaño N y se llena de manera aleatoria
//c-Llenar vector C con la suma de los vectores A y B, la suma se debe realizar elemento a elemento. Ejemplo C = A+B
//d-Llena vector C con la resta de los elementos B y A. La resta se debe realizar elemento a elemento. Ejemplo C = B - A
//e-Mostrar. Esta opción debe permitir al usuario decidir qué vector quiere mostrar: Vector A,B o C
//f-Salir
//Nota: el rango de los números aleatorios para los vectores será de {-100 a 100}.
//La longitud para todos los vectores debe ser la misma, por lo tanto, esa informaciñon sñolo se solicitará una vez.
