package gestora;

import clases.PistaImp;
import clases.SocioImp;

public class gestoraPadelPista {
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
        for(int i = 0; i < array.length; i++) {
            System.out.println(array[i].toString());
        }
    }

    /*
    Interfaz
    Nombre: arrayConPistas
    Comentario: Este subprograma introduce datos en el array de pistas. Los datos son cargados por el sistema
    Cabecera: public PistaImp[] arrayConPistas(PistaImp[] array)
    Precondiciones: No hay
    Entrada: No hay
    Salida: No hay
    E/S: SocioImp[] array
    Postcondiciones: El array queda con pistas introducidos por defecto
    */

    public PistaImp[] arrayConPistas (PistaImp[] array) {
        SocioImp p1 = new SocioImp("Gutierrrez Alvarez", "Ricarda", 15, 60, 'F');
        SocioImp p2 = new SocioImp("Lozano Cantizano", "Jose Ricardo", 70, 27, 'M');
        SocioImp p3 = new SocioImp("Detarno Echeverria", "Javier", 30, 30, 'M');
        SocioImp p4 = new SocioImp("Rodriguez Sola", "Maria", 50, 74, 'F');
        array[0] = new PistaImp(1, p1, 13, false);
        array[0] = new PistaImp(2, p2, 15, false);
        array[0] = new PistaImp(3, p3, 20, false);
        array[0] = new PistaImp(4, p4, 21, false);
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
        boolean encontrado = false;
        for(int i = 0; i < array.length && encontrado == false; i++) {
            if(array[i] == null) {
                array[i] = pista;
                encontrado = true;
            }
        }
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
        //int error = 1;
        array[posicion - 1] = new PistaImp();
        //return error;
    }
}
