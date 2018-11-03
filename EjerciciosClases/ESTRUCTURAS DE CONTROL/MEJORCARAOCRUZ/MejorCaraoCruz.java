/*
 * Nombre del programa: MejorCaraoCruz
 * Breve Comentario: Lanzar al aire dos monedas y contar cuantas veces salen 2 caras, 2 cruces y una cruz y una cara
 * 
 * Analisis:
 * 	Entrada: - Respuesta
 * 			 - Jugar
 * 
 * 	Salida: - Mensajes con el usuario
 * 			- El resultado de las partidas ganadas
 * 
 * 	Requisitos:	- Respuesta tiene que ser S o N
 * 				- Jugar mayor que 0
 * 
 * Estudio del bucle
 * 	Nombre: BucleRespuestaSoN
 * 	VCB: Centinela
 * 	Inicializacion VCB: Lectura anticipada
 * 	Actualizacion VCB: Lectura final
 * 	Condicion de salida: respuesta == 's' || respuesta == 'n'
 * 
 * 	Nombre: Mientras sea si
 * 	VCB: Centinela
 * 	Inicializacion VCB: Lectura anticipada
 * 	Actualizacion VCB: Lectura final
 * 	Condicion de salida: respuesta == 's'
 * 
 * 	Nombre: ParaSeguirContinuando
 * 	VCB: Contador
 * 	Inicializacion VCB: Antes de la primera iteracion 0/1
 * 	Actualizacion VCB: Al final de cada iteracion
 * 	Condicion de salida: contador > jugar
 * 
 * PG Level 0
 * Inicio
 * 	LeeryValidarRespuesta
 * 	Mientras respuesta sea si
 * 		ObteneryValidarVecesJugar
 * 		RealizarJuego
 * 		MostrarGanada
 * 		LeeryValidarRespuesta
 * 	FinMientras
 * Fin
 */

import java.io.*;
import java.util.*;

public class MejorCaraoCruz {
	
	public static void main (String[] args) {
		
		//Declaracion variables
		int moneda1;
		int moneda2;
		char respuesta;
		int jugar;
		int caras = 0;
		int cruces = 0;
		int cruzcara = 0;
		Scanner teclado = new Scanner(System.in);
		Random random = new Random();
		
		//LeeryValidarRespuesta
		do {
			System.out.println("Quieres ejecutar el programa?");
			respuesta = Character.toLowerCase(teclado.next().charAt(0));
		}
		while(respuesta != 's' && respuesta != 'n');
		
		//Mientras respuesta sea si
		while (respuesta == 's') {
			
			//ObteneryValidarDatos
			do{
				System.out.println("Escribe las veces que desea jugar");
				jugar = teclado.nextInt();
			}
			while(jugar <= 0);
			
			//RealizarJuego
			for(int contador = 0; contador < jugar; contador++) {
			moneda1 = random.nextInt(2)+1;
			moneda2 = random.nextInt(2)+1;
				if (moneda1 == 1 && moneda2 == 1) {
					System.out.println("2 caras");
					caras++;
				}
				
				else if(moneda1 == 2 && moneda2 ==2) {
					System.out.println("2 cruces");
					cruces++;
				}
					else {
						System.out.println("1 cara y 1 cruz");
						cruzcara++;
					}
				
			}
			
			//MostrarGanada
			System.out.println("Despues de " + jugar + " partidas. El resultado es " + caras + " caras, " + cruces + " cruces y " + cruzcara + " cruz y cara");
			//LeeryValidarRespuesta	
			do {
				System.out.println("Quieres ejecutar el programa?");
				respuesta = Character.toLowerCase(teclado.next().charAt(0));
			}
			while(respuesta != 's' && respuesta != 'n');
		}
		System.out.println("Cerrando programa...");
	}
}

