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
	    	File archivo = new File(ruta);
	        try {
	        	if(archivo.exists()) {
	        		MiObjectOutputStream moos = new MiObjectOutputStream(new FileOutputStream(archivo, true));
	        		moos.writeObject(objeto);
	        		//oos.flush();
	        		moos.close();
	        	}
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
	 
	 //Se queda en bucle infinito, hay problema con los cierres de los ficheros
	 //Solucion Introducir en otro fichero de movimiento
	 //Solucion chunga intentar en el mismo fichero
	 public void eliminar (String ruta, String dni) {
		 ObjectInputStream ois = null;
		 MiObjectOutputStream moos = null;
		try {
			ois = new ObjectInputStream(new FileInputStream(ruta));
			moos = new MiObjectOutputStream(new FileOutputStream(ruta, true));
			//int tamanho = 0;
			PersonaImp p = (PersonaImp) ois.readObject();
			
			while(p != null) {
				if(p.getDNI().equals(dni)) {
					//eliminarRegistro(ruta, tamanho);
					p.setNombre("*");
					moos.writeObject(p);
					//moos.flush();
					//moos.close();
				}
				
				p = (PersonaImp) ois.readObject();
				//tamanho += (p.getDNI().length() + p.getNombre().length() + p.getApellidos().length()) * 2 + 2;
			}
			//ois.close();
					
		} 
		catch(EOFException err) {
			System.out.println("Fin de fichero");
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
		finally {
			try {
				if(ois != null) {
				ois.close();
				}
				
				if(moos != null) {
					moos.close();
				}
			}
			catch(IOException err) {
				err.printStackTrace();
			}
			
		}
		
		
	 }
	 
	/*
    Interfaz
    Nombre: eliminarRegistro
    Comentario: Este subprograma marca el registro para su posterior eliminacion
    Cabecera: public void eliminarRegistro(String ruta, int posicion)
    Precondiciones: El fichero debe estar creado
    Entrada: - int posicion //La posicion donde se encuentra el registro a eliminar
    Salida: No hay
    E/S: - String ruta //La ruta del fichero debe ser correcta
    Postcondiciones: Marca en el fichero con "*" el registro ha eliminar
    */
	 
	public void eliminarRegistro(String ruta, int posicion) {
		try {
			RandomAccessFile rrw = new RandomAccessFile(ruta, "rw");
            //System.out.println(linea);
            //System.out.println(rrw.getFilePointer());
            rrw.skipBytes(posicion);
            rrw.writeChar('*');
            rrw.close();
        } 
        catch (IOException err) {
            err.printStackTrace();
        }
	}
	
	/*
	 * Interfaz
	 * Nombre: guardarCambios
	 * Comentario: Este subprograma guarda los cambios en el fichero maestro
	 * Cabecera: public void guardarCambios (String ruta)
	 * Precondiciones: El fichero debe estar creado
	 * Entrada: String ruta //Es la ruta del fichero de movimiento
	 * Salida: No hay
	 * E/S: No hay
	 * Postcondiciones: Guarda la informacion del fichero antiguo al nuevo
	 */
	
	public void guardarCambios (String ruta) {
		try {
			MiObjectOutputStream oos = new MiObjectOutputStream(new FileOutputStream("maestro.dat",true));
			ObjectInputStream ois = new ObjectInputStream(new FileInputStream(ruta));
			Object p;
			
			while((p = ois.readObject()) != null) {
				if(p instanceof PersonaImp) {
					if(((PersonaImp) p).equals("*")) { //Si lo hace es magia
							//Le tengo que dar una vuelta,
							//Lo primero es descubrir quien tiene el asterisco y saber como funciona
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
    Nombre: mostrarFichero
    Comentario: Este subprorgama muestra el fichero completo
    Cabecera: public void mostrarFichero(String ruta)
    Precondiciones: El fichero debe estar creado
    Entrada: - String ruta //La ruta donde se encuentra el fichero
    Salida: No hay
    E/S: No hay
    Postcondiciones: Solo muestra el fichero completo
    */
	
    public void mostrarFichero(String ruta) {
        try {
        	ObjectInputStream ois = new ObjectInputStream(new FileInputStream(ruta));
        	PersonaImp p = (PersonaImp) ois.readObject();
			
			while(p != null) {
				System.out.println(p.toString());
				p = (PersonaImp) ois.readObject();
			}
			ois.close();
        } 
        catch(EOFException err) {
        	System.out.println("Fin de fichero");
        }
        catch (IOException err) {
            err.printStackTrace();
        }
        catch (ClassNotFoundException err) {
			err.printStackTrace();
		}
    }
}
