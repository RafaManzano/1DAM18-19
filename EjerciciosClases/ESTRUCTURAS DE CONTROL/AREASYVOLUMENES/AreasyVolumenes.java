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
 * 	
 * 		LeeryValidaryPresentarMenu
 * 		Mientras Opcion no sea 0
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
 * 		Fin Mientras 
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
 * 				MostrarArea
 * 			FinCaso1
 * 
 * 			Caso 2: 
 * 				CalcularVolumen
 * 				MostrarVolumen
 * 			FinCaso2
 * 		FinSegun
 * 		LeeryValidarRespuesta
 * 	FinMientras
 * Fin
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
 * 				MostrarArea
 * 			FinCaso1
 * 
 * 			Caso 2: 
 * 				CalcularVolumen
 * 				MostrarVolumen
 * 			FinCaso2
 * 		FinSegun
 * 		LeeryValidarRespuesta
 * 	FinMientras
 * Fin
 * 
 * Estudio del bucle
 * Nombre: MientrasOpcionNo0
 * VCB: Centinela (0)
 * Inicializacion VCB: Lectura anticipada, antes de la primera iteracion
 * Actualizacion VCB: Lectura final, fisicamente al final de cada bucle
 * Condicion de salida: opcion == 0
 * Condicion de entrada: opcion != 0
 * 
 * Nombre: LeeryValidarRespuesta
 * VCB: Centinela (s o n)
 * Inicializacion VCB: Lectura anticipada, antes de la primera iteracion
 * Actualizacion VCB: Lectura final, fisicamente al final de cada bucle
 * Condicion de salida:  respuesta == 's' || respuesta == 'n'
 * Condicion de entrada: respuesta != 's' && respuesta != 'n'
 * 
 * Nombre: MientrasRespuestaSi
 * VCB: Centinela (s)
 * Inicializacion VCB: Lectura anticipada, antes de la primera iteracion
 * Actualizacion VCB: Lectura final, fisicamente al final de cada bucle
 * Condicion de salida:  respuesta == 's' 
 * Condicion de entrada: respuesta != 's' 
 * 
 * Nombre: LeeryValidarOpcionMenu
 * VCB: Centinela (de 0 al 3)
 * Inicializacion VCB: Lectura anticipada, antes de la primera iteracion
 * Actualizacion VCB: Lectura final, fisicamente al final de cada bucle
 * Condicion de salida:  opcion >= 0 || opcion <= 3
 * Condicion de entrada: opcion < 0 && opcion > 3
 * 
 * Nombre: LeeryValidarOpcionSubMenu
 * VCB: Centinela (de 1 al 2)
 * Inicializacion VCB: Lectura anticipada, antes de la primera iteracion
 * Actualizacion VCB: Lectura final, fisicamente al final de cada bucle
 * Condicion de salida:  opcion >= 1 || opcion <= 2
 * Condicion de entrada: opcion < 1 && opcion > 2
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
  		double volumen;
  		Scanner teclado = new Scanner(System.in);
  		

   
  	//LeeryValidaryPresentarMenu
  	do {
		
  		System.out.println("Este programa calcula areas y volumenes de las siguientes figuras geometricas");
  		System.out.println("1. Cono");
  		System.out.println("2. Piramide");
  		System.out.println("3. Cilindro");
  		System.out.println("0. Salir");
  		
  		opcion = teclado.nextInt();
  	}
  	while(opcion < 0 || opcion > 4);
  	
  	while (opcion != 0) {
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
				
				switch(opcion) { //Segun (opcion)
				case 1: //Caso 1: 
					//CalcularArea
					System.out.println("Para ello necesitamo el radio");
					radio = teclado.nextDouble();
					area = Math.PI * Math.pow(radio,2);
					
					//MostrarArea
					System.out.println("El area es " + area);
				break;
				
				case 2:
					//CalcularVolumen
					System.out.println("Dime el area que deseas");
					area = teclado.nextDouble();
					System.out.println("Dime la hipotenusa");
					hipotenusa = teclado.nextDouble();
					volumen = area * (hipotenusa / 3);
					
					//MostrarArea
					System.out.println("El volumen es " + volumen);
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
			//System.out.println("Piramide"); //Piramide
			do {
				System.out.println("Quieres ejecutar esta opcion");
				respuesta = Character.toLowerCase(teclado.next().charAt(0));
			}
			while(respuesta != 's' && respuesta != 'n');
			
			//MientrasRespuestaSeaSi
			while(respuesta == 's') {
				//MostrarMenuPiramide
				do {
					System.out.println("1. Calcular area");
					System.out.println("2. Calcular volumen");
					//LeeryValidarOpcionSM
					opcion = teclado.nextInt();
				}
				while(opcion < 1 && opcion > 3);
				
				switch(opcion) { //Segun (opcion)
				case 1: //Caso 1: 
					//CalcularArea
					System.out.println("Para ello necesitamo el lado");
					lado = teclado.nextDouble();
					System.out.println("Tambien el apotema");
					apotema = teclado.nextDouble();
					area = lado * (2 * apotema + lado);
					
					//MostrarArea
					System.out.println("El area es " + area);
				break;
				
				case 2:
					//CalcularVolumen
					System.out.println("Dime el lado que deseas");
					lado = teclado.nextDouble();
					System.out.println("Dime la hipotenusa");
					hipotenusa = teclado.nextDouble();
					volumen = 1/3 * lado * lado * hipotenusa;
					
					//MostrarArea
					System.out.println("El volumen es " + volumen);
				break;
			}
				
				//LeeryValidarRespuesta
				do {
					System.out.println("Quieres ejecutar esta opcion");
					respuesta = Character.toLowerCase(teclado.next().charAt(0));
				}
				while(respuesta != 's' && respuesta != 'n');
			}
		break; //FinCaso2
	
		case 3: //Caso3
			System.out.println("En construccion"); //Cilindro
		break; //FinCaso3
		}
		//LeeryValidaryPresentarMenu
		do {
		
  		System.out.println("Este programa calcula areas y volumenes de las siguientes figuras geometricas");
  		System.out.println("1. Cono");
  		System.out.println("2. Piramide");
  		System.out.println("3. Cilindro");
  		System.out.println("0. Salir");
  		
  		opcion = teclado.nextInt();
		}
		while(opcion < 0 || opcion > 4);
	}
	 	
	 	System.out.println("Cerrando programa...");	
	}
}



