package metodos;
import java.util.*;

import clases.TableroImp;
public class utilidadesNaval {
	/*
	 * Interfaz
	 * Nombre: AsignaTableroJugadorRival
	 * Comentario: Este subprograma crea los tableros y les añade las posiciones a false
	 * Cabecera: public static void AsignaTableroJugadorRival(TableroImp j1, TableroImp rival)
	 * Precondiciones: No hay
	 * Entrada: - TableroImp j1  
	 * 			- TableroImp rival
	 * Salida: No hay
	 * E/S: No hay
	 * Postcondiciones: Por referencia, se cargan los dos tableros a la vez
	*/
	public static void AsignaTableroJugadorRival(TableroImp j1, TableroImp rival) {
		j1.cargarTablero();
		rival.cargarTablero();
	}
	
	/* 
	 * Interfaz
	 * Nombre: LeeryValidarNumero
	 * Comentario: Este subprograma validara el numero para la fila y la columna
	 * Cabecera: public static int LeeryValidarNumero ()
	 * Precondiciones: No hay
	 * Entrada: No hay
	 * Salida: - int numero //El numero ya correcto
	 * E/S: No hay
	 * Postcondiciones: Asociado al nombre, el numero despues de realizar la comprobacion
	*/
	public static int leeryValidarNumero (){
		Scanner teclado = new Scanner(System.in);
		int numero = 0;
		do {
			System.out.print("Que posicion quieres introducir? (Primero digame la fila y despues la columna) ");
			numero = teclado.nextInt();
		}
		while(numero < 0 || numero > 10);
		return numero;
	}
	
	/*
	 * Interfaz
	 * Nombre: EfectuarDisparo
	 * Comentario: Este subprograma realizara el disparo del jugador
	 * Cabecera: public void efectuarDisparoJugador(int fila, int columna, TableroImp rival)
	 * Precondiciones: - Fila tiene que ser entre 0 y 9
	 * 				   - Columna tiene que ser entre 0 y 9
	 * Entrada: - int fila
	 * 		    - int columna
	 * 			- TableroImp rival
	 * Salida: No hay
	 * E/S: No hay
	 * Postcondiciones: No hay, solo pinta en pantalla si es agua o barco
	 */
	public static void efectuarDisparo(int fila, int columna, TableroImp rival) {
		boolean[][] tablero = rival.getTablero();
		if(tablero[fila][columna] == true) {
			System.out.println("Barco");
			tablero[fila][columna] = false;
			rival.setTablero(tablero);
		}
		else {
			System.out.println("Agua");
		}
	}
	
	/*
	 * Interfaz
	 * Nombre: ComprobarFinalPartida
	 * Comentario: Este subprograma comprueba si se han hundido todos los barco
	 * Cabecera: public boolean ComprobarFinalPartida (TableroImp tablero)
	 * Precondiciones: No hay
	 * Entrada: TableroImp tablero //Un Objeto de la clase tablero
	 * Salida: boolean descubierto //Si esta descubierto es que todas sus casillas estan a false y si no es que todavia no se han descubierto
	 * E/S: No hay
	 * Postcondiciones: Asociado al nombre, Es true si todas las casillas son false y false si no lo son
	*/
	
	public static boolean ComprobarFinalPartida(TableroImp tablero) {
		boolean descubierto;
		TableroImp tablerovacio = new TableroImp();
		
		tablerovacio.cargarTablero();
		
		descubierto = tablerovacio.equals(tablero);
		return descubierto;
	}
	
	/*
	 * Interfaz
	 * Nombre: tableroDisparo
	 * Comentario: Este subprograma registra los impactos en barco del rival
	 * Cabecera: public boolean[][] tableroDisparo (int fila, int columna, TableroImp rival)
	 * Precondiciones: - fila tiene que ser entre 0 y 9
	 * 				   - columna tiene que ser entre 0 y 9
	 * Entrada: - int fila
	 * 			- int columna
	 * 			- TableroImp rival //Es el tablero del rival
	 * Salida: boolean[][]
	 * E/S: Nada
	 * Postcondiciones: Asociado al nombre, un array bidimensional para el tablero
	 */
	public static boolean[][] tableroDisparo(int fila, int columna, TableroImp tablero, boolean[][] aRellenar) {
		boolean[][]tableroElegido = tablero.getTablero();
		
		if(tableroElegido[fila][columna] == true) {
			aRellenar[fila][columna] = true;
		}
		
		return aRellenar;
	}
	
}

