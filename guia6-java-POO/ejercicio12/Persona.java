/*
 * Una persona tiene un nombre y una fecha de nacimiento (Tipo Date), 
 * constructor vacío, constructor parametrizado, get y set.
 */
package ejercicio12;

import java.util.Date;

public class Persona {
    //Atributoo: tiene un nombre y una fecha de nacimiento (Tipo Date)
    private String nombre;
    private Date FechaDeNacimiento;
    
    //constructor vacío
    public Persona() {
    }
    
    //constructor parametrizado
    public Persona(String nombre, Date FechaDeNacimiento) {
        this.nombre = nombre;
        this.FechaDeNacimiento = FechaDeNacimiento;
    }
    
    //get y set
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Date getFechaDeNacimiento() {
        return FechaDeNacimiento;
    }

    public void setFechaDeNacimiento(Date nacimiento) {
        this.FechaDeNacimiento = nacimiento;
    }
    //toString

    @Override
    public String toString() {
        return "Persona{" + "nombre = " + nombre + ", FechaDeNacimiento = " + FechaDeNacimiento + '}';
    }
    
    
    
}
