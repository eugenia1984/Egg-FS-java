/*
Dibujar un cuadrado de N elementos por lado utilizando el carácter “*”. Por ejemplo,
si el cuadrado tiene 4 elementos por lado se deberá dibujar lo siguiente:
* * * *
*     *
*     *
* * * *
 */
package ejercicio18;

import java.util.Scanner;

public class Ejercicio18 {

    public static void main(String[] args) {
        int cuadrado;
        Scanner leer = new Scanner(System.in);
        
        System.out.println("Ingrese el tamaño del cuadrado : ");
        cuadrado = leer.nextInt();
        
        for(int i=1; i<=cuadrado ;i++){
            for(int j=1; j<=cuadrado; j++){
                if( i==1 || i==cuadrado ){
                    System.out.print("* ");
                }else if( j == 1 || j == cuadrado ){
                    System.out.print("* ");
                }else{
                    System.out.print("  ");
                }
            }
            System.out.println("");
        }
    }
}
    

