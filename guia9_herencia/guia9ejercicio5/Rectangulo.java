//Área rectángulo: base * altura / Perímetro rectángulo: (base + altura) * 2.
package guia9ejercicio5;

import java.util.Scanner;


public class Rectangulo extends Figura implements CalculosFormas{
    
    //Atributos
    private Double base;
    private Double altura;

    //constructores
    public Rectangulo(Double base, Double altura) {
        this.base = base;
        this.altura = altura;
    }

    public Rectangulo() {
    }

    //Getters y Setters
    public Double getBase() {
        return base;
    }

    public void setBase(Double base) {
        this.base = base;
    }

    public Double getAltura() {
        return altura;
    }

    public void setAltura(Double altura) {
        this.altura = altura;
    }
    
    //Metodo para crear un rectangulo
    public void crearRectangulo(){
        Scanner leer = new Scanner(System.in);
        //Integer lados = super.crearFigura();
        
        System.out.println("Ingresar base del rectangulo: ");
        base = leer.nextDouble();
        System.out.println("Ingresar altura del rectangulo: ");
        altura = leer.nextDouble();
        System.out.println("Creo un rectángulo de : " + getBase() + " de base y de : " + getAltura() + " de altura");
        
    }

    //Determino como se calcula el area
    @Override
    public Double calcularArea() {
        Double area = this.base * altura;

        return area;
    }

    //Determino como se calcula el perimetro
    @Override
    public Double calcularPerimentro() {
        
        Double perimetro = (this.base + altura) * 2;

        return perimetro;
    }

    @Override
    public void dibujar() {
        System.out.println("estoy dibujando un rectangulo");    
    }

    //toString

    @Override
    public String toString() {
        return "Rectangulo{" + "base = " + base + ", altura = " + altura + '}';
    }
    

    
}
