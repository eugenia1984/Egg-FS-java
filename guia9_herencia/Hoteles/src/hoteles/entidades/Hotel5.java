
package hoteles.entidades;

//Esta clase es FINAL porque no va a tener herederos
//En ella se termina la herencia
//Las demás clases no tienen FINAL porque sino cortan ahi la herencia y no tiene hijas/os
public final class Hotel5 extends Hotel4{
    
    protected boolean casino = true;
    protected boolean restaurant = true;
    
    
    public Hotel5(Double precio, Double superficie, Integer cantidadHabitaciones) {
        super(precio, superficie, cantidadHabitaciones );
    }
}
