/*
* Los siguientes métodos:
 * -Agregar un método de creación del objeto que respete la siguiente firma: 
 * crearPersona(). Este método rellena el objeto mediante un Scanner y le 
 * pregunta al usuario el nombre y la fecha de nacimiento de la persona a crear, 
 * recordemos que la fecha de nacimiento debe guardarse en un Date y los 
 * guarda en el objeto.
 * -Escribir un método calcularEdad() a partir de la fecha de nacimiento
 * ingresada. Tener en cuenta que para conocer la edad de la persona también se
 * debe conocer la fecha actual.
 * - Agregar a la clase el método menorQue(int edad) que recibe como parámetro
 * otra edad y retorna true en caso de que el receptor tenga menor edad que la
 * persona que se recibe como parámetro, o false en caso contrario.
 * - Metodo mostrarPersona(): este método muestra la persona creada en el 
 * método anterior.
 *
 *black = "\033[30m"
 *red = "\033[31m" 
 *green = "\033[32m" 
 *yellow = "\033[33m" 
 *blue = "\033[34m"
 *purple = "\033[35m" 
 *cyan = "\033[36m" 
 *white = "\033[37m"
 *reset = "\u001B[0m" o "\033[0m"
 */
package ejercicio12;

import java.util.Date;
import java.util.Scanner;

public class PersonaService {
    
    Scanner leer = new Scanner(System.in).useDelimiter("\n");
    
    //Metodo para crear la persona
    public void crearPersona(Persona p){
        int dia, mes, anio;
        
        System.out.print("Ingresar nombre: ");
        p.setNombre(leer.next());
        System.out.print("\033[32m" + "Ingresar dia nacimiento(numero): ");
        dia = leer.nextInt();
        System.out.print("\033[33m"+"Ingresar mes nacimiento(numero): ");
        mes = leer.nextInt()-1; //porque los meses van de 0 a 11
        System.out.print("\033[37m"+"Ingresar año nacimiento: ");
        anio = leer.nextInt();
        anio-=1900;
        Date fechaNacimiento = new Date(); // Creamos el objeto tipo Date
/*Si ponéis eso en Java, os aparecerá como tachado. Eso significa que esta “deprecated” que es como obsoleto.
Para resolverlo tambien puedo usar un objeto de la clase Calendar.                           
*/
        fechaNacimiento.setDate(dia); // Seteamos el dia
        fechaNacimiento.setMonth(mes); // Seteamos el mes
        fechaNacimiento.setYear(anio); // Seteamos el anio
        
        p.setFechaDeNacimiento(fechaNacimiento);      
    }

    //• Escribir un método calcularEdad() a partir de la fecha de nacimiento ingresada.
    //Tener en cuenta que para conocer la edad de la persona también se debe
    //conocer la fecha actual.
    public static int calcularEdad(Persona p){
        Date fechaActual = new Date();
        int edad = fechaActual.getYear()+1900-p.getFechaDeNacimiento().getYear()-1900;
    //1ro > comparo por mes actual y el mes de la fecha de nacimiento, si el mes
    //actual es menor al del nacimiento este año todavia no cumplio años -> descuento un año
    //2do ->si el mes actual es el mismo del mes del nacimiento -> comparo por los dias
    //si el dia actual es menor al del nacimiento todavia no cumplio años -> descuento un año
        if(fechaActual.getMonth()<p.getFechaDeNacimiento().getMonth() || 
                (fechaActual.getMonth()==p.getFechaDeNacimiento().getMonth() && fechaActual.getDay()<p.getFechaDeNacimiento().getDay())){
            edad --;
        }
        return edad;
    }
    
    //• Agregar a la clase el método menorQue(int edad) que recibe como parámetro
    //otra edad y retorna true en caso de que el receptor tenga menor edad que la
    //persona que se recibe como parámetro, o false en caso contrario.
    public static boolean menorQue(Persona p, int edad){
        return calcularEdad(p) < edad;
    }
    
    //• Metodo mostrarPersona(): este método muestra la persona creada en el 
    //método anterior.
    public static void mostrarPersona(Persona p){
        System.out.println("\033[36m"+"Informacion");
        System.out.println("\033[0m"+"Nombre: " + p.getNombre());
        System.out.println("Fecha de nacimiento: " + p.getFechaDeNacimiento().toString());
    }

    
}
