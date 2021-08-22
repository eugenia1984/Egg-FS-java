/*
 * Deberá además implementar los siguientes métodos:
 * -Método devolverMayor() para retornar cuál de los dos atributos tiene el mayor valor
 * -Método calcularPotencia() para calcular la potencia del mayor valor de la clase
 * elevado al menor número. Previamente se deben redondear ambos valores.
 * -Método calculaRaiz(), para calcular la raíz cuadrada del menor de los dos valores.
 * Antes de calcular la raíz cuadrada se debe obtener el valor absoluto del número.
 */
package Ejercicio9;

public class MatematicaService {
    
    //Método devolverMayor() para retornar cuál de los dos atributos tiene el mayor valor
    public double devolverMayor(Matematicas m) {
        return Math.max(m.getNumero1(), m.getNumero2());
    }
    
    //Método calcularPotencia() para calcular la potencia del mayor valor de la clase
    //elevado al menor número. Previamente se deben redondear ambos valores.
    public double calcularPotencia(Matematicas m) {
        //creo dos variables para guardar el mayor y el menor de ambos numeros
        double mayor, menor;
        //Con Math.roud redondeo
        //Con Math.max obtengo el maximo entre los dos
        //con Math.min obtengo el minimo entre los dos
        mayor = Math.round(Math.max(m.getNumero1(), m.getNumero2()));
        menor = Math.round(Math.min(m.getNumero1(), m.getNumero2()));
        //Devuelvo la potencia del mayor elevado al menor
        return Math.pow(mayor, menor);
    }
    
    //Método calculaRaiz(), para calcular la raíz cuadrada del menor de los dos 
    //valores.  Antes de calcular la raíz cuadrada se debe obtener el valor 
    //absoluto del número
     public double calculaRaiz(Matematicas m) {
         //creo la variable minimo para calcular el minimo entre los dos numeros
        double minimo = Math.min(m.getNumero1(), m.getNumero2());
        //Devuelvo la raiz cuadrada a la que antes le calculo el valor absoluto
        return Math.sqrt (Math.abs(minimo));
        
        //Podia hacer todo junto sin guardar en variable
        //return Math.sqrt (Math.abs( Math.min(m.getNumero1(), m.getNumero2()) ));
        
    }
}
