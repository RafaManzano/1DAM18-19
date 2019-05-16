package main.main;

import java.util.Scanner;

import main.java.model.Product;
import main.java.model.Supermarket;
import main.java.util.Gestion;

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
		String nombreProducto;
		char respuesta = 0;
		Product producto;
		double media;
		Scanner teclado = new Scanner(System.in);
		ValidacionesListas validar = new ValidacionesListas();
		Supermarket merca = new Supermarket("La tienda de Nzhdeh", 2);
		Gestion gestion = new Gestion();
		
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
						//System.out.println("AnahdirProductoNombre");
						System.out.println("Introduce el nombre del producto");
						nombreProducto = teclado.next();
						producto = gestion.buscarProductoPorNombre(nombre, merca.getProducts());
					break;
					
					case 3:
						System.out.println("ListaProducto");
					break;
					
					case 4:
						//System.out.println("ObtenerMasBarato");
						producto = merca.getMinPriceProduct();
						System.out.println(producto.toString());
						
					break;
					
					case 5:
						//System.out.println("ObtenerProductoCaro");
						producto = merca.getMaxPriceProduct();
						System.out.println(producto.toString());
					break;
					
					case 6:
						//System.out.println("ObtenerProductoMedio");
						media = merca.getAvgPriceProduct();
						System.out.println(media);
					break;
					
					case 7:
						System.out.println("ObtenerProductoMasVendido en construccion");
						
					break;
					
					case 8:
						System.out.println("ObtenerProductoMenosVendido en construccion");
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
