/*
Dadas dos matrices cuadradas de numeros enteros, la matriz M de 10x10 y la 
matriz P de 3x3, se solicita escribir un programa en el cual se compruebe 
si la matriz P esta contenida dentro de la matriz M. 
ara ello se debe verificar si entre todas las submatrices de 3x3 que se 
pueden formar en la matriz M, desplazandose por filas o columnas, 
existe al menos una que coincida con la matriz P. En ese caso, el
programa debe indicar la fila y la columna de la matriz M en la cual empieza el
primer elemento de la submatriz P.
*/
package ejercicio28;

import java.util.Random;
import java.util.Scanner;

public class Ejercicio28 {

    public static void main(String[] args) {
        Scanner leer = new Scanner (System.in);
        int [][] matriz = new int [10][10];
        int [][] matriz1 = new int [3][3];
        
        
        rellenarMatriz(matriz, matriz1);
        matrizInsertada(matriz,matriz1);
        
    }
    
    public static void rellenarMatriz(int matriz[][],int matriz1[][]){
        Random random = new Random(System.currentTimeMillis());
        Scanner leer = new Scanner (System.in);

        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                matriz[i][j]=(int)random.nextInt(9); 
                System.out.print("["+matriz[i][j]+"]"+" ");
            }
            System.out.println("");
        }
        System.out.println("");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.println("Ingrese los valores en la posicion: "+i+j+" ");
                matriz1[i][j]=leer.nextInt();
            }
        }
     
    }
    
    
    public static void matrizInsertada(int matriz[][],int matriz1[][]){
        boolean encontro = false;
        
        for (int i = 0; i < 7; i++) {
            for (int j = 0; j < 7; j++) {
                if(matriz[i][j]==matriz1[0][0]){
                    encontro=true;
                    for (int k = 0; k < 3; k++) {
                        for (int l = 0; l < 3; l++) {
                            if(matriz[i+k][j+l]!=matriz1[k][l]){
                                encontro=false;
                            }
                        }
                    } if (encontro){
                        System.out.println("El comienzo de la matriz se encontro en la posicion: "+i+" "+j);
                    }
                    
                }
            }
        } 
        
    }
    

    

}
