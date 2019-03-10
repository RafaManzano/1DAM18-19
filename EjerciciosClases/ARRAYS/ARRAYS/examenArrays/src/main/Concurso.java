package main;

import clases.FichaImp;
import gestoras.gestoraFicha;
import menus.menusConcurso;
import resguardos.resguardoGestora;
import validaciones.validacionesConcurso;

import java.util.*;

/*
 * Nombre del programa: Concurso
 * Comentario del programa: Este programa se encarga de gestionar unos aspirantes y en el caso de que pasen el corte, mostrar las listas con diferentes ordenaciones
 * 
 * Analisis:
 * Entrada: - Respuesta
 * 			- OpcionMenu
 * Salida: - Lista ordenada segun puntuacion de mayor a menor
 * 		   - Lista ordenada segun numero de aspirante
 * 		   - Lista ordenada segun mayor puntuacion y media
 * 		   - Mensajes con el usuario
 * 
 * PG Level 0
 * Inicio
 * 	Repetir
 * 		generarNombre
 * 		generarCalificaciones
 * 		Si(calificaciones son validas)
 * 			ConstruirFicha
 * 	Mientras no quiera seguir introduciendo fichas
 * 	MostrarMenu
	 * Segun(opcionMenu)
	 * 	case 1
	 * 		ListaPuntuacion
	 * 	case 2
	 * 		ListaNumeroAspirante
	 * 	case 3
	 * 		ListaMedia
	 * 	caso 0
	 * 		Salir
	 * 	FinSegun
 * Fin
 */
public class Concurso {

	public static void main(String[] args) {
		char respuesta;
		int opcion;
		String nombre;
		int contadorFichasValidas = 0;
		int[] calificaciones = new int[10];
		FichaImp[] fichas = new FichaImp[50];
		gestoraFicha gestora = new gestoraFicha();
		resguardoGestora resguardo = new resguardoGestora();
		Scanner teclado = new Scanner(System.in);
		validacionesConcurso validaciones = new validacionesConcurso();
		menusConcurso menus = new menusConcurso();
		
		do {
			//generarNombre
			//nombre = resguardo.generarNombre();
			nombre = gestora.generarNombre();
			
			//generarCalificaciones
			//calificaciones = resguardo.generarCalificaciones();
			calificaciones = gestora.generarCalificaciones();
			
			if(gestora.fichaValida(calificaciones) == true) {
				fichas[contadorFichasValidas] = new FichaImp(nombre, calificaciones);
			    contadorFichasValidas++;
			}
			
			
			System.out.println("Quieres seguir introduciendo fichas (N para salir)");
			respuesta = Character.toLowerCase(teclado.next().charAt(0));
		}
		while(respuesta != 'n');
		
		do {
			menus.mostrarMenu();
			opcion = validaciones.leeryValidarOpcionMenu(); 
			
			switch(opcion) {
			case 1:
				//ListaPuntuacion
			break;
			
			case 2:
				//ListaNumeroAspirante
			break;
			
			case 3:
				//ListaMedia
			break;
			}
		}
		while(opcion != 0);
		

	}

}
