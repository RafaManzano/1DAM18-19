/*
 * Nombre del programa: ecuacionSegundoGrado
 * Entrada: - A
 * 			- B
 * 			- C 
 * 
 * Salida: - Eco de los datos
 * 		   - Resultado de la primera ecuacion
 * 		   - Resultado de la segunda ecuacion
 * 
 * Suponemos: Que los datos son correctos
 * 
 * PG Level 0
 * Inicio
 * 		ObtenerDatos
 * 		RealizarEcuacion
 * 		MostrarResultado
 * Fin
 * 
 * PG ObtenerDatos
 * Inicio
 * 		Escribir ("Obtener la a")
 * 		Leer(a)
 * 		Escribir ("Obtener la b")
 * 		Leer(b)
 * 		Escribir ("Obtener la c")
 * 		Leer(c)
 * Fin
 * 
 * PG RealizarEcuacion
 * Inicio
 * 		RealizarEcuacion1
 * 		RealizarEcuacion2
 * Fin
 * 
 * PG MostrarResultado
 * Inicio
 * 		Escribir ("La a es ", a ", la b es ", b " y la c es " c)
 * 		Escribir ("El resultado de la primera ecuacion es ", resultado1)
 * 		Escribir ("El resultado de la segunda ecuacion es ", resultado2)
 * Fin
 */

import java.util.*;
public class ecuacionSegundoGrado {
	
	public static void main (String[] args) {
		
		int a;
		int b;
		int c;
		double resultado1;
		double resultado2;
		Scanner teclado = new Scanner(System.in);
		
		//ObtenerDatos
		// Escribir ("Obtener la a")
		System.out.println("Obtener la a");
		
  		//Leer(a)
  		a = teclado.nextInt();
  		
  		//Escribir ("Obtener la b")
  		System.out.println("Obtener la b");
  		
		//Leer(b)
		b = teclado.nextInt();
		
 		//Escribir ("Obtener la c")
 		System.out.println("Obtener la c");
 		
  		//Leer(c)
  		c = teclado.nextInt();
  		
  		//RealizarEcuacion1
  		resultado1 = (-b + (Math.sqrt((b*b) -(4 * a * c)))) / 2 * a;
  		
  		//RealizarEcuacion2
  		resultado2 = (-b - (Math.sqrt((b*b) -(4 * a * c)))) / 2 * a;
  		
  		//PG MostrarResultado
  		//Escribir ("La a es ", a ", la b es ", b " y la c es " c)
  		System.out.println("La a es " + a + ", la b es " + b + " y la c es " + c);
  		
  		//Escribir ("El resultado de la primera ecuacion es ", resultado1)
  		System.out.println("El resultado de la primera ecuacion es " + resultado1);
  		
  		//Escribir ("El resultado de la segunda ecuacion es ", resultado2)
  		System.out.println("El resultado de la segunda ecuacion es " + resultado2);
	}
}

