/*
 * Tipo Barco
 * 
 * Propiedades basicas
 * Tamanho
 * Tipo: int 
 * Cons: Si
 * Mod: Si
 * 
 * Propiedades Derivadas
 * No hay
 * 
 * Propiedades compartidas
 * No hay
 * 
 * Get and Set 
 * Tamanho 
 * public int getTamanho()
 * public void setTamanho(int tamanho)
 * 
 * Requisitos
 * Tamanho tiene que ser entre 0 y 5
 * 
 * Metodos anhadidos
 * No hay por el momento
 * 
 * 
 */


public class Barco {
	
	//Atributos
	private int tamanho;
	
	//Constructor
	public Barco () { //Por defecto
		tamanho = 0;
	}
	
	public Barco (int tamanho) { //Con parametros
		this.tamanho = tamanho;
	}
	
	public Barco (Barco cop) {
		this.tamanho = cop.getTamanho();
	}
	
	//Get and Set
	//Tamanho
	public int getTamanho() {
		return tamanho;
	}
	
	public void setTamanho(int tamanho) {
		this.tamanho = tamanho;
	}
	
	//Metodos de la clase object
	//toString
	@Override
	public String toString() {
		Integer t = tamanho;
		return t.toString();
	}
	
	//hashCode
	@Override
	public int hashCode() {
		return 7 * 13 * 21 * 10032 * tamanho + tamanho * 2;
	}
	
	//equals
	@Override
	public boolean equals(Object obj) {
		boolean res = false;
		
		if(this == obj) {
			res = true;
		}
		else if(obj != null && obj instanceof Barco) {
			Barco otro = (Barco)obj;
			
			if(this.tamanho == otro.getTamanho()) {
				res = true;
			}
		}
		return res;
	}
	
	//clone superficial
	@Override
	public Barco clone() {
		Barco copia = null;
		
		try {
			copia = (Barco) super.clone();
		}
		catch(CloneNotSupportedException err){
			System.out.println("Objeto no clonado");
		}
		return copia;
	}
	
	//compareTo
	//Se compara por su tamanho
	// -1 El primero es menor que el segundo
	// 0 ambos son iguales
	// 1 el primero es mayor que el segundo
	public int compareTo(Barco otro) {
		int res = -1;
		
		if(this.tamanho == otro.getTamanho()) {
			res = 0;
		}
		else if(this.tamanho > otro.getTamanho()) {
			res = 1;
		}
		return res;
	}
}

