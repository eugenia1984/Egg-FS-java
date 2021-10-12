/*
 * Voy a tener los metodos para validar con RegEx
 */
package utils;

public class Utils {
    
    public static  boolean validarNumero(String numeroAValidar){
        //Valido que solo tenga numeros, y sean entre 7 y 8
        return numeroAValidar.matches("^[0-9]{7}$");
    }
    
    public static boolean validarNombre(String nombre){
        //que la primer letra sea mayuscula [A-Z](1)
        //y al menos tenga una minuscula [a-z]+
        //que puede tener más de una palabra (0 o varios)-> tiene espacio [ ]*
        //que se una o dos palabras -> (1,2)
        return nombre.matches("^([A-Z](1)[a-z]+[ ]*)(1,2)$");
    }
    
}
