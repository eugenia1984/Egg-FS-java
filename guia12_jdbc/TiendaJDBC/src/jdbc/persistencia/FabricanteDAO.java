package jdbc.persistencia;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import jdbc.entidad.Fabricante;
import jdbc.excepcion.MiExcepcion;

public class FabricanteDAO extends DAO {

    public void saveFabricante(Fabricante fabricante) throws MiExcepcion {
        try {
            if (fabricante == null) {
                throw new MiExcepcion("Fabricante inválido");
            }
            Integer codigoFabricante = fabricante.getCodigo();
            String nombreFabricante = fabricante.getNombre();
            String sql = String.format("INSERT INTO fabricante(codigo, nombre) VALUES(%d, '%s');", codigoFabricante, nombreFabricante);

            insertModifyDelete(sql);
            
        } catch (MiExcepcion e) {
            System.out.println(e.getMessage());
            throw new MiExcepcion("Error al guardar fabricante ->"+e.getMessage());
        }
    }

    public List<Fabricante> getFabricantes() throws MiExcepcion {
        try {
            String sql = "SELECT * FROM fabricante;";

            ConsultDataBase(sql);

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
            throw new MiExcepcion("Error al obtener fabricantes ->"+e.getMessage());
            
        } catch (MiExcepcion e) {
            e.printStackTrace();
            throw e;
            
        } finally {
            desconnectDataBase();
        }
    }
}
