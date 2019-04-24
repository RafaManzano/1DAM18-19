package conductores;


import java.io.FileOutputStream;

import clases.MiObjectOutputStream;
import clases.PersonaImp;
import gestora.gestoraPersona;
import ficheros.crearFicheros;

public class conductorPersona {
	public static void main(String[] args) {
		PersonaImp p1 = new PersonaImp();
		PersonaImp p2 = new PersonaImp("1A", "Rafael", "Manzano");
		PersonaImp p3 = new PersonaImp("2P", "Gordo", "Master");
		gestoraPersona gestora = new gestoraPersona();
		crearFicheros fich = new crearFicheros();
		//MiObjectOutputStream oos = new MiObjectOutputStream(new FileOutputStream("movi.dat", true));
		String ruta = "p.dat";
		
		fich.crearFichero(ruta);
		gestora.introducir(ruta, p1);
		gestora.introducir(ruta, p2);
		gestora.introducir(ruta, p3);
		gestora.eliminar(ruta, "1A");
		gestora.mostrarFichero(ruta);
	}

}
