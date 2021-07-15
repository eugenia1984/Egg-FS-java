/*
Declarar una clase llamada Circunferencia que tenga como atributo privado el radio
de tipo real. A continuación, se deben crear los siguientes métodos:
a) Método constructor que inicialice el radio pasado como parámetro.
b) Métodos get y set para el atributo radio de la clase Circunferencia.
c) Método para crearCircunferencia(): que le pide el radio y lo guarda en el atributo
del objeto.
d) Método area(): para calcular el área de la circunferencia (Area = π ∗ radio!).
e) Método perimetro(): para calcular el perímetro (Perimetro = 2 ∗ π ∗ radio).
 */
package Ejercicio2;

public class Ejercicio2 {

    public static void main(String[] args) {
        //Instancio un nuevo objeto
        Circunferencia circ = new Circunferencia();
        //Creo la nueva circunferencia
        circ = circ.crearCirc();
        //Aplico el metodo para calcular el area
        System.out.println("El área es de : " + circ.calcularArea(circ));
        //Aplico el metodo para crear el perimetro
        System.out.println("El perímetro es de : " + circ.calcularPerimetro(circ));
        
    }
}
