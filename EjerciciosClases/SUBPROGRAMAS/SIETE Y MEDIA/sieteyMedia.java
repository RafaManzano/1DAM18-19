/* SieteyMedia
 * Breve Comentario: Seria el juego de cartas de la siete y media de dos jugadores
 * 
 * Analisis
 * 	Entrada: - Eleccion
 * 			 - pedirCarta
 * 			 - plantatse
 * 			 - respuesta 
 * 			 - nombreJ1
 * 			 - nombreJ2
 * 	Salida: - Resultado de la partida
 * 			- Eco de las cartas
 * 
 * PG Level 0
 * Inicio
 * 	LeeryValidarOpcion
 * 	Mientras opcion no sea salir
 * 		para caso 1:
 * 			1 Jugador
 * 		para caso 2:
 * 			2 Jugadores
 * 		para caso 3
 * 			Reglas
 * 		LeeryValidarOpcion
 * 	FinMientras
 * Fin
 * 
 */

import java.util.*;
import java.io.*;

public class sieteyMedia {
	
	public static void main (String[] args) {
			char respuesta;
			int opcion;
			String nombreJ1;
			String nombreJ2;
			double carta;
			double jugada = 0;
			char plantarse;
			Scanner teclado = new Scanner(System.in);
			Random random = new Random();
			
			//LeeryValidarOpcion
			do {
				utilidadesSieteyMedia.PresentarMenu();
				opcion = teclado.nextInt();
			}
			while(opcion < 0 || opcion > 3);
			
			while (opcion != 0) {
				switch (opcion) {
					case 1 :
						//System.out.println("1 Jugador");
						System.out.println("Elija su nombre jugador");
						nombreJ1 = teclado.next();
						
						utilidadesSieteyMedia.realizarJugada();
						
						if(jugada > 7.5) {
							System.out.println("Has perdido, " + nombreJ1);
						}
						else {
							System.out.println("Has ganado, " + nombreJ1);
						}
						//ComprobarJugada
					break;
					
					case 2 :
						System.out.println("2 Jugadores");
					break;
					
					case 3 :
						System.out.println("Reglas");
					break;
				}
				
				//LeeryValidarOpcion
				do {
					utilidadesSieteyMedia.PresentarMenu();
					opcion = teclado.nextInt();
				}
				while(opcion < 0 || opcion > 3);
			}
	}
}

