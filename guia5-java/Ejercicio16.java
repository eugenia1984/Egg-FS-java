/*
Realizar un programa que simule el funcionamiento de un dispositivo RS232, este
tipo de dispositivo lee cadenas enviadas por el usuario. Las cadenas deben llegar
con un formato fijo: tienen que ser de un máximo de 5 caracteres de largo, el primer
carácter tiene que ser X y el último tiene que ser una O.
Las secuencias leídas que respeten el formato se consideran correctas, la
secuencia especial “&&&&&” marca el final de los envíos (llamémosla FDE), y toda
secuencia distinta de FDE, que no respete el formato se considera incorrecta.
Al finalizar el proceso, se imprime un informe indicando la cantidad de lecturas
correctas e incorrectas recibidas. Para resolver el ejercicio deberá investigar cómo
se utilizan las siguientes funciones de Java Substring(), Length(), equals().
 */
package ejercicio16;

import java.util.Scanner;

public class Ejercicio16 {


    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
    //Declaro mis variables
        String cadena; // es la cadena ingresada por el usuario
        String fde; // es la secuencia especial "&&&&&"
        String primerLetra; //para ver si la primer letra es X
        String ultimaLetra; //Para ver que la ultima letra sea O
        int largo; //para verificar que el largo sea de 5
        int correcta; //para al final mostrar cuantas fueron correctas
        int incorrecta; // para la final mostrar cuantas fueron incorrectas
    //Inicializo mis variables
        correcta=0;
        incorrecta=0;
        cadena = "";
        primerLetra="";
        ultimaLetra="";
        fde = "&&&&&";
    //Con un do while voy a pedir que ingrese una cadena
        do {            
            System.out.print("Ingrese una cadena de 5 caracteres: ");
            cadena = leer.next(); //La leo y asigno a la variable cadena
    //Con .substring() hago el corte en la primer letra y la asigno a la varaible primerLetra
            primerLetra = cadena.substring(0,1);
    //Con .lenght() calculo el largo que tiene y lo asigno a la variable largo
            largo = cadena.length();
    //Con substring() calculo la última letra y la asigno a la variable última letra
            ultimaLetra = cadena.substring(4,5);
    //Con un if else chequeo que tenga el largo de 5 y que empiece con X y termine con O
            if (largo==5 && primerLetra.equals("X") && ultimaLetra.equals("O")) {
    //Si cumple todo esto, es correcta, entonces la voy acumulardo en mi varible correcta para el final decir cuantas son correctas
                correcta++;
            } else {
    //Si no lo cumple lo voy acumulando en mi variable de incorrecta para al final mistrar cuantas incorrectas hay
                incorrecta++;
            }  
        } while (!cadena.equals(fde));  
  
        incorrecta = incorrecta -1; //me conto la cadena "&&&&&", aca se la descuento
        //Muestro cuantas son correctas y cuantas incorrectas
        System.out.println("Las cadena correctas son : " + correcta);
        System.out.println("Las cadena incorrestas son : " + incorrecta);
    }
}
