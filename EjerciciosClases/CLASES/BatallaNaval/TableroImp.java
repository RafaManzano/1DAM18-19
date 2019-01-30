/*
 * Tipo TableroImp
 * Propiedades basicas
 * Tablero
 * Tipo:[][]Barco
 * Cons: Si
 * Mod: No
 * 
 * Propiedades Derivadas
 * No hay
 * 
 * Propiedades compartidas
 * No hay
 * 
 * Get and set
 * public Barco[][]	getTablero()
 * public void setTablero (Barco[][] tablero)
 * 
 * Metodos anhadidos
 * public Barco[][] cargarArray()
 */


public class TableroImp implements Cloneable {
	//Atributos
	private Barco[][] tablero;
	
	//Constructor
	public TableroImp () { //Por defecto
		tablero = null;
	}
	
	public TableroImp (Barco[][] tablero) { //Con parametros
		this.tablero = tablero;
	}
	
	public TableroImp(TableroImp cop) { //De copia
		this.tablero = cop.getTablero();
	}
	
	//Get and Set
	public Barco[][] getTablero() {
		return tablero;
	}
	
	public void setTablero(Barco[][] tablero) {
		this.tablero = tablero;
	}
	
	//Metodos de la clase object
	//toString
	@Override
	public String toString() {
		return tablero.toString();
	}
	
	//hashCode
	@Override
	public int hashCode() {
		return tablero.hashCode() * 7 * 2001 + 101;
	}
	
	//equals
	@Override
	public boolean equals(Object obj) {
		boolean res = false;
		
		if(this == obj) {
			res = true;
		}
		else if(obj != null && obj instanceof TableroImp) {
			TableroImp otro = (TableroImp) obj;
			if(this.tablero == otro.getTablero()) {
				res = true;
			}
		}
		return res;
	}
	
	//clone
	@Override
	public TableroImp clone() {
		TableroImp copia = null;
		
		try{
			copia = (TableroImp) super.clone();
		}
		catch(CloneNotSupportedException err) {
			System.out.println("Objeto no clonado");
		}
		
		return copia;
	}
	
	//No necesitamos compareTo
	
	//Metodos anhadidos
	/*
	 * Interfaz
	 * Nombre: cargarTablero
	 * Comentario: Este metodo sirve para cargar el array con nulos
	 * Cabecera: public TableroImp cargarTablero() 
	 * Precondiciones: No hay
	 * Entrada; No hay
	 * Salida: TableroImp tablero //El tablero ya cargado con null
	 * E/S: No hay
	 * Postcondiciones: Asociado al nombre, el tablero es cargado con todos
	*/
	public Barco[][] cargarTablero() {
		Barco[][] tablero = new Barco[10][10];
		
		for(int i = 0; i < tablero.length; i++) {
			for(int j = 0; j < tablero[0].length; j++){
				tablero[i][j] = null;
			}
		}
		return tablero;
	}
	
	/*
	 * Interfaz
	 * Nombre: pintarTablero
	 * Comentario: Este subprograma pinta el tablero vacio
	 * Cabecera: public void pintarTablero()
	 * Precondiciones: No hay
	 * Entrada: No hay
	 * Salida: No hay
	 * E/S: No hay
	 * Postcondiciones: No hay
	*/
	public void pintarTablero() {
		for(int i = 0; i < tablero.length; i++) {
			for(int j = 0; j < tablero[0].length; j++){
				 System.out.print("[ ]");
			}
			System.out.println();
		}
	}
}

