/*
 Crear una función rellene un vector con números aleatorios, pasándole un arreglo
por parámetro. 

Después haremos otra función o procedimiento que imprima el
vector.
 */
package extra19;

import java.util.Scanner;

public class Extra19 {

    public static void main(String[] args) {
        int[] vector;
        int d;
        Scanner leer = new Scanner(System.in);
        
        System.out.println("Ingrese dimension: ");
        d = leer.nextInt();
        
        vector = new int[d];
        vector = llenarVector(vector);
        
        mostrarVector(vector);
    }
    
    public static int[] llenarVector(int[] vec) {
        int d;
        d = vec.length;
        
        for (int i = 0; i < d; i++) {
            vec[i] = (int)(Math.random()*99+1);
        }
        return vec;
    }
    
    public static void mostrarVector(int[] vec) {
        int d;
        d = vec.length;
        
        for (int i = 0; i < d; i++) {
            System.out.print("[" + vec[i] + "]"); 
        }
    }
}
