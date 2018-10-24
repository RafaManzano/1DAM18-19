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
	 * 		ValidarApuesta
	 * 		ValidarElegirVaso
	 * 		Segun(ElegirVaso) 
	 * 			Caso1: //PrimerVaso
	 * 				si el trilero introduce la bolita en el primer vaso
	 * 					HasGanado
	 * 					SumarApuesta
	 * 				Sino
	 * 					HasPerdido
	 * 					RestarApuesta
	 * 				FinSi
	 * 			Caso2: //SegundoVaso
	 * 				si el trilero introduce la bolita en el segundo vaso
	 * 					HasGanado
	 * 					SumarApuesta
	 * 				Sino
	 * 					HasPerdido
	 * 					RestarApuesta
	 * 				FinSi
	 * 			Caso3: //TercerVaso
	 * 				si el trilero introduce la bolita en el tercer vaso
	 * 					HasGanado
	 * 					SumarApuesta
	 * 				Sino
	 * 					HasPerdido
	 * 					RestarApuesta
	 * 				FinSi
	 * 		FinSegun
	 * 	PreguntaryValidarRespuesta
	 * FinMientras
 * 	FinMientras
 * Fin
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
			
				if (trilero == 1) {//si el trilero introduce la bolita en el primer vaso
					System.out.println("Has ganado, toma tu dinero fiera");//HasGanado
					monedero = apuesta * 2; //SumarApuesta
				}
				else { //Sino
					System.out.println("Me encanta tu dinero. cruck"); //HasPerdido
					apuesta = monedero - apuesta; //RestarApuesta
				} //FinSi
			break; //FinCaso1
			
			case 2://Caso2: //SegundoVaso
			
				if (trilero == 2) {//si el trilero introduce la bolita en el segundo vaso
					System.out.println("Has ganado, toma tu dinero fiera");//HasGanado
					monedero = apuesta * 2; //SumarApuesta
				}
				else { //Sino
					System.out.println("Me encanta tu dinero. cruck"); //HasPerdido
					apuesta = monedero - apuesta; //RestarApuesta
				} //FinSi
			break; //FinCaso2
			
			case 3://Caso3: //TercerVaso
			
				if (trilero == 3) {//si el trilero introduce la bolita en el tercer vaso
					System.out.println("Has ganado, toma tu dinero fiera");//HasGanado
					monedero = apuesta * 2; //SumarApuesta
				}
				else { //Sino
					System.out.println("Me encanta tu dinero. cruck"); //HasPerdido
					apuesta = monedero - apuesta; //RestarApuesta
				} //FinSi
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

