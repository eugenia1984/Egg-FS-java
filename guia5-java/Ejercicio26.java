/*
Un cuadrado mágico 3 x 3 es una matriz 3 x 3 formada por números del 1 al 9
donde la suma de sus filas, sus columnas y sus diagonales son idénticas. 
Crear un programa que permita introducir un cuadrado por teclado y 
determine si este cuadrado es mágico o no. 
El programa deberá comprobar que los números introducidos son correctos,
es decir, están entre el 1 y el 9.
 */
package ejercicio26;

import java.util.Scanner;

public class Ejercicio26 {

    public static void main(String[] args) {
       
        int[][] matriz= new int[3][3];  ///La matriz de 3 x 3
        
        int diagonal1=0;
        int diagonal2=0;
        int horizontal;
        int vertical;
        int base= 0;
        boolean magico = true;
        
        Scanner leer = new Scanner(System.in);
        
        
        do {
            
            diagonal1=0;
            diagonal2=0;
            magico=true;
            
            for (int i = 0; i < 3; i++) { //Para recorrer las filas
                horizontal = 0;
                
                for (int j = 0; j < 3; j++) {  //para recorrer las columnas
                    matriz[i][j] = (int) (Math.random() * 9)+1;  //Para que sean numeros aleatorios entre 1 y 9
                    //matriz[i][j]=leer.nextInt();
                    horizontal += matriz[i][j];  ///sumo la fila con los valores de la columna
                    
                    if (i == j) { // [0,0] , [1,1], [2,2] 
                        diagonal1 += matriz[i][j];
                    }
                    
                    if (i + j == 2) {  // [0,2] , [1,1], [2,0]
                        diagonal2 += matriz[i][j];
                    }
                    
                }
                
                if (i == 0) {
                    base = horizontal;
                } else if (base != horizontal) {
                    magico = false;
                }
                
            }

            if ((diagonal1 != base) || (diagonal2 != base)) {
                magico = false;
            }

            for (int i = 0; i < 3; i++) { //para recorrer las filas
                vertical = 0;
                
                for (int j = 0; j < 3; j++) { //para recorrer las columnas
                    vertical += matriz[j][i];
                }
                if (base != vertical) {
                    magico = false;
                }
            }
            
        
            /* Asi podria imprimir todas las que son false
            
            for(int i = 0; i<3; i++){
                for(int j= 0; j<3; j++){
                    System.out.print("[" + matriz[i][j] + "] ");
                }
                System.out.println("");       
            }
        
            System.out.println(base);
            System.out.println(diagonal1);
            System.out.println(diagonal2);
            System.out.println(magico);
       
        */
        
        } while (!magico);   
        
        for( int i = 0; i<3; i++ ){ //para recorrer las filas...
            for(int j= 0; j<3; j++){ //para recorrer las columnas ...
                System.out.print("[" + matriz[i][j] + "] ");
            }
            System.out.println("");       
        }
        
        System.out.println(base);
        System.out.println(diagonal1);
        System.out.println(diagonal2);
        System.out.println(magico);
        
    }
    
}
