package Main;
/*
 Nombre del programa: MainPadel
 Breve Comentario: Este subprograma gestiona las reservas de unas pistas de padel y la introduccion de socios
 Analisis
 Entrada: - opcion
          - respuesta
 Salida: - Mensajes con el usuario
         - Resultado de las operaciones
 Requisitos: - Opcion es la opcion de menu
             - respuesta tiene que ser s o n

 PG Level 0
 Inicio
    LeeryValidarOpcionMenu
    Segun(opcion)
        Para caso1
            Socios
        Para caso2
            Pistas
        Para caso 0
            Salir
    FinSegun
    MostrarReservas
 Fin

 Modulo Socios
 Inicio
    LeeryValidarOpcionMenuSocio
    Segun(opcion)
        Para caso1
            PorDefecto
        Para caso2
            introducirSocio
        Para caso3
            borrarSocio
        Para caso 0
            Salir
    FinSegun
 Fin

 Modulo Pistas
 Inicio
     Segun(opcion)
        Para caso1
            PorDefecto
        Para caso2
            introducirPistas
        Para caso3
            borrarPistas
        Para caso 0
            Salir
    FinSegun
 Fin

 Modulo MostrarReservas
  Inicio
     Segun(opcion)
        Para caso1
            MostrarSocios
        Para caso2
            MostrarPistas
        Para caso 0
            Salir
    FinSegun
 Fin

 Modulo MostrarSocios
 Inicio
    Segun(opcion)
        para caso 1
            Burbuja
        para caso 2
            SeleccionDirecta
        para caso 3
            InsercionDirecta
        para caso 4
            QuickSort
        para caso 5
            MergeSort
    FinSegun
 Fin

 Modulo MostrarPistas
 Inicio
    Segun(opcion)
        para caso 1
            Burbuja
        para caso 2
            SeleccionDirecta
        para caso 3
            InsercionDirecta
        para caso 4
            QuickSort
        para caso 5
            MergeSort
    FinSegun
 Fin
 */
import java.util.*;

import clases.*;
import ordenacion.metodosOrdenacion;
import validaciones.validacionesPadel;
import menus.menuPadel;
import gestora.*;
import resguardos.*;

