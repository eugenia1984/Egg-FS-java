/*
A continuación se debe crear una subclase llamada Lavadora, con el atributo
carga, además de los atributos heredados.
Los constructores que se implementarán serán:
• Un constructor vacío.
• Un constructor con la carga y el resto de atributos heredados. Recuerda que
debes llamar al constructor de la clase padre.
Los métodos que se implementara serán:
• Método get y set del atributo carga.
• Método crearLavadora (): este método llama a crearElectrodomestico() de la
clase padre, lo utilizamos para llenar los atributos heredados del padre y
después llenamos el atributo propio de la lavadora.
• Método precioFinal(): este método será heredado y se le sumará la siguiente
funcionalidad. Si tiene una carga mayor de 30 kg, aumentará el precio en $500,
si la carga es menor o igual, no se incrementará el precio. Este método debe
llamar al método padre y añadir el código necesario. Recuerda que las
condiciones que hemos visto en la clase Electrodoméstico también deben
afectar al precio.
*/
package guia9ejercicio2;

public class Lavadora extends Electrodomestico{
    
//una subclase llamada Lavadora, con el atributo carga, además de los atributos heredados.
    private int carga;

    //CONSTRUCTORES
    
    //Un constructor vacío.
    public Lavadora() {
        super();
    }
   // Un constructor con la carga y el resto de atributos heredados. 
   //Recuerda que debes llamar al constructor de la clase padre.
    public Lavadora(int carga, int precio, String color, char consumoEnergetico, int peso) {
        super(precio, color, consumoEnergetico, peso);
        this.carga =carga;
    }

  
    //Método get y set del atributo carga.
    public int getCarga() {
        return carga;
    }

    public void setCarga(int carga) {
        this.carga = carga;
    }

    //toString
    @Override    
    public String toString() {
        return "Lavadora => carga = " + carga + ", " + super.toString() ;
    }

    /*
    Método crearLavadora (): este método llama a crearElectrodomestico() de la
    clase padre, lo utilizamos para llenar los atributos heredados del padre y
    después llenamos el atributo propio de la lavadora.
    */
    public void crearLavadora() {
        System.out.println("--- Vamos a crear la lavadora ---");
        //uso el constructor de la clase padre/madre
        super.crearElectrodomestico();
        //lleno atributo propio de lavadora
        System.out.println("Ingrese la carga de la lavadora : ");
        setCarga(leer.nextInt());
    }

    /*
    Método precioFinal(): este método será heredado y se le sumará la siguiente
    funcionalidad. Si tiene una carga mayor de 30 kg, aumentará el precio en $500,
    si la carga es menor o igual, no se incrementará el precio. Este método debe
    llamar al método padre y añadir el código necesario. Recuerda que las
    condiciones que hemos visto en la clase Electrodoméstico también deben
    afectar al precio.
    */
   
    @Override
    public int precioFinal() {
        super.precioFinal();
        
        if ( getCarga() > 30 ) {
            setPrecio( getPrecio() + 500);
        }
        
        return precio;
    }
    
   
}
