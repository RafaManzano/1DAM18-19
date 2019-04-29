package main.java.model;

import java.util.ArrayList;
import java.util.List;

import main.java.util.ListaArticulos;

public class Order {
	
	public Order(Integer code, String consumer, Supermarket supermarket) {
		this.code = code;
		this.consumer = consumer;
		this.supermarket = supermarket;
		this.orderLines = new ArrayList<OrderLine>();
	}

	private Integer code;
	private String consumer;
	
	private Supermarket supermarket;
	private List<OrderLine> orderLines;
	
	//SEGUNDA PARTE
	private ListaArticulos linkedOrderLines;
	
	public Integer getCode() {
		return code;
	}
	public void setCode(Integer code) {
		this.code = code;
	}
	public String getConsumer() {
		return consumer;
	}
	public void setConsumer(String consumer) {
		this.consumer = consumer;
	}
	public Supermarket getSupermarket() {
		return supermarket;
	}
	public void setSupermarket(Supermarket supermarket) {
		this.supermarket = supermarket;
	}
	public List<OrderLine> getOrderLines() {
		return orderLines;
	}
	public void setOrderLines(List<OrderLine> orderLines) {
		this.orderLines = orderLines;
	}	
	public ListaArticulos getListaPedidos() {
		return linkedOrderLines;
	}
	public void setListaPedidos(ListaArticulos linkedOrderLines) {
		this.linkedOrderLines = linkedOrderLines;
	}
	
	public String toString() {
		return String.format("%o - %s   Supermarket: %s", this.code, this.consumer, this.supermarket.getName());
	}
	
	//Métodos a completar
	//PRIMERA PARTE
	/*
	 * Interfaz
	 * Nombre: addOrderLine
	 * Comentario: Este subprograma a�ade una linea de pedidos a la lista de lineas de pedidos 
	 * Cabecera: public boolean addOrderLine(Product product)
	 * Precondiciones: No hay
	 * Entrada: - OrderLine orderLine //La linea de pedidos ha a�adir
	 * Salida: boolean anhadido //Si queda anhadido correctamente sera true, sino sera false
	 * E/S: No hay
	 * Postcondiciones: Asociado al nombre, si queda anhadido correctamente sera true, sino sera false
	 */
	public void addOrderLine(OrderLine orderLine) {
		
	}
	
	/*
	 * Interfaz
	 * Nombre: removeProduct
	 * Comentario: Este subprograma elimina una linea de pedidos a la lista de lineas de pedidos
	 * Cabecera: public boolean removeremoveOrderLine(OrderLine orderLine)
	 * Precondiciones: No hay
	 * Entrada: - OrderLine orderLine //La linea de producto ha eliminar
	 * Salida: boolean eliminado //Si queda eliminado correctamente sera true, sino sera false
	 * E/S: No hay
	 * Postcondiciones: Asociado al nombre, si queda elimando correctamente sera true, sino sera false
	 */
	public void removeOrderLine(OrderLine orderLine) {
		//TODO Eliminar artículo
		
	}
	
	/*
	 * Interfaz
	 * Nombre: getOrderLine
	 * Comentario: Este subprograma devuelve una linea de pedidos de la lista por la posicion que ocupa (pasada por parametros)
	 * Cabecera: public OrderLine getOrderLine (int position)
	 * Precondiciones: No hay
	 * Entrada: - int position //La posicion donde se encuentra el producto
	 * Salida: - OrderLine pedido //La linea de pedidos quedaria encontrada
	 * E/S: No hay
	 * Postcondiciones: Asociado al nombre, el producto encontrado
	 */
	public OrderLine getOrderLine(int position) {
		//TODO Coger artículo
		
		return null;
	}
	
	//SEGUNDA PARTE
	public void addLinkedOrderLine(OrderLine orderLine) {
		//TODO Añadir artículo
		
	}
	
	public void removeLinkedOrderLine(OrderLine orderLine) {
		//TODO Eliminar artículo
		
	}
	
	public OrderLine getLinkedOrderLine(int position) {
		//TODO Coger artículo
		
		return null;
	}
	
	public OrderLine getLastOrderLine() {
		//TODO Coger último artículo
		
		return null;
	}
	
	//TERCERA PARTE
	public Double getTotalPrice() {
		//TODO Calcular el total del pedido
		
		return 0.0;
	}

}
