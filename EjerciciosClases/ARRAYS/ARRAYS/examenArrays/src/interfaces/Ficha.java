package interfaces;
/*
 * Tipo Ficha
 * Propiedades Basicas
 * NombreAspirante
 * Tipo: String
 * Cons: Si
 * Mod: Si
 * 
 * IDAspirante
 * Tipo: int
 * Cons: Si
 * Mod: No
 * 
 * Calificaciones
 * Tipo: int[]
 * Cons: Si
 * Mod: No
 * 
 * Propiedades Derivadas
 * No hay
 * 
 * Propiedades Compartidas
 * Acumulador
 * Tipo: int
 * Cons: Si
 * Mod: No
 * 
 * Get and Set
 * NombreAspirante
 * public String getNombreAspirante()
 * public void setNombreAspirante(String nombre)
 * 
 * IDAspirante
 * public int getIDAspirante() 
 * 
 * Calificaciones
 * public int[] getCalificaciones()
 * 
 * Requisitos:
 * IDAspirante tiene que ser secuencial
 */

public interface Ficha {
	
	 //NombreAspirante
	 public String getNombreAspirante();
	 public void setNombreAspirante(String nombre);
	  
	 //IDAspirante
	 public int getIDAspirante();
	  
	 //Calificaciones
	 public int[] getCalificaciones();
	 
	 //nota
	 public int nota();
}
