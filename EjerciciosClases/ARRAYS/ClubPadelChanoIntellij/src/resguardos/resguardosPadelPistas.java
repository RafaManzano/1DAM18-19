package resguardos;

import clases.PistaImp;

public class resguardosPadelPistas {

    /*
    Interfaz
    Nombre: generarArrayPistas
    Comentario: Este subprograma genera un array cargado sin valores
    Cabecera: public PistaImp[] generarArrayPistas ()
    Precondiciones: No hay
    Entrada: No hay
    Salida: SocioImp array //Es un array de 10
    E/S: No hay
    Postcondiciones: Asociado al nombre, el array de socios de tamanho 10
    */

    public PistaImp[] generarArrayPistas() {
        PistaImp[] array = new PistaImp[10];
        System.out.println("En resguardo");
        return array;
    }

    /*
    Interfaz
    Nombre: pintarArrayPista
    Comentario: Este subprograma pinta array de pistas
    Cabecera: public void pintarArrayPistas (PistaImp[] array)
    Precondiciones: No hay
    Entrada: PistaImp array //El array ha pintar
    Salida: No hay
    E/S: No hay
    Postcondiciones: Solo pinta en pantalla
    */

    public void pintarArrayPista(PistaImp[] array) {

        System.out.println("En resguardo");
    }

    /*
    Interfaz
    Nombre: arrayConPistas
    Comentario: Este subprograma introduce datos en el array de pistas. Los datos son cargados por el sistema
    Cabecera: public PistaImp[] arrayConSocios(PistaImp[] array)
    Precondiciones: No hay
    Entrada: No hay
    Salida: No hay
    E/S: SocioImp[] array
    Postcondiciones: El array queda con pistas introducidos por defecto
    */

    public PistaImp[] arrayConPistas (PistaImp[] array) {
        System.out.println("En resguardo");
        return array;
    }

         /*
    Interfaz
    Nombre: introducirPista
    Comentario: Este subprograma introduce una pista en el array
    Cabecera: public void introducirPista (PistaImp[] array, PistaImp pista)
    Precondiciones: - La pista tiene que estar correcta
                    - El array de pistas no tiene que estar lleno //Modificar para poner los errores
    Entrada: - La pista ha introducir en el array
    Salida: No hay
    E/S: - PistaImp[] array //Es el array con las pistas del club
    Postcondiciones: El array de pistas queda modificado con la nueva pista
    */

    public void introducirPista(PistaImp[] array, PistaImp pista) {
       System.out.println("En resguardo");
    }

    /*
    Interfaz
    Nombre: borrarPista
    Comentario: Este subprograma introduce un socio en el array
    Cabecera: public int borrarPista(SocioImp[] array, int posicion)
    Precondiciones: - El array de pistas no tiene que estar lleno //Modificar para poner los errores
    Entrada: - La posicion donde se encuentra la pista que se quiere eliminar
    Salida: No hay //Todavia No: int error
    E/S: - PistaImp[] array //Es el array con las pistas del club
    Postcondiciones: El array de socios queda modificado borrando la pista, //Todavia no: se devuleve un numero que controla el error
    */

    public void borrarPista (PistaImp[] array, int posicion) {
        System.out.println("En resguardo");
    }
}
