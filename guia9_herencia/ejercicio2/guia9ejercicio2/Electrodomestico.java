package guia9ejercicio2;

import java.util.Scanner;

public class Electrodomestico {   //Crear una superclase llamada Electrodoméstico 
    
    Scanner leer = new Scanner(System.in);
 
    //Atributos que heredan las clases hijas
    //precio, color, consumo energético (letras entre A y F) y peso.
    protected int precio= 1000;
    protected String color;
    protected char consumoEnergetico;
    protected int peso;



    //CONSTRUCTORES
    
    // Un constructor vacío.
    public  Electrodomestico() {
    }
    //Un constructor con todos los atributos pasados por parámetro.
    //no uso el parametro de precio porque ya lo defini como 1000 en el atributo
    public Electrodomestico( String color, char consumoEnergetico, int peso) {
        this.color = color;
        this.consumoEnergetico = consumoEnergetico;
        this.peso = peso;
    }

    //Métodos getters y setters de todos los atributos.
    public int getPrecio() {
        return precio;
    }
    public void setPrecio(int precio) {
        this.precio = precio;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public char getConsumoEnergetico() {
        return consumoEnergetico;
    }

    public void setConsumoEnergetico(char consumoEnergetico) {
        this.consumoEnergetico = consumoEnergetico;
    }

    public int getPeso() {
        return peso;
    }

    public void setPeso(int peso) {
        this.peso = peso;
    }
    

    
    

    //toString
    @Override
    public String toString() {
        return  " precio inicial = " + precio + ", color = " + color + 
                ", consumoEnergetico = " + consumoEnergetico + ", peso = " + peso;
    }
    
    /*
    Método comprobarConsumoEnergetico(char letra): comprueba que la letra
    es correcta, sino no es correcta usara la letra F por defecto. 
    Este método se debe invocar al crear el objeto y no será visible.
    */
    private void comprobarConsumoEnergetico(char letra) {
            
       if (letra!= 'A' && letra !='B' && letra !='C' && letra !='D' && 
               letra !='E' && letra !='F')  {
          setConsumoEnergetico('F');
    }
 

    /*
     Método comprobarColor(String color): comprueba que el color es correcto, y
    si no lo es, usa el color blanco por defecto. Los colores disponibles para 
    los electrodomésticos son blanco, negro, rojo, azul y gris. No importa si 
    el nombre está en mayúsculas o en minúsculas. Este método se invocará al 
    crear el objeto y no será visible.
    */
       
     public void comprobarColor(String color) {
        //paso a minuscula ais no importa si escribe en mayuscula o minuscula
        color = color.toLowerCase();
        if (!color.equals("rojo") && (!color.equals("azul")) && 
                (!color.equals("blanco")) && (!color.equals("negro")) && 
                (!color.equals("gris"))) {
            setColor("Blanco");
        } else {
            this.color = color;
        }
    }
   
    

    /*
    Metodo crearElectrodomestico(): le pide la información al usuario y llena el
    electrodoméstico, también llama los métodos para comprobar el color y el
    consumo. Al precio se le da un valor base de $1000.
    */
    public void crearElectrodomestico() {
        
        System.out.println("Ingresa un color ( blanco / negro / rojo / azul / gris): ");
        comprobarColor(leer.next());
        
        System.out.println("Ingresa el consumo energetico ( A / B / C / D / E / F): ");
        setConsumoEnergetico(leer.next().charAt(0));
        comprobarConsumoEnergetico(getConsumoEnergetico());
        
        System.out.println("Ingresa el peso: ");
        this.peso = leer.nextInt();
        
        precio = getPrecio();
        
        //System.out.println(this.precio, this.color,this.consumoEnergetico, this.peso));
    }


    /*
    Método precioFinal(): según el consumo energético y su tamaño, aumentará
    el valor del precio. Esta es la lista de precios:
    LETRA/PRECIO: A $ 1000 - B $800 - C $600 - D $500 - E $300 - F $100
    PESO / PRECIO: 1-19 $100 - 20-49 $500 - 50-79 $800 - mayor que 80 $1000
    */
    public int precioFinal() {
 
        
        //precioInicial = 1000;

    //Con un switch evaluo la letra del consumo energetico y sumo el suplemento 
    //por consumo energetico a mi precio Inicial para setear el precio del 
    //electrodomestico, todavia falta el plus acorde al peso
        switch (getConsumoEnergetico()) {
            case 'A':
                setPrecio((getPrecio()) + 1000);
                break;
            case 'B':
                setPrecio((getPrecio()) + 800);
                break;   
            case 'C':
                setPrecio((getPrecio()) + 600);
                break;    
            case 'D':
                setPrecio((getPrecio()) + 500);
                break;    
            case 'E':
                setPrecio((getPrecio()) + 300);
                break; 
            case 'F':
                setPrecio((getPrecio()) + 100);
                break;    
            default:
                throw new AssertionError();
        }
        
        //con if / else anidados voy a ir sumando el suplemento al precio del
        //electrodomestico que depende del peso del mismo
        
        if (getPeso() > 0 && getPeso() < 20) {
            setPrecio((getPrecio() + 100));
        } else {
            if (getPeso() < 50) {
                setPrecio((getPrecio() + 500));
            } else {
                if (getPeso() < 80) {
                    setPrecio((getPrecio() + 800));
                } else {
                    setPrecio((getPrecio() + 1000));
                }
            }
        }
       
        return precio;
        
    }
}
