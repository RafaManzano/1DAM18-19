/*
 * Nombre de la clase: Persona
 * 
 * Propiedades Basicas
 * 
 * Nombre
 * Tipo: String
 * Cons: Si
 * Mod: Si
 * 
 * Edad
 * Tipo: Int
 * Cons: Si 
 * Mod: Si
 * 
 * DNI
 * Tipo: String
 * Cons: Si
 * Mod: No
 * 
 * Sexo
 * Tipo: TipoSexo
 * Cons: Si 
 * Mod: Si
 * 
 * Peso
 * Tipo: Int
 * Cons: Si
 * Mod: Si
 * 
 * Altura
 * Tipo: Int
 * Cons: Si
 * Mod: Si
 *     
 * Propiedades Derivadas
 * No hay
 * 
 * Propiedades Compartidas 
 * ID 
 * Tipo: Int
 * Cons: Si
 * Mod: No
 * 
 * Get and Set
 * Nombre
 * public String getNombre()
 * public void setNombre (String newNombre)
 * 
 * Edad
 * public int getEdad()
 * public void setEdad(int newEdad)
 * 
 * DNI
 * public String getDNI()
 * 
 * Sexo
 * public TipoSexo getSexo()
 * public void setSexo (TipoSexo newSexo)
 * 
 * Peso
 * public int getPeso()
 * public void setPeso(int newPeso)
 * 
 * Altura
 * public int getAltura()
 * public void setAltura(int newAltura)
 * 
 * ID 
 * public int getID()
 * 
 * Resticciones
 * Edad mayor que 0
 * Peso mayor que 0
 * Altura mayor que 0
 * 
 * Metodos añadidos
 * Por el momento nada
 */


public class Persona implements Cloneable {
	
	//Atributos
	private String nombre;
	private int edad;
	private String DNI;
	private TipoSexo sexo;
	private int peso;
	private int altura;
	private static int sumaid = 1;
	private int id;
	
	//Constructores
	public Persona() { //Por defecto
		nombre = " ";
		edad = 0;
		DNI = " ";
		sexo = sexo.NODEFINIDO;
		peso = 0;
		altura = 0;
		id = sumaid++;
	}
	
	public Persona(String nombre, int edad, String DNI, TipoSexo sexo, int peso, int altura) { //Con parametros
		this.nombre = nombre;
		this.edad = edad;
		this.DNI = DNI;
		this.sexo = sexo;
		this.peso = peso;
		this.altura = altura;
		id = sumaid++;
	}
	
	public Persona (Persona copia) { //De copia
		this.nombre = copia.getNombre();
		this.edad = copia.getEdad();
		this.DNI = copia.getDNI();
		this.sexo = copia.getSexo();
		this.peso = copia.getPeso();
		this.altura = copia.getAltura();
		this.id = sumaid++;
	}
	
	//Get and Set
	//Nombre
	public String getNombre() {
		return nombre;
	}
	
	public void setNombre (String nombre) {
		this.nombre = nombre;
	}
	
	//Edad
	public int getEdad() {
		return edad;
	}
	
	public void setEdad (int edad) {
		this.edad = edad;
	}
	
	//DNI
	public String getDNI() {
		return DNI;
	}
	
	//Sexo
	public TipoSexo getSexo() {
		return sexo;
	}
	
	public void setSexo (TipoSexo sexo) {
		this.sexo = sexo;
	}
	
	//Peso
	public int getPeso() {
		return peso;
	}
	
	public void setPeso (int peso) throws ExcepcionPersona {
		
		if (peso > 0) {
		this.peso = peso;
		}
		
		else {
			throw new ExcepcionPersona ("El peso tiene que ser mayor que 0");
		}
	}
	
	//Altura
	public int getAltura() {
		return altura;
	}
	
	public void setAltura (int altura) throws ExcepcionPersona {
		
		if (altura > 0) {
		this.altura = altura;
		}
			
		else {
			throw new ExcepcionPersona ("La altura debe ser mayor a 0");
		}		
	}
	
	//ID
	public int getID() {
		return id;
	}
	
	//Metodos de la clase object
	//toString
	@Override
	public String toString () {
		return id + " " + nombre + " " + edad + " " + DNI + " " + sexo + " " + peso + " " + altura;
	}
	
	//hashCode
	@Override
	public int hashCode () {
		return 1892544 * id - edad + peso * altura * 200 - 10;
	}
	
	//Equals
	@Override
	public boolean equals (Object obj) {
		boolean res = false;
		
		//1. Comprobamos que obj no es el mismo objeto, si lo es, devolveremos true
		if (this == obj) {
			res = true;
		}
		
		//2. Comprobamos que obj no vale null (no esta instanciado) y que pertenece es el mismo tipo de dato, si no, devolveremos false
		else if (obj != null && obj instanceof Persona) {
			
			//3. Casteamos obj al tipo de dato
			Persona otro = (Persona)obj;
			
			//4. Comparamos los atributos uno a uno y si todos coinciden, devolveremos true
			if (this.nombre == otro.getNombre() &&
				this.id == otro.getID() &&
				this.edad == otro.getEdad() &&
				this.DNI == otro.getDNI() &&
				this.sexo == otro.getSexo() &&
				this.peso == otro.getPeso() &&
				this.altura == otro.getAltura()) {
					res = true;
			}
		}
		return res;
	}
	
	//clone
	@Override
	public Persona clone() {
		Persona copia = null;
		
		try {
			copia = (Persona)super.clone();
		}
		catch (CloneNotSupportedException error) {
			System.out.println("Objeto no clonado");
		}
	return copia;
	}
	
	//compareTo
	//Comparamos a las personas por su altura 
	// -1 primera persona mas baja que la segunda
	// 0 las personas tienen la misma estatura
	// 1 la primera persona es mas alta que la segunda
	

	public int compareTo(Persona segunda) {
		int res = -1;
		
		if (this.getAltura() > segunda.getAltura()) {
			res = 1;
		}
		else if (this.getAltura() == segunda.getAltura()) {
			res = 0;
		}
		return res;
	}
		
	
}

