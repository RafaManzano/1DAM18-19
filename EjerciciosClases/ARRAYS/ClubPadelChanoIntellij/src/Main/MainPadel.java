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
    LeeryValidarRespuesta
    Mientras respuesta sea si
        LeeryValidarOpcionMenu
        Segun(opcion)
            Para caso1
                Socios
            Para caso2
                Pistas
            Para caso3
                MostrarReservas
            Para caso 0
                Salir
        FinSegun
        LeeryValidarRespuesta
    FinMientras
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
        int posicion = 0;
        char respuesta;
        Scanner teclado = new Scanner(System.in);
        validacionesPadel validaciones = new validacionesPadel();
        menuPadel menus = new menuPadel();
        resguardosPadelPistas resguardosP = new resguardosPadelPistas();
        gestoraPadelPista gestoraP = new gestoraPadelPista();
        resguardosPadelSocio resguardosS = new resguardosPadelSocio();
        gestoraPadelSocio gestoraS = new gestoraPadelSocio();
        SocioImp socio = new SocioImp();
        PistaImp pista = new PistaImp();
        SocioImp[] socios = new SocioImp[10];
        PistaImp[] pistas = new PistaImp[10];



        //LeeryvalidarRespuesta
        //Eliminar para la proxima, tambien eliminar de PG
        do {
            System.out.println("Desea ejecutar el programa");
            respuesta = Character.toLowerCase(teclado.next().charAt(0));
        }
        while(respuesta != 's' && respuesta != 'n');

        while(respuesta == 's') { //Mientras respuesta sea si
        do {
            menus.menuPrincipal();
            opcion = validaciones.validarOpcionMenu();

            switch (opcion) {
                case 1:
                    //Socios
                    menus.menuSocios();
                    opcion = validaciones.validarOpcionMenu();
                    //socios = resguardosS.generarArraySocios();
                    socios = gestoraS.generarArraySocios();

                    do {
                        switch (opcion) {
                            case 1:
                                //resguardosS.arrayConSocios(socios);
                                gestoraS.arrayConSocios(socios);
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
                        opcion = validaciones.validarOpcionMenu();
                    }
                    while (opcion != 0);
                break;

                case 2:
                    //Pistas
                    menus.menuPistas();
                    opcion = validaciones.validarOpcionMenu();

                    do {
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
                        menus.menuSocios();
                        opcion = validaciones.validarOpcionMenu();
                    }
                    while (opcion != 0);
                break;

                case 3:
                    //MostrarReservas
                    menus.menuReservas();
                    opcion = validaciones.validarOpcionMenuReservas();
                break;
            }
            menus.menuPrincipal();
            opcion = validaciones.validarOpcionMenu();
        }
        while(opcion != 0);
            //LeeryvalidarRespuesta
            do {
                System.out.println("Desea ejecutar el programa");
                respuesta = Character.toLowerCase(teclado.next().charAt(0));
            }
            while(respuesta != 's' && respuesta != 'n');
        }
    }
}
