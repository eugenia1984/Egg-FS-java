/*
Realizar un algoritmo que rellene un vector de tamaño N con valores aleatorios y le
pida al usuario un numero a buscar en el vector. El programa mostrará donde se
encuentra el numero y si se encuentra repetido
 */
package ejercicio22;

import java.util.Scanner;
import java.util.Vector;

public class Ejercicio22 {

    public static void main(String[] args) {
        int n,num;
        int contador=0;
        Scanner leer = new Scanner(System.in);
        
        
        System.out.println("Ingrese la cantidad de números que quiere tenga el vector : ");
        n= leer.nextInt();
        int[] vector = new int[n];
    //Para rellenar el vector con numeros aleatorios entre 0 y 10    
        for(int i=0; i<vector.length; i++){
            vector[i]= (int)(Math.random()*10);
        }
        
        System.out.println("Ingrese el número a buscar");
        num = leer.nextInt();
    //Para buscar el numero ingresado en el vector y contar cuantas veces esta   
        for(int i=0; i< vector.length; i++){
            if(vector[i] == num){
                contador++;
            }
        }
        
        if( contador == 0 ){
            System.out.println("El numero no se encuentra en el vector");
        }else if( contador == 1){
            System.out.print("El numero se encuentra en la posición");
        }else{
            System.out.print("El número figura "+ contador + " veces en el vector. En las posiciones ");
        }
        
         for(int i=0;i< vector.length;i++){
            if(vector[i]==num){
                System.out.print(i + " ");
            }
        }
    }
    
}
