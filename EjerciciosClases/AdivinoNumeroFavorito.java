/*
 * Nombre del programa: AdivinoNumeroFavorito
 * Breve comentario: Realizar un programa que lea una fecha de nacimiento de la forma dia, mes y anyo y 
 * 					  de como resultado el numero del Tarot. El programa verificara si la fecha es correcta.
 * 					 El numero del Tarot se haya sumando los numeros de la fecha de nacimiento y reduciendolos a un unico digito
 * 					 Ejemplo: 20/7/1984 = 2011 = 4
 * Analisis: 
 * 	Entrada: - Respuesta
 * 			 - Dia
 * 			 - Mes
 * 			 - Anyo
 *  Salida: - Eco de los datos
 * 			- Numero del tarot
 * 
 * 	Restricciones: - Respuesta tiene que ser s o n
 * 				   - Dia tiene que ser del 1 al 31
 * 				   - Mes tiene que ser del 1 al 12
 * 				   - Anyo tiene que ser del 1582 hacia delante
 * 
 * PG Level 0 
 * Inicio
 * 	LeeryValidarRespuesta
 * 	Mientras la respuesta sea s
 * 		LeeryValidarFechaNacimiento
 * 		CalcularNumeroFavorito
 * 		MostrarResultado
 * 	FinMientras
 * 	LeeryValidarRespuesta
 * Fin
 * 
 * Estudio del bucle
 * Nombre del bucle: BucleRespuestaSoN
 * VCB: Centinela
 * Inicializacion VCB: Lectura anticipada, antes de la primera iteración
 * Actualizacion VCB: Lectura final, fisicamente al final del bucle
 * Condicion de salida: respuesta == 's' || respuesta == 'n' && respuesta == 'S' || respuesta == 'N' //toUpperCase()
 * 
 * Nombre del bucle: MientrasRespuestaSi
 * VCB: Centinela
 * Inicializacion VCB: Lectura Anticipada, antes de la primera iteracion
 * Actualizacion VCB: Lectura final, fisicamente al final de cada bucle
 * Condicion de salida: respuesta == s
 * 
 * Nombre del bucle:
 * VCB:
 * Inicializacion VCB:
 * Actualizacion VCB:
 * Condicion de salida:
 * 
 * //Fechas posibles 1 3 5 7 8 10 12 = 31
 * 					2 28 - 29
 * 					4 6 9 11 = 30
 */

import java.util.Scanner;
import java.io.*;

public class AdivinoNumeroFavorito {
	
	public static void main (String[] args) {
		
		char respuesta;
		int dia;
		int mes
		int anyo;
		Scanner teclado = new Scanner(System.in);
		
		//LeeryValidarRespuesta
		do {
			System.out.println("Quieres ejecutar el programa");
			respuesta = teclado.next().charAt(0);
		}
		while(respuesta != 's' && respuesta != 'n');
		
		while(respuesta == 's') {
		System.out.println("Hola");
		}
		
		do {
			System.out.println("Quieres ejecutar el programa");
			respuesta = teclado.next().charAt(0);
		}
		while(respuesta != 's' && respuesta != 'n');
	}
}

