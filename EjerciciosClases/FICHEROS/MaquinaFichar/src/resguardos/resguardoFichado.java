package resguardos;

import clases.TrabajadorImp;

import java.io.*;

public class resguardoFichado {
    /*
    Interfaz
    Nombre: trabajadoresPorDefecto
    Comentario: Este subprograma carga por defecto en el fichero
    Cabecera: public void trabajadoresPorDefecto(String ruta)
    Precondiciones: El fichero debe estar creado
    Entrada: String ruta //La ruta del fichero donde esta creado
    Salida: No hay
    E/S: No hay
    Postcondiciones: El fichero queda escrito con los trabajadores por defecto
    */

    public void trabajadoresPorDefecto(String ruta) {
        System.out.println("En resguardo");
    }

    /*
    Interfaz
    Nombre: mostrarFichero
    Comentario: Este subprograma muestra el fichero completo
    Cabecera: public void mostarFichero(String ruta)
    Precondiciones: El fichero debe estar creado
    Entrada: String ruta //La ruta del fichero donde esta creado
    Salida: No hay
    E/S: No hay
    Postcondiciones: Muestra por pantalla todos los registros del fichero
    */

    public void mostrarFichero(String ruta) {
        System.out.println("En resguardo");
    }

    /*
    Interfaz
    Nombre: introducirTrabajador
    Comentario: Este subprograma introduce en el fichero un nuevo trabajador
    Cabecera: public void introducirTrabajador(String ruta, TrabajadorImp trabajador)
    Precondiciones: No hay
    Entrada: -String ruta //La ruta del fichero donde esta creado
             - TrabajadorImp trabajador //El trabajador ha introducir
    Salida: No hay
    E/S: No hay
    Postcondiciones: El fichero queda escrito con el trabajador introducido por parametro
    */

    public void introducirTrabajador(String ruta, TrabajadorImp trabajador) {
        System.out.println("En resguardo");
    }

    /*
    Interfaz
    Nombre: borrarTrabajador
    Comentario: Este subprograma elimina al trabajador que desees
    Cabecera: public void borrarTrabajador(String ruta, int id)
    Precondiciones: No hay
    Entrada: -String ruta //La ruta del fichero donde esta creado
             - TrabajadorImp trabajador //El trabajador ha eliminar
    Salida: No hay
    E/S: No hay
    Postcondiciones: El trabajador queda eliminado del fichero
    */

    //Este metodo no esta correcto solo veria la primera linea asi que habria que saber como recorrer
    public void borrarTrabajador(String ruta, TrabajadorImp trabajador) {
        System.out.println("En resguardo");
    }

    /*
    Interfaz
    Nombre: borrarFichero
    Comentario: Este subprograma borra el fichero completo
    Cabecera: public void borrarFichero (String ruta) {
    Precondiciones: No hay
    Entrada: String ruta //La ruta donde esta el fichero cual se desea borrar
    Salida: No hay
    E/S: No hay
    Postcondiciones: Muestra un mensaje controlado el error
    */

    public void borrarFichero(String ruta) {
        System.out.println("En resguardo");
    }
}
