/*
 * Clase Luchador
 * 
 * Propiedades basicas
 * Nombre
 * Tipo: String 
 * Cons: Si
 * Mod: Si
 * 
 * Movimiento
 * Tipo: Ataque[]
 * Cons: Si
 * Mod: Si
 * 
 * Vida
 * Tipo: int
 * Cons: Si
 * Mod: Si
 * 
 * Ataque
 * Tipo: int 
 * Cons: Si
 * Mod: Si
 * 
 * Defensa
 * Tipo: int
 * Cons: Si
 * Mod: Si
 * 
 * Habilidad
 * Tipo: String
 * Cons: Si
 * Mod: Si
 * 
 * Descripcion
 * Tipo: String
 * Cons: Si
 * Mod: Si
 * 
 * Propiedades Derivadas
 * No hay

 * Propiedades Compartidas
 * No hay
 * 
 * Get and Set
 * Nombre
 * 	public String getNombre()
 *  public void setNombre (String nombre)
 * 
 * Movimiento
 * 	public []Ataque getMovimiento()
 *  public void setMovimiento([]Ataque movimiento)
 * 
 * Vida
 * 	public int getVida()
 *  public void setVida (int vida)
 * 
 * Ataque
 * 	public int getAtaque()
 *  public void setAtaque (int ataque)
 * 
 * Defensa
 * 	public int getDefensa()
 *  public void setDefensa (int defensa)
 * 
 * Habilidad
 * 	public String getHabilidad()
 *  public void setHabilidad (String habilidad)
 * 
 * Descripcion
 * 	public String getDescripcion()
 * 	public void setDescripcion (String descripcion)
 * 
 * Restricciones
 *  - Vida tiene que estar entre 60 y 100
 * 	- Ataque entre 1 y 10
 * 	- Defensa entre 1 y 10
 * 
 * Metodos añadidos
 * De momento no hay
 * 
 */

package Clases;

public class Luchador implements Cloneable, Comparable<Luchador> {
	
	//Atributos
	private String nombre;
	private Ataque[] movimiento;
	private int vida;
	private int ataque;
	private int defensa;
	private String habilidad;
	private String descripcion;

	//Constructor
	public Luchador () { //Por defecto
		nombre = "SinNombre";
		movimiento = null;
		vida = 0;
		ataque = 0;
		defensa = 0;
		habilidad = "Ninguna";
		descripcion = "Ninguna";
	}
	
	public Luchador (String nombre, Ataque[] movimiento, int vida, int ataque, int defensa, String habilidad, String descripcion) { //Con parametros
		this.nombre = nombre;
		this.movimiento = movimiento;
		this.vida = vida;
		this.ataque = ataque;
		this.defensa = defensa;
		this.habilidad = habilidad;
		this.descripcion = descripcion;
	}
	
	public Luchador (Luchador copia) { //Con parametros
		this.nombre = copia.getNombre();
		this.movimiento = copia.getMovimiento();
		this.vida = copia.getVida();
		this.ataque = copia.getAtaque();
		this.defensa = copia.getDefensa();
		this.habilidad = copia.getHabilidad();
		this.descripcion = copia.getDescripcion();
	}
	
	//Get and Set
	//Nombre
	/**
	 * get del atributo nombre
	 * @return nombre del Luchador
	 */
	public String getNombre() {
		return nombre;
	}
	
	/**
	 * set del atributo nombre
	 * @param nombre Nombre del Luchador
	 */
	public void setNombre (String nombre) {
		this.nombre = nombre;
	}
	
	//Movimiento
	/**
	 * get del atributo Movimiento
	 * @return Los movimientos del Luchador
	 */
	public Ataque[] getMovimiento() {
		return movimiento;
	}
	
	/**
	 * set del atributo movimiento
	 * @param movimiento Los movimientos del Luchador
	 */
	public void setMovimiento(Ataque[] movimiento) {
		this.movimiento = movimiento;
	}
	
	//Vida
	/**
	 * get del atributo vida
	 * @return Un entero que muestra la vida
	 */
	public int getVida() {
		return vida;
	}
	
	/**
	 * set del atributo vida
	 * @param vida Un entero que es la vida del Luchador
	 */
	public void setVida(int vida) {
		this.vida = vida;
	}
	
	//Ataque
	/**
	 * get del atributo ataque
	 * @return Un entero que es el ataque del Luchador
	 */
	public int getAtaque() {
		return ataque;
	}
	
	/**
	 * set del atributo ataque 
	 * @param ataque Un entero que es el ataque del Luchador
	 */
	public void setAtaque(int ataque) {
	//throws ExcepcionLuchador {
		//if (ataque > 1 && ataque <= 20) {
		this.ataque = ataque;
		//}
		
		//else {
		//	throw new ExcepcionLuchador("El ataque es de 1 a 20");
		//}
	}
	
