/*
Elaborar un algoritmo en el cuál se ingrese una letra y se detecte si se trata
de una vocal. Caso contrario mostrar un mensaje. 
Nota: investigar la función equals() de la clase String.
 */
package extra3;

import java.util.Scanner;


public class Extra3 {

 
    public static void main(String[] args) {
        
        String letra;
        Scanner leer = new Scanner(System.in);
                
    // DO WHILE para asegurarme que solo ingrese UNA letra, no más de 1
        do {            
            System.out.println("Ingrese una letra: ");
            letra=leer.next().toLowerCase();  //Si no pongo .toLowerCase para pasar a minuscula -> .equalsIgnoreCase

        } while ( letra.length() != 1 );  
       
    
        
        if (letra.equals("a") || letra.equals("e") || letra.equals("i")
            || letra.equals("o") || letra.equals("u")) {
            System.out.println("La letra " + letra + " es una vocal");
        } else {
            System.out.println("La letra " + letra + " no es una vocal");
        }
        
        
    }
    
}
