/*
El ejercicio 1 y 2 juntos:
EJERCICIO 1:
Diseñar un programa que lea y guarde razas de perros en un ArrayList de tipo
String. 
El programa pedirá una raza de perro en un bucle, el mismo se guardará
en la lista y después se le preguntará al usuario si quiere guardar otro perro o si
quiere salir. Si decide salir, se mostrará todos los perros guardados en el ArrayList.
EJERCICIO 2:
Continuando el ejercicio anterior, después de mostrar los perros, al usuario se le
pedirá un perro y se recorrerá la lista con un Iterator, se buscará el perro en la lista.
Si el perro está en la lista, se eliminará el perro que ingresó el usuario y se mostrará
la lista ordenada. Si el perro no se encuentra en la lista, se le informará al usuario
y se mostrará la lista ordenada.
*/

package ejercicio1y2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
import java.util.Iterator;


public class Ejercicio1y2 {

    public static void main(String[] args) {
     // Crear la lista
        ArrayList<String> razas = new ArrayList();
     //Utilizo Scanner para luego leer lo que ingresa por teclado
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
     //Defino mis variables
        String razaPerro;
        String respuesta;
        boolean estaEnLaLista= false;
        
        do {            
          //Pido al usuario una raza
            System.out.println("Ingrese una raza: ");
	  //Agrego la raza a la lista
            razas.add(leer.next().toUpperCase());
           
          //Otro modo era crear la variable razaPerro que lo guarde y luego lo agrego
          //razaPerro = leer.next();
          //razas.add(razaPerro);
            System.out.println("Desea agregar perro ( SI / NO) : ");
            respuesta = leer.next().toUpperCase();
            
        } while ( respuesta.equals("SI"));   //Siempre que diga que SI quiere agregar sigue el bucle

        //Mostrar el ArrayList
        System.out.println("Las razas son : ");
        for (String elemento : razas) {
            System.out.println( elemento);
        }
        //Pido que ingresa una raza a buscar y la asigno a la variable
        System.out.println("Ingrese una raza para buscarla: ");
        razaPerro = leer.next().toUpperCase();
        
        Iterator it = razas.iterator();
        
        while(it.hasNext()) {
           //Si la raza ingresada estaba en la lista la saco 
            if (razaPerro.equals(it.next())) {
                it.remove();
                estaEnLaLista = true;
            } 
        }
        //Con un if/else muestro mensaje de si estaba o no en la lista 
        if (estaEnLaLista) {
            System.out.println("Se encontro la raza.");
        } else {
            System.out.println("No se encontro la raza.");
        }
      //Ordeno en forma ascendente la lista 
        Collections.sort(razas);
     //Muestro la lista ordenada  
        System.out.println("Las razas son : ");
        for (String elemento : razas) {
            System.out.println( elemento);
        }
         
    }
    
}