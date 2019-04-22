package main;

import java.util.*;

import clases.PersonaImp;
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
		String ruta = "persona.dat";
		String dni;
		Scanner teclado = new Scanner(System.in);
		validacionesPersona validar = new validacionesPersona();
		gestoraPersona gestora = new gestoraPersona();
		menuPersona menus = new menuPersona();
		
		do {
			menus.menuPrincipal();
			opcion = validar.leeryValidarOpcion();
			switch(opcion) {
				case 1:
					p = validar.leeryValidarPersona();
					gestora.introducir(ruta, p);
				break;
				
				case 2:
					System.out.println("Introduce el dni de la persona que deseas eliminar");
					dni = teclado.next();
					gestora.eliminar(ruta, dni);
				break;
					
				case 3:
					System.out.println("En construccion");
					/*
					System.out.println("Inserte la persona con las modificaciones que desee");
					p = validar.leeryValidarPersona();
					gestora.introducir(ruta, p);
					*/
				break;
			}
		}
		while(opcion != 0); 
		
		System.out.println("Quieres guardar el fichero en el maestro (S/N)");
		respuesta = validar.leeryValidarRespuesta();
		
		if(respuesta == 's') {
			System.out.println("Guardar en maestro");
		}
		else {
			System.out.println("Guardar en movimiento");
		}

	}

}
