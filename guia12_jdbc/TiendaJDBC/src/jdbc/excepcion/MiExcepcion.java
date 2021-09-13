package jdbc.excepcion;

public class MiExcepcion extends Exception {  
//La excepcion que me creo para customizar los mensajes

    public MiExcepcion() {
        super();  //Llamo al constructor padre
    }

    public MiExcepcion(String mensaje) {
        super(mensaje);
    }
}
