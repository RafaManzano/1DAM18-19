package gestora;

import clases.MesaImp;

import java.io.*;

public class gestionMesas {
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
        try {
            BufferedWriter bw = new BufferedWriter(new FileWriter(ruta, true));
            bw.write(mesa.toString());
            bw.newLine();
            bw.flush();
            bw.close();
        }
        catch(IOException err) {
            err.printStackTrace();
        }
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
        try {
            BufferedReader br = new BufferedReader(new FileReader(ruta));

            while(br.readLine() != null) {
                if(br.readLine() == mesa.toString()) {
                    //eliminarMesa(String ruta, String mesa)
                }
            }
        }
        catch (IOException err) {
            err.printStackTrace();
        }
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
        try {
            BufferedWriter bw = new BufferedWriter(new FileWriter(ruta));
            bw.write(mesa);
        }
        catch(IOException err) {
            err.printStackTrace();
        }
    }
}
