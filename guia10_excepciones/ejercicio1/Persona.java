
package ejercicio1;


public class Persona {
    //Atributos
    private String nombre;
    private int edad;
    private char sexo;
    private float peso;
    private float altura;
    
    //Si declaro estas constantes como PRIVATE no las voy a poder ver desde 
    //PersonaService, por eso las declaro como STATIC y son CONSTANTES ppor FINAL
    static final int IMC_BAJOPESO = -1;
    static final int IMC_PESOIDEAL = 0;
    static final int IMC_SOBREPESO = 1;
    
    //constructor vacio
    public Persona() {
    }

    //constructor con parametros
    public Persona(String nombre, int edad, char sexo, float peso, float altura) {
        this.nombre = nombre;
        this.edad = edad;
        this.sexo = sexo;
        this.peso = peso;
        this.altura = altura;
    }

    //getters y setters
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public char getSexo() {
        return sexo;
    }

    public void setSexo(char sexo) {
        this.sexo = sexo;
    }

    public float getPeso() {
        return peso;
    }

    public void setPeso(float peso) {
        this.peso = peso;
    }

    public float getAltura() {
        return altura;
    }

    public void setAltura(float altura) {
        this.altura = altura;
    }

    
}