	//Defensa
	/**
	 * get del atributo defensa
	 * @return Un entero que es el defensa del Luchador
	 */
	public int getDefensa() {
		return defensa;
	}
	
	/**
	 * set del atributo defensa
	 * @param defensa Un entero que es el defensa del Luchador
	 */
	public void setDefensa(int defensa) {
	//throws ExcepcionLuchador{
		//if (defensa > 1 && defensa <= 20) {
			this.defensa = defensa;
		//}
		
		//else {
			//throw new ExcepcionLuchador("El defensa es de 1 a 20");
		//}
	}
	
	//Habilidad
	/**
	 * get del atributo habilidad
	 * @return Un String que es el nombre de la habilidad del Luchador
	 */
	public String getHabilidad() {
		return habilidad;
	}
	
	/**
	 * set del atributo habilidad
	 * @param habilidad Un String que es el nombre de la habilidad del Luchador
	 */
	public void setHabilidad(String habilidad) {
		this.habilidad = habilidad;
	}
	
	//Descripcion
	/**
	 * get del atributo descripcion
	 * @return Un String que es la descripcion de la habilidad del Luchador
	 */
	
	public String getDescripcion() {
		return descripcion;
	}
	
	/**
	 * set del atributo descripcion
	 * @param descripcion Un String que es la descripcion de la habilidad del Luchador
	 */
	public void setDescripcion (String descripcion) {
		this.descripcion = descripcion;
	}
	
	//Metodos
	//Metodos de la clase object 
	//toString
	@Override
	public String toString () {
		return nombre + ", " + movimiento + ", " + vida + ", " + ataque +  ", " + defensa + " y " + habilidad;
	}
	
	//hashCode
	@Override
	public int hashCode() {
		return 910021 * vida - defensa + 109 * ataque - vida + 101;
	}
	
	//Equals
	@Override
	public boolean equals (Object obj) {
		boolean res = false;
		
		if (this == obj) {
			res = true;
		}
		
		else if (obj != null && obj instanceof Luchador) {
			Luchador otro = (Luchador)obj;
			
			if (this.nombre == otro.getNombre() &&
				this.movimiento == otro.getMovimiento() &&
				this.vida == otro.getVida() &&
				this.ataque == otro.getAtaque() &&
				this.defensa == otro.getDefensa() &&
				this.habilidad == otro.getHabilidad()) {
					res = true;
				}
		}
		return res;
	}
	
	//Clone
	@Override
	public Luchador clone() {
		Luchador copia = null;
		
		try {
			copia = (Luchador)super.clone();
		}
		catch(CloneNotSupportedException error) {
			System.out.println("Objeto no clonado");
		}
		return copia;
	}
	
	//compareTo
	//Comparamos por vida, ataque y defensa
	// 0 igual vida, igual ataque, igual defensa
	// 1 el primero es mayor en vida o ataque o defensa que el segundo
	// -1 el primero es menor en vida o ataque o defensa que el segundo
	// 2 los luchadores no son comparables puestos que sus estadisticas son muy diferentes

	public int compareTo(Luchador otro) {
		int res = 2;
		
		if(this.vida == otro.getVida() && this.ataque == otro.getAtaque() && this.defensa == otro.getDefensa()) {
			res = 0;
		}
		else if (this.vida < otro.getVida() || (this.vida == otro.getVida() &&  this.ataque < otro.getAtaque()) || (this.vida == otro.getVida() && (this.ataque == otro.getAtaque()) && this.defensa < otro.getDefensa())) {
			res = 1;
		}
			else if(this.vida > otro.getVida() || (this.vida == otro.getVida() &&  this.ataque > otro.getAtaque()) || (this.vida == otro.getVida() && (this.ataque == otro.getAtaque()) && this.defensa > otro.getDefensa())) {
				res = -1;
			}
		
		return res;
	}
	
	//Metodos anhadidos
	public String getNombreMov(int numero) {
		return movimiento[numero].getNombre();
	}
	
	public void setNombreMov(String nombre, int numero) {
		movimiento[numero].setNombre(nombre);
	}
	
	public int getDanioMov(int numero) {
		return movimiento[numero].getDanio();
	}
	
	public void setDanioMov(int danio, int numero) {
		movimiento[numero].setDanio(danio);
	}
	
	public boolean getEstadisticaMov(int numero) {
		return movimiento[numero].getEstadistica();
	}
	
	public void setNombreMov(boolean estadistica, int numero) {
		movimiento[numero].setEstadistica(estadistica);
	}
}

