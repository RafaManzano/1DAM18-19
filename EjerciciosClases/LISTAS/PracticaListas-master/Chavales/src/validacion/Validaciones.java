package validacion;

import java.util.Scanner;

public class Validaciones {

	 	/* Interfaz
		 * 	Comentario: este metodo pintara por pantalla el menu principal.
		 * 	Nombre: MenuPrincipal
		 * 	Cabecera: public void MenuPrincipal()
		 * 	Precondiciones: no hay
		 * 	Entrada: no hay
		 * 	Salida: no hay
		 * 	Postcondicones: no hay, pinta por pantalla el menu principal.
		 */
		public void MenuPrincipal() {
				  
				 System.out.println("-----------------------------------");
				 System.out.println("+       MenuPrincipal            +");
				 System.out.println("------------------------------------");
				 System.out.println("| 0. - Salir del menu              |");
				 System.out.println("| 1. - AnhadirProductoCodigo       |");
				 System.out.println("| 2. - AnahdirProductoNombre       |");
				 System.out.println("| 3. - ListaProducto               |");
				 System.out.println("| 4. - ObtenerMasBarato            |");
				 System.out.println("| 5. - ObtenerProductoCaro         |");
				 System.out.println("| 6. - ObtenerProductoMedio        |");
				 System.out.println("| 7. - ObtenerProductoMasVendido   |");
				 System.out.println("| 8. - ObtenerProductoMenosVendido |");
				 System.out.println("------------------------------------"); 
				  
		}	
	
		/* Interfaz
		 * 	Comentario: este metodo lee y valida la opcion del menu principal.
		 * 	Nombre: leerYValidarOpcionMenuPrincipal
		 * 	Cabecera: public int leerYValidarOpcionMenuPrincipal()
		 * 	Precondiciones: no hay
		 * 	Entrada: no hay
		 * 	Salida: int opcion
		 * 	Postcondicones: devuelve un entero con la opcion AN.
		 */
		public int leerYValidarOpcionMenuPrincipal() {
			int opcion = 0;
			Scanner teclado = new Scanner(System.in);
			do {
				MenuPrincipal();
				opcion = teclado.nextInt();
			}while(opcion < 0 || opcion > 8);
			
			return opcion;
		}
				
		/* Interfaz
		 * 	Comentario: este metodo lee el nombre del usuario.
		 * 	Nombre: leerNombre
		 * 	Cabecera: public String leerNombre()
		 * 	Precondiciones: no hay
		 * 	Entrada: no hay
		 * 	Salida: String nombre
		 * 	Postcondicones: devuelve una cadena con el nombre del usuario AN.
		 */
		public String leerNombre(){
	        Scanner teclado = new Scanner(System.in);
	        String nombre;

	        System.out.print("Introduce tu nombre: ");
	        nombre = teclado.nextLine();

	        return nombre;
	    }
		
		/* Interfaz
		 * 	Comentario: este metodo lee el nombre del producto.
		 * 	Nombre: leerNombreProducto
		 * 	Cabecera: public String leerNombreProducto()
		 * 	Precondiciones: no hay
		 * 	Entrada: no hay
		 * 	Salida: String nombre
		 * 	Postcondicones: devuelve una cadena con el nombre del producto AN.
		 */
		public String leerNombreProducto(){
	        Scanner teclado = new Scanner(System.in);
	        String nombre;

	        System.out.print("Introduce el nombre del producto que desea comprar: ");
	        nombre = teclado.nextLine();

	        return nombre;
	    }
		
		/* Interfaz
		 * 	Comentario: este metodo lee y valida el cambio de usuario.
		 * 	Nombre: leerYValidarNuevoUsuario
		 * 	Cabecera: public char leerYValidarNuevoUsuario()
		 * 	Precondiciones: no hay
		 * 	Entrada: no hay
		 * 	Salida: char respuesta
		 * 	Postcondicones: devuelve un caracter con la opcion de cambiar a nuevo usuario AN.
		 */
		public char leerYValidarNuevoUsuario(){
	        Scanner teclado = new Scanner(System.in);
	        char respuesta;
	        do{
	        	System.out.println("Desea cambiar de usuario? [S] o [N]");
				respuesta = Character.toUpperCase(teclado.next().charAt(0));
	        }while(respuesta != 'S' && respuesta != 'N');

	        return respuesta;
	    }
		
		
		/* Interfaz
		 * 	Comentario: este metodo lee y valida el codigo del producto.
		 * 	Nombre: leerYValidarCodigo
		 * 	Cabecera: public int leerYValidarCodigo()
		 * 	Precondiciones: no hay
		 * 	Entrada: no hay
		 * 	Salida: int codigo
		 * 	Postcondicones: devuelve un entero con el codigo del producto AN.
		 */
		public int leerYValidarCodigo(){
	        Scanner teclado = new Scanner(System.in);
	        int codigo = 0;;
	        do{
	        	System.out.print("Introduce el codigo del producto que desea comprar: ");
				codigo = teclado.nextInt();
	        }while(codigo <= 0);

	        return codigo;
	    }
		
		/* Interfaz
		 * 	Comentario: este metodo lee y valida el codigo del producto.
		 * 	Nombre: leerYValidarPrecio
		 * 	Cabecera: public double leerYValidarPrecio()
		 * 	Precondiciones: no hay
		 * 	Entrada: no hay
		 * 	Salida: double precio
		 * 	Postcondicones: devuelve un entero con el precio del producto AN.
		 */
		public double leerYValidarPrecio(){
	        Scanner teclado = new Scanner(System.in);
	        double precio = 0.;
	        do{
	        	System.out.print("Introduce la cantidad que desea comprar de este producto: ");
	        	precio = teclado.nextDouble();
	        }while(precio <= 0.0);

	        return precio;
	    }
		
}
