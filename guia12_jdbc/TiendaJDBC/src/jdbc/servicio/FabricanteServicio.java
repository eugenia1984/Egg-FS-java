package jdbc.servicio;

import java.util.ArrayList;
import java.util.List;
import jdbc.entidad.Fabricante;
import jdbc.excepcion.MiExcepcion;
import jdbc.persistencia.FabricanteDAO;

public class FabricanteServicio {

    private FabricanteDAO fabricanteDAO;

    public FabricanteServicio() {
        fabricanteDAO = new FabricanteDAO();
    }

    public void crearFabricante(Integer codigo, String nombre) throws MiExcepcion {
        try {
            if (codigo == null) {
                throw new MiExcepcion("El código es obligatorio");
            }

            if (nombre == null || nombre.trim().isEmpty()) {
                throw new MiExcepcion("El nombre es obligatorio");
            }

            Fabricante fabricante = new Fabricante();

            fabricante.setCodigo(codigo);
            fabricante.setNombre(nombre);

            fabricanteDAO.guardarFabricante(fabricante);
            
        } catch (MiExcepcion e) {
            e.printStackTrace();
            throw e;
        }
    }

    public void imprimirFabricantes() throws MiExcepcion {
        try {
            List<Fabricante> fabricantes = fabricanteDAO.obtenerFabricantes();

            if (fabricantes.isEmpty()) {
                throw new MiExcepcion("No existen fabricantes");
            } else {
                System.out.println("*** LISTA DE FABRICANTES ***");
                System.out.printf("%-15s%-25s\n", "CÓDIGO", "NOMBRE");
                fabricantes.forEach(f -> System.out.printf("%-15s%-25s\n", f.getCodigo(), f.getNombre()));
            }
            
        } catch (MiExcepcion e) {
            e.printStackTrace();
            throw e;
        }
    }
}
