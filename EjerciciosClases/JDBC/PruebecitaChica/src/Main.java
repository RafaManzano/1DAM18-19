import Conexiones.conexionesBaseDatos;

import java.sql.*;

public class Main {

    public static void main(String[] args) {

        Connection conexion = null;
        Statement sentencia = null;
        ResultSet resultado = null;
        String consulta = "SELECT ID, Palabra FROM Palabras";
        conexionesBaseDatos conexiones = new conexionesBaseDatos();

        conexion = conexiones.iniciarConexion();
        sentencia = conexiones.crearSentencia(conexion);
        resultado = conexiones.usarSentencia(sentencia, consulta);

        try {
            while (resultado.next()) {
                System.out.println("ID: " + resultado.getShort("ID") + ", Palabra: " + resultado.getString("Palabra"));
            }

        }
        catch(SQLException err) {
            err.printStackTrace();
        }
        finally {
            conexiones.cerrarTodo(sentencia,resultado,conexion);
        }




    }
}
