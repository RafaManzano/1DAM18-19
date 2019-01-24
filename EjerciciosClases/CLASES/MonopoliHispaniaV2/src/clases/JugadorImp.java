package clases;

import enumerados.TipoNombreFicha;
import interfaces.Jugador;

/*
 * Interfaz Jugador
 * Propiedades Basicas 
 * Nombre
 * Tipo: String
 * Cons: Si
 * Mod: Si
 * 
 * NombreFicha
 * Tipo: TipoNombreFicha
 * Cons: Si
 * Mod: Si
 * 
 * Dinero
 * Tipo: int 
 * Cons: Si
 * Mod: Si
 * 
 * Calles
 * Tipo: Calle[]
 * Cons: Si 
 * Mod: Si
 * 
 * Ayudas
 * Tipo: Ayuda[]
 * Cons: Si
 * Mod: Si
 */

public class JugadorImp implements Jugador {

	//Atributos
	private String nombre;
	private TipoNombreFicha nombreFicha;
	private int dinero;
	private Calle[] calles;
	private Ayuda[] ayudas;
	
	//Constructor
	public JugadorImp () { //Por defecto
		nombre = " ";
		nombreFicha = nombreFicha.NODEFINIDO;
		dinero = 0;
		calles = null;
		ayudas = null;
	}
	
	public JugadorImp (String nombre, TipoNombreFicha nombreFicha, int precio, Calle[] calles, Ayuda[] ayudas) { //Con parametros
		this.nombre = nombre;
		this.nombreFicha = nombreFicha;
		this.dinero = precio;
		this.calles = calles;
		this.ayudas = ayudas;
	}
	
	public JugadorImp (JugadorImp cop) { //De copia
		this.nombre = cop.getNombre();
		this.nombreFicha = cop.getNombreFicha();
		this.dinero = cop.getDinero();
		this.calles = cop.getCalles();
		this.ayudas = cop.getAyudas();
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

	//NombreFicha
	@Override
	public TipoNombreFicha getNombreFicha() {
		return nombreFicha;
	}

	@Override
	public void setNombreFicha(TipoNombreFicha nombreFicha) {
		this.nombreFicha = nombreFicha;
	}

	//Dinero
	@Override
	public int getDinero() {
		return dinero;
	}

	@Override
	public void setDinero(int dinero) {
		this.dinero = dinero;
	}

	//Calles
	@Override
	public Calle[] getCalles() {
		return calles;
	}

	@Override
	public void setCalles(Calle[] calles) {
		this.calles = calles;
	}
	
	//Ayudas
	@Override
	public Ayuda[] getAyudas() {
		return ayudas;
	}

	@Override
	public void setAyuda(Ayuda[] ayudas) {
		this.ayudas = ayudas;
	}
	
	
	//Metodos de la clase object
	//toString
	@Override
	public String toString() {
		return nombre + " , " + nombreFicha + " , " + dinero + " , " + calles.toString() + " , " + ayudas.toString();
	}
	
	//hashCode
	@Override
	public int hashCode() {
		return dinero + nombre.hashCode() * calles.hashCode() * nombreFicha.hashCode() * 7;
	}
	
	//equals
	@Override
	public boolean equals (Object obj) {
		boolean res = false;
		
		if(this == obj) {
			res = true;
		}
		
		else if(obj != null && obj instanceof JugadorImp) {
			JugadorImp otro = (JugadorImp) obj;
			
			if(this.nombre == otro.getNombre()) {
				res = true;
			}
		}
		return res;
	}
	
	//Clone Superficial
	@Override
	public JugadorImp clone() {
		JugadorImp copia = null;
		
		try {
			copia = (JugadorImp) super.clone();
		}
		catch(CloneNotSupportedException err) {
			System.out.println("Objeto no clonado");
		}
		return copia;
	}
	
	//No necesito clone en profundidad
	
	//No necesito compareTo
	
	




	

}
