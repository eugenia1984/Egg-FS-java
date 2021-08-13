
package guia9ejercicio5;

import java.util.Scanner;


public class Figura{
    
    protected Integer lados;
    
    public void dibujar(){
        
    }

    public Integer crearFigura(){
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese los lados: ");
        lados = leer.nextInt();
        
        return lados;
    }
    
  
}
