package main.main;

import java.util.Scanner;

public class ValidacionesListas {

	/*
    Interfaz
    Nombre: menuPrincipal
    Comentario: Este subprograma muestra el menu de opciones
    Cabecera: public void menuPrincipal()
    Precondiciones: No hay
    Entrada: No hay
    Salida: No hay
    E/S: No hay
    Postcondiciones: No hay, Solo pinta en pantalla el menu principal
    */
	public void menuPrincipal() {
		System.out.println("MENU PRINCIPAL");
		System.out.println("1. AnhadirProductoCodigo");
		System.out.println("2. AnahdirProductoNombre");
		System.out.println("3. ListaProducto");
		System.out.println("4. ObtenerMasBarato");
		System.out.println("5. ObtenerProductoCaro");
		System.out.println("6. ObtenerProductoMedio");
		System.out.println("7. ObtenerProductoMasVendido");
		System.out.println("8. ObtenerProductoMenosVendido");
		System.out.println("9. TerminarPedido");
	}
	
	/*
    Interfaz
    Nombre: leeryValidarOpcion
    Comentario: Este subprograma lee y valida la opcion del menu
    Cabecera: public int leeryValidarOpcion()
    Precondiciones: No hay
    Entrada: No hay
    Salida: int opcion //La opcion del menu ya validada
    E/S: No hay
    Postcondiciones: Asociado al nombre, la opcion queda validada
    */

    public int leeryValidarOpcion() {
        Scanner teclado = new Scanner(System.in);
        int opcion = 0;
        do{
            System.out.println("La opcion tiene que ser de 1 a 9");
            opcion = teclado.nextInt();
        }
        while(opcion < 1 || opcion > 9);

        return opcion;
    }
}
