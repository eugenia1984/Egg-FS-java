package mascotapp.entidades;


public class Mascota {
    //Atributos
    //si no los inicializo tiene sus valore por defecto
    //int => 0
    //String => null
    private String nombre;
    private String apodo;
    private String tipo; //Conejo, Gato, Perro, Loro, Carpincho
    private String color;
    private int edad;
    private boolean cola;
    private String raza;
    
    private int energia;
    
    //Constructor vacío
    public Mascota() {
        energia = 1000;
    }
    
    //Constructor con atributos de parametros
    public Mascota(String nombre, String apodo, String tipo, String color, int edad, boolean cola, String raza) {
        //Tomo lo que llega por el parametro y se lo asigno 
        //this.atributo hace referencia al atributo de mi clase
        this.nombre = nombre;
        this.apodo = apodo;
        
        if ( tipo.equals("Perro") || 
                tipo.equals("Gato") || 
                tipo.equals("Loro") ||
                tipo.equals("Carpincho") ){
            this.tipo = tipo;
        }
        
        this.color = color;
        this.edad = edad;
        this.cola = cola;
        this.raza = raza;
        this.energia = 1000;
    }

    public Mascota(String nombre, String apodo, String tipo) {
        this.nombre = nombre;
        this.apodo = apodo;
        this.tipo = tipo;
        this.energia = 1000;
    }
   
    
    //ENCAPSULAMIENTO -> la clase tiene sus atributos de PRIVATE
    //Con SET puedo modificar el atributo
    //con GET puedo obtener el atributo, me los trae
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApodo() {
        return apodo;
    }

    public void setApodo(String apodo) {
        this.apodo = apodo;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public boolean isCola() {
        return cola;
    }

    public void setCola(boolean cola) {
        this.cola = cola;
    }

    public String getRaza() {
        return raza;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }
    
    /**
     * Funcion destina a pasear
     * @param energiaRestar
     * @return energia
     */
    public int pasear(int energiaRestar){
        
        energia -= energiaRestar;  //energia = energia - energiaRestar;
        
        return energia;
    }
//SOBRECARGA -> tengo dos metodos con mismo nombre que reciben distinto parametros
    /**
     * Funcion destinada a pasear que resta energia acorde a las vueltas
     * @param energiaRestar
     * @param vueltas
     * @return energia
     */
    public int pasear(int energiaRestar, int vueltas){
        
        for (int i = 0; i < vueltas; i++) {
            energia -= energiaRestar; 
        }

        return energia;
    }
    
    //toString
    @Override
    public String toString() {
        return "Mascota{" + "nombre = " + nombre + ", apodo = " + apodo +
                ", tipo = " + tipo + ", color = " + color + ", edad = " + 
                edad + ", cola = " + cola + ", raza = " + raza + ", energia = " +
                energia + '}';
    }
    
}
