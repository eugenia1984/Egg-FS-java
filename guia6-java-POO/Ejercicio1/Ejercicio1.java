/*
Crear una clase llamada Libro que contenga los siguientes atributos: ISBN, Título,
Autor, Número de páginas, y un constructor con todos los atributos pasados por
parámetro y un constructor vacío. 
Crear un método para cargar un libro pidiendo los datos al usuario y 
luego informar mediante otro método el número de ISBN, el título,
el autor del libro y el numero de páginas.
 */
package Ejercicio1;


public class Ejercicio1 {

    public static void main(String[] args) {
        //Con la clase Libro instancio un nuevo libro
        Libro libro = new Libro();
        //A este nuevo libro creado le aplico el método de crear libro
        libro.crearLibro();
        //Al mismo libro creado le aplico el método de mostrar libro
        libro.mostrarLibro();          
    }
 
}
