/*
Clase Date. 
En este ejercicio deberemos instanciar en el main, 
una fecha usando la clase Date, 
para esto vamos a tener que crear 3 variables, dia, mes y anio 
que se le pedirán al usuario para poner el constructor del objeto Date. 
Una vez creada la fecha de tipo Date, 
deberemos mostrarla y mostrar cuantos años hay entre esa fecha 
y la fecha actual, que se puede conseguir instanciando 
un objeto Date con constructor vacío.
Ejemplo fecha: Date fecha = new Date(anio, mes, dia);
Ejemplo fecha actual: Date fechaActual = new Date();
 */
package Ejercicio11;

import java.util.Scanner;
import java.util.Date;

public class Ejercicio11 {

    public static void main(String[] args) {
        //crear 3 variables, dia, mes y anio 
        int dia;
        int mes;
        int anio;
        int diferencia; //para calcular la diferencia entre los años
        
        //instanciar en el main, una fecha usando la clase Date
        Scanner leer = new Scanner(System.in);
        
        //se le pedirán al usuario para poner el constructor del objeto Date
        System.out.println("Ingrese una fecha...");
        System.out.println("Dia: ");
        dia = leer.nextInt();
        
        System.out.println("Mes : ");
        mes = leer.nextInt();
        mes = mes-1;
        
        System.out.println("Año: ");
        anio = leer.nextInt();
        anio = anio - 1900;
        
        Date fechaUsuario = new Date(anio, mes, dia);
        
        System.out.println("La fecha ingresada es : " + fechaUsuario.toString());
    
        Date fechaActual = new Date();
        
        System.out.println("La fecha actual es : " + fechaActual);
        
        diferencia= fechaActual.getYear() - fechaUsuario.getYear();
        System.out.println("La diferencia de años es " + diferencia);
        
    }
}

