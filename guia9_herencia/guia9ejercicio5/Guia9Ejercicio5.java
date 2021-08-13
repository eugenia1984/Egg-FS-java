/*
Se plantea desarrollar un programa que nos permita calcular el área y el 
perímetro de formas geométricas, en este caso un circulo y un rectángulo. 
Ya que este calculo se va a repetir en las dos formas geométricas, 
vamos a crear una Interfaz, llamada calculosFormas que tendrá, 
los dos métodos para calcular el área, el perímetro y el valor de PI como constante. 
Desarrollar el ejercicio para que las formas implementen los métodos de la 
interfaz y se calcule el área y el perímetro de los dos.

En el main se crearán las formas y se mostrará el resultado final.

Área circulo: PI * radio ^ 2 / Perímetro circulo: PI * diámetro.

Área rectángulo: base * altura / Perímetro rectángulo: (base + altura) * 2.
*/
package guia9ejercicio5;


public class Guia9Ejercicio5 {


    public static void main(String[] args) {
        
        //Intancio un nuevo objeto de la clase Rectangulo y asigno valor a los atributos
        Rectangulo rectangulo1 = new Rectangulo(10.0, 4.0);
        //Instancio un nuevo objeto de la clase Circulo y asigno valor a los atributos
        Circulo circulo1 = new Circulo(6.0,3.0);
        
        //Muestro los valores del circulo, tanto sus atributos como los que calcula su metodo
        System.out.println(circulo1);
        System.out.println("El area del circulo es: "+ circulo1.calcularArea());
        System.out.println("La circunferencia del circulo es: "+ circulo1.calcularPerimentro());
        
        //Hago lo mismo con el rectangulo
        System.out.println(rectangulo1);
        System.out.println("El area del rectangulo es: "+ rectangulo1.calcularArea());
        System.out.println("El perimetro del rectangulo es: "+ rectangulo1.calcularPerimentro());
        
        //Figura figura1 = new Figura();
        
        rectangulo1.crearRectangulo();
               
    }
    
}
