/*
 * Realizar una clase llamada Matemática que tenga como atributos dos números 
 * reales con los cuales se realizarán diferentes operaciones matemáticas.
 *  La clase deber tener un constructor vacío, parametrizado y get y set. 
 */
package Ejercicio9;


public class Matematicas {
    //Atributos dos numeros reales
    private double numero1;
    private double numero2;
    
    //Constructor vacio
    public Matematicas() {
    }
    
    //Constructor parametrizado
    public Matematicas(double numero1, double numero2) {
        this.numero1 = numero1;
        this.numero2 = numero2;
    }
    
    //Getters y Setters
    public double getNumero1() {
        return numero1;
    }

    public void setNumero1(double numero1) {
        this.numero1 = numero1;
    }

    public double getNumero2() {
        return numero2;
    }

    public void setNumero2(double numero2) {
        this.numero2 = numero2;
    }
    
    
    
    
}
