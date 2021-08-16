/*
Leer la altura de N personas y determinar el promedio de estaturas que se
encuentran por debajo de 1.60 mts. y el promedio de estaturas en general.
 */
package extra6;

import java.util.Scanner;


public class Extra6 {


    public static void main(String[] args) {
        
        //Declaro las variables
        int personas,petizos;
        double altura, totalAltura, totalPetizos;
        
        Scanner leer = new Scanner(System.in);
        
        //inicializo las variables
        personas = 0;
        petizos=0;
        totalAltura=0.0;
        totalPetizos=0.0;
        
        //Pido al usuario la cantidad de las personas
        System.out.println("Ingrese la cantidad de personas: ");
        personas = leer.nextInt();
        
        for( int i=0; i<personas; i++){
            
            System.out.println("Ingrese la altura en metros de la persona"
                    + " ( use , para separar metros de centímetros): ");
            altura = leer.nextDouble();
    //Voy acumulando en totalAltura la suma de todas las alturas para el promedio general
            totalAltura+=altura;
            
            if( altura < 1.6){  //Aca voy a ir sumando todas las alturas de los que miden menos de 1.6
                petizos++;
                totalPetizos+=altura;
            }
        }
        
        System.out.println("El promedio de la altura de las personas es "+ 
                (totalAltura/personas));
        System.out.println("El promedio de la altura de las personas mas bajas "
                + "de 1.60 metros es "+ (totalPetizos/petizos));
    }
    
}
