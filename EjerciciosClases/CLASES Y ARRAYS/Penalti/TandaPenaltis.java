/*
 * Nombre del programa: TandaPenaltis
 * Comentario: Este programa juega tandas de penaltis hasta que pierdas
 * 
 * Analisis:
 * Entrada: - Respuesta
 * 			- Nombre //El nombre del jugador que introduce desde teclado
 * 			- Dorsal
 * 			- Decision //Es el golpeo o la parada de los jugadores
 * 
 * Salida: - Numero de partidas ganadas
 * 		   - Mensajes con el usuario
 * 
 * Requisitos: - Respuesta tiene que ser s o n
 * 			   - dorsal tiene que ser entre 1 y 99
 * 			   - decision esta entre 1 y 3
 * 
 * PG Level 0
 * Inicio
 * 	LeeryValidarRespuesta
 * 	Mientras respuesta sea si
 * 		TandaPenaltis
 * 		LeeryValidarRespuesta
 * 	FinMientras
 * 
 * Modulo TandaPenaltis
 * Inicio
 * Repetir
 * 	LeerDatosJugador
 * 	Repetir
 * 		LeerDatosRival
 * 		EleccionTurno
 * 		GolpeoJugador
 * 		GolpeoRival
 * 		ComprobarParada
 * 	Mientras no haya un ganador
 * 	MostrarGanador
 * Mientras el jugador no haya perdido
 * MostrarResultadoRondas
 * Fin
 * 
 */

import java.util.*;
public class TandaPenaltis {
	
	public static void main (String[] args) {
		char respuesta;
		String nombre;
		int dorsal;
		String[] nombres;  //Se usa para obtener los nombres de los rivales
		int contJ1 = 0; //Contador goles del J1
		int contRival = 0; //Contador goles del rival
		int decision; //Es la decision de donde chutar o donde parar
		int pganada = 1; //Son las rondas que va a pasar el jugador, si pierde seria la primera
		boolean tira = false; //El turno de la partida
		Scanner teclado = new Scanner(System.in);
		Random random = new Random();
		JugadorImp J1 = new JugadorImp();
		JugadorImp rival = new JugadorImp();
		gestoraPenalti gestora = new gestoraPenalti();
		
		//LeeryValidarRespuesta
		do {
			System.out.println("Quieres ejecutar el programa? (S/N)");
			respuesta = Character.toLowerCase(teclado.next().charAt(0));
		}
		while(respuesta != 's' && respuesta != 'n');
		
		while(respuesta == 's') {
			//System.out.println("Llama al VAR");
			//LeerDatosJugador
			System.out.println("Elija el nombre para su jugador");
			nombre = teclado.next();
			System.out.println("Elija su dorsal (1 - 99)");
			dorsal = teclado.nextInt();
			J1.cambiarJugador(nombre, dorsal);
			
			do {
				//LeerDatosRival
				nombres = gestora.cargarArrayNombres();
				nombre = nombres[random.nextInt(15)];
				dorsal = random.nextInt(100);
				rival.cambiarJugador(nombre, dorsal);
				System.out.println("Tu rival es " + rival.getNombre());
				contJ1 = 0;
				contRival = 0;
				
				do {
					//EleccionTurno
					if(tira == false) {
						System.out.println(J1.getNombre() + " golpea");
					}
					else {
						System.out.println(rival.getNombre() + " golpea");
						
					}
					//GolpeoJugador
					utilPenalti.menuGolpeo();
					decision = validacionesPenalti.validarGolpeo();
					
					try {
						J1.setDecision(decision);
					}
					catch(ExcepcionJugador err) {
						System.out.println("El golpeo es entre 1 y 3");
					}
					
					//GolpeoRival
					decision = random.nextInt(3)+1;
					try {
						rival.setDecision(decision);
					}
					catch(ExcepcionJugador err) {
						System.out.println("El golpeo es entre 1 y 3");
					}
					
					//System.out.println("J1: " + J1.getDecision() + " y Rival: " + rival.getDecision());
					
					//ComprobarParada
					if(tira == false) {
						gestora.comprobarParada(J1, rival);
						if(gestora.comprobarParada(J1, rival) == false) {
							System.out.println("GOOOOL!!");
							contRival++;
						}
						else {
							System.out.println("PAAARAAAADOOON");
						}
						
						tira = true;
					}
					else {
						gestora.comprobarParada(rival, J1);
						if(gestora.comprobarParada(J1, rival) == false) {
							System.out.println("GOOOOL!!");
							contJ1++;
						}
						else {
							System.out.println("PAAARAAAADOOON");
						}
						
						tira = false;
					}
				}
				while(contJ1 < 3 && contRival < 3);
				
				//MostrarGanador
				System.out.println("Tanda de penaltis acabada");
				if(contRival >= 3) {
					System.out.println("Genial, has ganado");
					pganada++;
				}
				else {
					System.out.println("Lo siento, has perdido");
				}
			}
			while(contJ1 < 3);
			
			//MostrarResultadoRondas
			System.out.println("Has conseguido llegar a la ronda " + pganada);
			
			//LeeryValidarRespuesta
			do {
				System.out.println("Quieres ejecutar el programa? (S/N)");
				respuesta = Character.toLowerCase(teclado.next().charAt(0));
			}
			while(respuesta != 's' && respuesta != 'n');
		}
	}
}

