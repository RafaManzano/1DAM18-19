package clases;

import interfaces.Casilla;

/*
 * Tipo CasillaImp
 * Propiedades basicas
 * 
 * Nombre
 * Tipo: String
 * Cons: Si
 * Mod: Si
 * 
 * Calle
 * Tipo: Calle
 * Cons: Si
 * Mod: No
 * 
 * Ayuda
 * Tipo: Ayuda
 * Cons: Si
 * Mod: No
 *  
 * goPrision
 * Tipo: boolean
 * Cons: Si
 * Mod: Si
 */
public class CasillaImp implements Casilla {
	//Atributos
	private String nombre;
	private Calle calle;
	private Ayuda ayuda;
	private boolean prision;
	
	//Constructor
	//Por defecto
	public CasillaImp () { 
		nombre = " ";
		calle = new Calle();
		ayuda = new Ayuda();
		prision = false;
	}
	
	//Constructor con parametros Nombre y prision
	public CasillaImp(String nombre, boolean prision) {
		this.nombre = nombre;
		this.prision = prision;
	}
	
	//Constructor con el parametro calle
	public CasillaImp(Calle calle) {
		this.calle = calle;
	}
	
	//Constructor con el parametro ayuda
	public CasillaImp(Ayuda ayuda) {
		this.ayuda = ayuda;
	}
	
	//Constructor copia
	public CasillaImp(CasillaImp cop) {
		this.nombre = cop.getNombre();
		this.calle = cop.getCalle();
		this.ayuda = cop.getAyuda();
		this.prision = cop.getgoPrision();
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
	
	//Calle
	public Calle getCalle() {
		return calle;
	}
	
	//Ayuda
	public Ayuda getAyuda() {
		return ayuda;
	}
	
	//Prision
	@Override
	public boolean getgoPrision() {
		return prision;
	}
	
	@Override
	public void setgoPrision(boolean prision) {
		this.prision = prision;
	}
	
	//Metodos de la clase object
	//toString
	@Override
	public String toString() {
		return nombre + " , " + calle.toString() + " , " + ayuda.toString() + " , " + prision;
	}
	
	//hashCode
	@Override
	public int hashCode() {
		return calle.hashCode() * ayuda.hashCode() + nombre.hashCode() * 133;
	}
	
	/*
	//equals
	@Override
	public boolean equals(Object obj) {
		boolean res = false;
		
		if(this == obj) {
			res = true;
		}
		
		else if(obj != null && obj instanceof CasillaImp) {
			CasillaImp otro = (CasillaImp) obj;
			
			if()
		}
	}
	*/
}
