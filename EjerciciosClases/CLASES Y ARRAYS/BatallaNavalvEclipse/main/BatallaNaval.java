package main;
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
 * 		ResultadoGanador
 * 		LeeryValidarRespuesta
 *	FinMientras
 *	Fin
 * 
 * Modulo Juego
 * Inicio
 * 	AsignaTableroJugadorRival*
 * 	RellenarTableroJugador
 * 	RellenarTableroRival
 * 	Repetir
 * 		LeeryValidarFilaColumna
 * 		FilaColumnaRival
 * 		EfectuarDisparo
 * 	Mientras alguno de los tableros no se hayan descubierto completo
 * Fin
 */

import java.util.*;
import clases.TableroImp;
import metodos.utilidadesNaval;

public class BatallaNaval {
	
	public static void main (String[] args) {
		int fila;
		int columna;
		int filaR;
		int columnaR;
		TableroImp tabJ1 = new TableroImp();
		TableroImp tabRival = new TableroImp();
		TableroImp copiaRival = new TableroImp();
		boolean[][] aRellenar = new boolean[10][10];
		char respuesta;
		Scanner teclado = new Scanner(System.in);
		Random random = new Random();
		
		//LeeryValidarRespuesta
		do {
			System.out.println("Quieres ejecutar? (S/N)");
			respuesta = Character.toLowerCase(teclado.next().charAt(0));
		}
		while(respuesta != 's' && respuesta != 'n');
		
		while(respuesta == 's') { //Mientras respuesta sea si
			//Juego
			//AsignaTableroJugadorRival*
			utilidadesNaval.AsignaTableroJugadorRival(tabJ1, tabRival);
			
			//RellenarTableroJugador
			for(int i = 0; i <= 6; i++) {
				tabJ1.introducirBarco(i);
			}
			
			//RellenarTableroRival
			for(int i = 0; i <= 6; i++) {
				tabRival.introducirBarco(i);
			}
			
			//copiaRival = tabRival.clone(); //Este clone seria para ver los aciertos que realiza el jugador de modo grafico
			//copiaRival.pintarTableroLleno();
			
			System.out.println("Espere, por favor");
			System.out.println("Estamos generando el tablero aleatoriamente");
			
			try {
				Thread.sleep(3000);
			}
			catch(InterruptedException err) {
				System.out.println("Excepcion en camino");
			}
			
			
			do { //Repetir
				//LeeryValidarFilaColumna
				fila = utilidadesNaval.leeryValidarNumero();
				columna = utilidadesNaval.leeryValidarNumero();
				copiaRival.setTablero(utilidadesNaval.tableroDisparo(fila, columna, tabRival, aRellenar));
				//FilaColumnaRival
				filaR = random.nextInt(10);
				columnaR = random.nextInt(10);
				
				
				//EfectuarDisparo
				System.out.print("Mi disparo ha impactado en ");
				utilidadesNaval.efectuarDisparo(fila, columna, tabRival);
				
				System.out.print("El disparo rival ha impactado en ");
				utilidadesNaval.efectuarDisparo(filaR, columnaR, tabJ1);
				
				System.out.println("Asi queda el tablero del rival");
				copiaRival.pintarTableroLleno();
				//utilidadesNaval.pintarDisparoTablero(fila, columna, copiaRival, aRellenar));
				
			} //Mientras alguno de los tableros no se hayan descubierto completo
			while(utilidadesNaval.ComprobarFinalPartida(tabJ1) == false && utilidadesNaval.ComprobarFinalPartida(tabRival) == false);
			
			//ResultadoGanador
			if(utilidadesNaval.ComprobarFinalPartida(tabJ1) == true) {
				System.out.println("Has ganado");
			}
			else {
				System.out.println("Has perdido");
			}
			
			//LeeryValidarRespuesta
			do {
				System.out.println("Quieres ejecutar");
				respuesta = Character.toLowerCase(teclado.next().charAt(0));
			}
			while(respuesta != 's' && respuesta != 'n');
		}
		
	}
}

