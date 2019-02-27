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
            System.out.println(array[i].toString());
        }
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
        array[0] = new SocioImp("Gutierrrez Alvarez", "Ricarda", 15, 60, 'F');
        array[1] = new SocioImp("Lozano Cantizano", "Jose Ricardo", 70, 27, 'M');
        array[2] = new SocioImp("Detarno Echeverria", "Javier", 30, 30, 'M');
        array[3] = new SocioImp("Rodriguez Sola", "Maria", 50, 74, 'F');
        //apellidos, nombre, cuota, edad, genero
        return array;
    }

}
