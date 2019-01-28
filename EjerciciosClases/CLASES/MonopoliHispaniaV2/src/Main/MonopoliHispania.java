package Main;

import java.util.Random;
import java.util.Scanner;

import clases.JugadorImp;
import metodos.utilidadesMonopoli;

/*
 * Nombre del programa: MonopoliHispania
 * Breve comentario: Este juego simula el juego de mesa del monopoli con cuatro jugadores
 * Analisis
 * Entrada: - opcion
 * 			- J1
 * 			- J2
 * 			- J3
 * 			- J4
 * 
 * Salida: - Mensajes con el usuario
 * 		   - Resultado de la partida 
 * Requisitos: - opcion tiene que ser s o n
 * 
 * PG level 0
 * Inicio
 * 	CrearyElegirJugadores //Siempre seran 4
 * 	ElegirTirador
 * 	EmpezarJuego
 * 	ResultadoFinal
 * Fin
 * 
 * Modulo EmpezarJuego
 * Inicio
 * 	Repetir
 * 		TirarDados
 * 		Si has caido en calle
 * 			Si quieres comprar calle
 * 				ComprarCalle
 * 		Sino Si has caido en ayuda
 * 				EfectuarAyuda
 * 			Sino Si has caido en la carcel
 * 			 	    EfectuarCarcel
 * 				 Sino Si has caido en salida
 * 					     EfectuarSalida
 * 	Mientras los jugadores tengan dinero
 * Fin
 */

public class MonopoliHispania {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		Random random = new Random();
		JugadorImp J1 = new JugadorImp();
		JugadorImp J2 = new JugadorImp();
		JugadorImp J3 = new JugadorImp();
		JugadorImp J4 = new JugadorImp();
		String nombre;
		int opcion = 0;
		int dado1 = 0;
		int dado2 = 0;
		
		//ElegirJugadores //Siempre seran 4
		//J1
		
		for(int contador = 0; contador < 4; contador++) {
			System.out.println("Elija el nombre del jugador "+(1 + contador));
			switch(contador) {
			case 0:
				//Elige el nombre del J1
				J1.setNombre(teclado.nextLine());
				
				//EligeFicha
				do {
					utilidadesMonopoli.menuFicha();
					opcion = teclado.nextInt() - 1;
				}
				while(opcion < -1 || opcion > 7);
			break;
			
			case 1:
				//Elige el nombre del J2
				J2.setNombre(teclado.nextLine());
				
				//EligeFicha
				do {
					utilidadesMonopoli.menuFicha();
					opcion = teclado.nextInt();
				}
				while(opcion < -1 || opcion > 7);
				
			break;
			
			case 2:
				//Elige el nombre del J3
				J3.setNombre(teclado.nextLine());
				
				//EligeFicha
				do {
					utilidadesMonopoli.menuFicha();
					opcion = teclado.nextInt();
				}
				while(opcion < -1 || opcion > 7);
			break;
			
			case 3:
				//Elige el nombre del J4
				J4.setNombre(teclado.nextLine());
				
				//EligeFicha
				do {
					utilidadesMonopoli.menuFicha();
					opcion = teclado.nextInt();
				}
				while(opcion < -1 || opcion > 7);
			break;
			}
		}
		//ElegirTirador
		//EmpezarJuego
		//ResultadoFinal
	}

}
