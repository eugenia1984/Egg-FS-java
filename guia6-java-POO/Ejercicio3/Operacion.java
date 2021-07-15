
package Ejercicio3;

import java.util.Scanner;
//Crear una clase llamada Operacion que tenga como atributos privados numero1 y numero2. 
public class Operacion {
    
    Scanner leer = new Scanner(System.in);
    //Atributos
    private int numero1;
    private int numero2;
    
    //Método constructor con todos los atributos pasados por parámetro
    public Operacion(int numero1, int numero2){
          this.numero1 = numero1;
          this.numero2= numero2;
    }
    //Metodo constructor sin los atributos pasados por parámetro
    public Operacion(){

    }
    //Métodos get y set
    public int getNumero1() {
        return numero1;
    }

    public void setNumero1(int numero1) {
        this.numero1 = numero1;
    }

    public int getNumero2() {
        return numero2;
    }

    public void setNumero2(int numero2) {
        this.numero2 = numero2;
    }
    //Método para crearOperacion(): que le pide al usuario los dos números y los guarda en los atributos del objeto.
    public void crearOperacion(){
        System.out.println(" Ingrese numero 1 : ");
        setNumero1(leer.nextInt());
        
         System.out.println(" Ingrese numero 2 : ");
        setNumero2(leer.nextInt());
    }
    //Método sumar(): calcular la suma de los números y devolver el resultado al main.
    public int sumar() {
        return numero1 + numero2;
    }
    //Método restar(): calcular la resta de los números y devolver el resultado al main
     public int restar() {
        int resta;
        resta = numero1 - numero2;
        return resta;
    }
    //Método multiplicar(): primero valida que no se haga una multiplicación por cero, si fuera a multiplicar por cero, 
    //el método devuelve 0 y se le informa al usuario el error. Si no, se hace la multiplicación y se devuelve el resultado al main 
    public int multiplicar(){
        if (numero1 == 0 || numero2 == 0) {
            return 0;
        } else {
            return numero1 * numero2;
        }
    } 
    //Método dividir(): primero valida que no se haga una división por cero, si fuera a pasar una división por cero, 
    //el método devuelve 0 y se le informa al usuario el error se le informa al usuario. Si no, se hace la división y 
    //se devuelve el resultado al main.
    public int dividir() {
        if(numero2 == 0) {
            return 0;
        } else {
            return numero1 / numero2;
        }
    }
    
}
