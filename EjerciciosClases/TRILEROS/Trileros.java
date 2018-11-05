/*
 * Nombre del programa: Trileros
 * Breve comentario: Diseña un algoritmo apara simular el juego del trilero, famoso timo practicado por los trileros.
 * 	En nuestro caso el ordenador sera un honrado trilero que no engañara al usuario que juegue con el
 * 
 * ANALISIS
 * 	Entrada: - Respuesta
 * 			 - Apuesta
 * 			 - Eleccion 
 * 
 * 	Salida: - El resultado de la apuesta
 * 			- El resultado del ganador
 * 	Requisitos: - La apuesta tiene que ser mayor que 0
 * 				- La respuesta tiene que ser s o n
 * 				- Eleccion tiene que ser 1 2 o 3
 * 
 * PG Level 0
 * Inicio
 * 	PreguntaryValidarRespuesta
 * 	Mientras respuesta sea si
 * 		ValidarMonedero
 * 		Mientras haya dinero en el monedero
 * 			ValidarApuesta
 * 			EmpezarJuego
 * 	PreguntaryValidarRespuesta
 * 		FinMientras
 * 	ActualizarMonedero
 * 	FinMientras
 * Fin
 * 
 * PG EmpezarJuego
 * Inicio
 * 	ValidarElegirVaso
		Segun(ElegirVaso) 
 *  		Caso1: //PrimerVaso
 * 				ComprobarGanador
 * 				MostrarGanador
 * 			Caso2: //SegundoVaso
 * 				ComprobarGanador
 * 				MostrarGanador
 * 			Caso3: //TercerVaso
 * 				ComprobarGanador
 * 			MostrarGanador
 * 		FinSegun
 * 	Fin
 * 
 * Estudio del bucle
 * 	Nombre: BucleRespuestaSoN
 * 	VCB: Centinela
 * 	Inicializacion VCB: Lectura anticipada
 * 	Actualizacion VCB: Lectura Final
 * 	Condicion de salida: respuesta == 's' && respuesta == 'n'
 * 
 * 	Nombre: MientrasSeaSi
 * 	VCB: Centinela
 * 	Inicializacion VCB: Lectura anticipada
 * 	Actualizacion VCB: Lectura Final
 * 	Condicion de salida: respuesta == 's'
 * 
 * 	Nombre: ValidarElegirVaso
 * 	VCB: Centinela
 * 	Inicializacion VCB: Lectura anticipada
 * 	Actualizacion VCB: Lectura Final
 * 	Condicion de salida: eleccion > 0 && eleccion < 4
 * 	
*/

import java.io.*;
import java.util.*;

public class Trileros {
	
