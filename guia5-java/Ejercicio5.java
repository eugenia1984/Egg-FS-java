/*
Escribir un programa que lea un número entero por teclado y muestre por pantalla
el doble, el triple y la raíz cuadrada de ese número. Nota: investigar la función
Math.sqrt().
*/
package ejercicio5;

import java.util.Scanner;

public class Ejercicio5 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int numero; //Defino las variables
        double raizredondeada;
        System.out.println("Ingresa un número para hacer calculos con el: ");  //Pido un numero
        numero = leer.nextInt(); //Asigno a variable numero
        System.out.println("El doble de " + numero + " es: " + numero*2);
        System.out.println("El triple de " + numero + " es: " + numero*3);
        raizredondeada = Math.round((Math.sqrt(numero))*100.0)/100.0;
        System.out.println("La raiz cuadrada de " + numero + " es: " + raizredondeada);          
    }
}
