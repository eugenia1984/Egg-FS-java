/*
Realizar una clase llamada Persona que tenga los siguientes atributos: nombre, edad,
sexo ('H' hombre, 'M' mujer, 'O' otro), peso y altura. Si el alumno desea añadir algún
otro atributo, puede hacerlo. Los métodos que se implementarán son:
• Un constructor por defecto.
• Un constructor con todos los atributos como parámetro.
• Métodos getters y setters de cada atributo.
• Metodo crearPersona(): el método crear persona, le pide los valores de los atributos
al usuario y después se le asignan a sus respectivos atributos para llenar el objeto
Persona. Además, comprueba que el sexo introducido sea correcto, es decir, H, M o
O. Si no es correcto se deberá mostrar un mensaje
• Método calcularIMC(): calculara si la persona está en su peso ideal (peso en
kg/(altura^2 en mt2)). Si esta fórmula da por resultado un valor menor que 20, la
función devuelve un -1. Si la fórmula da por resultado un número entre 20 y 25
(incluidos), significa que el peso está por debajo de su peso ideal y la función
devuelve un 0. Finalmente, si el resultado de la fórmula es un valor mayor que 25
significa que la persona tiene sobrepeso, y la función devuelve un 1. Se recomienda
hacer uso de constantes para devolver estos valores.
• Método esMayorDeEdad(): indica si la persona es mayor de edad. La función
devuelve un booleano.
A continuación, en la clase main hacer lo siguiente:
Crear 4 objetos de tipo Persona con distintos valores, a continuación, llamaremos todos
los métodos para cada objeto, deberá comprobar si la persona está en su peso ideal,
tiene sobrepeso o está por debajo de su peso ideal e indicar para cada objeto si la
persona es mayor de edad.
Por último, guardaremos los resultados de los métodos calcularIMC y esMayorDeEdad
en distintas variables, para después en el main, calcular un porcentaje de esas 4
personas cuantas están por debajo de su peso, cuantas en su peso ideal y cuantos, por
encima, y también calcularemos un porcentaje de cuantos son mayores de edad y
cuantos menores.
 */
package Ejercicio7Service;

public class Main {

    public static void main(String[] args) {
        
        PersonaService personaService = new PersonaService();
        Persona[] vectorP = new Persona[4]; //vector de objetos de personas
        //Declaro mis variables
        int mayorEdad,menorEdad,pesoBajo,pesoIdeal,sobrePeso;
        //inicializo variables
        mayorEdad=0;
        menorEdad=0;
        pesoBajo=0;
        pesoIdeal=0;
        sobrePeso=0;
        //Con un for voy a ir creando a mis 4 personas
        for (int i = 0; i < vectorP.length; i++) {
            vectorP[i] = personaService.crearPersona();
            //Voy acumulando las de mayo / menor edad
            if (personaService.esMayorDeEdad(vectorP[i])) {
                System.out.println("Es mayor de edad.");
                mayorEdad++;
            } else {
                System.out.println("Es menor de edad.");
                menorEdad++;
            }
            //Voy acumulando por IMC
            switch (personaService.calcularIMC(vectorP[i])) {
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
        
        System.out.println("La cantidad de personas con sobrepeso es: "+sobrePeso);
        System.out.println("La cantidad de personas con bajo peso es: "+pesoBajo);
        System.out.println("La cantidad de personas con peso ideal es: "+pesoIdeal);
        System.out.println("La cantidad de personas mayores de edad es: "+mayorEdad);
        System.out.println("La cantidad de personas menores de edad es: "+menorEdad);
    }
       
}
