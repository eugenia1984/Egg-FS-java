/*
Realizar un programa que pida dos números enteros positivos por teclado y
muestre por pantalla el siguiente menú:
MENU
1. Sumar
2. Restar
3. Multiplicar
4. Dividir
5. Salir
Elija opción:
El usuario deberá elegir una opción y el programa deberá mostrar el resultado por
pantalla y luego volver al menú. 
El programa deberá ejecutarse hasta que se elija la opción 5. 
Tener en cuenta que, si el usuario selecciona la opción 5, en vez de salir
del programa directamente, se debe mostrar el siguiente mensaje de confirmación:
¿Está seguro que desea salir del programa (S/N)? 
Si el usuario selecciona el carácter ‘S’ se sale del programa, caso contrario 
se vuelve a mostrar el menú
*/

package ejercicio14;

import java.util.Scanner;

public class Ejercicio14 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
    //Declaro mis variables  
          int num1;
          int num2;
          int sumar;
          int restar;
          int multiplicar;
          float dividir;
          int opcion;
          char eleccion;
    //Inicializo mis variables
        num1=0;
        num2=0;
        eleccion=' ';
        
    //Pido que ingrese los números siempre que los numeros sean positivos, si aguno es menor a 1 no lo valida
        do { 
        //Pido que ingrese dos numeros y los guardo en variables
            System.out.println("Ingrese un numero entero positivo: ");
            num1 = leer.nextInt();
            System.out.println("Ingrese otro numero entero positivo: ");
            num2 = leer.nextInt(); 
            
        } while (num1<1 || num2<1);
        
        
        //Mientras elija una opcion entre 1 a 5 y no diga que N quiere salir
        do{
            System.out.println("Menu"); 
            System.out.println("1.Sumar"); 
            System.out.println("2.Restar"); 
            System.out.println("3.Multiplicar"); 
            System.out.println("4.Dividir"); 
            System.out.println("5.Salir"); 
            System.out.println("Ingrese una opción");
            //Leo la opcion elegida y la asigno a la variable opcion
            opcion = leer.nextInt();
            
            switch(opcion){
                case 1:{
                    sumar = num1 + num2;
                    System.out.println("La suma de "+ num1 + " y " + num2 + " es: " + sumar);
                    break;
                }
                case 2:{
                    restar = num1 - num2;
                    System.out.println("La resta de " + num1 + " y " + num2 + "  es: " + restar);
                    break;
                }
                case 3:{
                    multiplicar = num1 * num2;
                    System.out.println("La multiplicación de " + num1 + " y " + num2 + " es " + multiplicar);
                    break;
                }
                case 4:{
                    dividir = num1 / num2;
                    System.out.println("La division de " + num1 + " y " + num2 + "  es " + dividir);
                    break;
                }
                case 5:{
                    System.out.print("¿Está seguro que desea salir del programa (S/N)?: ");
                    eleccion = leer.next().toUpperCase().charAt(0);
                }
                default:{ //Por si ingresa algo distinto a 1, 2, 3, 4, 5
                    System.out.println("Eligio una opcion incorrecta");
                    break;
                }       
            } //Cierro el sitch
            
        }while(eleccion != 'S');  //Cierro el do while
    } 
}
        

