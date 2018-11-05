/*
 * Nombre del programa: HipodromoCarmeli
 * Breve Comentario: Diseña un programa para simular una carrera de tres caballos. Las probabilidades
 * 	de ganar las simulara el diseñador segun sus propios criterios. El programa permitira al usuario jugar repetidas veces si lo desea
 * 	Puede incluirse la posibilidad de apostar interactivamente
 * 
 * Analisis:
 * 	Entrada: - Respuesta
 * 			 - Eleccion
 * 			 - Apuesta
 * 			 - Monedero
 * 	Salida: - Mensajes con el usuario
 * 			- Resultado del caballo ganador
 * 			- Resultado del monedero
 * 
 * 	Requisitos: - Respuesta tiene que ser s o n
 * 				- La eleccion sera del 1 al 3 (despues se intentara 5)
 * 				- Monedero es mayor que 0
 * 				- Apuesta es mayor que 0 y menor a monedero
 * 
 * PG Level 0
 * Inicio
 * 	LeeryValidarRespuesta
 * 	MientrasRespuestaSeaSi
 * 		LeeryValidarMonedero
 * 		Mientras haya dinero en el monedero
 * 			LeeryValidarApuesta
 * 			ComenzarJuego
 * 			ActualizarMonedero
 * 		FinMientras
 * 	LeeryValidarRespuesta
 * 	FinMientras
 * Fin
 * 
 * PG ComenzarJuego
 * Inicio
 * 	LeeryValidarEleccionCaballo
 * 	RealizarCarrera
 * 	MostrarResultado
 * Fin
 */

import java.io.*;
import java.util.*;

public class HipodromoCarmeli {
	
	public static void main (String[] args) {
		int eleccion = 0;
		int monedero;
		int apuesta;
		char respuesta;
		int caballo1 = 0;
		int caballo2 = 0;
		int caballo3 = 0;
		int aux1 = 0;
		int aux2 = 0;
		int aux3 = 0;
		
		
		Scanner teclado = new Scanner(System.in);
		Random random = new Random();
		//LeeryValidarRespuesta
		do {
			System.out.println("Quieres ejecutar?");
			respuesta = Character.toLowerCase(teclado.next().charAt(0));
		}
		while(respuesta != 's' && respuesta != 'n');
		
		//MientrasRespuestaSeaSi
		while(respuesta == 's') {
			
			//LeeryValidarMonedero
			do {
				System.out.println("Cuantos quieres que te cambie por petrodolares?");
				monedero = teclado.nextInt();
			}
			while(monedero <= 0);
			
				//Mientras haya dinero en el monedero
				while(monedero > 0) {
					
					//LeeryValidarApuesta
					do {
						System.out.println("Cuantos petrodolares quieres apostar?");
						apuesta = teclado.nextInt();
					}
					while(apuesta <= 0 || apuesta > monedero);
					
					//ComenzarJuego
					do {
					System.out.println("Hagan sus apuestas");
					System.out.println("1. Lucero el Rayo");
					System.out.println("2. Reina la Cazadora");
					System.out.println("3. Billy el Rapido");
					}
					while(eleccion < 0 && eleccion > 4);
					
					for (int contador = 0;contador < 20; contador++) {
						aux1 = random.nextInt(6);
						
						
						aux2 = random.nextInt(6);
						caballo2 += aux2;
						aux3 = random.nextInt(6);
						caballo3 += aux3;
					}
					
					System.out.println(caballo2);
					System.out.println(caballo3);
			//LeeryValidarRespuesta
			do {
			System.out.println("Quieres ejecutar?");
			respuesta = Character.toLowerCase(teclado.next().charAt(0));
			}
			while(respuesta != 's' || respuesta != 'n');
		}
	}
}
}

