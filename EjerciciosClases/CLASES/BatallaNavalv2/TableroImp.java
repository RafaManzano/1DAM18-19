/*
 * Tipo TableroImp
 * 
 * Propiedades Basicas
 * 
 * Tablero
 * Tipo: boolean[][]
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
 * public boolean[][] getTablero()
 * public void setTabler(boolean[][] tablero)
 * 
 * Requisitos
 * No hay
 * 
 * Metodos anhadidos
 * Por el momento, no hay
 * 
*/


public class TableroImp implements Cloneable, Tablero {
	//Atributos
	private boolean[][] tablero;
	
	//Constructor
	public TableroImp () { //Por defecto
		tablero = new boolean[10][10];
	}
	
	public TableroImp (boolean[][] tablero) { //Con parametros
		this.tablero = tablero;
	}
	
	public TableroImp(TableroImp cop) { //De copia
		this.tablero = cop.getTablero();
	}
	
	//Get and Set
	public boolean[][] getTablero() {
		return tablero;
	}
	
	public void setTablero(boolean[][] tablero) {
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
	public boolean[][] cargarTablero() {
		
		for(int i = 0; i < tablero.length; i++) {
			for(int j = 0; j < tablero[0].length; j++){
				tablero[i][j] = false;
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
	
	/*
	 * Interfaz
	 * Nombre: pintarTableroAgua
	 * Comentario: Este subprograma pinta el tablero con agua
	 * Cabecera: public void pintarTableroAgua()
	 * Precondiciones: No hay
	 * Entrada: No hay
	 * Salida: No hay
	 * E/S: No hay
	 * Postcondiciones: No hay
	*/
	public void pintarTableroAgua() {
		for(int i = 0; i < tablero.length; i++) {
			for(int j = 0; j < tablero[0].length; j++){
				 System.out.print("[A]");
			}
			System.out.println();
		}
	}
}

