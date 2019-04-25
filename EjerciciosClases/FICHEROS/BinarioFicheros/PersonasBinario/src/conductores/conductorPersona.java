package conductores;


import java.io.FileOutputStream;

import clases.MiObjectOutputStream;
import clases.PersonaImp;
import gestora.gestoraPersona;
import ficheros.gestionFicheros;

public class conductorPersona {
	public static void main(String[] args) {
		PersonaImp p1 = new PersonaImp();
		PersonaImp p2 = new PersonaImp("1A", "Rafael", "Manzano");
		PersonaImp p3 = new PersonaImp("2P", "Gordo", "Master");
		gestoraPersona gestora = new gestoraPersona();
		gestionFicheros fich = new gestionFicheros();
		//MiObjectOutputStream oos = new MiObjectOutputStream(new FileOutputStream("movi.dat", true));
		String ruta = "r.dat";
		String historicos = "rh.dat";
		String maestro = "ra.dat";
		String modificar = "rm.dat";
		
		fich.crearFichero(ruta);
		fich.crearFichero(historicos);
		fich.crearFichero(maestro);
		fich.crearFichero(modificar);
		gestora.introducir(ruta, p1);
		gestora.introducir(ruta, p2);
		gestora.introducir(ruta, p3);
		//gestora.eliminar(ruta, "1A", historicos);
		gestora.modificar(ruta, "1A", modificar);
		//gestora.mostrarFichero(ruta);
		//gestora.mostrarFichero(modificar);
		//gestora.mostrarFichero(historicos);
		//gestora.guardarCambiosEliminados(ruta, historicos, maestro);
		gestora.guardarCambiosModificados(ruta, modificar, maestro);
		gestora.mostrarFichero(maestro);
	}

}
