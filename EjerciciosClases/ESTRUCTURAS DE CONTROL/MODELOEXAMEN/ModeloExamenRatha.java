/*
 * Nombre del programa: ModeloExamenRatha
 * 
 * Analisis:
 * 	Entrada: - Opcion
 * 			 - Respuesta
 * 			 - Caracter
 * 			 - Letra
 * 			 - Numero
 * 			 - Carta
 * 			 - Partida
 * 
 * 	Salida: - Mensajes con el usuario
 * 			- Resultado de la carta alta
 * 
 * 	Requisitos: - opcion tiene que se 0, 1 o 2
 * 				- respuesta tiene que ser s o n
 * 				- caracter tiene que ser un caracter imprimible
 * 				- letra tiene que ser de la a a la z
 * 				- numero del 0 al 9
 * 				- carta es del 1 al 12
 * 				- partida mayor que 0
 * 
 * PG level 0
 * Inioio
 * 	LeeryValidarOpcion
 * 	MientrasNoSeaSalir
	 * 	Segun (opcion) 
	 * 		Para caso 1:
	 * 			PintarColina
	 * 		FinCaso1
	 * 
	 * 		Para caso 2:
	 * 			cartaAlta
	 * 		FinCaso2
	 * 	FinSegun
	FinMientras
 * Fin
 * 
 * PG PintarColina
 * Inicio
 * 	LeeryValidarRespuesta
 * 	MientrasRespuestaSeaSi
 * 		LeeryValidarNumero
 * 		LeeryValidarCaracter
 * 		LeeryValidarLetra
 * 		PintarColina
 * 		LeeryValidarRespuesta
 * 	FinMientras
 * Fin
 * 
 * PG cartaAlta
 * Inicio
 * 	LeeryValidarRespuesta
 * 	MientrasRespuestaSeaSi
 * 		EmpezarJuego
 * 		MostrarResultado
 * 		LeeryValidarRespuesta	
 * 	FinMientras
 * Fin
 * 
 * PG EmpezarJuego
 * Inicio
 * 	LeeryValidarPartidas
 * 	Para(contador = 0; mientras contador sea menor a partidas; contador++)
 * 		ComprobarGanador
 * 	FinPara
 * 	MostrarGanador
 * Fin
 * 
 * Estudio de bucle
 * Nombre: Opcion1a2
 * VCB: Centinela (0, 1 o 2)
 * Inicializacion VCB: Lectura anticipada, antes de la primera iteracion
 * Actualizacion VCB: Lectura final, fisicamente al final de cada bucle
 * Condicion de salida: opcion >= 0 && opcion <= 2
 * Condicion de entrada: opcion < 0 || opcion > 2
 * 
 * Nombre: ValidarNumero
 * VCB: Centinela (del 0 al 9)
 * Inicializacion VCB: Lectura anticipada, antes de la primera iteracion
 * Actualizacion VCB: Lectura final, fisicamente al final de cada bucle
 * Condicion de salida: numero >= 0 && numero <= 90
 * Condicion de entrada: numero < 0 || numero > 9
 * 
 * 
 * Nombre: ValidarLetra
 * VCB: Centinela (de la a a la z)
 * Inicializacion VCB: Lectura anticipada, antes de la primera iteracion
 * Actualizacion VCB: Lectura final, fisicamente al final de cada bucle
 * Condicion de salida: letra >= 'a' && letra <= 'z'
 * Condicion de entrada: letra < 'a' || letra > 'z'
 * 
 *
 * 
 */

import java.util.*;
import java.io.*;
public class ModeloExamenRatha {
	
