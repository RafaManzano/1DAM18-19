/*
 * En este archivos pondremos todas las funciones que son especificas de este programa
 * 
 */

import java.util.*;
public class utilidadesSieteyMedia {
	
	/*
	 * Nombre: PresentarMenu
	 * Necesidades:	No hay
	 * Devoluciones: No hay
	 * Nec/Dev: No hay
	 * Requisitos: No hay
	 * 
	 * Interfaz
	 * 	Nombre: PresentarMenu
	 * 	Comentario: Pinta el menu
	 * 	Cabecera: void PresentarMenu()
	 * 	Precondiciones: No hay
	 * 	Entrada: No hay
	 * 	Salida: No hay
	 * 	Entrada/Salida: No hay
	 * 	Postcondiciones: Solo pinta en pantalla el menu
	 * 
	*/
	
	public static void PresentarMenu() {
		System.out.println("Elija una opcion");
		System.out.println("1. 1 Jugador");
		System.out.println("2. 2 Jugadores");
		System.out.println("3. Reglas");
		System.out.println("0. Salir");
	}
	
	/*
	 * Nec:
	 * Dev: No hay
	 * Nec/Dev: No hay
	 * Requisitos: 
	 * 
	 * Interfaz
	 * Nombre: realizarJugada
	 * Comentario: 
	 * Cabecera: 
	 * Precondiciones: 
	 * Entrada: 
	 * Salida: No hay
	 * E/S: No hay
	 * Postcondiciones: 
	 * 
	*/

	public static void realizarJugada () {
		Random random = new Random();
		Scanner teclado = new Scanner(System.in);
		double carta = random.nextInt(8)+1;
		double jugada = 0;
		char plantarse;
		do {
			if (carta == 8) {
				carta = 0.5;
			}
			jugada = jugada + carta;
			System.out.println("Tu jugada es" + jugada);
			System.out.println("Quieres plantarse o seguir (S/P)");
			plantarse = Character.toLowerCase(teclado.next().charAt(0));
		}
		while (jugada > 7.5 || plantarse == 's');
	}
		
	}


