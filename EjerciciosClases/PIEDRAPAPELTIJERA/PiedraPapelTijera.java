/*
 * Nombre: PiedraPapelTijera
 * Breve Comentario: El tipico juego de piedra, papel y tijera con la maquina. El juego seria al que gane antes 3 partidas
 * Entrada: - Respuesta
 * 			- Eleccion
 * 
 * Salida: - Mensaje del ganador
 * Restricciones: - Respuesta puede ser s o n y S o N
 * 				  - Eleccion puede ser 1 2 o 3
 * Reglas: - Piedra gana a tijera y pierde contra papel
 * 		   - Papel gana a piedra y pierde contra tijera
 * 		   - Tijera gana a papel y pierde contra piedra
 * 
 * Estudio de los bucles
 * Nombre del bucle: BucleRespuestaSoN y ActualizacionRespuestaSoN
 * VCB: Centinela
 * Inicializacion VCB: Lectura anticipada, antes de la primera iteracion
 * Actualizacion VCB: Lectura final, al final del bucle
 * Condicion de salida: respuesta == 's' || respuesta == 'n' && respuesta == 'S' || respuesta == 'N'
 * 
 * Nombre del bucle: MientrasNoGaneAlguien
 * VCB: Centinela
 * Inicializacion VCB: Lectura anticipada, antes de la primera iteracion
 * Actualizacion VCB: Lectura final, al final del bucle
 * Condicion de salida: puntuacion jugador == 3 || puntuacion rival == 3
 * 
 * 
 * PG level 0
 * Inicio
 * 	LeeryValidarRespuesta
 * 	Mientras respuesta es Si
 * 		RealizarJuego
 * 	FinMientras
 * Fin
 * 
 * PD LeeryValidarRespuesta //Yeray no aprueba esto //No es necesario puesto que ya esta estudiado en el estudio
 * Inicio
 * 	Repetir
 * 		Escribir("Quieres jugar, sera divertido?")
 * 		Leer(respuesta)
 * 	Mientras respuesta == 's' || respuesta == 'n' && respuesta == 'S' || respuesta == 'N'
 * 
 * PD RealizarJuego
 * Inicio
 * 	Repetir
 * 		Escribir ("Elija su decision") //MostrarMenu como modulo
 * 		Escribir ("1. Piedra")
 * 		Escribir ("2. Papel")
 * 		Escribir ("3. Tijera")
 * 		Leer(eleccion) //Es la eleccion del jugador
 * 		EleccionMaquina //Es la eleccion del rival
 * 		
 *  
 * 		Segun (eleccion) //ComprobarJugada
 * 			Caso 1: //Piedra
 * 				Si (rival es igual a 1) 
 * 					Escribir ("Empate")
 * 					Sumamos uno a la puntuacion del empate
 * 
 * 				Sino Si (rival es igual a 2)
 * 						Escribir ("Pierdes")
 * 						Sumamos uno a la puntuacion del rival
 * 
 * 					 Sino 
 * 						Escribir ("Ganas")
 * 						Sumamos uno a la puntuacion del jugador
 * 					 FinSi
 * 				FinSi
 * 			Fin Caso1
 * 
 * 			Caso 2: //Papel
 * 				Si (rival es igual a 1)
 * 					Escribir ("Ganas")
 * 					Sumamos uno a la puntuacion del jugador
 * 
 * 				Sino Si (rival es igual a 2)
 * 						Escribir ("Empate")
 *					    Sumamos uno a la puntuacion del empate
 * 		
 * 					 Sino 
 * 						Escribir ("Pierdes")
 * 						Sumamos uno a la puntuacion del rival
 * 					 FinSi
 * 				FinSi
 * 			Fin Caso2
 * 
 * 			Caso 3: //Tijera
 * 				Si (rival es igual a 1)
 * 					Escribir ("Pierdes")
 * 					Sumamos uno a la puntuacion del rival
 * 
 * 				Sino Si (rival es igual a 2)
 * 						Escribir ("Ganas")
 * 						Sumamos uno a la puntuacion del jugador
 * 
 * 					 Sino 
 * 						Escribir ("Empate")
 * 						Sumamos uno a la puntuacion del empate
 * 
 * 					 FinSi
 * 				FinSi	
 * 			Fin Caso3
 * 		FinSegun
 * 	SumamosPuntuacion
	Escribir("La puntucion es: Jugador " + puntuacionJugador + " Maquina " + puntuacionRival + " y empates: " + empate " (PD: Los empates no puntuan para ganar)");
 * 	Mientras no haya un ganador
 * 	Si puntuacion jugador es igual a 3 //MostrarResultado
 * 		Escribir ("Has ganado")
 * 	Sino 
 * 		Escribir ("Has perdido")
 * 
 * 	ActualizarRespuesta //Volver a jugar
 * 	FinMientras
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
		int empate = 0;
		Scanner teclado = new Scanner(System.in);
		Random random = new Random();
		
		//LeeryValidarRespuesta
		do {	//Repetir
			System.out.println("Quieres jugar, sera divertido (S/N)"); //Escribir ("Quieres jugar, sera divertido (S/N)")
			respuesta = teclado.next().charAt(0); //Leer(respuesta)
		}
		while((respuesta != 'S' && respuesta != 'N') && (respuesta != 's' && respuesta != 'n')); //Mientras((respuesta != 'S' && respuesta != 'N') && (respuesta != 's' && respuesta != 'n'))
		
		while (respuesta == 's'  || respuesta == 'S') { //Si respuesta es si
			//System.out.println("Guay");
				do{ //Repetir
				System.out.println("Elija su decision"); //Escribir ("Elija su decision")
				System.out.println("1. Piedra"); //Escribir ("1. Piedra")
				System.out.println("2. Papel"); //Escribir ("2. Papel")
				System.out.println("3. Tijera"); //Escribir ("3. Tijera")
				eleccion = teclado.nextInt(); //Leer(eleccion) // Es la eleccion del jugador
				rival = random.nextInt(3)+1; 
				//System.out.println("Tu jugada " + eleccion + " y la suya " + rival); //Prueba
				
				
				switch(eleccion) { //Segun (eleccion)
					case 1: //Caso1:
						if (rival == 1) { // Si(rival es igual a piedra)
							System.out.println("Tu eleccion piedra y la del ordenador piedra"); //Escribir ("Tu eleccion piedra y la del ordenador piedra")
							System.out.println("Empate"); //Escribir("Empate")
							empate++; //Sumamos uno a la puntuacion del empate
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
							empate++; //Sumamos uno a la puntuacion del empate
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
								empate++; //Sumamos uno a la puntuacion del empate
							}
					break; //FinCaso3
				} //FinSegun
			//SumamosPuntuacion
			System.out.println("La puntucion es: Jugador " + puntjug + " Maquina " + puntriv + " Empates " + empate + " (PD: Los empates no puntuan para ganar)"); //Escribir("La puntucion es: Jugador " + puntuacionJugador + " Maquina " + puntuacionRival + " y empates: " + empate " (PD: Los empates no puntuan para ganar)");
			}
			while(puntjug < 3 && puntriv < 3); //Mientras no haya un ganador
			
			if (puntjug == 3) { //Si la puntuacion del jugador es igual a 3
				System.out.println("Has ganado"); //Escribir ("Has ganado")
			}
			else { //Sino
				System.out.println("Has perdido"); //Escribir ("Has perdido")
			} //FinSi
			
			//ActualizarRespuesta
			do{ //Repetir
				System.out.println("Quieres jugar de nuevo?"); //Escribir ("Quieres jugar de nuevo")
				respuesta = teclado.next().charAt(0); //Leer(respuesta)
			}
			while(respuesta != 's'  && respuesta != 'S' && respuesta != 'n' && respuesta != 'N'); //Mientras respuesta no sea s ni S y respuesta no sea n ni N
		
			} //FinMientras
		
		System.out.println("Cerrando programa..."); //Escribir("Cerrando programa...")
		
		
	}
}

