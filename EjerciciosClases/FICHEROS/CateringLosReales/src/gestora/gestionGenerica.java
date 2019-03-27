package gestora;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class gestionGenerica {
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
        try {
            BufferedWriter bw = new BufferedWriter(new FileWriter(ruta, true));
            bw.write(objeto.toString());
            bw.newLine();
            bw.flush();
            bw.close();
        }
        catch(IOException err) {
            err.printStackTrace();
        }
    }
}
