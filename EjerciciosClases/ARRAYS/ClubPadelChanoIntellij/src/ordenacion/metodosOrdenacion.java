package ordenacion;

import clases.PistaImp;
import clases.SocioImp;
import excepciones.ExcepcionSocio;

public class metodosOrdenacion {
    /*
    Interfaz
    Nombre: burbuja
    Comentario: Este subprograma ordena un array de socios por el metodo de la burbuja
    Cabecera: public void burbuja (SocioImp[] array)
    Precondiciones: El array no puede estar vacio
    Entrada: No hay
    Salida: No hay
    E/S: Un array de socios
    Postcondiciones: El array ordenado
    */

    public void burbuja (SocioImp[] array) {
        SocioImp aux;

        for(int i = 0; i < array.length; i++) {
            for(int j = array.length - 1; j > i; j--) {
                if(array[j].getEdad() < array[j-1].getEdad()) {
                        aux = array[j];
                        array[j] = array[j-1];
                        array[j-1] = aux;
                        if(array[j-1].getEdad() == 0) {
                            aux = array[j];
                            array[j] = array[j-1];
                            array[j-1] = aux;
                        }
                }
            }
        }
    }

    /*
    Interfaz
    Nombre: burbuja
    Comentario: Este subprograma ordena un array de pistas por el metodo de la burbuja
    Cabecera: public void burbuja (PistaImp[] array)
    Precondiciones: El array no puede estar vacio
    Entrada: No hay
    Salida: No hay
    E/S: Un array de pistas
    Postcondiciones: El array ordenado
    */

    public void burbuja (PistaImp[] array) {
        PistaImp aux;

        for(int i = 0; i < array.length; i++) {
            for(int j = array.length - 1; j > i; j--) {
                if(array[j].getNumeroPista() < array[j-1].getNumeroPista()) {
                    aux = array[j];
                    array[j] = array[j-1];
                    array[j-1] = aux;

                    if(array[j-1].getNumeroPista() == 0) {
                        aux = array[j];
                        array[j] = array[j-1];
                        array[j-1] = aux;
                    }
                }
            }
        }
    }

    /*
     * Interfaz
     * Nombre: seleccionDirecta
     * Comentario: Este subprograma ordena un array de socios por el metodo de seleccion directa
     * Cabecera: public void seleccionDirecta (SocioImp[] array)
     * Precondiciones: El array no puede estar vacio y no puede estar ordenado
     * Entrada: No hay
     * Salida: No hay
     * E/S: Un array de socios
     * Postcondiciones: El array ordenado
     */

    public void seleccionDirecta (SocioImp[] array) {
        SocioImp aux;
        int minimo;

        for(int i = 0; i < array.length; i++) {
            minimo = i;
            for(int j = i + 1; j < array.length; j++) {
                if(array[j].getEdad() < array[minimo].getEdad()) {
                    if(array[j].getEdad() > 0) {
                        minimo = j;
                    }

                }
            }
            //Intercambiar para que el mas pequeño este en su lugar
            aux = array[i];
            array[i] = array[minimo];
            array[minimo] = aux;
        }
    }

    /*
     * Interfaz
     * Nombre: seleccionDirecta
     * Comentario: Este subprograma ordena un array de pistas por el metodo de seleccion directa
     * Cabecera: public void seleccionDirecta (PistaImp[] array)
     * Precondiciones: El array no puede estar vacio y no puede estar ordenado
     * Entrada: No hay
     * Salida: No hay
     * E/S: Un array de pistas
     * Postcondiciones: El array ordenado
     */

    public void seleccionDirecta (PistaImp[] array) {
        PistaImp aux;
        int minimo;

        for(int i = 0; i < array.length; i++) {
            minimo = i;
            for(int j = i + 1; j < array.length; j++) {
                if(array[j].getNumeroPista() < array[minimo].getNumeroPista()) {
                    if(array[j].getNumeroPista() > 0) {
                        minimo = j;
                    }

                }
            }
            //Intercambiar para que el mas pequeño este en su lugar
            aux = array[i];
            array[i] = array[minimo];
            array[minimo] = aux;
        }
    }

    /* Interfaz
	 * Nombre: insercionDirecta
	 * Comentario: Este subprograma ordena un array de socios por el metodo de insercion directa
	 * Cabecera: public void insercionDirecta (SocioImp[] array)
	 * Precondiciones: El array no puede estar vacio y no puede estar ordenado
	 * Entrada: No hay
	 * Salida: No hay
	 * E/S: Un array de socios
	 * Postcondiciones: El array ordenado
	*/
    public void insercionDirecta (SocioImp[] array) {
        SocioImp aux;

        for(int i = 1; i < array.length; i++) {
            aux = array[i];
            for(int j = i - 1; j > 0 && array[j].getEdad() > aux.getEdad(); j--) {
                //intercambio
                array[j + 1] = array[j];
                array[j] = aux;
            }
        }
    }

    /*
     * Interfaz
     * Nombre: quickSort
     * Comentario: Este subprograma ordena un array de socios por el metodo de QuickSort
     * Cabecera: public  void quickSort(SocioImp[] array, int inicio, int fin)
     * Precondiciones: - Inicio es el primer elemento de la particion
     *                 - Fin es el ultimo elemento de la particion
     * Entrada: - int inicio
     *          - int fin
     * Salida: No hay
     * Entrada/Salida: SocioImp[] array
     * Postcondiciones: Se ordenada el array de socios
     *
     */
    }

