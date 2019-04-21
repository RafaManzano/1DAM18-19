package clases;

import interfaces.Persona;

/*
 * Interfaz
 * Propiedades basicas
 * DNI
 * Tipo: String
 * Cons: Si
 * Mod: No
 * 
 * Nombre
 * Tipo: String
 * Cons: Si
 * Mod: Si
 * 
 * Apellidos
 * Tipo: String
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
 * DNI
 * public String getDNI()
 * 
 * Nombre
 * public String getNombre()
 * public void setNombre(String nombre)
 * 
 * Apellidos
 * public String getApellidos()
 * public void setApellidos(String apellidos)
 * 
 * Requisitos
 * No hay
 * 
 * Metodos anhadidos 
 * No hay, de momento
 */

public class PersonaImp implements Persona, Cloneable {

	//Atributos
	private String dni;
	private String nombre;
	private String apellidos;
	
	public PersonaImp() { //Por defecto
		dni = "VACIO";
		nombre = "VACIO";
		apellidos = "VACIO";
	}
	
	public PersonaImp(String dni, String nombre, String apellidos) {
		this.dni = dni;
		this.nombre = nombre;
		this.apellidos = apellidos;
	}
	
	public PersonaImp(PersonaImp cop) {
		this.dni = cop.getDNI();
		this.nombre = cop.getNombre();
		this.apellidos = cop.getApellidos();
	}
	
	//DNI
	public String getDNI() {
		return dni;
	}

	//Nombre
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	//Apellidos
	public String getApellidos() {
		return apellidos;
	}

	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}
	
	//Metodos de la clase Object
	//toString
	@Override
	public String toString() {
		return dni + ", " + nombre + ", " + apellidos;
	}
	
	//hashCode
	@Override
	public int hashCode() {
		return dni.hashCode() + nombre.hashCode() * apellidos.hashCode() * 21;
	}
	
	//equals
	@Override
	public boolean equals(Object obj) {
		boolean res = false;
		
		if(this == obj) {
			res = true;
		}
		else if(obj != null && obj instanceof PersonaImp) {
				PersonaImp otro = (PersonaImp) obj;
				if(this.dni == otro.getDNI()) {
					res = true;
				}
			 }
		return res;
	}

	//clone
	@Override
	public PersonaImp clone() {
		PersonaImp copia = null;
		
		try {
			copia = (PersonaImp) super.clone();
		}
		catch(CloneNotSupportedException err) {
			err.printStackTrace();
		}
		
		return copia;
	}
	
	//No necesita deepClone
	//No necesita compareTo
}
