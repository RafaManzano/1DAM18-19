/*
 * Nombre del programa: BatallaNaval
 * Comentario: El juego es imitando al juego de mesa hundir la flota
 * 
 * Analisis:
 * 	Entrada: - Fila
 * 			 - Columna
 * 			 - Respuesta
 * 
 * 	Salida: - Mensajes con el usuario
 * 			- Resultado ganador
 * 
 * 	Requisitos: - Fila tiene que ser de 0 a 10
 * 				- Columna tiene que ser de 0 a 10
 * 				- Respuesta tiene que ser s o n
 * 
 * PG Level 0
 * Inicio
 * 	LeeryValidarRespuesta
 * 		Mientras respuesta sea si
 * 		Juego
 * 		MostrarResultado
 * 		LeeryValidarRespuesta
 *	FinMientras
 *	Fin
 * 
 * Modulo Juego
 * Inicio
 * 	AsignaTableroJugadorRival*
 * 	RellenarTablerosBarcos*
 * 	Repetir
 * 		LeeryValidarFilaColumna
 * 		EfectuarDisparo*
 * 		MostrarDisparo*
 * 	Mientras haya barcos vivos
 * Fin
 */

import java.util.*;
public class BatallaNaval {
	
	public static void main (String[] args) {
		int fila;
		int columna;
		TableroImp tabJ1 = new TableroImp();
		TableroImp tabRival = new TableroImp();
		char respuesta;
		Scanner teclado = new Scanner(System.in);
		Random random = new Random();
		
		//LeeryValidarRespuesta
		do {
			System.out.println("Quieres ejecutar");
			respuesta = Character.toLowerCase(teclado.next().charAt(0));
		}
		while(respuesta != 's' && respuesta != 'n');
		
		while(respuesta == 's') {
			//Juego
			//AsignaTableroJugadorRival*
			utilidadesNaval.AsignaTableroJugadorRival(tabJ1, tabRival);
			
			//RellenarTableroBarcoJ1*
			
			//RellenarTableroBarcoRival*
			
			
			//LeeryValidarRespuesta
			do {
				System.out.println("Quieres ejecutar");
				respuesta = Character.toLowerCase(teclado.next().charAt(0));
			}
			while(respuesta != 's' && respuesta != 'n');
		}
		
	}
}

