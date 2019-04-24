package conductores;


import java.io.FileOutputStream;

import clases.MiObjectOutputStream;
import clases.PersonaImp;
import gestora.gestoraPersona;

public class conductorPersona {
//Errores en la introduccion de las personas
//Creo que en el introducir salta una excepcion pero no soy capaz de verla
	public static void main(String[] args) {
		PersonaImp p1 = new PersonaImp();
		PersonaImp p2 = new PersonaImp("1A", "Rafael", "Manzano");
		PersonaImp p3 = new PersonaImp("2P", "Gordo", "Master");
		gestoraPersona gestora = new gestoraPersona();
		//MiObjectOutputStream oos = new MiObjectOutputStream(new FileOutputStream("movi.dat", true));
		String ruta = "p.dat";
		
		//gestora.introducir(ruta, p1);
		//gestora.introducir(ruta, p2);
		//gestora.introducir(ruta, p3);
		gestora.eliminar(ruta, "1A");
		gestora.mostrarFichero(ruta);
	}

}
