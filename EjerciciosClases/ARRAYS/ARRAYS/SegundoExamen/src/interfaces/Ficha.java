package interfaces;

/*
 * Ficha
 * Propiedades basicas
 * IDAspirante
 * Tipo: int
 * Cons: Si
 * Mod: No
 * 
 * nombreAspirante
 * Tipo: String
 * Cons: Si
 * Mod: Si
 * 
 * Notas
 * Tipo: int[]
 * Cons: Si
 * Mod: No
 * 
 * Propiedades derivadas
 * CalcularNota
 * Tipo: int
 * Cons: Si
 * Mod: No
 * 
 * Propiedades Compartidas
 * contadorAspirantes
 * Tipo: int
 * Cons: Si
 * Mod: No
 * 
 * Get and Set
 * IDAspirante
 * public int getIDAspirante()
 * 
 * Nombre
 * public String getNombreAspirante()
 * public void setNombreAspirante(String nombreAspirante)
 * 
 * Notas
 * public int[] getNotas()
 * 
 * CalcularNota
 * public int calcularNota()
 * 
 * Requisitos
 * IDAspirante tiene que ser 1000 y secuencial
 */
public interface Ficha {

	 //IDAspirante
	 public int getIDAspirante();
	  
	 //Nombre
	 public String getNombreAspirante();
	 public void setNombreAspirante(String nombreAspirante);
	  
	 //Notas
	 public int[] getNotas();
	  
	 //CalcularNota
	 public int calcularNota();
}
