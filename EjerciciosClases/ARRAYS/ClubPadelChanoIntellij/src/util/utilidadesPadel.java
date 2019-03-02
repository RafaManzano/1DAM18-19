package util;

public class utilidadesPadel {
    /*
    Interfaz
    Nombre: casoError
    Comentario: Este subprograma comunicara al usuario los casos de error de los demas subprogramas
    Cabecera: public void casoError(int error)
    Precondiciones: No hay
    Entrada: int error //Sera la salida de otros subprogramas para realizar el caso error
    Salida: No hay
    E/S: No hay
    Postcondiciones: Devuelve el caso de error que sea en la salida.
                     0. Si se ha realizado correctamente
                     1. Ha habido algun problema
    */

    public void casoError(int error) {
        if(error == 0)  {
            System.out.println("Se ha realizado correctamente");
        }
        else {
            System.out.println("Ha ocurrido algun fallo, no se realiza nada");
        }
    }
}
