package metodos;

import java.util.Random;

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
	 * Comentario: Este subprograma elige una ficha y la a�ade al jugador
	 * Cabecera: public static JugadorImp elegirFicha(int opcion, JugadorImp jug)
	 * Precondiciones: No hay
	 * Entrada: - int opcion //Es la opcion elegida
	 * 			- JugadorImp jug //Es el jugador al que se le a�ade la ficha
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
	
	/*
	 * Interfaz
	 * Nombre: ponerNull
	 * Comentario: Este subprograma pone a null la posicion del array para que no se pueda volver a elegir
	 * Cabecera: public static TipoNombreFicha[] ponerNull (int posicion, TipoNombreFicha[] array)
	 * Precondiciones: Posicion tiene que estar entre 0 y 7
	 * Entrada: - int posicion //Esta es la posicion del array para ponerlo a null
	 * 			- TipoNombreFicha[] array //Es el array al que se le a�ade el null
	 * Salida: -TipoNombreFicha[] array //Es el mismo array pero con modificaciones
	 * E/S: No hay
	 * Postcondiciones: Asociado al nombre, el mismo array pero modificado
	 */
	public static TipoNombreFicha[] ponerNull(int opcion, TipoNombreFicha[] array) {
		array[opcion] = null;
		return array;
	}
	
	/*
	 * Interfaz
	 * Nombre: OrdenTiradaInicial
	 * Comentario: Este subprograma decide cual es el orden de tiradas
	 * Cabecera: public static void ordenTiradaInicial(JugadorImp j1, JugadorImp j2, JugadorImp j3, JugadorImp j4)
	 * Precondiciones: No hay
	 * Entrada: - JugadorImp j1
	 * 			- JugadorImp j2
	 * 			- JugadorImp j3
	 * 			- JugadorImp j4
	 * Salida: No hay
	 * E/S: No hay
	 * Postcondiciones: No hay, solo cambia un valor de cada objeto para su orden en el juego
	 */
	
	public static void ordenTiradaInicial(JugadorImp j1, JugadorImp j2, JugadorImp j3, JugadorImp j4) {
		int[] array = {0,1,2,3};
		Random random = new Random();
		
		for(int i = 0; i < 4; i++) {
			switch(i) {
			case 0:
				do {
					j1.setTurno(array[random.nextInt(4)]);
				}
				while(j1.getTurno() == -1);
				utilidadesMonopoli.escribirNulos(j1.getTurno(), array);
			break;
			
			case 1:
				do {
					j2.setTurno(array[random.nextInt(4)]);
				}
				while(j2.getTurno() == -1);
				utilidadesMonopoli.escribirNulos(j2.getTurno(), array);
			break;
			
			case 2:
				do {
					j3.setTurno(array[random.nextInt(4)]);
				}
				while(j3.getTurno() == -1);
				utilidadesMonopoli.escribirNulos(j3.getTurno(), array);
			break;
			
			case 3:
				do {
					j4.setTurno(array[random.nextInt(4)]);
				}
				while(j4.getTurno() == -1);
				utilidadesMonopoli.escribirNulos(j4.getTurno(), array);
			break;
			}
		}
	}
	
	/*
	 * Interfaz
	 * Nombre: escribirNulos
	 * Comentario: Este subprograma pone a -1 la posicion del array para que no se pueda volver a elegir
	 * Cabecera: public static int[] escribirMenosUno (int posicion, int[] array)
	 * Precondiciones: Posicion tiene que estar entre 0 y 3
	 * Entrada: - int posicion //Esta es la posicion del array para ponerlo a -1
	 * 			- int[] array //Es el array al que se le a�ade el -1
	 * Salida: -int[] array //Es el mismo array pero con modificaciones
	 * E/S: No hay
	 * Postcondiciones: Asociado al nombre, el mismo array pero modificado
	 */
	public static int[] escribirNulos(int posicion, int[] array) {
		array[posicion] = -1;
		return array;
	}

	/*
	 * Interfaz
	 * Nombre: decidirTurno
	 * Comentario: Este subprograma decide que turno es el necesario y el jugador que lo tiene
	 * Cabecera: public static JugadorImp decidirTurno (int turno, JugadorImp j1, JugadorImp j2, JugadorImp j3, JugadorImp j4)
	 * Precondiciones: turno tiene que ser de 0 a 3
	 * Entrada: - int turno //Es el turno buscado
	 * 			- JugadorImp j1 //Es el primer jugador
	 * 	  		- JugadorImp j2 //Es el segundo jugador
	 * 			- JugadorImp j3 //Es el tercer jugador 
	 * 			- JugadorImp j4 //Es el cuarto jugador
	 * 
	 * Salida: - JugadorImp jug //Es el jugador que tira en ese turno
	 * E/S: No hay
	 * Postcondiciones: Asociado al nombre, es el jugador que tira en ese turno
	 */
	public static JugadorImp decidirTurno(int turno, JugadorImp j1, JugadorImp j2, JugadorImp j3, JugadorImp j4) {
		return j1;
	}
	
}
