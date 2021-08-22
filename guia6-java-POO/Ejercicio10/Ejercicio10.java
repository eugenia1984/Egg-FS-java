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
