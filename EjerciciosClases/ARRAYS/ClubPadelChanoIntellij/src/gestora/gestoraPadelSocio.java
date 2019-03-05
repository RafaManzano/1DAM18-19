package gestora;

import clases.*;


public class gestoraPadelSocio {

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
    Nombre: arrayConSocios
    Comentario: Este subprograma introduce datos en el array de socios. Los datos son cargados por el sistema
    Cabecera: public int arrayConSocios(SocioImp[] array)
    Precondiciones: No hay
    Entrada: No hay
    Salida: int error
    E/S: SocioImp[] array
    Postcondiciones: Asociado al nombre. El codigo de error es 0 si es correcto y El array queda con socios introducidos por defecto
    */

    public int arrayConSocios (SocioImp[] array) {
        int error = 0;
        array[0] = new SocioImp("Gutierrrez Alvarez", "Ricarda", 15, 60, 'F');
        array[1] = new SocioImp("Lozano Cantizano", "Jose Ricardo", 70, 27, 'M');
        array[2] = new SocioImp("Detarno Echeverria", "Javier", 30, 30, 'M');
        array[3] = new SocioImp("Rodriguez Sola", "Maria", 50, 74, 'F');array[0] = new SocioImp("Gutierrrez Alvarez", "Ricarda", 15, 60, 'F');
        //apellidos, nombre, cuota, edad, genero
        return error;
    }

    /*
    Interfaz
    Nombre: introducirSocio
    Comentario: Este subprograma introduce un socio en el array
    Cabecera: public int introducirSocio (SocioImp[] array, SocioImp socio)
    Precondiciones: No hay
    Entrada: - El socio ha introducir en el array
    Salida: int error
    E/S: - SocioImp[] array //Es el array con los socios del club
    Postcondiciones: Asociado al nombre. El array de socios queda modificado con el nuevo socio y El codigo de error:
                                         - 0 Correcto
                                         - 1 Array lleno

    */

    public int introducirSocio(SocioImp[] array, SocioImp socio) {
        boolean encontrado = false;
        int error = 0;
        for(int i = 0; i < array.length && encontrado == false; i++) {
            if(array[i] == null) {
                array[i] = socio;
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
    Nombre: borrarSocio
    Comentario: Este subprograma introduce un socio en el array
    Cabecera: public int borrarSocio (SocioImp[] array, int posicion)
    Precondiciones: No hay
    Entrada: - La posicion donde se encuentra el socio que se quiere eliminar
    Salida: int error
    E/S: - SocioImp[] array //Es el array con los socios del club
    Postcondiciones: El array de socios queda modificado borrando el socio y se devuleve un numero que controla el error:
                        - 0 Correcto
                        - 2 Socio no borrado porque no habia ningun socio
    */

    public int borrarSocio(SocioImp[] array, int posicion) {
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
    Cabecera: public boolean estaVacio(SocioImp[] array)
    Precondiciones: No hay
    Entrada: SocioImp[] array
    Salida: boolean vacio
    E/S: No hay
    Postcondiciones: Asociado al nombre. False si el array esta completamente vacio y true si no lo esta
    */

    public boolean estaVacio(SocioImp[] array) {
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
    Cabecera: public boolean estaCompleto(SocioImp[] array)
    Precondiciones: No hay
    Entrada: SocioImp[] array
    Salida: boolean vacio
    E/S: No hay
    Postcondiciones: Asociado al nombre. True si el array esta completo y false si no lo esta
    */

    public boolean estaCompleto(SocioImp[] array) {
        boolean completo = true;
        for(int i = 0; i < array.length && completo == true; i++) {
            if(array[i] == null) {
                completo = false;
            }
        }
        return completo;
    }

}
