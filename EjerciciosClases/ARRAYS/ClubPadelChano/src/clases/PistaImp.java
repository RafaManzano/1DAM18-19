package clases;

import excepciones.ExcepcionPista;
import interfaces.Pista;

/*
 * Interfaz PistaImp
 * 
 * Propiedades basicas
 * NumeroPista
 * Tipo: int
 * Cons: Si
 * Mod: No
 * 
 * Socio
 * Tipo: SocioImp
 * Cons: Si
 * Mod: Si
 * 
 * Hora
 * Tipo: int
 * Cons: Si
 * Mod: Si
 * 
 * Rechazada
 * Tipo: boolean
 * Cons: Si
 * Mod: Si
 * 
 * Propiedades derivadas
 * No hay
 * 
 * Propiedades compartidas
 * No hay
 * 
 * Get and Set
 * //NumeroPista
 * public int getNumeroPista();
 *	
 * //Socio
 * public SocioImp getSocio();
 * public void setSocio(SocioImp socio);
 *	
 * //Hora
 * public int getHora();
 * public void setHora(int hora);
 *	
 * //Rechazada
 * public boolean getRechazada();
 * public void setRechazada(boolean rechazada);
 * 
 * Requisitos
 * NumeroPista es de 1 a 10
 * Hora de 0 a 23
 * 
 * Metodos anhadidos
 * No hay
 */

public class PistaImp implements Pista, Cloneable {

	//Atributos
	private int numeroPista;
	private SocioImp socio;
	private int hora;
	private boolean rechazada;
	
	//Constructor
	public PistaImp () { //Por defecto
		numeroPista = 0; 
		socio = new SocioImp();
		hora = -1;
		rechazada = false;
	}
	
	public PistaImp(int numeroPista, SocioImp socio, int hora, boolean rechazada) { //Con parametros
		this.numeroPista = numeroPista;
		this.socio = socio;
		this.hora = hora;
		this.rechazada = rechazada;
	}
	
	public PistaImp(PistaImp cop) {
		this.numeroPista = cop.getNumeroPista();
		this.socio = cop.getSocio();
		this.hora = cop.getHora();
		this.rechazada = cop.getRechazada();
	}
	
	//Get and Set
	//NumeroPista
	public int getNumeroPista() {
		return numeroPista;
	}
	
	//Socio
	public SocioImp getSocio() {
		return socio;
	}

	public void setSocio(SocioImp socio) {
		this.socio = socio;
	}

	//Hora
	public int getHora() {
		return hora;
	}

	public void setHora(int hora) throws ExcepcionPista{
		if(hora >= 0 && hora <= 23) {
			this.hora = hora;
		}
		else {
			throw new ExcepcionPista("La hora tiene que ser de 0 a 23");
		}
	}

	//Rechazada
	public boolean getRechazada() {
		return rechazada;
	}

	public void setRechazada(boolean rechazada) {
		this.rechazada = rechazada;
	}
	
	//Metodos de la clase object
	//toString
	@Override
	public String toString() {
		return numeroPista + ", " + socio + ", " + hora + ", " + rechazada;
	}

	//hashCode
	@Override
	public int hashCode() {
		return hora * numeroPista * 7 * socio.hashCode() * 13;
	}

	//equals
	@Override
	public boolean equals(Object obj) {
		boolean ret = false;
		
		if (this == obj) {
			ret = true;
		}
		else if(obj != null && obj instanceof PistaImp) {
			PistaImp otro = (PistaImp) obj;
			
			if(numeroPista == otro.getNumeroPista()) {
				ret = true;
			}
		}
		
		return ret;
	}
	
	//clone
	@Override
	public PistaImp clone() {
		PistaImp copia = null;
		
		try {
			copia = (PistaImp) super.clone();
		}
		catch(CloneNotSupportedException err) {
			System.out.println("Objeto no clonado");
		}
		
		return copia;
	}
	
	//No necesita clone en profundidad
	//No necesita compareTo
	
	
	
	
}
