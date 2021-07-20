/*
Realizar un programa para que una Persona pueda adoptar un Perro. 
Vamos a contar de dos clases. 
Perro, que tendrá como atributos: nombre, raza, edad y tamaño; 
y la clase Persona con atributos: nombre, apellido, edad, documento y Perro.
Ahora deberemos en el main crear dos Personas y dos Perros. 
Después, vamos a tener que pensar la lógica necesaria para asignarle 
a cada Persona un Perro 
y por ultimo, mostrar desde la clase Persona, la información del Perro 
y de la Persona.
 */
package ejercicio1;

public class Ejercicio1 {

    public static void main(String[] args) {
    ///Ahora deberemos en el main crear dos Personas y dos Perros.     
        Perro perro1 = new Perro("Pipi", "perro", 10, "mediano");
        Perro perro2 = new Perro("Kenai", "labrador", 2, "grande");
        Persona persona1 = new Persona("Eugenia", "Costa", 36, 31164697, perro1);
        Persona persona2 = new Persona("Juan", "Perez", 20, 39587459, perro2);
    /// mostrar desde la clase Persona, la información del Perro y de la Persona
        System.out.println(persona1);
        System.out.println(persona2);  
    }
}