	public static void main (String[] args) {
		int opcion;
		char respuesta;
		char caracter;
		char letra;
		int numero;
		int carta;
		int rival;
		int partida;
		int gana = 0;
		int pierde = 0;
		int empate = 0;
		Scanner teclado = new Scanner (System.in);
		Random random = new Random();
		
		//LeeryValidarOpcion
		do {
			System.out.println("Elija una opcion");
			System.out.println("1. PintarColina");
			System.out.println("2. cartaAlta");
			System.out.println("0. Salir");
			opcion = teclado.nextInt();
		}
		while(opcion < 0 || opcion > 2);
		
		//MientrasNoSeaSalir
		while (opcion != 0) {
			switch(opcion) {
				case 1:
					//LeeryValidarRespuesta
					do {
						System.out.println("Quieres ejecutar? (S/N)");
						respuesta = Character.toLowerCase(teclado.next().charAt(0));
					}
					while(respuesta != 's' && respuesta != 'n');
					
					//MientrasRespuestaSeaSi
					while(respuesta == 's') {
						//LeeryValidarNumero
						do {
							System.out.println("Escribe un numero (0-9)");
							numero = teclado.nextInt();
						}
						while(numero < 0 || numero > 9);
						
						//LeeryValidarCaracter
						do {
							System.out.println("Escriba su caracter deseado");
							caracter = Character.toLowerCase(teclado.next().charAt(0));
						}
						while(caracter < 0);
						//LeeryValidarLetra
						do {
							System.out.println("Escriba una letra (a-z)");
							letra = Character.toLowerCase(teclado.next().charAt(0));
						}
						while(letra < 'a' || letra > 'z');
						
						//PintarColina
						System.out.println("En construccion");
						
					//LeeryValidarRespuesta
					do {
						System.out.println("Quieres ejecutar? (S/N)");
						respuesta = Character.toLowerCase(teclado.next().charAt(0));
					}
					while(respuesta != 's' && respuesta != 'n');	
					}
				break;
				
				case 2:
					//System.out.println("cartaAlta");
					//LeeryValidarRespuesta 
					do {
						System.out.println("Quieres ejecutar? (S/N)");
						respuesta = Character.toLowerCase(teclado.next().charAt(0));
					}
					while(respuesta != 's' && respuesta != 'n');
					
					//MientrasRespuestaSeaSi
					while(respuesta == 's') {
						//EmpezarJuego
						//LeeryValidarPartidas
						do {
							System.out.println("Cuantas partidas se van a jugar?");
							partida = teclado.nextInt();
						}
						while(partida <= 0);
						
						System.out.println("El juego comienza en breve");
						System.out.println("Decidiendo cartas...");
						for(int contador = 0; contador < partida; contador++) {
							
						carta = random.nextInt(12)+1;
						rival = random.nextInt(12)+1;
						
						System.out.println("La carta del jugador es: " + carta);
						System.out.println("La carta de la maquina es: " + rival);
						
						if(carta > rival) {
							gana++;
						}
						else if(rival > carta) {
							pierde++;
							}
							else {
								empate++;
							}
						
						}
						System.out.println("Haremos un resumen");
						System.out.println("Partidas jugadas: " + partida);
						System.out.println("Ganadas por el jugador: " + gana);
						System.out.println("Ganadas por la maquina: " + pierde);
						System.out.println("Empates: " + empate);
						
						if (gana > pierde) {
							System.out.println("El jugador es el ganador del juego");
						}
						else if (pierde > gana) {
							System.out.println("La maquina es la ganadora del juego");
							}
							
							else {
								System.out.println("No hay ganadores, ha sido empate");
							}
						//LeeryValidarRespuesta 
						do {
							System.out.println("Quieres ejecutar? (S/N)");
							respuesta = Character.toLowerCase(teclado.next().charAt(0));
						}
						while(respuesta != 's' && respuesta != 'n');
					}
				break;
			}
			//LeeryValidarOpcion
			do {
				System.out.println("Elija una opcion");
				System.out.println("1. PintarColina");
				System.out.println("2. cartaAlta");
				System.out.println("0. Salir");
				opcion = teclado.nextInt();
			}
			while(opcion < 0 || opcion > 2);
		}
	}
}

