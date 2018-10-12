/*
 * Nombre del programa: BuenasHoras
 * 
 * Analisis: 
 * 	Entrada: - Horas
 * 			 - Minutos
 * 
 * 	Salida: - Eco de los datos
 * 			- Si la hora esta de mañana se escribira Buenos dias
 * 			- Si la hora esta de tarde se escribira Buenos tardes
 * 			- Si la hora esta de noche se escribira Buenos noches
 * 
 * 
 * PG Level 0
 * Inicio
 * 	ObtenerDatos
 * 	MostrarMensajes
 * Fin
 * 
 * ObtenerDatos
 * Inicio
 * 	Escribir ("Que hora es?")
 * 	Leer(hora)
 * 	Escribir ("Que minuto es?")
 * 	Leer(minuto)
 * Fin
 * 
 * PG MostrarMensaje
 * Inicio
 * 	Si hora esta entre 0 y 23 y minuto entre 0 y 59 (ambos inclusive)
 * 		Si hora es mayor igual a 8 y menor a 14 o hora es igual a 7 y minuto esta entre 30 y 59 (ambos inclusive)
 * 			Escribir ("Buenos dias")
 * 		Sino Si hora es mayor igual a 14 y menor a 20 o hora es igual a 20 y minuto esta entre 0 y 30 (ambos inclusive)
 * 				Escribir ("Buenas tardes")
 * 		 	Sino 
 * 				Escribir ("Buenos noches")
 * 			FinSi
 * 		FinSi
 * 	Sino 
 * 		Escribir ("Escribe tanto la hora como los minutos correctos")
 * 	FinSi	
 * Fin
 * 
 */

import java.util.Scanner;

public class BuenasHoras {
	
	public static void main (String[] args) {
		
		int hora;
		int minuto;
		Scanner teclado = new Scanner(System.in);
		
		//ObtenerDatos
		//Escribir ("Que hora es?")
		System.out.println("Que hora es?");
		
		//Leer(hora)
		hora = teclado.nextInt();
		
		//Escribir ("Que minuto es?")
		System.out.println("Que minuto es?");
		
		//Leer(minuto)
		minuto = teclado.nextInt();
		
		//MostrarMensajes
		if ((hora >= 0 && hora <= 23) && (minuto >= 0 && minuto <= 59)) {	
			
			if ((hora >= 8 && hora < 14) || (hora == 7 && (minuto > 29 && minuto < 60))) {
				System.out.println("Buenos dias");
			}
			
			else if ((hora >= 14 && hora < 20) || (hora == 20 && (minuto >= 00 && minuto < 31))) {
				System.out.println("Buenas tardes");
			}
			
				else {
					System.out.println("Buenas noches");
				}
		}
		
		else {
			System.out.println("Escribe tanto la hora como los minutos correctos");
		}
	}
}

