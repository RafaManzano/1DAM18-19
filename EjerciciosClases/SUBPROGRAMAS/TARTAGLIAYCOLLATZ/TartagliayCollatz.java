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
		
		
		while(opcion != 0) { //MientrasOpcionNoSeaSalir
			
			switch(opcion) {
				case 1:
					//System.out.println("Piramide de Tartaglia");
					//PiramideTartaglia
					do {
						System.out.println("Quieres ejecutar? (S/N)");
						respuesta = Character.toLowerCase(teclado.next().charAt(0));
					}
					while (respuesta != 's' && respuesta != 'n');
					
					while(respuesta == 's') {
						
						do{
							System.out.println("Cuantas filas quiere que sean?(Mayor o igual que 0)");
							numFilas = teclado.nextInt();
						}
						while (numFilas < 0);
						
						//resguardoPC.pintarPiramide(numFilas);
						utilidadPC.pintarPiramide(numFilas);
						
						
						
						do {
						System.out.println("Quieres ejecutar? (S/N)");
						respuesta = Character.toLowerCase(teclado.next().charAt(0));
						}
						while (respuesta != 's' && respuesta != 'n');
					}
				break;
				
				case 2:
					//System.out.println("Conjetura de Collatz");
					//ConjeturaCollatz
					do {
						System.out.println("Quieres ejecutar? (S/N)");
						respuesta = Character.toLowerCase(teclado.next().charAt(0));
					}
					while (respuesta != 's' && respuesta != 'n');
					
					while(respuesta == 's') {
						
						do {
						System.out.println("Elija su numero para realizar la conjetura");
						numero = teclado.nextInt();
						}
						while(numero <= 0);
						
						//resguardoPC.pintarConjetura(numero);
						utilidadPC.pintarConjetura(numero);
						
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

