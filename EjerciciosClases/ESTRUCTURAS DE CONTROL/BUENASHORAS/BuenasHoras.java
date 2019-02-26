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
 * Escribir("La hora elegida es " , hora)
 * Escribir("Los minutos elegidos son " , minuto)
 * 	Si hora esta entre 0 y 23 y minuto entre 0 y 59 (ambos inclusive)
 * 		Si hora es mayor igual a 8 y menor a 14 o hora es igual a 7 y minuto esta entre 30 y 59 (ambos inclusive)
 * 			Escribir ("Buenos dias")
 * 		Sino Si hora es mayor igual a 14 y menor a 20 o hora es igual a 20 y minuto esta entre 0 y 30 (ambos inclusive)
 * 				Escribir ("Buenas tardes")
 * 		 	Sino 
 * 				Escribir ("Buenas noches")
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
		//Escribir("La hora elegida es " , hora)
		System.out.println("La hora elegida es " + hora);
		
		//Escribir("Los minutos elegidos son " , minuto)
		System.out.println("Los minutos elegidos son " + minuto);
		
		if ((hora >= 0 && hora <= 23) && (minuto >= 0 && minuto <= 59)) { //Si hora esta entre 0 y 23 y minuto entre 0 y 59 (ambos inclusive)	
			
			if ((hora >= 8 && hora < 14) || (hora == 7 && (minuto > 29 && minuto < 60))) { //Si hora es mayor igual a 8 y menor a 14 o hora es igual a 7 y minuto esta entre 30 y 59 (ambos inclusive)
				//Escribir ("Buenos dias")
				System.out.println("Buenos dias");
			}
			
			else if ((hora >= 14 && hora < 20) || (hora == 20 && (minuto >= 00 && minuto < 31))) { //Sino Si hora es mayor igual a 14 y menor a 20 o hora es igual a 20 y minuto esta entre 0 y 30 (ambos inclusive)
				//Escribir("Buenas tardes")
				System.out.println("Buenas tardes");
			}
			
				else { //Sino
					//Escribir("Buenas noches")
					System.out.println("Buenas noches");
				} //FinSi
		} //FinSi
		
		else { //Sino
			//Escribir ("Escribe tanto la hora como los minutos correctos")
			System.out.println("Escribe tanto la hora como los minutos correctos");
		} //FinSi
	}
}

