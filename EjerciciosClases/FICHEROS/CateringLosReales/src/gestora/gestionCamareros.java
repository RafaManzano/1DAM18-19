package gestora;

import clases.CamareroImp;

import java.io.*;

public class gestionCamareros {
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
        try {
            BufferedWriter bw = new BufferedWriter(new FileWriter(ruta, true));
            bw.write(camarero.toString());
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
        try {
            BufferedReader br = new BufferedReader(new FileReader(ruta));
            br.mark(0);
            br.reset();
            String linea;

            while((linea = br.readLine()) != null) {
                if(linea.equals(camarero.toString())) {
                    //Coger la marca
                    //System.out.println("Esta eliminado Hulio");
                    //eliminarCamarero(ruta);
                }
            }
            br.close();
        }
        catch (IOException err) {
            err.printStackTrace();
        }
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

    //Este metodo esta erroneo
    public void eliminarCamarero(String ruta) {
        try {
            BufferedWriter bw = new BufferedWriter(new FileWriter(ruta));
            bw.write("0");
            bw.flush();
            bw.close();
        }
        catch(IOException err) {
            err.printStackTrace();
        }
    }
}
