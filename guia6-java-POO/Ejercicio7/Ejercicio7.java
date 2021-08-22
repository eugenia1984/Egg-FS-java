/*
En la clase main hacer lo siguiente:
Crear 4 objetos de tipo Persona con distintos valores, a continuación, 
llamaremos todos los métodos para cada objeto, deberá comprobar si la persona 
está en su peso ideal, tiene sobrepeso o está por debajo de su peso ideal e 
indicar para cada objeto si la persona es mayor de edad.
Por último, guardaremos los resultados de los métodos calcularIMC y 
esMayorDeEdad en distintas variables, para después en el main, calcular un 
porcentaje de esas 4 personas cuantas están por debajo de su peso, cuantas en 
su peso ideal y cuantos, por encima, y también calcularemos un porcentaje de 
cuantos son mayores de edad y cuantos menores.
 */
package Ejercicio7;


public class Ejercicio7 {


    public static void main(String[] args) {
        //Crear 4 objetos de tipo Persona con distintos valores
        Persona persona = new Persona();
        Persona[] vectorPersonas = new Persona[4]; //vector de objetos
        int mayorEdad,menorEdad,pesoBajo,pesoIdeal,sobrePeso;
        mayorEdad=0;
        menorEdad=0;
        pesoBajo=0;
        pesoIdeal=0;
        sobrePeso=0;
        
        for (int i = 0; i < vectorPersonas.length; i++) {
            vectorPersonas[i] = persona.crearPersona();
            //Voy acumulando los meyores y menores de edad
            if (persona.esMayorDeEdad(vectorPersonas[i])) {
                System.out.println("Es mayor de edad.");
                mayorEdad++;
            } else {
                System.out.println("Es menor de edad.");
                menorEdad++;
            }
            //Voy acumulando peso ideal, bajo,sobrepeeso
            switch (persona.calcularIMC(vectorPersonas[i])) {
                case 0:
                    System.out.println("Peso ideal.");
                    pesoIdeal++;
                    break;
                case -1:
                    System.out.println("Bajo Peso.");
                    pesoBajo++;;
                    break;
                case 1:
                    System.out.println("Sobrepeso.");
                    sobrePeso++;
                    break;
            }
            System.out.println("");
        }
        
        System.out.println("La cantidad de personas con sobrepeso es: "+ sobrePeso);
        System.out.println("La cantidad de personas con bajo peso es: "+ pesoBajo);
        System.out.println("La cantidad de personas con peso ideal es: "+ pesoIdeal);
        System.out.println("La cantidad de personas mayores de edad es: "+ mayorEdad);
        System.out.println("La cantidad de personas menores de edad es: "+ menorEdad);
    }
    
}
