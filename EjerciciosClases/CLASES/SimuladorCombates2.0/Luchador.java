/*
 * Clase Luchador
 * 
 * Propiedades basicas
 * Nombre
 * Tipo: String 
 * Cons: Si
 * Mod: Si
 * 
 * Ataques
 * Tipo: Ataques[]
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
 * Ataques
 * 	public []Ataques getAtaques()
 *  public void setAtaques ([]Ataques ataques)
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
 * Restricciones
 *  - Vida tiene que estar entre 60 y 100
 * 	- Ataque entre 1 y 10
 * 	- Defensa entre 1 y 10
 * 
 * Metodos añadidos
 * De momento no hay
 * 
 */


public class Luchador {
	
	//Atributos
	private String nombre;
	private Ataque[] array = new Ataque[3];
	private int vida;
	private int ataque;
	private int defensa;
	private String habilidad;

	//Constructor
	public Luchador () { //Por defecto
		nombre = "SinNombre";
		array[0] = null;
		array[1] = null;
		array[2] = null;
		array[3] = null;
		vida = 0;
		ataque = 0;
		defensa = 0;
		habilidad = "Ninguna";
	}
	
	public Luchador (String nombre, Ataque[] array, int vida, int ataque, int defensa, String habilidad) { //Con parametros
		this.nombre = nombre;
		this.array[0] = array[0];
		this.array[1] = array[1];
		this.array[2] = array[2];
		this.array[3] = array[3];
		this.vida = vida;
		this.ataque = ataque;
		this.defensa = defensa;
		this.habilidad = habilidad;
	}
	
	public Luchador (Luchador copia) { //Con parametros
		this.nombre = copia.getNombre();
		this.array = copia.getAtaques();
		this.vida = copia.getVida();
		this.ataque = copia.getAtaque();
		this.defensa = copia.getDefensa();
		this.habilidad = copia.getHabilidad();
	}
	
	//Get and Set
	
	//Metodos
}

