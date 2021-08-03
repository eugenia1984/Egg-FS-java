package guia9;

public class Gato extends Animal{
      
    public Gato() {
        super();
    }
    public Gato(String nombre, String alimento, int edad, String razaDelAnimal) {
        super(nombre, alimento, edad, razaDelAnimal);
    }
    
//Sobreescribo el metodo alimentarse para que sea particular del Gato y muestre su nombre
    @Override
    public void alimentarse() {
        System.out.println("El gato " + getNombre() + " se alimenta de : " + 
                getAlimento());
    }

}
