
package mascotapp;

import java.util.Scanner;
import mascotapp.entidades.Mascota;


public class MascotApp {


    public static void main(String[] args) {
        
        String tieneCola="";
        
        Scanner leer = new Scanner(System.in);
        
        // creo mi primer objeto como instancia de Mascota
        Mascota m1 = new Mascota();
        
        //Le doy valores a sus atributos pidiendolos lo ingresen por teclado
        //y SETTEO los atributos
        System.out.println("Ingrese el apodo de su mascota: ");
        m1.setApodo( leer.next() );
        System.out.println("Ingrese el nombre de su mascota: ");
        m1.setNombre( leer.next() );
        System.out.println("Ingrese el tipo de su mascota: ");
        m1.setTipo( leer.next() );
        System.out.println("Ingrese el color de su mascota: ");
        m1.setColor( leer.next() ); ;
        System.out.println("Ingrese la edad de su mascota: ");
        m1.setEdad( leer.nextInt() );
        System.out.println("Ingrese la raza de su mascota: ");
        m1.setRaza( leer.next() );
        System.out.println("¿Su mascota posee cola? ( S / N): ");
        tieneCola = leer.next().toUpperCase();
        if( tieneCola.equals("S")) {
            m1.setCola( true ); 
        } else {
            m1.setCola( false ); 
        }
       //invoco el metodo pasear para restarle energia
        m1.pasear(100);
        //muestro mi m1
        System.out.println(m1);
        
        //instancio una nueva mascota con el constructor
        Mascota m2 = new Mascota("Peti", "Pipi", "Perro", "Anaranjado", 12, true, "Puro perro");
        System.out.println(m2);
    }
    
}
        

        