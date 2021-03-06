package clases;

import interfaces.Socio;

/*
 * Interfaz SocioImp
 * Propiedades basicas
 * NumSocio
 * Tipo: int
 * Cons: Si
 * Mod. No
 * 
 * Apellidos
 * Tipo: String
 * Cons. Si
 * Mod: Si
 * 
 * Nombre
 * Tipo:
 * Cons: Si
 * Mod: Si
 * 
 * Cuota
 * Tipo: double
 * Cons: Si
 * Mod: Si
 * 
 * Edad
 * Tipo: int
 * Cons: Si
 * Mod: Si
 * 
 * Genero
 * Tipo: char
 * Cons: Si
 * Mod: Si
 * 
 * Propiedades Derivadas
 * No hay
 * 
 * Propiedades compartidas
 * AcumSocio
 * Tipo: int
 * Cons: Si
 * Mod: No
 * 
 * Get and Set
 * NumSocio
 * public int getNumSocio();
 * 
 * Apellidos
 * public String getApellidos();
 * public void setApellidos(String apellidos);
 * 
 * Nombre
 * public String getNombre();
 * public void setNombre(String nombre);
 * 
 * Cuota
 * public double getCuota();
 * public void setCuota(double cuota);
 * 
 * Edad
 * public int getEdad();
 * public void setEdad(int edad);
 * 
 * Genero
 * public char getGenero();
 *
 * Restricciones
 * Hacer
 *
 * Metodos anhadidos
 * No hay
 */

public class SocioImp implements Socio, Cloneable, Comparable<SocioImp> {

	//Atributos
	private int numSocio;
	private String apellidos;
	private String nombre;
	private double cuota;
	private int edad;
	private char genero;
	private static int acumSocio = 1;
	
	//Constructor
	public SocioImp() { //Por defecto
		numSocio = acumSocio++;
		apellidos = "NoDefinido";
		nombre = "NoDefinido";
		cuota = 0.0;
		edad = 0;
		genero = ' ';
	}
	
	public SocioImp(String apellidos, String nombre, double cuota, int edad, char genero) {//Con parametros
		numSocio = acumSocio++;
		this.apellidos = apellidos;
		this.nombre = nombre;
		this.cuota = cuota;
		this.edad = edad;
		this.genero = genero;
	}
	
	public SocioImp(SocioImp cop) {//De copia, la copia sera un nuevo objeto
		numSocio = acumSocio++;
		this.apellidos = cop.getApellidos();
		this.nombre = cop.getNombre();
		this.cuota = cop.getCuota();
		this.edad = cop.getEdad();
		this.genero = cop.getGenero();
	}
	
	//Get and Set
	//NumSocio
	public int getNumSocio() {

		return numSocio;
	}

	//Apellidos
	public String getApellidos() {

		return apellidos;
	}

	public void setApellidos(String apellidos) {

		this.apellidos = apellidos;
	}

	//Nombre
	public String getNombre() {

		return nombre;
	}

	public void setNombre(String nombre) {

		this.nombre = nombre;
	}

	//Cuota
	public double getCuota() {

		return cuota;
	}

	
	public void setCuota(double cuota) {

		this.cuota = cuota;
	}

	//Edad
	public int getEdad() {

		return edad;
	}

	
	public void setEdad(int edad) {

		this.edad = edad;
	}

	//Genero
	public char getGenero() {
		return genero;
	}
	
	//Metodos de la clase object
	//toString
	@Override
	public String toString() {
		return numSocio + ", " + apellidos + ", " + nombre + ", " + cuota + ", " + edad + ", " + genero;
	}
	
	//hashCode
	@Override
	public int hashCode() {
		return (int) (edad * cuota + apellidos.hashCode() * 7 + numSocio);
	}
	
	//equals
	@Override
	public boolean equals(Object obj) {
		boolean res = false;
		
		if(this == obj) {
			res = true;
		}
		else if(obj != null && obj instanceof SocioImp) {
			SocioImp otro = (SocioImp)obj;
			
			if(this.numSocio == otro.getNumSocio()) {
				res = true;
			}
		}
		
		return res;
		
	}
	
	//clone
	@Override
	public SocioImp clone() {
		SocioImp copia = null;
		
		try {
			copia = (SocioImp)super.clone();
		}
		catch(CloneNotSupportedException err) {
			System.out.println("Objeto no clonado");
		}
		return copia;
	}
	
	//No necesita clone en profundidad
	
	//compareTo
	public int compareTo(SocioImp otro) {
		int resultado = -1;
		
		if(this.numSocio == otro.getNumSocio()) {
			resultado = 0;
		}
		else if(this.numSocio > otro.getNumSocio()) {
			resultado = 1;
		}
		
		return resultado;
	}

}
