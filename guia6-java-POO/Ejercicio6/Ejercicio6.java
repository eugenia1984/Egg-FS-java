package Ejercicio6;

import java.util.Scanner;

public class Ejercicio6 {
    
    static Scanner leer = new Scanner(System.in);

    public static void main(String[] args) {
        
        Cafetera cafetera1 = new Cafetera();
        
        CafeteraService hacerCafe = new CafeteraService();
        
        int opcion = 0; //Creo esta variable para que sea la opcion
        
        do {      
            opcion = menu( opcion);
            segunOpcion(hacerCafe, cafetera1, opcion);  
        } while (opcion != 5 ); 
    }
    
    // Todos los subprocesos
    
    public static int menu(int opcion) {
     
        System.out.println(" ");
        System.out.println(" ---- Cafetera EGG Menu ----");
        System.out.println(" ");
        System.out.println(" 1 - Llenar Cafetera");
        System.out.println(" 2 - Vaciar Cafetera");
        System.out.println(" 3 - Agregar Cafe ");
        System.out.println(" 4- Servir Cafe ");
        System.out.println(" 5 - Quit ");
        System.out.println(" ");
        System.out.println(" Seleccione una opcion: ");
        opcion = leer.nextInt();
        
        opcion = verificarOpcion(opcion);
        
        return opcion;
    
    }
    
    public static int verificarOpcion(int opcion) {
    
        while(opcion>5 || opcion <1) {
        
            System.out.println("Error, opcion inválida, ingrese la opción correcta:  ");
            opcion = leer.nextInt();
        }
        return opcion;
    }
    
    public static void segunOpcion( CafeteraService hacerCafe, Cafetera cafetera1, int opcion) {
    
        int cantidadAgregada;
        int tamanoTaza;
        
        switch (opcion) {
            case 1:
                hacerCafe.llenarCafetera(cafetera1);
                break;
            case 2:
                hacerCafe.vaciarCafetera(cafetera1);
                break;
            case 3:
                System.out.println("Ingrese la cantidad de cafe que quiere agregar ");
                cantidadAgregada = leer.nextInt();
                
                hacerCafe.agregarCafe(cafetera1, cantidadAgregada);
                break;
            case 4:
                System.out.println("Indique el tamaño de la taza");
                tamanoTaza = leer.nextInt();
                
                hacerCafe.servirTaza(cafetera1, tamanoTaza);
                break;
            case 5:
                System.out.println("Gracias por usar Café EGG");
                break;
           
        }
    }
}
