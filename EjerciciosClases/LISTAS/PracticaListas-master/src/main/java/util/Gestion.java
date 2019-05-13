package main.java.util;

import java.util.List;

import main.java.model.Product;

public class Gestion {

	/*
     * Interfaz
     * Nombre: buscarProductoPorNombre
     * Comentario: Este metodo busca un producto en la lista de productos por su nombre
     * Cabecera: public Product buscarProductoPorNombre(String nombre, List<Product> productos)
     * Entrada: - String nombre //El nombre del producto que se desea buscar
     *   	    - List<Product> productos //La lista de productos para buscar
     * Salida: - Product producto //El producto buscado
     * Postcondiciones: Asociado al nombre. Devuelve el producto encontrado o en caso de no encontrarlo, devuelve null
     * */
    public Product buscarProductoPorNombre(String nombre, List<Product> productos){
        Product product = null;

        for(int i = 0; i < productos.size() && product == null; i++){
            if(productos.get(i).getName().equals(nombre)){
                product = productos.get(i);
            }
        }

        return product;
    }
}
