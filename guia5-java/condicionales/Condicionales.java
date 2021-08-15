/*
CONDICIONALES EN JAVA

Vamos a hacer un ejemplo donde se le pide al usuario que clasifique la pelicula
que vio entre 1 a 5 *, dependiendo la calificación el mensaje que se muestra
Y si la opinion fue muy negativa van otros mensajes

 */
package condicionales;

import java.util.Scanner;

public class Condicionales {

    public static void main(String[] args) {
        
        int opinion;  ///Defino mi variable de tipo entera
        
        Scanner leer= new Scanner(System.in);
        
        ///Pido que el usuario casifique la peli y lo guardo en variable
        System.out.println("Clasifique la película de 1 a 5 estrellas (en numero) : ");
        
       opinion = leer.nextInt();
       
       
       ///Condicional IF / ELSE IF / ELSE
        if ( opinion >= 1 && opinion <= 5) { //si la opinion está entre 1 / 5
            
            //Condicional SWITCH
            switch (opinion) {
                case 1:
                case 2:
                    System.out.println("Nos sentimos apenados que no hayas "
                            + "disfrutado la peli...");
                    break;
                case 3:
                    System.out.println("Has calificado la peli como buena!");
                    break;
                case 4:
                    System.out.println("Has calificado la peli como muy buena!");
                    break;
                case 5:
                    System.out.println("Fantástico que hayas disfrutado un "
                            + "excelente entretenimiento!");
                    break;
        //default -> es opcional, es para cuando la opcion no coincide con ningun case
        
        //BREAK -> una vez que se ejecuta el bloque de código para el CONDICIONAL 
        //        con SWITCH se detenga la ejecución u no continúe con el próximo caso
                    
                    
            } //cierro el SWITCH
            
        } else if ( opinion < 0 ){  ///caso de opinion negativo
            System.out.println("¿Una opinión negativa? ¿Tan mala fue la película? :( ");
        } else if ( opinion == 0 ) {  //caso opinion = 0
            System.out.println("El valor " + opinion + " no es válido y no se "
                    + "tomará en cuenta");            
        } else {
            System.out.println(opinion + "Wow! Se te fue la mano con la calificación!");
        }//cierro el IF / ELSE IF / ELSE
        
        System.out.println("Hasta la próxima película");
        
        
    }
    
}
