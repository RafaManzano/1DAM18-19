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
 * PD LeeryValidarFechaNacimiento
 * 	Inicio
 * 		Repetir
 * 			Escribir("Dame su dia de nacimiento (1-31)")
 * 			Leer(dia)
 * 			Escribir("Deme su mes de nacimiento (1-12)")
 * 			Leer(mes)
 * 			Escribir("Deme su anyo de nacimiento (1582-2018)")
 * 			Leer(anyo)
 * 			Si año es mayor 1582
 * 				Si mes es 1 o 3 o 5 o 7 o 8 o 10 o 12
 * 					Si dia esta entre 1 y 31
 * 						validar es true;
 * 					FinSi 
 * 				FinSi
 * 				Si mes es 4 o 6 o 9 o 11 
 * 					Si dia esta entre 1 y 30
 * 						validar es true;
 * 					FinSi 
 * 				FinSi
 * 
 * 				Si el año es bisiesto y el mes es 2
 * 					Si el dia esta entre 1 y 29
 * 						validar es true; 
 * 					FinSi
 * 				FinSi
 * 				Sino Si el mes es 2
 * 					Si el dia esta entre 1 y 28
 * 						validar es true;
 * 					FinSi
 * 				FinSi
 * 			FinSi
 * 		Mientras validar sea falso	
 * 	Fin
 * 
 * 
 * Estudio del bucle
 * Nombre del bucle: BucleRespuestaSoN
 * VCB: Centinela
 * Inicializacion VCB: Lectura anticipada, antes de la primera iteracion
 * Actualizacion VCB: Lectura final, fisicamente al final del bucle
 * Condicion de salida: respuesta == 's' || respuesta == 'n' && respuesta == 'S' || respuesta == 'N' 
 * 
 * Nombre del bucle: MientrasRespuestaSi
 * VCB: Centinela
 * Inicializacion VCB: Lectura Anticipada, antes de la primera iteracion
 * Actualizacion VCB: Lectura final, fisicamente al final de cada bucle
 * Condicion de salida: respuesta == s
 * 
 * Nombre del bucle: MientrasFechaNoSeaValida
 * VCB: Indicador
 * Inicializacion VCB: Verdadero / falso, antes de la primera iteracion
 * Actualizacion VCB: Cambio de estado cuando ocurra el proceso a evaluar
 * Condicion de salida: validar == false
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
		int numero;
		int primero;
		int segundo;
		int tercero;
		int cuarto;
		int favorito;
		
		Scanner teclado = new Scanner(System.in);
		boolean validar = false;
		
		//LeeryValidarRespuesta
		do {
			System.out.println("Quieres ejecutar el programa");
			respuesta = Character.toUpperCase(teclado.next().charAt(0));
		}
		while(respuesta != 'S' && respuesta != 'N');
		
		//Mientras respuesta sea si
		while(respuesta == 'S') {
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
			do { //Mientras la fecha no sea valida
				//System.out.println("Hola");
				System.out.println("Dame su dia de nacimiento (1-31)");
				dia = teclado.nextInt(); //Leer(dia)
				System.out.println("Deme su mes de nacimiento (1-12)");
				mes = teclado.nextInt(); //Leer(mes)
				System.out.println("Deme su anyo de nacimiento (1582-2018)");
				anyo = teclado.nextInt(); //Leer(anyo)
				
				//do {
				if (anyo > 1581) { //Si año es mayor 1582
			
					/*if ((anyo % 4 == 0) && ((anyo % 100 != 0) || (anyo % 400 == 0))) {
						if (mes== 2) {
							if(dia > 0 && dia < 30) {
								validar = true;
							}
						}
					}
					*/
						
					if (mes == 1 || mes == 3 || mes == 5 || mes == 7 || mes == 8 || mes == 10 || mes == 12) { //Si mes es 1 o 3 o 5 o 7 o 8 o 10 o 12
						if(dia > 0 && dia < 32) { //Si dia esta entre 1 y 31
								validar = true; //validar es true;
						}
					}
						
					if (mes == 4 || mes == 6 || mes == 9 || mes == 11) { //Si mes es 4 o 6 o 9 o 11 
						if(dia > 0 && dia < 31) { //Si dia esta entre 1 y 30
								validar = true; //validar es true;
						}
					}
					
					if ((anyo % 4 == 0) && ((anyo % 100 != 0) || (anyo % 400 == 0)) && (mes == 2)) { //Si el año es bisiesto y el mes es 2
						if(dia > 0 && dia < 30) { //Si dia esta entre 1 y 29
							validar = true; //validar es true;
						}
					}
					
					else if (mes == 2) { //Si el mes 2
						if (dia > 0 && dia <= 28) { //Si dia esta entre 1 y 28
							validar = true; //validar es true;
						}
					}
				
				}
				
				//if (anyo > 1581 || anyo < 2019) {
					//validar = true;
				//}
			//}
			//while((dia < 1 || dia > 31) || (mes < 1 || mes > 12) || (anyo < 1582 || anyo > 2018));
			}
			while(validar == false);
			
			//CalcularNumeroFavorito
			numero = dia + mes + anyo;
			primero = numero % 10;
			segundo = numero % 100 / 10;
			tercero = numero % 1000 / 100;
			cuarto = numero % 10000 / 1000;
			favorito = primero + segundo + tercero + cuarto;
			
			//MostrarResultado
			System.out.println("Su numero favorito es " + favorito);
			
					
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

