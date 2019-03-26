package Main;

import clases.TrabajadorImp;
import gestora.gestoraTrabajadores;
import menus.menusFichado;
import validaciones.validacionesFichado;

import java.io.File;
import java.util.Scanner;

/*
Nombre: maquinaDeFichado
Comentario: Este programa se encarga de guardar a los trabajadores que fichan en la maquina

Analisis:
Entrada: - Respuesta
         - Opcion
Salida: - Mensajes con el usuario
        - Lista con los trabajadores
Requisitos: - Respuesta tiene que ser s o n
            - Opcion tiene que ser de 0 a 3?

PG Level 0
Inicio
    mostrarMenuOpcion
    segun(opcion)
        case 1
            trabajadoresPorDefecto*
        case 2
            leeryValidarTrabajador*
            introducirTrabajadores*
        case 3
            borrarTrabajadores*
        case 0
            Salir
    FinSegun
    mostrarFichero*
Fin
 */

public class maquinaDeFichado {

    public static void main(String[] args) {
        int opcion;
        char respuesta;
        TrabajadorImp trabajador;
        gestoraTrabajadores gestora = new gestoraTrabajadores();
        //File archivo = new File("trabajadores.txt");
        String ruta = "trabajadores.txt";
        Scanner teclado = new Scanner(System.in);
        menusFichado menus = new menusFichado();
        validacionesFichado validar = new validacionesFichado();

        //gestora.borrarFichero(archivo);

        do {
            menus.mostrarMenuOpcion();
            opcion = teclado.nextInt();
            switch(opcion) {
                case 1:
                    //Trabajadores por defecto
                    //System.out.println("En construccion");
                    gestora.trabajadoresPorDefecto(ruta);
                    //mostrar casos de errores
                    break;

                case 2:
                    //Introducir Trabajadores
                    trabajador = validar.leeryValidarTrabajador();
                    gestora.introducirTrabajador(ruta, trabajador);
                    //System.out.println("En construccion");
                    break;

                case 3:
                    //Borrar Trabajadores
                    gestora.mostrarFichero(ruta);
                    System.out.println("En construccion");
                    break;
            }
        }
        while(opcion != 0);
    }
}
