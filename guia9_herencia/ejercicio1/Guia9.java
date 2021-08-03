/*
Tenemos una clase padre Animal junto con sus 3 clases hijas Perro, Gato, Caballo.
La clase Animal tendrá como atributos el nombre, alimento, edad y raza del
Animal.
Crear un método en la clase Animal a través del cual cada clase hija deberá
mostrar luego un mensaje por pantalla informando de que se alimenta. Generar
una clase Main que realice lo siguiente:
 */
package guia9;

import java.util.ArrayList;
import java.util.List;

public class Guia9 {

    public static void main(String[] args) {
    
    //Creo una lista de animales para luego guardarlos
        List<Animal> animales = new ArrayList();
    
    //Voy instanciando a los animales y llamo al metodo alimentarse
        //Declaro un objeto PERRO
        Animal perro = new Perro("Stich", "Carnivoro", 15, "Doberman");
        perro.alimentarse();
        
        //Declaro otro objeto Perro
        Perro perro1 = new Perro("Teddy", "Croquetas", 10, "Chihuahua");
        perro1.alimentarse();
        //Declaro un objeto Gato
        Animal gato = new Gato("Pelusa", "Galletas", 15, "Siames" );
        gato.alimentarse();
        //Declaro un objeto Caballo
        Animal caballo = new Caballo("Spark", "Pasto", 25, "Fino");
        caballo.alimentarse();
        
    //Agrego los animales a la lista
        animales.add(perro);
        animales.add(perro1);
        animales.add(gato);
        animales.add(caballo);
        
    //Con la lista puedo recorrerla y mostrar los animales
        System.out.println("----- Mi lista de animales -----");
    for (Animal animal : animales) {
	    System.out.println(animal.toString()); 
	}
    }    
    
}
