/*
 * Nombre: PiedraPapelTijera
 * Breve: El tipico juego de piedra, papel y tijera con la maquina. El juego seria al mayor de 3
 * Entrada: - Respuesta
 * 			- Eleccion
 * Salida: - Mensaje del ganador
 * 
 * Estudio de los bucles
 * Nombre del bucle: BucleRespuestaSoN
 * VCB: Centinela
 * Inicializacion VCB: Lectura anticipada, antes de la primera iteracion
 * Actualizacion VCB: Lectura final, al final del bucle
 * Condicion de salida: respuesta == 's' || respuesta == 'n' && respuesta == 'S' || respuesta == 'N'
 * 
 * Nombre del bucle: BucleJuego
 * VCB: Centinela
 * Inicializacion VCB: Lectura anticipada, antes de la primera iteracion
 * Actualizacion VCB: Lectura final, al final del bucle
 * Condicion de salida: puntuacion jugador > 3 || puntuacion rival > 3
 * 
 * 
 * PG level 0
 * Inicio
 * 	BucleRespuestaSoN
 * 	Si respuesta es Si
 * 		RealizarJuego
 * 	Sino
 * 		Esribir("Cerrando programa...")
 * 	FinSi
 * Fin
 * 
 * PG BucleRespuestaSoN
 * Inicio
 * 	Repetir
 * 		Escribir("Quieres jugar, sera divertido?")
 * 		Leer(respuesta)
 * 	Mientras respuesta == 's' || respuesta == 'n' && respuesta == 'S' || respuesta == 'N'
 * 
 * PG RealizarJuego
 * Inicio
 * 	Repetir
 * 		Escribir ("Elija su decision")
 * 		Escribir ("1. Piedra")
 * 		Escribir ("2. Papel")
 * 		Escribir ("3. Tijera")
 * 		Leer(eleccion) //Es la eleccion del jugador
 * 		Leer(rival) // Es la eleccion del rival
 * 
 * 		Segun (eleccion)
 * 			Caso 1: //Piedra
 * 				Si (rival es igual a piedra)
 * 					Escribir ("Empate")
 * 				Sino Si (rival es igual a papel)
 * 						Escribir ("Pierdes")
 * 						Sumamos uno a la puntuacion del rival
 * 					 Sino 
 * 						Escribir ("Ganas")
 * 						Sumamos uno a la puntuacion del jugador
 * 					 FinSi
 * 				FinSi
 * 			Fin Caso1
 * 
 * 			Caso 2: //Papel
 * 				Si (rival es igual a piedra)
 * 					Escribir ("Ganas")
 * 					Sumamos uno a la puntuacion del jugador
 * 
 * 				Sino Si (rival es igual a papel)
 * 						Escribir ("Empate")
 * 		
 * 					 Sino 
 * 						Escribir ("Pierdes")
 * 						Sumamos uno a la puntuacion del rival
 * 					 FinSi
 * 				FinSi
 * 			Fin Caso2
 * 
 * 			Caso 3: //Tijera
 * 				Si (rival es igual a piedra)
 * 					Escribir ("Pierdes")
 * 					Sumamos uno a la puntuacion del rival
 * 
 * 				Sino Si (rival es igual a papel)
 * 						Escribir ("Ganas")
 * 						Sumamos uno a la puntuacion del jugador
 * 
 * 					 Sino 
 * 						Escribir ("Empate")
 * 					 FinSi
 * 				FinSi	
 * 			Fin Caso3
 * 		FinSegun
 * 	Mientras no haya un ganador
 * 	Si puntuacion jugador es igual a 3
 * 		Escribir ("Has ganado")
 * 	Sino 
 * 		Escribir ("Has perdido")
 * Fin
 */

import java.io.*;
import java.util.*;

public class PiedraPapelTijera {
	
