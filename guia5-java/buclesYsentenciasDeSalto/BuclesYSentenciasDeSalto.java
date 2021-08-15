/*

BUCLE -> permite que un bloque de codigo se repita N cantidad de veces
        (finita) hasta que se cumple una condición

SENTENCIAS DE SALTO -> permiten cambiar el flujo normal que tiene un bucle. Son dos:
 -BREAK: permite salir del bucle
 -CONTINUE: no sale del bucle, salta a la proxima iteración saltando las sentencias
 que siguen luego del continue

Ejemplo con el siguiente ejercicio: muestre N sumatorias de los primeros números 
enteros partiendo desde 1, siendo N par; de un aviso si el usuario identifica
un valor de N superior a 1000 por ejecución lenta
 */
package buclesYsentenciasDeSalto;

import java.util.Scanner;

public class BuclesYSentenciasDeSalto {


    public static void main(String[] args) {
        
        int num;  ///Es el valor que ingresa el usuario por el teclado
        
        Scanner leer = new Scanner(System.in);
        
        //BUCLE DO WHILE
        do {
            
            System.out.println("Ingrese un número entero positivo: ");
            num = leer.nextInt();
            
            if ( num > 1000 ) {
                System.out.println("Este programa podría tardar, ¿está seguro ?"
                        + "(S / N) : ");
                String confirma = leer.next().toUpperCase();  ///por las dudas paso a mayuscula
                
                if (confirma.equals("S")) {  /// eliguio S de Si vemos si es igual con EQUALS
                    break;  
                ///BREAK -> SENTENCIA DE SALTO, detiene el bulce y avanza con el proximo
                } //cierro el if anidado
                
            } //cierro el if exterior
            
        } while ( num <= 0 || num > 1000 );  ///mientras num sea un numero entre 0 y 1000
        
        
        int j, suma;
        
        //BUCLE FOR
        //  for( <inicializacion> ; <expresion_terminacion> ; <paso/incremento/decremento>) {
        //    <sentencias>
        //  }
        
        //For desde el valor 1 hsta que i >= al valor ingresado por el usuario
        for (int i = 1; i <= num; i++) { //++ OPERADOR DE INCREMENTO ->  i = i + 1;
                        
            if ( i % 2 != 0 ) //Si es un número impar, su modulo de 2 no es 0
                continue;  
        ///CONTINUE -> detiene la iteración actual y salta a la siguiente
            
            suma = 0;
            j = 1;
            /// BUCLE WHILE
            while( j <=  i) {
                suma += j;
                j++;
            }
            
            System.out.println("La suma de los " + i + " números naturales es : " 
                    + suma);
            
        }
        
    }
    
}
