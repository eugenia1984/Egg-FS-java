/*

ARREGLOS -> estructuras que nos permiten guardar en memoria múltiples valores
            del mismo tipo.

ARREGLO UNIDIMENSIONAL -> VECTOR

ARREGLO MULTIDIMENSIONAL -> MATRIZ

Ejercicio:
realizar la multiplicación de u vector por una matriz
Dado un vector 1xN y una matriz NxM, el resultado del producto es 1XM

Ej. vector 1x2 * matriz 2x3 = producto 1x3
v=|3,5| * m = | 4, 8, 6| = | ( 3x4 + 5x2 ) , ( 3x8 + 5x1) , (3x6 + 5x7) |
              | 2, 1, 7|

Así por cada columna de la matriz:
(1er elemento del vector x 1er elemento de la columna) + 
(2do elemento del vetor x 2do elemento de la columna)

BUCLE FOR MEJORADO -> permite recorrer el arreglo sin necesidad de identificar 
                     el subindice recorriendolo elemento por elemento
                    -1: palabra reservada FOR
                    -2: tipo de dato
                    -3: nombre 
                    -4: arreglo que queremos recorrer

Para recorrer un arreglo y acceder a todos sus elementos necesito tantos
bucles como la dimensión del arreglo
 */
package vectoresYMatrices;

import java.util.Scanner;

public class VectoresYmatrices {


    public static void main(String[] args) {
        
        //declaración y creación de un vector 
        //[+ indica que es un VECTOR
        //tipo[] nombreVector = new tipo[tamanio];
        
        //declarar un arreglo de una dimension -> le doy un nmbre
        int[] vector;  ///vector para recibir los valores
        //crear en memoria (construir/dimensionar) con el valor por defecto(0 para los enteros)
        vector = new int[2];
        
        //los dos pasos en una linea
        int[] producto = new int[3];   ///vector para el resultado dle producto
        
        //declaracion y creacion de una matriz
        //tipo[][] nombreMatriz = new tipo[filas][columnas]
        
        //declaracion e inicialización con valores predeterminados
        //no es necesario indicar la dimensión, porque ya al dar umeros se sabe 
        int[][] matriz = { {4, 8, 6}, {2, 1, 7} };
        
        //declaracion y creacion de arreglos genéricos
        // tipo[]...[] nombreArreglo = new tipo[cardinalidad 1]...[cardinalidad N];
        
        System.out.println("Ingrese los valores del vector de tamaño " + vector.length + ":");
        
        Scanner leer = new Scanner(System.in);
        
        //int i = 0, porque los subindices de los arreglos en java inicializan en 0
        for (int i = 0; i < vector.length; i++) {
            System.out.println("v[" + i + "] = ");
            vector[i] = leer.nextInt(); //accede al valor i del vector
        }
        
        //MULTIPLICO EL VECTOR POR MATRIZ
        int sum;
        
       //El largo es el LARGO de la FILA, su CARDINALIDAD
        for (int j = 0; j < matriz[0].length; j++) {  //...para cada columna de la matriz...
            sum = 0;

            for (int i = 0; i < vector.length; i++) { //...recorro el vector y multiplico
                sum += vector[i] * matriz[i][j];
            }
            
            producto[j] = sum;
        }
        
        String aux = "";
        
        //Mostrar vector
        System.out.println("* Vector : ");
        
        //BUCLE FOR MEJORADO -> for ( tipo elemento : arreglo )
        for ( int elemento : vector) {
            aux = aux + " " + elemento;  //variable auxiliar de ipo String para concatenar
        }
        System.out.println(aux);
        
        //MOSTRAR MATRIZ
        System.out.println("\n Matriz : ");
        for( int[] fila : matriz ) {  //para cada fila de la matriz...
            aux = "" ;
            
            for( int elemento : fila ) {   //para cada elemento de la fila...
                aux += " " + elemento;
            }
            System.out.println(aux);
        }
        
        //MOSTRAR RESULTADO
        aux="";
        System.out.println("\n *Vector x Matriz : ");
        for(int elemento : producto) {
            aux += " " + elemento;
        }
        System.out.println(aux);
        
    }
    
}
