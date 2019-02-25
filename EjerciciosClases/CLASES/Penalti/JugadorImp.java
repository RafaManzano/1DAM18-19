/*
 * JugadorImp
 * Propiedades basicas
 * Nombre
 * Tipo: String
 * Cons: Si
 * Mod: Si
 * 
 * Dorsal
 * Tipo: int
 * Cons: Si
 * Mod: Si
 * 
 * Decision
 * Tipo: int
 * Cons: Si
 * Mod: Si
 * 
 * Propiedades derivadas
 * No hay
 * 
 * Propiedades compartidas
 * ID
 * Tipo: int
 * Cons: Si
 * Mod: No
 * 
 * Get and Set
 * Nombre
 * public String getNombre()
 * public void setNombre (String nombre)
 * 
 * Dorsal
 * public int getDorsal() 
 * public void setDorsal(int dorsal) throws ExcepcionJugador
 * 
 * Decision
 * public int getDecision() 
 * public void setDecision(int decision) throws ExcepcionJugador
 * 
 * ID
 * public int getID()
 * 
 * Requisitos
 * Dorsal es de 1 a 99
 * Decision es de 1 a 3
 * 
 * 
 * Metodos anhadidos
 * public void cambiarJugador(String nombre, int dorsal)
 */


public class JugadorImp implements Jugador, Cloneable {
	//Atributos
	private String nombre;
	private int dorsal;
	private int decision;
	private int id;
	private static int acum = 1;
	
	//Constructor
	public JugadorImp() {
		nombre = "Ninguno";
		dorsal = 1;
		decision = 0;
		id = acum++;
	}
	
	public JugadorImp(String nombre, int dorsal, int decision) {
		this.nombre = nombre;
		this.dorsal = dorsal;
		this.decision = decision;
		id = acum++;
	}
	
	public JugadorImp(JugadorImp cop) {
		this.nombre = cop.getNombre();
		this.dorsal = cop.getDorsal();
		this.decision = cop.getDecision();
		id = acum++;
	}
	
	//Get and Set
	//Nombre 
	public String getNombre() {
		return nombre;
	}
	
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	//Dorsal
	public int getDorsal() {
		return dorsal;
	}
	
	public void setDorsal(int dorsal) throws ExcepcionJugador {
		if(dorsal >= 1 && dorsal <= 99) {
			this.dorsal = dorsal;
		}
		else {
			throw new ExcepcionJugador("Dorsal tiene que ser de 0 a 99");
		}
	}
	
	//Decision
	public int getDecision() {
		return decision;
	}
	
	public void setDecision(int decision) throws ExcepcionJugador {
		if(decision >= 1 && decision <= 3) {
			this.decision = decision;
		}
		else {
			throw new ExcepcionJugador("Decision tiene que ser desde 1 a 3");
		}
	}
	
	//ID
	public int getID() {
		return id;
	}
	
	//Metodos de la clase object
	//toString
	@Override
	public String toString() {
		return id + ", " + nombre + ", " + dorsal + ", " + decision;
	}
	
	//hashCode
	@Override
	public int hashCode() {
		return 7 * dorsal * nombre.hashCode() - 21 * decision;
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
	
	//Clone
	public JugadorImp clone() {
		JugadorImp copia = null;
		
		try {
			copia = (JugadorImp)super.clone();
		}
		catch(CloneNotSupportedException err) {
			System.out.println("Objeto no clonado");
		}
		return copia;
	}
	
	//No necesita clone en profundidad
	//No necesita compareTo
	
	//Metodos anhadidos
	/*
	 * Interfaz
	 * Nombre: cambiarJugador
	 * Comentario:  Este subprograma modifica el estado del objeto
	 * Cabecera: public void cambiarJugador(String nombre, int dorsal)
	 * Precondiciones: No hay
	 * Entrada: - String nombre
	 * 			- int dorsal
	 * Salida: No hay
	 * E/S: No hay
	 * Postcondiciones: Solo modifica el estado del objeto
	*/
	public void cambiarJugador(String nombre, int dorsal) {
		setNombre(nombre);
		try {
			setDorsal(dorsal);
		}
		catch(ExcepcionJugador err) {
			System.out.println("Solo de 1 a 99, al no ponerlo correctamente se queda el 1 por defecto");
		}
	}
}

