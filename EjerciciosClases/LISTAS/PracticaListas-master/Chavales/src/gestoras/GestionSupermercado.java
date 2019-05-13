package gestoras;

import java.util.List;

import main.java.model.Order;
import main.java.model.OrderLine;
import main.java.model.Product;
import main.java.model.Supermarket;

public class GestionSupermercado {
	

	    /*
	    * Interfaz
	    * Nombre: mostrarListaProductos
	    * Comentario: Este metodo muestra la lista de productos por pantalla.
	    * Cabecera: public void mostrarListaProductos(List<Product> productos)
	    * Entrada:
	    *   -List<Product> productos
	    * Postcondiciones: No hay, solo pinta por pantalla la lista de los productos.
	    * */
	    public void mostrarListaProductos(List<Product> productos){
	        for(int i = 0; i < productos.size(); i++){
	            System.out.println(productos.get(i));
	        }
	    }
	

	    /*
	    * Interfaz
	    * Nombre: buscarProductoCodigo
	    * Comentario: Este metodo busca un producto en la lista de productos segun su codigo.
	    * Cabecera: public Product buscarProductoCodigo(int codigo, List<Product> productos)
	    * Precondiciones:
	    * 	-El codigo debe ser mayor que 0.
	    * Entrada:
	    *   -int codigo
	    *   -List<Product> products
	    * Salida:
	    *   -Product product
	    * Postcondiciones: devuelve un producto de la lista de productos AN.
	    */
	    public Product buscarProductoCodigo(int codigo, List<Product> products){
	        Product product = null;

	        for(int i = 0; i < products.size() && product == null; i++){
	            if(products.get(i).getCode() == codigo){
	                product = products.get(i);
	            }
	        }

	        return product;
	    }


	    /*
	     * Interfaz
	     * Nombre: buscarProductoNombre
	     * Comentario: Este metodo busca un producto en la lista de productos segun su nombre.
	     * Cabecera: public Product buscarProductoNombre(String nombre, List<Product> productos)
	     * Entrada:
	     *   -String nombre
	     *   -List<Product> productos
	     * Salida:
	     *   -Product producto
	     * Postcondiciones: devuelve un producto de la lista de productos AN.
	     * */
	    public Product buscarProductoNombre(String nombre, List<Product> productos){
	        Product product = null;

	        for(int i = 0; i < productos.size() && product == null; i++){
	            if(productos.get(i).getName().equals(nombre)){
	                product = productos.get(i);
	            }
	        }

	        return product;
	    }

}
