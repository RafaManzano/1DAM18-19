package gestora;

import java.io.*;

import clases.MiObjectOutputStream;
import clases.PersonaImp;
import ficheros.gestionFicheros;
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
	    	MiObjectOutputStream moos = null;
	        try {
	        	moos = new MiObjectOutputStream(new FileOutputStream(ruta, true));
        		moos.writeObject(objeto);
        		//oos.flush();
        		moos.close();
	        }
	        catch (IOException err) {
	            err.printStackTrace();
	        }
	        
	        return error;
	 }
	 
	 /*
	    Interfaz
	    Nombre: eliminar
	    Comentario: Busca en el fichero el dni del objeto pasado por parametro y lo elimina pasandolo a un fichero de eliminacion
	    Cabecera: public void eliminar(String ruta, String dni, String rutaEliminados)
	    Precondiciones: El fichero debe estar creado
	    Entrada: - String dni //Es el dni del objeto para su posterior eliminacion
	    		 - String ruta //Es la ruta donde esta el fichero
	    Salida: - int error //El codigo de error para mostrar un mensaje
	    E/S: - String rutaEliminados //Es la ruta donde se guardan las eliminaciones del fichero
	    Postcondiciones: Asociado al nombre. El codigo de error necesario para mostrar un mensaje (0 correcto y 1 no encontrado)
	 */
	 
	 //Se queda en bucle infinito, hay problema con los cierres de los ficheros
	 //Solucion 1 Introducir en otro fichero de movimiento
	 //Solucion chunga intentar en el mismo fichero
	 //Solucionado Solucion 1
	 public void eliminar (String ruta, String dni, String rutaEliminados) {
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
					introducir(rutaEliminados, p);
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
			moos = new MiObjectOutputStream(new FileOutputStream(rutaModificar, true));
			//int tamanho = 0;
			PersonaImp p = (PersonaImp) ois.readObject();
			
			while(p != null) {
				if(p.getDNI().equals(dni)) {
					persona = new PersonaImp(p);
					persona = validar.modificarPersona(p);
					//eliminarRegistro(ruta, tamanho);
					introducir(rutaModificar, persona);
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
	
	 //El problema es que cuando llega la excepcion se va directamente al catch (se ha solucionado a�adiendo un try catch en la misma linea de la instruccion)
	public void guardarCambiosEliminados (String ruta, String eliminados, String maestro) {
			ObjectInputStream mov = null;
			ObjectInputStream del = null;
			PersonaImp perMov;
			PersonaImp perDel;
			
		try {
			mov = new ObjectInputStream(new FileInputStream(ruta));
			del = new ObjectInputStream(new FileInputStream(eliminados));
			perMov = (PersonaImp) mov.readObject();
			perDel = (PersonaImp) del.readObject();
			
			while(perMov != null && perDel != null) {
				if(perMov.getDNI().equals(perDel.getDNI())) {
					
					try {
						perMov = (PersonaImp) mov.readObject();
					}
					catch(EOFException err) {
						System.out.println("Fin de fichero");
						perMov = null;
					}
					
					try {
						perDel = (PersonaImp) del.readObject();
					}
					catch(EOFException err) {
						System.out.println("Fin de fichero");
						perDel = null;
					}
					
				}
				else {
					introducir(maestro, perMov);
					try {
						perMov = (PersonaImp) mov.readObject();
					}
					catch(EOFException err) {
						System.out.println("Fin de fichero");
						perMov = null;
					}
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
			
			if(perDel == null) {
				while(perMov != null) {
					introducir(maestro, perMov);
					perMov = (PersonaImp) mov.readObject();
				}
			} 
			
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
		
	
		
		/*
		finally {
			try {
				mov = new ObjectInputStream(new FileInputStream(ruta));
				perMov = (PersonaImp) mov.readObject();
				
				
				while(perMov != null) {
					introducir(maestro, perMov);
					perMov = (PersonaImp) mov.readObject();
				}
			}
			catch (EOFException err) {
				System.out.println("Fin de fichero");
			}
			catch (ClassNotFoundException err) {
				err.printStackTrace();
			}
			catch (IOException err) {
				err.printStackTrace();
			}
				
			}
		*/
	}
	
	/*
	 * Interfaz
	 * Nombre: guardarCambiosModificados
	 * Comentario: Este subprograma guarda los cambios en el fichero maestro para las personas que se han modificado
	 * Cabecera: public void guardarCambiosEliminados (String ruta, String modificado, String maestro)
	 * Precondiciones: Los ficheros deben estar creado
	 * Entrada: - String ruta //Es la ruta del fichero de movimiento
	 * 			- String modificado //Es la ruta donde se encuentra las personas que estan modificadas
	 * Salida: No hay
	 * E/S: - String maestro //Es la ruta donde se encuentra el fichero maestro
	 * Postcondiciones: Si la persona esta modificada se guarda en el fichero maestro y todo querdaria actualizado
	 */
	
	 //El problema es que cuando llega la excepcion se va directamente al catch (se ha solucionado a�adiendo un try catch en la misma linea de la instruccion)
	//Hay que revisar el codigo porque no esta depurado
	public void guardarCambiosModificados (String ruta, String modificado, String maestro) {
			ObjectInputStream mov = null;
			ObjectInputStream mod = null;
			PersonaImp perMov = null;
			PersonaImp perMod = null;
			
		try {
			mov = new ObjectInputStream(new FileInputStream(ruta));
			mod = new ObjectInputStream(new FileInputStream(modificado));
			perMov = (PersonaImp) mov.readObject();
			perMod = (PersonaImp) mod.readObject();
			
			while(perMov != null && perMod != null) {
				if(!perMov.getDNI().equals(perMod.getDNI())) {
					introducir(maestro, perMov);
					try {
						perMov = (PersonaImp) mov.readObject();
					}
					catch(EOFException err) {
						System.out.println("Fin de fichero");
						perMov = null;
					}
				}
				
				else {
					introducir(maestro, perMod);
					try {
						perMod = (PersonaImp) mod.readObject();
					}
					catch(EOFException err) {
						System.out.println("Fin de fichero");
						perMod = null;
					}
					
					try {
						//Object o = mov.readObject();
						perMov = (PersonaImp) mov.readObject();
						
					}
					catch(EOFException err) {
						System.out.println("Fin de fichero");
						perMov = null;
					}
					
					catch(ClassCastException err) {
						System.out.println("Controlada ClassCastException");
					}
					
					//Como salta la excepcion no se pone a null
					//Primera idea ponerlo a null en el catch
					
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
			
			if(perMod == null) {
				while(perMov != null) {
					perMov = (PersonaImp) mov.readObject();
					introducir(maestro, perMov);
				}
			} 
			
		mov.close();
		mod.close();
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
		
		/*
		finally {
			try {
				mov = new ObjectInputStream(new FileInputStream(ruta));
				perMov = (PersonaImp) mov.readObject();
				
				
				while(perMov != null) {
					introducir(maestro, perMov);
					perMov = (PersonaImp) mov.readObject();
				}
			}
			catch (EOFException err) {
				System.out.println("Fin de fichero");
			}
			catch (ClassNotFoundException err) {
				err.printStackTrace();
			}
			catch (IOException err) {
				err.printStackTrace();
			}
				
			}
		*/
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
