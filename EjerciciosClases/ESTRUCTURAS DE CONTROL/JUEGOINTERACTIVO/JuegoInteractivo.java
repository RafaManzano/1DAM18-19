/*
 * JuegoInteractivo.java
 *
 * Breve Comentario: El juego narra la historia de un delincuente y como debe escapar de la carcel. Su mision es salir con vida de ese tremendo lugar
 * Analisis:
 * 	Entrada: - eleccion
 * 		     - respuesta
 * 	Salida: - Mensaje con el usuario
 * 			- Cada final dependiendo de las opciones 
 * 	Requisitos: - Respuesta tiene que ser s o n
 * 				- eleccion depende de cada decision
 * 
 * PG Level 0
 * Inicio
 * 	LeeryValidarRespuesta
 * 	Mientras respuesta sea s
 * 		HistoriaInicio
 * 		Segun (eleccion) 
 * 			Caso 1: //Limar los barrotes
 * 				
 * 			FinCaso1
 * 
 *   		Caso 2: // Acabar el tunel
 * 			FinCaso2
 * 
 *   		Caso 3: // Llamar al guardia
 * 			FinCaso3
 * 
 *   		Caso 4: //No hacer nada
 * 			FinCaso4
 * 
 * 	LeeryValidarRespuesta
 * 	FinMientras
 * 	
 * Fin 
 * 
 */

import java.io.*;
import java.util.*;
public class JuegoInteractivo {
	
	public static void main (String[] args) {
		//Declaracion de variables
		int eleccion;
		int jugador;
		int rival;
		int primerdado;
		int segundodado;
		int tercerdado;
		Scanner teclado = new Scanner (System.in);
		Random random = new Random();
		
		System.out.println("Llevas mucho pensando en lo mismo, y esta noche, por fin, has decidido dar el paso. Algo asi no puede intimidar a un delincuente como tu te levantas de la cama. Son las 2 de la mañana y no hay casi nadie despierto. Estas a punto de escapar de la que desde hace meses ha sido tu casa");
		System.out.println("Creo que ha llegado el momento de usar todos aquellos objetos que mi hermano Joan me ha ido trayendo en cada visita. De debajo del colchon saco una caja de metal con una lima, y una cuchara (la cual use para cavar el tunel que se encuentra tras el inodoro). Pero, que hago?");
		System.out.println("1. Agarras la lima que te dio tu hermano y te diriges hacia los barrotes");
		System.out.println("2. Te diriges hacia el tunel que tienes detras del inodoro y lo acabas");
		System.out.println("3. Llamas a un guardia con un grito y le clavas la lima");
		System.out.println("4. No hacer nada");
		eleccion = teclado.nextInt();
		switch(eleccion) { //Segun (eleccion)
			case 1: //("1. Agarras la lima que te dio tu hermano y te diriges hacia los barrotes")
				System.out.println("No funciona. Alertas a los guardias y ahora solo tengo dos opciones");
				System.out.println("1. Me estoy quieto");
				System.out.println("2. Lucho contra el");
				eleccion = teclado.nextInt();
				switch(eleccion) { //Segun (eleccion)
					case 1: //("1. Me estoy quieto")
						System.out.println("Te quedas en la celda y te duermes. Como castigo ese dia no recibiras almuerzo");
						System.out.println("Tu cabreo aumenta cada vez que piensas en lo mal que han salido tus planes. Estas tumbado en tu cama cuando de repente suenan todas las alarmas. Parece que hay un motin");
					break;
					
					case 2: //("2. Lucho contra el")
						//Combate
						jugador = random.nextInt(10)+1;
						rival = random.nextInt(10)+1;
						if(jugador >= rival) {
								System.out.println("Lo tengo en el suelo tirado, ahora tengo que pensar que hacer con el");
								System.out.println("1. Tras esconder el cadaver en la celda, te vistes con la ropa del guardia y te infiltras");
								System.out.println("2. Tras esconder el cadaver en la celda, sales vestido de preso y te diriges a la sala de control");
								eleccion = teclado.nextInt();
								
								switch (eleccion) {
								case 1: //Inflitracion guardia
								break;
								
								case 2: //Vestido de preso
								break;
								}
						}
						else {
							System.out.println("Te despiertas aturdido y no sabes donde estas. El sitio no es nada acogedor. De repente abres tu mano y encuentras en ella 3 dados. Levantas la vista y ves a lo que, por su figura, parece ser un hombre encapuchado. Este extende su mano esqueletico hasta una gran puerta de hierro. La abre. Paso a traves del umbral asustado y confundido a partes iguales. Tras caminar por un tuneñ oscuro y frio llego a una gran sala. Mi sorpresa aumenta cuando quie esta sentado en un gran sillon esperandome es el mismisimo Satanas");
							System.out.println("Que hago aqui?");
							System.out.println("Todos sabiamos que tu final no estaba en el cielo (rie sarcastico el Diablo)");
							System.out.println("Me estas diciendo que muero por intentar salir de la carcel para acabar siendo el esclavo de Satanas para siempre?");
							System.out.println("Bueno ese podria no ser tu destino. Te propongo un juego, Ves los dados de tu mano?");
							System.out.println("Si");
							System.out.println("Si al lanzarlos sacas tres 6, eres libre. Tu alma podra vagar por el mundo de los mortales sin que nadie te detenga.");
							System.out.println("Y si no lo consigo?");
							System.out.println("Estaras a mis ordenes para siempre. Lanza ya que no tengo todo el dia.");
							
							primerdado = random.nextInt(6)+1;
							segundodado = random.nextInt(6)+1;
							tercerdado = random.nextInt(6)+1;
							
							if (primerdado == 6 && segundodado == 6 && tercerdado == 6) {
								System.out.println("Esta bien, ganaste... de mommento. Me dice el Diablo riendose");
								System.out.println("Un humo blanco aparece de repente. Apenas puedo ver nada. Cuando se disipa me doy cuenta de que estoy en casa. Veo a mi madre, a mi hermana y a mi pequeña Maria. Cuanto me gustaria poderles decir que las quiero");
								System.out.println("Al final lo consseguiste! Saliste de la carcel. Aunque quizas no de la forma en que te hubiera gustado...");
								System.out.println("FIN DEL JUEGO");
							}
							else {
								System.out.println(" ");
								System.out.println("FIN DEL JUEGO");
							}
							
						}
						
						
					break;
				}
			break;
			
			case 2: //Escribir("2. Te diriges hacia el tunel que tienes detras del inodoro y lo acabas");
			break;
			
			case 3: //Escribir("3. Llamas a un guardia con un grito y le clavas la lima");
			break;
			
			case 4: //Escribir("4. No hacer nada");
			break;
		}
		
		
	}
}

