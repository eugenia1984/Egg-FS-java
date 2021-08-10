
package hoteles.entidades;


public class Hotel1 extends Hotel{  //EXTENDS = v a HEEREDAR (EXTENDER) de la clase Hotel
    
    //Atributos propios de la clase Hotel1
    protected Double precio;
    protected Double superficie;
    protected boolean bano = true;
    protected boolean ascensor = true;
    protected boolean calefaccion = true;
    
    
    //Constructor
    public Hotel1(Double precio, Double superficie, Integer cantidadHabitaciones) { 
        //cantidadHabitaciones lo hereda de la clase Hotel
        super(cantidadHabitaciones); //SUPER porque las hereda de la SUPER clase Hotel
        this.precio = precio;
        this.superficie = superficie;
    }
    
}
