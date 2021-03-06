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
 * 				- respuesta es igual a s o n
 * 
 * Estudio de los bucles
 * 	Nombre: BucleRespuestaSoN
 * 	VCB: Centinela (s o n)
 * 	Inicializacion VCB: Lectura anticipada, antes de la primera iteracion
 * 	Actualizacion VCB: Lectura final, fisicamente al final de cada bucle
 * 	Condicion de salida: respuesta == 's' || respuesta == 'n'
 * 
 * 	Nombre: Mientras respuesta sea si
 * 	VCB: Centinela (n)
 * 	Inicializacion VCB: Lectura anticipada, antes de la primera iteracion
 * 	Actualizacion VCB: Lectura final, fisicamente al final de cada bucle
 * 	Condicion de salida: respuesta == 'n'
 * 
 * 	Nombre: NegativosNoValido
 * 	VCB: Centinela (0)
 * 	Inicializacion VCB: Lectura anticipada, antes de la primera iteracion
 * 	Actualizacion VCB: Lectura final, fisicamente al final de cada bucle
 * 	Condicion de salida: numero >= 0
 * 
 * 	Nombre: RealizarFactorial
 * 	VCB: Contador
 * 	Inicializacion VCB: Antes de la primera iteracion 0/1
 * 	Actualizacion VCB: Al final de cada iteracion
 * 	Condicion de salida: contador >= numero (numero es el numero que el usuario ha deseado)
 * 
 * PG Level 0
 * Inicio
 * 	LeeryValidarRespuesta
 * 	Mientras respuetsa sea si
 * 		ObtenerDatosyValidar
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
			 
			 //ObtenerDatosyValidar
			 do {
			 System.out.println("Dime su numero y calculamos su factoriales");
			 numero = teclado.nextInt();
			 auxiliar = numero;
			 }
			 while(numero < 0);
			 
			 
			 //RealizarFactorial
			 if (numero == 0) {
				 numero = 1;
			 }
			 
			 else {
				 for (int contador = 1; contador < auxiliar; contador++) {
					numero = numero  * contador;
				 }
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


