//Área circulo: PI * radio ^ 2 / Perímetro circulo: PI * diámetro.
package guia9ejercicio5;


public class Circulo extends Figura implements CalculosFormas{
    
    //Atributos
    private Double radio;
    private Double diametro;

    //constructor
    public Circulo(Double radio, Double diametro) {
        this.radio = radio;
        this.diametro = diametro;
    }

    public Circulo() {
    }

    //Getters y Setters
    public Double getRadio() {
        return radio;
    }

    public void setRadio(Double radio) {
        this.radio = radio;
    }

    public Double getDiametro() {
        return diametro;
    }

    public void setDiametro(Double diametro) {
        this.diametro = diametro;
    }

    //Defino como calculo el area
    @Override
    public Double calcularArea() {
        Double area = PI * Math.pow(radio, 2);
        return area;
    }

    //Defino como calculo el perimetro
    @Override
    public Double calcularPerimentro() {
        Double perimetro = PI * diametro;
        return perimetro;
    }

    @Override
    public void dibujar() {
        System.out.println("Estoy dibujando un circulo");
    }

    //toString

    @Override
    public String toString() {
        return "Circulo{" + "radio = " + radio + ", diametro = " + diametro + '}';
    }
    
    
    
}
