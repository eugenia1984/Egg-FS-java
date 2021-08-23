
package ejercicio1;

import java.util.Scanner;


public class PersonaService {
    public Persona crearPersona() {
        //Instancio una pe de la clase Persona para usar sus constructores, 
        //getters y setters
        Persona pe = new Persona();
        Scanner s = new Scanner(System.in);
        
        System.out.print("Ingrese el nombre: ");
        pe.setNombre(s.next());
        System.out.print("Ingrese la edad: ");
        pe.setEdad(s.nextByte());
        
        char sexo;
        //Bucle hasta que se ingrese un sexo correcto
        while (true) {
            System.out.print("Ingrese el sexo (H/M/O): ");
            sexo = s.next().toUpperCase().charAt(0);
            if (sexo == 'H' || sexo == 'M' || sexo == 'O') {
                pe.setSexo(sexo);
                break; //El sexo es H, M, O, salgo del bucle
            } else {
                System.out.println("Error: [" + sexo + "] no es un sexo válido.");
            }
        }
        
        System.out.print("Ingrese el peso: ");
        pe.setPeso(s.nextShort());
        System.out.print("Inrese la altura: ");
        pe.setAltura(s.nextFloat());

        return pe;
    }
    
    //Tomo IMC de 20 a 25 como peso ideal.
    public int calcularIMC(Persona p) {
        float imc = (float) (p.getPeso() / Math.pow(p.getAltura(), 2));

        System.out.println("IMC de " + p.getNombre() + ": " + imc);
        
        if (imc < 20) {
            return Persona.IMC_BAJOPESO; //-1
        } else if (imc >= 20 && imc <= 25) {
            return Persona.IMC_PESOIDEAL; //0
        } else {
            return Persona.IMC_SOBREPESO; //1
        }
    }
    
    public boolean esMayorDeEdad(Persona p) {
        return (p.getEdad() >= 18); //Si edad es >= 18 devuelve true, sino false.
    }
}
