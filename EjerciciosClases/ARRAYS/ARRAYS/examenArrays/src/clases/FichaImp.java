package clases;

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

import interfaces.Ficha;

public class FichaImp implements Ficha, Cloneable, Comparable<FichaImp> {
	
	//Atributos
	private int IDAspirante;
	private String nombreAspirante;
	private int[] calificaciones;
	private static int acumulador = 1000;
	
	//Constructor
	public FichaImp() { //Por Defecto
		IDAspirante = acumulador++;
		nombreAspirante = "NoDefinido";
		int[] calificaciones = new int[10];
	}
	
	public FichaImp(String nombreAspirante, int[] calificaciones) { //Por parametros
		IDAspirante = acumulador++;
		this.nombreAspirante = nombreAspirante;
		this.calificaciones = calificaciones;
	}
	
	public FichaImp(FichaImp cop) { //De copia, Seria un nuevo objeto 
		IDAspirante = acumulador++;
		this.nombreAspirante = cop.getNombreAspirante();
		this.calificaciones = cop.getCalificaciones();
	}

	//Get and Set
	//nombreAspirante
	public String getNombreAspirante() {
		return nombreAspirante;
	}

	public void setNombreAspirante(String nombreAspirante) {
		this.nombreAspirante = nombreAspirante;
	}

	//IDAspirante
	public int getIDAspirante() {
		return IDAspirante;
	}

	//Calificaciones
	public int[] getCalificaciones() {
		return calificaciones;
	}
	
	//Metodos de la clase object
	//toString
	@Override
	public String toString() {
		return IDAspirante + ", " +  nombreAspirante + ", "  + nota();
	}
	
	//hashCode
	@Override
	public int hashCode() {
		return IDAspirante * 7 * 21 * nombreAspirante.hashCode();
	}
	
	//equals
	//La comparacion seria si tiene el mismo ID es el mismo objeto
	@Override
	public boolean equals(Object obj) {
		boolean res = false;
		
		if(this == obj) {
			res = true;
		}
		else if(obj != null && obj instanceof FichaImp) {
			FichaImp otro = (FichaImp) obj;
			
			if(this.IDAspirante == otro.getIDAspirante()) {
				res = true;
			}
		}
		
		return res;
	}
	
	//clone
	@Override
	public FichaImp clone()  {
		FichaImp copia = null;
		
		try {
			copia = (FichaImp)super.clone();
		}
		catch(CloneNotSupportedException err) {
			System.out.println("Objeto no clonado");
		}
		
		return copia;
	}
	
	//compareTo
	//0 Tiene la misma ID
	//1 El primer elemento es mayor que el segundo elemento
	//-1 El primer elemento es menor que el segundo elemento
	
	public int compareTo(FichaImp otro) {
		int comparar = -1;
		
		if(this.IDAspirante == otro.getIDAspirante()) {
			comparar = 0;
		}
		else if(this.IDAspirante > otro.getIDAspirante()) {
			comparar = 1;
		}
		
		return comparar;
	}
	
	/*
	 * Interfaz
	 * Nombre: Nota
	 * Comentario: Este subprograma suma las notas de las calificaciones
	 * Cabecera: public int nota()
	 * Precondiciones: No hay
	 * Entrada: No hay
	 * Salida: int nota
	 * E/S: No hay
	 * Postcondiciones: Asociado al nombre. El resultado de la nota total
	 */
	
	public int nota() {
		int nota = 0;
		for(int i = 0; i < calificaciones.length; i++) {
			nota += calificaciones[i];
		}
		
		return nota;
	}

}
