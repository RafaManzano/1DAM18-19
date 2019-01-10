/*
 * Nombre de la clase: Ataque
 * 
 * Propiedades basicas:
 * 	Nombre:
 * 	- Tipo: String
 * 	- Cons: Si
 * 	- Mod: Si
 * 
 * 	Danio:
 * 	- Tipo: int
 * 	- Cons: Si
 * 	- Mod: Si
 * 
 * 	Fallo:
 * 	- Tipo: int 
 * 	- Cons: Si
 * 	- Mod: Si
 * 
 * Propiedades derivadas:
 * 	No hay
 * 
 * Propiedades compartidas:
 * 	No hay
 * 
 * Get and Set
 * Nombre
 * 	public String getNombre()
 *  public void setNombre (String nombre)
 * 
 * Danio
 * 	public int getDanio()
 *  public void setDanio (int danio)
 * 
 * Fallo
 * 	public int getFallo()
 *  public void setFallo (int fallo)
 * 
 * Restricciones
 *  - Danio tiene que ser entre 1 y 20
 * 	- Fallo entre 1 y 10
 * 
 * Metodos añadidos
 * 	No hay
 * 
 */


public class Ataque implements Cloneable, Comparable<Ataque> {
	
	//Atributos
	private String nombre;
	private int danio;
	private int fallo;
	
	//Constructores
	public Ataque () { //Por defecto
		nombre = "SinNombre";
		danio = 0;
		danio = 0;
	}
	
	public Ataque (String nombre, int danio, int fallo) { //Con parametros
		this.nombre = nombre;
		this.danio = danio;
		this.fallo = fallo;
	}
	
	public Ataque (Ataque c) { //De copia
		this.nombre = c.getNombre();
		this.danio = c.getDanio();
		this.fallo = c.getFallo();
	}
	
	//Get and Set
	//Nombre
		public String getNombre() {
			return nombre;
		}
		
		public void setNombre (String nombre) {
			this.nombre = nombre;
		}
  
   //Danio
		public int getDanio() {
			return danio;
		}
		
		public void setDanio (int danio) throws ExcepcionAtaque {
			if (danio < 1 || danio > 20) {
				throw new ExcepcionAtaque("El danio tiene que estar entre 1 y 20");
			}
			else {
			this.danio = danio;
			}
		}
  
   //Fallo
		public int getFallo() {
			return fallo;
		}
		
		public void setFallo (int fallo) throws ExcepcionAtaque {
			if (fallo < 1 || fallo > 10) {
				throw new ExcepcionAtaque("El fallo tiene que estar entre 1 y 10");
			}
			else {
			this.fallo = fallo;
			}
		}
   
	//Metodos
	//Metodos de la clase object 
	//toString
	@Override
	public String toString () {
		return nombre + ", " + danio + " y " + fallo;
	}
	
	//hashCode
	@Override
	public int hashCode() {
		return 9103521 * danio - fallo + 1230 - danio * 10;
	}
	
	//Equals
	@Override
	public boolean equals (Object o) {
		boolean res = false;
		
		if (this == o) {
			res = true;
		}
		
		else if (o != null && o instanceof Ataque) {
			Ataque otro = (Ataque)o;
			
			if (this.nombre == otro.getNombre() &&
				this.danio == otro.getDanio() &&
				this.fallo == otro.getFallo()) {
					res = true;
				}
		}
		return res;
	}
	
	//Clone
	@Override
	public Ataque clone() {
		Ataque copia = null;
		
		try {
			copia = (Ataque)super.clone();
		}
		catch(CloneNotSupportedException error) {
			System.out.println("Objeto no clonado");
		}
		return copia;
	}
	
	//compareTo
	//Comparamos por el danio
	// 0 Mismo danio
	// 1 el primero es mayor en danio que el segundo
	// -1 el primero es menor en danio que el segundo

	public int compareTo(Ataque otro) {
		int res = - 1;
		
		if(this.danio == otro.getDanio()) {
			res = 0;
		}
		else if (this.danio > otro.getDanio()) {
			res = 1;
		}
		
		return res;
	}
}

