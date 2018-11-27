 /*
 * Nombre del programa: Fechas
 * Breve Comentario: Este programa utiliza fechas para realizar diferentes cosas (SumarFechas, RestarFechas, CompararFecha, DiaSemana)
 * 
 * Analisis
 * Entrada:	- Anio
 * 		    - Mes
 * 			- Dia
 * 			- Opcion
 * 			
 * Salida:	- Resultado de cada opcion
 * 			- Mensajes con el usuario
 * 			- Eco de los datos
 * 
 * Requisitos: - Anio tiene que ser superior de 1582
 * 			   - Mes tiene que ser del 1 al 12
 * 			   - Dia tiene que ser del 1 al 31
 * 			   - Opcion tiene que ser 0 al 4
 * 
 * PG Level 0
 * Inicio
 * 	LeeryValidarOpcion
 * 	MientrasOpcionNoSeaSalir
 * 		Segun (opcion)
 * 			Para caso 1: 
 * 				SumarFechas*
 * 			Para caso 2: 
 * 				RestarFechas
 * 			Para caso 3: 
 * 				CompararFechas
 * 			Para caso 4: 
 * 				DiaSemana
 * 		FinSegun
 * 	FinMientras
 * Fin
 * 
 * 
 * Modulo SumarFechas
 * Inicio
 * 	LeeryValidarFecha1
 * 	LeeryValidarFecha2
 * 	SumarFecha
 * Fin
 */

import java.io.*;
import java.util.Scanner;

public class Fechas {
	
	public static void main (String[] args) {
		int anio1;
		int mes1;
		int dia1;
		int anio2;
		int mes2;
		int dia2;
		int opcion;
		Scanner teclado = new Scanner (System.in);
		
		//LeeryValidarOpcion
		do {
			//resguardosF.PresentarMenu();
			utilidadesF.PresentarMenu();
			opcion = teclado.nextInt();
		}
		while(opcion < 0 || opcion > 4);
		
		while(opcion != 0) {
			switch (opcion) {
				case 1:
					//System.out.println("SumarFechas");
					System.out.println("En construccion");
					
				break;
				
				case 2:
					System.out.println("RestarFechas");
				break;
				
				case 3:
					//System.out.println("CompararFechas");
					
					do {
						System.out.println("Inserte la primera fecha: ");
						System.out.print("Dia: ");
						dia1 = teclado.nextInt();
						System.out.print("Mes: ");
						mes1 = teclado.nextInt();
						System.out.print("Anio: ");
						anio1 = teclado.nextInt();
					}
					while(utilidadesF.validarFecha(anio1,mes1,dia1) == false);
					
					do {
						System.out.println("Inserte la segunda fecha: ");
						System.out.print("Dia: ");
						dia2 = teclado.nextInt();
						System.out.print("Mes: ");
						mes2 = teclado.nextInt();
						System.out.print("Anio: ");
						anio2 = teclado.nextInt();
					}
					while(utilidadesF.validarFecha(anio2,mes2,dia2) == false);
					//resguardosF.compararFecha(anio1,mes1,dia1,anio2,mes2,dia2);
					//int comparar = utilidadesF.compararFecha(anio1,mes1,dia1,anio2,mes2,dia2);
					//System.out.println(comparar);
					
					if (utilidadesF.compararFecha(anio1,mes1,dia1,anio2,mes2,dia2) == 2) {
						System.out.println("La fecha " + dia1 + "/" + mes1 + "/" + anio1 + " es anterior a la fecha " + dia2 + "/" + mes2 + "/" + anio2 );
					}
					else if (utilidadesF.compararFecha(anio1,mes1,dia1,anio2,mes2,dia2) == 1) {
						System.out.println("La fecha " + dia1 + "/" + mes1 + "/" + anio1 + " es posterior a la fecha " + dia2 + "/" + mes2 + "/" + anio2 );
					     }
					     else {
							 System.out.println("La fecha " + dia1 + "/" + mes1 + "/" + anio1 + " es igual a la fecha " + dia2 + "/" + mes2 + "/" + anio2 );
						 }
					
				break;
				
				case 4:
					System.out.println("DiaSemana");
				break;
			}
			
			//LeeryValidarOpcion
			do {
				//resguardosF.PresentarMenu();
				utilidadesF.PresentarMenu();
				opcion = teclado.nextInt();
			}
			while(opcion < 0 || opcion > 4);
		}
	}
}

