package Main;

import java.io.*;

/*
http://puntocomnoesunlenguaje.blogspot.com/2013/06/java-ficheros-acceso-aleatorio.html
 */
public class Main {

    public static void main(String[] args) {

        File f = new File("personas.txt");
        try {
            RandomAccessFile fichero = new RandomAccessFile(f, "rw");

            //Indica la posicion a la que debe irse el puntero
            fichero.seek(0);

            //Devuelve donde se encuentra el puntero
            System.out.println(fichero.getFilePointer());

            //Avanza el numero de bytes introducidos por parametros
            fichero.skipBytes(50);
        }
        catch(FileNotFoundException err) {
            err.printStackTrace();
        }
        catch(IOException err) {
            err.printStackTrace();
        }


    }
}
