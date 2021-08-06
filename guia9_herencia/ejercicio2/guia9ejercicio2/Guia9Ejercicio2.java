/*
Finalmente, en el main debemos realizar lo siguiente:
Vamos a crear una Lavadora y un Televisor y llamar a los métodos necesarios
para mostrar el precio final de los dos electrodomésticos.


*/
package guia9ejercicio2;


public class Guia9Ejercicio2 {

    public static void main(String[] args) {
        
        //Creo tambien un electrodomestico, para ver que el crearElectrodomestico
        //y el precioFinal() funcionan
           Electrodomestico electrodomestico1 = new Electrodomestico();
           electrodomestico1.crearElectrodomestico();
           System.out.println(electrodomestico1 + "El precio final es de : " + electrodomestico1.precioFinal());
          
          Lavadora lavadora1 = new Lavadora();
           lavadora1.crearLavadora();
           System.out.println(lavadora1 + "\n El precio final es de : " + lavadora1.precioFinal());

           
           Televisor televisor1 = new Televisor();
           televisor1.crearTelevisor();
           System.out.println(televisor1 + "\n El precio final es de : "+ televisor1.precioFinal());
           
           
          
    }
    
}
