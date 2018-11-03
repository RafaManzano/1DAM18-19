/*
 * Nombre del programa: QuinielaV2
 * 
 * Analisis:
 * 	Entrada: - Respuesta
 * 			 - Columna
 * 			 - Fila
 * 	Salida: - Mensajes con el usuario
 * 			- Resultado de las columnas
 * 
 * 	Requisitos: - Respuetsa tiene que ser s o n
 * 				- Columna tiene que ser mayor que 0
 * 
 * Estudio del bucle
 * 	Nombre: BucleRespuestaSoN
 * 	VCB: Centinela
 * 	Inicializacion VCB: Lectura anticipada
 * 	Actualizacion VCB: Lectura final
 * 	Condicion de salida: respuesta == 's' || respuesta == 'n'
 * 
 *  Nombre: MientrasRespuestaSeaSi
 * 	VCB: Centinela
 * 	Inicializacion VCB: Lectura anticipada
 * 	Actualizacion VCB: Lectura final
 * 	Condicion de salida: respuesta == 's'
 * 
 *  Nombre: ParaLasNColumnas
 * 	VCB: Contador
 * 	Inicializacion VCB: Antes de la primera iteracion 0/1
 * 	Actualizacion VCB: Al final de cada iteracion
 * 	Condicion de salida: contador > columna
 * 
 * PG Level 0
 * Inicio
 * 	LeeryValidarRespuesta
 * 	MientrasRespuestaSeaSi
 * 		LeeryValidarColumna
 * 		LeeryValidarFila
 * 		Para(Contadorcol es igual a 0, Mientras contador sea menor a columna, contadorcol + 1)
 * 			Para(Contadorfila es igual a 0, Mientras contador sea menor a fila, contadorfila + 1)
 * 			ComprobaryMostrarPorcentaje
 * 			FinPara
 * 		FinPara
 * 		LeeryValidarRespuesta
 * 	FinMientras
 * Fin
 */
 

import java.io.*;
import java.util.*;
public class QuinielaV2 {
	
	public static void main (String[] args) {
		
		char respuesta;
		int columna;
		int fila;
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
			
			//LeeryValidarFila
			do {
				System.out.println("Elija las filas que desee");
				fila = teclado.nextInt();
			}
			while(columna <= 0);
			
			//Para (contadorcol es igual a 0, Mientras contadorcol sea menor a columna, contadorcol + 1)
			for(int contadorcol = 0; contadorcol < columna; contadorcol++) {
				
				//Para(Contadorfila es igual a 0, Mientras contador sea menor a fila, contadorfila + 1)
				for (int contadorfila = 0; contadorfila < fila; contadorfila++) {
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

