/*
 * Tipo CasillaImp
 * Propiedades basicas
 * Dibujo
 * Tipo: String
 * Cons: Si
 * Mod: Si
 * 
 * Barco
 * Tipo: Barco
 * Cons: Si
 * Mod: No
 * 
 * Propiedades derivadas
 * No hay
 * 
 * Propiedades compartidas
 * No hay
 * 
 * Get and Set
 * Dibujo
 * public String getDibujo()
 * public void setDibujo(String dibujo)
 * 
 * Barco
 * public Barco getBarco() 
 * public void setBarco(Barco barco)
 * 
 * Requisitos
 * No hay
 * 
 * Metodos anhadidos
 * No hay
 * 
 */


public class CasillaImp {
	
	//Atributos
	private String dibujo;
	private BarcoImp barco;
	
	//Constructor
	public CasillaImp () { //Por defecto
		dibujo = "[]";
		barco = new BarcoImp();
	}
	
	public CasillaImp (String dibujo, int id, int tamanho) { //Con parametros de barco
		this.dibujo = dibujo;
		this.barco = new BarcoImp(id, tamanho); 
	}
	
	public CasillaImp (String dibujo) { //Con parametros para dibujo
		this.dibujo = dibujo;
	}
	
	public CasillaImp (CasillaImp cop) {
		this.dibujo = cop.getDibujo();
		this.barco = new BarcoImp(barco); //Preguntar y cambiar circulo
	}
	
	//Get and Set
	//Dibujo
	public String getDibujo() {
		return dibujo;
	}
	
	public void setDibujo(String nombre) {
		this.dibujo = dibujo;
	}
	
	//Patron delegacion
	//ID
	
	public int getIDBarco() {
		return barco.getID();
	}
	
	//Tamanho
	
	public int getTamanho() {
		return barco.getTamanho();
	}
	
	
	public void setTamanho(int tamanho) {
		barco.setTamanho(tamanho);
	}
	
	//Metodos de la clase Object
	//toString
	@Override
	public String toString() {
		return dibujo + barco.toString();
	}
	
	//hashCode
	@Override
	public int hashCode() {
		return 17 * barco.getTamanho() + 3 * 101;
	}
	
	//equals
	@Override
	public boolean equals(Object obj) {
		boolean res = false;
		
		if(this == obj) {
			res = true;
		}
		
		else if(obj != null && obj instanceof CasillaImp) {
			CasillaImp otro = (CasillaImp) obj;
			
			if(this.dibujo == otro.getDibujo()) {
				res = true;
			}
		}
		return res;
	}
	
	//clone
	@Override
	public CasillaImp clone() {
		CasillaImp copia = null;
		
		try {
			copia = (CasillaImp)super.clone();
		}
		catch(CloneNotSupportedException err) {
			System.out.println("Objeto no clonado");
		}
		return copia;
	}
	
	//deepClone
	public CasillaImp deepClone() {
		CasillaImp copia = null;
		try {
			copia = (CasillaImp) super.clone();
			copia.barco = new BarcoImp(this.barco);
		}
		catch(CloneNotSupportedException error) {
			System.out.println("Objeto no clonado");
		}
		return copia;
	}
	
	//No necesito compareTo
}

