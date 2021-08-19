/*
Definir una Clase que contenga algún tipo de dato de tipo array y agregue el
código para generar y capturar una excepción ArrayIndexOutOfBoundsException
(índice de arreglo fuera de rango).
*/
package ejercicio2;


public class Ejercicio2 {


    public static void main(String[] args) {
        // creo un array de dimension 5
        int[] prueba = new int[5]; 
        //voy a tener: 
        //prueba[0] : primer elemento
        //prueba[1] : segundo elemento
        //prueba[2] : tercer elemento
        //prueba[3] : cuarto elemento
        //prueba[4] : quinto elemento
        
        try {
            prueba[5] = 1; //Trato de asignar la posición 5 que se pasa del rango
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Error: Fuera de rango.");
        }
        
        
    }
    
}
