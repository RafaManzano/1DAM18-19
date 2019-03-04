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
 */
import java.util.*;

import clases.*;
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
                                gestoraS.pintarArraySocios(socios);
                                break;

                            case 2:
                                socio = validaciones.validarSocio();
                                resguardosS.introducirSocio(socios, socio);
                                //gestoraS.introducirSocio(socios, socio);
                                break;

                            case 3:
                                gestoraS.pintarArraySocios(socios);
                                System.out.println("Introduzca la posicion que desea eliminar");
                                posicion = teclado.nextInt();
                                resguardosS.borrarSocio(socios, posicion);
                                //gestoraS.borrarSocio(socios, posicion);
                                break;
                        }
                        menus.menuSocios();
                        opcion = validaciones.validarOpciones3();
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
                                resguardosP.introducirPista(pistas, pista);
                                gestoraP.introducirPista(pistas, pista);
                            break;

                            case 3:
                                //resguardosP.pintarArrayPista(pistas);
                                gestoraP.pintarArrayPista(pistas);
                                System.out.println("Introduzca la posicion que desea eliminar");
                                posicion = teclado.nextInt();
                                resguardosP.borrarPista(pistas, posicion);
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
            opcion = validaciones.validarOpciones2();
            //Si no tienes los arrays cargados estaria bien cargarlos automaticamente //Asun no aprueba esto
            //Patada a la metodologia

            switch (opcion) {
                case 1:
                    menus.menuSociosyPistas();
                    opcion = teclado.nextInt();
                    do {
                        switch(opcion) {
                            case 1:
                                System.out.println("En construccion");
                                //MetodosOrdenacionAscendente
                                break;

                            case 2:
                                System.out.println("En construccion");
                                //MetodosOrdenacionDescendente
                                break;
                        }
                    }
                    while(opcion != 0);
                    break;

                case 2:
                    menus.menuSociosyPistas();
                    opcion = teclado.nextInt();
                    do {
                        switch(opcion) {
                            case 1:
                                System.out.println("En construccion");
                                //MetodosOrdenacionAscendente
                                break;

                            case 2:
                                System.out.println("En construccion");
                                //MetodosOrdenacionDescendente
                                break;
                        }
                        menus.menuSociosyPistas();
                        opcion = teclado.nextInt();
                    }
                    while(opcion != 0);
                    break;
            }
        }
        while(opcion != 0);
        }

    }
}

