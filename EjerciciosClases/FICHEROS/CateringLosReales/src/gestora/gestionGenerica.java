package gestora;

import clases.MesaImp;
import enumeraciones.EnumTurno;
import sun.management.snmp.jvmmib.EnumJvmJITCompilerTimeMonitoring;

import java.io.*;

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
        } catch (IOException err) {
            err.printStackTrace();
        }
    }

     /*
    Interfaz
    Nombre: eliminar
    Comentario: Busca en el fichero el objeto pasado por parametro y lo elimina (por marca)
    Cabecera: public <T> void eliminar(String ruta, T objeto)
    Precondiciones: El fichero debe estar creado
    Entrada: - String ruta //Es la ruta donde esta el fichero
             - T objeto //Es el objeto que buscamos para eliminar por marca
    Salida: No hay
    E/S: No hay
    Postcondiciones: Mensaje de confirmacion
    */

    public <T> void eliminar(String ruta, T objeto) {
        try {
            BufferedReader br = new BufferedReader(new FileReader(ruta));
            //RandomAccessFile rrw = new RandomAccessFile(ruta, "rw")
            br.mark(0);
            br.reset();
            String linea;
            int posicion = 0;

            while ((linea = br.readLine()) != null) {
                //for(int contador = 0; (linea = br.readLine()) != null; contador++) {
                if (linea.equals(objeto.toString())) {
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
    Entrada: - String ruta //La ruta del fichero debe ser correcta
             - int posicion //La posicion donde se encuentra el registro a eliminar
    Salida: No hay
    E/S: No hay
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
        } catch (IOException err) {
            err.printStackTrace();
        }
    }

    /*
    Interfaz
    Nombre: stringEnBytes
    Comentario: Este subprograma convierte una cadena en bytes
    Cabecera: public int stringEnBytes(String cadena)
    Precondiciones: No hay
    Entrada: - Srting cadena //Es la cadena de la que se desea saber los bytes
    Salida: - int bytes //La cantidad de byes que tiene la cadena
    E/S: No hay
    Postcondiciones: Asociado al nombre, la cantidad de bytes que ocupa la cadena


    public int stringEnBytes(String cadena) {
        int tamanho;

        tamanho = cadena.length();

        return tamanho;
    }

    /*
    Interfaz
    Nombre: recogerObjeto
    Comentario: Este subprograma recoge de un fichero de texto un objeto
    Cabecera: public <> T recogerObjeto(String ruta, int decision)
    Precondiciones: El fichero debe estar creado
    Entrada: - Srting ruta //La ruta donde se encuentra el fichero
             - int decision //La id del objeto que se desea recuperar
    Salida: <> T objeto //El objeto recuperado
    E/S: No hay
    Postcondiciones: Asociado al nombre, el objeto que se recupera
    */

    /*
    public <T> T recogerObjeto(String ruta, int decision) {
        T objeto;
        try {
            BufferedReader br = new BufferedReader(new FileReader(ruta));
            String linea;
            String[] array;
            String decide = decision + "./";
            int id;
            String nombre;
            String apellidos;
            EnumTurno turno;
            MesaImp[] mesas = new MesaImp[4];
            MesaImp m1 = new MesaImp();
            MesaImp m2 = new MesaImp();
            MesaImp m3 = new MesaImp();
            MesaImp m4 = new MesaImp();



            while ((linea = br.readLine()) != null) {
                //for(int contador = 0; (linea = br.readLine()) != null; contador++) {
                if (linea.equals(decide)) {
                    //Coger la marca
                    array = linea.split(",");
                    id = Integer.parseInt(array[0]);
                    nombre = array[1];
                    apellidos = array[2];
                    turno = EnumTurno.valueOf(array[3]);
                    m1.setID(Integer.parseInt(array[4]));
                    m2.setID(Integer.parseInt(array[5]));
                    m3.setID(Integer.parseInt(array[6]));
                    m4.setID(Integer.parseInt(array[7]));
                    mesas = {m1, m2, m3, m4};
                    objeto = new T(id, nombre, apellidos, turno, mesas);

                }

            }
            br.close();

        }
        catch(FileNotFoundException err) {
            err.printStackTrace();
        }
        catch (IOException err) {
            err.printStackTrace();
        }

    }
    */
}
