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

    public PistaImp[] arrayConSocios (PistaImp[] array) {
        System.out.println("En resguardo");
        return array;
    }
}
