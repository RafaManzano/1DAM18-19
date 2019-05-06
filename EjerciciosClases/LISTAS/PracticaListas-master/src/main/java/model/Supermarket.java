package main.java.model;

import java.util.ArrayList;
import java.util.Deque;
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
	private Deque<Order> orderQueue;

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

	public void setOrderQueue(Deque<Order> orderQueue) {
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
	/*
	 * Interfaz
	 * Nombre: pushOrder
	 * Comentario: Este subprograma anhade un pedido
	 * Cabecera: public void pushOrder(Order order)
	 * Precondiciones:
	 * Entrada: Order order //El pedido a anhadir
	 * Salida: No hay
	 * E/S: No hay
	 * Postcondiciones: El pedido queda anhadido en la lista
	 */
	public void pushOrder(Order order) {
		orderQueue.add(order);
	}
	
	/*
	 * Interfaz
	 * Nombre: popOrder
	 * Comentario: Este subprograma obtiene un pedido
	 * Cabecera: public void popOrder()
	 * Precondiciones:
	 * Entrada: 
	 * Salida: Order pedido //El pedido que se ha encontrado
	 * E/S: No hay
	 * Postcondiciones: Se devuelve un pedido
	 */
	public Order popOrder() {
		Order pedido;
		
		pedido = orderQueue.pop();
		
		return pedido;
	}
	
	/*
	 * Interfaz
	 * Nombre: getFront
	 * Comentario: Este subprograma obtiene el primero de la lista
	 * Cabecera: public void getFront()
	 * Precondiciones: No hay
	 * Entrada: No hay
	 * Salida: Order pedido //El pedido que se ha encontrado
	 * E/S: No hay
	 * Postcondiciones: Se devuelve un pedido que es el primero de la lista
	 */
	public Order getFront() {
		Order pedido;
		
		pedido = orderQueue.getFirst();
		
		return pedido;
	}
	
	//Operaciones //Opcional
	/*
	 * Interfaz
	 * Nombre: getMinPriceProduct
	 * Comentario: Este subprograma devuelve el producto con el precio mas bajo
	 * Cabecera: public Product getMinPriceProduct() 
	 * Precondiciones: La lista tiene que tener productos
	 * Entrada: No hay
	 * Salida: Product producto
	 * E/S: No hay
	 * Postcondiciones: Asociado al nombre, devuelve el prodcuto con el precio mas bajo
	 */
	public Product getMinPriceProduct() {
		Product producto = null;
		int cont = 0;
		producto = products.get(cont);
		
		for (cont = 0; cont < products.size(); cont++) {
			if(producto.getPrice() > products.get(cont).getPrice()) {
				producto = products.get(cont);
			}
		}
		
		return producto;
		
	}
	
	/*
	 * Interfaz
	 * Nombre: getMaxPriceProduct
	 * Comentario: Este subprograma devuelve el producto con el precio mas alto
	 * Cabecera: public Product getMaxPriceProduct() 
	 * Precondiciones: La lista tiene que tener productos
	 * Entrada: No hay
	 * Salida: Product producto
	 * E/S: No hay
	 * Postcondiciones: Asociado al nombre, devuelve el prodcuto con el precio mas alto
	 */
	public Product getMaxPriceProduct() {
		Product producto = null;
		int cont = 0;
		producto = products.get(cont);
		
		for (cont = 0; cont < products.size(); cont++) {
			if(producto.getPrice() < products.get(cont).getPrice()) {
				producto = products.get(cont);
			}
		}
		
		return producto;
	}
	
	/*
	 * Interfaz
	 * Nombre: getAvgPriceProduct
	 * Comentario: Este subprograma devuelve la media de los precios de todos los productos
	 * Cabecera: public double getAvgPriceProduct() 
	 * Precondiciones: La lista tiene que tener productos
	 * Entrada: No hay
	 * Salida: Double media //Es la media de los precios de los productos
	 * E/S: No hay
	 * Postcondiciones: Asociado al nombre, devuelve la media de los precios de los productos
	 */
	public double getAvgPriceProduct() {
		double media = 0.;
		int cont = 0;
		
		
		for (cont = 0; cont < products.size(); cont++) {
			media += products.get(cont).getPrice();
		}
		
		return media / (double)products.size();
		
	}
	
	/*
	 * Interfaz
	 * Nombre: getPriceByCode
	 * Comentario: Este subprograma devuelve el precio de un producto por su codigo (pasado por parametro)
	 * Cabecera: public double getPriceByCode(Integer productCode) 
	 * Precondiciones: La lista tiene que tener productos
	 * Entrada: - Integer productCode
	 * Salida: Double precio //Es el precio del producto buscado
	 * E/S: No hay
	 * Postcondiciones: Asociado al nombre, devuelve el precio del producto buscado
	 */
	public double getPriceByCode(Integer productCode) {
		double precio = 0.;
		int cont = 0;

		for (cont = 0; cont < products.size(); cont++) {
			if(products.get(cont).getCode() == productCode) {
				precio = products.get(cont).getPrice();
			}
		}
		
		return precio;
	}
	
	//No es obligatorio
	public void getBestSellingProduct() {
		//TODO Devolver el producto más vendido junto con el número de ventas
		
	}
	
	//No es obligatorio
	public void getWorstSellingProduct() {
		//TODO Devolver el producto más vendido junto con el número de ventas
		
	}
	
}
