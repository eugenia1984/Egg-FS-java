package guia9;

public class Animal {

    //Atributos
    private String nombre;
    private String alimento;
    private int edad;
    private String razaDelAnimal;
    
    //Constructores
    public Animal() {
    }

    public Animal(String nombre, String alimento, int edad, String razaDelAnimal) {
        this.nombre = nombre;
        this.alimento = alimento;
        this.edad = edad;
        this.razaDelAnimal = razaDelAnimal;
    }
    
    
    //Getters y Setters
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getAlimento() {
        return alimento;
    }

    public void setAlimento(String alimento) {
        this.alimento = alimento;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getRazaDelAnimal() {
        return razaDelAnimal;
    }

    public void setRazaDelAnimal(String razaDelAnimal) {
        this.razaDelAnimal = razaDelAnimal;
    }
    

    //Metodo alimentarse general para cualquier animal
    public void alimentarse() {
        System.out.println("Me alimento : " + alimento);
    }
    
    //toString
    @Override
    public String toString() {
        return "Animal{" + "nombre = " + nombre + ", alimento = " + alimento +
                ", edad = " + edad + ", raza del Animal = " + razaDelAnimal + '}';
    }

    
    
}
