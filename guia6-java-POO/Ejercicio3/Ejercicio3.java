/*
 Crear una clase llamada Operacion que tenga como atributos privados numero1 y
numero2. A continuación, se deben crear los siguientes métodos:
a) Método constructor con todos los atributos pasados por parámetro.
b) Metodo constructor sin los atributos pasados por parámetro.
c) Métodos get y set.
d) Método para crearOperacion(): que le pide al usuario los dos números y los guarda en los atributos del objeto.
e) Método sumar(): calcular la suma de los números y devolver el resultado al main.
f) Método restar(): calcular la resta de los números y devolver el resultado al main
g) Método multiplicar(): primero valida que no se haga una multiplicación por cero,
si fuera a multiplicar por cero, el método devuelve 0 y se le informa al usuario el
error. Si no, se hace la multiplicación y se devuelve el resultado al main
h) Método dividir(): primero valida que no se haga una división por cero, si fuera a
pasar una división por cero, el método devuelve 0 y se le informa al usuario el
error se le informa al usuario. Si no, se hace la división y se devuelve el resultado
al main.
 */
package Ejercicio3;

import java.util.Scanner;

public class Ejercicio3 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        
        int sumatoria;
        int restas;
        int multiplicacion;
        double division;
        //Instancio una nueva operacion
        Operacion oper1 = new Operacion();
        //Utilizo el metodo crearOperacion()
        oper1.crearOperacion();
        //Realizo la suma
        sumatoria = oper1.sumar();
        System.out.println(" La suma de los dos numeros es " + sumatoria);
        //Realizo la resta
        restas = oper1.restar();
        System.out.println("La resta de los dos números es :" + restas);
        //Realizo la multiplicacion
        multiplicacion = oper1.multiplicar();
        
        if(multiplicacion == 0) {
            System.out.println("ERROR, no se multiplicar por 0.");
        } else {
            System.out.println("La multiplicacion es : " + multiplicacion);
        }
        
        division = oper1.dividir();
        if( oper1.getNumero2() == 0) {
            System.out.println("ERROR, no se dividir por 0.");
        } else {
            System.out.println("La division es : " + division);
        }
        
    }
    
}
