/*
 * PersonaImp
 * 
 * Propiedades Basicas
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
 * FechaNacimiento
 * Tipo: FechaImp
 * Cons: Si
 * Mod: No
 * 
 * Sexo
 * Tipo: TipoSexo
 * Cons: Si
 * Mod: Si
 * 
 * NumeroPie
 * Tipo: int 
 * Cons: Si
 * Mod: Si
 * 
 * Propiedades derivadas
 * Edad
 * Tipo: int
 * Cons: Si
 * 
 * Propiedades compartidas
 * No hay
 * 
 * Get and Set
 * Nombre
 * public String getNombre()
 * public void setNombre(String nombre)
 * 
 * Apellidos
 * pubilc String getApellidos()
 * public void setApellidos(String apellidos)
 * 
 * FechaNacimiento
 * public FechaImp getFechaNacimiento()
 * 
 * Sexo
 * public TipoSexo getSexo()
 * public void setSexo(TipoSexo sexo)
 * 
 * NumeroPie
 * public int getNumeroPie()
 * public void setNumeroPie(int numeroPie)
 * 
 * Edad
 * public int getEdad()
 * 
 * Requisitos
 * numeroPie esta entre 15 y 58
 * fechaNacimiento tiene que ser valido
 */


public class PersonaImp {
	//Atributos
	private String nombre;
	private String apellidos;
	private FechaImp fechaNacimiento;
	private TipoSexo sexo;
	private int numeroPie;
	
	//Constructor
	public PersonaImp() { //Por defecto
		nombre = "NODEFINIDO";
		apellidos = "NODEFINIDO";
		fechaNacimiento = new FechaImp();
		sexo = TipoSexo.NODEFINIDO;
		numeroPie = 0;
	}
	
	public PersonaImp(String nombre, String apellidos, int dia, int mes, int anio, TipoSexo sexo, int numeroPie) { //Con parametros
		this.nombre = nombre;
		this.apellidos = apellidos;
		this.fechaNacimiento = new FechaImp(dia, mes, anio);
		this.sexo = sexo;
		this.numeroPie = numeroPie;
	}
	
	public PersonaImp(PersonaImp cop) { //De copia
		this.nombre = cop.getNombre();
		this.apellidos = cop.getApellidos();
		this.fechaNacimiento = new FechaImp(cop.getFechaNacimiento());
		this.sexo = cop.getSexo();
		this.numeroPie = cop.getNumeroPie();
	}
	
	//Get and Set
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
  
	//FechaNacimiento
	public FechaImp getFechaNacimiento() {
		return fechaNacimiento;
	}
  
	//Sexo
	public TipoSexo getSexo() {
		return sexo;
	}
	
	public void setSexo(TipoSexo sexo) {
		this.sexo = sexo;
	}
  
	//NumeroPie
	public int getNumeroPie() {
		return numeroPie;
	}
	
	public void setNumeroPie(int numeroPie) {
		this.numeroPie = numeroPie;
	}
  
	//Edad
	public int getEdad() {
		int edad = 0;
		
		return edad;
	}
}

