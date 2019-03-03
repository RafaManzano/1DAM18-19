package menus;

public class menuPadel {

	/*
	 * Interfaz
	 * Nombre: menuPrincipal
	 * Comentario: Este subprograma pinta el menu principal
	 * Cabecera: public void menuPrincipal()
	 * Precondiciones: No hay
	 * Entrada: No hay
	 * Salida: No hay
	 * E/S: No hay
	 * Postcondiciones: Solo pinta en pantalla el menu principal
	 */
	
	public void menuPrincipal() {
		System.out.println("MENU PRINCIPAL");
		System.out.println("1. Socios");
		System.out.println("2. Pistas");
		System.out.println("3. MostrarReservas");
		System.out.println("0. Salir");
	}
	
	/*
	 * Interfaz
	 * Nombre: menuSocios
	 * Comentario: Este subprograma pinta el menu de socios
	 * Cabecera: public void menuSocios()
	 * Precondiciones: No hay
	 * Entrada: No hay
	 * Salida: No hay
	 * E/S: No hay
	 * Postcondiciones: Solo pinta en pantalla el menu de socios
	 */
	
	public void menuSocios() {
		System.out.println("MENU SOCIOS");
		System.out.println("1. Por Defecto");
		System.out.println("2. Introducir Socio");
		System.out.println("3. Borrar Socio");
		System.out.println("0. Salir");
	}
	
	/*
	 * Interfaz
	 * Nombre: menuPistas
	 * Comentario: Este subprograma pinta el menu de pistas
	 * Cabecera: public void menuPistas()
	 * Precondiciones: No hay
	 * Entrada: No hay
	 * Salida: No hay
	 * E/S: No hay
	 * Postcondiciones: Solo pinta en pantalla el menu de pistas
	 */
	
	public void menuPistas() {
		System.out.println("MENU PISTAS");
		System.out.println("1. Por Defecto");
		System.out.println("2. Introducir Pista");
		System.out.println("3. Borrar Pista");
		System.out.println("0. Salir");
	}
	
	/*
	 * Interfaz
	 * Nombre: menuReservas
	 * Comentario: Este subprograma pinta el menu de reservas
	 * Cabecera: public void menuReservas()
	 * Precondiciones: No hay
	 * Entrada: No hay
	 * Salida: No hay
	 * E/S: No hay
	 * Postcondiciones: Solo pinta en pantalla el menu de reservas
	 */
	
	public void menuReservas() {
		System.out.println("MENU RESERVAS");
		System.out.println("1. Mostrar Socios");
		System.out.println("2. Mostras Pistas");
		System.out.println("0. Salir");
	}

	/*
	Interfaz
	Nombre: menuSociosyPistas
	Comentario: Este subprograma pinta las opciones de menu de socios y pistas
	Cabecera: public void menuSociosyPistas
	Precondiciones: No hay
	Entrada: No hay
	Salida: No hay
	E/S: No hay
	Postcondiciones: Solo pinta en pantalla el menu de mostrar socios y pistas
	*/

	public void menuSociosyPistas() {
		System.out.println("MENUS");
		System.out.println("1. Ascendente");
		System.out.println("2. Descendente");
		System.out.println("0. Salir");
	}


}
