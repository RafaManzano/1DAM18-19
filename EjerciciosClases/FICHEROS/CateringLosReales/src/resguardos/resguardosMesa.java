package resguardos;

import clases.MesaImp;


public class resguardosMesa {
    /*
    Interfaz
    Nombre: introducirMesa
    Comentario: Este subprograma añade una nueva mesa al fichero
    Cabecera: public void introducirMesa(String ruta, MesaImp mesa)
    Precondiciones: No hay
    Entrada: - String ruta //Es la ruta donde esta el fichero
             - MesaImp mesa //Es la mesa ha introducir en el fichero
    Salida: No hay
    E/S: No hay
    Postcondiciones: La mesa quedaria introducido en el fichero
    */
    public void introducirMesa(String ruta, MesaImp mesa) {
        System.out.println("En resguardo");
    }

    /*
    Interfaz
    Nombre: buscarMesa
    Comentario: Busca en el fichero la mesa pasada por parametro
    Cabecera: public void buscarMesa(String ruta, MesaImp mesa)
    Precondiciones: El fichero debe estar creado
    Entrada: - String ruta //Es la ruta donde esta el fichero
             - MesaImp mesa //Es la mesa ha buscar en el fichero
    Salida: No hay
    E/S: No hay
    Postcondiciones: Mensaje de confirmacion
    */

    public void buscarMesa(String ruta, MesaImp mesa) {
        System.out.println("En resguardo");
    }

    /*
    Interfaz
    Nombre: eliminarMesa
    Comentario: Elimina la mesa pasada por parametro
    Cabecera: public void eliminarMesa(String ruta, String mesa)
    Precondiciones: El fichero debe estar creado
    Entrada: - String ruta //Es la ruta donde esta el fichero
             - String mesa //Es la mesa que se ha buscado en el fichero //Es un String porque se ha buscado con anterioridad
    Salida: No hay
    E/S: No hay
    Postcondiciones: Mensaje de confirmacion
    */

    //Este metodo esta erroneo
    public void eliminarMesa(String ruta, String mesa) {
        System.out.println("En resguardo");
    }
}