public class MainPadel {
    public static void main(String[] args) {
        int opcion;
        int opcionMenuPrincipal;
        int posicion = 0;
        Scanner teclado = new Scanner(System.in);
        validacionesPadel validaciones = new validacionesPadel();
        menuPadel menus = new menuPadel();
        resguardosPadelPistas resguardosP = new resguardosPadelPistas();
        gestoraPadelPista gestoraP = new gestoraPadelPista();
        resguardosPadelSocio resguardosS = new resguardosPadelSocio();
        gestoraPadelSocio gestoraS = new gestoraPadelSocio();
        SocioImp socio = new SocioImp();
        PistaImp pista = new PistaImp();
        SocioImp[] socios = gestoraS.generarArraySocios();
        PistaImp[] pistas = gestoraP.generarArrayPistas();
        metodosOrdenacion ordenar = new metodosOrdenacion();
        resguardosOrdenacion resguardosO = new resguardosOrdenacion();

        do {
            menus.menuPrincipal();
            opcionMenuPrincipal = validaciones.validarOpciones2();

            switch (opcionMenuPrincipal) {
                case 1:
                    do {
                        //Socios
                        menus.menuSocios();
                        opcion = validaciones.validarOpciones3();
                        //socios = resguardosS.generarArraySocios();
                        switch (opcion) {
                            case 1:
                                //resguardosS.arrayConSocios(socios);
                                gestoraS.arrayConSocios(socios);
                                // gestoraS.pintarArraySocios(socios);
                                break;

                            case 2:
                                socio = validaciones.validarSocio();
                                //resguardosS.introducirSocio(socios, socio);
                                gestoraS.introducirSocio(socios, socio);
                                break;

                            case 3:
                                gestoraS.pintarArraySocios(socios);
                                System.out.println("Introduzca la posicion que desea eliminar");
                                posicion = teclado.nextInt();
                                //resguardosS.borrarSocio(socios, posicion);
                                gestoraS.borrarSocio(socios, posicion);
                                break;
                        }
                        //menus.menuSocios();
                        //opcion = validaciones.validarOpciones3();
                    }
                    while (opcion != 0);
                break;

                case 2:
                    //Pistas
                    do {
                        menus.menuPistas();
                        opcion = validaciones.validarOpciones3();
                        switch (opcion) {
                            case 1:
                                //resguardosP.arrayConPistas(pistas);
                                gestoraP.arrayConPistas(pistas);
                            break;

                            case 2:
                                //resguardosP.introducirPista(pistas, pista);
                                pista = validaciones.validarPista(socios);
                                gestoraP.introducirPista(pistas, pista);
                            break;

                            case 3:
                                //resguardosP.pintarArrayPista(pistas);
                                gestoraP.pintarArrayPista(pistas);
                                System.out.println("Introduzca la posicion que desea eliminar");
                                posicion = teclado.nextInt();
                                //resguardosP.borrarPista(pistas, posicion);
                                gestoraP.borrarPista(pistas, posicion);
                            break;
                        }
                    }
                    while (opcion != 0);
                break;
            }
        }
        while(opcionMenuPrincipal != 0);
        //gestoraP.pintarArrayPista(pistas);
        //gestoraS.pintarArraySocios(socios);
        if(gestoraP.estaVacio(pistas) == true && gestoraS.estaVacio(socios) == true) {
        do {
            //MostrarReservas
            menus.menuReservas();
            opcionMenuPrincipal = validaciones.validarOpciones2();
            //Cargar arrays por defecto
            //Si no tienes los arrays cargados estaria bien cargarlos automaticamente //Asun no aprueba esto
            //Patada a la metodologia

            switch (opcionMenuPrincipal) {
                case 1:
                    do {
                        menus.menuOrdenacion();
                        opcion = validaciones.validarOpciones5();
                        switch(opcion) {
                            case 1:
                                //System.out.println("En construccion");
                                System.out.println("Array sin ordenar");
                                gestoraS.pintarArraySocios(socios);
                                //resguardosO.burbuja(socios);
                                ordenar.burbuja(socios);
                                System.out.println("Array ordenado");
                                gestoraS.pintarArraySocios(socios);
                                //Burbuja
                            break;

                            case 2:
                                //System.out.println("En construccion");
                                System.out.println("Array sin ordenar");
                                gestoraS.pintarArraySocios(socios);
                                //resguardosO.seleccionDirecta(socios);
                                ordenar.seleccionDirecta(socios);
                                System.out.println("Array ordenado");
                                gestoraS.pintarArraySocios(socios);
                                //Seleccion Directa
                            break;

                            case 3:
                                //System.out.println("En construccion");
                                System.out.println("Array sin ordenar");
                                gestoraS.pintarArraySocios(socios);
                                resguardosO.insercionDirecta(socios);
                                //ordenar.insercionDirecta(socios);
                                //System.out.println("Array ordenado");
                                //gestoraS.pintarArraySocios(socios);
                                //Insercion Directa
                            break;

                            case 4:
                                System.out.println("En construccion");
                                System.out.println("Array sin ordenar");
                                gestoraS.pintarArraySocios(socios);
                                resguardosO.quickSort(socios, 0,5);
                                //ordenar.quickSort(socios, 1,9);
                                //System.out.println("Array ordenado");
                                //gestoraS.pintarArraySocios(socios);

                                //QuickSort
                            break;

                            case 5:
                                System.out.println("En construccion");
                                //MergeSort
                            break;
                        }
                    }
                    while(opcion != 0);
                    break;

                case 2:
                    do {
                        menus.menuOrdenacion();
                        opcion = validaciones.validarOpciones5();
                        switch(opcion) {
                            case 1:
                                //System.out.println("En construccion");
                                System.out.println("Array sin ordenar");
                                gestoraP.pintarArrayPista(pistas);
                                //resguardosO.burbuja(pistas);
                                ordenar.burbuja(pistas);
                                System.out.println("Array ordenado");
                                gestoraP.pintarArrayPista(pistas);
                                //Burbuja
                                break;

                            case 2:
                                //System.out.println("En construccion");
                                System.out.println("Array sin ordenar");
                                gestoraP.pintarArrayPista(pistas);
                                //resguardosO.seleccionDirecta(pistas);
                                ordenar.seleccionDirecta(pistas);
                                System.out.println("Array ordenado");
                                gestoraP.pintarArrayPista(pistas);
                                //Seleccion Directa
                                break;

                            case 3:
                                //System.out.println("En construccion");
                                System.out.println("Array sin ordenar");
                                gestoraP.pintarArrayPista(pistas);
                                resguardosO.insercionDirecta(pistas);
                                //Insercion Directa
                                break;

                            case 4:
                                //System.out.println("En construccion");
                                System.out.println("Array sin ordenar");
                                gestoraP.pintarArrayPista(pistas);
                                resguardosO.quickSort(pistas, 1, 5);
                                //QuickSort
                                break;

                            case 5:
                                System.out.println("En construccion");
                                //MergeSort
                                break;
                        }
                    }
                    while(opcion != 0);
                    break;
            }
        }
        while(opcionMenuPrincipal != 0);
        }

    }
}

