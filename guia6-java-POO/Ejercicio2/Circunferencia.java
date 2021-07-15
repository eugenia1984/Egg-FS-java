/*
Declarar una clase llamada Circunferencia 
que tenga como atributo privado el radio de tipo real. 
A continuación, se deben crear los siguientes métodos:
a) Método constructor que inicialice el radio pasado como parámetro.
b) Métodos get y set para el atributo radio de la clase Circunferencia.
c) Método para crearCircunferencia(): que le pide el radio y lo guarda en el atributo
del objeto.
d) Método area(): para calcular el área de la circunferencia (Area = π ∗ radio!).
e) Método perimetro(): para calcular el perímetro (Perimetro = 2 ∗ π ∗ radio).

*/
package Ejercicio2;

import java.util.Scanner;

//Declarar una clase llamada Circunferencia 
public class Circunferencia {
    
    Scanner leer = new Scanner(System.in).useDelimiter("\n");
    
    //Atributos privado radio de tipo real
    private float radio;
    
    //Método constructor que inicialice el radio pasado como parámetro.
    public Circunferencia(float radio) {
        this.radio = radio;
    }
    
    //Constructor vacio
    public Circunferencia() {

    }
    
    //Getters y Setters
    public float getRadio() {
        return radio;
    }

    public void setRadio(float radio) {
        this.radio = radio;
    }

    @Override
    public String toString() {
        return "Circunferencia{" + "radio=" + radio + '}';
    }
    
    //Método para crearCircunferencia(): que le pide el radio y lo guarda en el atributo del objeto.
    public Circunferencia crearCirc() {
   
       //Instancio nueva circunferencia
       Circunferencia circunferencia = new Circunferencia();
       //Pido ingree el usuario la circunferencia
       System.out.println("Ingrese radio: ");
       //Leo la circunferencia ingresada y la asigno a la variable
       circunferencia.setRadio(leer.nextFloat());
       //Muestro la variable
       return circunferencia;
 
    }
    
    
    //Método area(): para calcular el área de la circunferencia (Area = π ∗ radio!)
    public double calcularArea(Circunferencia circ) {
        //Declaro e inicializo mi variable area en 0
        double area = 0;
        //Calculo el área
        area = ((Math.PI) * (circ.getRadio() * circ.getRadio()));
        //Retorno el area
        return area;
    }
    //Método perimetro(): para calcular el perímetro (Perimetro = 2 ∗ π ∗ radio).
    public double calcularPerimetro(Circunferencia circ) {
        //Declaro e inicializo la variable perimero en 0
        double perimetro = 0;
        //Calculo le perimetro
        perimetro = (2 * Math.PI * circ.getRadio());
        //Retorno el perimetro
        return perimetro;
    }
}



