/*
 * Nombre del programa: ahorcadoCumple
 * Breve comentario: Este juego imita el tipico juego del ahorcado, con 10 vidas para cada partida. De momento tendra 3 opciones
 * 
 * Analisis:
 * 	Entrada: - Regalo
 * 			 - Respuesta
 * 			 - Pista
 
 * 	Salida: - Mensajes con el usuario
 * 			- Resultado de la palabra
 * 			- Partida perdida
 * 
 * 	Requisitos: - Regalo sera del 1 al 3
 * 				- Respuesta es s o n
 * 				- Pista es p
 * 
 * PG Level 0
 * Inicio
 * 	LeeryValidarRespuesta
 * 	MientrasRespuestaSeaSi
 * 		Juego
 * 	FinMientras
 * Fin
 * 
 * PG Juego
 * Inicio
 * 	ElijaRegalo
 * 	Segun(regalo) 
 * 		Caso 1:
 * 			Partida
 * 		FinCaso1
 * 
 * 		Caso 2:
 * 			Partida
 * 		FinCaso2
 * 
 * 		Caso 3:
 * 			Partida
 * 		FinCaso
 * 	FinSegun
 * Fin
 */

import java.io.*;
import java.util.*;
public class ahorcadoCumple {
	
	public static void main (String[] args) {
		int regalo;
		char respuesta;
		char pista;
		char letra;
		boolean ganador = false;
		int intento = 0;
		int contador = -1;
		boolean letraDescubierta = false;
		String[] pista1 = {"La palabra es una palabra inglesa", "Es algo que te hace mucha falta para poder responder", "Es algo tecnologico"};
		String[] pista2 = {"Es algo usado comunmente", "Algun dia me invitas a uno", "Los presentadores de TV lo usan"};
		String[] pista3 = {"Es de colorines", "Esta de moda", "Es blandito"};
		Scanner teclado = new Scanner (System.in);
  	//LeeryValidarRespuesta
  	do {
		System.out.println("Desea ejecutar (S/N)?");
		respuesta = Character.toLowerCase(teclado.next().charAt(0));
	}
	while(respuesta != 's' && respuesta != 'n');
	
  	//MientrasRespuestaSeaSi
  	while(respuesta == 's') {
		//Juego
		do {
		System.out.println("Elija su regalo");
		System.out.println("1.");
		System.out.println("2.");
		System.out.println("3.");
		regalo = teclado.nextInt();
		}
		while(regalo < 0 || regalo > 4);
		switch(regalo) {
			case 1:
				
				String num1 = "smartwatch"; 
				char[] primero = num1.toCharArray();
				char[] primeroGuion = new char[primero.length];
				for(int i = 0; i < primero.length; i++) {
				
					primeroGuion[i] = '_';
				}
				
				ganador = false;
				intento = 0;
				while(ganador == false && intento < 5) {
				System.out.println("Adivina la palabra (tiene 10 letras)");
				letra = teclado.next().charAt(0);
				
				for(int i = 0; i < primero.length; i++) {
					if(primero[i]== letra) {
						primeroGuion [i] = letra;
						letraDescubierta = true;
					}
				}
				
				if(letraDescubierta == false) {
					intento++;
				}
				
				if(Arrays.equals(primero, primeroGuion)) {
					ganador = true;
				}
				
				System.out.println(primeroGuion);
				
				do{
					System.out.println("Quieres pista? (S/N) (Solo 3 pistas)");
					respuesta = Character.toLowerCase(teclado.next().charAt(0));
				}
				while(respuesta != 's' && respuesta != 'n');
				
				if (respuesta == 's' && contador < 2) {
					contador++;
					System.out.println(pista1 [contador]);
				}
				
				}
				
				if (ganador == true) {
					System.out.println("Enhorabuena, coge tu regalo y disfruta");
				}
				else {
					System.out.println("Lo siento, tendras que abrirlo y descubrir que es");
				}
				
				
			break;
			
			case 2:
				contador = -1;	
				num1 = "taza"; 
				primero = num1.toCharArray();
				primeroGuion = new char[primero.length];
				for(int i = 0; i < primero.length; i++) {
				
					primeroGuion[i] = '_';
				}
				
				ganador = false;
				intento = 0;
				while(ganador == false && intento < 5) {
				System.out.println("Adivina la palabra (tiene 4 letras)");
				letra = teclado.next().charAt(0);
				
				for(int i = 0; i < primero.length; i++) {
					if(primero[i]== letra) {
						primeroGuion [i] = letra;
						letraDescubierta = true;
					}
				}
				
				if (letraDescubierta == false) {
					intento++;
				}	
				
				
				if(Arrays.equals(primero, primeroGuion)) {
					ganador = true;
				}
				
				System.out.println(primeroGuion);
				
				do{
					System.out.println("Quieres pista? (S/N) (Solo 3 pistas)");
					respuesta = Character.toLowerCase(teclado.next().charAt(0));
				}
				while(respuesta != 's' && respuesta != 'n');
				
				if (respuesta == 's' && contador < 2) {
					contador++;
					System.out.println(pista2 [contador]);
				}
				}
				
				if (ganador == true) {
					System.out.println("Enhorabuena, coge tu regalo y disfruta");
				}
				else {
					System.out.println("Lo siento, tendras que abrirlo y descubrir que es");
				}
			
			break;
			
			case 3:
			contador = -1;	
			num1 = "slime"; 
				primero = num1.toCharArray();
				primeroGuion = new char[primero.length];
				for(int i = 0; i < primero.length; i++) {
				
					primeroGuion[i] = '_';
				}
				
				ganador = false;
				intento = 0;
				while(ganador == false && intento < 5) {
				System.out.println("Adivina la palabra (tiene 5 letras)");
				letra = teclado.next().charAt(0);
				
				for(int i = 0; i < primero.length; i++) {
					if(primero[i]== letra) {
						primeroGuion [i] = letra;
						letraDescubierta = true;
					}
					
				}
				
				if (letraDescubierta == false) {
					intento++;
				}
				
				if(Arrays.equals(primero, primeroGuion)) {
					ganador = true;
				}
				
				System.out.println(primeroGuion);
				do{
					System.out.println("Quieres pista? (S/N) (Solo 3 pistas)");
					respuesta = Character.toLowerCase(teclado.next().charAt(0));
				}
				while(respuesta != 's' && respuesta != 'n');
				
				if (respuesta == 's' && contador < 2) {
					contador++;
					System.out.println(pista3 [contador]);
				}
				}
				
				if (ganador == true) {
					System.out.println("Enhorabuena, coge tu regalo y disfruta");
				}
				else {
					System.out.println("Lo siento, tendras que abrirlo y descubrir que es");
				}
				
				
			break;
		}
		
  	//LeeryValidarRespuesta
  	do {
		System.out.println("Desea ejecutar? (S/N)");
		respuesta = Character.toLowerCase(teclado.next().charAt(0));
	}
	while(respuesta != 's' && respuesta != 'n');	
	} //FinMientras
  		
	}
}

