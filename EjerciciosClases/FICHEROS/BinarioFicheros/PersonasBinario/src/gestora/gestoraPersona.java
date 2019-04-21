package gestora;

import java.io.*;

public class gestoraPersona {

	/*
    Interfaz
    Nombre: introducir
    Comentario: Este subprograma anhade un nuevo objeto
    Cabecera: public void introducir(String ruta, <T> objeto)
    Precondiciones: No hay
    Entrada: - <T> objeto //Es el objeto por anhadir
    Salida: int error //El codigo de error para mostrar un mensaje
    E/S: - String ruta //Es la ruta donde esta el fichero
    Postcondiciones: Asociado al nombre. El codigo de error necesario para mostrar un mensaje
    */
	
	 public <T> int introducir(String ruta, T objeto) {
	    	int error = 0;
	        try {
	        	ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(ruta, true));
	            oos.writeObject(objeto);
	            oos.flush();
	            oos.close();
	        } 
	        catch (IOException err) {
	            err.printStackTrace();
	        }
	        
	        return error;
	 }
	 
	 
}
