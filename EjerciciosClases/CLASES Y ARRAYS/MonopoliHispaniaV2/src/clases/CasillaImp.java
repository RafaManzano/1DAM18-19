package clases;

import enumerados.TipoColor;
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

public class CasillaImp implements Casilla, Cloneable {
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
	
	//Clone en Superficie
	public CasillaImp clone( ) {
		CasillaImp copia = null;
		
		try {
			copia = (CasillaImp) super.clone();
		}
		catch(CloneNotSupportedException err) {
			System.out.println("Objeto no clonado");
		}
		return copia;
	}
	
	//No hace falta compareTo
	
	//Patron delegacion
	//Ayuda
	//Nombre
	public String getNombreAyuda() {
		return ayuda.getNombre();
	}

	
	public void setNombreAyuda(String nombre) {
		ayuda.setNombre(nombre);
	}
	
	//Descripcion
	public String getDescripcionAyuda() {
		return ayuda.getDescripcion();
	}

	
	public void setDescripcionAyuda(String descripcion) {
		ayuda.setDescripcion(descripcion);
	}
	
	//Precio
	public int getPrecioAyuda() {
		return ayuda.getPrecio();
	}

	public void setPrecioAyuda(int precio) {
		ayuda.setPrecio(precio);
	}
	
	//Calle
	//Nombre
		public String getNombreCalle() {
			return calle.getNombre();
		}

		
		public void setNombreCalle(String nombre) {
			calle.setNombre(nombre);
		}

		//Precio
		public int getPrecioCalle() {
			return calle.getPrecio();
		}

		
		public void setPrecioCalle(int precio) {
			calle.setPrecio(precio);
		}
		
		//Color
		public TipoColor getColor() {
			return calle.getColor();
		}

		public void setColor(TipoColor color) {
			calle.setColor(color);
		}

		//Vendida
		public boolean getVendida() {
			return calle.getVendida();
		}

		public void setVendida(boolean vendida) {
			calle.setVendida(vendida);
		}
		
}
