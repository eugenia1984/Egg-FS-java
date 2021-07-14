/*
Escriba un programa que lea 20 números. Si el número leído es igual a cero se debe
salir del bucle y mostrar el mensaje "Se capturó el numero cero". 
El programa deberá calcular y mostrar el resultado de la suma de los números leídos, 
pero si el número es negativo no debe sumarse. 
Nota: recordar el uso de la sentencia break.
 */
package ejercicio15;

import java.util.Scanner;


public class Ejercicio15 {


    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
    //Declaro mis variables
        int numero;
        int suma;
    //Inicializo mis variables
        numero =0;
        suma=0;
    //Con un for voy a ir pidiendo que ingrese los numeros
        for (int i = 0; i <= 20; i++) {
        //Pido que ingrese el numero y luego o leo y asigno a la variable numero
            System.out.println(i + ". Ingrese un número entero: ");
            numero = leer.nextInt();
        //Con un if else if chequeo primero que el numero ingresado sea 0, asi puedo mostrar el mensaje de que se camturo el numero cero y salgo del bucle
            if(numero ==0){
                System.out.println("Se capturó el numero cero");
                break;
            }else if(numero >0){  //en vez de else pongo else if asi me aseguro que el numero ingresado es positivo, es decir mayor a 0
                suma += numero;
            } //Cierro el if else if
        } //cierro el for
        //Como ya sali del for ahora muestro el cartel de la suma d elos numeros ingresados
        System.out.println("La suma de los numeros ingresados es: "+ suma);
    }
}
