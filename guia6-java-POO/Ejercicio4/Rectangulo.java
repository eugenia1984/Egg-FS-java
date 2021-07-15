/*
 */
package Ejercicio4;

import java.util.Scanner;

//Crear una clase Rectángulo que modele rectángulos por medio de un atributo
// privado base y un atributo privado altura.
public class Rectangulo {
    //Atributos
    private int base;
    private int altura;
    //constructores correspondientes
    public Rectangulo(int base, int altura) {
        this.base = base;
        this.altura = altura;
    }
    //constructores correspondientes
    public Rectangulo() {
 
    }
    // Se deberán además definir los métodos getters, setters
    public int getBase() {
        return base;
    }

    public void setBase(int base) {
        this.base = base;
    }

    public int getAltura() {
        return altura;
    }

    public void setAltura(int altura) {
        this.altura = altura;
    }
    // La clase incluirá un método para crear el rectángulo con
    // los datos del Rectángulo dados por el usuario.
    public void crearRectangulo() {
        
     Scanner leer = new Scanner(System.in);
     
     System.out.println("Ingrese la base del rectangulo: ");
     setBase(leer.nextInt());
     System.out.println("Ingrese la altura del rectangulo: ");
     setAltura(leer.nextInt());
    }
    //Incluirá un método para calcular la superficie del rectángulo 
    // Superficie = base * altura
    public int superficie() {
        return this.base+this.altura;
    }
    // Incluira un método para calcular el perímetro del rectángulo.
    // Perímetro = (base + altura) * 2.
    public int perimetro() {
        return (this.altura*2) + (this.base*2);
    }
    
    // Tendremos un método que dibujará el rectángulo mediante asteriscos usando la base y la altura.
    public void dibujar(){
    
        for (int i = 0; i < this.altura; i++) {
            
            for (int j = 0; j < this.base; j++) {
                if (i == 0 || j ==00 || i == this.altura - 1 || j == this.base - 1 ) {
                    System.out.print(" * ");
                } else {
                    System.out.print(" ");
                }          
            }
            System.out.print("");
        }
    }
    
}

