package main.java.util;

import main.java.model.Order;
import main.java.model.OrderLine;
import main.java.model.Product;

public class Articulo {
	
	private Articulo previous;
	private Articulo next;
	private OrderLine orderLine;
	
	//Constructor por defecto
	public Articulo(){
		previous = null;
		next = null;
		orderLine = new OrderLine();
	}

	//Constructor con parámetros
	public Articulo(Articulo previous, Articulo next, Integer code, Integer quantity, Order order, Product product)
	{
		this.previous = previous;
		this.next = next;
		orderLine = new OrderLine(code, quantity, order, product);
	}

	//Constructor con parámetros 2
	public Articulo(Articulo previous, Articulo next, OrderLine orderLine)
	{
		this.previous = previous;
		this.next = next;
		this.orderLine = orderLine;
	}
	
	public OrderLine getOrderLine() 
	{
		return orderLine;
	}
	
	public Articulo getPrevious() 
	{
		return previous;
	}
	public void setPrevious(Articulo previous) 
	{
		this.previous = previous;
	}
	public Articulo getNext() 
	{
		return next;
	}
	public void setNext(Articulo next) 
	{
		this.next = next;
	}
	
}
