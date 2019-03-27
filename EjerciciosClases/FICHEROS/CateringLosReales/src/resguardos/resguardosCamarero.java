package resguardos;

import clases.CamareroImp;

public class resguardosCamarero {
    /*
    Interfaz
    Nombre: introducirCamarero
    Comentario: Este subprograma añade un nuevo camarero al fichero
    Cabecera: public void introducirCamarero(String ruta, CamareroImp camarero)
    Precondiciones: No hay
    Entrada: - String ruta //Es la ruta donde esta el fichero
             - CamareroImp camarero //Es el trabajador ha introducir en el fichero
    Salida: No hay
    E/S: No hay
    Postcondiciones: El camarero quedaria introducido en el fichero
    */
    public void introducirCamarero(String ruta, CamareroImp camarero) {
        System.out.println("En resguardo");
    }

    /*
    Interfaz
    Nombre: buscarCamarero
    Comentario: Busca en el fichero el camarero pasado por parametro
    Cabecera: public void buscarCamarero(String ruta, CamareroImp camarero)
    Precondiciones: El fichero debe estar creado
    Entrada: - String ruta //Es la ruta donde esta el fichero
             - CamareroImp camarero //Es el trabajador ha buscar en el fichero
    Salida: No hay
    E/S: No hay
    Postcondiciones: Mensaje de confirmacion
    */

    public void buscarCamarero(String ruta, CamareroImp camarero) {
        System.out.println("En resguardo");
    }

    /*
    Interfaz
    Nombre: eliminarCamarero
    Comentario: Elimina el camarero pasado por parametro
    Cabecera: public void eliminarCamarero(String ruta, String camarero)
    Precondiciones: El fichero debe estar creado
    Entrada: - String ruta //Es la ruta donde esta el fichero
             - String camarero //Es el trabajador ha buscar en el fichero //Es un String porque se ha buscado con anterioridad
    Salida: No hay
    E/S: No hay
    Postcondiciones: Mensaje de confirmacion
    */

    public void eliminarCamarero(String ruta, String camarero) {
        System.out.println("En resguardo");
    }
}
