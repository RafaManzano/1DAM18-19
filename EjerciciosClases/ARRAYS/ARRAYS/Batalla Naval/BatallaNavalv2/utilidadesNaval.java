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
	 * Postcondiciones: Por referencia, solo se asigna a los tableros para que sus casillas esten a false
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
			System.out.println("Que posicion quieres introducir?");
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
	 * Precondiciones: 
	 * Entrada: 
	 * Salida:
	 * E/S: No hay
	 * Postcondiciones: Asociado al nombre, Es true si todas las casillas son false y false si no lo son
	*/
	
	public static boolean ComprobarFinalPartida(TableroImp tablero) {
		TableroImp riv = new TableroImp();
		
		riv.cargarTablero();
		
		return riv.equals(tablero);
	}
}

