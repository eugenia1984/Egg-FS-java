/*
Realizar un programa que rellene un matriz de 4 x 4 de valores aleatorios y la
muestre ordenada por sus columnas
 */
package ejercicio24;

public class Ejercicio24 {


    public static void main(String[] args) {
        
        int[][] matriz = new int[4][4];
        
        for(int i= 0; i<4; i++){
            for(int j =0; j<4; j++){
                matriz[i][j]=(int)(Math.random()*100);
                System.out.print("["+matriz[i][j]+"] ");
            }
            System.out.println("");
        }
    }
    
}
