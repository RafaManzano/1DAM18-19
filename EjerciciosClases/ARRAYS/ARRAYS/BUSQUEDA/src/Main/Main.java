package Main;

import metodosBusqueda.metodosBusqueda;

public class Main {

    public static void main(String[] args) {

        int[] arraySec = {1,2,3,6,4,5,8,9,3,1,2,0,5,1,2,0,9,6,2,0,4,6,7,2,101,3,6,8,1,2,1,0,8,202};
        int[] arrayBin ={1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,20,25,30,200,298,1023698,1205487920,1997520055};
        int[] insercion = {0,1,2,3,4,5};
        metodosBusqueda busqueda = new metodosBusqueda();
        /*
        System.out.println(busqueda.busquedaSecuencial(arraySec,101));
        System.out.println(busqueda.busquedaSecuencial(arraySec,202));
        System.out.println(busqueda.busquedaSecuencial(arraySec,20));


        System.out.println(busqueda.busquedaBinaria(arrayBin,25));
        System.out.println(busqueda.busquedaBinaria(arrayBin,1));
        System.out.println(busqueda.busquedaBinaria(arrayBin,1023698));
        System.out.println(busqueda.busquedaBinaria(arrayBin,0));
        */

        busqueda.pintarArray(busqueda.insercion(insercion,-2));
        busqueda.pintarArray(busqueda.insercion(insercion,2));
        busqueda.pintarArray(busqueda.insercion(insercion,8));
        busqueda.pintarArray(busqueda.insercion(insercion,12));
        busqueda.pintarArray(busqueda.insercion(insercion,3));



    }
}
