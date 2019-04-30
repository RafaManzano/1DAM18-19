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
    Cabecera: public boolean introducir(String ruta, <T> objeto)
    Precondiciones: El fichero debe existir
    Entrada: - <T> objeto //Es el objeto por anhadir
    Salida: boolean error //Si el metodo responde con true, estara correctamente introducido y sino habra algun tipo de error
    E/S: - String ruta //Es la ruta donde esta el fichero
    Postcondiciones: Asociado al nombre. Si el metodo responde con true, estara correctamente introducido y sino habra algun tipo de error
	*/
	
	 public <T> boolean introducir(String ruta, T objeto) {
	    	boolean error = false;
	    	MiObjectOutputStream moos = null;
	        try {
	        	moos = new MiObjectOutputStream(new FileOutputStream(ruta, true));
	        	if(objeto != null) {
	        		moos.writeObject(objeto);
	        		error = true;
	        	}
        		
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
	    Cabecera: public boolean eliminar(String ruta, String dni, String rutaEliminados)
	    Precondiciones: El fichero debe estar creado
	    Entrada: - String dni //Es el dni del objeto para su posterior eliminacion
	    		 - String ruta //Es la ruta donde esta el fichero
	    Salida: - boolean error //Si el metodo responde con true, estara correctamente introducido y sino habra algun tipo de error
	    E/S: - String rutaEliminados //Es la ruta donde se guardan las eliminaciones del fichero
	    Postcondiciones: Asociado al nombre. //Si el metodo responde con true, estara correctamente introducido y sino habra algun tipo de error y queda introducido en el fichero de eliminados
	 */
	 
	 //Se queda en bucle infinito, hay problema con los cierres de los ficheros
	 //Solucion 1 Introducir en otro fichero de movimiento
	 //Solucion chunga intentar en el mismo fichero
	 //Solucionado Solucion 1
	 public boolean eliminar (String ruta, String dni, String rutaEliminados) {
		 ObjectInputStream ois = null;
		 boolean error = false;
		 //MiObjectOutputStream moos = null;
		try {
			ois = new ObjectInputStream(new FileInputStream(ruta));
			//moos = new MiObjectOutputStream(new FileOutputStream(ruta, true));
			//int tamanho = 0;
			PersonaImp p = (PersonaImp) ois.readObject();
			
			while(p != null) {
				if(p.getDNI().equals(dni)) {
					//eliminarRegistro(ruta, tamanho);
					error = introducir(rutaEliminados, p);
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
				
				/*
				if(moos != null) {
					moos.close();
				}
				*/
			}
			catch(IOException err) {
				err.printStackTrace();
			}
		}
	
		return error;
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
	 * Cabecera: public boolean modificarPersona (String ruta, String dni, String rutaModifica)
	 * Precondiciones: Los ficheros deben estar creados
	 * Entrada: - String ruta //La ruta donde se encuentra el fichero
	 * 			- String dni //El dni de la persona que se desea modificar
	 * Salida: - boolean error //Si el metodo responde con true, estara correctamente introducido y sino habra algun tipo de error
	 * E/S: - String rutaModificar //Es la ruta donde se van a guardar las modificaciones que se hagan
	 * Postcondiciones: //Si el metodo responde con true, estara correctamente introducido y sino habra algun tipo de error y queda introducido en el fichero de modificaciones
	 */
	 
	 public boolean modificar (String ruta, String dni, String rutaModificar) {
		 validacionesPersona validar = new validacionesPersona();
		 ObjectInputStream ois = null;
		 //MiObjectOutputStream moos = null;
		 PersonaImp persona = null;
		 boolean error = false;
		 
		try {
			ois = new ObjectInputStream(new FileInputStream(ruta));
			//moos = new MiObjectOutputStream(new FileOutputStream(rutaModificar, true));
			//int tamanho = 0;
			PersonaImp p = (PersonaImp) ois.readObject();
			
			while(p != null) {
				if(p.getDNI().equals(dni)) {
					persona = new PersonaImp(p);
					persona = validar.modificarPersona(p);
					//eliminarRegistro(ruta, tamanho);
					error = introducir(rutaModificar, persona);
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
				/*
				if(moos != null) {
					moos.close();
				}
				*/
			}
			catch(IOException err) {
				err.printStackTrace();
			}
		}
		
		return error;
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
	
	 //El problema es que cuando llega la excepcion se va directamente al catch (se ha solucionado añadiendo un try catch en la misma linea de la instruccion)
	public void guardarCambiosEliminados (String ruta, String eliminados, String maestro) {
			ObjectInputStream mov = null;
			ObjectInputStream del = null;
			PersonaImp perMov = null;
			PersonaImp perDel = null;
			
			try {
				mov = new ObjectInputStream(new FileInputStream(ruta));
				del = new ObjectInputStream(new FileInputStream(eliminados));
				try {
					perMov = (PersonaImp) mov.readObject();
				}
				catch(EOFException err) {
					err.printStackTrace();
					perMov = null;
				}
				
				try {
					perDel = (PersonaImp) del.readObject();
				}
				catch(EOFException err) {
					err.printStackTrace();
					perDel = null;
				}
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
			
		
		//Solo esta parte puesto que haya eliminaciones equivocadas no se anhadiran a nuestro archivo de movimiento
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
	//Este se queda como guardar porque es una prueba, luego se usa la V2
	
	 //El problema es que cuando llega la excepcion se va directamente al catch (se ha solucionado añadiendo un try catch en la misma linea de la instruccion)
	//Hay que revisar el codigo porque no esta depurado
	/*
	public void guardar (String ruta, String modificado, String maestro) {
			ObjectInputStream mov = null;
			ObjectInputStream mod = null;
			PersonaImp perMov = null;
			PersonaImp perMod = null;
			
			
		try {
			mov = new ObjectInputStream(new FileInputStream(ruta));
			mod = new ObjectInputStream(new FileInputStream(modificado));
			try {
				perMov = (PersonaImp) mov.readObject();
				
			}
			catch(EOFException err) {
				perMov = null;
			}
			try {
				perMod = (PersonaImp)mod.readObject();
				
			}
			catch(EOFException err) {
				perMod = null;
			}
			
			while(perMov != null && perMod != null) {
				if(!((PersonaImp) perMov).getDNI().equals(((PersonaImp) perMod).getDNI())) {
					introducir(maestro, perMov);
					try {
						perMov = (PersonaImp) mov.readObject();
					}
					catch(EOFException err) {
						System.out.println("Fin de fichero");
						perMov = null;
						mov.close();
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
						mod.close();
					}
					
					/*
					try {
						if((PersonaImp)mov.readObject() instanceof PersonaImp) {
							perMov = (PersonaImp)mov.readObject();
						}
					}
					catch(EOFException err) {
						System.out.println("Fin de fichero");
						perMov = null;
					}
					
					catch(ClassCastException err) {
						System.out.println("Controlada ClassCastException");
					}
					*/
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
				/*}
			}
			
			//Solo esta parte puesto que haya modificaciones equivocadas no se anhadiran a nuestro archivo de movimiento
			if(perMod == null) {
				while(perMov != null) {
					introducir(maestro, perMov);
					perMov = (PersonaImp) mov.readObject();
				}
			} 
				
			
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
	/*
	}
	*/
	/*
    Interfaz
    Nombre: mostrarFichero
    Comentario: Este subprorgama muestra el fichero completo
    Cabecera: public void mostrarFichero(String ruta)
    Precondiciones: El fichero debe estar creado
    Entrada: - String ruta //La ruta donde se encuentra el fichero
    Salida: No hay
    E/S: No hay
    Postcondiciones: Se muestra el fichero completo
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
    
    /*
     * V2
     */
	public void guardarCambiosModificados (String ruta, String modificado, String maestro) {
		ObjectInputStream mov = null;
		ObjectInputStream mod = null;
		Object perMov = null;
		Object perMod = null;
		
	try {
		mov = new ObjectInputStream(new FileInputStream(ruta));
		mod = new ObjectInputStream(new FileInputStream(modificado));
		try {
			perMov = (PersonaImp) mov.readObject();
			
		}
		catch(EOFException err) {
			perMov = null;
		}
		try {
			perMod = (PersonaImp)mod.readObject();
			
		}
		catch(EOFException err) {
			perMod = null;
		}
		
		while(perMov != null && perMod != null) {
			if(perMov instanceof PersonaImp &&  perMod instanceof PersonaImp) 
			{
				if(!((PersonaImp) perMov).getDNI().equals(((PersonaImp) perMod).getDNI())) {
					introducir(maestro, (PersonaImp)perMov);
					try {
						perMov = mov.readObject();
					}
					catch(EOFException err) {
						System.out.println("Fin de fichero");
						perMov = null;
					}
				}
				
				else {
					/*if( !((PersonaImp) perMod).getDNI().equals(dni)) {
						dni = ((PersonaImp) perMod).getDNI();
					*/
						introducir(maestro, (PersonaImp)perMod);
					}
						
					try {
						perMod = mod.readObject();
						//perMov = mod.readObject();
					}
					catch(EOFException err) {
						System.out.println("Fin de fichero");
						perMod = null;
					}
					
					/*
					try {
						if((PersonaImp)mov.readObject() instanceof PersonaImp) {
							perMov = (PersonaImp)mov.readObject();
						}
					}
					catch(EOFException err) {
						System.out.println("Fin de fichero");
						perMov = null;
					}
					
					catch(ClassCastException err) {
						System.out.println("Controlada ClassCastException");
					}
					*/
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
				//}
			}
		}
		
		//Con esto se anhaden todos los que faltan del fichero de movimientos
		if(perMod == null) {
			while(perMov != null) {
				perMov = (PersonaImp) mov.readObject();
				introducir(maestro, perMov);
			}
		}
		
		//Solo esta parte puesto que haya eliminaciones equivocadas no se anhadiran a nuestro archivo de movimiento
		
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
}

	/*
	    Interfaz
	    Nombre: eliminar
	    Comentario: Busca en el fichero el dni del objeto pasado por parametro y lo elimina pasandolo a un fichero de eliminacion
	    Cabecera: public boolean eliminar(String ruta, String dni, String rutaEliminados)
	    Precondiciones: El fichero debe estar creado
	    Entrada: - String dni //Es el dni del objeto para su posterior eliminacion
	    		 - String ruta //Es la ruta donde esta el fichero
	    Salida: - boolean error //Si el metodo responde con true, estara correctamente introducido y sino habra algun tipo de error
	    E/S: - String rutaEliminados //Es la ruta donde se guardan las eliminaciones del fichero
	    Postcondiciones: Asociado al nombre. //Si el metodo responde con true, estara correctamente introducido y sino habra algun tipo de error y queda introducido en el fichero de eliminados
	 */
	
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

/*
	/*
	 * Fusion
	
	
	public void fusion (String finalDel, String finalMod, String maestro) {
		ObjectInputStream del = null;
		ObjectInputStream mod = null;
		Object perDel = null;
		Object perMod = null;
		
	try {
		del = new ObjectInputStream(new FileInputStream(finalDel));
		mod = new ObjectInputStream(new FileInputStream(finalMod));
		perDel =  del.readObject();
		perMod =  mod.readObject();
		
		while(perDel != null && perMod != null) {
			if(perDel instanceof PersonaImp &&  perMod instanceof PersonaImp) 
			{
				if(((PersonaImp) perDel).getDNI().equals(((PersonaImp) perMod).getDNI())) {
					introducir(maestro, (PersonaImp)perDel);
					try {
						perDel = del.readObject();
						//perMod = mod.readObject();
					}
					catch(EOFException err) {
						System.out.println("Fin de fichero");
						perDel = null;
					}
					try {
						perMod = mod.readObject();
					}
					catch(EOFException err) {
						System.out.println("Fin de fichero");
						perMod = null;
					}
				}
				
				else {
					introducir(maestro, (PersonaImp)perMod);
					try {
						perMod = mod.readObject();
						//perMov = mod.readObject();
					}
					catch(EOFException err) {
						System.out.println("Fin de fichero");
						perMod = null;
					}
					
					
					try {
						if((PersonaImp)mov.readObject() instanceof PersonaImp) {
							perMov = (PersonaImp)mov.readObject();
						}
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
					
					
					if(perDel == null) {
						while(perMov != null) {
							introducir(maestro, perMov);
							perMov = (PersonaImp) mov.readObject();
						}
					}
					
				}
			}
		}
		
		Para cuando lo arregle lo tengo que descomentar
		if(perMod == null) {
			while(perMov != null) {
				perMov = (PersonaImp) mov.readObject();
				introducir(maestro, perMov);
			}
		} 
		
	
		del.close();
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
		}
		
*/
	}
 
