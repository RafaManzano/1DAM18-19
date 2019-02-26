/*
 * juegoChichi2 //Version mejorada de la version 1
 * 
 * Analisis
 * Entrada: - Decision
 * 
 * Salida: - Resultado de cada jugada
 * 		   - Resultado del ganador de la partida
 * 		   - Mensaje con el usuario
 *		   - Eco de los datos
 * 
 * Requisitos: - Decision son del 1 al 6
 * 
 * PG Level 0
 * Inicio
 * 	LeerNombreJ1
 * 	LeerNombreJ2
 * 	Mientras queden jugadas y no se repita el mismo numero
 * 		pintarDecision*
 * 		segun(decision)
 * 			para caso 1:
 * 				realizarTirada*
 * 				comprobarGanadorTirada*
 * 			para caso 2:
 * 				realizarTirada*
 * 				comprobarGanadorTirada*
 * 			para caso 3:
 * 				realizarTirada*
 * 				comprobarGanadorTirada*
 * 			para caso 4:
 * 				realizarTirada*
 * 				comprobarGanadorTirada*
 * 			para caso 5:
 * 				realizarTirada*
 * 				comprobarGanadorTirada*
 * 			para caso 6:
 * 				realizarTirada*
 * 				comprobarGanadorTirada*
 * 		FinSegun
 * 	FinMientras
 * 	MostrarGanadorPartida*
 * Fin 
 * 
 * 
 */

import java.util.*;
import java.io.*;
public class juegoChichi2 {
	
