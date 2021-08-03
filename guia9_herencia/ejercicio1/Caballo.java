package guia9;

public class Caballo extends Animal{
    
    public Caballo() {
        super();
    }
    
    public Caballo(String nombre, String alimento, int edad, String razaDelAnimal) {
        super(nombre, alimento, edad, razaDelAnimal);
    }

//Sobreescribo el metodo alimentarse para que sea particular del Caballo y nombre
    @Override
    public void alimentarse() {
        System.out.println("El caballo " + getNombre() + " se alimenta de : " + 
                getAlimento());
    }
}
