/*
 * Clase Pez:
 * 	Propiedades Basicas:
 * 	nombre: String C M
 * 
 * 	Propiedades Derivadas:
 * 	No hay
 * 	
 * 	Propiedades Compartidas:
 * 	No hay
 * 
 * 	GET AND SET
 * 	Nombre
 * 	String getNombre();
 * 	void setNombre (String newNombre);
 * 	
 *  
*/
public class Pez implements Cloneable {
	
	//Atributos
	private String nombre;
	private static int numpeces = 0;
	
	//Constructor
	public Pez () {  //Por defecto
		nombre = " ";
		numpeces++;
	}
	
	public Pez (String nombre) { //Con parametros
		this.nombre = nombre;
		numpeces++;
	}
	
	public Pez (Pez c) { //De copia
		this.nombre = c.nombre;
		numpeces++;
	}
	
	//Metodos
	public String getNombre () {
		return this.nombre;
	}
	
	public void setNombre (String nombre) {
		this.nombre = nombre;
	}
	
	public int getNumPeces() {
		return numpeces;
	}
	
	@Override
	public Object clone () {
		Object objeto = null;
		try {
			objeto = super.clone();
		}
		catch (CloneNotSupportedException ex) {
			System.out.println("Error al duplicar");
		}
		return objeto;
	}
	
	@Override
	public boolean equals (Object obj) {
		boolean pez = false;
		if (this == obj) {
			pez = true;
		}
		
		else if (obj != null && obj instanceof Pez) {
			Pez elotro = (Pez)obj;
			if (this.nombre == elotro.getNombre())
					pez = true;
			}
				
		
		return pez;
	}
}

