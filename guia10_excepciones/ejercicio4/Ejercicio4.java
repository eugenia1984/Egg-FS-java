/*
Escribir un programa en Java que juegue con el usuario a adivinar un número. 
La computadora debe generar un número aleatorio entre 1 y 500,
y el usuario tiene que intentar adivinarlo. 
Para ello, cada vez que el usuario introduce un valor, la computadora debe 
decirle al usuario si el número que tiene que adivinar es mayor o menor 
que el que ha introducido el usuario. Cuando consiga adivinarlo, debe
indicárselo e imprimir en pantalla el número de veces que el usuario ha 
intentado adivinar el número. Si el usuario introduce algo que no es un número,
se debe controlar esa excepción e indicarlo por pantalla. 
En este último caso también se debe contar el carácter fallido como un intento.
 */
package ejercicio4;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Ejercicio4 {


    public static void main(String[] args) {

        Scanner leer = new Scanner(System.in);
        //Para tener un numero entre 1 y 500 al azar
        int azar = (int) (Math.random() * 500 + 1); 
        int numeroIngresado = 0;
        //Para ir contando los intentos - acumulador - 
        int intentos = 0;
        
        while (azar != numeroIngresado) {
            
            System.out.print("Adivine el número al azar entre 1 y 500! Ingrese : ");
            
            try {
                numeroIngresado = leer.nextInt();
                
            } catch (InputMismatchException e) {
                
                System.out.println("Eso no es un número...");
                leer.next(); //Vacío el buffer del scanner
                continue; //Salteo este intento
                
            } finally {
                //Voy a ir sumando todos los intentos, los acumulo
                intentos++; 
            }
            
            if (azar < numeroIngresado) {
                
                System.out.println("No, es menor!");
                
            } else if (azar > numeroIngresado) {
                System.out.println("No, es mayor!");
            }
        }
        
        System.out.println("\nAdivinado en " + intentos + " intentos, el número era " + azar);
    }
    
}
