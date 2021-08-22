
package mascotapp;

import java.util.Scanner;
import mascotapp.entidades.Mascota;
import mascotapp.servicios.ServicioMascota;


public class MascotApp {


    public static void main(String[] args) {
                
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        
        ServicioMascota sm = new ServicioMascota();
        
        Mascota m1 = sm.crearMascota();
        System.out.println(m1);
        
        //instancio una nueva mascota con el constructor
        Mascota m2 = new Mascota("Peti", "Pipi", "Perro", "Anaranjado", 12, true, "Puro perro");
        m2.pasear(100);//invoco el metodo pasear para restarle energia
        System.out.println(m2);
        
        //GARBAGE COLECTOR -> elimina una variable que no usamos mas
        //si por ejemplo hago: 
        //m1 = null;  ----> me lo borra
    }
    
}
        

        