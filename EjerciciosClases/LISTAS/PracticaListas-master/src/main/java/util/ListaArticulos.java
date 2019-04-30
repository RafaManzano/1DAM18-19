package main.java.util;

import java.util.LinkedList;

import main.java.model.OrderLine;

public class ListaArticulos {
	
	//Atributos
	private Articulo primer;
	private Articulo ultimo;
	private int tamanho;
	
	
	//Constructores
	public ListaArticulos() {
		primer = null;
		ultimo = null;
		tamanho = 0;
	}
	
	public ListaArticulos(Articulo primer, Articulo ultimo, int tamanho) {
		this.primer = primer;
		this.ultimo = ultimo;
		this.tamanho = tamanho;
	}
	
	public ListaArticulos(ListaArticulos cop) {
		this.primer = cop.getPrimer();
		this.ultimo = cop.getUltimo();
		this.tamanho = cop.getTamanho();
	}
	
	//Get and Set
	public Articulo getPrimer() {
		return primer;
	}

	public void setPrimer(Articulo primer) {
		this.primer = primer;
	}

	public Articulo getUltimo() {
		return ultimo;
	}

	public void setUltimo(Articulo ultimo) {
		this.ultimo = ultimo;
	}

	public int getTamanho() {
		return tamanho;
	}

	public void setTamanho(int tamanho) {
		this.tamanho = tamanho;
	}
	
	//Metodos
	/*
	 * Interfaz
	 * Nombre: addArticulo
	 * Comentario: Este subprograma añade un articulo a la lista de articulos 
	 * Cabecera: public void addArticulo(Articulo articulo)
	 * Precondiciones: No hay
	 * Entrada: - Articulo articulo //El articulo ha anhadir
	 * Salida: No hay
	 * E/S: No hay
	 * Postcondiciones: No hay
	 */
	public void addArticulo(Articulo articulo) {
		setTamanho(tamanho + 1);
		setPrimer(getUltimo());
		setUltimo(null);
	}
	
	

	/*
	 * Interfaz
	 * Nombre: anhadirLineaPedido
	 * Comentario: Este subprograma anhade una linea de pedido al articulo nuevo
	 * Cabecera: public void anhadirLineaPedido(OrderLine o)
	 * Precondiciones: No hay
	 * Entrada: - OrderLine o //Es la linea de pedido que se anhade al nuevo articulo
	 * Salida: No hay
	 * E/S: No hay
	 * Postcondiciones: El articulo queda anhadadido en la lista con su linea de pedido
	 */
	public void anhadirLineaPedido(OrderLine o) {
		Articulo ar = new Articulo(articulos.get(articulos.size() - 1), null, o);
		
		addArticulo(ar);
	}
	

	
	public void insert(Articulo articulo, int position) {
		//TODO Insertar el articulo en la posicion indicada
		
	}
	
	public void remove(Articulo articulo) {
		articulos.remove(articulo);
	}
	
	//Buscar Linea de pedido y si es la misma eliminar, despues achicar la lista (remove)
	public void eliminarLineaPedido(OrderLine lineaPedido) {
		for(articulos a : )
	}
	
	public void get(int position) {
		//TODO Obtener artÃ­culo de la lista
		
	}

}
