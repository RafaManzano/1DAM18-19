import java.util.*;
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
}

