/*
 * -atributos: nombre, edad, sexo ('H' hombre, 'M' mujer, 'O' otro), peso y altura
 * -Un constructor por defecto.
 * -Un constructor con todos los atributos como parámetro.
 * -Métodos getters y setters de cada atributo.
 *  Metodo crearPersona(): el método crear persona, le pide los valores de los 
 *  atributos al usuario y después se le asignan a sus respectivos atributos 
 *  para llenar el objeto Persona. Además, comprueba que el sexo introducido 
 *  sea correcto, es decir, H, M o O. Si no es correcto se deberá mostrar un mensaje
 */
package Ejercicio7;

import java.util.Scanner;


public class Persona {
    //Atributos
    private String nombre;
    private int edad;
    private char sexo;
    private double peso;
    private double altura;
    
    static Scanner leer = new Scanner(System.in);
    static Scanner leer2 = new Scanner(System.in);
    
    //Constructor vacio
    public Persona() {
    }
    //constructor con todos los atributos como parámetro
    public Persona(String nombre, int edad, char sexo, double peso, double altura) {
        this.nombre = nombre;
        this.edad = edad;
        this.sexo = sexo;
        this.peso = peso;
        this.altura = altura;
    }
    
    // Métodos getters y setters de cada atributo
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public char getSexo() {
        return sexo;
    }

    public void setSexo(char sexo) {
        this.sexo = sexo;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }
    
    /**Metodo crearPersona(): el método crear persona, le pide los valores de los 
    *  atributos al usuario y después se le asignan a sus respectivos atributos 
    *  para llenar el objeto Persona. Además, comprueba que el sexo introducido 
    *  sea correcto, es decir, H, M o O. Si no es correcto se deberá mostrar un mensaje
    */
    public Persona crearPersona() {
        Persona persona = new Persona();
        
        System.out.println("--- CREAR PERSONA ---");
        System.out.println("");
        System.out.println("Ingrese la edad (en numeros): ");
        setEdad(leer.nextInt());
        System.out.println("");
        System.out.println("Ingrese el sexo ( H / M / O ): ");
        setSexo(leer.next().toUpperCase().charAt(0));
        //comprueba que el sexo introducido sea correcto, es decir, H, M o O.
        //Si no es correcto se deberá mostrar un mensaje
        do {
            if (sexo!='H' && sexo!='M' && sexo!='O') {
                System.out.println("El sexo introducido es incorrecto. Vuelva a introducirlo.");
                System.out.print("Sexo (H/M/O): ");
                sexo = leer.next().toUpperCase().charAt(0);
            } else {
                setSexo(sexo);
            }
        } while ( sexo!='H' && sexo!='M' && sexo!='O');
        System.out.println("");
        System.out.println("Ingrese el peso (en numeros): ");
        setPeso(leer2.nextDouble());
        System.out.println("");
        System.out.println("Ingrese la altura: ");
        setAltura(leer2.nextDouble());
        
        return persona;
    }
    
    /** Método calcularIMC(): calculara si la persona está en su peso ideal 
    * (peso en kg/(altura^2 en mt2)). Si esta fórmula da por resultado un valor 
    * menor que 20, la función devuelve un -1. Si la fórmula da por resultado 
    * un número entre 20 y 25 (incluidos), significa que el peso está por 
    * debajo de su peso ideal y la función devuelve un 0. Finalmente, si el 
    * resultado de la fórmula es un valor mayor que 25 significa que la 
    * persona tiene sobrepeso, y la función devuelve un 1. Se recomienda hacer 
    * uso de constantes para devolver estos valores.
    */
    public int calcularIMC(Persona persona){
        double pesoIdeal = persona.getPeso() / Math.pow(persona.getAltura(), 2);
        if (pesoIdeal >25) {
            return 1; //Sobrepeso
        }else if(pesoIdeal >=20 && pesoIdeal <=25){
            return 0; //Peso Ideal.
        }else{
            return -1; //Debajo del peso ideal, cuando es menor a 20
        }
    }
    
    /** Método esMayorDeEdad(): indica si la persona es mayor de edad. L
    * a función devuelve un booleano.
    */
    public boolean esMayorDeEdad(Persona persona){
        return (persona.getEdad() > 18);
    }
    
}
