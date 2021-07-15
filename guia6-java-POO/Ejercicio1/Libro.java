/*
Crear una clase llamada Libro que contenga los siguientes atributos: ISBN, Título,
Autor, Número de páginas, y un constructor con todos los atributos pasados por
parámetro y un constructor vacío. 
Crear un método para cargar un libro pidiendo los datos al usuario y 
luego informar mediante otro método el número de ISBN, el título,
el autor del libro y el numero de páginas.
 */
package Ejercicio1;

import java.util.Scanner;

//Crear una clase llamada Libro
public class Libro {
    //Atributos:  ISBN, Título, Autor, Número de páginas
    private int isbn;
    private String titulo;
    private String autor;
    private int numeroPaginas;
    
    //Constructor con todos los atributos pasados por parametro
    public Libro(int isbn, String titulo, String autor, int numeroPaginas) {
        this.isbn = isbn;
        this.titulo = titulo;
        this.autor = autor;
        this.numeroPaginas = numeroPaginas;
    }
    //Constructor vacio
     public Libro() {

    }
    //Los getters y setters
    public int getIsbn() {
        return isbn;
    }

    public void setIsbn(int isbn) {
        this.isbn = isbn;
    }

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

    public int getNumeroPaginas() {
        return numeroPaginas;
    }

    public void setNumeroPaginas(int numeroPaginas) {
        this.numeroPaginas = numeroPaginas;
    }

      
    //Metodo para cargar el libro pidiendo los datos al usuario
     public void crearLibro() {
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        System.out.print("Ingrese ISBN del libro: ");
        this.isbn = leer.nextInt();
        System.out.println("Ingrese el titulo del libro : ");
        this.titulo = leer.next();
        System.out.println("Ingrese el autor del libro: ");
        this.autor = leer.next();
        System.out.println("Ingrese cantidad de paginas del libro: ");
        this.numeroPaginas = leer.nextInt();
    }
     //Metodo para mostrar el libro, informando el número de ISBN, el título, el autor del libro y el numero de páginas.
     public void  mostrarLibro() {
        System.out.println("El libro es: ");
        System.out.println("ISBN: " + this.isbn);
        System.out.println("Titulo: " + this.titulo);
        System.out.println("Autor: " + this.autor);
        System.out.println("Cantidad de paginas: " + this.numeroPaginas);
     }
     
}
