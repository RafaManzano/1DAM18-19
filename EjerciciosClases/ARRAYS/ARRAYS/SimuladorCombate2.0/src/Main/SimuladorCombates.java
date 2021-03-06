/*
 * Nombre del programa: SimuladorCombates

 * Comentario: Este programa realiza una serie de combates (de momento 8)
 * Analisis:
 * 	Entrada: - opcion
 * 			 - respuesta
 * 
 * 	Salida: - Resultado de los combates
 * 			- Mensajes con el usuario
 * 			- Ganador de cada pelea
 * 			- Ganador final	
 * 			- Puntuacion final
 * 
 * 	Requisitos: - Opcion 
 * 				- Respuesta tiene que ser s o n
 * 				
 * 
 * PG Level 0
 * Inicio
 * LeeryValidarRespuesta
 * Mientras respuesta sea si
 * 	EleccionPersonaje
 * 	Pelea
 * 	ResultadoPelea
 * 	ResultadoTotal
 * 	LeeryValidarRespuesta
 * FinMientras
 * Fin
 * 
 * Modulo Pelea
 * Inicio
 * Mientras no pierda
 * 	MostrarRival
 * 	Repetir
 * 		RealizarAtaques
 * 		MostrarDañoOcasionado
 * 	Mientras sigan con vida
 * FinMientras
 * Fin
 */

package Main;
import Clases.*;
import Metodos.*;


import java.util.*;
public class SimuladorCombates  {
	
