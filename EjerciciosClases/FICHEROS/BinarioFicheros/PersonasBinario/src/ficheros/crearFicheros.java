package ficheros;

import java.io.*;

public class crearFicheros {

	/*
	 * Interfaz
	 * Nombre: crearFichero
	 * Comentario: Este subprograma crea el fichero de movimiento
	 * Cabecera: public void crearFichero(String ruta)
	 * Precondiciones: No hay
	 * Entrada: - String ruta //Es la ruta donde se va a encontrar el fichero
	 * Salida: No hay
	 * E/S: No hay 
	 * Postcondiciones: Crea el fichero
	 */
	public void crearFichero(String ruta) {
		try {
			ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(ruta));
		}
		catch(IOException err) {
			err.printStackTrace();
		}
	}
}
