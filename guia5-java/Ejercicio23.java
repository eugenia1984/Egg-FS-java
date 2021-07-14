/*
 Recorrer un vector de N enteros contabilizando cuántos números son de 1 dígito,
cuántos de 2 dígitos, etcétera (hasta 5 dígitos).
 */
package ejercicio23;

import java.util.Scanner;

public class Ejercicio23 {

    public static void main(String[] args) {
        int digitos1=0;
        int digitos2=0;
        int digitos3=0;
        int digitos4=0;
        int digitos5=0;
        Scanner leer = new Scanner(System.in);
        
        System.out.println("Ingrese la cantidad de numeros a ingresar en el vector : ");
        int[] vector = new int[leer.nextInt()];
        
        for(int i=0; i<vector.length; i++){
            System.out.println("Ingrese el número para la posición : " + i);
            vector[i]=leer.nextInt();
            if(Math.abs(vector[i])<10){
                digitos1++;
            }else if(Math.abs(vector[i])<100){
                digitos2++;
            }else if (Math.abs(vector[i])<1000){
                digitos3++;
            }else if(Math.abs(vector[i])<10000){
                digitos4++;
            }else if(Math.abs(vector[i])<100000){
                digitos5++;
            }
        }
        
        System.out.println("Se ingresaron "+digitos1+" números de 1 digito");
        System.out.println("Se ingresaron "+digitos2+" números de 2 digitos");
        System.out.println("Se ingresaron "+digitos3+" números de 3 digitos");
        System.out.println("Se ingresaron "+digitos4+" números de 4 digitos");
        System.out.println("Se ingresaron "+digitos5+" números de 5 digitos");
        
    }
}
    

