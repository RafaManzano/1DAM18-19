package main.java.model;

import java.util.ArrayList;
import java.util.List;

import main.java.util.Articulo;
import main.java.util.ListaArticulos;

public class Order {
	
	public Order(Integer code, String consumer, Supermarket supermarket) {
		this.code = code;
		this.consumer = consumer;
		this.supermarket = supermarket;
		this.orderLines = new ArrayList<OrderLine>();
	}
	
	public Order(){
		code = 0;
		consumer = " ";
		supermarket = new Supermarket();
	}

	private Integer code;
	private String consumer;
	
	private Supermarket supermarket;
	private List<OrderLine> orderLines;
	
	//SEGUNDA PARTE
	private ListaArticulos linkedOrderLines = new ListaArticulos();
	
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
	
	//MÃ©todos a completar
	//PRIMERA PARTE
	
	/*
	 * cabecera: public void addOrderLine(OrderLine orderLine) 
	 * Comentario: este metodo añade una linea de pedido
	 * Precondiciones: no hay
	 * Entradas: OrderLine orderLine //la linea de pedido que se añade
	 * Salidas: no hay
	 * E/S: no hay
	 * Postcondiciones: la lisat de la linea de pedido queda con un registro mas
	 */
	public void addOrderLine(OrderLine orderLine) 
	{
		orderLines.add(orderLine);
		
	}
	
	
	/*
	 * cabecera: public void removeOrderLine(OrderLine orderLine)
	 * Comentario: este metodo elimina una linea de pedido
	 * Precondiciones: la linea de pedido debe existir
	 * Entradas: OrderLine orderLine //la linea de pedido que se elimina
	 * Salidas: no hay
	 * E/S: no hay
	 * Postcondiciones: la linea de pedido queda eliminada
	 */
	public void removeOrderLine(OrderLine orderLine) 
	{
		orderLines.remove(orderLine);
	}
	 
	 /*
	 * cabecera: public OrderLine getOrderLine(int position)
	 * Comentario: este metodo sirve para obtener una linea de pedido segun la posicion
	 * Precondiciones: la posicion tiene que ser valida
	 * Entradas: int position //la posicion de la que quieremos obtener la linea de pedido
	 * Salidas: OrderLine orderLine
	 * E/S: no hay
	 * Postcondiciones: AN devuelve la linea de pedido
	 */
	public OrderLine getOrderLine(int position) 
	{		
		return orderLines.get(position);
	}
	
	//SEGUNDA PARTE
	/*
	 * cabecera: public void addLinkedOrderLine(OrderLine orderLine)
	 * Comentario: este metodo sirve para añadir una linea de pedido a la lista de articulos
	 * Precondiciones: no hay
	 * Entradas: OrderLine orderLine
	 * Salidas: no hay
	 * E/S: no hay
	 * Postcondiciones: la lista de articulos queda con un registro más
	 */
	 
	public void addLinkedOrderLine(OrderLine orderLine) 
	{
		Articulo articulo = new Articulo(null, null, orderLine);
		linkedOrderLines.addArticulo(articulo);
	}
	
	/*
	 * cabecera: public void removeLinkedOrderLine(OrderLine orderLine)
	 * Comentario: este metodo sirve para eliminar una linea de pedido de la lista de articulos
	 * Precondiciones: la linea de pedido debe existir
	 * Entradas: OrderLine orderLine
	 * Salidas: no hay
	 * E/S: no hay
	 * Postcondiciones: la lista de articulos queda con un registro elimminado
	 */
	public void removeLinkedOrderLine(OrderLine orderLine)
	{
		Articulo articulo = new Articulo(null, null, orderLine);
		linkedOrderLines.remove(articulo);
	}
	
	/*
	 * cabecera: public OrderLine getLinkedOrderLine(int position)
	 * Comentario: este metodo sirve para obtener una linea de pedido segun su posicion
	 * Precondiciones: la posicion debe ser balido
	 * Entradas: int position
	 * Salidas: OrderLine orderLine
	 * E/S: no hay
	 * Postcondiciones: AN devuelve la linea de pedido de la posicion indicada commo parametro
	 */
	public OrderLine getLinkedOrderLine(int position) 
	{
		OrderLine orderLine = null;
		Articulo articulo;

		articulo = linkedOrderLines.get(position);
		if(articulo != null){
			orderLine = articulo.getOrderLine();//Pablo cambia el nombre de getOrderLine
		}

		return orderLine;
	}
	
	/*
	 * cabecera: public OrderLine getLinkedOrderLine(int position)
	 * Comentario: este metodo sirve para obtener la ultima linea de pedido
	 * Precondiciones: no hay
	 * Entradas: no hay
	 * Salidas: OrderLine orderLine
	 * E/S: no hay
	 * Postcondiciones: AN devuelve la ultima linea de pedido
	 */
	public OrderLine getLastOrderLine() 
	{
		Articulo articulo = linkedOrderLines.get(linkedOrderLines.contarArticulosLista()-1);
		OrderLine orderLine = null;

		if(articulo != null){
			orderLine = articulo.getOrderLine();
		}

		return orderLine;
	}
	
	//TERCERA PARTE	
	/*
	 * cabecera: public Double getTotalPrice()
	 * Comentario: este metodo sirve para calcular el precio total del pedido
	 * Precondiciones: el pedido debe existir
	 * Entradas: no hay
	 * Salidas: Double precioTotal
	 * E/S: no hay
	 * Postcondiciones: AN devuelve el precio total del pedido
	 */
	public Double getTotalPrice() 
	{
		double precioTotal = 0.0;

		for(int i = 0; i < orderLines.size(); i++) {
			precioTotal += orderLines.get(i).getProduct().getPrice(); //suma el precio de cada producto de la linea de pedidos
		}
		return precioTotal;
	}

}
