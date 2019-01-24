package clases;

import enumerados.TipoColor;
import interfaces.Carta;
/*
 * Interfaz
 * Propiedades Basicas
 * 
 * Nombre
 *   Tipo: String
 *   Cons: Si
 *   Mod: Si
 *   
 * Precio
 *   Tipo: int
 *   Cons: Si
 *   Mod: Si
 *   
 * Color
 *   Tipo: TipoColor
 *   Cons: Si
 *   Mod: Si
 *   
 * Vendida
 *   Tipo: boolean
 *   Cons: Si
 *   Mod: Si
 *   
 * Propiedades derivadas
 * No hay
 * 
 * Propiedades Compartidas
 * No hay
 * 
 * Get and Set
 * Nombre
 * public String getNombre()
 * public void setNombre(String nombre)
 * 
 * Precio
 * public int getPrecio()
 * public void setPrecio(int precio)
 * 
 * Color
 * public String getColor()
 * public void setColor(String Color)
 * 
 * Vendida
 * public boolean getVendida()
 * public void setVendida(boolean vendida)
 * 
 * Requisitos
 * Precio tiene que ser mayor que 0
 * Color tiene que ser marron, azul, rosa, naranja, rojo, amarillo, verde, negro
 * 
 * Metodos anhadidos
 * De momento ninguno, pero los hare
 */
public class Calle implements Carta, Cloneable {

	//Atributos
	private String nombre;
	private int precio;
	private TipoColor color;
	private boolean vendida;
	
	//Constructor
	public Calle () { //Por defecto
		nombre = " ";
		precio = 0;
		color = color.VACIO;
		vendida = false;
	}
	 
	public Calle (String nombre, int precio, TipoColor color, boolean vendida) { //Con parametros
		this.nombre = nombre;
		this.precio = precio;
		this.color = color;
		this.vendida = vendida;
	}
	
	public Calle(Calle cop) { //De copia
		this.nombre = cop.getNombre();
		this.precio = cop.getPrecio();
		this.color = cop.getColor();
		this.vendida = cop.getVendida();
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

	//Precio
	@Override
	public int getPrecio() {
		return precio;
	}

	@Override
	public void setPrecio(int precio) {
		this.precio = precio;
	}
	
	//Color
	public TipoColor getColor() {
		return color;
	}

	public void setColor(TipoColor color) {
		this.color = color;
	}

	//Vendida
	public boolean getVendida() {
		return vendida;
	}

	public void setVendida(boolean vendida) {
		this.vendida = vendida;
	}
	
	//Metodos de la clase object
	//toString
	@Override
	public String toString() {
		return nombre + " , " + precio + " , " + color + " , " + vendida;
	}
	
	//hashCode
	@Override
	public int hashCode() {
		return nombre.hashCode() + precio * color.hashCode() + 17;
	}
	
	//equals
	@Override
	public boolean equals (Object obj) {
		boolean res = false;
		if(this == obj) {
			res = true;
		}
		else if(obj != null && obj instanceof Calle) {
			Calle otro = (Calle)obj;
			
				if(this.nombre == otro.getNombre() &&
				   this.precio == otro.getPrecio() &&
				   this.color == otro.getColor()) {
				
					res = true;
				}
		}
	return res;
	}
	
	//clone Superficial
	public Calle clone() {
		Calle copia = null;
		
		try {
			copia = (Calle) super.clone();
		}
		catch(CloneNotSupportedException err) {
			System.out.println("Objeto no clonado");
		}
	return copia;
	}
	
	//No necesito compareTo
	
	//Metodos anhadidos

}
