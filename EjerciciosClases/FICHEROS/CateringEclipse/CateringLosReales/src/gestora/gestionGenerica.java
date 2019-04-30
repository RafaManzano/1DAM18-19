package gestora;

import java.io.*;

import enumeraciones.EnumTurno;

public class gestionGenerica {
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
	
	/**Este subprograma anhade un nuevo objeto en la ruta del fichero especificada por parametro
	 * @param ruta La ruta donde se va a anhadir el nuevo objeto
	 * @param objeto El objeto que se anhade al fichero, el objeto es un generico, osea, puedes introducir cualquier objeto de una clase
	 * @return error Es el codigo de error 
	 */
    public <T> int introducir(String ruta, T objeto) {
    	int error = 0;
        try {
            BufferedWriter bw = new BufferedWriter(new FileWriter(ruta, true));
            bw.write(objeto.toString());
            bw.newLine();
            bw.flush();
            bw.close();
        } 
        catch (IOException err) {
            err.printStackTrace();
        }
        
        return error;
    }

    /*
    Interfaz
    Nombre: eliminar
    Comentario: Busca en el fichero la id del objeto pasado por parametro y lo elimina (por marca)
    Cabecera: public int eliminar(String ruta, int id)
    Precondiciones: El fichero debe estar creado
    Entrada: - int id //Es la id del objeto para su posterior eliminacion
    Salida: - int error //El codigo de error para mostrar un mensaje
    E/S: - String ruta //Es la ruta donde esta el fichero
    Postcondiciones: Asociado al nombre. El codigo de error necesario para mostrar un mensaje (0 correcto y 1 no encontrado)
    */
    
    /**
     * Busca en el fichero la id del objeto pasado por parametro y lo elimina (por marca)
     * @param ruta Es la ruta donde esta el fichero
     * @param id Es la id del objeto para su posterior eliminacion
     * @return error El codigo de error para mostrar un mensaje
     */

    public int eliminar(String ruta, int id) {
    	int error = 1;
        try {
            BufferedReader br = new BufferedReader(new FileReader(ruta));
            //RandomAccessFile rrw = new RandomAccessFile(ruta, "rw")
            //br.mark(0);
            //br.reset();
            String linea;
            int posicion = 0;
            String ids = id + ".*";

            while ((linea = br.readLine()) != null) {
                //for(int contador = 0; (linea = br.readLine()) != null; contador++) {
                if (linea.matches(ids)) {
                    //Coger la marca
                    //System.out.println("Esta eliminado Hulio");
                    eliminarRegistro(ruta, posicion);
                    error = 0;
                }
                posicion += linea.length() + 2;
            }
            br.close();
        }
        catch (IOException err) {
            err.printStackTrace();
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
    */
    
    /**
     * Este subprograma marca el registro para su posterior eliminacion
     * @param ruta La ruta del fichero debe ser correcta
     * @param posicion La posicion donde se encuentra el registro a eliminar
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
        catch (FileNotFoundException err) {
            err.printStackTrace();
        }
        catch (IOException err) {
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

    /**
     * Este subprorgama muestra el fichero completo
     * @param ruta La ruta donde se encuentra el fichero
     */
    
    public void mostrarFichero(String ruta) {
        try {
            BufferedReader br = new BufferedReader(new FileReader(ruta));
            String linea;

            while ((linea = br.readLine()) != null) {
                System.out.println(linea);
            }
            br.close();
        } 
        catch (IOException err) {
            err.printStackTrace();
        }
    }
    
    /*
    Interfaz
    Nombre: mostrarTurno
    Comentario: Este subprograma muestra una lista con los camareros que trabajan en ese turno
    Cabecera: public void mostrarTurno(String ruta, EnumTurno turno)
    Precondiciones: El fichero (ruta) debe existir
    Entrada: - String ruta //Es la ruta donde se encuentra el fichero
             - EnumTurno turno //Es el turno que se debe mostrar
    Salida: - int error //El codigo de error para mostrar un mensaje
    E/S: No hay
    Postcondiciones: Si es 0 muestra en pantalla los camareros que trabajan en ese turno y lanza el codigo de error, si es 2 lanza el codigo de error   
    */
    
    /**
     * Este subprograma muestra una lista con los camareros que trabajan en ese turno
     * @param ruta Es la ruta donde se encuentra el fichero
     * @param turno Es el turno que se debe mostrar
     * @return int error El codigo de error para mostrar un mensaje
     */

    public int mostrarTurno(String ruta, EnumTurno turno) {
    	int error = 2;
        String turnoString = ".*" + turno.toString() + ".*";
        String linea;
        try {
            BufferedReader br = new BufferedReader(new FileReader(ruta));

            while((linea = br.readLine()) != null) {
                if(linea.matches(turnoString) == true) {
                    System.out.println(linea);
                    error = 0;
                }
            }
        }
        catch(FileNotFoundException err) {
            err.printStackTrace();
        }
        catch(IOException err) {
            err.printStackTrace();
        }
        return error;
    }
    
    /*
     * Interfaz
     * Nombre: guardarCambios
     * Comentario: Este subprograma guarda los cambios en el fichero maestro
     * Cabecera: public void guardarCambios(String ruta)
     * Precondiciones: El fichero (ruta) debe existir
     * Entrada: - String ruta //Es la ruta donde se encuentra el fichero antiguo
     * 			- String maestro //Es la ruta donde se encuentra el fichero nuevo //maestro
     * Salida: int error //El codigo de error para mostrar un mensaje
     * E/S: No hay
     * Postcondiciones: Asociado al nombre. El codigo de error necesario para mostrar un mensaje (0 correcto y 3 camareros eliminados)
     */
    
    /**
     * Este subprograma guarda los cambios en el fichero maestro
     * @param ruta Es la ruta donde se encuentra el fichero antiguo
     * @param maestro Es la ruta donde se encuentra el fichero nuevo //maestro
     * @return error El codigo de error para mostrar un mensaje
     */
    
    public int guardarCambios(String ruta, String maestro) {
    	int error = 3;
    	try {
			BufferedReader antiguo = new BufferedReader(new FileReader(ruta));
			BufferedWriter nuevo = new BufferedWriter(new FileWriter(maestro, true));
			String linea;
			
			while ((linea = antiguo.readLine()) != null) {
                if (linea.matches("[0-9]" + ".*")) {
                    nuevo.write(linea);
                    error = 0;
                    nuevo.flush();
                }
			}
			antiguo.close();
			nuevo.close();
			
		} 
    	catch (FileNotFoundException err) {
			
			err.printStackTrace();
		}
		catch (IOException err) {
			
			err.printStackTrace();
		}
    	return error;
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
}
