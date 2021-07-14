/*
Escriba un programa que pida una frase o palabra y valide si la primera letra de esa
frase es una ‘A’. Si la primera letra es una ‘A’, se deberá de imprimir un mensaje por
pantalla que diga “CORRECTO”, en caso contrario, se deberá imprimir
“INCORRECTO”. Nota: investigar la función Substring y equals() de Java.
*/
package ejercicio10;

import java.util.Scanner;

public class Ejercicio10 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        String frase; //Defino la variable
        char letra;
        //String letra2;
        System.out.println("Ingrese una frase, para ver si la primer letras es la 'A': ");
    //Leo la frase ingresada y la asigno a la variable frase
        frase = leer.next();  
        letra =  frase.charAt(0);
    //letra2 = frase.substring(0,1); De es modo letra2 es String pero de un solo caracte, no es char
        if (letra == 'A') {
            System.out.println("CORRECTO");
            } else {
            System.out.println("INCORRECTO");
        }
    }
}