	public static void main (String[] args) {
		char intro;
		int decision;
		int auxJ1;
		int auxJ2;
		int sumaNJ1 = 0;
		int sumaNJ2 = 0;
		int sumaRJ1 = 0;
		int sumaRJ2 = 0;
		int sumaJJ1 = 0;
		int sumaJJ2 = 0;
		int sumaQJ1 = 0;
		int sumaQJ2 = 0;
		int sumaKJ1 = 0;
		int sumaKJ2 = 0;
		int sumaAJ1 = 0;
		int sumaAJ2 = 0;
		int ganadorJ1;
		int ganadorJ2;
		String nombreJ1;
		String nombreJ2;
		Scanner teclado = new Scanner (System.in);
		Random random = new Random ();
		
		System.out.println("Escriba el nombre del Jugador 1");
		//LeerNombreJ1
		nombreJ1 = teclado.next();
		System.out.println("Escriba el nombre del Jugador 2");
		//LeerNombreJ1
		nombreJ2 = teclado.next();
		
		
		for (int contador = 0; contador < 6; contador++) { //Para contador, mientras contador es menos que 6 se suma 1 al contador
			//pintarDecision
			//LeeryValidarDecision
			System.out.println("Te toca, " + nombreJ1);
			do {
			utilidadC.pintarDecision();
			decision = teclado.nextInt();
			}
			while ((decision < 1 || decision > 6));
			
			switch(decision) {
				//LOS NEGROS
				case 1:
				for (int cont = 0; cont < 3; cont++) {
					System.out.println("Para tirar pulse cualquier tecla " + nombreJ1);
					intro = teclado.next().charAt(0);
					auxJ1 = utilidadC.tirarDadosyComprobarNegros();
					System.out.println("Negro: " + auxJ1);
					sumaNJ1 = sumaNJ1 + auxJ1;
					
					System.out.println("Le toca, " + nombreJ2);
					System.out.println("Para tirar pulse cualquier tecla " + nombreJ2);
					intro = teclado.next().charAt(0);
					auxJ2 = utilidadC.tirarDadosyComprobarNegros();
					System.out.println("Negro: " + auxJ2);
					sumaNJ2 = sumaNJ2 + auxJ2;
				}
					System.out.println("El total de negros que has conseguido es " + sumaNJ1);
					System.out.println("El total de negros que has conseguido es " + sumaNJ2);
					
				break;
				
				//LOS ROJOS
				case 2:
				for (int cont = 0; cont < 3; cont++) {
					System.out.println("Para tirar pulse cualquier tecla " + nombreJ1);
					intro = teclado.next().charAt(0);
					auxJ1 = utilidadC.tirarDadosyComprobarRojos();
					System.out.println("Rojos: " + auxJ1);
					sumaRJ1 = sumaRJ1 + auxJ1;
					
					System.out.println("Le toca, " + nombreJ2);
					System.out.println("Para tirar pulse cualquier tecla " + nombreJ2);
					intro = teclado.next().charAt(0);
					auxJ2 = utilidadC.tirarDadosyComprobarRojos();
					System.out.println("Rojos: " + auxJ2);
					sumaRJ2 = sumaRJ2 + auxJ2;
				}
					System.out.println("El total de rojos que has conseguido es " + sumaRJ1);
					System.out.println("El total de rojos que has conseguido es " + sumaRJ2);
					
				break;
				
				//LAS JOTAS
				case 3:
				for (int cont = 0; cont < 3; cont++) {
					System.out.println("Para tirar pulse cualquier tecla " + nombreJ1);
					intro = teclado.next().charAt(0);
					auxJ1 = utilidadC.tirarDadosyComprobarJotas();
					System.out.println("Jotas: " + auxJ1);
					sumaJJ1 = sumaJJ1 + auxJ1;
					
					System.out.println("Le toca, " + nombreJ2);
					System.out.println("Para tirar pulse cualquier tecla " + nombreJ2);
					intro = teclado.next().charAt(0);
					auxJ2 = utilidadC.tirarDadosyComprobarJotas();
					System.out.println("Jotas: " + auxJ2);
					sumaJJ2 = sumaJJ2 + auxJ2;
				}
					System.out.println("El total de jotas que has conseguido es " + sumaJJ1);
					System.out.println("El total de jotas que has conseguido es " + sumaJJ2);
				
				break;
				
				//LAS REINAS
				case 4:
				for (int cont = 0; cont < 3; cont++) {
					System.out.println("Para tirar pulse cualquier tecla " + nombreJ1);
					intro = teclado.next().charAt(0);
					auxJ1 = utilidadC.tirarDadosyComprobarReinas();
					System.out.println("Reinas: " + auxJ1);
					sumaQJ1 = sumaQJ1 + auxJ1;
					
					System.out.println("Le toca, " + nombreJ2);
					System.out.println("Para tirar pulse cualquier tecla " + nombreJ2);
					intro = teclado.next().charAt(0);
					auxJ2 = utilidadC.tirarDadosyComprobarReinas();
					System.out.println("Reinas: " + auxJ2);
					sumaQJ2 = sumaQJ2 + auxJ2;
				}
					System.out.println("El total de reinas que has conseguido es " + sumaQJ1);
					System.out.println("El total de reinas que has conseguido es " + sumaQJ2);
					
				break;
				
				//LOS REYES
				case 5:
				for (int cont = 0; cont < 3; cont++) {
					System.out.println("Para tirar pulse cualquier tecla " + nombreJ1);
					intro = teclado.next().charAt(0);
					auxJ1 = utilidadC.tirarDadosyComprobarReyes();
					System.out.println("Reyes: " + auxJ1);
					sumaKJ1 = sumaKJ1 + auxJ1;
					
					System.out.println("Le toca, " + nombreJ2);
					System.out.println("Para tirar pulse cualquier tecla " + nombreJ2);
					intro = teclado.next().charAt(0);
					auxJ2 = utilidadC.tirarDadosyComprobarReyes();
					System.out.println("Reyes: " + auxJ2);
					sumaKJ2 = sumaKJ2 + auxJ2;
				}
					System.out.println("El total de reyes que has conseguido es " + sumaKJ1);
					System.out.println("El total de reyes que has conseguido es " + sumaKJ2);
					
				break;
				
				//LOS ASES
				case 6:
				for (int cont = 0; cont < 3; cont++) {
					System.out.println("Para tirar pulse cualquier tecla " + nombreJ1);
					intro = teclado.next().charAt(0);
					auxJ1 = utilidadC.tirarDadosyComprobarAses();
					System.out.println("Ases: " + auxJ1);
					sumaAJ1 = sumaAJ1 + auxJ1;
					
					System.out.println("Le toca, " + nombreJ2);
					System.out.println("Para tirar pulse cualquier tecla " + nombreJ2);
					intro = teclado.next().charAt(0);
					auxJ2 = utilidadC.tirarDadosyComprobarAses();
					System.out.println("Ases: " + auxJ2);
					sumaAJ2 = sumaAJ2 + auxJ2;
				}
					System.out.println("El total de ases que has conseguido es " + sumaAJ1);
					System.out.println("El total de ases que has conseguido es " + sumaAJ2);
					
				break;
			}
		}
		//MostrarGanadorPartida
		ganadorJ1 = (sumaNJ1) + (sumaRJ1 * 2) + (sumaJJ1 * 3) + (sumaQJ1 * 4) + (sumaKJ1 * 5) + (sumaAJ1 * 6);
		ganadorJ2 = (sumaNJ2) + (sumaRJ2 * 2) + (sumaJJ2 * 3) + (sumaQJ2 * 4) + (sumaKJ2 * 5) + (sumaAJ2 * 6);
		
		if (utilidadC.comprobarGanador(ganadorJ1, ganadorJ2) == 1) {
			System.out.println("Ha ganado " + nombreJ1);
		}
		else if (utilidadC.comprobarGanador(ganadorJ1, ganadorJ2) == 2) {
				System.out.println("Ha ganado " + nombreJ2);
			 }
			 else {
				 System.out.println("La partida ha quedado en empate");
			 }
	}
}

