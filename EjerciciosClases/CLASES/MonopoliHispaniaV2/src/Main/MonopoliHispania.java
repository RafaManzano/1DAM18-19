package Main;

import java.util.Random;
import java.util.Scanner;

import clases.JugadorImp;
<<<<<<< HEAD
import enumerados.TipoNombreFicha;
=======
>>>>>>> 70c3045a8e9e2b4f91b70845abc662832c447af5
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
<<<<<<< HEAD
 * 	ElegirJugadores //Siempre seran 4
=======
 * 	CrearyElegirJugadores //Siempre seran 4
>>>>>>> 70c3045a8e9e2b4f91b70845abc662832c447af5
 * 	ElegirTirador
 * 	EmpezarJuego
 * 	ResultadoFinal
 * Fin
 * 
<<<<<<< HEAD
 * Modulo ElegirJugadores
 * Inicio
 * 	Para los cuatros jugadores
 * 		ElegirJugador1
 * 		EligeFicha
 * 		ElegirJugador2
 * 		EligeFicha
 * 		EligirJugador3
 * 		EligeFicha
 * 		ElegirJugador4
 * 		EligeFicha
 * 	FinPara
 * Fin
 * 
 * Modulo ElegirTirador
 * Inicio
 * 	TiradaInicioJ1
 * 	TiradaInicioJ2
 * 	TiradaInicioJ3
 * 	TiradaInicioJ4
 * 	OrdenTiradaInicial*
 * Fin
 * 
=======
>>>>>>> 70c3045a8e9e2b4f91b70845abc662832c447af5
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
<<<<<<< HEAD
		TipoNombreFicha[] ficha;
		int opcion = 0;
		int dado1 = 0;
		int dado2 = 0;
		int empezarJ1;
		int empezarJ2;
		int empezarJ3;
		int empezarJ4;
		char vacio;
		ficha = utilidadesMonopoli.elegirNombreFicha();
=======
		int opcion = 0;
		int dado1 = 0;
		int dado2 = 0;
		
>>>>>>> 70c3045a8e9e2b4f91b70845abc662832c447af5
		//ElegirJugadores //Siempre seran 4
		//J1
		
		for(int contador = 0; contador < 4; contador++) {
<<<<<<< HEAD
			System.out.println("Elija el nombre del jugador " + (contador + 1));
			/*for(int i = 0; i < ficha.length; i++) {
				System.out.println(ficha[i]);
			}
			*/
			switch(contador) {
			case 0:
				//Elige el nombre del J1
				//System.out.println("1");
				nombre = teclado.next();
				J1.setNombre(nombre);
				
				//EligeFicha
				do {
					do {
						utilidadesMonopoli.menuFicha();
						opcion = teclado.nextInt() - 1;
					} 
					while(opcion < 0 || opcion > 7);
					J1.setNombreFicha(ficha[opcion]);
				}
				while(J1.getNombreFicha() == null);
				utilidadesMonopoli.ponerNull(opcion, ficha);
=======
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
>>>>>>> 70c3045a8e9e2b4f91b70845abc662832c447af5
			break;
			
			case 1:
				//Elige el nombre del J2
<<<<<<< HEAD
				//System.out.println("2");
				nombre = teclado.next();
				J2.setNombre(nombre);
				
				//EligeFicha
				do {
					do {
						utilidadesMonopoli.menuFicha();
						opcion = teclado.nextInt() - 1;
					} 
					while(opcion < 0 || opcion > 7);
					J2.setNombreFicha(ficha[opcion]);
				}
				while(J2.getNombreFicha() == null);
				utilidadesMonopoli.ponerNull(opcion, ficha);

=======
				J2.setNombre(teclado.nextLine());
				
				//EligeFicha
				do {
					utilidadesMonopoli.menuFicha();
					opcion = teclado.nextInt();
				}
				while(opcion < -1 || opcion > 7);
				
>>>>>>> 70c3045a8e9e2b4f91b70845abc662832c447af5
			break;
			
			case 2:
				//Elige el nombre del J3
<<<<<<< HEAD
				//System.out.println("3");
				nombre = teclado.next();
				J3.setNombre(nombre);
				
				//EligeFicha
				do {
					do {
						utilidadesMonopoli.menuFicha();
						opcion = teclado.nextInt() - 1;
					} 
					while(opcion < 0 || opcion > 7);
					J3.setNombreFicha(ficha[opcion]);
				}
				while(J3.getNombreFicha() == null);
				utilidadesMonopoli.ponerNull(opcion, ficha);
=======
				J3.setNombre(teclado.nextLine());
				
				//EligeFicha
				do {
					utilidadesMonopoli.menuFicha();
					opcion = teclado.nextInt();
				}
				while(opcion < -1 || opcion > 7);
>>>>>>> 70c3045a8e9e2b4f91b70845abc662832c447af5
			break;
			
			case 3:
				//Elige el nombre del J4
<<<<<<< HEAD
				//System.out.println("4");
				nombre = teclado.next();
				J4.setNombre(nombre);
				
				//EligeFicha
				do {
					do {
						utilidadesMonopoli.menuFicha();
						opcion = teclado.nextInt() - 1;
					} 
					while(opcion < 0 || opcion > 7);
					J4.setNombreFicha(ficha[opcion]);
					}
				while(J4.getNombreFicha() == null);
				utilidadesMonopoli.ponerNull(opcion, ficha);
			break;
			}
		}
		
		//OrdenTiradaInicial*
		utilidadesMonopoli.ordenTiradaInicial(J1,J2,J3,J4);
		
		//EmpezarJuego
		utilidadesMonopoli.decidirEmpezar(J1, J2, J3, J4);
=======
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
>>>>>>> 70c3045a8e9e2b4f91b70845abc662832c447af5
		//ResultadoFinal
	}

}
