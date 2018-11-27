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
			double jugadariv = 0;
			char plantarse = ' ';
			boolean salir = false;
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
						jugada = 0;
						//JugadaJugador
						do {
							carta = random.nextInt(8)+1;
							if (carta == 8) {
								carta = 0.5;
							}
							jugada = jugada + carta;
							System.out.println("Tu jugada es " + jugada);
							if (jugada > 7.5) {
								salir = true;
							}
							else {
								System.out.println("Quieres plantarse o seguir (S/P)");
								plantarse = Character.toLowerCase(teclado.next().charAt(0));
							}
						}
						while(jugada <= 7.5 && plantarse == 's' && salir == false);
						
						//JugadaMaquina
						jugadariv = 0;
						salir = false;
						do {
							carta = random.nextInt(8)+1;
							jugadariv = jugadariv + carta;
							System.out.println("La jugada es " + jugadariv);
							
							if(jugadariv >= 5.5) {
								salir = true;
							}
						}
						while(salir == false);
						
						if (jugada > 7.5 ) {
							System.out.println("Has perdido " + nombreJ1);
						}
						else if (jugadariv > 7.5) {
							System.out.println("Has ganado " + nombreJ1);
							}
							else {
								System.out.println("Empate");
							}
							
						
						
				
					break;
					
					case 2 :
						System.out.println("2 Jugadores");
					break;
					
					case 3 :
						System.out.println("El juego es el que mas se acerque a las 7.5 sin pasarse");
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

