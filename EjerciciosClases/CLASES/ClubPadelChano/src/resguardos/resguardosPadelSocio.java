package resguardos;

import clases.PistaImp;
import clases.SocioImp;

public class resguardosPadelSocio {
    /*
    Interfaz
    Nombre: generarArraySocios
    Comentario: Este subprograma genera un array cargado sin valores
    Cabecera: public SocioImp[] generarArraySocios ()
    Precondiciones: No hay
    Entrada: No hay
    Salida: SocioImp array //Es un array de 10
    E/S: No hay
    Postcondiciones: Asociado al nombre, el array de socios de tamanho 10
    */

    public SocioImp[] generarArraySocios() {
        SocioImp[] array = new SocioImp[10];

        System.out.println("En resguardo");

        return array;
    }

    /*
    Interfaz
    Nombre: pintarArraySocios
    Comentario: Este subprograma pinta array de socios
    Cabecera: public void pintarArraySocios (SocioImp[] array)
    Precondiciones: No hay
    Entrada: SocioImp array //El array ha pintar
    Salida: No hay
    E/S: No hay
    Postcondiciones: Solo pinta en pantalla
    */

    public void pintarArraySocios(SocioImp[] array) {

        System.out.println("En resguardo");
    }

    /*
    Interfaz
    Nombre: arrayConSocios
    Comentario: Este subprograma introduce datos en el array de socios. Los datos son cargados por el sistema
    Cabecera: public SocioImp[] arrayConSocios(SocioImp[] array)
    Precondiciones: No hay
    Entrada: No hay
    Salida: No hay
    E/S: SocioImp[] array
    Postcondiciones: El array queda con socios introducidos por defecto
    */

    public SocioImp[] arrayConSocios (SocioImp[] array) {
        System.out.println("En resguardo");
        return array;
    }
}
