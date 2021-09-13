package jdbc.persistencia;

import java.sql.*;
import jdbc.excepcion.MiExcepcion;

public class DAO {

    protected Connection conexion = null;
    protected Statement sentencia = null;
    protected ResultSet resultado = null;

    private final String USUARIO = "root";
    private final String CLAVE = "rootroot";
    private final String DRIVER = "com.mysql.cj.jdbc.Driver";
    private final String URL = "jdbc:mysql://localhost:3306/tienda?useSSL=false";

    public void conectarBase() throws MiExcepcion {
        try {
            Class.forName(DRIVER);
            conexion = DriverManager.getConnection(URL, USUARIO, CLAVE);
        } catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();
            throw new MiExcepcion("Error al conectarse");
        }
    }

    public void desconectarBase() throws MiExcepcion {
        try {
            if (resultado != null) {
                resultado.close();
            }

            if (sentencia != null) {
                sentencia.close();
            }

            if (conexion != null) {
                conexion.close();
            }
        } catch (SQLException e) {
            e.printStackTrace();
            throw new MiExcepcion("Error al desconectarse");
        }
    }

    public void insertarModificarEliminar(String sql) throws MiExcepcion {
        try {
            conectarBase();
            sentencia = conexion.createStatement();
            sentencia.executeUpdate(sql);
            
        } catch (SQLException e) {
            try {
                conexion.rollback();
            } catch (SQLException ex) {
                e.printStackTrace();
                throw new MiExcepcion("Error al realizar rollback");
            }
            e.printStackTrace();
            throw new MiExcepcion("Error al ejecutar sentencia");
            
        } catch (MiExcepcion e) {
            e.printStackTrace();
            throw e;
            
        } finally {
            desconectarBase();
        }
    }

    public void consultarBase(String sql) throws MiExcepcion {
        try {
            conectarBase();
            sentencia = conexion.createStatement();
            resultado = sentencia.executeQuery(sql);
            
        } catch (SQLException e) {
            e.printStackTrace();
            throw new MiExcepcion("Error al consultar");
            
        } catch (MiExcepcion e) {
            e.printStackTrace();
            throw e;
        }
    }
}
