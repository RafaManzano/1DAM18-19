package gestora;

import java.io.IOException;
import java.io.RandomAccessFile;

public class gestora {

    public String leerFichero(String ruta, int posicion) {
        String linea = "";

        try {
            RandomAccessFile fichero = new RandomAccessFile(ruta, "r");
            fichero.seek(posicion);
            linea = fichero.readLine();
            fichero.close();
        } catch (IOException err) {
            err.printStackTrace();
        }

        return linea;

    }

    public void escribirFichero(String ruta, String texto, int posicion) {
        try {
            RandomAccessFile archivo = new RandomAccessFile(ruta, "rw");
            archivo.skipBytes(posicion);
            archivo.writeUTF(texto);
            archivo.close();
        } catch (IOException err) {
            err.printStackTrace();
        }
    }

    public void marcado(String ruta, int posicion) {
        try {
            RandomAccessFile archivo = new RandomAccessFile(ruta, "rw");
            archivo.skipBytes(posicion);
            archivo.writeChar('*');
            archivo.close();
        } catch (IOException err) {
            err.printStackTrace();
        }
    }
}
