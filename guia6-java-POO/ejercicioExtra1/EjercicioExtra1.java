package ejercicioExtra1;

/*
 * Desarrollar una clase Cancion con los siguientes atributos: titulo y autor.
 * Se deberá́ definir además dos constructores: uno vacío que inicializa el
 * titulo y el autor a cadenas vacías y otro que reciba como parámetros el 
 * titulo y el autor de la canción.
 * Se deberán además definir los métodos getters y setters correspondientes
 */

public class EjercicioExtra1 {

    public static void main(String[] args) {
        //el constructor recibe como parámetros el título y el autor
        Cancion c1 = new Cancion("WonderWall", "Oasis"); 
        
        //el constructor no recibe nada. Luego utilizo un método para ingresar título y autor.
        Cancion c2 = new Cancion(); 
        c2.ingresarDatos();
        
        System.out.println("PRIMERA CANCION: " + c1.getTitulo() + ", " + c1.getAutor());
        System.out.println("SEGUNDA CANCION: " + c2.getTitulo() + ", " + c2.getAutor());
        
    }
    
}
