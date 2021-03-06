package main;
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
    FinSegun
 Fin

 Modulo MostrarReservas
  Inicio
     Segun(opcion)
        Para caso1
            MostrarSocios
        Para caso2
            MostrarPistas
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
        char respuesta;
        Scanner teclado = new Scanner(System.in);
        validacionesPadel validaciones = new validacionesPadel();
        menuPadel menus = new menuPadel();
        resguardosPadelPistas resguardosP = new resguardosPadelPistas();
        gestoraPadelPista gestoraP = new gestoraPadelPista();
        resguardosPadelSocio resguardosS = new resguardosPadelSocio();
        gestoraPadelSocio gestoraS = new gestoraPadelSocio();
        SocioImp[] socios = new SocioImp[10];
        PistaImp[] pistas = new PistaImp[10];



        //LeeryvalidarRespuesta
        do {
            System.out.println("Desea ejecutar el programa");
            respuesta = Character.toLowerCase(teclado.next().charAt(0));
        }
        while(respuesta != 's' && respuesta != 'n');

        while(respuesta == 's') { //Mientras respuesta sea si

            menus.menuPrincipal();
            opcion = validaciones.validarOpcionMenu();

            switch (opcion) {
                case 1:
                    //Socios
                    menus.menuSocios();
                    opcion = validaciones.validarOpcionMenu();
                    //socios = resguardosS.generarArraySocios();
                    socios = gestoraS.generarArraySocios();

                    switch (opcion) {
                        case 1:
                            //resguardosS.arrayConSocios(socios);
                            gestoraS.arrayConSocios(socios);
                        break;

                        case 2:
                            //resguardosS.introducirSocios(socios);
                        break;
                    }
                break;

                case 2:
                    //Pistas
                    menus.menuPistas();
                    opcion = validaciones.validarOpcionMenu();
                break;

                case 3:
                    //MostrarReservas
                    menus.menuReservas();
                    opcion = validaciones.validarOpcionMenuReservas();
                break;
            }
            //LeeryvalidarRespuesta
            do {
                System.out.println("Desea ejecutar el programa");
                respuesta = Character.toLowerCase(teclado.next().charAt(0));
            }
            while(respuesta != 's' && respuesta != 'n');
        }
    }
}
