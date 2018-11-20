/*
 * Nombre del programa: TartagliayCollatz
 * 
 * Analisis
 * Entrada: - Opcion
 * 			- Respuesta
 * 			- NumFilas
 * 			- Numero //Para conjetura Collatz
 * 
 * Salida: - Mensajes con el usuario
 * 		   - Eco de los datos
 * 		   - La piramide de Tartaglia
 * 	       - Conjetura de Collatz
 * 
 * Requisitos: - Opcion es 0, 1 o 2
 * 			   - Respuesta tiene que ser s o n
 * 			   - NumFilas tiene que ser mayor que 0
 * 			   - Numero tiene que ser mayor que 0
 * 
 * PG Level 0
 * Inicio
 * 	LeeryValidarMenu
 * 	MientrasOpcionNoSeaSalir
 * 		Segun(opcion)
 * 			para caso 1:
 * 				PiramideTartaglia
 * 			para caso 2:
 * 				ConjeturaCollatz
 * 		FinSegun
 * 		LeeryValidarMenu
 * 	FinMientras
 * Fin
 * 
 * 
 */

import java.util.Scanner;
import java.io.*;

public class TartagliayCollatz {
	
	public static void main (String[] args) {
		
		int opcion;
		char respuesta;
		int numFilas;
		int numero;
		Scanner teclado = new Scanner (System.in);
		
		//LeeryValidarOpcion
		do {
			//resguardoPC.PresentarMenu();
			utilidadPC.PresentarMenu();
			opcion = teclado.nextInt();
		}
		while(opcion < 0 || opcion > 2);
		
		//MientrasOpcionNoSeaSalir
		while(opcion != 0) {
			
			switch(opcion) {
				case 1:
					//System.out.println("Piramide de Tartaglia");
					do {
						System.out.println("Quieres ejecutar? (S/N)");
						respuesta = Character.toLowerCase(teclado.next().charAt(0));
					}
					while (respuesta != 's' && respuesta != 'n');
					
					while(respuesta == 's') {
						
						do {
						System.out.println("Quieres ejecutar? (S/N)");
						respuesta = Character.toLowerCase(teclado.next().charAt(0));
						}
						while (respuesta != 's' && respuesta != 'n');
					}
				break;
				
				case 2:
					//System.out.println("Conjetura de Collatz");
					do {
						System.out.println("Quieres ejecutar? (S/N)");
						respuesta = Character.toLowerCase(teclado.next().charAt(0));
					}
					while (respuesta != 's' && respuesta != 'n');
					
					while(respuesta == 's') {
						
						do {
						System.out.println("Quieres ejecutar? (S/N)");
						respuesta = Character.toLowerCase(teclado.next().charAt(0));
						}
						while (respuesta != 's' && respuesta != 'n');
					}
				break;
			}
			
			//LeeryValidarOpcion
			do {
				//resguardoPC.PresentarMenu();
				utilidadPC.PresentarMenu();
				opcion = teclado.nextInt();
			}
			while(opcion < 0 || opcion > 2);
		}
	}
}

