package ejercicio12;

import java.util.Scanner;


public class Ejercicio12 {


    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        
        PersonaService personaService = new PersonaService();
        Persona persona = new Persona();
        
        personaService.crearPersona(persona);
        
        System.out.println("Edad de "+ persona.getNombre()+": "+
                personaService.calcularEdad(persona)+" años.");
        
        System.out.print("Ingrese una edad: ");
        System.out.println("¿"+ persona.getNombre() +" es menor que la edad ingresada? "+ personaService.menorQue(persona, leer.nextInt())+"\n");
        
        personaService.mostrarPersona(persona);
    }
    
}
