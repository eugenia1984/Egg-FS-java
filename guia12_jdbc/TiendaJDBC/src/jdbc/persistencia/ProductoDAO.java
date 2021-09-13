package jdbc.persistencia;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import jdbc.entidad.Producto;
import jdbc.excepcion.MiExcepcion;

public class ProductoDAO extends DAO {

    public void guardarProducto(Producto producto) throws MiExcepcion {
        try {
            if (producto == null) {
                throw new MiExcepcion("El producto es inválido");
            }

            String plantilla = "INSERT INTO producto(codigo, nombre, precio, codigo_fabricante) "
                    + "VALUES(%d, '%s', " + producto.getPrecio() + ", %d)";

            String sql = String.format(plantilla, producto.getCodigo(), producto.getNombre(), producto.getCodigoFabricante());

            insertarModificarEliminar(sql);
            
        } catch (MiExcepcion e) {
            e.printStackTrace();
            System.out.println(e.getMessage());
            throw new MiExcepcion("Error al guardar producto");
        }
    }

    public void modificarProducto(Producto producto) throws MiExcepcion {
        try {
            if (producto == null) {
                throw new MiExcepcion("El producto es inválido");
            }

            String plantilla = "UPDATE producto SET precio = %.2f WHERE codigo_fabricante = %d";

            String sql = String.format(plantilla, producto.getPrecio(), producto.getCodigoFabricante());
            sql = sql.replaceAll(",", ".");

            insertarModificarEliminar(sql);
            
        } catch (MiExcepcion e) {
            e.printStackTrace();
            System.out.println(e.getMessage());
            throw new MiExcepcion("Error al modificar producto");
        }
    }

    public Producto buscarProductoPorId(Integer codigo) throws MiExcepcion {
        try {
            if (codigo == null) {
                throw new MiExcepcion("El código es inválido");
            }

            String sql = "SELECT * FROM producto WHERE codigo = " + codigo + ";";

            consultarBase(sql);

            Producto producto = null;

            while (resultado.next()) {
                producto = new Producto();

                producto.setCodigo(resultado.getInt(1));
                producto.setNombre(resultado.getString(2));
                producto.setPrecio(resultado.getDouble(3));
                producto.setCodigoFabricante(resultado.getInt(4));
            }

            return producto;
            
        } catch (SQLException e) {
            e.printStackTrace();
            throw new MiExcepcion("Error al obtener producto por código");
            
        } catch (MiExcepcion e) {
            e.printStackTrace();
            throw e;
        }
    }

    public List<String> obtenerNombresDeProductos() throws MiExcepcion {
        try {
            String sql = "SELECT nombre FROM producto;";

            consultarBase(sql);

            List<String> productos = new ArrayList<>();

            while (resultado.next()) {
                productos.add(resultado.getString(1));
            }

            return productos;
            
        } catch (SQLException e) {
            e.printStackTrace();
            throw new MiExcepcion("Error al obtener nombres de productos");
            
        } catch (MiExcepcion e) {
            e.printStackTrace();
            throw e;
            
        } finally {
            desconectarBase();
        }
    }

    public List<Producto> obtenerNombresYPreciosDeProductos() throws MiExcepcion {
        try {
            String sql = "SELECT nombre, precio FROM producto;";

            consultarBase(sql);

            List<Producto> productos = new ArrayList<>();
            Producto producto = null;

            while (resultado.next()) {
                producto = new Producto();

                producto.setNombre(resultado.getString(1));
                producto.setPrecio(resultado.getDouble(2));

                productos.add(producto);
            }

            return productos;
            
        } catch (SQLException e) {
            e.printStackTrace();
            throw new MiExcepcion("Error al obtener nombres y precios de productos");
            
        } catch (MiExcepcion e) {
            e.printStackTrace();
            throw e;
            
        } finally {
            desconectarBase();
        }
    }

    public List<Producto> obtenerProductosPorPrecio() throws MiExcepcion {
        try {
            String sql = "SELECT * FROM producto WHERE precio BETWEEN 120 AND 202;";

            consultarBase(sql);

            List<Producto> productos = new ArrayList<>();
            Producto producto = null;

            while (resultado.next()) {
                producto = new Producto();

                producto.setCodigo(resultado.getInt(1));
                producto.setNombre(resultado.getString(2));
                producto.setPrecio(resultado.getDouble(3));
                producto.setCodigoFabricante(resultado.getInt(4));

                productos.add(producto);
            }

            return productos;
            
        } catch (SQLException e) {
            e.printStackTrace();
            throw new MiExcepcion("Error al obtener productos por precio");
            
        } catch (MiExcepcion e) {
            e.printStackTrace();
            throw e;
            
        } finally {
            desconectarBase();
        }
    }

    public List<Producto> obtenerProductosPortatiles() throws MiExcepcion {
        try {
            String sql = "SELECT * FROM producto WHERE nombre LIKE '%portatil%';";

            consultarBase(sql);

            List<Producto> productos = new ArrayList<>();
            Producto producto = null;

            while (resultado.next()) {
                producto = new Producto();

                producto.setCodigo(resultado.getInt(1));
                producto.setNombre(resultado.getString(2));
                producto.setPrecio(resultado.getDouble(3));
                producto.setCodigoFabricante(resultado.getInt(4));

                productos.add(producto);
            }

            return productos;
        } catch (SQLException e) {
            e.printStackTrace();
            throw new MiExcepcion("Error al obtener productos PORTÁTILES");
            
        } catch (MiExcepcion e) {
            e.printStackTrace();
            throw e;
            
        } finally {
            desconectarBase();
        }
    }

    public Producto obtenerProductoMasBarato() throws MiExcepcion {
        try {
            String sql = "SELECT * FROM producto WHERE precio = (SELECT MAX(precio) FROM producto);";

            consultarBase(sql);

            Producto producto = null;

            while (resultado.next()) {
                producto = new Producto();

                producto.setCodigo(resultado.getInt(1));
                producto.setNombre(resultado.getString(2));
                producto.setPrecio(resultado.getDouble(3));
                producto.setCodigoFabricante(resultado.getInt(4));
            }

            return producto;
            
        } catch (SQLException e) {
            e.printStackTrace();
            throw new MiExcepcion("Error al obtener producto más barato");
            
        } catch (MiExcepcion e) {
            e.printStackTrace();
            throw e;
            
        } finally {
            desconectarBase();
        }
    }
}
