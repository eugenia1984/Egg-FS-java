/*
Realizar un algoritmo que rellene un vector con los 100 primeros números enteros y
los muestre por pantalla en orden descendente.
 */
package ejercicio21;

public class Ejercicio21 {

    public static void main(String[] args) {
     
       int n=100; //vector como entero, con dimension de 100
       int[] vector = new int[n]; 
    
       for(int i = 0; i<100; i++){ //Con un for voy a ir recorriendo todas las posiciones de sus elementos   
      
           vector[i] = 100-i;    //Para que sea en forma descendiente mi vector[i] = 100 y va restando de 1 en 1   
           System.out.println("[" + vector[i] + "]");
        }
    }   
    
}
