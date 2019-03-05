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
    Cabecera: public void arrayConSocios(SocioImp[] array)
    Precondiciones: No hay
    Entrada: No hay
    Salida: No hay
    E/S: SocioImp[] array
    Postcondiciones: El array queda con socios introducidos por defecto
    */

    public void arrayConSocios (SocioImp[] array) {
        System.out.println("En resguardo");
    }

    /*
    Interfaz
    Nombre: introducirSocio
    Comentario: Este subprograma introduce un socio en el array
    Cabecera: public void introducirSocio (SocioImp[] array, SocioImp socio)
    Precondiciones: - El socio tiene que estar correcto
                    - El array de socio no tiene que estar lleno //Modificar para poner los errores
    Entrada: - El socio ha introducir en el array
    Salida: No hay
    E/S: - SocioImp[] array //Es el array con los socios del club
    Postcondiciones: El array de socios queda modificado con el nuevo socio
    */

    public void introducirSocio(SocioImp[] array, SocioImp socio) {
        System.out.println("En resguardo");
    }

    /*
    Interfaz
    Nombre: borrarSocio
    Comentario: Este subprograma introduce un socio en el array
    Cabecera: public void borrarSocio (SocioImp[] array, int posicion)
    Precondiciones: - El array de socio no tiene que estar lleno //Modificar para poner los errores
    Entrada: - La posicion donde se encuentra el socio que se quiere eliminar
    Salida: No hay
    E/S: - SocioImp[] array //Es el array con los socios del club
    Postcondiciones: El array de socios queda modificado borrando el socio
    */

    public void borrarSocio(SocioImp[] array, int posicion) {
        System.out.println("En resguardo");
    }

    /*
    Interfaz
    Nombre: estaCompleto
    Comentario: Este subprograma comprueba si el array esta completo
    Cabecera: public boolean estaCompleto(SocioImp[] array)
    Precondiciones: No hay
    Entrada: SocioImp[] array
    Salida: boolean vacio
    E/S: No hay
    Postcondiciones: Asociado al nombre. True si el array esta completo y false si no lo esta
    */

    public boolean estaCompleto(SocioImp[] array) {
        System.out.println("En resguardo");
        return false;
    }
}
