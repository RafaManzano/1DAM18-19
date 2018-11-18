/*
 * Subprogramas.java
 * 
 */


public class Subprogramas {
	/*
	 * Nec: Un numero. Datos de entrada que son por valor
	 * Dev: Un logico. Asociado al nombre que son datos de salida
	 * Nec/Dev: No hay
	 * Requisitos: No hay
	 * 
	 * Interfaz
	 * Nombre: numeroPar
	 * Comentario: Comprueba si un numero es par o no
	 * Cabecera: boolean numeroPar (int numero)
	 * Precondiciones: No hay
	 * Entrada: Un entero
	 * Salida: Un boolean
	 * E/S: No hay
	 * Postcondiciones: Si es par true y si es impar false. Asociado al nombre
	 * 
	*/
	public static boolean numeroPar (int numero) {
		boolean res = false;
		
		if (numero % 2 == 0) {
			res = true;
		}
		return res;
	}
	
	/*
	 * Nec: No hay
	 * Dev: No hay
	 * Nec/Dev: Dos numeros
	 * Requisitos: No hay
	 * 
	 * Interfaz
	 * Nombre: intercambiarNumeros
	 * Comentario: Se intercambias los valores de dos variables si el primero es menor que el segundo
	 * Cabecera: void intercambiarNumeros(int n1, int n2)
	 * Precondiciones: No hay
	 * Entrada: No hay
	 * Salida: No hay
	 * E/S: Dos enteros
	 * Postcondiciones: Por referencia se intercambian si el n1 es menor que n2 pero si no es asi se quedan igual 
	*/
	
	public static void intercambiarNumeros (int n1, int n2) {
		int aux;
		
		if (n1 < n2) {
			aux = n1;
			n1 = n2;
			n2 = aux;
			System.out.println("Se han intercambiado " + n1 + " " + n2);
		}
		else {
			System.out.println("No se han intercambiado" + n1 + " " + n2);
		}
	}
	
	
}

