/*
 *Clase Service de Mascota
 */
package mascotapp.servicios;

import java.util.Scanner;
import mascotapp.entidades.Mascota;

public class ServicioMascota {
    
    private Scanner leer = new Scanner(System.in).useDelimiter("\n");
    
    /**
     * MEtodo para crear la mascota con el constructor que tiene como parametro
     * @param nombre
     * @param apodo
     * @param tipo
     * @return el nacimiento de una Mascota con los atributos ingresados 
     */
    public Mascota crearMascota(){
        
        System.out.println("Introducir nombre : ");
        String nombre = leer.next();
        
        System.out.println("Introducir apodo : ");
        String apodo = leer.next();
        
        System.out.println("Introducir tipo : ");
        String tipo = leer.next();
                
        return new Mascota(nombre, apodo, tipo);
    }
    
}
