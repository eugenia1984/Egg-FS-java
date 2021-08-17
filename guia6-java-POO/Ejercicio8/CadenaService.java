
package Ejercicio8;

import java.util.Scanner;


public class CadenaService {
    
    static Scanner leer = new Scanner(System.in).useDelimiter("\n");

    public Cadena ingresarCadena() {
        Cadena cad = new Cadena();
        System.out.println("Ingrese una frase: ");
        String cadena = leer.next();
        cad.setFrase(cadena);
        cad.setLongitud(cadena.length());
        return cad;
    }
    
    // Método mostrarVocales(), deberá contabilizar la cantidad de vocales que 
    //tiene la frase ingresada.
    public int mostrarVocales(Cadena cad) {
        int vocales = 0;
        for (int i = 0; i < cad.getLongitud(); i++) {
            
            char letra = cad.getFrase().charAt(i);
            if (letra == 'A' || letra == 'E' || letra == 'I' || letra == 'O' || letra == 'U' || letra == 'a' || letra == 'e' || letra == 'i' || letra == 'o' || letra == 'u') {
                vocales++;
            }
        }
        return vocales;
    }
    
    // Método invertirFrase(), deberá invertir la frase ingresada y mostrar la frase invertida
    //por pantalla. Por ejemplo: Entrada: "casa blanca", Salida: "acnalb asac".
     public void invertirFrase(Cadena cad) {
        String fraseInvertida = "";
        for (int i = cad.getLongitud(); i > 0; i--) {
            
            fraseInvertida += cad.getFrase().substring(i - 1, i);
        }
        System.out.println("La frase invertida es " + fraseInvertida);
    }
    
    
    public int vecesRepetido(Cadena cad, String letra) {
        int cont = 0;

        for (int i = 0; i < cad.getLongitud(); i++) {
            if (letra.equals(cad.getFrase().substring(i, i + 1))) {
                cont++;
            }
        }
        return cont;

    }

    //Método compararLongitud(String frase), deberá comparar la longitud de la frase
    //que compone la clase con otra nueva frase ingresada por el usuario.
    public void compararLongitud(Cadena cad, String frase) {

        if (frase.length() == cad.getLongitud()) {
            System.out.println("La segunda frase tiene la misma longitud que la primera.");
        } else if (frase.length() > cad.getLongitud()) {
            System.out.println("La segunda frase es más larga que la primera.");
        } else {
            System.out.println("La segunda frase es más corta que la primera.");
        }

    }

    //Método unirFrases(String frase), deberá unir la frase contenida en la clase Cadena
    //con una nueva frase ingresada por el usuario y mostrar la frase resultante.
    public void unirFrases(Cadena cad, String frase) {
        System.out.println("Frase resultante luego de la unión: " + 
                cad.getFrase() + " " + frase);
    }

    //Método reemplazar(String letra), deberá reemplazar todas las letras “a” que se
    //encuentren en la frase, por algún otro carácter seleccionado por el usuario y
    //mostrar la frase resultante.
    public void reemplazar(Cadena cad, String letra) {
        System.out.println("Frase resultante luego de reemplazar las a: " + 
                cad.getFrase().replaceAll("a", letra));
    }

    //Método contiene(String letra), deberá comprobar si la frase contiene una letra que
    //ingresa el usuario y devuelve verdadero si la contiene y falso si no.
    public boolean contiene(Cadena cad, String letra) {
        return cad.getFrase().contains(letra);
    }
    
}
