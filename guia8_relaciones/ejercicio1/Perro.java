//Perro, que tendrá como atributos: nombre, raza, edad y tamaño;
package ejercicio1;


public class Perro {
    
    //Atributos
    private String nombre;
    private String raza;
    private int edad;
    private String tamanio;
    
    //Constructores
    public Perro() {
    }

    public Perro(String nombre, String raza, int edad, String tamanio) {
        this.nombre = nombre;
        this.raza = raza;
        this.edad = edad;
        this.tamanio = tamanio;
    }
    
    //Getters y Setter
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getRaza() {
        return raza;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getTamanio() {
        return tamanio;
    }

    public void setTamanio(String tamanio) {
        this.tamanio = tamanio;
    }
    
    //toString
    @Override
    public String toString() {
        return "Perro{ " + "nombre = " + nombre + ", raza = " + raza + ", edad = " + edad + ", tamanio = " + tamanio + '}';
    }
   
    
}
