package metodos;

import clases.JugadorImp;
import enumerados.TipoNombreFicha;

public class utilidadesMonopoli {

	/*
	 * Interfaz
	 * Nombre: menuFicha
	 * Comentario: Este subprograma pinta las fichas para su eleccion
	 * Cabecera: public static void menuFicha()
	 * Precondiciones: No hay
	 * Entrada: No hay
	 * Salida: No hay
	 * E/S: No hay
	 * Postcondiciones: No hay, solo pinta en pantalla
	 */
	
	public static void menuFicha() {
		System.out.println("Elija su preferida");
		System.out.println("1. Barco");
		System.out.println("2. Sombrero");
		System.out.println("3. Zapato ");
		System.out.println("4. Perro");
		System.out.println("5. Plancha");
		System.out.println("6. Coche");
		System.out.println("7. Carro");
		System.out.println("8. Dedal");
	}

	/*
	 * Interfaz
	 * Nombre: elegirFicha
	 * Comentario: Este subprograma elige una ficha y la añade al jugador
	 * Cabecera: public static JugadorImp elegirFicha(int opcion, JugadorImp jug)
	 * Precondiciones: No hay
	 * Entrada: - int opcion //Es la opcion elegida
	 * 			- JugadorImp jug //Es el jugador al que se le añade la ficha
	 * Salida: - Jugador jug //Es el mismo jugador pero con atributos cambiados
	 * E/S: No hay
	 * Postcondiciones: Asociado al nombre, el jugador con atributos modificados
	 
	public static JugadorImp elegirFicha(int opcion, JugadorImp jug) {
		TipoNombreFicha f = null;
		switch(opcion) {
		case 1:
			jug.setNombreFicha(f.BARCO);
		break;
		
		case 2:
			jug.setNombreFicha(f.SOMBRERO);
		break;
			
		case 3:
			jug.setNombreFicha(f.ZAPATO);
		break;
				
		case 4:
			jug.setNombreFicha(f.PERRO);
		break;
				
		case 5:
			jug.setNombreFicha(f.PLANCHA);
		break;
				
		case 6:
			jug.setNombreFicha(f.COCHE);
		break;
				
		case 7:
			jug.setNombreFicha(f.CARRO);
		break;
			
		case 8:
			jug.setNombreFicha(f.DEDAL);
		break;
		}
		return jug;
		
	}
  */
	
	/*
	 * Interfaz
	 * Nombre: elegirNombreFicha
	 * Comentario: Este subprograma carga los nombre de ficha
	 * Cabecera: public TipoNombreFicha[] elegirNombreFicha ()
	 * Precondiciones: No hay
	 * Entrada: No hay
	 * Salida: TipoNombreFicha[] un array para almacenar todos los nombres
	 * E/S: No hay
	 * Postcondiciones: Asociado al nombre, un array que almacene todas las posibilidades para las fichas
	 */
	
	public static TipoNombreFicha[] elegirNombreFicha() {
		TipoNombreFicha f = null;
		TipoNombreFicha[] nombres = {f.BARCO, f.SOMBRERO, f.ZAPATO, f.PERRO, f.PLANCHA, f.COCHE, f.CARRO,f.DEDAL};
		return nombres;
	}
}
