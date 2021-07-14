/*
Dado un tiempo en minutos, calcular su equivalente en días y horas. Por ejemplo, si
el usuario ingresa 1600 minutos, el sistema debe calcular su equivalente: 1 día, 2
horas.
*/
package extra1;

import java.util.Scanner;


public class Extra1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int minutos;
        int horas;
        int dias;
        System.out.println("Ingrese los minutos para calcular su equivalente en horas y días: ");
        minutos = leer.nextInt();
        horas = minutos / 60;
        dias = horas /24;
        horas = horas - dias*24;
        System.out.println("Los " + minutos + " minutos ingresados son equivalente a " + dias + " dias y " + horas + " horas.");
    } 
}
