package resguardo;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.RandomAccessFile;

import enumeraciones.EnumTurno;

public class resguardosGenericos {

    /*
    Interfaz
    Nombre: introducir
    Comentario: Este subprograma añade un nuevo objeto
    Cabecera: public void introducir(String ruta, <T> objeto)
    Precondiciones: No hay
    Entrada: - <T> objeto //Es el objeto por anhadir
    Salida: int error //El codigo de error para mostrar un mensaje
    E/S: - String ruta //Es la ruta donde esta el fichero
    Postcondiciones: Asociado al nombre. El codigo de error necesario para mostrar un mensaje
    */
    public <T> int introducir(String ruta, T objeto) {
    	int error = -1;
        System.out.println("En resguado");
        
        return error;
    }

    /*
    Interfaz
    Nombre: eliminar
    Comentario: Busca en el fichero la id del objeto pasado por parametro y lo elimina (por marca)
    Cabecera: publicvoid eliminar(String ruta, int id)
    Precondiciones: El fichero debe estar creado
    Entrada: - int id //Es la id del objeto para su posterior eliminacion
    Salida: - int error //El codigo de error para mostrar un mensaje
    E/S: - String ruta //Es la ruta donde esta el fichero
    Postcondiciones: Asociado al nombre. El codigo de error necesario para mostrar un mensaje (0 correcto y 1 no encontrado)
    */

    public int eliminar(String ruta, int id) {
    	int error = -1;
        System.out.println("En resguado");
        
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

    public int mostrarTurno(String ruta, EnumTurno turno) {
    	int error = -1;
        System.out.println("En resguado");
        
        return error;
    }
    
    /*
     * Interfaz
     * Nombre: guardarCambios
     * Comentario: Este subprograma guarda los cambios en el fichero maestro
     * Cabecera: public void guardarCambios(String ruta)
     * Precondiciones: El fichero (ruta) debe existir
     * Entrada: - String ruta //Es la ruta donde se encuentra el fichero antiguo
     * Salida: int error //El codigo de error para mostrar un mensaje
     * E/S: No hay
     * Postcondiciones: Asociado al nombre. El codigo de error necesario para mostrar un mensaje (0 correcto y 3 camareros eliminados)
     */
    
    public int guardarCambios(String ruta) {
    	int error = -1;
        System.out.println("En resguado");
        
        return error;
    }

}
