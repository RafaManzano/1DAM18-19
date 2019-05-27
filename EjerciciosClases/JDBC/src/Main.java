import Conexiones.conexionesBaseDatos;

import java.sql.*;

public class Main {

    public static void main(String[] args) {

        Connection conexion = null;
        Statement sentencia = null;
        ResultSet resultado = null;
        String consulta = "SELECT ID, Nombre FROM Clientes";
        conexionesBaseDatos conexiones = new conexionesBaseDatos();

        conexion = conexiones.iniciarConexion();
        sentencia = conexiones.crearSentencia(conexion);
        resultado = conexiones.usarSentencia(sentencia, consulta);

        try {
            while (resultado.next())	// Recorremos el ResultSet
                System.out.println("ID: " + resultado.getShort("ID") + ", Nombre: " + resultado.getString("Nombre"));
        }
        catch(SQLException err) {
            err.printStackTrace();
        }
        finally {
            conexiones.cerrarTodo(sentencia,resultado,conexion);
        }




    }
}
