package resguardos;

public class resguardosGenericos {

    /*
   Interfaz
   Nombre: introducir
   Comentario: Este subprograma añade un nuevo objeto
   Cabecera: public void introducir(String ruta, <T> objeto)
   Precondiciones: No hay
   Entrada: - String ruta //Es la ruta donde esta el fichero
            - <T> objeto //Es el objeto por añadir
   Salida: No hay
   E/S: No hay
   Postcondiciones: El objeto quedaria introducido en el fichero
   */
    public <T> void introducir(String ruta, T objeto) {
       System.out.println("En resguardo");
    }

     /*
    Interfaz
    Nombre: buscaryEliminar
    Comentario: Busca en el fichero el objeto pasado por parametro y lo elimina (por marca)
    Cabecera: public <T> void buscaryEliminarCamarero(String ruta, T objeto)
    Precondiciones: El fichero debe estar creado
    Entrada: - String ruta //Es la ruta donde esta el fichero
             - T objeto //Es el objeto que buscamos para eliminar por marca
    Salida: No hay
    E/S: No hay
    Postcondiciones: Mensaje de confirmacion
    */

    public <T> void buscaryEliminarCamarero(String ruta, T objeto) {
        System.out.println("En resguardo");
    }

    /*
    Interfaz
    Nombre: eliminarRegistro
    Comentario: Este subprograma marca el registro para su posterior eliminacion
    Cabecera: public void eliminarRegistro(String ruta)
    Precondiciones: El fichero debe estar creado
    Entrada: - String ruta //La ruta del fichero debe ser correcta
    Salida: No hay
    E/S: No hay
    Postcondiciones: Marca en el fichero con "ELIMINADO" el registro ha eliminar
    */

    public void eliminarRegistro(String ruta) {
        System.out.println("En resguardo");
    }
}
