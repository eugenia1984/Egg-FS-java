/*
Crear un programa que dibuje una escalera de números, donde cada línea de
números comience en uno y termine en el número de la línea. Solicitar la 
altura de la escalera al usuario al comenzar. 
Ejemplo: si se ingresa el número 3:
1
12
123
 */
package extra12;

import java.util.Scanner;


public class Extra12 {

    public static void main(String[] args) {
        
        Scanner leer = new Scanner(System.in);
        int tamanio;
        
        //Pido el tamaño de la escalera al usuario y lo asigno a la variable tamanio
        System.out.println("Ingrese el tamaño de la escalera : ");
        tamanio = leer.nextInt();
        
        for( int i=1; i<=tamanio; i++){
            
            for( int j=1; j<=i; j++){
                System.out.print( j + " ");
            }
            System.out.println("");
        }
    }
    
}
