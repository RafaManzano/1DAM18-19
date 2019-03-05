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

        for(int i = 0; i < array.length; i++) {
            array[i] = new SocioImp();
        }

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
            if(array[i].getNombre() == "NoDefinido") {
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
    Cabecera: public void arrayConSocios(SocioImp[] array)
    Precondiciones: No hay
    Entrada: No hay
    Salida: No hay
    E/S: SocioImp[] array
    Postcondiciones: El array queda con socios introducidos por defecto
    */

    public void arrayConSocios (SocioImp[] array) {
        array[0] = new SocioImp("Gutierrrez Alvarez", "Ricarda", 15, 60, 'F');
        array[1] = new SocioImp("Lozano Cantizano", "Jose Ricardo", 70, 27, 'M');
        array[2] = new SocioImp("Detarno Echeverria", "Javier", 30, 30, 'M');
        array[3] = new SocioImp("Rodriguez Sola", "Maria", 50, 74, 'F');
        //apellidos, nombre, cuota, edad, genero
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
        boolean encontrado = false;
        for(int i = 0; i < array.length && encontrado == false; i++) {
            if(array[i].getNombre() == "NoDefinido") {
                array[i] = socio;
                encontrado = true;
            }
        }
    }

    /*
    Interfaz
    Nombre: borrarSocio
    Comentario: Este subprograma introduce un socio en el array
    Cabecera: public int borrarSocio (SocioImp[] array, int posicion)
    Precondiciones: - El array de socio no tiene que estar lleno //Modificar para poner los errores
    Entrada: - La posicion donde se encuentra el socio que se quiere eliminar
    Salida: No hay //Todavia No: int error
    E/S: - SocioImp[] array //Es el array con los socios del club
    Postcondiciones: El array de socios queda modificado borrando el socio, //Todavia no: se devuleve un numero que controla el error
    */

    public void borrarSocio(SocioImp[] array, int posicion) {
        //int error = 1;
        array[posicion - 1] = new SocioImp();
       //return error;
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
        for(int i = 0; i < array.length; i++) {
            if(array[i].getNombre() != "NoDefinido") {
                vacio = true;
            }
        }
        return vacio;
    }

}
