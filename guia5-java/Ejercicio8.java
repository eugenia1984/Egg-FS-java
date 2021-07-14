/*Crear un programa que pida una frase y si esa frase es igual a “eureka” el 
programa pondrá un mensaje de Correcto, sino mostrará un mensaje de Incorrecto. 
Nota: investigar la función equals() en Java.
*/
package ejercicio8;

import java.util.Scanner;


public class Ejercicio8 {


    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        String frase; //Defino la variable
        System.out.println("Ingrese la frase correcta: ");
    //Leo la frase ingresada y la asigno a la variable
        frase = (leer.next()).toLowerCase(); 
    //Con if else si es igual a eureka muestra CORRECTo y sino muestra INCORRECTO
        if (frase.equals("eureka")) {
            System.out.println("CORRECTO");
            }else {
            System.out.println("INCORRECTO");
        }
    }
}
