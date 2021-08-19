/*
Defina una clase llamada DivisionNumero. 
En el método main utilice un Scanner
para leer dos números en forma de cadena. 
A continuación, utilice el método
parseInt() de la clase Integer, para convertir las cadenas al tipo int
y guardarlas en dos variables de tipo int. 
Por ultimo realizar una división con los dos numeros y
mostrar el resultado.
Todas estas operaciones puede tirar excepciones a manejar, el ingreso por
teclado puede causar una excepción de tipo InputMismatchException, el método
Integer.parseInt() si la cadena no puede convertirse a entero, arroja una
NumberFormatException y además, al dividir un número por cero surge una
ArithmeticException. Manipule todas las posibles excepciones utilizando bloques
try/catch para las distintas excepciones
 */
package ejercicio3;

import java.util.InputMismatchException;
import java.util.Scanner;


public class DivisionNumero {

    static Scanner leer = new Scanner(System.in).useDelimiter("\n");

    public static void main(String[] args) {
        
        
        
        int num1, num2;
        double division;
        String nombre;
        
        
        try {
        
        System.out.println("Ingrese un numero: ");
        num1 = Integer.parseInt(leer.next());
        System.out.println("Ingrese otro numero: ");
        num2 = Integer.parseInt(leer.next());
        
        division = num1 / num2;
       
        
        } catch (InputMismatchException | NumberFormatException | ArithmeticException e){
        
            System.out.println("Error: " + e);
            
        } finally {
        
            System.out.println("Estoy en el finally");
        }
        
        System.out.println("Estoy a pesar del error");
        
        try {
            
            ponerNombre();
            
  
        } catch(CarlosExc e) {
            System.out.println("Error : " + e.getMessage());
        }

    }
        
    
    public static void ponerNombre()throws CarlosExc{
        
        String nombre="";
        
        System.out.println("Ingrese un nombre que no sea Carlos: ");
            nombre = leer.next();
            
            if ( nombre.equalsIgnoreCase("Carlos")) {
                throw new CarlosExc("No se puede llamar carlos.");
            
            }
            
            if ( nombre.isEmpty()) {
                throw new CarlosExc("Debes completar con un nombre");
            
            }
            throw new CarlosExc("Soy una excepcion por fuera de la condicion");
        
        
    }

}
    