	public static void main (String[] args) {
		int opcion;
		int pganada = 0;
		int pperdida = 0;
		int numeromovimiento;
		char respuesta;
		int danioRealizado = 0;
		int danioRecibido = 0;
		int rivFallo = 0;
		int J1fallo = 0;
		Luchador[] personajes = new Luchador[8];
		Luchador J1 = null;
		Luchador rival = null;
		Ataque[] habilidades = new Ataque[32];
		Ataque[] kratos = new Ataque[5];
		Ataque[] ezio = new Ataque[5];
		Ataque[] aloy = new Ataque[5];
		Ataque[] geralt = new Ataque[5];
		Ataque[] dante = new Ataque[5];
		Ataque[] cj = new Ataque[5];
		Ataque[] sora = new Ataque[5];
		Ataque[] ellie = new Ataque[5];
		Scanner teclado = new Scanner (System.in);
		Random random = new Random ();
		
		//CrearPersonajesyHabilidades
		
		habilidades = MetodosLuchador.creandoHabilidades(habilidades);
		MetodosLuchador.introduciendoHabilidades(kratos, ezio, aloy, geralt, dante, cj, sora, ellie, habilidades);
		personajes = MetodosLuchador.creandoPersonajes(kratos, ezio, aloy, geralt, dante, cj, sora, ellie);
		
		
		
		//LeeryValidarRespuesta
		do {
			System.out.println("Desea ejecutar el juego (S/N)");
			respuesta = Character.toLowerCase(teclado.next().charAt(0));
		}
		while (respuesta != 's' && respuesta != 'n');
		
		while(respuesta == 's') {
			//EleccionPersonaje
			do {
				MetodosLuchador.menuPersonaje();
				opcion =  teclado.nextInt() - 1;
			}
			while(opcion < 0 || opcion > 7);
			
			J1 = personajes[opcion];
			
			pperdida = 0;
			pganada = 0;
			personajes = MetodosLuchador.creandoPersonajes(kratos, ezio, aloy, geralt, dante, cj, sora, ellie);
			
			//Pelea
			while (pperdida == 0) {
			//MostrarRival
				rival = personajes[random.nextInt(8)];
				System.out.println("Tu rival es " + rival.getNombre());
				
				do {
					danioRecibido = 0;
					danioRealizado = 0;
					//RealizarAtaques
					do {
						MetodosLuchador.menuMovimiento(J1);
						opcion = teclado.nextInt();
					}
					while (opcion < 1 || opcion > 4);
					
					switch(opcion) {
						case 1:
							//System.out.println(J1.getNombreMov(0));
							numeromovimiento = random.nextInt(4);
							System.out.println("El rival usa " + rival.getNombreMov(numeromovimiento));
							J1fallo = random.nextInt(10)+1;
							rivFallo = random.nextInt(10)+1;
							//Ataque J1
							if (J1fallo != 10) {
								if (J1.getEstadisticaMov(0) == false) {
								danioRealizado = (J1.getAtaque() + J1.getDanioMov(0)) - rival.getDefensa();
								System.out.println("El golpe realizado le ha golpeado un total de " + danioRealizado + " puntos de vida");
								}
								else {
									MetodosLuchador.ataqueMejorado(J1, 0);
									System.out.println("Tu ataque mejora un poco tus estadisticas");
								}
							}
							else {
								System.out.println("Has fallado el movimiento");
							}
							
							//Ataque rival
							if (rivFallo != 10) {
								if (rival.getEstadisticaMov(numeromovimiento) == false) {
									danioRecibido = (rival.getAtaque() + rival.getDanioMov(numeromovimiento)) - J1.getDefensa();
									System.out.println("El golpe recibido te ha golpeado un total de " + danioRecibido + " puntos de vida");
								}
								else {
									MetodosLuchador.ataqueMejorado(rival, numeromovimiento);
									System.out.println("Su ataque mejora un poco sus estadisticas");
								}
							}
							else {
								System.out.println("Ha fallado el movimiento");
							}
						
							if(danioRealizado < 0) {
								danioRealizado = 0;
							}
							
							if (danioRecibido < 0) {
								danioRecibido = 0;
							}
							
							J1.setVida(J1.getVida() - danioRecibido);
							rival.setVida(rival.getVida() - danioRealizado);
							
							
						break;
						
						case 2:
							//System.out.println(J1.getNombreMov(1));
							numeromovimiento = random.nextInt(4);
							System.out.println("El rival usa " + rival.getNombreMov(numeromovimiento));
							J1fallo = random.nextInt(10)+1;
							rivFallo = random.nextInt(10)+1;
							//Ataque J1
							if (J1fallo != 10) {
								if (J1.getEstadisticaMov(1) == false) {
								danioRealizado = (J1.getAtaque() + J1.getDanioMov(1)) - rival.getDefensa();
								System.out.println("El golpe realizado le ha golpeado un total de " + danioRealizado + " puntos de vida");
								}
								else {
									MetodosLuchador.ataqueMejorado(J1, 1);
									System.out.println("Tu ataque mejora un poco tus estadisticas");
								}
							}
							else {
								System.out.println("Has fallado el movimiento");
							}
							
							//Ataque rival
							if (rivFallo != 10) {
								if (rival.getEstadisticaMov(numeromovimiento) == false) {
									danioRecibido = (rival.getAtaque() + rival.getDanioMov(numeromovimiento)) - J1.getDefensa();
									System.out.println("El golpe recibido te ha golpeado un total de " + danioRecibido + " puntos de vida");
								}
								else {
									MetodosLuchador.ataqueMejorado(rival, numeromovimiento);
									System.out.println("Su ataque mejora un poco sus estadisticas");
								}
							}
							else {
								System.out.println("Ha fallado el movimiento");
							}
						
							if(danioRealizado < 0) {
								danioRealizado = 0;
							}
							
							if (danioRecibido < 0) {
								danioRecibido = 0;
							}
							
							J1.setVida(J1.getVida() - danioRecibido);
							rival.setVida(rival.getVida() - danioRealizado);
						break;
						
						case 3:
							//System.out.println(J1.getNombreMov(2));
							numeromovimiento = random.nextInt(4);
							System.out.println("El rival usa " + rival.getNombreMov(numeromovimiento));
							J1fallo = random.nextInt(10)+1;
							rivFallo = random.nextInt(10)+1;
							//Ataque J1
							if (J1fallo != 10) {
								if (J1.getEstadisticaMov(2) == false) {
								danioRealizado = (J1.getAtaque() + J1.getDanioMov(2)) - rival.getDefensa();
								System.out.println("El golpe realizado le ha golpeado un total de " + danioRealizado + " puntos de vida");
								}
								else {
									MetodosLuchador.ataqueMejorado(J1, 2);
									System.out.println("Tu ataque mejora un poco tus estadisticas");
								}
							}
							else {
								System.out.println("Has fallado el movimiento");
							}
							
							//Ataque rival
							if (rivFallo != 10) {
								if (rival.getEstadisticaMov(numeromovimiento) == false) {
									danioRecibido = (rival.getAtaque() + rival.getDanioMov(numeromovimiento)) - J1.getDefensa();
									System.out.println("El golpe recibido te ha golpeado un total de " + danioRecibido + " puntos de vida");
								}
								else {
									MetodosLuchador.ataqueMejorado(rival, numeromovimiento);
									System.out.println("Su ataque mejora un poco sus estadisticas");
								}
							}
							else {
								System.out.println("Ha fallado el movimiento");
							}
						
							if(danioRealizado < 0) {
								danioRealizado = 0;
							}
							
							if (danioRecibido < 0) {
								danioRecibido = 0;
							}
							
							J1.setVida(J1.getVida() - danioRecibido);
							rival.setVida(rival.getVida() - danioRealizado);
						break;
						
						case 4:
						
							//System.out.println(J1.getNombreMov(3));
							numeromovimiento = random.nextInt(4);
							System.out.println("El rival usa " + rival.getNombreMov(numeromovimiento));
							J1fallo = random.nextInt(10)+1;
							rivFallo = random.nextInt(10)+1;
							//Ataque J1
							if (J1fallo != 10) {
								if (J1.getEstadisticaMov(3) == false) {
								danioRealizado = (J1.getAtaque() + J1.getDanioMov(3)) - rival.getDefensa();
								System.out.println("El golpe realizado le ha golpeado un total de " + danioRealizado + " puntos de vida");
								}
								else {
									MetodosLuchador.ataqueMejorado(J1, 3);
									System.out.println("Tu ataque mejora un poco tus estadisticas");
								}
							}
							else {
								System.out.println("Has fallado el movimiento");
							}
							
							//Ataque rival
							if (rivFallo != 10) {
								if (rival.getEstadisticaMov(numeromovimiento) == false) {
									danioRecibido = (rival.getAtaque() + rival.getDanioMov(numeromovimiento)) - J1.getDefensa();
									System.out.println("El golpe recibido te ha golpeado un total de " + danioRecibido + " puntos de vida");
								}
								else {
									MetodosLuchador.ataqueMejorado(rival, numeromovimiento);
									System.out.println("Su ataque mejora un poco sus estadisticas");
								}
							}
							else {
								System.out.println("Ha fallado el movimiento");
							}
						
							if(danioRealizado < 0) {
								danioRealizado = 0;
							}
							
							if (danioRecibido < 0) {
								danioRecibido = 0;
							}
							
							J1.setVida(J1.getVida() - danioRecibido);
							rival.setVida(rival.getVida() - danioRealizado);
						break;
					}
					//MostrarDañoOcasionado
					System.out.println("Despues de los golpes efectuados");
					System.out.println(J1.getNombre() + " tiene " + J1.getVida() + " puntos de vida");
					System.out.println(rival.getNombre() + " tiene " + rival.getVida() + " puntos de vida");
					
					
				}
				while (J1.getVida() > 0 && rival.getVida() > 0);
			
				if(J1.getVida() < 0) {
					System.out.println("Fin de la partida");
					pperdida++;
				}
				else {
					System.out.println("Siguiente ronda, tu extra de vida (20 vida)");
					J1.setVida(J1.getVida() + 20);
					pganada++;
				}
			}
		System.out.println("Has ganado " + pganada + " partidas");	
			
		do {
			System.out.println("Desea ejecutar el juego (S/N)");
			respuesta = Character.toLowerCase(teclado.next().charAt(0));
		}
		while (respuesta != 's' && respuesta != 'n');	
		}
	}
}

