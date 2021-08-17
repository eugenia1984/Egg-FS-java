
package Ejercicio6;


public class CafeteraService {
    
    //Método llenarCafetera(): hace que la cantidad actual sea igual a la capacidad máxima.
    // es una instancia (el objeto) de la clase Cafetera
    public void llenarCafetera(Cafetera cafetera1) {
        cafetera1.setCantidadActual(cafetera1.getCapacidadMaxima());
        System.out.println("La cafetera ha sido llenada");
    }
    
    //Método servirTaza(int): se pide el tamaño de una taza vacía, el método recibe el
    //tamaño de la taza y simula la acción de servir la taza con la capacidad indicada.
    //Si la cantidad actual de café “no alcanza” para llenar la taza, se sirve lo que quede. 
    //El método le informará al usuario si se llenó o no la taza, y de no haberse llenado en
    //cuanto quedó la taza.
    public void servirTaza(Cafetera cafetera1 ,int tamanoTaza) {
        
        //Si la cafetera tiene menos que la taza, pero no está vacía
        if(cafetera1.getCantidadActual() < tamanoTaza && cafetera1.getCantidadActual() !=0) {
            
            System.out.println("No alcanza para llenar su taza");
            System.out.println("Le hemos servido el café que quedó");
            System.out.println("Su taza tiene " + cafetera1.getCantidadActual() + " ml.");
            //Seteo la capacidad de la cafetera a cero
            cafetera1.setCantidadActual(0);
            
            
            //Si la cantidad de la cafetera es mayor o igual a la taza
            } else if(cafetera1.getCantidadActual() >= tamanoTaza) {

                    System.out.println("Disfrute su café");
                    //Seteo la capacidad de la cafetera descontando lo que cargue en la taza
                    cafetera1.setCantidadActual(cafetera1.getCantidadActual() - tamanoTaza);
            
            } else {  //El caso de que la cafetera esta vacia
                System.out.println("No hay cafe");
            }
        }
        
    
    
    
    //Método vaciarCafetera(): pone la cantidad de café actual en cero.
    public void vaciarCafetera(Cafetera cafetera1) {
        cafetera1.setCantidadActual(0);
        System.out.println("La cafetera ha sido vaciada");
    }
    
    //Método agregarCafe(int): se le pide al usuario una cantidad de café, el método lo
    //recibe y se añade a la cafetera la cantidad de café indicada.
    public void  agregarCafe(Cafetera cafetera1, int cantidadAgregada) {
        //El caso de que se desborda la cafetera
        if(cafetera1.getCantidadActual() + cantidadAgregada > cafetera1.getCapacidadMaxima()) {
            
            System.out.println("Cuidado que sobrepasa la cantidad máxima de la cafetera");
            
        } else {
            
            System.out.println("Le hemos agregado la cantidad indicada a la cafetera");
            cafetera1.setCantidadActual(cafetera1.getCantidadActual() + cantidadAgregada );
            System.out.println("La cafetera tiene " + cafetera1.getCantidadActual() + " ml");
        
        }

    }   
    
}
