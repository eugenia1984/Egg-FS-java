/*
Crear un programa que dado un numero determine si es par o impar.
*/
package ejercicio7;

import java.util.Scanner;

public class Ejercicio7 {
    public static void main(String[] args) {
        Scanner leer= new Scanner(System.in);
        //Defino mi variable
        int num; 
//Pido ingrese un numero
        System.out.println("Ingrese un número para decirle si es par o impar: "); 
        num = leer.nextInt(); //Asigno el valor a mi variable
//La condición por true es que el modulo del numero dividido 2 es 0 entonces es par
        if (num % 2 == 0) {  
            System.out.println(num + " es un número par");
            }else {
                System.out.println(num + " es in número impar");
        }
    }
}
