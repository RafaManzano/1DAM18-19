/*
 * Nombre del programa: QueTrianguloEs
 * Comentario: Diseñar un algoritmo para leer las longitudes de los lados de un triangulo (lado1, lado2, lado3)
 * 			   y determinar que triangulo es, de acuerdo a las siguientes casos. Suponiendo que A es el mayor
 * 			   de los lados y que B y C corresponden a los otros dos lados entonces:
 * 					- si A >= B + C no se trata de un triángulo
 * 					- si A * A = B * B + C * C es triángulo rectángulo
 * 					- si A * A > B * B + C * C triángulo obtusángulo
 * 					- si A * A < B * B + C * C triángulo acutángulo
 * Entrada: - lado1
 * 			- lado2
 * 			- lado3
 * 
 * Salida: - No es triangulo
 * 		   - Es triangulo rectangulo
 *         - Es triangulo obtusangulo
 *  	   - Es triangulo acutangulo
 * 
 * Suponemos: Que los datos son correctos
 * 
 * PG Level 0
 * Inicio
 * 		ObtenerDatos
 * 		ConocerTriangulo
 * Fin
 * 
 * PG ObtenerDatos
 * Inicio
 * 		Escribir("Escribe el lado mayor")
 * 		Leer(lado1)
 * 		Escribir("Escribe un lado menor")
 * 		Leer(lado2)
 * 		Escribir("Escribe el otro lado menor")
 * 		Leer(lado3)
 * Fin
 * 
 * PG ConocerTriangulo
 * Inicio
 * 		Si lado1 es mayor igual que la suma de lado2 y lado3
 * 			Escribir("No se trata de un triangulo")
 * 		Sino Si el doble de lado1 es igual a la suma de los dobles de lado2 y lado3
 * 				Escribir("Es un triangulo rectangulo")
 * 			 Sino Si el doble de lado1 es mayor a la suma de los dobles de lado2 y lado3
 * 				Escribir("Es un triangulo obtusangulo")
 * 				  Sino Si el doble de lado1 es menor a la suma de los dobles de lado2 y lado3
 * 						 Escribir("Es un triangulo acutangulo")
 * 						FinSi
 * 				  FinSi
 * 			 FinSi
 * 		FinSi
 * Fin
*/
import java.util.Scanner;
public class QueTrianguloEs {
	
	public static void main (String[] args) {
		
		//Declaracion de Variables
		int lado1;
		int lado2;
		int lado3;
		Scanner teclado = new Scanner (System.in);
		
		//ObtenerDatos
		//Escribir("Escribe el lado mayor")
		System.out.println("Escribe el lado mayor");
		
  		//Leer(lado1)
		lado1 = teclado.nextInt();
		
  		//Escribir("Escribe un lado menor")
  		System.out.println("Escribe un lado menor");
  		
  		//Leer(lado2)
  		lado2 = teclado.nextInt();
  		
		//Escribir("Escribe el otro lado menor")
		System.out.println("Escribe el otro lado menor");
		
  		//Leer(lado3)
  		lado3 = teclado.nextInt();
  		
  		//Si lado1 es mayor igual que la suma de lado2 y lado3
  		if (lado1 >= lado2 + lado3) {
			//Escribir("No se trata de un triangulo")
			System.out.println("No se trata de un triangulo");
		}
		//Sino
		else {
			//Si el doble de lado1 es igual a la suma de los dobles de lado2 y lado3
			if (lado1 * lado1 == (lado2 * lado2) + (lado3 * lado3)) {
				//Escribir("Es un triangulo rectangulo")
				System.out.println("Es un triangulo rectangulo");
			}
			//Sino
			else {
				//Si el doble de lado1 es mayor a la suma de los dobles de lado2 y lado3
				if(lado1 * lado1 > (lado2 * lado2) + (lado3 * lado3)) {
					//Escribir("Es un triangulo obtusangulo")
					System.out.println("Es un triangulo obtusangulo");
				}
				//Sino
				else {
					//Si el doble de lado1 es menor a la suma de los dobles de lado2 y lado3
					if(lado1 * lado1 < (lado2 * lado2) + (lado3 * lado3)) {
						//Escribir("Es un triangulo acutangulo")
						System.out.println("Es un triangulo acutangulo");
					} //FinSi
				} //FinSi
			} //FinSi
		} //FinSi
						 
	}
}

