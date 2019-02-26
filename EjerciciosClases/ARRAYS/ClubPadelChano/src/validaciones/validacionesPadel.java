package validaciones;

import java.util.Scanner;

public class validacionesPadel {

	/*
	 * Interfaz 
	 * Nombre: validarOpcionMenu
	 * Comentario: Este subprograma valida la opcion de los menus (menuPrincipal, menuSocio, menuPista)
	 * Cabecera: public int validarOpcionMenu()
	 * Precondiciones: No hay
	 * Entrada: No hay
	 * Salida: int validado //Es el numero que hay que validar
	 * E/S: No hay
	 * Postcondiciones: El numero quedaria validado
	 */
	public int validarOpcionMenu() {
		Scanner teclado = new Scanner(System.in);
		int validado;
		
		do {
			System.out.println("Numeros del 1 al 3 y el 0 para salir");
			validado = teclado.nextInt();
		}
		while(validado < 0 || validado > 3);
		
		return validado;
	}

	/*
	 * Interfaz 
	 * Nombre: validarOpcionMenuReservas
	 * Comentario: Este subprograma valida la opcion de los menus (menuReservas)
	 * Cabecera: public int validarOpcionMenuReservas()
	 * Precondiciones: No hay
	 * Entrada: No hay
	 * Salida: int validado //Es el numero que hay que validar
	 * E/S: No hay
	 * Postcondiciones: El numero quedaria validado
	 */
	public int validarOpcionMenuReservas() {
		Scanner teclado = new Scanner(System.in);
		int validado;
		
		do {
			System.out.println("Numeros del 1 al 2 y el 0 para salir");
			validado = teclado.nextInt();
		}
		while(validado < 0 || validado > 2);
		
		return validado;
	}

	
}
