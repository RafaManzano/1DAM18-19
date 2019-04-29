package main.java.model;

import java.util.ArrayList;
import java.util.List;
import java.util.Queue;

public class Supermarket {
	
	public Supermarket(String name, Integer code) {
		this.name = name;
		this.code = code;
		this.products = new ArrayList<Product>();
		this.orders = new ArrayList<Order>();
	}
	
	private String name;
	private Integer code;
	
	private List<Product> products;
	private List<Order> orders;
	
	//TERCERA PARTE
	private Queue<Order> orderQueue;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getCode() {
		return code;
	}

	public void setCode(Integer code) {
		this.code = code;
	}

	public List<Product> getProducts() {
		return products;
	}

	public void setProducts(List<Product> products) {
		this.products = products;
	}

	public List<Order> getOrders() {
		return orders;
	}

	public void setOrders(List<Order> orders) {
		this.orders = orders;
	}
	
	public Queue<Order> getOrderQueue() {
		return orderQueue;
	}

	public void setOrderQueue(Queue<Order> orderQueue) {
		this.orderQueue = orderQueue;
	}

	public String toString() {
		return String.format("%o - %s", this.code, this.name);
	}
	
	//Métodos a completar
	//PRIMERA PARTE
	/*
	 * Interfaz
	 * Nombre: addProduct
	 * Comentario: Este subprograma a�ade un producto a la lista de productos 
	 * Cabecera: public boolean addProduct(Product product)
	 * Precondiciones: No hay
	 * Entrada: - Product product //El producto ha a�adir
	 * Salida: boolean anhadido //Si queda anhadido correctamente sera true, sino sera false
	 * E/S: No hay
	 * Postcondiciones: Asociado al nombre, si queda anhadido correctamente sera true, sino sera false
	 */
	public boolean addProduct(Product product) {
		boolean anhadido = false;
		
		anhadido = products.add(product);
		
		return anhadido;
	}
	
	/*
	 * Interfaz
	 * Nombre: removeProduct
	 * Comentario: Este subprograma elimina un producto a la lista de productos 
	 * Cabecera: public boolean removeProduct(Product product)
	 * Precondiciones: No hay
	 * Entrada: - Product product //El producto ha eliminar
	 * Salida: boolean eliminado //Si queda eliminado correctamente sera true, sino sera false
	 * E/S: No hay
	 * Postcondiciones: Asociado al nombre, si queda elimando correctamente sera true, sino sera false
	 */
	public boolean removeProduct(Product product) {
		
		boolean eliminado = false;
		
		eliminado = products.add(product);
		
		return eliminado;
	}
	
	/*
	 * Interfaz
	 * Nombre: getProduct
	 * Comentario: Este subprograma devuelve un producto de la lista por la posicion que ocupa (pasada por parametros)
	 * Cabecera: public Product getProduct (int position)
	 * Precondiciones: No hay
	 * Entrada: - int position //La posicion donde se encuentra el producto
	 * Salida: - Product producto //El producto encontrado
	 * E/S: No hay
	 * Postcondiciones: Asociado al nombre, el producto encontrado
	 */
	public Product getProduct(int position) {
		Product producto;
		producto = products.get(position);
		return producto;
	}
	
	public void addOrder(Order order) {
		//TODO Añadir pedido
		
	}
	
	public void removeOrder(Order order) {
		//TODO Eliminar pedido
		
	}
	
	public Order getOrder(int position) {
		//TODO Obtener pedido
		
		return null;
	}
	
	//TERCERA PARTE
	//Cola de pedidos
	public void pushOrder(Order order) {
		//TODO Añadir pedido
		
	}
	
	public Order popOrder() {
		//TODO Obtener pedido
		
		return null;
	}
	
	public Order getFront() {
		//TODO Devuelve el primer pedido de la cola
		//OJO!! No hay que sacarlo, solo devolver el primer pedido
		
		return null;
	}
	
	//Operaciones
	public void getMinPriceProduct() {
		//TODO Devolver el producto con el precio más bajo
		
	}
	
	public void getMaxPriceProduct() {
		//TODO Devolver el producto con el precio más alto
		
	}
	
	public void getAvgPriceProduct() {
		//TODO Devolver la media de precios de los productos
		
	}
	
	public void getPriceByCode(Integer productCode) {
		//TODO Delvover el precio del producto
	}
	
	public void getBestSellingProduct() {
		//TODO Devolver el producto más vendido junto con el número de ventas
		
	}
	
	public void getWorstSellingProduct() {
		//TODO Devolver el producto más vendido junto con el número de ventas
		
	}
	
}
