package jdbc.persistencia;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import jdbc.entidad.Producto;
import jdbc.excepcion.MiExcepcion;

public class ProductoDAO extends DAO {

    public void saveProduct(Producto producto) throws MiExcepcion {
        try {
            if (producto == null) {
                throw new MiExcepcion("El producto es inválido ");
            }

            String plantilla = "INSERT INTO producto(codigo, nombre, precio, codigo_fabricante) "
                    + "VALUES(%d, '%s', " + producto.getPrecio() + ", %d)";

            String sql = String.format(plantilla, producto.getCodigo(), producto.getNombre(), producto.getCodigoFabricante());

            insertModifyDelete(sql);
            
        } catch (MiExcepcion e) {
            e.printStackTrace();
            System.out.println(e.getMessage());
            throw new MiExcepcion("Error al guardar producto ->"+e.getMessage());
        }
    }

    public void ModifyProduct(Producto producto) throws MiExcepcion {
        try {
            if (producto == null) {
                throw new MiExcepcion("El producto es inválido");
            }

            String plantilla = "UPDATE producto SET precio = %.2f WHERE codigo_fabricante = %d";

            String sql = String.format(plantilla, producto.getPrecio(), producto.getCodigoFabricante());
            sql = sql.replaceAll(",", ".");

            insertModifyDelete(sql);
            
        } catch (MiExcepcion e) {
            e.printStackTrace();
            System.out.println(e.getMessage());
            throw new MiExcepcion("Error al modificar producto");
        }
    }

    public Producto getProductsById(Integer codigo) throws MiExcepcion {
        try {
            if (codigo == null) {
                throw new MiExcepcion("El código es inválido");
            }

            String sql = "SELECT * FROM producto WHERE codigo = " + codigo + ";";

            ConsultDataBase(sql);

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

    public List<String> getProductsNames() throws MiExcepcion {
        try {
            String sql = "SELECT nombre FROM producto;";

            ConsultDataBase(sql);

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
            desconnectDataBase();
        }
    }

    public List<Producto> getProductsNameAndPrice() throws MiExcepcion {
        try {
            String sql = "SELECT nombre, precio FROM producto;";

            ConsultDataBase(sql);

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
            throw new MiExcepcion("Error al obtener nombres y precios de productos ->"+
                    e.getMessage());
            
        } catch (MiExcepcion e) {
            e.printStackTrace();
            throw e;
            
        } finally {
            desconnectDataBase();
        }
    }

    public List<Producto> getProductsByPrice() throws MiExcepcion {
        try {
            //creo le String con la consulta a la bd para los productos entre 120 y 202
            String sql = "SELECT * FROM producto WHERE precio BETWEEN 120 AND 202;";

            ConsultDataBase(sql);
            //Creo la lista de productos de tippo Producto
            List<Producto> productos = new ArrayList<>();
            Producto producto = null;
            //Mientras tenga un proximo
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
            throw new MiExcepcion("Error al obtener productos por precio ->"+e.getMessage());
            
        } catch (MiExcepcion e) {
            e.printStackTrace();
            throw e;
            
        } finally {
            desconnectDataBase();
        }
    }

    public List<Producto> getPortableProducts() throws MiExcepcion {
        try {
            String sql = "SELECT * FROM producto WHERE nombre LIKE '%portatil%';";

            ConsultDataBase(sql);

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
            throw new MiExcepcion("Error al obtener productos PORTÁTILES -> "+e.getMessage());
            
        } catch (MiExcepcion e) {
            e.printStackTrace();
            throw e;
            
        } finally {
            desconnectDataBase();
        }
    }

    public Producto getCheapestProduct() throws MiExcepcion {
        try {
            //Hago la consulta con mi bd para obtener el precio mas bajo
            String sql = "SELECT * FROM producto WHERE precio = (SELECT MIN(precio) FROM producto);";

            ConsultDataBase(sql);

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
            throw new MiExcepcion("Error al obtener producto más barato -> "+e.getMessage());
            
        } catch (MiExcepcion e) {
            e.printStackTrace();
            throw e;
            
        } finally {
            desconnectDataBase();
        }
    }
}
