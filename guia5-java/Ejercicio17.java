/*
Necesitamos mostrar un contador con 3 dígitos (X-X-X), que muestre los números
del 0-0-0 al 9-9-9, con la particularidad que cada vez que aparezca un 3 lo sustituya
por una E. Ejemplo:
0-0-0
0-0-1
0-0-2
0-0-E
0-0-4
.
.
0-1-2
0-1-E
Nota: investigar función equals() y como convertir números a String.
 */
package ejercicio17;

public class Ejercicio17 {

    public static void main(String[] args) {
    //Defino mis variables
        String primerNum;
        String segundoNum;
        String tercerNum;
        String  terna;
        for (int i = 0; i < 10; i++) {
    //Con un for voy recorriendo para pedir que ingrese los numeros, como son 9 en total el i va a ser menor a 10
            for (int j = 0; j < 10; j++) {
                for (int k = 0; k < 10; k++) {
                    primerNum = Integer.toString(i);
                    segundoNum = Integer.toString(j);  
                    tercerNum = Integer.toString(k);
    //En la variable terna voy a concatenar los tres numeros y los separo con -
                    terna = primerNum + " - " + segundoNum + " - " + tercerNum;
    //Utilizo el método replace("anterior char", "nuevo char") para cambiar los 3 por la letra E
                    System.out.println(terna.replace("3", "E"));
                } 
            } 
        } 
        
    }
    
}
