package Ejercicio7Service;

import java.util.Scanner;

public class PersonaService {
    Scanner leer = new Scanner(System.in).useDelimiter("\n");
    
    //Metodo que crea una persona
    public Persona crearPersona(){
        Persona persona = new Persona();
        char sexo;
        System.out.print("Nombre: ");
        persona.setNombre(leer.next());
        System.out.print("Edad: ");
        persona.setEdad(leer.nextInt());
        System.out.print("Sexo (H/M/O): ");
        sexo = leer.next().toUpperCase().charAt(0);
        //Me aseguro que el sexo sea H, M, O
        do {
            if (sexo!='H' && sexo!='M' && sexo!='O') {
                System.out.println("El sexo introducido es incorrecto. Vuelva a introducirlo.");
                System.out.print("Sexo (H/M/O): ");
                sexo = leer.next().toUpperCase().charAt(0);
            } else {
                persona.setSexo(sexo);
            }
         
        } while ( sexo!='H' && sexo!='M' && sexo!='O');
        System.out.print("Peso: ");
        persona.setPeso(leer.nextDouble());
        System.out.print("Altura: ");
        persona.setAltura(leer.nextDouble());
        
        return persona;
        }
    
    //Metodo para calculr el IMC y ver si el peso es: sobrepeso, ideal, bajo
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
    
    //Metodo para calcular si es o no mayor de edad
    public boolean esMayorDeEdad(Persona persona){
        return (persona.getEdad() > 18);
    }
}
