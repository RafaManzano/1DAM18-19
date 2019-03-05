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
            if(array[i] == null) {
                System.out.println(i + 1 +  ". VACIO");
            }
            else{
                System.out.println(i + 1 +". " + array[i].toString());
            }
        }
    }

    /*
    Interfaz
    Nombre: arrayConPistas
    Comentario: Este subprograma introduce datos en el array de pistas. Los datos son cargados por el sistema
    Cabecera: public void arrayConPistas(PistaImp[] array)
    Precondiciones: No hay
    Entrada: No hay
    Salida: int error
    E/S: SocioImp[] array
    Postcondiciones: Asociado al nombre. El codigo de error es 0 si es correcto y el array queda con pistas introducidos por defecto
    */

    public int arrayConPistas (PistaImp[] array) {
        int error = 0;
        SocioImp p1 = new SocioImp("Gutierrrez Alvarez", "Ricarda", 15, 60, 'F');
        SocioImp p2 = new SocioImp("Lozano Cantizano", "Jose Ricardo", 70, 27, 'M');
        SocioImp p3 = new SocioImp("Detarno Echeverria", "Javier", 30, 30, 'M');
        SocioImp p4 = new SocioImp("Rodriguez Sola", "Maria", 50, 74, 'F');
        array[0] = new PistaImp(1, p1, 13, false);
        array[1] = new PistaImp(2, p2, 15, false);
        array[2] = new PistaImp(3, p3, 20, false);
        array[3] = new PistaImp(4, p4, 21, false);
        return error;
    }

    /*
    Interfaz
    Nombre: introducirPista
    Comentario: Este subprograma introduce una pista en el array
    Cabecera: public int introducirPista (PistaImp[] array, PistaImp pista)
    Precondiciones: No hay
    Entrada: - La pista ha introducir en el array
    Salida: No hay
    E/S: - PistaImp[] array //Es el array con las pistas del club
    Postcondiciones: Asociado al nombre. El array de pistas queda modificado con la nueva pista y el codigo de error:
                                         - 0 Correcto
                                         - 1 Array lleno

    */

    public int introducirPista(PistaImp[] array, PistaImp pista) {
        boolean encontrado = false;
        int error = 0;
        for(int i = 0; i < array.length && encontrado == false; i++) {
            if(array[i] == null) {
                array[i] = pista;
                encontrado = true;
            }
        }

        if(encontrado == false) {
            error = 1;
        }

        return error;
    }

    /*
    Interfaz
    Nombre: borrarPista
    Comentario: Este subprograma introduce un socio en el array
    Cabecera: public int borrarPista(PistaImp[] array, int posicion)
    Precondiciones: No hay
    Entrada: - La posicion donde se encuentra la pista que se quiere eliminar
    Salida: int error
    E/S: - PistaImp[] array //Es el array con las pistas del club
    Postcondiciones: El array de socios queda modificado borrando la pistay se devuleve un numero que controla el error:
                        - 0 Correcto
                        - 2 Socio no borrado porque no habia ninguna pista
    */

    public int borrarPista (PistaImp[] array, int posicion) {
        int error = 2;
        if(array[posicion - 1] != null) {
            array[posicion - 1] = null;
            error = 0;
        }

        return error;
    }

    /*
    Interfaz
    Nombre: estaVacio
    Comentario: Este subprograma comprueba si el array esta vacio completamente
    Cabecera: public boolean estaVacio(PistaImp[] array)
    Precondiciones: No hay
    Entrada: PistaImp[] array
    Salida: boolean vacio
    E/S: No hay
    Postcondiciones: Asociado al nombre. True si el array esta completamente vacio y false si no lo esta
    */

    public boolean estaVacio(PistaImp[] array) {
        boolean vacio = false;
        for(int i = 0; i < array.length && vacio == false; i++) {
            if(array[i] != null) {
                vacio = true;
            }
        }
        return vacio;
    }

    /*
    Interfaz
    Nombre: estaCompleto
    Comentario: Este subprograma comprueba si el array esta completo
    Cabecera: public boolean estaCompleto(PistaImp[] array)
    Precondiciones: No hay
    Entrada: PistaImp[] array
    Salida: boolean vacio
    E/S: No hay
    Postcondiciones: Asociado al nombre. True si el array esta completo y false si no lo esta
    */

    public boolean estaCompleto(PistaImp[] array) {
        boolean completo = true;
        for(int i = 0; i < array.length && completo == true; i++) {
            if(array[i] == null) {
                completo = false;
            }
        }
        return completo;
    }
}
