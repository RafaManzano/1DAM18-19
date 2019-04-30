package main.java.util;

import main.java.model.OrderLine;

public class Articulo {
	
	private Articulo previous;
	private Articulo next;
	private OrderLine lineaPedido;
	
	public Articulo () {
		previous = null;
		next = null;
		lineaPedido = null;
	}
	
	public Articulo (Articulo previous, Articulo next, OrderLine lineaPedido) {
		this.previous = previous;
		this.next = next;
		this.lineaPedido = lineaPedido;
	}
	
	public Articulo (Articulo cop) {
		this.previous = cop.getPrevious();
		this.next = cop.getNext();
		this.lineaPedido = cop.getLineaPedido();
	}
	
	public Articulo getPrevious() {
		return previous;
	}
	public void setPrevious(Articulo previous) {
		this.previous = previous;
	}
	public Articulo getNext() {
		return next;
	}
	public void setNext(Articulo next) {
		this.next = next;
	}
	
	public OrderLine getLineaPedido() {
		return lineaPedido;
	}
	public void setLineaPedido(OrderLine lineaPedido) {
		this.lineaPedido = lineaPedido;
	}
	
	
}
