package clases;

import interfaces.Carta;

/*
 * Interfaz
 * Propiedades Basicas
 * Nombre
 *   Tipo: String
 *   Cons: Si
 *   Mod: Si
 *   
 * Descripcion
 * 	 Tipo: String
 * 	 Cons: Si
 *   Mod: Si
 *   
 * Precio
 *   Tipo: int
 *   Cons: Si
 *   Mod: Si
 *  
 * Propiedades derivadas
 * No hay
 * 
 * Propiedades compartidas
 * No hay
 * 
 * Get and Set
 * Nombre
 * public String getNombre()
 * public void setNombre(String nombre)
 * 
 * Descripcion
 * public String getDescripcion()
 * public void setDescripcion(String descripcion)
 * 
 * Precio
 * public int getPrecio()
 * public void setPrecio(int precio)
 * 
 * Requisitos
 * No hay
 * 
 * Metodos anhadidos
 * De momento ninguno, pero los hare
 */

public class Ayuda implements Carta, Cloneable, Comparable<Ayuda> {

	private String nombre; 
	private String descripcion;
	private int precio;
	
	public Ayuda() { //Por defecto
		nombre = " ";
		descripcion = " ";
		precio = 0;
	}
	
	public Ayuda (String nombre, String descripcion, int precio) { //Con parametros
		this.nombre = nombre;
		this.descripcion = descripcion;
		this.precio = precio;
	}
	
	public Ayuda (Ayuda cop) { //De copia
		this.nombre = cop.getNombre();
		this.descripcion = cop.getDescripcion();
		this.precio = cop.getPrecio();
	}
	
	//Get and Set
	//Nombre
	@Override
	public String getNombre() {
		return nombre;
	}

	@Override
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	//Descripcion
	public String getDescripcion() {
		return descripcion;
	}

	
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
	
	//Precio
	@Override
	public int getPrecio() {
		return precio;
	}

	@Override
	public void setPrecio(int precio) {
		this.precio = precio;
	}
	
	//Metodos de la clase object
	//toString
	@Override
	public String toString() {
		return nombre + " , " + descripcion + " , " + precio;
	}
	
	//hashCode
	@Override
	public int hashCode() {
		return nombre.hashCode() + descripcion.hashCode() * 17 * 21 + precio; 
	}
	
	//equals
	@Override
	public boolean equals(Object obj) {
		boolean res = false;
		
		if(this == obj) {
			res = true;
		}
		else if(obj != null && obj instanceof Ayuda) {
			Ayuda otro = (Ayuda) obj;
			
			if(this.nombre == otro.getNombre() &&
			   this.precio == otro.getPrecio()) {
				res = true;
			}
		}
		
		return res;
	}
	
	//clone Superficial
	@Override
	public Ayuda clone() {
		Ayuda copia = null;
		
		try {
			copia = (Ayuda)super.clone();
		}
		catch(CloneNotSupportedException err) {
			System.out.println("Objeto no clonado");
		}
		return copia;
	}
	
	//compareTo
	//-1 El nombre es distinto y el precio del primero es mas bajo que el segundo
	// 0 El nombre es igual y el precio tambien
	// 1 el nombre es distinto y su precio es mayor al segundo
	public int compareTo(Ayuda otro) {
		int res = -1;
		
		if(this.nombre == otro.getNombre() && this.precio == otro.getPrecio()) {
			res = 0;
		}
		else if(this.nombre != otro.getNombre() && this.precio > otro.getPrecio()) {
			res = 1;
		}
		return res;
	}
	
	//Metodos anhadidos
}
