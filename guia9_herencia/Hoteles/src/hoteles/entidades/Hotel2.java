
package hoteles.entidades;


public class Hotel2 extends Hotel1{ 
//Hereda de la clase Hotel1, la que a su vez hereda de la clase Hotel
    
    protected boolean cajaSeguridad = true;
    
    public Hotel2(Double precio, Double superficie, Integer cantidadHabitaciones) {
        super(precio,  superficie, cantidadHabitaciones); //Lo que hereda
    }
    
}
