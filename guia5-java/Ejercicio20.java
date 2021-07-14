/*
    Crea una aplicación que a través de una función nos convierta una cantidad de
    euros introducida por teclado a otra moneda, estas pueden ser a dólares, yenes o
    libras. La función tendrá como parámetros, la cantidad de euros y la moneda a
    converir que será una cadena, este no devolverá ningún valor y mostrará un
    mensaje indicando el cambio (void).
    El cambio de divisas es:
    * 0.86 libras es un 1 €
    * 1.28611 $ es un 1 €
    * 129.852 yenes es un 1 €
 */
package ejercicio20;
import java.util.Scanner; 

public class Ejercicio20 { 

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in); 
        Scanner leer2 = new Scanner(System.in);
    //double: los decimales los marca con "," - float: los decimales los marca con "."
        float euros;
        String opcion = "";
        do {
            System.out.println("Ingrese sus ahorros en Euros:");
            euros = leer.nextFloat();
            
            if (euros <= 0 || Float.toString(euros).isEmpty() == true || Float.toString(euros) == " ") {
                System.out.println("El valor ingresado no es valido.");
            } else {
                System.out.println("OPCIONES DE CAMBIO" + "\n" + "\n" + "- DOLARES" + "\n" + "- YENES" + "\n" + "- LIBRAS" + "\n");
                System.out.println("Escriba la opción que desea: ");

                opcion = leer2.nextLine();     
                opcion = opcion.toUpperCase();
      
                subprocesoCambio(euros, opcion);
                
            }
        } while(euros <= 0);   
    } 
    //PARA CALCULAR EL CAMBIO
    public static void subprocesoCambio(float euros, String opcion){ 
        
        double resultado = 0;
        
        switch (opcion) {
            case "DOLARES":
                resultado = euros * 1.28611;
                break;
            case "YENES":
                resultado = euros * 129.852;
                break;
            case "LIBRAS":
                resultado = euros * 0.86;
                break;
            default:
                    System.out.println("OOPS! Algo ha ocurrido. Opción no válido.");
        }
        
        if (resultado != 0) { //el programa funciona OK sólo cuando resultado es distinto de "0"
            System.out.println("\n" + "SUS AHORROS EN EUROS (" + euros + " ) PASADOS A " + opcion + " ES IGUAL A: " + resultado);
        }
        
    }
    
    public static int funcionCambio(){ 
        int valor = 0;
        return valor; 
    }
    
}
