/*
Realizar un algoritmo que calcule la suma de todos los elementos de un vector de
tamaño N, con los valores ingresados por el usuario.
 */
package extra17;

import java.util.Scanner;


public class Extra17 {

    public static void main(String[] args) {
        
        //Defino mis variables
        int n;
        int suma = 0;
        
        Scanner leer = new Scanner(System.in);
        
        //Pido la cantidad de numeros y le doy al dimensión al vector
        System.out.println("Ingrese la cantidad de números a sumar: ");
        n = leer.nextInt();
        int[] vector = new int[n];
        
        //Pido que el usuario vaya ingresando los valores
        for( int i=0; i<n; i++){
            System.out.println("Ingrese el numero entero para la posicion :" + i);
            vector[i]= leer.nextInt();
            suma += vector[i]; //Voy acumulando en la suma todos los valores ingresados
        }
        
        System.out.println("La suma de los números ingresados es: "+ suma);
    }
    
}
