/*
Una obra social tiene tres clases de socios:

o Los socios tipo ‘A’ abonan una cuota mayor, pero tienen un 50% de
descuento en todos los tipos de tratamientos.

o Los socios tipo ‘B’ abonan una cuota moderada y tienen un 35% de
dedescuento para los mismos tratamientos que los socios del tipo A.

o Los socios que menos aportan, los de tipo ‘C’, no reciben descuentos sobre
dichos tratamientos.

Solicite una letra (carácter) que representa la clase de un socio, y luego un 
valor real que represente el costo del tratamiento (previo al descuento) y 
determine el importe en efectivo a pagar por dicho socio.
 */
package extra5;

import java.util.Scanner;


public class Extra5 {


    public static void main(String[] args) {
        
        char claseDeSocio; // A, B, C
        double valorRealTratamiento; //Valor real sin descuento aplicado
        
        
    //inicializo las variables
        claseDeSocio= ' ';
        valorRealTratamiento = 0.0;

        Scanner leer = new Scanner(System.in);
        Scanner leer2 = new Scanner(System.in);
        
    //Con un do while me aseguro que solo ingrese A B o C
        do {
            
            System.out.println("Por favor ingrese su letra de clase de socio "
                    + "( A / B / C) : ");
            claseDeSocio = leer.next().charAt(0);
            
        } while ( claseDeSocio != 'A' && claseDeSocio !='B' && claseDeSocio != 'C');
        
        
    //Pido que ingrese el monto del tratamiento y lo asigno a la variable
        System.out.println("Ingrese el valor del tratamiento (en numeros) : ");
        valorRealTratamiento = leer2.nextDouble();
        
        
    //Con un switch calculo el precio con dto, si corresponde, según su clase de socio
        switch (claseDeSocio) {
                
            case 'A': 
                System.out.println("El valor a abonar por ser socio A es de : " 
                        + valorRealTratamiento * 0.50 );
                break;
            case 'B': 
                System.out.println("El valor a abonar por ser socio A es de : " 
                        + valorRealTratamiento * 0.65 );
                //tambien puedo hacer ( valorRealTratamiento - valorRealTratamiento *0.35)
                break;  
            case 'C': 
                System.out.println("El valor a abonar por ser socio A es de : " 
                        + valorRealTratamiento );
                break;    
            default:
                System.out.println("ERROR!!!");
        }
        
    }
    
}
