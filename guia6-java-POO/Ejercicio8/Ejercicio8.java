/*
En el main se creará el objeto y se le pedirá al usuario que ingrese
una frase que puede ser una palabra o varias palabras separadas por un espacio en
blanco y a través de los métodos set, se guardará la frase y la longitud de manera
automática según la longitud de la frase ingresada. Deberá además implementar los
siguientes métodos:
• Método invertirFrase(), deberá invertir la frase ingresada y mostrar la frase invertida
por pantalla. Por ejemplo: Entrada: "casa blanca", Salida: "acnalb asac".
• Método vecesRepetido(String letra), deberá recibir por parámetro un carácter
ingresado por el usuario y contabilizar cuántas veces se repite el carácter en la
frase, por ejemplo:
Entrada: frase = "casa blanca". Salida: El carácter 'a' se repite 4 veces.
• Método compararLongitud(String frase), deberá comparar la longitud de la frase
que compone la clase con otra nueva frase ingresada por el usuario.
• Método unirFrases(String frase), deberá unir la frase contenida en la clase Cadena
con una nueva frase ingresada por el usuario y mostrar la frase resultante.
• Método reemplazar(String letra), deberá reemplazar todas las letras “a” que se
encuentren en la frase, por algún otro carácter seleccionado por el usuario y
mostrar la frase resultante.
• Método contiene(String letra), deberá comprobar si la frase contiene una letra que
ingresa el usuario y devuelve verdadero si la contiene y falso si no.
 */
package Ejercicio8;

import java.util.Scanner;

public class Ejercicio8 {


    public static void main(String[] args) {
        
        Scanner leer = new Scanner(System.in);
        //Instancio una cs de la clase CadenaService
        CadenaService cs = new CadenaService();
        
        //declaro mis variables
        Cadena c;
        int cant;
        String letra = "e", letra2 = "c";

        c = cs.ingresarCadena();
        System.out.println("La cantidad de vocales que tiene la frase ingresada es " + cs.mostrarVocales(c));
        cs.invertirFrase(c);
        cant = cs.vecesRepetido(c, letra);
        System.out.println("El caracter " + letra + " se repite " + cant + " veces.");
        
        System.out.println("Ingrese otra frase: ");
        String frase = leer.next();
        cs.compararLongitud(c, frase);
        cs.unirFrases(c, frase);
        cs.reemplazar(c, "e"); //reemplazo las "a" por "e"
        
        if (cs.contiene(c, letra2)) {
            System.out.println("La frase contiene la letra " + letra2);
        } else {
            System.out.println("La frase no contiene la letra " + letra2);
        }
                
    }
    
}
