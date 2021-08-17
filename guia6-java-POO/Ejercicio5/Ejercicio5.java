/*
5. Realizar una clase llamada Cuenta (bancaria) que debe tener como mínimo los
atributos: numeroCuenta (entero), el DNI del cliente (entero largo), el saldo actual. Las
operaciones asociadas a dicha clase son:
• Constructor por defecto y constructor con DNI, saldo, número de cuenta e interés.
• Agregar los métodos getters y setters correspondientes
• Metodo para crear un objeto Cuenta, pidiéndole los datos al usuario.
• Método ingresar(double ingreso): el método recibe una cantidad de dinero a
ingresar y se la sumara a saldo actual.
• Método retirar(double retiro): el método recibe una cantidad de dinero a retirar y
se la restará al saldo actual. Si la cuenta no tiene la cantidad de dinero a retirar, se
pondrá el saldo actual en 0.
• Método extraccionRapida(): le permitirá sacar solo un 20% de su saldo. Validar
que el usuario no saque más del 20%.
• Método consultarSaldo(): permitirá consultar el saldo disponible en la cuenta.
• Método consultarDatos(): permitirá mostrar todos los datos de la cuenta
 */
package Ejercicio5;

import java.util.Scanner;

public class Ejercicio5 {


    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        
        Cuenta cta = new Cuenta();
        
        cta.crearCuenta();
        
        System.out.println("--DEPOSITO BANCARIO--");
        System.out.println("Saldo Actual: $ " + cta.getSaldoActual());
        System.out.println("Ingrese un monto a depositar: $ ");
        cta.ingresar(leer.nextDouble());
        System.out.println("Saldo Nuevo: $ " + cta.getSaldoActual());
        
        System.out.println("");
        
        System.out.println("--RETIRO BANCARIO--");
        System.out.println("Saldo Actual: $ " + cta.getSaldoActual());
        System.out.println("Ingrese un monto a retirar: $ ");
        cta.retirar(leer.nextDouble());
        
        if (cta.getSaldoActual() == 0) {
            System.out.println("Sus fondos fueron insuficientes. Se reestableció su saldo a $0.");
        }
        System.out.println("Saldo Nuevo: $ " + cta.getSaldoActual());        
        
        System.out.println("-----Su cuenta en su estado actual -----");
        System.out.println(cta.toString());
        
        
    }    
 }
    

