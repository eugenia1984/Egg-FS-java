
package ejercicioExtra1;

import java.util.Scanner;

public class Cancion {
    
    static Scanner leer = new Scanner(System.in).useDelimiter("\n");

    //atributos
    private String titulo;
    private String autor;

    //constructores
    public Cancion(String titulo, String autor) {
        this.titulo = titulo;
        this.autor = autor;
    }

    public Cancion() {
    }

    //getters y setters
    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public void ingresarDatos() {
        System.out.println("Ingrese  título: ");
        setTitulo(leer.next());
        System.out.println("Ingrese autor: ");
        setAutor(leer.next());
    }
    
}
