package ficheros;

import java.io.*;

import clases.*;
import enumeraciones.EnumTurno;
import gestora.gestionGenerica;

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
			BufferedReader br = new BufferedReader(new FileReader(ruta));
			br.close();
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
		MesaImp[] mesas = {new MesaImp(1),new MesaImp(2),new MesaImp(3),new MesaImp(4)};
		EnumTurno turno = null;
		CamareroImp c = new CamareroImp(1,"Rafael","Manzano", turno.NODEFINIDO, mesas);
		gestionGenerica gestora = new gestionGenerica();
		gestora.introducir(ruta, c);
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
    
	//Revisar que hacer con el maestro (Alomejor eliminar algun archivo)
    public void primerosAjustes() {
    	String rutaMov = "camareros.txt";
		String rutaMaestro = "maestro.txt";
		String rutaMesas = "mesas.txt";
    	File mov = new File(rutaMov);
    	File maestro = new File(rutaMaestro);
    	File me = new File(rutaMesas);

    	if(!mov.exists()) {
    		crearFichero(rutaMov);
    		ficheroPorDefecto(rutaMov);
    	}
    	
    	if(!maestro.exists()) {
    		crearFichero(rutaMaestro);
    	}
    	else {
    		mov.deleteOnExit();
    		me.deleteOnExit();
    		
    		crearFichero(rutaMov);
    		ficheroPorDefecto(rutaMov);
    		crearFichero(rutaMesas);
    	}
    	
    	if(!me.exists()) {
    		crearFichero(rutaMesas);
    	}
    }
    
    public void eliminarFicheros() {
    	String rutaMov = "camareros.txt";
    	String rutaMaestro = "maestro.txt";
    	String rutaMesas = "mesas.txt";
    	
    	File mov = new File(rutaMov);
    	File maestro = new File(rutaMaestro);
    	File me = new File(rutaMesas);
    	
    	mov.deleteOnExit();
    	maestro.deleteOnExit();
    	me.deleteOnExit();
    	
    }
}
