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
			int carta;
			int cartaJ1;
			int cartaJ2;
			float aux;
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
						System.out.println("1 Jugador");
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

