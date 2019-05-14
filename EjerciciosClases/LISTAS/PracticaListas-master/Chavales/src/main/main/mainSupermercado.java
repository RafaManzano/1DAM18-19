package main.main;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import gestoras.GestionSupermercado;
import main.java.model.OrderLine;
import main.java.model.Product;
import main.java.model.Supermarket;
import main.java.util.CodeUtils;
import validacion.Validaciones;

/*
 * Nombre del programa: mainSupermercado
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
public class mainSupermercado {

	public static void main(String[] args) {
		int opcion = 0;
		String nombre;
		char respuesta = 0;
		Product producto;
		double media;
		int code;
		String name;
		double price;
		Scanner teclado = new Scanner(System.in);
		Validaciones validar = new Validaciones();
		Supermarket merca = new Supermarket("La tienda de Nzhdeh", CodeUtils.getProductCode());
		GestionSupermercado gestion = new GestionSupermercado();
		
		List<OrderLine> orderLines = new ArrayList<OrderLine>();
		Product p1 = new Product(CodeUtils.getProductCode(), "Champú 5L Familiar", 25.00, merca);
        Product p2 = new Product(CodeUtils.getProductCode(), "Cerveza Alhambra 1925", 1.00, merca);
        Product p3 = new Product(CodeUtils.getProductCode(), "Aceitunas chupadeos", 1.0, merca);
        Product p4 = new Product(CodeUtils.getProductCode(), "Pizza 4 quesos", 1.0, merca);

        merca.addProduct(p1);
        merca.addProduct(p2);
        merca.addProduct(p3);
        merca.addProduct(p4);
		
		do {
		System.out.println("Bienvenid@ al supermercado Nervion");
		nombre = validar.leerNombre();
		System.out.println("Bienvenid@ " + nombre);
		
		
			do {
			opcion = validar.leerYValidarOpcionMenuPrincipal();
			
				switch(opcion) {
					case 1:
						code = validar.leerYValidarCodigo();
						producto = gestion.buscarProductoCodigo(code, merca.getProducts());
						merca.addProduct(producto);
						//No se si es esto pero es lo que he entendido
					break;
			
					case 2:
						//System.out.println("AnahdirProductoNombre");
						name = validar.leerNombreProducto();
						producto = gestion.buscarProductoNombre(name, merca.getProducts());
						merca.addProduct(producto);
						//No se si es esto pero es lo que he entendido
					break;
					
					case 3:
						//System.out.println("ListaProducto");
						gestion.mostrarListaProductos(merca.getProducts());
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
						System.out.println("Se finaliza el pedido");
					break;
				}
			}
			while(opcion != 9);
			respuesta = validar.leerYValidarNuevoUsuario();
		}
		while(respuesta != 'N');
		
	}

}
