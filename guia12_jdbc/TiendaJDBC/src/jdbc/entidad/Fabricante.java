package jdbc.entidad;

public class Fabricante {

    //Atributos
    private Integer codigo;
    private String nombre;

    //Constructores
    public Fabricante() {
    }

    public Fabricante(Integer codigo, String nombre) {
        this.codigo = codigo;
        this.nombre = nombre;
    }

    //Getters & Setters
    public Integer getCodigo() {
        return codigo;
    }

    public void setCodigo(Integer codigo) {
        this.codigo = codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    //toString
    @Override
    public String toString() {
        return "Fabricante{" + "codigo = " + codigo + ", nombre = " + nombre + '}';
    }
    
    
}
