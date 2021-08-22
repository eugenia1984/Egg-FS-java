/**  Realizar un programa en Java donde se creen dos arreglos: el primero será un 
 * arreglo A de 50 números reales, y el segundo B, un arreglo de 20 números, 
 * también reales.
 * El programa deberá inicializar el arreglo A con números aleatorios y 
 * mostrarlo por pantalla.
 * Luego, el arreglo A se debe ordenar de menor a mayor y copiar los primeros 
 * 10 números ordenados al arreglo B de 20 elementos, y rellenar los 10 últimos
 * elementos con el valor 0.5.
 * Mostrar los dos arreglos resultantes: el ordenado de 50 elementos y el 
 * combinado de 20.
 */
package Ejercicio10;
import java.util.Arrays;

public class Ejercicio10 {


    public static void main(String[] args) {
        
        double arrayA[];
        double arrayB[];
        
        arrayA = new double [50];
        arrayB = new double [20];
        
        //Relleno mi vector con numeros aleatorios
        // Array.fill( int[] a , int from_index , int to_index, int val);
        //int[] a -> array a rellenar
        //int from_index -> a[from_index] como cuando recorro con for desde que i voy
        //int to_index -> a[to_index] como cuando recorro con for, NO lo incluye : i < array.length
        //int val -> valor a rellenar
        for (int i = 0; i < 50; i++) {
            //arrayA[i]= (double) Math.round(Math.random() * 50);
            Arrays.fill(arrayA, i, i+1, (double) Math.round(Math.random() * 50));
        }
        
        System.out.println("Array A : ");
        System.out.println(" ");
        
        mostrarVector(arrayA);
        
        // System.out.println(Arrays.toString(arrayA));
        
        //Para ordenarlos en forma ascendente
        Arrays.sort(arrayA);
        
        System.out.println("Array A ordenado: ");
        mostrarVector(arrayA);
        
        System.out.println("Array B:");
        //Desde que array tomo los numeros
        //Desde que posicion tomo los numeros del Array original
        //A que array pongo los numeros
        //La posicion inicial del que le paso los numeros
        //Cuantos numeros paso
        System.arraycopy(arrayA, 0, arrayB, 0, 10);
        
        //Si tenia 0,10 el problema es que cambia la dimension del vector
        //arrayB = Arrays.copyOfRange(arrayA, 0 ,20);  
  
        Arrays.fill(arrayB, 10, 20 , 0.5);
        mostrarVector(arrayB);
        
    }
    
    //Metodo para imprimir (mostrar) vectores
    private static void mostrarVector(double [] array) {
        System.out.println(" ");
        
        for (int i = 0; i < array.length; i++) {
            System.out.println(array [i]);
        }
        
        System.out.println(" ");
    }
    
}
