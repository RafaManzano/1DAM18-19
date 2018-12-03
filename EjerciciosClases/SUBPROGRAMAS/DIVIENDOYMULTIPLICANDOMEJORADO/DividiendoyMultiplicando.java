/*
 * Nombre del programa: DividiendoyMultiplicando
 * Analisis
 * 	Entrada: - Opcion
 * 			 - Respuesta
 * 			 - Numero1
 * 			 - Numero2
 * 
 * 	Salida: - Mensajes con el usuario
 * 			- Eco de los datos
 * 			- Resultado de la division
 * 			- Resultado de la multiplicacion
 * 	
 * 	Requisitos: - opcion tiene que ser 0, 1, 2 
 * 				- respuesta solo puede ser s o n
 * 
 * PG Level 0
 * Inicio
 * 	LeeryValidarOpcion
 * 	MientrasOpcionNoSeaSalir
 * 		Segun (opcion)
 * 			Para caso 1:
 * 				Division
 * 			Para caso 2:
 * 				Multiplicacion
 * 		FinSegun
 * 		LeeryValidarOpcion
 * 	FinMientras
 * Fin
 * 
 * Modulo Division
 * Inicio 
 * 	LeeryValidarRespuesta
 * 	MientrasOpcionSeaSi
 * 		LeeryValidarNumero1
 * 		LeeryValidarNumero2
 * 		Division*
 * 		LeeryValidarRespuesta
 * 	FinMientras
 * Fin
 * 
 * Modulo Multiplicacion
 * Inicio 
 * 	LeeryValidarRespuesta
 * 	MientrasOpcionSeaSi
 * 		LeeryValidarNumero1
 * 		LeeryValidarNumero2
 * 		Multiplicacion*
 * 		MostrarResultado
 * 		LeeryValidarRespuesta
 * 	FinMientras
 * Fin
 * 
 * 
 */

import java.util.*;
import java.io.*;

public class DividiendoyMultiplicando {
	
	public static void main (String[] args) {
		
		int opcion;
		char respuesta;
		int numero1;
		int numero2;
		Scanner teclado = new Scanner (System.in);
		
		//LeeryValidarOpcion
		do {
			System.out.println("Elija su opcion");
			System.out.println("1. Division");
			System.out.println("2. Multiplicacion");
			System.out.println("0. Salir");
			opcion = teclado.nextInt();
		}
		while(opcion < 0 || opcion > 3);
		
		//MientrasOpcionNoSeaSalir
		while(opcion != 0) {
			
			switch(opcion) { //Segun(opcion)
				case 1:
					//System.out.println("Division");
					//LeeryValidarRespuesta
					do {
						System.out.println("Quieres ejecutar? (S/N)");
						respuesta = Character.toLowerCase(teclado.next().charAt(0));
					}
					while(respuesta != 's' && respuesta != 'n');
					
					
					while(respuesta == 's') { //MientrasRespuestaSeaSi
						do {
						System.out.println("Introduzca el primer numero");
						numero1 = teclado.nextInt();
						System.out.println("Introduzca el segundo numero");
						numero2 = teclado.nextInt();
						}
						while (numero1 < 1 || numero2 < 1);
						//resguardosDM.Division(numero1, numero2);
						//FuncionalidadesDM.Division(numero1, numero2);
						System.out.println(FuncionalidadesRecDM.DivisionRec(numero1, numero2));
						
						//LeeryValidarRespuesta
						do {
							System.out.println("Quieres ejecutar? (S/N)");
							respuesta = Character.toLowerCase(teclado.next().charAt(0));
						}
						while(respuesta != 's' && respuesta != 'n');
					}
				break;
				
				case 2:
					//System.out.println("Multiplicacion");
					//Multiplicacion
					//LeeryValidarRespuesta
					do {
						System.out.println("Quieres ejecutar? (S/N)");
						respuesta = Character.toLowerCase(teclado.next().charAt(0));
					}
					while(respuesta != 's' && respuesta != 'n');
					
					
					while(respuesta == 's') { //MientrasRespuestaSeaSi
					
						do {
						System.out.println("Introduzca el primer numero");
						numero1 = teclado.nextInt();
						System.out.println("Introduzca el segundo numero");
						numero2 = teclado.nextInt();
						}
						while (numero1 < 1 || numero2 < 1);
						//resguardosDM.Multiplicacion(numero1, numero2);
						//System.out.println(FuncionalidadesDM.Multiplicacion(numero1, numero2));
						System.out.println(FuncionalidadesRecDM.MultiplicacionRec(numero1, numero2));
						//LeeryValidarRespuesta
						do {
							System.out.println("Quieres ejecutar? (S/N)");
							respuesta = Character.toLowerCase(teclado.next().charAt(0));
						}
						while(respuesta != 's' && respuesta != 'n');
						}
				break;
			}
			
			//LeeryValidarOpcion
			do {
			System.out.println("Elija su opcion");
			System.out.println("1. Division");
			System.out.println("2. Multiplicacion");
			System.out.println("0. Salir");
			opcion = teclado.nextInt();
			
			}
			while(opcion < 0 || opcion > 3);
		}
	}
}

