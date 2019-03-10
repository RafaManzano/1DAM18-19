package validaciones;
import java.util.*;
public class validacionesConcurso {

	/*
	 * Interfaz
	 * Nombre: leeryValidarOpcionMenu
	 * Comentario: Este subprograma valida la opcion del menu
	 * Cabecera: public int leeryValidarOpcionMenu()
	 * Precondiciones: No hay
	 * Entrada: No hay
	 * Salida: int opcion 
	 * E/S: No hay
	 * Postcondiciones: Asociado al nombre, la opcion de menu queda validada
	 */
	
	public int leeryValidarOpcionMenu() {
		int opcionMenu;
		Scanner teclado = new Scanner(System.in);
		
		do {
			System.out.println("Numeros validos (0 - 3)");
			opcionMenu = teclado.nextInt();
		}
		while(opcionMenu < 0 && opcionMenu > 3);
		
		return opcionMenu;
	}
	
	
}
