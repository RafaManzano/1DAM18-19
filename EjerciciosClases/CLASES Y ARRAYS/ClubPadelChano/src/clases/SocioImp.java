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
 * Mod: Si
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
 */

public class SocioImp implements Socio {

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
		return res;
		
	}

}
