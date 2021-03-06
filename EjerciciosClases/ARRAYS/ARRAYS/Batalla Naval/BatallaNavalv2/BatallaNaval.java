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
 * 		MostrarResultado
 * 		LeeryValidarRespuesta
 *	FinMientras
 *	Fin
 * 
 * Modulo Juego
 * Inicio
 * 	LeeryValidarNumero*
 * 	AsignaTableroJugadorRival*
 * 	RellenarTableroBarcoJ1*
 * 	RellenarTableroBarcoRival*
 * 	Repetir
 * 		LeeryValidarNumero*
 * 		EfectuarDisparo*
 * 		MostrarDisparo*
 * 	Mientras haya barcos vivos
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
			for(int i = 0; i <= 6; i++) {
				tabJ1.introducirBarco(i);
			}
			
			for(int i = 0; i <= 6; i++) {
				tabRival.introducirBarco(i);
			}
			
			
			do {
				//LeeryValidarNumero
				fila = utilidadesNaval.leeryValidarNumero();
				columna = utilidadesNaval.leeryValidarNumero();
				filaR = random.nextInt(10);
				columnaR = random.nextInt(10);
				
				
				//EfectuarDisparo
				utilidadesNaval.efectuarDisparo(fila, columna, tabRival);
				utilidadesNaval.efectuarDisparo(filaR, columnaR, tabJ1);
				
			}
			while(utilidadesNaval.ComprobarFinalPartida(tabJ1) == false && utilidadesNaval.ComprobarFinalPartida(tabRival) == false);
			
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

