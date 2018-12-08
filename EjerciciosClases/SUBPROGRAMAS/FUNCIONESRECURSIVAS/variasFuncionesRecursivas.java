/*
* Nombre del programa: variasFuncionesRecursivas
* Breve Comentario: En este programa mostraremos en menu algunos ejercicios recursivos
* 
* Analisis
* 	Entrada: - Numero //Para los distintos subprogramas
* 			 - Opcion //La opcion de menu
* 
*   Salidas: - Mensajes con el usuario
* 		 	 - Resultado de los subprogramas
* 
* 	Requisitos: - Numero mayor que 0 //Tambien es la n de ackerman pero con mayor o igual que 0
* 			    - Opcion esta entre 0 y 4
* 				- Numero m es mayor o igual que 0
*
* PG Level 0
* Inicio
* 	LeeryValidarOpcion
* 	Mientras no sea salir
* 		para caso 1:
* 			LeeryValidarNumero
* 			PrimerEjercicio*
* 		para caso 2:
* 			SegundoEjercicio*
* 		para caso 3:
* 			LeeryValidarNumero
* 			TercerEjercicio*
* 		para caso 4:
* 			LeeryValidarNumeroM
* 			LeeryValidarNumeroN
* 			Ackerman*
* 		para caso 5:
* 			LeeryValidarNumeroF
* 			pintarFibonacci*
* 			fibonacci*
* 		LeeryValidarOpcion
* 	FinMientras
* Fin
*
* 
*/

import java.util.*;
import java.io.*;

public class variasFuncionesRecursivas {
	
	public static void main (String[] args) {
		int opcion;
		int numero;
		int numerom;
		Scanner teclado = new Scanner (System.in);
		
		//LeeryValidarMenu
		do {
			//resguardosFR.presentarMenu();
			funcionesRecursivas.presentarMenu();
			opcion = teclado.nextInt();
		}
		while (opcion < 0 || opcion > 6);
		
		while (opcion != 0) {
			
			switch (opcion) { //Mientras opcion no sea salir
				case 1:
				
					//LeeryValidarNumero
					do {
						System.out.println("Escriba el numero deseado");
						numero = teclado.nextInt();
					}
					while (numero < 0);
					
					//resguardosFR.primerEjercicio(numero);
					System.out.println(funcionesRecursivas.primerEjercicio(numero));
				break;
				
				case 2:
				
					
					System.out.println("Escriba el numero deseado");
					numero = teclado.nextInt();
					

					//resguardosFR.segundoEjercicio(numero);
					System.out.println(funcionesRecursivas.segundoEjercicio(numero));
				break;
				
				case 3:
				
					//LeeryValidarNumero
					do {
						System.out.println("Escriba el numero deseado");
						numero = teclado.nextInt();
					}
					while (numero < 0);
					
					//resguardosFR.tercerEjercicio(numero);
					System.out.println(funcionesRecursivas.tercerEjercicio(numero));
				break;
				
				case 4:
					//LeeryValidarNumeroM
					do {
						System.out.println("Escriba el numero m");
						numerom = teclado.nextInt();
					}
					while (numerom <= 0);
					
					//LeeryValidarNumeroN
					do {
						System.out.println("Escriba el numero n");
						numero = teclado.nextInt();
					}
					while (numero <= 0);
					
					//resguardosFR.ackerman(numerom, numero);
					System.out.println(funcionesRecursivas.ackerman(numerom,numero));
				break;
				
				case 5:
					//LeeryValidarNumero
					do {
						System.out.println("Escriba el numero para la serie de fibonacci");
						numero = teclado.nextInt();
					}
					while (numero <= 0);
					
					
					funcionesRecursivas.pintarFibonacci(numero);
					//resguardosFR.pintarFibonacci(numero);
					System.out.println();
					//resguardosFR.fibonacci(numero);
					System.out.println(funcionesRecursivas.fibonacci(numero));
			}
			
			//LeeryValidarMenu
			do {
				//resguardosFR.presentarMenu();
				funcionesRecursivas.presentarMenu();
				opcion = teclado.nextInt();
			}
			while (opcion < 0 || opcion > 5);
		}
	}
}

