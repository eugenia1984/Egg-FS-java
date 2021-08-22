
package mascotapp;

import java.util.Scanner;
import mascotapp.entidades.Mascota;
import mascotapp.servicios.ServicioMascota;


public class MascotApp {


    public static void main(String[] args) {
                
        int a = 10;
        
        //creo la mascota
        Mascota mm = new Mascota();
        
        //al metodo le paso el valor de a y de la mascota
        modificador(a, mm);
        
        //Pasaje por valor
        System.out.println("a : " + a);
        //Pasaje por referencia
        System.out.println("Mascota : " + mm);
    }
    
    public static void modificador(int num, Mascota m) {
        num = 100;
        m.setApodo("Mascota referencia");
    }
    
}
        

        