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

import java.util.*;
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
	 * Nombre: pintarTableroVacio
	 * Comentario: Este subprograma pinta el tablero vacio
	 * Cabecera: public void pintarTablero()
	 * Precondiciones: No hay
	 * Entrada: No hay
	 * Salida: No hay
	 * E/S: No hay
	 * Postcondiciones: No hay
	*/
	public void pintarTableroVacio() {
		for(int i = 0; i < tablero.length; i++) {
			for(int j = 0; j < tablero[0].length; j++){
				 System.out.print("[ ]");
			}
			System.out.println();
		}
	}
	
	/*
	 * Interfaz
	 * Nombre: pintarTableroLleno
	 * Comentario: Este subprograma pinta el tablero con agua
	 * Cabecera: public void pintarTableroLleno()
	 * Precondiciones: No hay
	 * Entrada: No hay
	 * Salida: No hay
	 * E/S: No hay
	 * Postcondiciones: No hay
	*/
	public void pintarTableroLleno() {
		for(int i = 0; i < tablero.length; i++) {
			for(int j = 0; j < tablero[0].length; j++){
				if(tablero[i][j] == false) {
					System.out.print("[A]");
				}
				else {
					System.out.print("[B]");
				}
			}
			System.out.println();
		}
	}
	
	/*
	 * Interfaz
	 * Nombre: IntroducirBarco
	 * Comentario: Este subprograma introduce el tamanho del barco deseado
	 * Cabecera: public void introducirBarco (int tamanho)
	 * Precondiciones: tamanho tiene que estar entre 1 y 6
	 * Entrada: - int tamanho //Es el tamanho del barco
	 * Salida: No hay
	 * E/S: No hay
	 * Postcondiciones: No hay, solo asigna a la posicion true para indicar que hay barco
	*/
	
	public void introducirBarco(int tamanho) {
		Random random = new Random();
		int fila;
		int columna;
		int decision;
		boolean fin;
		
		do {
			fila = random.nextInt(10);
			columna = random.nextInt(10);
			decision = random.nextInt(2);
			fin = false;
			
			if(decision == 0) {
				for(int i = 0; i < tamanho && fin == false; i++) {
					if(fila + i > 9) {
						fin = true;
						cargarTablero();
					}
					else {
						tablero[fila + i][columna] = true;
					}					
				}
			}
			else {
				for(int i = 0; i < tamanho && fin == false; i++) {
					if(columna + i > 9) {
						fin = true;
						cargarTablero();
					}
					else {
						tablero[fila][columna + i] = true;
					}
				}
			}
		}
		while(fin == true);
	}
}

