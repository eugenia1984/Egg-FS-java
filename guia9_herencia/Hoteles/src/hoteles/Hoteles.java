
package hoteles;

import hoteles.entidades.Hotel;
import hoteles.entidades.Hotel1;
import hoteles.entidades.Hotel2;
import hoteles.entidades.Hotel3;
import hoteles.entidades.Hotel4;
import hoteles.entidades.Hotel5;
import java.util.ArrayList;
import java.util.List;

public class Hoteles {

    public static void main(String[] args) {
        
        List<Hotel> hoteles = new ArrayList();
        //d para hacer referencia al duble sino se toma como int
        Hotel1 h1 = new Hotel1(1500d, 9d, 10);
        Hotel2 h2 = new Hotel2(2500d, 12d, 15);
        Hotel3 h3 = new Hotel3(50000d, 20d, 30);
        Hotel4 h4 = new Hotel4(60000d, 25d, 40);
        Hotel5 h5 = new Hotel5(10000d, 30d, 50);
    
        hoteles.add(h1);
        hoteles.add(h2);
        hoteles.add(h3);
        hoteles.add(h4);
        hoteles.add(h5);
        
        for(Hotel aux : hoteles ) {
        //INSTANCEOF nos permite saber en base a que nacio, de que hereda
        //Da una respuesta booleana
        //La variable AUX es de tipo HOTEL
            if (aux instanceof Hotel5) {
            //CASTEO la variable AUX a HOTEL5
                Hotel5 object = (Hotel5) aux;
                System.out.println("Soy un Hotel 5");
                continue; //Para que continue al siguiente objeto
            }
            
            if (aux instanceof Hotel4) {
                
                Hotel4 object = (Hotel4) aux;
                System.out.println("Soy un Hotel 4");
                continue; //Para que continue al siguiente objeto
            }
            
            if (aux instanceof Hotel3) {
                
                Hotel3 object = (Hotel3) aux;
                System.out.println("Soy un Hotel 3");
                continue;   //Para que continue al siguiente objeto
            }
            
            if (aux instanceof Hotel2) {
                
                Hotel2 object = (Hotel2) aux;
                System.out.println("Soy un Hotel 2");
                continue;  //Para que continue al siguiente objeto
            }
            
            if (aux instanceof Hotel1) {
                
                Hotel1 object = (Hotel1) aux;
                System.out.println("Soy un Hotel 1");
                continue; //Para que continue al siguiente objeto
            }
            
        }
    }
    
}
