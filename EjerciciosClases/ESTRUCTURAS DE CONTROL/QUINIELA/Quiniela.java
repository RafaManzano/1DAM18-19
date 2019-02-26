/*
 * Nombre del programa: Quiniela
 * 
 * Analisis:
 * 	Entrada: - Respuesta
 * 			 - Columna
 * 	Salida: - Mensajes con el usuario
 * 			- Resultado de las columnas
 * 
 * 	Requisitos: - Respuetsa tiene que ser s o n
 * 				- Columna tiene que ser mayor que 0
 * 
 * Estudio del bucle
 * 	Nombre: BucleRespuestaSoN
 * 	VCB: Centinela (s o n)
 * 	Inicializacion VCB: Lectura anticipada
 * 	Actualizacion VCB: Lectura final
 * 	Condicion de salida: respuesta == 's' || respuesta == 'n'
 * 	Condicion de entrada: respuesta != 's' || respuesta != 'n'
 * 
 *  Nombre: MientrasRespuestaSeaSi
 * 	VCB: Centinela (n)
 * 	Inicializacion VCB: Lectura anticipada
 * 	Actualizacion VCB: Lectura final
 * 	Condicion de salida: respuesta == 'n'
 * 	Condicion de entrada: respuesta != 'n'
 * 
 *  Nombre: ParaLasNColumnas
 * 	VCB: Contador
 * 	Inicializacion VCB: Antes de la primera iteracion 0/1
 * 	Actualizacion VCB: Al final de cada iteracion
 * 	Condicion de salida: contador > columna
 * 	Condicion de entrada: contador <= columna
 * 
 * PG Level 0
 * Inicio
 * 	LeeryValidarRespuesta
 * 	MientrasRespuestaSeaSi
 * 		LeeryValidarColumna
 * 		Para(Contador es igual a 0, Mientras contador sea menor a columna, contador + 1)
 * 			ComprobaryMostrarPorcentaje
 * 		FinPara
 * 		LeeryValidarRespuesta
 * 	FinMientras
 * Fin
 */
 

import java.io.*;
import java.util.*;
public class Quiniela {
	
	public static void main (String[] args) {
		
		char respuesta;
		int columna;
		int porcentaje;
		Scanner teclado = new Scanner(System.in);
		Random random = new Random();
		
		//LeeryValidarRespuesta
		do {
			System.out.println("Desea ejecutar? (S/N)");
			respuesta = Character.toLowerCase(teclado.next().charAt(0));
		}
		while(respuesta != 's' && respuesta != 'n');
		
		//MientrasRespuestaSeaSi
		while(respuesta == 's') {
			//LeeryValidarColumna
			do {
				System.out.println("Elija las columnas que desee");
				columna = teclado.nextInt();
			}
			while(columna <= 0);
			
			//Para (contador es igual a 0, Mientras contador sea menor a columna, contador mas 1)
			for(int contador = 0; contador < columna; contador++) {
				//ComprobaryMostrarPorcentaje
				porcentaje = random.nextInt(100)+1;
				
				if(porcentaje > 0 && porcentaje <= 50) {
					System.out.println("|1    |");
				}
				else if (porcentaje > 50 && porcentaje <= 80) {
					System.out.println("|  X  |");
				}
					else {
						System.out.println("|    2|");
					}
			}//FinPara
			
			//LeeryValidarRespuesta
				do {
					System.out.println("Desea ejecutar? (S/N)");
					respuesta = Character.toLowerCase(teclado.next().charAt(0));
				}
				while(respuesta != 's' && respuesta != 'n');
		} //FinMientras
		
		
	}
}//Fin

