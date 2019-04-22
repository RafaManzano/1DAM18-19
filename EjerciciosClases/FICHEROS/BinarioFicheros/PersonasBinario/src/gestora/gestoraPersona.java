package gestora;

import java.io.*;

import clases.MiObjectOutputStream;
import clases.PersonaImp;

public class gestoraPersona {

	/*
    Interfaz
    Nombre: introducir
    Comentario: Este subprograma anhade un nuevo objeto
    Cabecera: public void introducir(String ruta, <T> objeto)
    Precondiciones: El fichero debe existir
    Entrada: - <T> objeto //Es el objeto por anhadir
    Salida: int error //El codigo de error para mostrar un mensaje
    E/S: - String ruta //Es la ruta donde esta el fichero
    Postcondiciones: Asociado al nombre. El codigo de error necesario para mostrar un mensaje
    */
	
	 public <T> int introducir(String ruta, T objeto) {
	    	int error = 0;
	        try {
	        	MiObjectOutputStream oos = new MiObjectOutputStream(new FileOutputStream(ruta, true));
	            oos.writeObject(objeto);
	            oos.flush(); //Por el binario no habria que ponerlo
	            oos.close();
	        } 
	        catch (IOException err) {
	            err.printStackTrace();
	        }
	        
	        return error;
	 }
	 
	 /*
	    Interfaz
	    Nombre: eliminar
	    Comentario: Busca en el fichero el dni del objeto pasado por parametro y lo elimina (por marca)
	    Cabecera: public void eliminar(String ruta, String dni)
	    Precondiciones: El fichero debe estar creado
	    Entrada: - String dni //Es el dni del objeto para su posterior eliminacion
	    Salida: - int error //El codigo de error para mostrar un mensaje
	    E/S: - String ruta //Es la ruta donde esta el fichero
	    Postcondiciones: Asociado al nombre. El codigo de error necesario para mostrar un mensaje (0 correcto y 1 no encontrado)
	 */
	 
	 //Comprobar si puedo coger el objeto entero
	 public void eliminar (String ruta, String dni) {
		try {
			ObjectInputStream ois = new ObjectInputStream(new FileInputStream(ruta));
			Object p;
			
			while((p = ois.readObject()) != null) {
				if(p instanceof PersonaImp) {
					if(((PersonaImp) p).equals(dni)) { //Si lo hace es magia
						eliminarRegistro(ruta, (PersonaImp) p);
					}
				}	
			}
		} 
		catch (FileNotFoundException err) {
			err.printStackTrace();
		} 
		catch (IOException err) {
			err.printStackTrace();
		}
		catch (ClassNotFoundException err) {
			err.printStackTrace();
		}
	 }
	 
	/*
    Interfaz
    Nombre: eliminarRegistro
    Comentario: Este subprograma marca el registro para su posterior eliminacion
    Cabecera: public void eliminarRegistro(String ruta, String dni)
    Precondiciones: El fichero debe estar creado
    Entrada: - String dni //El dni de la persona que se desea eliminar
    Salida: No hay
    E/S: - String ruta //La ruta del fichero debe ser correcta
    Postcondiciones: Marca en el fichero con "*" el registro ha eliminar
    */
	 
	public void eliminarRegistro(String ruta, PersonaImp persona) {
		try {
        	MiObjectOutputStream oos = new MiObjectOutputStream(new FileOutputStream(ruta,true));
            persona.setNombre("*");
            oos.writeObject(persona);
            oos.flush();
            oos.close();
        } 
        catch (IOException err) {
            err.printStackTrace();
        }
	}
	
	/*
	 * Interfaz
	 * Nombre: guardarCambios
	 * Comentario: Este subprograma guarda los cambios en el fichero maestro
	 * Cabecera: public void guardarCambios (String )
	 * Precondiciones:
	 * Entrada:
	 * Salida:
	 * E/S:
	 * Postcondiciones:
	 */
}
