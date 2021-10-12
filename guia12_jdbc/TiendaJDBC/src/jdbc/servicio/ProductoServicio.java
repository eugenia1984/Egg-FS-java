package jdbc.servicio;

import java.util.List;
import jdbc.entidad.Producto;
import jdbc.excepcion.MiExcepcion;
import jdbc.persistencia.ProductoDAO;

public class ProductoServicio {

    private ProductoDAO productoDAO;

    public ProductoServicio() {
        productoDAO = new ProductoDAO();
    }

    public void createProduct(Integer codigo, String nombre, Double precio, Integer codigoFabricante) throws MiExcepcion {
        try {
            if (codigo == null) {
                throw new MiExcepcion("El código es obligatorio");
            }

            if (nombre == null || nombre.trim().isEmpty()) {
                throw new MiExcepcion("El nombre es obligatorio");
            }

            if (precio == null) {
                throw new MiExcepcion("El precio es obligatorio");
            }

            if (codigoFabricante == null) {
                throw new MiExcepcion("El código de fabricante es obligatorio");
            }

            Producto producto = new Producto();

            producto.setCodigo(codigo);
            producto.setNombre(nombre);
            producto.setPrecio(precio);
            producto.setCodigoFabricante(codigoFabricante);

            productoDAO.saveProduct(producto);
            
        } catch (MiExcepcion e) {
            e.printStackTrace();
            throw e;
        }
    }

    public void modifyProduct(Integer codigo, Double precio) throws MiExcepcion {
        try {
            if (codigo == null) {
                throw new MiExcepcion("El código es obligatorio");
            }

            if (precio == null) {
                throw new MiExcepcion("El precio es obligatorio");
            }

            Producto producto = productoDAO.getProductsById(codigo);

            if (producto == null) {
                throw new MiExcepcion("El producto que desea modificar no existe");
            }

            productoDAO.ModifyProduct(producto);
            
        } catch (MiExcepcion e) {
            e.printStackTrace();
            throw e;
        }
    }

    public void printProductsNames() throws MiExcepcion {
        try {
            List<String> productos = productoDAO.getProductsNames();

            if (productos.isEmpty()) {
                throw new MiExcepcion("No existen productos");
            } else {
                System.out.println("*** LISTA DE NOMBRES DE PRODUCTOS ***");
                productos.forEach(System.out::println);
                System.out.println();
            }
            
        } catch (MiExcepcion e) {
            e.printStackTrace();
            throw e;
        }
    }

    public void prinProductstNamesAndPrices() throws MiExcepcion {
        try {
            List<Producto> productos = productoDAO.getProductsNameAndPrice();

            if (productos.isEmpty()) {
                throw new MiExcepcion("No existen productos");
            } else {
                System.out.println("*** LISTA DE NOMBRES Y PRECIOS DE PRODUCTOS ***");
                System.out.printf("%-35s%-15s\n", "NOMBRE", "PRECIO");
                productos.forEach(p -> System.out.printf("%-35s%-15.2f\n", p.getNombre(), p.getPrecio()));
                System.out.println();
            }
            
        } catch (MiExcepcion e) {
            e.printStackTrace();
            throw e;
        }
    }

    public void printProductsByPrice() throws MiExcepcion {
        try {
            List<Producto> productos = productoDAO.getProductsByPrice();

            if (productos.isEmpty()) {
                throw new MiExcepcion("No existen productos");
            } else {
                System.out.println("*** LISTA DE PRODUCTOS POR PRECIO (120-202) ***");
                System.out.printf("%-10s%-35s%-15s%-25s\n", "CÓDIGO", "NOMBRE", "PRECIO", "CÓDIGO DE FABRICANTE");
                productos.forEach(p -> System.out.printf("%-10d%-35s%-15.2f%-25d\n", p.getCodigo(), p.getNombre(), p.getPrecio(), p.getCodigoFabricante()));
                System.out.println();
            }
            
        } catch (MiExcepcion e) {
            e.printStackTrace();
            throw e;
        }
    }

    public void printPortableProducts() throws MiExcepcion {
        try {
            List<Producto> productos = productoDAO.getPortableProducts();

            if (productos.isEmpty()) {
                throw new MiExcepcion("No existen productos");
            } else {
                System.out.println("*** LISTA DE PRODUCTOS PORTÁTILES ***");
                System.out.printf("%-10s%-35s%-15s%-25s\n", "CÓDIGO", "NOMBRE", "PRECIO", "CÓDIGO DE FABRICANTE");
                productos.forEach(p -> System.out.printf("%-10d%-35s%-15.2f%-25d\n", p.getCodigo(), p.getNombre(), p.getPrecio(), p.getCodigoFabricante()));
                System.out.println();
            }
            
        } catch (MiExcepcion e) {
            e.printStackTrace();
            throw e;
        }
    }

    public void printCheapestProduct() throws MiExcepcion {
        try {
            Producto producto = productoDAO.getCheapestProduct();

            if (producto == null) {
                throw new MiExcepcion("No existen productos");
            } else {
                System.out.println("*** PRODUCTO MÁS BARATO ***");
                System.out.printf("%-10s%-28s%-15s%-25s\n", "CÓDIGO", "NOMBRE", "PRECIO", "CÓDIGO DE FABRICANTE");
                System.out.printf("%-10d%-28s%-15.2f%-25d\n", producto.getCodigo(), producto.getNombre(), producto.getPrecio(), producto.getCodigoFabricante());
                System.out.println();
            }
            
        } catch (MiExcepcion e) {
            e.printStackTrace();
            throw e;
        }
    }
}
