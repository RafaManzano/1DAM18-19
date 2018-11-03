/*
 * Abscisa.java
 * Breve comentario: Dada la funcion y2 = 1 / 9 x diseñar un programa
 * 	que para cada valor de abscisa leido por teclado de el correspondiente valor
 * 	de la ordenada
 * Analisis:
 * 	Entrada: - El eje X
 * 			 - respuesta
 * 
 * 	Salida: - Mensaje con el usuario
 * 			- El resultado de la formula (y)
 * 	Requisitos: De momento no hay requisitos
 * 
 * Estudio del bucle
 * 	Nombre: BucleRespuestaSoN
 * 	VCB: Centinela
 * 	Inicializacion VCB: Lectura anticipada
 * 	Actualizacion VCB: Lectura final
 * 	Condicion de salida: respuesta == 's' || respuesta == 'n'
 * 
 * 	Nombre: MientrasRespuestaSi
 * 	VCB: Centinela
 * 	Inicializacion VCB: Lectura anticipada
 * 	Actualizacion VCB: Lectura final
 * 	Condicion de salida: respuesta == s
 * 
 * PG Level 0
 * Inicio
 * 	LeeryValidarRespuesta
 * 	Mientras respuesta sea si
 * 		ObtenerDatos
 * 		RealizarFormula
 * 		MostrarResultado
 * 	FinMientras
 * 	LeeryValidarRespuesta
 * Fin
 */

import java.io.*;
import java.util.*;
public class Abscisa {
	
	public static void main (String[] args) {
		
		double x = 0;
		double y;
		char respuesta;
		Scanner teclado = new Scanner (System.in);
		
		//LeeryValidarRespuesta
		do {
			System.out.println("Quieres ejecutar el programa");
			respuesta = Character.toUpperCase(teclado.next().charAt(0));
		}
		while(respuesta != 'S' && respuesta != 'N');
		
		//Mientras respuesta sea si
		while(respuesta == 'S') {
			
			//ObetenerDatos
			System.out.println("Escribe la abscisa");
			x = teclado.nextDouble();
			
			//RealizarFormula
			y = Math.sqrt(x / 9);
			
			//MostrarResultado
			System.out.println("El resultado de la ordenada es " + (double)Math.round(y * 100d) / 100d);
			
			//LeeryValidarRespuesta
			do {
				System.out.println("Quieres ejecutar el programa");
				respuesta = Character.toUpperCase(teclado.next().charAt(0));
			}
			while(respuesta != 'S' && respuesta != 'N');
		}
		System.out.println("Cerrando programa...");
	}
}

