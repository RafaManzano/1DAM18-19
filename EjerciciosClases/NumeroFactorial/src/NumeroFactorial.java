/*
 * NumeroFactorial
 * Analisis:
 * 	Entrada: - Numero
 * 			 - Respuesta
 * 			 
 * 	Salida: - Mensaje con el usuario
 * 			- El resultado del numero factorial
 * 
 * 	Requisitos: - El numero no puede ser negativo
 * 
 * Estudio de los bucles
 * 	Nombre: BucleRespuestaSoN
 * 	VCB: Centinela
 * 	Inicializacion VCB: Lectura anticipada
 * 	Actualizacion VCB: Lectura final
 * 	Condicion de salida: respuesta == 's' || respuesta == 'n'
 * 
 * 	Nombre: Mientras respuesta sea si
 * 	VCB: Centinela
 * 	Inicializacion VCB: Lectura anticipada
 * 	Actualizacion VCB: Lectura final
 * 	Condicion de salida: respuesta == 's'
 * 
 * 	Nombre: NegativosNoValidoni0
 * 	VCB: Centinela
 * 	Inicializacion VCB: Lectura anticipada
 * 	Actualizacion VCB: Lectura final
 * 	Condicion de salida: numero > 0
 * 
 * 
 * PG Level 0
 * Inicio
 * 	LeeryValidarRespuesta
 * 	Mientras respuetsa sea si
 * 		ObtenerDatos
 * 		RealizarFactorial
 * 		MostrarResultado
 * 	FinMientras
 * 	LeeryValidarRespuesta
 * Fin
 */

import java.io.*;
import java.util.*;

public class NumeroFactorial {
	
	public static void main (String[] args) {
		 int numero;
		 char respuesta;
		 int auxiliar;
		 Scanner teclado = new Scanner (System.in);
		 
		 //LeeryValidarRespuesta
		 do {
			 System.out.println("Quieres ejecutar el programa?");
			 respuesta = Character.toLowerCase(teclado.next().charAt(0));
		 }
		 while(respuesta != 's' && respuesta != 'n');
		 
		 //Mientras respuesta sea si
		 while(respuesta == 's') {
			 
			 //ObtenerDatos
			 System.out.println("Dime su numero y calculamos su factoriales");
			 numero = teclado.nextInt();
			 auxiliar = numero;
			 
			 
			 //RealizarFactorial
			 
			 for (int i = 1; i < auxiliar; i++) {
				  numero = numero  * i;
			 }
			
			//MostrarResultado
			System.out.println("El resultado es " + numero);
		
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


