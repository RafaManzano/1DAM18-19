package main.main;

import java.util.Scanner;

/*
 * Nombre del programa: MainListas
 * Comentario: Este programa se encarga de hacer operaciones de los productos de un supermercado
 * 
 * Analisis
 * Entrada: - String Nombre //El nombre necesario para loguearte
 *  		- int opcion //La opcion del menu
 *  		- char respuesta //Es la respuesta de la pregunta
 *  
 *  Salida: - Mensajes con el usuario
 *  		- Mensajes de confirmacion
 *  		- Diferentes listas
 *  
 * 	Requisitos: - opcion es de 0 a 9
 * 				- respuesta sera s o n
 * 
 * PG Level 0
 * Inicio
 * 	IntroducirUsuario
 * 	MenuPrincipal*
 * 	segun Opcion
 * 		caso 1:
 * 			AnhadirProductoCodigo
 * 		caso 2:
 * 			AnahdirProductoNombre
 * 		caso 3:
 * 			ListaProducto
 * 		caso 4:
 * 			ObtenerMasBarato
 * 		caso 5:
 * 			ObtenerProductoCaro
 * 		caso 6:
 * 			ObtenerProductoMedio
 * 		caso 7:
 * 			ObtenerProductoMasVendido
 * 		caso 8:
 * 			ObtenerProductoMenosVendido
 * 		caso 9:
 * 			TerminarPedido
 * 	FinSegun
 * CambioDeUsuario
 * Fin
 */
public class MainListas {

	public static void main(String[] args) {
		int opcion = 0;
		String nombre;
		char respuesta = 0;
		Scanner teclado = new Scanner(System.in);
		ValidacionesListas validar = new ValidacionesListas();
		
		do {
		System.out.println("Bienvenid@ al supermercado Nervion");
		System.out.println("Introduce el nombre del cliente");
		nombre = teclado.next();
		System.out.println("Bienvenid@ " + nombre);
		
		
			do {
			validar.menuPrincipal();
			opcion = validar.leeryValidarOpcion();
		
			
				switch(opcion) {
					case 1:
						System.out.println("AnhadirProductoCodigo");
					break;
			
					case 2:
						System.out.println("AnahdirProductoNombre");
					break;
					
					case 3:
						System.out.println("ListaProducto");
					break;
					
					case 4:
						System.out.println("ObtenerMasBarato");
					break;
					
					case 5:
						System.out.println("ObtenerProductoCaro");
					break;
					
					case 6:
						System.out.println("ObtenerProductoMedio");
					break;
					
					case 7:
						System.out.println("ObtenerProductoMasVendido");
					break;
					
					case 8:
						System.out.println("ObtenerProductoMenosVendido");
					break;
					
					case 9:
						System.out.println("TerminarPedido");
					break;
				}
			}
			while(opcion != 9);
			System.out.println("Desea cambiar de usuario? (S/N)");
			respuesta = Character.toUpperCase(teclado.next().charAt(0));
		}
		while(respuesta != 'N');
		
		
		
		
	
		
		
		
	}

}