	public static void main (String[] args) {
		int eleccion;
		int trilero;
		char respuesta;
		int apuesta = 0;
		int monedero;
		Scanner teclado = new Scanner(System.in);
		Random random = new Random();
		
 	//PreguntaryValidarRespuesta
 	do {
		System.out.println("Quieres ejecutar? (s/n)");
		respuesta = Character.toLowerCase(teclado.next().charAt(0));
	}
	while(respuesta != 's' && respuesta != 'n');
	
  	//Mientras respuesta sea si
  	while(respuesta == 's') {
		
		//ValidarMonedero
		do {
			System.out.println("Cuanto dinero quieres cambiar en fichas");
			monedero = teclado.nextInt();
		}
		while (monedero < 0);
	
		//Mientras haya dinero en el monedero
		while(monedero > 0 && respuesta == 's') {
			
		//ValidarApuesta
		do {
			System.out.println("Cuanto dinero quieres apostar?");
			apuesta = teclado.nextInt();
		}
		while(apuesta < 0 || apuesta > monedero);
		
		//ValidarElegirVaso
		do {
		System.out.println("Ahora te toca elegir vaso");
		System.out.println("1. Primer Vaso");
		System.out.println("2. Segundo Vaso");
		System.out.println("3. Tercer Vaso");
		eleccion = teclado.nextInt();
		trilero = random.nextInt(3)+1;
		}
		while(eleccion < 0 || eleccion > 4);

		
  		switch(eleccion) { //Segun(ElegirVaso) 
			case 1://Caso1: //PrimerVaso
				//ComprobarGanador
				//MostrarGanador
				if (trilero == 1) {
					System.out.println("*******         *******         *******");
					System.out.println("*     *         *     *         *     *");
					System.out.println("*  O  *         *     *         *     *");
					System.out.println("*     *         *     *         *     *");
					System.out.println("*******         *******         *******");
					System.out.println("Has ganado, toma tu dinero fiera");
					monedero = monedero + apuesta * 2;
					System.out.println("Tu monedero tiene " + monedero + " fichas");
				}
				else if (trilero == 2) { 
					System.out.println("*******         *******         *******");
					System.out.println("*     *         *     *         *     *");
					System.out.println("*     *         *  O  *         *     *");
					System.out.println("*     *         *     *         *     *");
					System.out.println("*******         *******         *******");
					System.out.println("Me encanta tu dinero. cruck"); 
					monedero = monedero - apuesta;
					System.out.println("Tu monedero tiene " + monedero + " fichas");
					}
					else {
						System.out.println("*******         *******         *******");
						System.out.println("*     *         *     *         *     *");
						System.out.println("*     *         *     *         *   O *");
						System.out.println("*     *         *     *         *     *");
						System.out.println("*******         *******         *******");
						System.out.println("Me encanta tu dinero. cruck"); 
						monedero = monedero - apuesta;
						System.out.println("Tu monedero tiene " + monedero + " fichas");
					}
				 
			break; //FinCaso1
			
			case 2://Caso2: //PrimerVaso
				//ComprobarGanador
				//MostrarGanador
				if (trilero == 2) {
					System.out.println("*******         *******         *******");
					System.out.println("*     *         *     *         *     *");
					System.out.println("*     *         *  O  *         *     *");
					System.out.println("*     *         *     *         *     *");
					System.out.println("*******         *******         *******");
					System.out.println("Has ganado, toma tu dinero fiera");
					monedero = monedero + apuesta * 2;
					System.out.println("Tu monedero tiene " + monedero + " fichas");
				}
				else if (trilero == 1) { 
						System.out.println("*******         *******         *******");
						System.out.println("*     *         *     *         *     *");
						System.out.println("*  O  *         *     *         *     *");
						System.out.println("*     *         *     *         *     *");
						System.out.println("*******         *******         *******");
						System.out.println("Me encanta tu dinero. cruck"); 
						monedero = monedero - apuesta; 
						System.out.println("Tu monedero tiene " + monedero + " fichas");
					}
					else {
						System.out.println("*******         *******         *******");
						System.out.println("*     *         *     *         *     *");
						System.out.println("*     *         *     *         *   O *");
						System.out.println("*     *         *     *         *     *");
						System.out.println("*******         *******         *******");
						System.out.println("Me encanta tu dinero. cruck"); 
						monedero = monedero - apuesta; 
						System.out.println("Tu monedero tiene " + monedero + " fichas");
					}
				 
			break; //FinCaso2
			
			case 3://Caso3: //PrimerVaso
				//ComprobarGanador
				//MostrarGanador
				if (trilero == 3) {
					System.out.println("*******         *******         *******");
					System.out.println("*     *         *     *         *     *");
					System.out.println("*     *         *     *         *  O  *");
					System.out.println("*     *         *     *         *     *");
					System.out.println("*******         *******         *******");
					System.out.println("Has ganado, toma tu dinero fiera");
					monedero = monedero + apuesta * 2;
					System.out.println("Tu monedero tiene " + monedero + " fichas");
				}
			else if (trilero == 2) { 
				System.out.println("*******         *******         *******");
				System.out.println("*     *         *     *         *     *");
				System.out.println("*     *         *  O  *         *     *");
				System.out.println("*     *         *     *         *     *");
				System.out.println("*******         *******         *******");
				System.out.println("Me encanta tu dinero. cruck"); 
				monedero = monedero - apuesta;
				System.out.println("Tu monedero tiene " + monedero + " fichas");
				}
				else {
					System.out.println("*******         *******         *******");
					System.out.println("*     *         *     *         *     *");
					System.out.println("*  O  *         *     *         *     *");
					System.out.println("*     *         *     *         *     *");
					System.out.println("*******         *******         *******");
					System.out.println("Me encanta tu dinero. cruck"); 
					monedero = monedero - apuesta;
					System.out.println("Tu monedero tiene " + monedero + " fichas");
				}
			break; //FinCaso3
  		}
		
  		//PreguntaryValidarRespuesta
		do {
		System.out.println("Quieres ejecutar? (s/n)");
		respuesta = Character.toLowerCase(teclado.next().charAt(0));
		}
		while(respuesta != 's' && respuesta != 'n');
		} //FinMientrasMonedero
	} //FinMientrasRespuestaSi
	System.out.println("Cerrando programa...");
	}
}

