/*
 * EncuestaImp
 * 
 * Propiedades Basicas
 * Distrito
 * Tipo: TipoDistrito
 * Cons: Si
 * Mod: Si
 * 
 * Persona
 * Tipo: PersonaImp
 * Cons: Si
 * Mod: Si
 * 
 * Propiedades derivadas:
 * No hay
 * 
 * Propiedades compartidas:
 * ID
 * Tipo: int
 * Cons: Si
 * Mod: No
 * 
 * Get and Set
 * Distrito
 * public TipoDistrito getDistrito()
 * public void setDistrito(TipoDistrito distrito);
 * 
 * Persona
 * public PersonaImp getPersona();
 * public void setPersona(PersonaImp persona);
 * 
 * ID
 * public int getID();
 * 
 * Requisitos
 * No hay
 * 
 * Metodos anhadidos
 * De momento no hay
 */


public class EncuestaImp {
	//Atributos
	private int idEncuesta;
	private TipoDistrito distrito;
	private PersonaImp persona;
	private static int acum = 1;
	
	//Constructor
	public EncuestaImp() { //Por defecto
		idEncuesta = acum++; 
		distrito = distrito.NODEFINIDO;
		persona = new PersonaImp();
	}
	
	public EncuestaImp(TipoDistrito distrito, PersonaImp persona) { //Con parametros
		idEncuesta = acum++; 
		this.distrito = distrito;
		this.persona = persona;
	}
	
	public EncuestaImp (EncuestaImp cop) { //De copia
		idEncuesta = acum++;
		this.distrito = cop.getDistrito();
		this.persona = cop.getPersona();
	}
	
	//Get and Set
	//Distrito
	public TipoDistrito getDistrito() {
		return distrito;
	}
	
	public void setDistrito(TipoDistrito distrito) {
		this.distrito = distrito;
	}
	
	//Persona
	public PersonaImp getPersona() {
		return persona;
	}
	
	public void setPersona(PersonaImp persona) {
		this.persona = persona;
	}
	
	//ID
	public int getID() {
		return idEncuesta;
	}
	
	//Metodos de la clase object
	//toString
	@Override
	public String toString () {
		return idEncuesta + " , " + distrito.toString() + " , " + persona.toString();
	}
	
	//hashCode
	@Override
	public int hashCode() {
		return idEncuesta * 7 * persona.hashCode() * 21;
	}
	
	//equals
	@Override
	public boolean equals(Object obj) {
		boolean res = false;
		
		if(this == obj) {
			res = true;
		}
		
		else if(obj != null && obj instanceof EncuestaImp) {
			EncuestaImp otro = (EncuestaImp) obj;
			
			if(this.idEncuesta == otro.getID()) {
				res = true;
			}
		}
		
		return res;
	}
	
	//clone
	@Override
	public EncuestaImp clone() {
		EncuestaImp copia = null;
		
		try {
			copia = (EncuestaImp)super.clone();
		}
		catch(CloneNotSupportedException err) {
			System.out.println("Objeto no clonado");
		}
		return copia;
	}
	
	//No necesita clone en profundidad
	//No necesita compareTo
}

