package clases;
import excepciones.ExcepcionBarco;
import interfaces.Barco;

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
 * Tamanho tiene que ser entre 1 y 5
 * 
 * Metodos anhadidos
 * No hay por el momento
 * 
 * 
 */


public class BarcoImp implements Barco {
	
	//Atributos
	private int tamanho;
	
	//Constructor
	public BarcoImp () { //Por defecto
		tamanho = 0;
	}
	
	public BarcoImp (int tamanho) { //Con parametros
		this.tamanho = tamanho;
	}
	
	public BarcoImp (Barco cop) { //De copia
		this.tamanho = cop.getTamanho();
	}
	
	//Get and Set
	//Tamanho
	@Override
	public int getTamanho() {
		return tamanho;
	}
	
	@Override
	public void setTamanho(int tamanho) throws ExcepcionBarco {
		if(tamanho > 0 && tamanho < 6) {
			this.tamanho = tamanho;
		}
		else {
			throw new ExcepcionBarco("El tamanho del barco es de 1 a 5");
		}
	}
	
	//Metodos de la clase object
	//toString
	@Override
	public String toString() {
		return "" + tamanho;
	}
	
	//hashCode
	@Override
	public int hashCode() {
		return 7 * 13 * 21 * 10032 * tamanho + tamanho;
	}
	
	//equals
	@Override
	public boolean equals(Object obj) {
		boolean res = false;
		
		if(this == obj) {
			res = true;
		}
		else if(obj != null && obj instanceof BarcoImp) {
			BarcoImp otro = (BarcoImp)obj;
			
			if(this.tamanho == otro.getTamanho()) {
				res = true;
			}
		}
		return res;
	}
	
	//clone superficial
	@Override
	public BarcoImp clone() {
		BarcoImp copia = null;
		
		try {
			copia = (BarcoImp) super.clone();
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
	public int compareTo(BarcoImp otro) {
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

