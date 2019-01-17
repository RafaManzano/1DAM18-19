/*
 * Nombre del programa: Escapatoria
 * Comentario: Este programa se realiza un juego para escapar abriendo el cerrojo en un maximo de 30 turnos con pistas
 * 
 * Analisis
 * Entrada: - Eleccion
 * 			- Respuesta
 * 
 * Salida: - Mensajes con el usuario
 * 		   - Resultado de la partida
 * 		   - Resultado final
 * 
 * Requisitos: - Eleccion sera mayor que 0
 * 			   - Respuesta tiene que ser s o n
 * 
 * PG Level 0
 * Inicio
 * 	LeeryValidarRespuesta
 * 	Mientras respuesta sea si
 * 		LeeryValidarEleccion
 * 		Para contador sea menot que eleccion
 * 			RealizarJuego
 * 			MostrarResultadoPartida
 * 		FinPara
 * 		MostrarResultadoFinal
 * 	FinMientras
 * Fin
 * 
 * Modulo RealizarJuego
 * Inicio
 * 	Para cont sea menor que 10
 * 		LeeryValidarCombinacion
 * 		ComprobarCombinacion
 * 		Si combinacion no se ha descubierto y el contador es 3
 * 			primeraPista*
 * 		FinSi
 * 		Si combinacion no se ha descubierto y el contador es 6
 *    		segundaPista*
 * 		FinSi
 * 		Si combinacion no se ha descubierto y el contador es 8
 * 			terceraPista*
 * 		FinSi
 * 	FinPara
 * Fin
 *  
 */

import java.util.*;
public class Escapatoria {
	
	public static void main (String[] args) {
		Cerrojo combinacion = new Cerrojo();
		int eleccion;
		char respuesta;
		int pganada = 0;
		int pperdida = 0;
		int numero1;
		int numero2;
		int numero3;
		Scanner teclado = new Scanner(System.in);
		Random random = new Random();
		

 	//LeeryValidarRespuesta
 	do {
		System.out.println("Quieres ejecutar el juego");
		respuesta = Character.toLowerCase(teclado.next().charAt(0));
	}
	while(respuesta != 's' || respuesta != 'n');
	
	while(respuesta == 's') {
		//LeeryValidarEleccion
		do {
			System.out.println("Elija el numero de partidas que desea jugar");
			eleccion = teclado.nextInt();
		}
		while(eleccion < 0 || eleccion > 9);
		
		for(int contador = 0; contador < eleccion; contador++) {
			//RealizarJuego
			for (int cont = 0; cont < 10; cont++) {
				try {
				combinacion.setNumero1(random.nextInt(10));
				combinacion.setNumero2(random.nextInt(10));
				combinacion.setNumero3(random.nextInt(10));
				}
				catch(ExcepcionCerrojo err) {
					System.out.println("ERROR! " + err);
				}
				
				//LeeryValidarCombinacion
				do {
					System.out.println("Introduzca la combinacion");
					System.out.print("Primer numero: ");
					numero1 = teclado.nextInt();
					System.out.println();
					System.out.print("Segundo numero: ");
					numero2 = teclado.nextInt();
					System.out.println();
					System.out.print("Tercero numero: ");
					numero3 = teclado.nextInt();
					System.out.println();
				}
				while(numero1 < 0 || numero1 > 9 || numero2 < 0 || numero2 > 9 || numero3 < 0 || numero3 > 9);
				
				//ComprobarCombinacion*
				metodosEscapatoria.numerosAcertados(metodosEscapatoria.comprobarCombinacion(numero1, numero2, numero3, combinacion));
				
				if(combinacion.getOculto() == true) {
					switch(cont) {
						case 3:
							//primeraPista*
						break;
						
						case 6:
							//segundaPista*
						break;
						
						case 8:
							//terceraPista*
						break;
					}
				}
					
			}
						
			//MostrarResultadoPartida
			if(combinacion.getOculto() == false) {
				System.out.println("Enhorabuena, la has descubierto");
				pganada++;
			}
			else {
				System.out.println("Lo siento, no lo has descubierto");
				pperdida++;
			}
		}
		System.out.println("Valoracion final:");
		System.out.println("Partidas Ganadas: " + pganada);
		System.out.println("Partidas Perdidas: " + pperdida);
		
		if(pganada > pperdida) {
			System.out.println("Eres un perfecto escapista, Titan");
		}
		else {
			System.out.println("Te tocara seguir aqui haciendome compañia");
		}
	}			
	}
}

