/*
 * PersonaImp
 * Propiedades basicas
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
 * fechaNacimiento
 * Tipo: FechaImp
 * Cons: Si
 * Mod: Si
 * 
 * Genero
 * Tipo: char
 * Cons: Si
 * Mod: Si
 * 
 * Salario
 * Tipo: int
 * Cons: Si
 * Mod: Si
 * 
 * Propiedades Derivadas
 * multiplicarSalario
 * Tipo: int
 * Cons: Si
 * Mod: No
 * 
 * Propiedades compartidas
 * No hay
 * 
 * Get and Set
 * Nombre
 * public String getNombre();
 * public void setNombre(String nombre);
 * 
 * Apellidos
 * public String getApellidos();
 * public void setApellidos(String apellidos);
 * 
 * fechaNacimiento
 * public FechaImp getFechaNacimiento();
 * public void setFechaNacimiento(FechaImp fechaNacimiento);
 * 
 * Genero
 * public char getGenero();
 * public void setGenero(char genero);
 * 
 * Salario
 * public int getSalario();
 * public void setSalario(int salario);
 * 
 * multiplicarSalario
 * public int multiplicarSalario();
 * 
 * Requisitos
 * La edad se calculará con la fecha de nacimiento de la persona.
 * El género solo puede ser H o M.
 * Cada persona debe tener un salario entre 1000 y 2000, ambos inclusivos.
 */

import java.util.Calendar;
public class PersonaImp implements Persona, Cloneable {
	
	//Atributos
	private String nombre;
	private String apellidos;
	private FechaImp fechaNacimiento;
	private char genero;
	private int salario;
	
	//Constructor
	public PersonaImp () { //Por defecto
		nombre = " ";
		apellidos = " ";
		fechaNacimiento = new FechaImp();
		genero = ' ';
		salario = 0;
	}
	
	public PersonaImp(String nombre, String apellidos, int dia, int mes, int anio, char genero, int salario) { //Con parametros
		this.nombre = nombre;
		this.apellidos = apellidos;
		this.fechaNacimiento = new FechaImp(dia, mes, anio);
		this.genero = genero;
		this.salario = salario;
	}
	
	public PersonaImp(PersonaImp cop) { //De copia
		this.nombre = cop.getNombre();
		this.apellidos = cop.getApellidos();
		this.fechaNacimiento = cop.fechaNacimiento;
		this.genero = cop.getGenero();
		this.salario = cop.getSalario();
	}
	
	//Get and set
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
	
	//fechaNacimiento
	//Patron delegacion
	//Dia
	public int getDiaPersona() {
		return fechaNacimiento.getDia();
	}
	
	public void setDiaPersona(int dia) {
		try {
			fechaNacimiento.setDia(dia);
		}
		catch(ExcepcionFecha err){
			System.out.println("El dia no es valido");
		}
	}

	//Mes
	public int  getMesPersona() {
		return fechaNacimiento.getMes();
	}
	
	public void setMesPersona(int mes) {
		try {
			fechaNacimiento.setMes(mes);
		}
		catch(ExcepcionFecha err){
			System.out.println("El mes no es valido");
		}
		
	}
	
	//Anio
	public int getAnioPersona() {
		return fechaNacimiento.getAnio();
	}
	
	public void setAnioPersona(int anio) {
		try {
			fechaNacimiento.setAnio(anio);
		}
		catch(ExcepcionFecha err){
			System.out.println("El anio no es valido");
		}
		
	}
	
	//Genero
	public char getGenero() {
		return genero;
	}
	
	public void setGenero(char genero) throws ExcepcionPersona {
		if(genero == 'H' || genero == 'M') {
			this.genero = genero;
		}
		else {
			throw new ExcepcionPersona("El genero solo puede ser H para hombre y M para mujer");
		}
		
	}
	
	//Salario
	public int getSalario() {
		return salario;
	}
	
	public void setSalario(int salario)throws ExcepcionPersona  {
		if(salario >= 1000 && salario <= 2000) {
			this.salario = salario;
		}
		else {
			throw new ExcepcionPersona("El salario debe estar entre 1000 y 2000");
		}
		
	}
	
	//Edad
	public int getEdad() {
		//instantiate variable whith current date
		Calendar fecha = Calendar.getInstance();

		//get year current
		int anioActual = fecha.get(Calendar.YEAR);

		return anioActual - this.getAnioPersona();
    }
	
	//multiplicarSalario
	public double multiplicarSalario () {
		final double RELEVANCIA = 0.15;
		return salario * RELEVANCIA;
	}
	
	//Metodos de la clase object
	//toString
	@Override
	public String toString() {
		return nombre + " , " + apellidos + " , " + fechaNacimiento.toString() + " , " + genero + " , " + salario;
	}
	
	//hashCode
	@Override
	public int hashCode() {
		return fechaNacimiento.hashCode() + salario * nombre.hashCode() * 7;
	}
	
	//Equals
	@Override
	public boolean equals (Object obj) {
		boolean res = false;
		
		if(this == obj) {
			res = true;
		}
		
		else if(obj != null && obj instanceof PersonaImp) {
				  PersonaImp otro = (PersonaImp) obj;
				  
				  if(this.nombre == otro.getNombre() &&
				     this.apellidos == otro.getApellidos()) {
						 res = true;
					 }
			  }
		return res;
	}
	
	//Clone
	@Override
	public PersonaImp clone() {
		PersonaImp copia = null;
		
		try {
			copia = (PersonaImp) super.clone();
		}
		catch(CloneNotSupportedException err) {
			System.out.println("Objeto no clonado");
		}
		return copia;
	}
	
	//Clone en profundidad
	public PersonaImp deepClone() {
		PersonaImp copia = null;
		
		try {
			copia = (PersonaImp) super.clone();
			copia.fechaNacimiento = new FechaImp(this.fechaNacimiento);
		}
		catch(CloneNotSupportedException err) {
			System.out.println("Objeto no clonado");
		}
		return copia;
	}
	
	//No necesira compareTo
}

