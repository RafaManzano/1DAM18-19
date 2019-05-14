package main.java.model;

import java.util.ArrayList;
import java.util.Deque;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class Supermarket {
	
	public Supermarket(String name, Integer code) 
	{
		this.name = name;
		this.code = code;
		this.products = new ArrayList<Product>();
		this.orders = new ArrayList<Order>();
		this.orderDeque = new LinkedList<Order>();
	}
	
	public Supermarket()
	{
		name = " ";
		code = 0;
	}
	
	private String name;
	private Integer code;
	
	private List<Product> products;
	private List<Order> orders;
	
	//TERCERA PARTE
	private Deque<Order> orderDeque;

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
	
	public Deque<Order> getOrderQueue() {
		return orderDeque;
	}

	public void setOrderQueue(Deque<Order> orderQueue) {
		this.orderDeque = orderQueue;
	}

	public String toString() {
		return String.format("%o - %s", this.code, this.name);
	}
	
	//MÃ©todos a completar
	//PRIMERA PARTE
	/*
		prototipo: public void addProduct(Product product)
		comentarios: metodo para añadir un producto al array
		precondiciones: no hay
		entradas: Product product
		salidas: no hay
		entr/sal: no hay
		postcondiciones: devuelve el array con un elemento demas
	*/
	public void addProduct(Product product) 
	{
		products.add(product);
		
	}
	
	
	/*
		prototipo: public void removeProduct(Product product)
		comentarios: metodo para eliminar un producto del array
		precondiciones: no hay
		entradas: Product product
		salidas: no hay
		entr/sal: no hay
		postcondiciones: devuelve el array con un elemento menos
	*/
	
	public void removeProduct(Product product) 
	{
		products.remove(product);
		
	}
	
	/*
		prototipo: public Product getProduct(int position)
		comentarios: metodo para buscar un elemento del array por su posicion
		precondiciones: la posicion tiene que ser mayor o igual que 0
		entradas: int position
		salidas: Product p
		entr/sal: no hay
		postcondiciones: AN devuelve el objeto de una posicion 
	*/
	public Product getProduct(int position) 
	{	
		return products.get(position);
	}
	
	/*
		prototipo: public void addOrder(Order order)
		comentarios: metodo para añadir un pedido al array
		precondiciones: no hay
		entradas: Order order
		salidas: no hay
		entr/sal: no hay
		postcondiciones: devuelve el array con un elemento demas
	*/
	
	public void addOrder(Order order) 
	{
		orders.add(order);
		
	}
	
	/*
		prototipo: public void removeOrder(Order order)
		comentarios: metodo para eliminar un pedido del array
		precondiciones: no hay
		entradas: Order order
		salidas: no hay
		entr/sal: no hay
		postcondiciones: devuelve el array con un elemento menos
	*/
	
	public void removeOrder(Order order) 
	{
		orders.add(order);
		
	}
	
	/*
		prototipo: public Order getOrder(int position)
		comentarios: metodo para buscar un elemento del array por su posicion
		precondiciones: la posicion tiene que ser mayor o igual que 0
		entradas: int position
		salidas: Order o
		entr/sal: no hay
		postcondiciones: AN devuelve el objeto de una posicion 
	*/
	public Order getOrder(int position) 
	{	
		return orders.get(position);
	}
	
	//TERCERA PARTE
	//Cola de pedidos
	/*
	* Interfaz
	* Nombre: pushOrder
	* Comentario: este metodo coloca un pedido al principio de la cola de pedidos.
	* Cabecera: public void pushOrder(Order order)
	* Entrada:
	* 	-Order order
	* Postcondiciones: inserta un nuevo pedido al principio
	* de la cola de pedidos.
	*/
	public void pushOrder(Order order) {
		orderDeque.push(order);
		
	}
	
	/*
	* Interfaz
	* Nombre: popOrder
	* Comentario: este metodo obtiene el primer pedido de la, y lo borra
	* cola de pedidos.
	* Cabecera: public Order popOrder()
	* Salida:
	* 	-Order order
	* Postcondiciones: devuelve un tipo Order AN o null si la cola se encuentra vacía.
	*/
	public Order popOrder() {
		Order order = null;

		if(!orderDeque.isEmpty()){
			order = orderDeque.pop();
		}

		return order;
	}
	
	/*
	* Interfaz
	* Nombre: getFront
	* Comentario: La función nos permite obtener el primer pedido sin borrarlo
	* de la cola.
	* Cabecera: public Order getFront()
	* Salida:
	* 	-Order order
	* Postcondiciones: devuelve un tipo Order AN,o null si la cola se encuentra vacía.
	*/
	public Order getFront() {
		//TODO Devuelve el primer pedido de la cola
		//OJO!! No hay que sacarlo, solo devolver el primer pedido
		
		Order order = null;

		if(!orderDeque.isEmpty()){
			order = orderDeque.getFirst();
		}

		return order;
	}
	
	//Operaciones
	public Product getMinPriceProduct() {
		//TODO Devolver el producto con el precio mÃ¡s bajo
		int min = 0;
		for(int i = 0; i < products.size(); i++) {
			if(products.get(i).getPrice() <= products.get(min).getPrice()) {
				min = i;				
			}			
		}
		return products.get(min);		
	}
	
	public Product getMaxPriceProduct() {
		//TODO Devolver el producto con el precio mÃ¡s alto		
		int max = 0;
		for(int i= 0; i<products.size();i++) {
			if(products.get(i).getPrice() > products.get(max).getPrice()) {
				max = i;
			}			
		}		
		return products.get(max);		
	}
	
	public double getAvgPriceProduct() {
		//TODO Devolver la media de precios de los productos
		int media = 0;
		int priceTotal = 0;
		for(int i = 0; i < products.size() ; i++){
			priceTotal += products.get(i).getPrice();
		}
		media = priceTotal/products.size();
		
		return media;
		
	}
	
	public double getPriceByCode(Integer productCode) {
		//TODO Delvover el precio del producto
		double price = 0.0;
		for(int i= 0; i<products.size();i++) {
			if(products.get(i).getCode() == productCode) {
				price = products.get(i).getPrice();
			}
			
		}
		return price;
	}
	
	/*
	 * nombre del metodo:getBestSellingProduct
	 * Cabecera: public String getBestSellingProduct()
	 * Cometario: Este metodo nos permitira saber el producto que mas se ha vendido
	 *
	 * ***Precondiciones***
	 * - Tiene que haber un producto
	 *
	 * ***Entradas***
	 * -Ninguna
	 *
	 * ***Postcondiciones***
	 * -Al finalizar este metodo nos devolvera asociado al nombre uan cadena en la que esta el producto mas vendido y su numero de ventas
	 *
	 * ***Salidas***
	 * -Product productoMasVendido
	 *
	 * Entradas/Salidas:Ninguna
	 */
	public Product getBestSellingProduct() 
	{
		int max = 0;
		
		for(int i = 0; i < products.size(); i++)
		{
			if(cantidadVendida(products.get(i).getCode()) > cantidadVendida(products.get(max).getCode()))
			{
				max = i;
			}
		}
		
		return products.get(max);
	}
	
	/*
	 * nombre del metodo: vecesVendido
	 * Cabecera: public int vecesVendido(int numProducto)
	 * Cometario: Este metodo nos permitira saber el numero de veces que se ha vendido un producto
	 *
	 * ***Precondiciones***
	 * -El producto debe de existir
	 *
	 * ***Entradas***
	 * -int numProducto
	 *
	 * ***Postcondiciones***
	 * -Al finalizar este metodo nos devolvera asociado al nombre el numero de veces que se ha vendido el producto que tenga el
	 * mismo numero de producto que el pasado como parametro
	 *
	 * ***Salidas***
	 * -int ventas
	 *
	 * Entradas/Salidas:Ninguna
	 */
	public int cantidadVendida(int numProducto)
	{
		int cantidadVendida = 0;
		
		for(Order pedido:orders)
		{
			for(OrderLine lineaPedidos:pedido.getOrderLines())
			{
				if(lineaPedidos.getProduct().getCode() == code)
				{
					cantidadVendida += lineaPedidos.getQuantity();
				}
			}
		}
		
		return cantidadVendida;
	}
	
	/*
	 * nombre del metodo: getWorstSellingProduct
	 * Cabecera: public String getWorstSellingProduct()
	 * Cometario: Este metodo nos permitira saber el producto menos vendido
	 *
	 * ***Precondiciones***
	 * -Tiene que haber un producto
	 *
	 * ***Entradas***
	 * -Ninguna
	 *
	 * ***Postcondiciones***
	 * -Al finalizar este metodo nos devolvera asociado al nombre una cadena en la que esta el producto menos vendido y su numero de ventas
	 *
	 * ***Salidas***
	 * -Product productoMenosVendido
	 *
	 * Entradas/Salidas:Ninguna
	 */
	public Product getWorstSellingProduct() 
	{
		int min = 0;
		
		for(int i = 0; i < products.size();i++)
		{
			if(cantidadVendida(products.get(i).getCode()) <= cantidadVendida(products.get(min).getCode()))
			{
				min = i;
			}
		}
		
		return products.get(min);
	}
	
}
