/*
Escriba un programa en el cual se ingrese un valor límite positivo, y a continuación
solicite números al usuario hasta que la suma de los números introducidos supere
el límite inicial.
*/
package ejercicio13;

import java.util.Scanner;

public class Ejercicio13 {

    public static void main(String[] args) {
        
        Scanner leer = new Scanner(System.in);
    //Declaro mis variables    
        int limite;
        int num2;
        int aux;
    //Pido el valor limite y lo asigno    
        System.out.println("Ingrese un valor limite ");
        limite = leer.nextInt();
        aux = 0;
        do {
            System.out.println("Ingrese un número entero positivo ");
            num2 = leer.nextInt();
    //Uso la variable aux como acumulador de la sumatoria de los numeros ingresados   
            aux = num2 + aux;
        } while (aux < limite);
            
    }
}
