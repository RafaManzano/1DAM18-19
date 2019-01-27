package clases;
import interfaces.Tablero;

/*
 * Interfaz Tablero
 * Propiedades basicas
 * Casillas
 * Tipo: CasillaImp[]
 * Cons: Si
 * Mod: Si
 * 
 * Propiedades derivadas
 * No hay
 * 
 * Propiedades Compartidas
 * No hay
 * 
 * Get and Set
 * Casillas
 * public CasillaImp[] getCasillas();
 * public void setCasillas (CasillaImp [] casillas)
 * 
 * Requisitos
 * No hay
 * 
 * Metodos anhadidos 
 * Por el momento no hay
 */
public class TableroImp implements Tablero {

	//Atributos
	private CasillaImp[] casillas;
	
	//Constructor
	public TableroImp () { //Por defecto
		casillas = null;
	}
	
	public TableroImp (CasillaImp[] casillas) { //Con parametros
		this.casillas = casillas;
	}
	
	public TableroImp (TableroImp cop) { //De copia
		this.casillas = cop.getCasillas();
	}
	
	//Get and Set
	@Override
	public CasillaImp[] getCasillas() {
		return casillas;
	}

	@Override
	public void setCasillas(CasillaImp[] casillas) {
		this.casillas = casillas;
	}
	
	//Metodos de la clase object
	//toString
	@Override
	public String toString () {
		return casillas.toString();
	}
	
	//hashCode
	@Override
	public int hashCode() {
		return casillas.hashCode() + 7 * 1003201 + 25 * 1001;
	}
	
	//equals
	@Override
	public boolean equals (Object obj) {
		boolean res = false;
		
		if(this == obj) {
			res = true;
		}
		
		else if(obj != null && obj instanceof TableroImp) {
			TableroImp otro = (TableroImp) obj;
			
			if(this.casillas == otro.getCasillas()) {
				res = true;
			}
		}
		
		return res;
	}
	
	//clone
	public TableroImp clone() {
		TableroImp copia = null;
		
		try {
			copia = (TableroImp) super.clone();
		}
		catch(CloneNotSupportedException err) {
			System.out.println("Objeto no clonado");
		}
		return copia;
	}
	
	//No necesitamos deepClone ni compareTo
	
}
