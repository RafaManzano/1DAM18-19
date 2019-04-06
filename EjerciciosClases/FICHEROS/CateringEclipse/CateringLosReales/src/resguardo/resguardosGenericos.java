package resguardo;

public class resguardosGenericos {

	/*
    Interfaz
    Nombre: introducir
    Comentario: Este subprograma añade un nuevo objeto
    Cabecera: public void introducir(String ruta, <T> objeto)
    Precondiciones: No hay
    Entrada: - <T> objeto //Es el objeto por anhadir
    Salida: No hay
    E/S: - String ruta //Es la ruta donde esta el fichero
    Postcondiciones: Asociado al nombre. El objeto quedaria introducido en el fichero
    */
    public <T> void introducir(String ruta, T objeto) {
    	System.out.println("En resguardo");
    }

     /*
    Interfaz
    Nombre: eliminar
    Comentario: Busca en el fichero el objeto pasado por parametro y lo elimina (por marca)
    Cabecera: public <T> void eliminar(String ruta, T objeto)
    Precondiciones: El fichero debe estar creado
    Entrada: - T objeto //Es el objeto que buscamos para eliminar por marca
    Salida: No hay
    E/S: - String ruta //Es la ruta donde esta el fichero
    Postcondiciones: Mensaje de confirmacion
    */

    public <T> void eliminar(String ruta, T objeto) {
    	System.out.println("En resguardo");
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
}
