package main;

import java.util.*;

import clases.PersonaImp;
import ficheros.gestionFicheros;
import gestora.gestoraPersona;
import menus.menuPersona;
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
public class programaPersonas {

	public static void main(String[] args) {
		int opcion;
		char respuesta;
		PersonaImp p;
		String rutaMov = "movimiento.dat";
		String maestro = "maestro.dat";
		String rutaDel =  "historico.dat";
		String rutaMod = "modificado.dat";
		String dni;
		Scanner teclado = new Scanner(System.in);
		validacionesPersona validar = new validacionesPersona();
		gestoraPersona gestora = new gestoraPersona();
		menuPersona menus = new menuPersona();
		//gestionFicheros fich = new gestionFicheros();
		
		/*
		fich.crearFichero(rutaMov);
		fich.crearFichero(maestro);
		fich.crearFichero(rutaDel);
		fich.crearFichero(rutaMod);
		fich.ficheroPorDefecto(rutaMov);
		*/
		//gestora.mostrarFichero(rutaMov);
		//gestora.mostrarFichero(rutaDel);
		//gestora.mostrarFichero(rutaMod);
		//gestora.mostrarFichero(maestro);
		//fich.primerosAjustes();
		
		do {
			menus.menuPrincipal();
			opcion = validar.leeryValidarOpcion();
			switch(opcion) {
				case 1:
					p = validar.leeryValidarPersona();
					gestora.introducir(rutaMov, p);
				break;
				
				case 2:
					gestora.mostrarFichero(rutaMov);
					System.out.println("Introduce el dni de la persona que deseas eliminar");
					dni = teclado.next();
					gestora.eliminar(rutaMov, dni, rutaDel);
				break;
					
				case 3:
					System.out.println("Introduce el dni de la persona que deseas modificar");
					dni = teclado.next();
					gestora.modificar(rutaMov, dni, rutaMod);
				break;
			}
		}
		while(opcion != 0); 
		
		System.out.println("Quieres guardar el fichero en el maestro (S/N)");
		respuesta = validar.leeryValidarRespuesta();
		
		if(respuesta == 'S') {
			//System.out.println("Guardar en maestro");
			gestora.guardarCambiosEliminados(rutaMov, rutaDel, maestro);
			gestora.guardarCambiosModificados(rutaMov, rutaMod, maestro);
		}
		else {
			System.out.println("Los cambios se mantienen en los ficheros correspondientes");
		}

	}

}
