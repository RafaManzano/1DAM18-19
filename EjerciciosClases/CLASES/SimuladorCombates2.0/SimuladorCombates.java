/*
 * Nombre del programa: SimuladorCombates
 * Comentario: Este programa realiza una serie de combates (de momento 8)
 * Analisis:
 * 	Entrada: - opcion
 * 			 - respuesta
 * 			 - pocion
 * 
 * 	Salida: - Resultado de los combates
 * 			- Mensajes con el usuario
 * 			- Ganador de cada pelea
 * 			- Ganador final	
 * 			- Puntuacion final
 * 
 * 	Requisitos: - Opcion 
 * 				- Respuesta tiene que ser s o n
 * 				- Pocion tiene que ser s o n
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

import java.util.*;
public class SimuladorCombates  {
	
	public static void main (String[] args) {
		int opcion;
		int pganada = 0;
		int pperdida = 0;
		int pempate = 0;
		char respuesta;
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
		/*
		habilidades[0] = new Ataque("Leviatan", 12, false);
		habilidades[1] = new Ataque("Ataque Devastador", 10, false);
		habilidades[2] = new Ataque("Poder Griego", 3, true);
		habilidades[3] = new Ataque("Furia de Titanes", 20, false);
		habilidades[4] = new Ataque("Hoja Oculta", 20, false);
		habilidades[5] = new Ataque("Arco", 12, false);
		habilidades[6] = new Ataque("Escondite", 2, true);
		habilidades[7] = new Ataque("Silbido", 5, true);
		habilidades[8] = new Ataque("Lanzallamas", 20, false);
		habilidades[9] = new Ataque("Congelacion", 3, true);
		habilidades[10] = new Ataque("Arco", 12, false);
		habilidades[11] = new Ataque("Aguja", 11, false);
		habilidades[12] = new Ataque("Mordisco", 20, false);
		habilidades[13] = new Ataque("Resistencia", 10, true);
		habilidades[14] = new Ataque("Curacion", 10, true);
		habilidades[15] = new Ataque("Fuego Fatuo", 14, false);
		habilidades[16] = new Ataque("Ebano y Marfil", 12, false);
		habilidades[17] = new Ataque("Poder Sparda", 20, false);
		habilidades[18] = new Ataque("Yamato", 15, false);
		habilidades[19] = new Ataque("Chuleria", 10, true);
		habilidades[20] = new Ataque("Coche Bomba", 20, false);
		habilidades[21] = new Ataque("Atraco", 11, false);
		habilidades[22] = new Ataque("Chaleco", 10, true);
		habilidades[23] = new Ataque("Rifle", 14, false);
		habilidades[24] = new Ataque("Pato Donald", 14, false);
		habilidades[25] = new Ataque("Mickey", 20, false);
		habilidades[26] = new Ataque("Riku", 10, true);
		habilidades[27] = new Ataque("Goofy", 13, false);
		habilidades[28] = new Ataque("Bomba Humo", 10, true);
		habilidades[29] = new Ataque("Pistola Ellie", 20, false);
		habilidades[30] = new Ataque("Joel", 15, false);
		habilidades[31] = new Ataque("Bomba Clavo", 11, false);
		* */
		habilidades = MetodosLuchador.creandoHabilidades(habilidades);
		
		for (int contador = 0; contador < habilidades.length; contador++) {
			switch(contador) {
				
				case 0: case 1: case 2: case 3:
					kratos [contador] = habilidades[contador];
				break; 
				case 4: ezio [0] = habilidades[contador]; break; 
				case 5: ezio [1] = habilidades[contador]; break; 
				case 6:	ezio [2] = habilidades[contador]; break;
				case 7: ezio [3] = habilidades[contador]; break;
				case 8:	aloy [0] = habilidades[contador]; break;
				case 9: aloy [1] = habilidades[contador]; break;
				case 10: aloy [2] = habilidades[contador]; break;
				case 11: aloy [3] = habilidades[contador];	break;
				case 12: geralt [0] = habilidades[contador]; break;
				case 13: geralt [1] = habilidades[contador]; break;
				case 14: geralt [2] = habilidades[contador]; break;
				case 15: geralt [3] = habilidades[contador]; break;
				case 16: dante [0] = habilidades[contador]; break;
				case 17: dante [1] = habilidades[contador]; break;
				case 18: dante [2] = habilidades[contador]; break;
				case 19: dante [3] = habilidades[contador]; break;
				case 20: cj [0] = habilidades[contador]; break;
				case 21: cj [1] = habilidades[contador]; break;
				case 22: cj [2] = habilidades[contador]; break;
				case 23: cj [3] = habilidades[contador]; break;	
				case 24: sora [0] = habilidades[contador]; break;
				case 25: sora [1] = habilidades[contador]; break;
				case 26: sora [2] = habilidades[contador]; break;
				case 27: sora [3] = habilidades[contador]; break; 
				case 28: ellie [0] = habilidades[contador]; break;
				case 29: ellie [1] = habilidades[contador];	break;
				case 30: ellie [2] = habilidades[contador]; break;	
				case 31: ellie [3] = habilidades[contador]; break;
			}
		}
		
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
			
			
			//Pelea
			while (pperdida == 0) {
			//MostrarRival
				rival = personajes[random.nextInt(8)];
				System.out.println("Tu rival es " + rival.getNombre());
				
				do {
					//RealizarAtaques
					do {
						MetodosLuchador.menuMovimiento(J1);
						opcion = teclado.nextInt();
					}
					while (opcion < 1 || opcion > 4);
					
					switch(opcion) {
						case 1:
							System.out.println(J1.getNombreMov(0));
						break;
						
						case 2:
							System.out.println(J1.getNombreMov(1));
						break;
						
						case 3:
							System.out.println(J1.getNombreMov(2));
						break;
						
						case 4:
							System.out.println(J1.getNombreMov(3));
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
					System.out.println("Siguiente ronda, tu extra de vida");
					J1.setVida(J1.getVida() + 20);
				}
			}
			
			
			
		}
	}
}

