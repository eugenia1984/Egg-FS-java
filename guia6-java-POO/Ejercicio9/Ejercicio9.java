/*
 * En el main se creará el objeto y se usará el Math.random para generar los dos 
 * números y se guardaran en el objeto con su respectivos set. 
 */
package Ejercicio9;

public class Ejercicio9 {

    public static void main(String[] args) {
        
        //instancio un objeto de Clase MatematicaService para usar sus metodos
        MatematicaService ms = new MatematicaService();
        //instancio nuevo objeto de Clase Matematicas para usar getters y setters
        Matematicas mat = new Matematicas();
        //con Math.random genero los dos numeros aleatoriamente y los setteo
        mat.setNumero1(Math.random() * 10);
        mat.setNumero2(Math.random() * 10);
        
        System.out.println("Número 1: " + mat.getNumero1());
        System.out.println("Número 2: " + mat.getNumero2());
        System.out.println("Mayor número: " + ms.devolverMayor(mat));
        System.out.println("Potencia del mayor elevado al menor: " + ms.calcularPotencia(mat));
        System.out.println("Raíz cuadrada del menor: " + ms.calculaRaiz(mat));
    }
    
}
