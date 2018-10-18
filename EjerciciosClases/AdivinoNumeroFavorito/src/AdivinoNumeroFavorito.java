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
		//Inicializacion de variables
		char respuesta;
		int dia;
		int mes;
		int anyo;
		Scanner teclado = new Scanner(System.in);
		boolean validar = false;
		
		//LeeryValidarRespuesta
		do {
			System.out.println("Quieres ejecutar el programa");
			respuesta = teclado.next().charAt(0);
		}
		while(respuesta != 's' && respuesta != 'n');
		
		while(respuesta == 's') {
			//System.out.println("Hola");
			
			//LeeryValidarFechaNacimiento
			/*
			do {
			System.out.println("Dame su dia de nacimiento (1-31)");
			dia = teclado.nextInt();
			System.out.println("Deme su mes de nacimiento (1-12)");
			mes = teclado.nextInt();
			System.out.println("Deme su anyo de nacimiento (1582-2018)");
			anyo = teclado.nextInt();
			}
			while(); //dia < 1 || dia > 31 //mes < 1 || mes > 12 //anyo 1582 < || anyo 2018
					//mes == 2 && dia < 28 //
			*/
			do {
				//System.out.println("Hola");
				System.out.println("Dame su dia de nacimiento (1-31)");
				dia = teclado.nextInt();
				System.out.println("Deme su mes de nacimiento (1-12)");
				mes = teclado.nextInt();
				System.out.println("Deme su anyo de nacimiento (1582-2018)");
				anyo = teclado.nextInt();
				
				//do {
				if (anyo > 1581 || anyo < 2019) {
				validar = true;
				}
		
				if ((anyo % 4 == 0) && ((anyo % 100 != 0) || (anyo % 400 == 0))) {
					if (mes== 2) {
						if(dia > 0 && dia < 30) {
							validar = true;
						}
					}
				}
					
				if (mes == 1 || mes == 3 || mes == 5 || mes == 7 || mes == 8 || mes == 10 || mes == 12) {
					if(dia > 0 && dia < 31) {
							validar = true;
					}
				}
					
				if (mes == 4 || mes == 6 || mes == 9 || mes == 11) {
					if(dia > 0 && dia < 31) {
							validar = true;
					}
				}
				
				if (mes == 2) {
					if (dia > 0 && dia < 29) {
						validar = true;
					}
				}
				
				//if (anyo > 1581 || anyo < 2019) {
					//validar = true;
				//}
			//}
			//while((dia < 1 || dia > 31) || (mes < 1 || mes > 12) || (anyo < 1582 || anyo > 2018));
			}
			while(validar == false);
			
			//LeeryValidarRespuesta
			do {
				System.out.println("Quieres ejecutar el programa");
				respuesta = teclado.next().charAt(0);
			}
			while(respuesta != 's' && respuesta != 'n');
		
		}
		
		while(respuesta != 's' && respuesta != 'n');
		System.out.println("Cerrando programa...");
	}
}

