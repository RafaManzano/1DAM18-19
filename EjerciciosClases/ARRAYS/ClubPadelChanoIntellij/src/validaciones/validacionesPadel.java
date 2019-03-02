package validaciones;

import clases.PistaImp;
import clases.SocioImp;
import excepciones.ExcepcionPista;
import excepciones.ExcepcionSocio;
import interfaces.Pista;

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

	/*
	Interfaz
	Nombre: validarSocio
	Comentario: Este subprograma valida el socio para su posterior introduccion en el sistema
	Cabecera: public SocioImp validarSocio()
	Precondiciones: No hay
	Entrada: No hay
	Salida: SocioImp socio //El socio ya validado
	E/S: No hay
	Postcondiciones: Asociado al nombre, el socio ya validado
	//Try catch bonitos
	*/

	public SocioImp validarSocio() {
		SocioImp socio = new SocioImp();
		Scanner teclado = new Scanner(System.in);
		System.out.print("Nombre: ");
		String nombre = teclado.next();
		System.out.print("Apellidos: ");
		String apellidos = teclado.next();
		socio.setNombre(nombre);
		socio.setApellidos(apellidos);
		try {
			socio.setEdad(validarEdad());
			socio.setCuota(validarCuota());
			socio.setGenero(validarGenero());
		}
		catch(ExcepcionSocio err) {
			System.out.println("ERROR: " + err);
		}

		return socio;
	}

	/*
	Interfaz
	Nombre: validarCuota
	Comentario: Este subprograma valida la cuota del socio
	Cabecera: public int validarCuota()
	Precondiciones: No hay
	Entrada: No hay
	Salida: int cuota //La cuota queda validada
	E/S: No hay
	Postcondiciones: Asociado al nombre, la cuota queda validada
	*/

	public int validarCuota() {
		int cuota;
		Scanner teclado = new Scanner(System.in);
		do {
			System.out.println("La cuota tiene que ser mayor que 0");
			cuota = teclado.nextInt();
		}
		while(cuota <= 0);

		return cuota;
	}

	/*
	Interfaz
	Nombre: validarEdad
	Comentario: Este subprograma valida la edad del socio
	Cabecera: public int validarEdad()
	Precondiciones: No hay
	Entrada: No hay
	Salida: int cuota //La edad queda validada
	E/S: No hay
	Postcondiciones: Asociado al nombre, la edad queda validada
	*/

	public int validarEdad() {
		int edad;
		Scanner teclado = new Scanner(System.in);
		do {
			System.out.println("La edad tiene que ser mayor que 18");
			edad = teclado.nextInt();
		}
		while(edad <= 17);

		return edad;
	}

	/*
	Interfaz
	Nombre: validarGenero
	Comentario: Este subprograma valida el genero del socio
	Cabecera: public int validarGenero()
	Precondiciones: No hay
	Entrada: No hay
	Salida: int cuota //El genero queda validado
	E/S: No hay
	Postcondiciones: Asociado al nombre, el genero queda validado
	*/

	public char validarGenero() {
		char genero;
		Scanner teclado = new Scanner(System.in);
		do {
			System.out.println("El genero tiene que ser F o M");
			genero = Character.toLowerCase(teclado.next().charAt(0));
		}
		while(genero != 'm' & genero != 'f');

		return genero;
	}

	/*
	Interfaz
	Nombre: validarPista
	Comentario: Este subprograma valida una pista para introducirla en el sistema
	Cabecera: public PistaImp validarPista()
	Precondiciones: No hay
	Entrada: No hay
	Salida: PistaImp pista //La pista correcta
	E/S: No hay
	Postcondiciones: Asociado al nombre. La pista quedaria totalmente correcta
	*/

	public PistaImp validarPista() {
		PistaImp pista = new PistaImp();
		char respuesta;
		Scanner teclado = new Scanner(System.in);

		try {
			pista.setNumeroPista(validarNumeroPista());
		}
		catch(ExcepcionPista err) {
			System.out.println("ERROR: " + err);
		}

		//Aqui estaria el socio
		try {
			pista.setNumeroPista(validarHora());
		}
		catch(ExcepcionPista err) {
			System.out.println("ERROR: " + err);
		}

		System.out.println("Es una reserva rechazada? (S/N)");
		respuesta = Character.toLowerCase(teclado.next().charAt(0));
		if(respuesta == 's') {
			pista.setRechazada(true);
		}
		else {
			pista.setRechazada(false);
		}

		return pista;
	}

	/*
	Interfaz
	Nombre: validarNumeroPista
	Comentario: Este subprograma valida una numero de pista
	Cabecera: public int validarNumeroPista()
	Precondiciones No hay
	Entrada: No hay
	Salida: int validado //El numero de pista quedaria validado
	E/S: No hay
	Postcondiciones: Asociado al nombre. El numero de pista quedaria validado
	*/

	public int validarNumeroPista() {
		int validado;
		Scanner teclado = new Scanner(System.in);

		do {
			System.out.println("El numero de pista es de 1 a 10 (1-10)");
			validado = teclado.nextInt();
		}
		while(validado <= 0 || validado >= 11);

		return validado;
	}

	/*
	Interfaz
	Nombre: validarHora
	Comentario: Este subprograma valida una hora para la pista
	Cabecera: public int validarHora()
	Precondiciones No hay
	Entrada: No hay
	Salida: int validado //La hora quedaria validado
	E/S: No hay
	Postcondiciones: Asociado al nombre.La hora quedaria validado
	*/

	public int validarHora() {
		int validado;
		Scanner teclado = new Scanner(System.in);

		do {
			System.out.println("Las horas validan serian de 0 a 23 (0-23)");
			validado = teclado.nextInt();
		}
		while(validado <= -1 || validado >= 24);

		return validado;
	}

}
