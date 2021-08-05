package guia9ejercicio2;

public class Televisor extends Electrodomestico{  //subclase llamada Televisor

    // ATRIBUTOS: resolución (en pulgadas) y sintonizador TDT (booleano), 
    //además de los atributos heredados.
    //Atributos propios del televisor
    private double resolucion;
    private boolean sintonizadorTdt;

    //constructores
    
    //constructor vacío
    public Televisor() {
        super();
    }
    // Un constructor con la resolución, sintonizador TDT y el resto de atributos
    //heredados. Recuerda que debes llamar al constructor de la clase padre.
    public Televisor(int resolucion, boolean sintonizadorTdt, int precio, String color, char consumoEnergetico, int peso) {
        super(precio, color, consumoEnergetico, peso);
        this.resolucion = resolucion;
        this.sintonizadorTdt = sintonizadorTdt;
    }

    //Método get y set de los atributos resolución y sintonizador TDT.
    public double getResolucion() {
        return resolucion;
    }

    public void setResolucion(double resolucion) {
        this.resolucion = resolucion;
    }

    public boolean getSintonizadorTdt() {
        return sintonizadorTdt;
    }

    public void setSintonizadorTdt(boolean sintonizadorTdt) {
        this.sintonizadorTdt = sintonizadorTdt;
    }
    
    //toString

    @Override
    public String toString() {
        return "Televisor => " + super.toString()  +  "resolucion=" + resolucion +
                ", sintonizadorTdt=" + sintonizadorTdt;
    }
    

    /*
    Método crearTelevisor(): este método llama a crearElectrodomestico() de la
    clase padre, lo utilizamos para llenar los atributos heredados del padre y
    después llenamos los atributos del televisor.
    */
    public void crearTelevisor() {
        System.out.println("--- Vamos a crear un televisor ---");
        //uso el constructor de la clase padre/madre
        super.crearElectrodomestico();
        
        //Pido la resolucion y la seteo
        System.out.println("Ingrese cantidad de pulgadas: ");
        setResolucion(leer.nextInt());
        
        //creo una variable para guardar si tiene o no sintonizador
        //para luego setear mi varaible SintonizadorTdt
        char sintonizador;
        System.out.println("¿Tiene sintonizador ( S / N )?");
        //asigno a mi variable sintonizador la respuesta
        sintonizador = leer.next().charAt(0);
        //Si sintonizador es S entonces setteo mi SintonizadorTdt a true sino false
        if (sintonizador == 'S' || sintonizador == 's') {
            setSintonizadorTdt(true);
        } else {
            setSintonizadorTdt(false);
        } 
        
    }
        
    

    /*
     Método precioFinal(): este método será heredado y se le sumará la siguiente
    funcionalidad. Si el televisor tiene una resolución mayor de 40 pulgadas, se
    incrementará el precio un 30% y si tiene un sintonizador TDT incorporado,
    aumentará $500. Recuerda que las condiciones que hemos visto en la clase
    Electrodomestico también deben afectar al precio.*/

    
    @Override
    public int precioFinal() {
        
        super.precioFinal();
       
        //con if  sumo al precio el adicional por las pulgadas
        if (resolucion > 40) {
            setPrecio((int) (getPrecio() *0.30));
            
        } 
        //con if sumo al precio el adicional por el sintonizador
        if (sintonizadorTdt) {
            setPrecio(getPrecio() + 500 ) ;
        }

        return precio;
    }
}
