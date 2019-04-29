package resguardos;

public class resguardosPersonas {

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
		    	
		    	System.out.println("En resguardo");
		        
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
		
		 public void eliminar (String ruta, String dni, String rutaEliminados) {
			 System.out.println("En resguardo");
		 }
		 

		 
		 
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
			 System.out.println("En resguardo");
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
		
		
		public void guardarCambiosEliminados (String ruta, String eliminados, String maestro) {
			System.out.println("En resguardo");
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
		public void guardar (String ruta, String modificado, String maestro) {
			System.out.println("En resguardo");
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
	    	System.out.println("En resguardo");
	    }
	    
	    /*
	     * V2
	     */
		public void guardarCambiosModificados (String ruta, String modificado, String maestro) {
			System.out.println("En resguardo");
		}
	 

}
