package gestora;

import clases.TrabajadorImp;

import java.io.*;

public class gestoraTrabajadores {
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
        try {
            BufferedWriter bw = new BufferedWriter(new FileWriter(ruta, true));
            bw.newLine();
            bw.write("99, MariCarmen, Osuna, 20, F");
            bw.newLine();
            bw.write("98, Joss, Osuna, 18, M");
            bw.newLine();
            bw.write("97, Luisa, Gavira, 50, F");
            bw.newLine();
            bw.write("97, Mari, Rodriguez, 40, F");

            //Guardamos los cambios del fichero
            bw.flush();
            //Se cierra el fichero
            bw.close();
        }
        catch(IOException err) {
            err.printStackTrace();
        }
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
        try {
            String cadena;
            BufferedReader br = new BufferedReader(new FileReader(ruta));
            while((cadena = br.readLine()) != null) {
                System.out.println(cadena);
            }
            //Se cierra el fichero
            br.close();
        }
        catch(FileNotFoundException err) {
            err.printStackTrace();
        }
        catch(IOException err) {
            err.printStackTrace();
        }
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
        try {
            BufferedWriter bw = new BufferedWriter(new FileWriter(ruta, true));
            bw.write(trabajador.toString());
            bw.newLine();

            //Guardamos los cambios del fichero
            bw.flush();
            //Se cierra el fichero
            bw.close();
        }
        catch(IOException err) {
            err.printStackTrace();
        }
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
        try {
            BufferedWriter bw = new BufferedWriter(new FileWriter(ruta, true));
            BufferedReader br = new BufferedReader(new FileReader(ruta));
            if(trabajador.toString() == br.readLine()) {
                bw.write("0");
                bw.newLine();
            }
            //Guardamos los cambios del fichero
            bw.flush();

            //Se cierra el fichero
            bw.close();
        }
        catch(IOException err) {
            err.printStackTrace();
        }
    }

    /*
    Interfaz
    Nombre: borrarFichero
    Comentario: Este subprograma borra el fichero completo
    Cabecera: public void borrarFichero (File fichero) {
    Precondiciones: No hay
    Entrada: File fichero // El fichero que se desea borrar
    Salida: No hay
    E/S: No hay
    Postcondiciones: Muestra un mensaje controlado el error
    */

    public void eliminarFichero(File fichero) {

        if (fichero.exists() == false) {
            System.out.println("El fichero no existe");
        } else {
            fichero.delete();
            System.out.println("El fichero fue eliminado.");
        }

    }
}
