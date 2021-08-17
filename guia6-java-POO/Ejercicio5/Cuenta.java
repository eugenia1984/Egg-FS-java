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

//Realizar una clase llamada Cuenta (bancaria) 
public class Cuenta {
    
    //debe tener como mínimo los atributos: 
    //numeroCuenta (entero), el DNI del cliente (entero largo), el saldo actual
    private int numeroCuenta;
    private long dniCliente;
    private double saldoActual;
    private double interes;
    
    static Scanner leer = new Scanner(System.in);

    //Constructor por defecto y constructor con DNI, saldo, número de cuenta e interés
    public Cuenta() {
    }

    public Cuenta(int numeroCuenta, long dniCliente, double saldoActual, double interes) {
        this.numeroCuenta = numeroCuenta;
        this.dniCliente = dniCliente;
        this.saldoActual = saldoActual;
        this.interes = interes;
    }

    //Agregar los métodos getters y setters correspondientes
    public int getNumeroCuenta() {
        return numeroCuenta;
    }

    public void setNumeroCuenta(int numeroCuenta) {
        this.numeroCuenta = numeroCuenta;
    }

    public long getDniCliente() {
        return dniCliente;
    }

    public void setDniCliente(long dniCliente) {
        this.dniCliente = dniCliente;
    }

    public double getSaldoActual() {
        return saldoActual;
    }

    public void setSaldoActual(double saldoActual) {
        this.saldoActual = saldoActual;
    }

    public double getInteres() {
        return interes;
    }

    public void setInteres(double interes) {
        this.interes = interes;
    }
    
    //Metodo para crear un objeto Cuenta, pidiéndole los datos al usuario.
    public void crearCuenta() {
        System.out.println("-- CREACION DE CUENTA BANCARIA--");

        System.out.println("");
        System.out.println("Ingrese su Nro. de Cuenta: ");
        setNumeroCuenta(leer.nextInt());

        System.out.println("");
        System.out.println("Ingrese su DNI: ");
        setDniCliente(leer.nextLong());
        
        setSaldoActual(0);
        setInteres(0);
        System.out.println("Creación Exitosa!" + "\n");
    }
    
    //Método ingresar(double ingreso): el método recibe una cantidad de dinero a
    //ingresar y se la sumara a saldo actual.
    public void ingresar(double ingreso) {
        double saldoActual = getSaldoActual();
        saldoActual += ingreso;
        setSaldoActual(saldoActual);        
    }
    
    //Método retirar(double retiro): el método recibe una cantidad de dinero a 
    //retirar y se la restará al saldo actual. Si la cuenta no tiene la cantidad 
    //de dinero a retirar, se pondrá el saldo actual en 0.
    public void retirar(double retiro) {
        
        double saldoActual = getSaldoActual();
        
        if (retiro > saldoActual) {
            saldoActual = 0;
        } else {
            saldoActual -= retiro;
        }
        
        setSaldoActual(saldoActual);
    }
    
    
    //Método extraccionRapida(): le permitirá sacar solo un 20% de su saldo. 
    //Validar que el usuario no saque más del 20%.
    public void extraccionRapida() {
        
        double saldoActual = getSaldoActual();
        double extRapida;
        
        System.out.println("--EXTRACCIÓN RÁPIDA--");
        System.out.println("Ingrese el monto a retirar: $ ");
        extRapida = leer.nextDouble();
        
        if ( extRapida < (saldoActual * (20/100)) ) {
            saldoActual -= extRapida;
        } else {
            System.out.println("");
        }
        
    }
    
    // Método consultarSaldo(): permitirá consultar el saldo disponible en la cuenta.
    public void consultarSaldo(){
        System.out.println("El saldo disponible es: $"+ getSaldoActual());
    }
     
    // Método consultarDatos(): permitirá mostrar todos los datos de la cuenta
    public void consultarDatos(Cuenta c) {
        System.out.println("cuenta\t" + c.getNumeroCuenta() + "\nDNI\t" + 
                c.getDniCliente() + "\nsaldo\t" + c.getSaldoActual()); 
    //con \\t indico espaciado 
    // con \\n indico salto de renglon
    }
    
    //toString

    @Override
    public String toString() {
        return "Cuenta{" + "numeroCuenta = " + numeroCuenta + ", dniCliente = " + 
                dniCliente + ", saldoActual = " + saldoActual + ", interes = " + interes + '}';
    }
    
}
