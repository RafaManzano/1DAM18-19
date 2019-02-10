/* Nombre del programa: MainEncuesta
 * Analisis
 * Comentario: Este subprograma muestra encuentas y muestra los distritos
 * Entrada: - respuesta
 * Salida: - Mensajes con el usuario
 * 		   - Resultado del distrito
 * 
 * Requisitos: - Respuesta tiene que ser s o n
 * 
 * PG Level 0
 * Inicio
 * 	LeeryValidarRespuesta
 * 	Mientras respuesta sea si
 * 		LeeryValidarEncuesta
 * 		Para todas las encuestas
 * 			LeerPersona
 * 			LeerDistrito
 * 		FinPara
 * 		MostrarPorcentajeDistrito
 * 		LeeryValidarRespuesta
 * 	FinMientras
 * Fin
 */

import java.util.*;
public class MainEncuesta {
	
	public static void main (String[] args) {
		int encuestas;
		char respuesta;
		int norte = 0;
		int sur = 0;
		int oeste = 0;
		int este = 0;
		int opcion;
		EncuestaImp encuesta = new EncuestaImp();
		PersonaImp persona = new PersonaImp();
		Scanner teclado = new Scanner(System.in);
		
		//LeeryValidarRespuesta
		do {
			System.out.println("Quieres ejecutar el programa");
			respuesta = Character.toLowerCase(teclado.next().charAt(0));
		}
		while(respuesta != 's' && respuesta != 'n');
		
		while(respuesta == 's') {
			//System.out.println("Entrado");
			
			//LeeryValidarEncuesta
			do {
				System.out.println("Cuantas encuestas quieres");
				encuestas = teclado.nextInt();
			}
			while(encuestas < 1);
			
			//Para todas las encuestas
			for(int contador = 0; contador < encuestas; contador++) {
				//LeerPersona
				persona = utilEncuestas.leerPersona();
				
				do {
					utilEncuestas.menuDistrito();
					opcion = teclado.nextInt();
				}
				while(opcion < 1 || opcion > 5);
				
				switch(opcion) {
					case 1:
						norte++;
					break;
					
					case 2:
						sur++;
					break;
					
					case 3:
						oeste++;
					break;
					
					case 4:
						este++;
					break;
				}
				
			}
			
			do {
			System.out.println("Quieres ejecutar el programa");
			respuesta = Character.toLowerCase(teclado.next().charAt(0));
			}
			while(respuesta != 's' && respuesta != 'n');
		}
		
	}
}

