package mascotapp.entidades;

import java.util.Date;

public class Usuario {
    //Atributos
    public String nombre;
    public String apellido;
    public int dni;
    public Date nacimiento;
    public String pais;

    //constructor vacio
    public Usuario() {
    }
    
    //constructor con atributos como parametros
    public Usuario(String nombre, String apellido, int dni, Date nacimiento, String pais) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.dni = dni;
        this.nacimiento = nacimiento;
        this.pais = pais;
    }

    @Override
    public String toString() {
        return "Usuario{" + "nombre = " + nombre + ", apellido = " + apellido +
                ", dni = " + dni + ", nacimiento = " + nacimiento + ", pais = " +
                pais + '}';
    }
    
    
}
