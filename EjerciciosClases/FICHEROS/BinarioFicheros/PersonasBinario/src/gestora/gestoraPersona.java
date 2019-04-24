package gestora;

import java.io.*;

import clases.MiObjectOutputStream;
import clases.PersonaImp;
import validaciones.*;

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
					introducir("historicos.dat", p);
					//moos.flush();
					//moos.close();
				}
				
				p = (PersonaImp) ois.readObject();
				//tamanho += (p.getDNI().length() + p.getNombre().length() + p.getApellidos().length()) * 2 + 2;
			}
			//ois.close();
					
		} 
		
		catch(EOFException err) {
			System.out.println("Fin de lectura");
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
	*/
	 
	 
	/*
	 * Interfaz
	 * Nombre: modificar
	 * Comentario: Este subprograma para al archivo de modificaciones las personas ya modificadas (El DNI no se puede modificar)
	 * Cabecera: public void modificarPersona (String ruta, String dni, String rutaModifica)
	 * Precondiciones: Los ficheros deben estar creados
	 * Entrada: - String ruta //La ruta donde se encuentra el fichero
	 * 			- String dni //El dni de la persona que se desea modificar
	 * Salida: No hay
	 * E/S: - String rutaModificar
	 * Postcondiciones: En la ruta modificar se van a escribir las personas que se ha querido modificar
	 */
	 
	 public void modificar (String ruta, String dni, String rutaModificar) {
		 validacionesPersona validar = new validacionesPersona();
		 ObjectInputStream ois = null;
		 MiObjectOutputStream moos = null;
		 PersonaImp persona = null;
		try {
			ois = new ObjectInputStream(new FileInputStream(ruta));
			moos = new MiObjectOutputStream(new FileOutputStream(ruta, true));
			//int tamanho = 0;
			PersonaImp p = (PersonaImp) ois.readObject();
			
			while(p != null) {
				if(p.getDNI().equals(dni)) {
					persona = new PersonaImp(p);
					persona = validar.modificarPersona(p);
					//eliminarRegistro(ruta, tamanho);
					introducir("modificado.dat", persona);
					//moos.flush();
					//moos.close();
				}
				
				p = (PersonaImp) ois.readObject();
				//tamanho += (p.getDNI().length() + p.getNombre().length() + p.getApellidos().length()) * 2 + 2;
			}
			//ois.close();
					
		} 
		
		catch(EOFException err) {
			System.out.println("Fin de lectura");
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
	 * Interfaz
	 * Nombre: guardarCambiosEliminados
	 * Comentario: Este subprograma guarda los cambios en el fichero maestro para las personas que se han eliminado
	 * Cabecera: public void guardarCambiosEliminados (String ruta, String eliminados, String maestro)
	 * Precondiciones: El fichero debe estar creado
	 * Entrada: - String ruta //Es la ruta del fichero de movimiento
	 * 			- String eliminados //Es la ruta donde se encuentra las personas que estan eliminadas
	 * Salida: No hay
	 * E/S: - String maestro //Es la ruta donde se encuentra el fichero maestro
	 * Postcondiciones: Si la persona no esta eliminada se guarda en el fichero maestro y todo querdaria actualizado
	 */
	
	 //El problema es que cuando llega la excepcion se va directamente al catch
	public void guardarCambiosEliminados (String ruta, String eliminados, String maestro) {
			MiObjectOutputStream oos = null;
			ObjectInputStream mov = null;
			ObjectInputStream del = null;
			
		try {
			mov = new ObjectInputStream(new FileInputStream(ruta));
			del = new ObjectInputStream(new FileInputStream(eliminados));
			PersonaImp perMov = (PersonaImp) mov.readObject();
			PersonaImp perDel = (PersonaImp) del.readObject();
			
			while(perMov != null && perDel != null) {
				if(!perMov.getDNI().equals(perDel.getDNI())) {
					introducir(maestro, perMov);
					perMov = (PersonaImp) mov.readObject();
				}
				else {
					perMov = (PersonaImp) mov.readObject();
					perDel = (PersonaImp) del.readObject();
					/*
					if(perDel == null) {
						while(perMov != null) {
							introducir(maestro, perMov);
							perMov = (PersonaImp) mov.readObject();
						}
					}
					*/
				}
			}
			
			/*if(perMov != null) {
				while(perMov != null) {
					introducir(maestro, perMov);
					perMov = (PersonaImp) mov.readObject();
				}
			} */
			oos.close();
			mov.close();
			del.close();
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
