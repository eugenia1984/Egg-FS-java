/*
Se plantea desarrollar un programa que nos permita calcular el área y el 
perímetro de formas geométricas, en este caso un circulo y un rectángulo. 
Ya que este calculo se va a repetir en las dos formas geométricas, 
vamos a crear una Interfaz, llamada calculosFormas que tendrá, 
los dos métodos para calcular el área, el perímetro y 
el valor de PI como constante. 
*/
package guia9ejercicio5;


public interface CalculosFormas {
    //Atributo PI como valor constante, por eso FINAL
    public final Double PI = 3.14;
    
    //Metodos que se van a definir en las clases hijas
    public Double calcularArea();
    
    public Double calcularPerimentro();
    
}
