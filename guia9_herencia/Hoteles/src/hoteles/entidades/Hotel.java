
package hoteles.entidades;

public class Hotel {
    
    //Atributo
    protected Integer cantidadHabitaciones;
    //Con PROTECTED el atributo es PUBLICO para la familia y 
    //PRIVADO para los externos a la familia (solo los accede por los GETTERS y SETTERS)
    
    //Constructor
    public Hotel(Integer cantidadHabitaicones) {
        this.cantidadHabitaciones = cantidadHabitaciones;
    }
    
    //Getter
    public Integer getCantidadHabitaciones() {
        return cantidadHabitaciones;
    }
    
    //Setter
    public void setCantidadHabitaciones(Integer cantidadHabitaciones) {
        this.cantidadHabitaciones = cantidadHabitaciones;
    }
    
}
