/*
Elaborar un algoritmo en el cuál se ingrese un número entre 1 y 10 y se
muestre su equivalente en romano.
 */
package extra4;

import java.util.Scanner;


public class Extra4 {

    public static void main(String[] args) {
        
        int numeroIngresado;
        
        Scanner leer = new Scanner(System.in);
        
        System.out.println("Ingrese un número del 1 al 10 para mostrar su "
                + "equivalente en romanos : ");
        
        numeroIngresado = leer.nextInt();
        
        switch (numeroIngresado) {
            case 1:
                System.out.println("El número ingresado " + numeroIngresado + 
                        "equivale a I en números romanos");
                break;
            case 2:
                System.out.println("El número ingresado " + numeroIngresado + 
                        "equivale a II en números romanos");
                break; 
            case 3:
                System.out.println("El número ingresado " + numeroIngresado + 
                        "equivale a III en números romanos");
                break; 
            case 4:
                System.out.println("El número ingresado " + numeroIngresado + 
                        "equivale a IV en números romanos");
                break;      
            case 5:
                System.out.println("El número ingresado " + numeroIngresado + 
                        "equivale a V en números romanos");
                break;      
            case 6:
                System.out.println("El número ingresado " + numeroIngresado + 
                        "equivale a VI en números romanos");
                break;      
            case 7:
                System.out.println("El número ingresado " + numeroIngresado + 
                        "equivale a VII en números romanos");
                break;      
            case 8:
                System.out.println("El número ingresado " + numeroIngresado + 
                        "equivale a VIII en números romanos");
                break;      
            case 9:
                System.out.println("El número ingresado " + numeroIngresado + 
                        "equivale a IX en números romanos");
                break;      
            case 10:
                System.out.println("El número ingresado " + numeroIngresado + 
                        "equivale a X en números romanos");
                break;      
            default:
                System.out.println("No ingresó un número válido!!");;
        }
    }
    
}
