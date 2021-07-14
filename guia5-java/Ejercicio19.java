/*
Realizar un programa que lea 4 números (comprendidos entre 1 y 20) e imprima el
número ingresado seguido de tantos asteriscos como indique su valor. Por ejemplo:
5 *****
3 ***
11 ***********
2 **
 */
package ejercicio19;

import java.util.Scanner;

public class Ejercicio19 {

    public static void main(String[] args) {
        int n1,n2,n3,n4;
        
        System.out.println("Ingrese 4 numeros comprendidos entre 1 y 20");
        System.out.println("Numero1");
        n1=cargar();
        System.out.println("Numero2");
        n2=cargar();
        System.out.println("Numero3");
        n3=cargar();
        System.out.println("Numero4");
        n4=cargar();
        
        imprimir(n1);
        imprimir(n2);
        imprimir(n3);
        imprimir(n4);
    }

    public static int cargar(){
        int numero;
        Scanner leer = new Scanner(System.in);
        numero=leer.nextInt();
        while( numero <= 0 || numero >= 20){ //Para que sean numeros entre[0,20]
            System.out.println("numero ingresado no correcto. Ingresar nuevamente");
            numero = leer.nextInt();
        }
        return numero;
    }
    
    public static void imprimir(int numero){
        System.out.print(numero);
        for(int i=1; i <= numero; i++){
            System.out.print("*");
        }
        System.out.println("");
    }
    
}
