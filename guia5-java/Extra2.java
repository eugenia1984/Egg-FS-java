/*
Declarar cuatro variables de tipo entero A, B, C y D y asignarle un valor 
diferente a cada una. 
A continuación, realizar las instrucciones necesarias para que: B tome el
valor de C, C tome el valor de A, A tome el valor de D y D tome el valor de B.
Mostrar los valores iniciales y los valores finales de cada variable. 
Utilizar sólo una variable auxiliar.
B -> C
C -> A
A -> D
D -> B
 */
package extra2;


public class Extra2 {


    public static void main(String[] args) {
        // declaro mis variables
        int valorA;
        int valorB;
        int valorC;
        int valorD;
        int auxiliar;
        
        //Le asigno los valores a cada una
        valorA = 1;
        valorB = 2;
        valorC = 3;
        valorD = 4;
        
        //muestro los valores de los 4
        System.out.println("El valor de A es : " + valorA );
        System.out.println("El valor de B es : " + valorB ); 
        System.out.println("El valor de C es : " + valorC ); 
        System.out.println("El valor de D es : " + valorD ); 
        
        auxiliar = valorB;
        valorB = valorC; //Reasigno el valor B -> valor de C
        valorC = valorA; //reasigno el valor de C -> valor de A 
        valorA = valorD; //reasigno el valor de A -> valor de D
        valorD = auxiliar; //reasigno el valor de D -> Valor de B
        
        System.out.println("------ Reasigno los valores --------");
        System.out.println("El valor de A es : " + valorA );
        System.out.println("El valor de B es : " + valorB ); 
        System.out.println("El valor de C es : " + valorC ); 
        System.out.println("El valor de D es : " + valorD ); 
         
    }
    
}
