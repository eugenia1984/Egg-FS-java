/*
Dada una cantidad de grados centígrados se debe mostrar su equivalente en
grados Fahrenheit. La fórmula correspondiente es: F = 32 + (9 * C / 5).
*/
package ejercicio4;

import java.util.Scanner;

public class Ejercicio4 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        float fahrenheit, centigrados;  //Declaro las variables
        System.out.println("Ingresa la temperatura en grados: "); //Pido ingrese los grados
        centigrados = leer.nextFloat();  //Asigno los grados ingresados a la variable
        fahrenheit = 30 + (9 * centigrados / 9); //Paso de centigrados a fahrenheit y asigno
        System.out.println("Los " + centigrados + " centígrados pasados a fahrenheit son " + fahrenheit); 
    }  
}
