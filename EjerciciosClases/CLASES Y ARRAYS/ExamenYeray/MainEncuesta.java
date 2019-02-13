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
 * 			LeeryValidarDistrito
 * 			Segun(distrito) 
 * 				para norte
 * 					sumamos 1 al norte
 * 				para sur
 * 					sumamos 1 al sur
 * 				para este
 * 					sumamos 1 al este
 * 				para oeste
 * 					sumamos 1 al oeste
 * 			FinSegun
 * 		FinPara
 * 		porcentajeDistrito*
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
			System.out.println("Quieres ejecutar el programa? (S/N)");
			respuesta = Character.toLowerCase(teclado.next().charAt(0));
		}
		while(respuesta != 's' && respuesta != 'n');
		
		while(respuesta == 's') {
			norte = 0;
			sur = 0;
			este = 0;
			oeste = 0;
			//System.out.println("Entrado");
			
			//LeeryValidarEncuesta
			do {
				System.out.println("Cuantas encuestas quieres? (Mayor que 0)");
				encuestas = teclado.nextInt();
			}
			while(encuestas < 1);
			
			//Para todas las encuestas
			for(int contador = 0; contador < encuestas; contador++) {
				//LeerPersona
				persona = utilEncuestas.leerPersona();
				
				//LeeryValidarDistrito
				do {
					utilEncuestas.menuDistrito();
					opcion = teclado.nextInt();
				}
				while(opcion < 1 || opcion > 4);
				
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
			
			System.out.println("Una vez acabado todo, procedemos a ver un porcentaje de los distritos donde de se han realizado las pruebas");
			//porcentajeDistrito*
			utilEncuestas.porcentajeDistrito(norte, sur, este, oeste, encuestas);
			
			//LeeryValidarRespuesta
			do {
			System.out.println("Quieres ejecutar el programa");
			respuesta = Character.toLowerCase(teclado.next().charAt(0));
			}
			while(respuesta != 's' && respuesta != 'n');
		}
		
	}
}

