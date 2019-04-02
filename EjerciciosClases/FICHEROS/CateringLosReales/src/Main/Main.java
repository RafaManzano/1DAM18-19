package Main;

import validaciones.validacionesCatering;

import java.util.Scanner;

/*
Nombre del programa: CateringLosReales
Analisis
    Entrada: - opcion
             - respuesta
    Salida: - Mensajes con el usuario
            - Diferentes listados con el fichero
            - Mensajes de confirmacion
    Requsitos: - opcion tiene que ser ? a ?
               - Respuesta tiene que ser s o n

    PG Level 0
    Inicio
        segun opcion
            case 1
                personal
            case 2
                turno
        FinSegun
        Si respuesta es si
            GuardarCambiosFicheroMaestro
        Sino
            Se quedan los cambios en el fichero de movimiento
        FinSi
    Fin

    Modulo Personal
    Inicio
        Segun opcion
            Case 1
                introducirPersonal
            Case 2
                BorrarCamarero
            Case 3
                BorrarTodos
         FinSegun
     Fin

     Modulo Turno
     Inicio
        mostrarTurnoPersonal
     Fin



 */
public class Main {

    public static void main(String[] args) {
	int opcion = 0;
	char respuesta = ' ';
	Scanner teclado = new Scanner(System.in);
	validacionesCatering validar = new validacionesCatering();

	do {
	    opcion = validar.leeryValidarOpcion();
        switch (opcion) {
            case 1:
                //Personal
                System.out.println("1.");
            break;

            case 2:
                //Turno
                System.out.println("2.");
            break;
        }
    }
	while(opcion != 0);

	respuesta = validar.leeryValidarRespuesta();
	if(respuesta == 'S') {
	    //Guardar en ficheros maestros
        System.out.println("Cambios a Maestros");
    }
	else {
	    System.out.println("Se quedan guardados en los ficheros de movimiento");
    }

    }
}
