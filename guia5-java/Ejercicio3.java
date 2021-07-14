package ejercicio3;
/*
Escribir un programa que pida una frase y la muestre toda en mayúsculas y
después toda en minúsculas. Nota: investigar la función toUpperCase() y
toLowerCase() en Java.
*/
import java.util.Scanner;

public class Ejercicio3 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in).useDelimiter("\n"); 
//con el .useDelimeter("\n") me va a leer despues del espacio en la cadena      
        String frase;
        System.out.println("Ingresa una frase: ");
        frase = leer.next();  //Para que lea mas de una palabra
        System.out.println("La frase ingresada - " + frase + " - en mayúscula es : " + frase.toUpperCase());
        System.out.println("Y la frase ingresada - " + frase + " - en minúscula es : " + frase.toLowerCase());
    }
}
