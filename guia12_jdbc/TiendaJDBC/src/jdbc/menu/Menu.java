package jdbc.menu;

import java.util.InputMismatchException;
import java.util.Scanner;
import jdbc.excepcion.MiExcepcion;
import jdbc.servicio.FabricanteServicio;
import jdbc.servicio.ProductoServicio;

public class Menu {

    private Scanner entrada;
    private ProductoServicio productoServicio;
    private FabricanteServicio fabricanteServicio;
    private int respuesta;
    private int salida;

    public Menu() {
        entrada = new Scanner(System.in, "ISO-8859-1");  //ISO-8859-1 como el UTF-8 de HTML
        //Instancio objetos de las clases FabricanteServicio y ProductoServicio
        fabricanteServicio = new FabricanteServicio();
        productoServicio = new ProductoServicio();
        respuesta = 0;
        salida = 9;
    }

    public void interfaz() {
        do {
            
            try {
                System.out.println("-- ELIJA UNA OPCIÓN --" +
                        "\n1- Listar el nombre de todos los productos que hay en la tabla producto"+
                        "\n2- Listar los nombres y los precios de todos los productos de la tabla producto"+
                        "\n3- Listar aquellos productos que su precio esté entre 120 y 202"+
                        "\n4- Buscar y listar todos los Portátiles de la tabla producto"+
                        "\n5- Listar el nombre y el precio del producto más barato"+
                        "\n6- Ingresar un producto a la base de datos"+
                        "\n7- Ingresar un fabricante a la base de datos"+
                        "\n8- Editar un producto con datos a elección"+
                        "\n9- Salir");

                respuesta = entrada.nextInt();

                switch (respuesta) {
                    case 1:
                        productoServicio.imprimirNombresDeProductos();
                        break;
                    case 2:
                        productoServicio.imprimirNombresYPrecioDeProductos();
                        break;
                    case 3:
                        productoServicio.imprimirProductosPorPrecio();
                        break;
                    case 4:
                        productoServicio.imprimirProductosPortatiles();
                        break;
                    case 5:
                        productoServicio.imprimirProductoMasBarato();
                        break;
                    case 6:
                        ingresarProducto();
                        productoServicio.imprimirNombresDeProductos();
                        break;
                    case 7:
                        ingresarFabricante();
                        fabricanteServicio.imprimirFabricantes();
                        break;
                    case 8:
                        editarProducto();
                        productoServicio.imprimirNombresDeProductos();
                        break;
                    case 9:
                        System.out.println("*** SESIÓN FINALIZADA ***");
                        break;
                    default:
                        System.out.println("El opción elegida es inválida");
                }
                
            } catch (InputMismatchException e) {
                System.out.println("No se admiten caracteres");
                entrada.next();
                
            } catch (MiExcepcion e) {
                System.out.println(e.getMessage());
            }
            
        } while (respuesta != salida);
    }

    public void ingresarProducto() throws MiExcepcion {
        try {
            System.out.println("Ingrese el código: ");
            Integer codigo = entrada.nextInt();

            System.out.println("Ingrese el nombre del producto: ");
            String nombre = entrada.next();

            System.out.println("Ingrese el precio del producto: ");
            Double precio = entrada.nextDouble();

            System.out.println("Ingrese el código del fabricante: ");
            Integer codigoFabricante = entrada.nextInt();

            productoServicio.crearProducto(codigo, nombre, precio, codigoFabricante);
            
        } catch (MiExcepcion e) {
            e.printStackTrace();
            throw e;
        }
    }

    public void ingresarFabricante() throws MiExcepcion {
        try {
            System.out.println("Ingrese el código: ");
            Integer codigo = entrada.nextInt();

            System.out.println("Ingrese el nombre del fabricante: ");
            String nombre = entrada.next();

            fabricanteServicio.crearFabricante(codigo, nombre);
        } catch (MiExcepcion e) {
            e.printStackTrace();
            throw e;
        }
    }

    public void editarProducto() throws MiExcepcion {
        try {
            System.out.println("Ingrese el código del producto que desea editar: ");
            Integer codigo = entrada.nextInt();

            System.out.println("Ingrese el precio actualizado del producto: ");
            Double precio = entrada.nextDouble();

            productoServicio.modificarProducto(codigo, precio);
        } catch (MiExcepcion e) {
            e.printStackTrace();
            throw e;
        }
    }
}
