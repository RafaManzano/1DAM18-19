package main.java.util;

public class ListaArticulos 
{	

	private Articulo primero = null;
		
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
	public void addArticulo(Articulo articulo) 
	{
	    Articulo aux;
	    aux = primero;

	    if (primero == null) 
	    {
	    	primero = articulo;
	    } 
	    else 
	    {
	        aux = primero;

	        while (aux.getNext() != null) 
	        {
	            aux = aux.getNext();
	        }

	        aux.setNext(articulo);
	        articulo.setPrevious(aux);
	    }
	}
	
	/*
	 *Interfaz
	 * cabecera: public void insert(Articulo articulo, int position)
	 * comentario: este metodo añade un articulo en la posicion indicada a la lista articulos 
	 * Precondiciones: no hay
	 * Entradas: Articulo articulo, int position
	 * Salidas: no hay
	 * E/S: no hay
	 * Postcondiciones: el articulo queda añadido en su posicion 
	 */
	public void insert(Articulo articulo, int position) 
	{
		Articulo siguiente;
		Articulo aux;
		
		int tamanio = contarArticulosLista();
        if(position>=0 && position<=tamanio){            
            if(position == 0){               
                articulo.setNext(primero);
                primero = articulo;
            }
            else{                
                if(position == tamanio){
                    aux = primero;                   
                    while(aux.getNext() != null){
                        aux = aux.getNext();
                    }                    
                    aux.setNext(articulo);              
                }
                else{                   
                    aux = primero;                   
                    for (int i = 0; i < (position-1); i++) {
                        aux = aux.getNext();
                    }
                    siguiente = aux.getNext();
                    aux.setNext(articulo);
                    articulo.setNext(siguiente);
                }
            }
            tamanio++;
        }
	}	
	
	/*
	 * Interfaz
	 * 
	 * Comentario: Este subprograma elimina un articulo de la lista
	 * Cabecera: public void remove(Articulo articulo)
	 * Precondiciones: No hay
	 * Entrada: - Articulo articulo //El articulo a eliminar
	 * Salida: No hay
	 * E/S: No hay
	 * Postcondiciones: El articulo quedaria eliminado de la lista
	 */
	 
	public void remove(Articulo articulo)
	{
		Articulo aux;
		Articulo ant;
        if (primero != null){
            aux = primero;
            ant = null;
            while (aux != null){
	            if (aux == articulo ){
	                if (ant == null){
	                    primero = primero.getNext();
	                    aux.setNext(null);
	                    aux= primero;
	               
	                }else {
	                    ant.setNext(aux.getNext());
	                    aux.setNext(null);
	                    aux = ant.getNext();
	                }                                             
	                }else{
	                    ant = aux;
	                    aux = aux.getNext();
	                }
            }
        }          
	}
	
	
	/*
	 * Interfaz
	 * 
	 * Comentario: este metodo obtiene un artículo de la lista
	 * Cabecera: public Articulo get(int position) 
	 * Precondiciones: No hay
	 * Entrada: int position 
	 * Salida: Articulo articulo
	 * E/S: No hay
	 * Postcondiciones: AN devuelve el atriculo de la posicion indicada como parametro
	 */
	public Articulo get(int position) 
	{
		Articulo articulo = null;

		if(contarArticulosLista() > position){
			articulo = primero;
			for(int i = 0; i < position; i++){
				articulo = articulo.getNext();
			}
		}

		return articulo;
	}
	
	/*
	 * Interfaz
	 * 
	 * Comentario: este metodo pinta los articulos de la lista
	 * Cabecera: public void pintarArticulasDeLista()
	 * Precondiciones: lista llena
	 * Entrada: no hay
	 * Salida: no  hay
	 * E/S: No hay
	 * Postcondiciones: no hay,solo pinta los articulpos de la lista
	 */
	public void pintarArticulasDeLista() {
		Articulo iterador = primero;

		while( iterador != null ) {
			System.out.println(iterador.toString());
			iterador = iterador.getNext(); 
		}
	}
	
	
	/*
	 * Interfaz
	 * 
	 * Comentario: este metodo sirve para contar los registros que tiene la lista
	 * Cabecera: public int contarArticulosLista()
	 * Precondiciones: lista llena
	 * Entrada: no hay
	 * Salida: entero cantidad de articulos
	 * E/S: No hay
	 * Postcondiciones: AN devuelve la cantidad de articulos que tiene la lista
	 */
	public int contarArticulosLista() {
		Articulo iterador = primero;
		int contador = 0;
		while( iterador != null ) {
			contador++;
			iterador = iterador.getNext(); 
		}
		return contador;
	}
}
