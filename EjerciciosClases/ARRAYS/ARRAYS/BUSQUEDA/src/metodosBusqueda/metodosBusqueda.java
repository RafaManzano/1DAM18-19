package metodosBusqueda;

public class metodosBusqueda {

    /*
    Interfaz
    Nombre: busquedaSecuencial
    Comentario: Este subprograma busca en un array de enteros un dato
    Cabecera: public int busquedaSecuencial(int[] array, int dato)
    Precondiciones: El array no puede estar vacio
    Entrada: - int[] array //El array donde buscar el dato
             - int dato //EL dato a buscar
    Salida: - int posicion //La posicion del array donde esta el dato o -1 en caso de no encontrarlo
    E/S: No hay
    Postcondiciones: Asociado al nombre. Se devuelve la posición del elemento buscado o -1 si no se encuentra.
    */

    public int busquedaSecuencial(int[] array, int dato) {
        boolean encontrado = false;
        int posicion = -1;

        for (int i = 0; i < array.length && encontrado == false; i++) {
            if (array[i] == dato) {
                posicion = i;
                encontrado = true;
            }
        }

        return posicion;
    }

    /*
    Interfaz
    Nombre: busquedaBinaria
    Comentario: Este subprograma busca en un array de enteros un dato de manera binaria
    Cabecera: public int busquedaBinaria(int[] array, int dato)
    Precondiciones: El array no puede estar vacio y tiene que estar ordenado
    Entrada: - int[] array //El array donde buscar el dato
             - int dato //el dato a buscar
    Salida: - int posicion //La posicion del array donde esta el dato o -1 en caso de no encontrarlo
    E/S: No hay
    Postcondiciones: Asociado al nombre. Se devuelve la posición del elemento buscado o -1 si no se encuentra.
    */

    public int busquedaBinaria(int[] array, int dato) {
        int posicion = -1;
        int inicio = 0;
        int fin = array.length - 1;
        int med = (inicio + fin) / 2;

        while (inicio <= fin && posicion == -1) {
            if (array[med] == dato) {
                posicion = med;
            } else {
                if (array[med] > dato) {
                    fin = med - 1;
                } else {
                    inicio = med - 1;
                }
                med = (inicio + fin) / 2;
            }
        }
        return posicion;
    }

    /*
    Interfaz
    Nombre: insercion
    Comentario: Este subprograma inserta un dato en su posicion correspondiente en el array de enteros
    Cabecera: public int[] busquedaBinaria(int[] array, int dato)
    Precondiciones: El array tiene que estar ordenado
    Entrada: - int dato //el dato a buscar
    Salida: No hay
    E/S: - int[] array //El array donde buscar el dato
    Postcondiciones: Asociado al nombre. Se devuelve el array con la posicion introducida
    */

    public int[] insercion(int[] array, int dato) {
        int[] aux = new int[array.length+1];
        int i = 0;

        for(int j = 0; j < array.length; j++){//Copiamos los elementos de array en aux
            aux[j] = array[j];
        }

        for(i = 0;i < array.length && array[i] < dato;i++){
            //Buscamos la posición adecuada para almacenar el elemento
        }

        for(int j = aux.length-1; j > i; j--){  //Pasamos los demás elementos a la derecha
            aux[j] = aux[j-1];
        }
        aux[i] = dato;//Asignamos el elemento

        array = aux;//Modificamos el array introducido por parámetros

        return array;
    }

    public void pintarArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }
}

