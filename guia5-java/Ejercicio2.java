/*
Escribir un programa que pida tu nombre, lo guarde en una variable y lo muestre
por pantalla.
*/
package ejercicio2;

import java.util.Scanner;

public class Ejercicio2 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        String nombre;
        System.out.println("Ingresa tu nombre: ");
        nombre = leer.next();
        System.out.println("Hola " + nombre + " bienvenid@! " );
    } 
}
