package interfaces;

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

public interface Persona {

	 //DNI
	 public String getDNI();
	 
	 //Nombre
	 public String getNombre();
	 public void setNombre(String nombre);
	 
	 //Apellidos
	 public String getApellidos();
	 public void setApellidos(String apellidos);
}
