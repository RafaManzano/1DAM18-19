package ordenacion;

import clases.SocioImp;

public class metodosOrdenacion {
    /*
    Interfaz
    Nombre: burbujaAscendente
    Comentario: Este subprograma ordena un array de socios por el metodo de la burbuja en ascendente
    Cabecera: public void burbujaAscendente (SocioImp[] array)
    Precondiciones: El array no puede estar vacio
    Entrada: No hay
    Salida: No hay
    E/S: Un array de entero
    Postcondiciones: El array ordenado
    */

    public void burbujaAscendente (SocioImp[] array) {
        SocioImp aux;

        for(int i = 0; i < array.length; i++) {
            for(int j = array.length - 1; j > i; j--) {
                if(array[j].getNumSocio() < array[j-1].getNumSocio()) {
                    aux = array[j];
                    array[j] = array[j-1];
                    array[j-1] = aux;
                }
            }
        }
    }
}
