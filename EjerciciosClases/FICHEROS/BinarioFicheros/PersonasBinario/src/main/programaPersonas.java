package main;

import java.util.*;

import clases.PersonaImp;
import gestora.gestoraPersona;
import menus.menuPersona;
import resguardos.resguardosPersonas;
import validaciones.validacionesPersona;

/*
 * Nombre del programa: programaPersonas
 * Comentario: Este programa muestra el uso de ficheros binarios para la gestion de personas
 * 
 * Analisis
 * Entrada: - opcion
 * 			- respuesta
 * 			- Persona (dni, nombre, apellidos)
 * 
 * Salida: - Mensaje con el usuario
 * 		   - Mensajes de errores
 * 
 * Requisitos: - opcion tiene que ser de 0 a 3
 * 			   - respuesta tiene que ser s o n
 * 
 * PG
 * Inicio
 * 	leeryValidarOpcion*
 * 	segun(opcion)
 * 		caso 1
 * 			IntroducirPersona
 * 		Caso 2 
 * 			BorrarPersona
 * 		Caso 3
 * 			ModificarPersona
 * 	FinSegun
 * 	Si la respuesta es si
 * 		GuardarMaestro
 * 	Sino
 * 		GuardaMovimiento
 * Fin
 */

//El metodo de guardar modificados guarda de mas habria que revisar que hacer
//en caso de que no hay modificaciones o sea la misma
public class programaPersonas {

	public static void main(String[] args) {
		int opcion;
		char respuesta;
		PersonaImp p;
		String rutaMov = "movimiento.dat";
		String maestro = "maestro.dat";
		String rutaDel =  "historico.dat";
		String rutaMod = "modificado.dat";
		String rutaAux = "auxiliar.dat";
		String dni;
		Scanner teclado = new Scanner(System.in);
		validacionesPersona validar = new validacionesPersona();
		gestoraPersona gestora = new gestoraPersona();
		menuPersona menus = new menuPersona();
		resguardosPersonas resguardo = new resguardosPersonas();
		
		
		//gestora.mostrarFichero(rutaMov);
		//gestora.mostrarFichero(rutaDel);
		//gestora.mostrarFichero(rutaMod);
		//gestora.mostrarFichero(maestro);
		//gestora.mostrarFichero(rutaAux);
		
		
		do {
			menus.menuPrincipal();
			opcion = validar.leeryValidarOpcion();
			switch(opcion) {
				case 1:
					p = validar.leeryValidarPersona();
					//resguardo.introducir(rutaMov, p);
					gestora.introducir(rutaMov, p);
				break;
				
				case 2:
					gestora.mostrarFichero(rutaMov);
					System.out.println("Introduce el dni de la persona que deseas eliminar");
					dni = teclado.next();
					//resguardo.eliminar(rutaMov, dni, rutaDel);
					gestora.eliminar(rutaMov, dni, rutaDel);
				break;
					
				case 3:
					gestora.mostrarFichero(rutaMov);
					System.out.println("Introduce el dni de la persona que deseas modificar");
					dni = teclado.next();
					resguardo.modificar(rutaMov, dni, rutaMod);
					gestora.modificar(rutaMov, dni, rutaMod);
				break;
			}
		}
		while(opcion != 0); 
		
		System.out.println("Quieres guardar el fichero en el maestro (S/N)");
		respuesta = validar.leeryValidarRespuesta();
		
		if(respuesta == 'S') {
			//System.out.println("Guardar en maestro");
			//resguardo.guardarCambiosEliminados(rutaMov, rutaDel, rutaAux);
			gestora.guardarCambiosEliminados(rutaMov, rutaDel, rutaAux);
			//gestora.mostrarFichero(rutaAux);
			//gestora.mostrarFichero(maestro);
			//resguardo.guardarCambiosModificados(rutaAux, rutaMod, maestro);
			gestora.guardarCambiosModificados(rutaAux, rutaMod, maestro);
			System.out.println("Mostramos los datos introducidos en el maestro");
			gestora.mostrarFichero(maestro);
		}
		else {
			System.out.println("Los cambios se mantienen en los ficheros correspondientes");
		}

	}

}
