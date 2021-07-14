/*Realizar un programa que solo permita introducir solo frases o palabras de 8 de
largo. Si el usuario ingresa una frase o palabra de 8 de largo se deberá de imprimir
un mensaje por pantalla que diga “CORRECTO”, en caso contrario, se deberá
imprimir “INCORRECTO”. Nota: investigar la función Lenght() en Java.
*/
package ejercicio9;

import java.util.Scanner;

public class Ejercicio9 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        String frase; //Defino la variable
        System.out.println("Ingrese una palabra o frase de 8 caracteres: ");
    //Asigno el valor ingresado a la variable frase
        frase = leer.next();  
    //La condición que va a chequear es que sea de largo 8
        if (frase.length() == 8) { 
            System.out.println("CORRECTO");  //Si la cumple muestra CORRECTO
            } else {  //Si no es 8 de largo que muestra INCORRECTO
            System.out.println("INCORRECTO");
        }
    } 
}
