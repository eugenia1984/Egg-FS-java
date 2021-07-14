/*
Implementar un programa que dado dos números enteros determine cuál es el
mayor y lo muestre por pantalla.
*/
package ejercicio6;

import java.util.Scanner;

public class Ejercicio6 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int num1; //Defino la variable
        int num2;
        System.out.println("Ingresa un primer número entero: "); //Pido el primer numero
        num1 = leer.nextInt();  //Lo asigno a la variable num1
        System.out.println("Ingresa un segundo número entero: "); //Pido el segundo numero
        num2 = leer.nextInt(); //Lo asigno a la varaible num2
        if (num1 == num2) {
            System.out.println("El número " + num1 + " es igual a " + num2);
        } else if (num1 > num2) {
            System.out.println("El número " + num1 + " es mayor a " + num2);
        } else {
            System.out.println("El número " + num2 + " es mayor a " + num1);
        }
    }
}
