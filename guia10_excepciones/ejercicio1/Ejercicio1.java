/*
 * Inicializar un objeto de la clase Persona ejercicio 7 de la guía POO, a 
 * null y tratar de invocar el método esMayorDeEdad() a través de ese objeto. 
 * Luego, englobe el código con una cláusula try-catch para probar la nueva 
 * excepción que debe ser controlada.
 */
package ejercicio1;


public class Ejercicio1 {
    public static void main(String[] args) {
        PersonaService ps = new PersonaService();
        Persona[] p = new Persona[4]; //Array de 4 personas
        
        //Variables para calcular porcentajes al final
        float pesoBajo = 0;
        float pesoIdeal = 0;
        float pesoSobre = 0;
        float edadMayores = 0;
        float edadMenores = 0;
        
        //Bucle para ir cargando las personas con el método crearPersona de PersonaService
        /*
        for (int i = 0; i < p.length; i++) {
            p[i] = ps.crearPersona();
            System.out.println("");
        }
        */
    //No uso el bucle y creo los 4 objetos Persona con su constructor para agilizar la carga.
        p[0] = new Persona("Juan", 18, 'H', 50, 1.60f);
        p[1] = new Persona("Cecilia", 19, 'M', 50, 1.50f);
        p[2] = new Persona("Gustavo", 20, 'O', 160, 1.70f);
        p[3] = new Persona("Romina", 16, 'O', 63, 1.72f);
        
        System.out.println("Datos de las personas:");

        //Recorro el array de personas
        for (int i = 0; i < p.length; i++) {
            System.out.println("Nombre: " + p[i].getNombre());
            
        ///////////////////////////////////////////////////////////
        //COMIENZO EJ 1 - GUÍA 10
            p[0] = null; //Seteo la 1ra persona en null

            try {
                if (ps.esMayorDeEdad(p[i])) {
                    System.out.println("Es mayor de edad.");
                    edadMayores++;
                } else {
                    System.out.println("Es menor de edad.");
                    edadMenores++;
                }
            } catch (NullPointerException e) {
                System.out.println("-> Error: " + e.getMessage() + "\n");
                continue; //Salteo esta persona
            }
            //FIN EJ 1 - GUÍA 10
            ///////////////////////////////////////////////////////////
            
            switch (ps.calcularIMC(p[i])) {
                case Persona.IMC_BAJOPESO:
                    System.out.println("Bajo peso.");
                    pesoBajo++;
                    break;
                case Persona.IMC_PESOIDEAL:
                    System.out.println("Peso ideal.");
                    pesoIdeal++;
                    break;
                case Persona.IMC_SOBREPESO:
                    System.out.println("Sobrepeso.");
                    pesoSobre++;
                    break;
            }

            System.out.println("");

        }
        
        
        System.out.println("Personas con bajo peso: " + (int) pesoBajo + " (" + (int) (pesoBajo * 100 / (pesoBajo + pesoIdeal + pesoSobre)) + "%)");
        System.out.println("Personas con peso ideal: " + (int) pesoIdeal + " (" + (int) (pesoIdeal * 100 / (pesoBajo + pesoIdeal + pesoSobre)) + "%)");
        System.out.println("Personas con sobrepeso: " + (int) pesoSobre + " (" + (int) (pesoSobre * 100 / (pesoBajo + pesoIdeal + pesoSobre)) + "%)");
        System.out.println("Mayores de edad: " + (int) edadMayores + " (" + (int) (edadMayores * 100 / (edadMayores + edadMenores)) + "%)");
        System.out.println("Menores de edad: " + (int) edadMenores + " (" + (int) (edadMenores * 100 / (edadMayores + edadMenores)) + "%)");
    }
    
}
