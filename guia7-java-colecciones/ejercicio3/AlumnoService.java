package ejercicio3;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class AlumnoService {
    Scanner s = new Scanner(System.in).useDelimiter("\n");
    
    public ArrayList<Alumno> crearColegio() {
        char sn;
        ArrayList<Alumno> colegio = new ArrayList();
        
        do {
            ArrayList<Double> notas = new ArrayList(); //ArrayList de Double (lista de notas)
            Alumno alu = new Alumno(); //Objeto de tipo Alumno para poder agregar al ArrayList de Alumno
            System.out.print("Ingrese el nombre del alumno: ");
            alu.setNombre(s.next().toUpperCase()); //Seteo el nombre
            
            for (int i = 0; i < 3; i++) { //Se repite 3 veces
                System.out.print("Ingrese la nota " + (i+1) + ": ");
                notas.add(s.nextDouble()); //Agrego la nota al ArrayList de Integer
            }
            
            alu.setNotas(notas); //Agrego el ArrayList de notas en el ArrayList de notas del objeto de tipo Alumno
            
            colegio.add(alu); //Agrego el objeto de tipo Alumno al ArrayList de Alumno
            
            System.out.print("Quiere agregar otro alumno? (s/n): ");
            sn = s.next().toLowerCase().charAt(0);
        } while (sn != 'n');
        
        //Descomentar para testear con esta carga de datos inicial
        /*
        colegio.add(new Alumno("Juan", new ArrayList(Arrays.asList(1,2,3))));
        colegio.add(new Alumno("María", new ArrayList(Arrays.asList(4,5,6))));
        colegio.add(new Alumno("Santiago", new ArrayList(Arrays.asList(7,8,9))));
        colegio.add(new Alumno("Romina", new ArrayList(Arrays.asList(10,9,8))));
        colegio.add(new Alumno("Pablo", new ArrayList(Arrays.asList(7,6,5))));
        colegio.add(new Alumno("Melina", new ArrayList(Arrays.asList(4,3,2))));
        */
        
        return colegio; //Devuelvo un ArrayList<Alumno>
    }
    
    public void listarAlumnos(ArrayList<Alumno> colegio) {
        System.out.println("\nLista de alumnos:");
        
        for (Alumno alumno : colegio) { //Por cada alumno en el ArrayList alumnos
            System.out.print("Nombre: " + alumno.getNombre() + " / Notas: ");
            
            //Imprime las notas
            for (int i = 0; i < alumno.getNotas().size(); i++) { //Cantidad de notas en el ArrayList notas (atributo de la clase Alumno)
                System.out.print(alumno.getNotas().get(i) + ", ");
            }
            System.out.println("");
        }
    }
    
    public void buscarNotaFinal(ArrayList<Alumno> colegio) {
        double suma = 0;
        
        System.out.print("\nIngrese el nombre de un alumno: ");
        String buscar = s.next().toUpperCase();
        
        for (Alumno alumno : colegio) {
            if (alumno.getNombre().equals(buscar)) { //Si el nombre del alumno es igual al que busqué
                for (Double nota : alumno.getNotas()) {
                    suma += nota;
                }
                System.out.print("\nPromedio de " + alumno.getNombre() + ": " + (suma / alumno.getNotas().size())); //Muestro el nombre y el promedio
                break; //Salgo del bucle para que no siga buscando
            }
        }
        System.out.println("");
    }
    
}
