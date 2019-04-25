package ficheros;

import java.io.*;

import clases.PersonaImp;
import gestora.gestoraPersona;

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
	
	/*
	 * Interfaz
	 * Nombre: ficheroPorDefecto
	 * Comentario: Este subprograma carga el fichero con datos
	 * Cabecera: public void ficheroPorDefecto (String ruta)
	 * Precondiciones: El fichero debe estar creado
	 * Entrada: No hay
	 * Salida: No hay
	 * E/S: - String ruta //La ruta donde se encuentra el fichero
	 * Postcondiciones: Se anhade los datos al fichero
	 */
	
	public void ficheroPorDefecto (String ruta) {
		PersonaImp p = new PersonaImp("0A","Rafael","Manzano");
		gestoraPersona gestora = new gestoraPersona();
		gestora.introducir(ruta, p);
	}
}
