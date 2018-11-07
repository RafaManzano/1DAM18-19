/*
 * Nombre del programa: AreasyVolumenes
 * Breve comentario: Diseñar un programa que nos permita calcular areas y volumenes de distintas 
 * 	figuras geometricas, como cono, piramides y cilindros, segun elija el usuario
 * 
 * 	Formula: - Cono: - Area: pi * radio * radio 
 * 				   - Volumen: area * hipotenusa / 3
 * 
 *			 - Piramide: - Area: lado * (2 * apotema + lado)	
 * 						 - Volumen: 1/3 * lado * lado * hipotenusa
 * 
 * 			 - Cilindro: No sabemos nada 			
 * 
 * Analisis:
 * 	Entrada: - Opcion
 * 			 - Respuesta
 * 			 - Area
 * 			 - PI
 * 			 - Radio
 * 			 - Hipotenusa
 * 			 - Apotema
 * 			 - Lado
 * 
 * 	Salida:  - Mensaje de apoyo
 * 			 - Resultado de cada operacion
 * 
 * 	Requisitos: - Respuesta tiene que ser s o n
 * 				- Opcion es de 0 a 3
 * 				- Area, radio, hipotenusa, apotema, lado tienen que ser mayores que 0
 * 
 * PG Level 0
 * Inicio
 * 	Repetir
 * 		MostrarMenu
 * 		LeeryValidarOpcion
 * 		Segun (opcion)
 * 			Caso 1: 
 * 				Cono
 * 			FinCaso1
 * 
 * 			Caso 2: 
 * 				Piramide
 * 			FinCaso2
 * 
 * 			Caso 3: 
 * 				Cilindro
 * 			FinCaso3
 * 		FinSegun
 * 	Mientras opcion no sea 0
 * Fin
 * 
 * PG Cono
 * Inicio
 * 	LeeryValidarRespuesta
 * 	MientrasRespuestaSeaSi
 * 		MostrarMenuCono
 * 		LeeryValidarOpcionSM
 * 		Segun (opcion)
 * 			Caso 1: 
 * 				CalcularArea
 * 			FinCaso1
 * 
 * 			Caso 2: 
 * 				CalcularVolumen
 * 			FinCaso2
 * 		FinSegun
 * 		LeeryValidarRespuesta
 * 	FinMientras
 * Fin
 * 
 * 
 * 
 * PG Piramide
 * Inicio
 * 	LeeryValidarRespuesta
 * 	MientrasRespuestaSeaSi
 * 		MostrarMenuPiramide
 * 		LeeryValidarOpcionSM
 * 		Segun (opcion)
 * 			Caso 1: 
 * 				CalcularArea
 * 			FinCaso1
 * 
 * 			Caso 2: 
 * 				CalcularVolumen
 * 			FinCaso2
 * 		FinSegun
 * 		LeeryValidarRespuesta
 * 	FinMientras
 * Fin
 */

import java.util.*;
import java.io.*;
public class AreasyVolumenes {
	
	public static void main (String[] args) {
		int opcion;
        char respuesta;
  		double area;
  		double radio = 0;
  		double hipotenusa;
  		double apotema;
  		double lado;
  		Scanner teclado = new Scanner(System.in);
  		

   
  	//Repetir
  	
  	
  	do {
		//MostrarMenu
  		System.out.println("Este programa calcula areas y volumenes de las siguientes figuras geometricas");
  		System.out.println("1. Cono");
  		System.out.println("2. Piramide");
  		System.out.println("3. Cilindro");
  		System.out.println("0. Salir");
  		//LeeryValidarOpcion
  		opcion = teclado.nextInt();
  	}
  	while(opcion < 0 && opcion > 4);
  	
  	switch(opcion) { //Segun (opcion)
		case 1: //Caso 1: 
			//System.out.println("Cono"); //Cono
			//LeeryValidarRespuesta
			do {
				System.out.println("Quieres ejecutar esta opcion");
				respuesta = Character.toLowerCase(teclado.next().charAt(0));
			}
			while(respuesta != 's' && respuesta != 'n');
			
			//MientrasRespuestaSeaSi
			while(respuesta == 's') {
				//MostrarMenuCono
				do {
					System.out.println("1. Calcular area");
					System.out.println("2. Calcular volumen");
					//LeeryValidarOpcionSM
					opcion = teclado.nextInt();
				}
				while(opcion < 1 && opcion > 3);
				
				switch(opcion) {
				case 1:
					System.out.println("Para ello necesitamo el radio");
					radio = teclado.nextDouble();
					area = Math.PI * Math.pow(radio,2);
				break;
				
				case 2:
					
				break;
				}
				
				//LeeryValidarRespuesta
				do {
					System.out.println("Quieres ejecutar esta opcion");
					respuesta = Character.toLowerCase(teclado.next().charAt(0));
				}
				while(respuesta != 's' && respuesta != 'n');
			}
		break; //FinCaso1
		
		case 2: //Caso2:
			System.out.println("Piramide"); //Piramide
		break; //FinCaso2
		
		case 3: //Caso3
			System.out.println("En construccion"); //Cilindro
		break; //FinCaso3
	} 
 
  		
  			
  			
  			
  
  			
  		//FinSegun
  	//Mientras opcion no sea 0
 // Fin
  			 
		
	}
}

