/*
 * juegoChichi
 * 
 * Analisis
 * Entrada: - Decision
 * Salida: - Resultado de la jugada
 * 		   - Resultado del ganador
 * 		   - Mensaje con el usuario
 * Requisitos: - Decision son del 1 al 6
 * 
 * PG Level 0
 * Inicio
 * 	LeerNombreJ1
 * 	LeerNombreJ2
 * 	Mientras queden jugadas
 * 		pintarDecision*
 * 		RealizarJugada*
 * 		MostrarGanadorJugada*
 * 	FinMientras
 * 	MostrarGanador*
 * Fin 
 * 
 * 
 */

import java.util.*;
import java.io.*;
public class juegoChichi {
	
	public static void main (String[] args) {
		char intro;
		int decision;
		int jugada = 0;
		int dado1 = 0;
		int dado2 = 0;
		int dado3 = 0;
		int dado4 = 0;
		int dado5 = 0;
		int dado6 = 0;
		int negro1 = 0;
		int rojos1 = 0;
		int jota1 = 0;
		int qu1 = 0;
		int rey1 = 0;
		int as1 = 0;
		int negro2 = 0;
		int rojos2 = 0;
		int jota2 = 0;
		int qu2 = 0;
		int rey2 = 0;
		int as2 = 0;
		int suma1 = 0;
		int suma2 = 0;
		boolean	rep = false;
		int aux = 0;
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
		
		while(jugada < 6) {
			//resguardosC.pintarDecision();
			//Le toca al J1
			System.out.println("Te toca, " + nombreJ1);
			do {
			utilidadC.pintarDecision();
			decision = teclado.nextInt();
			
			if (decision == aux) {
				System.out.println("No puedes repetir");
				rep = true;
			}
			}
			while ((decision < 1 || decision > 6) && rep == true);
			
			switch(decision) {
				
				case 1:
				for (int contador = 0; contador < 3; contador++) {
					System.out.println("Para tirar pulse cualquier tecla " + nombreJ1);
					intro = teclado.next().charAt(0);
					dado1 = random.nextInt(6)+1;
					dado2 = random.nextInt(6)+1;
					dado3 = random.nextInt(6)+1;
					dado4 = random.nextInt(6)+1;
					dado5 = random.nextInt(6)+1;
					dado6 = random.nextInt(6)+1;
					negro1 = utilidadC.comprobarNegros(dado1, dado2, dado3, dado4, dado5, dado6);
					suma1 = suma1 + negro1;
					System.out.println("Negro: " + negro1);
					
					System.out.println("Le toca, " + nombreJ2);
					System.out.println("Para tirar pulse cualquier tecla " + nombreJ2);
					intro = teclado.next().charAt(0);
					
					dado1 = random.nextInt(6)+1;
					dado2 = random.nextInt(6)+1;
					dado3 = random.nextInt(6)+1;
					dado4 = random.nextInt(6)+1;
					dado5 = random.nextInt(6)+1;
					dado6 = random.nextInt(6)+1;
					System.out.println("Negro: " + negro2);
					negro2 = utilidadC.comprobarNegros(dado1, dado2, dado3, dado4, dado5, dado6);
					suma2 = suma2 + negro2;
					
				}
				System.out.println("El total de negros que has conseguido es " + suma1);
				System.out.println("El total de negros que has conseguido es " + suma2);
				aux = decision;
				
				break;
				
				case 2:
				for (int contador = 0; contador < 4; contador++) {
					
					dado1 = random.nextInt(6)+1;
					dado2 = random.nextInt(6)+1;
					dado3 = random.nextInt(6)+1;
					dado4 = random.nextInt(6)+1;
					dado5 = random.nextInt(6)+1;
					dado6 = random.nextInt(6)+1;
					rojos1 = rojos1 + utilidadC.comprobarRojos(dado1, dado2, dado3, dado4, dado5, dado6);
					
					System.out.println("Le toca, " + nombreJ2);
					dado1 = random.nextInt(6)+1;
					dado2 = random.nextInt(6)+1;
					dado3 = random.nextInt(6)+1;
					dado4 = random.nextInt(6)+1;
					dado5 = random.nextInt(6)+1;
					dado6 = random.nextInt(6)+1;
					
					rojos2 = rojos2 + utilidadC.comprobarRojos(dado1, dado2, dado3, dado4, dado5, dado6);
				}
				System.out.println("El total de rojos que has conseguido es " + rojos1);
				System.out.println("El total de rojos que has conseguido es " + rojos2);
				aux = decision;
				break;
				
				case 3:
				for (int contador = 0; contador < 4; contador++) {				
					dado1 = random.nextInt(6)+1;
					dado2 = random.nextInt(6)+1;
					dado3 = random.nextInt(6)+1;
					dado4 = random.nextInt(6)+1;
					dado5 = random.nextInt(6)+1;
					dado6 = random.nextInt(6)+1;
				
					jota1 = jota1 + utilidadC.comprobarJotas(dado1, dado2, dado3, dado4, dado5, dado6);
					
					System.out.println("Le toca, " + nombreJ2);
					dado1 = random.nextInt(6)+1;
					dado2 = random.nextInt(6)+1;
					dado3 = random.nextInt(6)+1;
					dado4 = random.nextInt(6)+1;
					dado5 = random.nextInt(6)+1;
					dado6 = random.nextInt(6)+1;
					
					jota2 = jota2 + utilidadC.comprobarJotas(dado1, dado2, dado3, dado4, dado5, dado6);
				}
				System.out.println("El total de jotas que has conseguido es " + jota1);
				System.out.println("El total de jotas que has conseguido es " + jota2);
				aux = decision;
			
				break;
				
				case 4:
				
				for (int contador = 0; contador < 4; contador++) {				
					dado1 = random.nextInt(6)+1;
					dado2 = random.nextInt(6)+1;
					dado3 = random.nextInt(6)+1;
					dado4 = random.nextInt(6)+1;
					dado5 = random.nextInt(6)+1;
					dado6 = random.nextInt(6)+1;

					qu1 = qu1 + utilidadC.comprobarReinas(dado1, dado2, dado3, dado4, dado5, dado6);
					
					System.out.println("Le toca, " + nombreJ2);
					dado1 = random.nextInt(6)+1;
					dado2 = random.nextInt(6)+1;
					dado3 = random.nextInt(6)+1;
					dado4 = random.nextInt(6)+1;
					dado5 = random.nextInt(6)+1;
					dado6 = random.nextInt(6)+1;
					
					qu2 = qu2 + utilidadC.comprobarReinas(dado1, dado2, dado3, dado4, dado5, dado6);
					
				}
				System.out.println("El total de reinas que has conseguido es " + qu1);
				System.out.println("El total de reinas que has conseguido es " + qu2);
				aux = decision;
				break;
				
				case 5:
				
				for (int contador = 0; contador < 4; contador++) {				
					dado1 = random.nextInt(6)+1;
					dado2 = random.nextInt(6)+1;
					dado3 = random.nextInt(6)+1;
					dado4 = random.nextInt(6)+1;
					dado5 = random.nextInt(6)+1;
					dado6 = random.nextInt(6)+1;
					
					rey1 = rey1 + utilidadC.comprobarReyes(dado1, dado2, dado3, dado4, dado5, dado6);
					
					System.out.println("Le toca, " + nombreJ2);
					dado1 = random.nextInt(6)+1;
					dado2 = random.nextInt(6)+1;
					dado3 = random.nextInt(6)+1;
					dado4 = random.nextInt(6)+1;
					dado5 = random.nextInt(6)+1;
					dado6 = random.nextInt(6)+1;
						
					rey2 = rey2 + utilidadC.comprobarReyes(dado1, dado2, dado3, dado4, dado5, dado6);
				}
				System.out.println("El total de reinas que has conseguido es " + rey1);
				System.out.println("El total de reyes que has conseguido es " + rey2);
				aux = decision;
				break;
				
				case 6:
				
				for (int contador = 0; contador < 4; contador++) {				
					dado1 = random.nextInt(6)+1;
					dado2 = random.nextInt(6)+1;
					dado3 = random.nextInt(6)+1;
					dado4 = random.nextInt(6)+1;
					dado5 = random.nextInt(6)+1;
					dado6 = random.nextInt(6)+1;

					as1 = as1 + utilidadC.comprobarAs(dado1, dado2, dado3, dado4, dado5, dado6);
					
					System.out.println("Le toca, " + nombreJ2);
					dado1 = random.nextInt(6)+1;
					dado2 = random.nextInt(6)+1;
					dado3 = random.nextInt(6)+1;
					dado4 = random.nextInt(6)+1;
					dado5 = random.nextInt(6)+1;
					dado6 = random.nextInt(6)+1;
					
					as2 = as2 + utilidadC.comprobarAs(dado1, dado2, dado3, dado4, dado5, dado6);
				}
				System.out.println("El total de reinas que has conseguido es " + as1);
				System.out.println("El total de reyes que has conseguido es " + as2);
				aux = decision;
			
				break;
				
			}
			jugada++;
		}
		
		//MostrarGanador
		ganadorJ1 = (negro1) + (rojos1 * 2) + (jota1 * 3) + (qu1 * 4) + (rey1 * 5) + (as1 * 6);
		ganadorJ2 = (negro2) + (rojos2 * 2) + (jota2 * 3) + (qu2 * 4) + (rey2 * 5) + (as2 * 6);
		
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

