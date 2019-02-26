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
    Cabecera: public PistaImp[] arrayConSocios(PistaImp[] array)
    Precondiciones: No hay
    Entrada: No hay
    Salida: No hay
    E/S: SocioImp[] array
    Postcondiciones: El array queda con pistas introducidos por defecto
    */

    public PistaImp[] arrayConSocios (PistaImp[] array) {
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
}
