/*
Escriba un programa que valide si una nota está entre 0 y 10, sino está entre 0 y 10
la nota se pedirá de nuevo hasta que la nota sea correcta
*/
package ejercicio12;

import java.util.Scanner;


public class Ejercicio12 {

    public static void main(String[] args) {
        Scanner leer = new Scanner (System.in);
        float nota; //Defino la variable
        do {
            System.out.println("Ingrese la nota entre 0 y 10: ");
            nota = leer.nextFloat(); //Leo la nota y la asigno a la variable
        } while (nota<0 || nota>10);  //La condición es que si la nota no está entre [0,10] la vuelve a pedir
    }
}
