/*
 * Pongamos de lado un momento el concepto de POO, ahora vamos a 
 * trabajar solo con la clase Date. En este ejercicio deberemos instanciar en 
 * el main, una fecha usando la clase Date, para esto vamos a tener que crear 3
 * variables, dia, mes y anio que se le pedirán al usuario para poner el 
 * constructor del objeto Date. Una vez creada la fecha de tipo Date, 
 * deberemos mostrarla y mostrar cuantos años hay entre esa fecha y la fecha 
 * actual, que se puede conseguir instanciando un objeto Date con constructor 
 * vacío.
 * Ejemplo fecha: Date fecha = new Date(anio, mes, dia);
 * Ejemplo fecha actual: Date fechaActual = new Date();
 */
package ejercicio11;

import java.util.Date;
import java.util.Scanner;

public class Ejercicio11 {

    static Scanner leer= new Scanner (System.in);
    
    public static void main(String[] args) {
        int dia, mes, anio, diferencia;
        
        System.out.println("Ingrese dia: ");
        dia= leer.nextInt();
        System.out.println("Ingrese mes en numeros (1-Enero ... 12-Diciembre): ");
        mes= leer.nextInt();  
        System.out.println("Ingrese año: ");
        anio= leer.nextInt(); //
        mes-=1; //de 0 a 11 como los meses van de 0 a 11 le resto uno al numero ingresado
        anio-=1900;
        
        //Ejemplo fecha: Date fecha = new Date(anio, mes, dia);
        Date fecha= new Date(anio,mes,dia);
        System.out.println("Fecha ingresada: " + fecha.toString());
        
        //fecha actual, que se puede conseguir instanciando un objeto Date con constructor vacío.
        Date fechaActual= new Date();
        System.out.println("Fecha actual: " + fechaActual.toString());
    
        diferencia= fechaActual.getYear() - fecha.getYear();
        System.out.println("La diferencia de años es " + diferencia);
    }
}
    

