package main;

import clases.CamareroImp;
import clases.MesaImp;
import gestora.gestionGenerica;
import menus.menuCatering;
import resguardo.resguardosGenericos;
import validaciones.validacionesCatering;

import java.io.File;
import java.util.Scanner;
import enumeraciones.EnumTurno;

/*
Nombre del programa: CateringLosReales
Analisis
    Entrada: - opcion
             - respuesta
             - turno

    Salida: - Mensajes con el usuario
            - Diferentes listados con el fichero
            - Mensajes de confirmacion

    Requsitos: - opcion tiene que ser ? a ?
               - Respuesta tiene que ser S o N
               - turno tiene que ser MANHANA, TARDE o NOCHE

    PG Level 0
    Inicio
        segun opcion
            case 1
                Camareros
            caso 2
                Mesas
            case 3
                Turnos
        FinSegun
        Si respuesta es si
            GuardarCambiosFicheroMaestro
        Sino
            Se quedan los cambios en el fichero de movimiento
        FinSi
    Fin

    Modulo Camareros
    Inicio
        Segun opcion
            Case 1
                crearCamarero
            Case 2
                BorrarCamarero
        FinSegun
     Fin

     Modulo Mesas
     Inicio
        segun opcion
         Case 1
            crearMesa
         Case 2
            BorrarMesa
       FinSegun
     Fin

     Modulo Turno
     Inicio
        mostrarTurnoCamareros
     Fin



 */
public class Main {

    public static void main(String[] args) {
	int opcion = 0;
	int opcionSM = 0;
	int id;
	char respuesta = ' ';
	MesaImp mesa = new MesaImp();
	CamareroImp camarero = new CamareroImp();
	EnumTurno turno = EnumTurno.NODEFINIDO;
	Scanner teclado = new Scanner(System.in);
	validacionesCatering validar = new validacionesCatering();
	resguardosGenericos reGe = new resguardosGenericos();
	gestionGenerica geGe = new gestionGenerica();
	menuCatering menus = new menuCatering();
	String camareros = "camareros.txt";
	String mesas = "mesas.txt";

	do {
        menus.menuPrincpal();
	    opcion = validar.leeryValidarOpcion();
        switch (opcion) {
            case 1:
                //Camarero
                //System.out.println("1.");
                do {
                	menus.menuCamareros();
                    opcionSM = validar.leeryValidarOpcion();
                    switch(opcionSM) {

                        case 1:
                            //crearCamarero
                            camarero = validar.leeryValidarCamarero();
                            geGe.introducir(camareros, camarero);
                            //System.out.println("1.");
                        break;

                        case 2:
                            //borrarCamarero
                            geGe.mostrarFichero(camareros);
                            System.out.println("Escoja el numero del camarero que desee");
                            id = teclado.nextInt();
                            geGe.eliminar(camareros, id);
                            //System.out.println("2.");
                        break;

                        case 3:
                            //Eliminar e introducir
                        	 geGe.mostrarFichero(camareros);
                             System.out.println("Escoja el numero del camarero que desee");
                             id = teclado.nextInt();
                             geGe.eliminar(camareros, id);
                             camarero = validar.leeryValidarCamarero();
                             geGe.introducir(camareros, camarero);
                            System.out.println("3.");
                        break;
                    }
                }
                while(opcionSM != 0);

            break;

            case 2:
                //Mesas
                //System.out.println("2.");
                do {
                	menus.menuMesas();
                    opcion = validar.leeryValidarOpcion();
                    switch(opcionSM) {

                        case 1:
                            //introducirMesas
                            //System.out.println("1.");
                            mesa = validar.leeryValidarMesa();
                            reGe.introducir(mesas, mesa);
                        break;

                        case 2:
                            //borrarMesa
                            //System.out.println("2.");
                            //En resguardo
                            reGe.eliminar(mesas, mesa);
                        break;

                        case 3:
                            System.out.println("En construccion");
                            //En resguardo
                        break;
                    }
                }
                while(opcionSM != 0);
            break;

            case 3:
                //System.out.println("3.");
                System.out.println("Escriba el turno que desea revisar");
                turno = validar.leeryValidarTurno();
                geGe.mostrarTurno(camareros, turno);
            break;
        }
        
    }
	while(opcion != 0);

	System.out.println("Ahora quieres guardar los cambios en el fichero maestro o no? (S/N)");
	respuesta = validar.leeryValidarRespuesta();
	if(respuesta == 'S') {
	    //Guardar en ficheros maestros
        System.out.println("Pensar");
	}
	else {
	    System.out.println("Se quedan guardados en los ficheros de movimiento");
	    File mov = new File("camareros.txt");
    }

    }
}
