/**
 * Crear una clase llamada Alumno que mantenga información sobre las notas de
 * distintos alumnos.
 */
package ejercicio3;

import java.util.ArrayList;
import java.util.List;

public class Alumno {
    //Atributos: su nombre y una lista de tipo Integer con sus 3 notas.
    private String nombre;
    private List<Double> notas;

    //constructor con parametros
    public Alumno(String nombre, List<Double> notas) {
        this.nombre = nombre;
        this.notas = notas;
    }
    //constructor vacio
    public Alumno(){
        notas = new ArrayList();
    }
    //getters y setters
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public List<Double> getNotas() {
        return notas;
    }

    public void setNotas(List<Double> notas) {
        this.notas = notas;
    }
    //toString
    @Override
    public String toString() {
        return "Alumno: "+ nombre + "\n notas: " + notas +"\n **************************";
    }
    
    
}
