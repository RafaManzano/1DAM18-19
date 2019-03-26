package clases;
/*
 * FichaImp
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
 * 
 * Metodos anhadidos
 * Por el momento no
 */
import interfaces.Ficha;

public class FichaImp implements Ficha, Cloneable, Comparable<FichaImp> {

	//Atributos
	private int IDAspirante = 1000;
	private String nombreAspirante;
	private int[] notas;
	private static int contadorAspirante = 0;
	
	//Constructor
	public FichaImp() { //Por defecto
		IDAspirante = contadorAspirante++;
		nombreAspirante = "NoDefinido";
		notas = new int[10];
	}
	
	public FichaImp(String nombreAspirante, int[] notas) { //Con parametros
		IDAspirante = contadorAspirante++;
		this.nombreAspirante = nombreAspirante;
		this.notas = notas;
	}
	
	public FichaImp(FichaImp cop) { //De copia //Aunque sea una copia sera un nuevo objeto
		IDAspirante = contadorAspirante++;
		this.nombreAspirante = cop.getNombreAspirante();
		this.notas = cop.getNotas();
	}
	
	//Get and Set
	//IDAspirante
	@Override
	public int getIDAspirante() {
		return IDAspirante;
	}

	//nombreAspirante
	@Override
	public String getNombreAspirante() {
		return nombreAspirante;
	}

	@Override
	public void setNombreAspirante(String nombreAspirante) {
		this.nombreAspirante = nombreAspirante;
	}

	@Override
	public int[] getNotas() {
		return notas;
	}

	@Override
	public int calcularNota() {
		int notaFinal = 0;
		
		for (int i = 0; i < notas.length; i++) {
			notaFinal += notas[i];
		}
		
		return notaFinal;
	}
	
	//Metodos de la clase object
	//toString
	@Override
	public String toString() {
		return IDAspirante + ", " + nombreAspirante + ", " + calcularNota();
	}
	
	//hashCode
	@Override
	public int hashCode() {
		return IDAspirante * 7 * calcularNota() * 21 + nombreAspirante.hashCode();
	}
	
	//equals
	@Override
	public boolean equals(Object obj) {
		boolean res = false;
		
		if(this == obj) {
			res = true;
		}
		else if(obj != null && obj instanceof FichaImp) {
				FichaImp otro = (FichaImp) obj;
				
				if(IDAspirante == otro.getIDAspirante()) {
					res = true;
				}
			 }
		
		return res;
	}
	
	//clone
	@Override
	public FichaImp clone() {
		FichaImp copia = null;
		
		try {
			copia = (FichaImp) super.clone();
		}
		catch(CloneNotSupportedException err) {
			System.out.println("Objeto no clonado");
		}
		
		return copia;
	}
	
	//compareTo
	public int compareTo(FichaImp otro) {
		int comparacion = -1;
		
		if(this.IDAspirante == otro.getIDAspirante()) {
			comparacion = 0;
		}
		else if(this.IDAspirante > otro.getIDAspirante()) {
			comparacion = 1;
		}
		
		return comparacion;
	}
	

}