	public static void main (String[] args) {
		
		char respuesta;
		int eleccion;
		int rival;
		int puntjug = 0;
		int puntriv = 0;
		Scanner teclado = new Scanner(System.in);
		Random random = new Random();
		
		//BucleRespuestaSoN
		do {	//Repetir
			System.out.println("Quieres jugar, sera divertido (S/N)"); //Escribir ("Quieres jugar, sera divertido (S/N)")
			respuesta = teclado.next().charAt(0); //Leer(respuesta)
		}
		while((respuesta != 'S' && respuesta != 'N') && (respuesta != 's' && respuesta != 'n')); //Mientras((respuesta != 'S' && respuesta != 'N') && (respuesta != 's' && respuesta != 'n'))
		
		if (respuesta == 's'  || respuesta == 'S') { //Si respuesta es si
			//System.out.println("Guay");
				do{ //Repetir
				System.out.println("Elija su decision"); //Escribir ("Elija su decision")
				System.out.println("1. Piedra"); //Escribir ("1. Piedra")
				System.out.println("2. Papel"); //Escribir ("2. Papel")
				System.out.println("3. Tijera"); //Escribir ("3. Tijera")
				eleccion = teclado.nextInt(); //Leer(eleccion) // Es la eleccion del jugador
				rival = random.nextInt(3)+1; //Leer(rival) // Es la eleccion del rival
				//System.out.println("Tu jugada " + eleccion + " y la suya " + rival); //Prueba
				
				
				switch(eleccion) { //Segun (eleccion)
					case 1: //Caso1:
						if (rival == 1) { // Si(rival es igual a piedra)
							System.out.println("Tu eleccion piedra y la del ordenador piedra"); //Escribir ("Tu eleccion piedra y la del ordenador piedra")
							System.out.println("Empate"); //Escribir("Empate")
						}
						
						else if(rival == 2) { // Sino Si (rival es igual a papel)
							System.out.println("Tu eleccion piedra y la del ordenador papel"); //Escribir ("Tu eleccion piedra y la del ordenador papel")
							System.out.println("Pierdes"); //Escribir("Pierdes")
							puntriv++; //Sumamos uno a la puntuacion del rival
						}
						
							else{ //Sino
								System.out.println("Tu eleccion piedra y la del ordenador tijera"); //Escribir ("Tu eleccion piedra y la del ordenador tijera")
								System.out.println("Ganas"); //Escribir("Ganas")
								puntjug++; //Sumamos uno a la puntuacion del jugador
							}
					break; //FinCaso1
					
					case 2: //Caso2
						if (rival == 1) { // Si(rival es igual a piedra)
							System.out.println("Tu eleccion papel y la del ordenador piedra"); //Escribir ("Tu eleccion papel y la del ordenador piedra")
							System.out.println("Ganas"); //Escribir("Ganas")
							puntjug++; //Sumamos uno a la puntuacion del jugador
						}
						
						else if(rival == 2) { // Sino Si (rival es igual a papel)
							System.out.println("Tu eleccion papel y la del ordenador papel"); //Escribir ("Tu eleccion papel y la del ordenador papel")
							System.out.println("Empate"); //Escribir("Empate")
						}
						
							else{
								System.out.println("Tu eleccion papel y la del ordenador tijera"); //Escribir ("Tu eleccion papel y la del ordenador tijera")
								System.out.println("Pierdes"); //Escribir("Pierdes")
								puntriv++; //Sumamos uno a la puntuacion del rival
							}
					break; //FinCaso2
					
					case 3: //Caso3
						if (rival == 1) { // Si(rival es igual a piedra)
							System.out.println("Tu eleccion tijera y la del ordenador piedra"); //Escribir ("Tu eleccion tijera y la del ordenador piedra")
							System.out.println("Pierdes"); //Escribir("Pierdes")
							puntriv++; //Sumamos uno a la puntuacion del rival
						}
						
						else if(rival == 2) { // Sino Si (rival es igual a papel)
							System.out.println("Tu eleccion tijera y la del ordenador papel"); //Escribir ("Tu eleccion tijera y la del ordenador papel")
							System.out.println("Ganas");  //Escribir("Ganas")
							puntjug++; //Sumamos uno a la puntuacion del jugador
						}
						
							else{
								System.out.println("Tu eleccion tijera y la del ordenador tijera"); //Escribir ("Tu eleccion tijera y la del ordenador papel")
								System.out.println("Empate"); //Escribir("Empate")
							}
					break; //FinCaso3
				}
			}
			while(puntjug < 3 && puntriv < 3); //Mientras no haya un ganador
			
			if (puntjug == 3) { //Si la puntuacion del jugador es igual a 3
				System.out.println("Has ganado"); //Escribir ("Has ganado")
			}
			else { //Sino
				System.out.println("Has perdido"); //Escribir ("Has perdido")
			} //FinSi
			}
		
		
		else {
			System.out.println("Cerrando programa...");
		} //FinSi
	}
}

