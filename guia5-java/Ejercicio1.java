package ejercicio1;
/*
Escribir un programa que pida dos números enteros por teclado y calcule la suma
de los dos. El programa deberá después mostrar el resultado de la suma
*/
import java.util.Scanner;

public class Ejercicio1 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int num1;
        int num2;
        int suma;
        System.out.print("Ingresa un número entero: ");
        num1 = leer.nextInt();
        System.out.print("Ingresa un segundo número entrero, para calcular la suma de los dos: ");
        num2 = leer.nextInt();
        suma = num1 + num2;
        System.out.println("La suma de " + num1 + " y "+ num2 + " es de : " + suma);
    }
}
