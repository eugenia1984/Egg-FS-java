/*
Primero creo mi CLASE MAIN

CLASE -> 
-una de las unidades básicas y + importantes de Java como lenguaje de POO
-dentro se colocan datos y código del programa que vamos a codificar, uue nos 
permite implementar lo que queremos hacer
-la forma escencial en la cuál el lenguaje nos permite organizar nuestro código

JAVA MAIN CLASS ->
-identificamos que es una CLASE JAVA que va a tener el METODO MAIN (permite ejecutar el programa)

.java -> la extensión que tienen los programas de tipo Java

Al crear el PROYECTO se crea el PAQUETE.
PAQUETE -> nos permite organizar los programas Java y empaquetar muchos 
           programas con un mismo fin. Organizan los conjuntos de clases y nos
           asisten para poder compartir el código (IMPORT)

IMPORT -> impora la CLASE SCANNEr del paquete java.util, son IMPORT puedeo 
          importar la clase que necesite (importamos código que está en otro lado)
  
public class PrimerPrograma -> 
-palabra reservada CLASS con la cual nombramos a las clases 
-PrimerPrograma  es el nombre de la clase

public static void main (String[] args)->
-subprograma llamado MAIN, el 1er subprograma que se llama cuando invoco un 
programa Java
-public static void -> son un conjunto de modificadores
-recibe por parametro un VECTOR de STRING(cadena de caracteres)

METODO -> es igual a una FUNCIÖN o un PROCEDIMIENTO, sólo que es la manera de 
          nombrar a los suprogramas que se codifican dentro de una clase.
          Los métodos se codifican DENTRO DE LAS CLASES

{} -> en java los bloques de código se delimitan con llaves

; -> en Java todas las líneas de instrucción terminan con ;

SCANNER -> es una CLASE que escribieron los proveedores de Java que emula el
           comportamiento de la función LEER en Pseint. Lo vamos a utilizar para
           leer datos por teclado ungresados por el usuario
           Importo la CLASE SCANNER y creo la variable LEER :
            -para crearla hay que DECLARAR de qué TIPO es
            -declarar nombre de la variable
            -asignamos la variable a un nuevo objeto
-leer.nextln() se invoca el método next() de la variable(objeto) leer



SYETEM:IN -> identifica que el ingreso se hará por teclado
SYSTEM.OUT -> identifica salida por pantalla

PRINTLN -> print next line (print + salto de linea)

STRING -> conjunto de caracteres, van entre " "

// -> es un comentario en línea

Los comentarios multilinea con como este empiezan con /* y 
terminan con asterico/ (igual que en CSS)

IDE -> Entorno Integrado de Desarrollo
       realiza la COMPILACION del programa Java

JAVA -> precisa de una precompilación antes de ejecutar el programa es por eso
        que demora un tiempo en iniciar la ejecución

VRIABLE -> -1ro: tipo de dato
           -2do: nombre

*/
package primerPrograma;

import java.util.Scanner;


public class PrimerPrograma {


    public static void main(String[] args) {
        
        //Se crea una variable Scanner que se utiliza para leer datos del usuario
        Scanner leer = new Scanner(System.in);
        
        //Se crea una variable de tipo String que se utiliza para ller datos
        String nombre;
        
        //Muestra un mensaje por pantalla
        System.out.println("Ingresa tu nombre: ");
        
        //Leemos el nombre de la persona en la variable nombre
        nombre = leer.next();
        
        //Mostramos pr consola un saludo personalizado
        System.out.println("Hola Mundo! Soy " + nombre + " y estoy programando en Java!");
       
    }
    
}
