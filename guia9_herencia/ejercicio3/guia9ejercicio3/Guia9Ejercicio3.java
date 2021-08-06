/*
EJERCICIO 3

Siguiendo el ejercicio anterior, en el main vamos a crear un arrayList de
Electrodomésticos para guardar 4 electrodomésticos, ya sean lavadoras o
televisores, con valores ya asignados.

Luego, recorrer este array y ejecutar el método precioFinal() en cada electrodoméstico. 

Se deberá también mostrar el precio de cada tipo de objeto,
es decir, el precio de todos los televisores, por un lado, el de las lavadoras 
por otro, y al final, la suma del precio de todos los Electrodomésticos. 
Por ejemplo, si tenemos una lavadora con un precio de 2000 y un televisor de 
5000, el resultado final será de 7000 (2000+5000) para electrodomésticos, 2000 
para lavadora y 5000 para televisor.
 */
package guia9ejercicio3;

import java.util.ArrayList;
import java.util.List;

public class Guia9Ejercicio3 {

    public static void main(String[] args) {
        
        //creo dos lavadoras
        Lavadora lavadora1 = new Lavadora(20, "blanco", 'A', 20);
        Lavadora lavadora2 = new Lavadora(20, "blanco", 'B', 20);
        //creo dos televisores
        Televisor televisor1 = new Televisor(50, true, "Azul", 'A', 10);
        Televisor televisor2 = new Televisor(50, true, "Azul", 'B', 30);
        
        //Creo el Array List de electrodomesticos
        List<Electrodomestico> electrodomesticos = new ArrayList();
        
        //guardo los electrodomesticos en el Array List 
        electrodomesticos.add(lavadora1);
        electrodomesticos.add(lavadora2);
        electrodomesticos.add(televisor1);
        electrodomesticos.add(televisor2);
        
        //creo las variables totalTelevisores y totalLavadoras porque en ellas
        //voy a calcular los precios totales de cada tipo de electrodomestico
        int totalTelevisores=0;
        int totalLavadoras=0;
        String televisores="";
        String lavadoras="";
        
      
        
        for (Electrodomestico electrodomestico : electrodomesticos) {
            if(electrodomestico instanceof Televisor){
                televisores += "EL precio final del televisor es " + electrodomestico.precioFinal() + "\n";
                totalTelevisores += electrodomestico.precioFinal();
            }else{
                lavadoras += "EL precio final de la lavadora es " + electrodomestico.precioFinal() +"\n";
                totalLavadoras += electrodomestico.precioFinal();
            }
           
        }
        
        System.out.println(televisores);
        System.out.println(lavadoras);
        System.out.println("El precio total de los televisores es de : $ " + totalTelevisores);
        System.out.println("El precio total de las lavadoras es de : $ " + totalLavadoras);
          
    }
    
}
