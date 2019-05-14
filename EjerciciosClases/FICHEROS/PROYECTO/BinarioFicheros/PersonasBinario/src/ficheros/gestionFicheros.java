package ficheros;

import java.io.*;

import clases.PersonaImp;
import gestora.gestoraPersona;

public class gestionFicheros {

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
			oos.close();
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
	
	 /*
     * Interfaz
     * Nombre: primerosAjustes
     * Comentario: Este subprograma organiza los primeros ajustes necesarios para la creacion y carga de los ficheros
     * Cabecera: public void primerosAjustes()
     * Precondiciones: No hay
     * Entrada: No hay
     * Salida: No hay
     * E/S: No hay
     * Postcondiciones: Crea y carga los ficheros necesarios para la ejecucion del programa correctamente
     */
    
    public void primerosAjustes() {
    	String rutaMov = "movimiento.dat";
		String rutaMaestro = "maestro.dat";
		String rutaDel =  "historico.dat";
		String rutaMod = "modificado.dat";
		String rutaAux = "auxiliar.dat";
    	File mov = new File(rutaMov);
    	File del = new File(rutaDel);
    	File mod = new File(rutaMod);
    	File maestro = new File(rutaMaestro);
    	File aux = new File(rutaAux);

    	if(!mov.exists()) {
    		crearFichero(rutaMov);
    		ficheroPorDefecto(rutaMov);
    	}
    	if(!del.exists()) {
    		crearFichero(rutaDel);
    	}
    	if(!mod.exists()) {
    		crearFichero(rutaMod);
    	}
    	if(!maestro.exists()) {
    		crearFichero(rutaMaestro);
    	}
    	else {
    		mov.deleteOnExit();
    		del.deleteOnExit();
        	mod.deleteOnExit();
        	aux.deleteOnExit();
        	
        	maestro.renameTo(mov);
    	}
    	if(!aux.exists()) {
    		crearFichero(rutaAux);
    	}
    	
    	
    	
    }
    
    public void eliminarFicheros() {
    	String rutaMov = "movimiento.dat";
    	String rutaMaestro = "maestro.dat";
    	String rutaDel =  "historico.dat";
    	String rutaMod = "modificado.dat";
    	String rutaAux = "auxiliar.dat";
    	File mov = new File(rutaMov);
    	File del = new File(rutaDel);
    	File mod = new File(rutaMod);
    	File maestro = new File(rutaMaestro);
    	File aux = new File(rutaAux);
    	
    	
    	mov.deleteOnExit();
    	del.deleteOnExit();
    	mod.deleteOnExit();
    	maestro.deleteOnExit();
    	aux.deleteOnExit();
    }

}
