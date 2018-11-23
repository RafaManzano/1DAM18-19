/*
 * SieteyMedia
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
 * Estudio del bucle
 * 	Nombre: BucleRespuestaSoN
 * 	VCB: Centinela
 * 	Inicializacion VCB: Lectura anticipada
 * 	Actualizacion VCB: Lectura final
 * 	Condicion de salida: respuesta == 's' || respuesta == 'n'
 * 
 * 	Nombre: MientrasRespuestaSi
 * 	VCB: Centinela
 * 	Inicializacion VCB: Lectura anticipada
 * 	Actualizacion VCB: Lectura final
 * 	Condicion de salida: respuesta == 's'
 * 
 * PG Level 0
 * Inicio
 * 	LeeryValidarRespuesta
 * 	MientrasrespuestaSeaSi
 * 		EmpezarJuego
 * 	FinMientras
 * Fin
 * 
 * PG EmpezarJuego
 * Inicio
 * 	LeerJugador1
 * 	LeerJugador2
 * 	Mientras la jugada sea menor de la 7.30 o se haya plantado
 * 		RealizarJugada *
 * 		LeeryValidarPlantarseoCarta *
 * 	FinMientras
 * Fin
 */

import java.util.*;
import java.io.*;

public class sieteyMediaNoValido {
	
	public static void main (String[] args) {
			char respuesta;
			String nombreJ1;
			String nombreJ2;
			int carta;
			int cartaJ1;
			int cartaJ2;
			float aux;
			Scanner teclado = new Scanner(System.in);
			Random random = new Random();
			
			//LeeryValidarRespuesta
			do {
				System.out.println("Quieres ejecutar?");
				respuesta = Character.toLowerCase(teclado.next().charAt(0));
			}
			while(respuesta != 's' && respuesta != 'n');
			
			//MientrasRespuestaSi
			while(respuesta == 's') {
				//Leer Jugador1
				System.out.println("Dime quien va a ser el primer jugador");
				nombreJ1 = teclado.next();
				
				//Leer Jugador2
				System.out.println("Dime quien va a ser el primer jugador");
				nombreJ2 = teclado.next();
				
				System.out.println("Le toca a " + nombreJ1);
				do{
					carta = random.nextInt(8)+1;
					if (carta == 8) {
						aux = 0.5;
						carta += aux;
					}
					else {
					cartaJ1 += carta;
					}
					System.out.println("Quieres otra carta o prefieres plantarte?(Carta (C) Plantarse (P))");
					plantarse = Character.toLowerCase(teclado.next().charAt(0));
				}
				while(carta > 7.5 && plantarse == 'p');
				
				if (CartaJ1 < 7.5) {
					System.out.println("Le toca a " + nombreJ2);
					do{
						carta = random.nextInt(8)+1;
						if (carta == 8) {
							aux = 0.5;
							carta += aux;
						}
						else {
						cartaJ2 += carta;
						}
						System.out.println("Quieres otra carta o prefieres plantarte?(Carta (C) Plantarse (P))");
						plantarse = Character.toLowerCase(teclado.next().charAt(0));
					}
					while(carta > 7.5 && plantarse == 'p');
				}
				//LeeryValidarRespuesta
				do {
					System.out.println("Quieres ejecutar?");
					respuesta = Character.toLowerCase(teclado.next().charAt(0));
				}
				while(respuesta != 's' && respuesta != 'n');
			}
		
	}
}

