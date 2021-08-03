package guia9;

public class Perro extends Animal {

    public Perro() {
        super();
    }
    public Perro(String nombre, String alimento, int edad, String razaDelAnimal) {
        super(nombre, alimento, edad, razaDelAnimal);
    }
    
//Sobreescribo el metodo alimentarse para que sea particular del Perro 
    @Override
    public void alimentarse() {
        System.out.println("Soy perro y me alimento de : " + getAlimento());
    }
    
}
