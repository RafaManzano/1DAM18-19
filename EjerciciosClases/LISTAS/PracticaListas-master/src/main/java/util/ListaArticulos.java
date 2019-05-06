package main.java.util;


import main.java.model.OrderLine;

public class ListaArticulos {
	
	//Atributos
	private Articulo principio;
	private Articulo ultimo;
	
	
	//Constructores
	public ListaArticulos() {
		principio = null;
		ultimo = null;
	}
	
	public ListaArticulos(Articulo principio, Articulo ultimo) {
		this.principio = principio;
		this.ultimo = ultimo;
		
	}
	
	public ListaArticulos(ListaArticulos cop) {
		this.principio = cop.getPrincipio();
		this.ultimo = cop.getUltimo();
	}
	
	//Get and Set
	//Principio
	public Articulo getPrincipio() {
		return principio;
	}

	public void setPrincipio(Articulo principio) {
		this.principio = principio;
	}

	//Ultimo
	public Articulo getUltimo() {
		return ultimo;
	}

	public void setUltimo(Articulo ultimo) {
		this.ultimo = ultimo;
	}
	
	//Metodos
	/*
	 * Interfaz
	 * Nombre: estaVacia
	 * Comentario: Este subprograma indica si la lista esta vacia
	 * Cabecera: public boolean estaVacia()
	 * Precondiciones: No hay
	 * Entrada: No hay
	 * Salida: boolean vacia //Devuelve si la lista esta vacia o no
	 * E/S: No hay
	 * Postcondiciones: Asociado al nombre, si devuelve true la lista esta vacia, por el contrario, si devuelve false la lista contiene elementos
	 */
	
    public boolean estaVacia() {
        boolean vacia = false;
        if (principio == null ) {
            vacia = true;
        }
        return vacia;
    }

	
	/*
	 * Interfaz
	 * Nombre: addArticulo
	 * Comentario: Este subprograma añade un articulo a la lista de articulos //Se inserta al final de la lista
	 * Cabecera: public void addArticulo(Articulo articulo)
	 * Precondiciones: No hay
	 * Entrada: - Articulo articulo //El articulo a anhadir
	 * Salida: No hay
	 * E/S: No hay
	 * Postcondiciones: El articulo queda insertado al final de la lista
	 */
	public void addArticulo(Articulo articulo) {
		Articulo puntero;
		
		if (estaVacia()) {
            principio = articulo;
        } 
        else {
        	puntero = principio;
        	
        	while(puntero.getNext() != null) {
        		puntero = puntero.getNext();
        	}
        	
        	puntero.setNext(articulo);
        	articulo.setPrevious(puntero);
        }
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
		Articulo ar = new Articulo(o);
		
		addArticulo(ar);
	}
	

	
	public void insert(Articulo articulo, int position) {
		//TODO Insertar el articulo en la posicion indicada
		
	}
	
	/*
	 * Interfaz
	 * Nombre: remove
	 * Comentario: Este subprograma elimina un articulo de la lista
	 * Cabecera: public void remove(Articulo articulo)
	 * Precondiciones: No hay
	 * Entrada: - Articulo articulo //El articulo a eliminar
	 * Salida: No hay
	 * E/S: No hay
	 * Postcondiciones: El articulo quedaria eliminado de la lista
	 */
	public void remove(Articulo articulo) {
		if (estaVacia()) {
            
        } 
        else {
        	while(principio.getNext() != null) {
        		principio = principio.getNext();
        		if(principio.equals(articulo)) {
        			principio.setNext(null);
        			principio.setPrevious(null);
        		}
        	}
        }
    }
	
	/*
	 * Interfaz
	 * Nombre: eliminarLineaPedido
	 * Comentario: Este subprograma elimina la linea de pedido del articulo
	 * Cabecera: public void eliminarLineaPedido (OrderLine lineaPedido)
	 * Precondiciones: No hay
	 * Entrada: - OrderLine lineaPedido //La linea de pedido a eliminar
	 * Salida: No hay
	 * E/S: No hay
	 * Postcondiciones: El articulo quedaria eliminado de la lista
	 */
	public void eliminarLineaPedido(OrderLine lineaPedido) {
		Articulo ar = new Articulo(lineaPedido);
		
		remove(ar);
	}
	
	/*
	 * Interfaz
	 * Nombre: obtenerPosicion
	 * Comentario:
	 * Cabecera: public void obtenerPosicion (int posicion)
	 * Precondiciones: 
	 * Entrada:
	 * Salida:
	 * E/S:
	 * Postcondiciones:
	 */
	public void obtenerPosicion(int position) {
		 if (principio != null){
             Articulo aux = principio;
         }  
		 
	     for (int cont = 0; cont < position; cont++){
	   
	     }
	}                    

}
