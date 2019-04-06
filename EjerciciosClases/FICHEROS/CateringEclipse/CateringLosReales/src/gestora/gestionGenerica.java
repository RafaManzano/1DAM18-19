package gestora;

import java.io.*;

import enumeraciones.EnumTurno;

public class gestionGenerica {
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
        try {
            BufferedWriter bw = new BufferedWriter(new FileWriter(ruta, true));
            bw.write(objeto.toString());
            bw.newLine();
            bw.flush();
            bw.close();
        } 
        catch (IOException err) {
            err.printStackTrace();
        }
    }

    /*
    Interfaz
    Nombre: eliminar
    Comentario: Busca en el fichero la id del objeto pasado por parametro y lo elimina (por marca)
    Cabecera: publicvoid eliminar(String ruta, int id)
    Precondiciones: El fichero debe estar creado
    Entrada: - int id //Es la id del objeto para su posterior eliminacion
    Salida: No hay
    E/S: - String ruta //Es la ruta donde esta el fichero
    Postcondiciones: Mensaje de confirmacion
    */

    public void eliminar(String ruta, int id) {
        try {
            BufferedReader br = new BufferedReader(new FileReader(ruta));
            //RandomAccessFile rrw = new RandomAccessFile(ruta, "rw")
            br.mark(0);
            br.reset();
            String linea;
            int posicion = 0;
            String ids = id + ".*";

            while ((linea = br.readLine()) != null) {
                //for(int contador = 0; (linea = br.readLine()) != null; contador++) {
                if (linea.matches(ids)) {
                    //Coger la marca
                    //System.out.println("Esta eliminado Hulio");
                    eliminarRegistro(ruta, posicion);
                }
                posicion += linea.length() + 2;
            }
            br.close();
        }
        catch (IOException err) {
            err.printStackTrace();
        }
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
        try {
            RandomAccessFile rrw = new RandomAccessFile(ruta, "rw");
            //System.out.println(linea);
            //System.out.println(rrw.getFilePointer());
            rrw.skipBytes(posicion);
            rrw.writeChar('*');
            rrw.close();
        }
        catch (FileNotFoundException err) {
            err.printStackTrace();
        }
        catch (IOException err) {
            err.printStackTrace();
        }
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
        try {
            BufferedReader br = new BufferedReader(new FileReader(ruta));
            String linea;

            while ((linea = br.readLine()) != null) {
                System.out.println(linea);
            }
            br.close();
        } 
        catch (IOException err) {
            err.printStackTrace();
        }
    }
    
    /*
    Interfaz
    Nombre: mostrarTurno
    Comentario: Este subprograma muestra una lista con los camareros que trabajan en ese turno
    Cabecera: public void mostrarTurno(String ruta, EnumTurno turno)
    Precondiciones: El fichero (ruta) debe existir
    Entrada: - String ruta //Es la ruta donde se encuentra el fichero
             - EnumTurno turno //Es el turno que se debe mostrar
    Salida: No hay
    E/S: No hay
    Postcondiciones: Solo muestra en pantalla los camareros que trabajan en ese turno
    */

    public void mostrarTurno(String ruta, EnumTurno turno) {
        String turnoString = ".*" + turno.toString() + ".*";
        String linea;
        try {
            BufferedReader br = new BufferedReader(new FileReader(ruta));

            while((linea = br.readLine()) != null) {
                if(linea.matches(turnoString) == true) {
                    System.out.println(linea);
                }
            }
        }
        catch(FileNotFoundException err) {
            err.printStackTrace();
        }
        catch(IOException err) {
            err.printStackTrace();
        }
    }
}
