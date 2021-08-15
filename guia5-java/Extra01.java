/*
Dado un tiempo en minutos, calcular su equivalente en días y horas. 
Por ejemplo, si el usuario ingresa 1600 minutos, el sistema debe calcular 
su equivalente: 1 día, 2 horas.
 */
package extra01;

import java.util.Scanner;


public class Extra01 {


    public static void main(String[] args) {
        
        //decalro mis variables
        int minutos;
        int horas;
        
        Scanner leer = new Scanner(System.in);
    
        //Pido los minutos a convertir y los guardo en la variable minutos
        System.out.println("Ingrese cantidad de minutos a convertir:");
        minutos = leer.nextInt();
        
        //1 hora = 60 minutos y 24 horas es un dia -> 1440 minutos = 1 dia
        if (minutos < 1440) {  
        //si hay menos de 1440 minutos, entonces no llego al dia, solo tengo que pasarlo a horas

            System.out.println("El equivalente es " + (minutos/60) + " hora(s).");

        } else if (minutos >= 1440) {
        //si hay más de 1440 minutos, entonces al menos voy a tener un dia

            System.out.println("El equivalente es " + (minutos / 1440) + " día y " + ((minutos % 1440)/60) + " horas.");

        } else {
        
            System.out.println("El valor ingresado no es válido. Por favor intente nuevamente.");
            
        }
    }
    
}
