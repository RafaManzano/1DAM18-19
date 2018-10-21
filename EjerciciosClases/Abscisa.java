/*
 * Abscisa.java
 * 
 */

import java.io.*;
import java.util.*;
public class Abscisa {
	
	public static void main (String[] args) {
		double x = 0;
		double y;
		Scanner teclado = new Scanner (System.in);
		System.out.println("Escribe la x");
		x = teclado.nextDouble();
		
		y = Math.sqrt(1 / (9 * x)) ;
		System.out.println(y);
	}
}

