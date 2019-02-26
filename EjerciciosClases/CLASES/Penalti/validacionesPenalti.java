import java.util.*;
public class validacionesPenalti {
	
	/*
	 * Interfaz
	 * Nombre: validarGolpeo()
	 * Comentario: Este subprograma valida el golpeo del jugador
	 * Cabecera: public int validarGolpeo()
	 * Precondiciones: No hay
	 * Entrada: No hay
	 * Salida: int golpeo
	 * E/S:
	 * Postcondiciones: Asociado al nombre, el numero del sitio donde quiere chutar o parar
	*/
	public static int validarGolpeo() {
		Scanner teclado = new Scanner(System.in);
		int golpeo;
		do {
			System.out.println("Elija una de las opciones");
			golpeo = teclado.nextInt();
		}
		while(golpeo < 1 || golpeo > 3);
		
		return golpeo;
	}
}

