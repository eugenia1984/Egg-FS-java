package jdbc.persistencia;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import jdbc.entidad.Fabricante;
import jdbc.excepcion.MiExcepcion;

public class FabricanteDAO extends DAO {

    public void guardarFabricante(Fabricante fabricante) throws MiExcepcion {
        try {
            if (fabricante == null) {
                throw new MiExcepcion("Fabricante inválido");
            }

            String plantilla = "INSERT INTO fabricante(codigo, nombre) VALUES(%d, '%s');";
            String sql = String.format(plantilla, fabricante.getCodigo(), fabricante.getNombre());

            insertarModificarEliminar(sql);
            
        } catch (MiExcepcion e) {
            System.out.println(e.getMessage());
            throw new MiExcepcion("Error al guardar fabricante");
        }
    }

    public List<Fabricante> obtenerFabricantes() throws MiExcepcion {
        try {
            String sql = "SELECT * FROM fabricante;";

            consultarBase(sql);

            List<Fabricante> fabricantes = new ArrayList<>();
            Fabricante fabricante = null;

            while (resultado.next()) {
                fabricante = new Fabricante();
                //a diferencia de los array empiezo en 1, no en 0
                fabricante.setCodigo(resultado.getInt(1)); //es el codigo
                fabricante.setNombre(resultado.getString(2)); //es el nombre

                fabricantes.add(fabricante);
            }

            return fabricantes;
            
        } catch (SQLException e) {
            e.printStackTrace();
            throw new MiExcepcion("Error al obtener fabricantes");
            
        } catch (MiExcepcion e) {
            e.printStackTrace();
            throw e;
            
        } finally {
            desconectarBase();
        }
    }
}
