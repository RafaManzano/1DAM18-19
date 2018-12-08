/*
 * 
 * 
 */

import java.util.*;
public class utilidadC {
	
	/*
	 * Estudio
	 * Nec: No hay
	 * Dev: No hay
	 * Nec/Dev: No hay
	 * Requisitos: No hay
	 * 
	 * Interfaz
	 * Nombre: pintarDecision
	 * Comentario: Pinta el menu para la decision de la figura
	 * Cabecera: void pintarDecision()
	 * Precondiciones: No hay
	 * Entrada: No hay
	 * Salida: No hay
	 * E/S: No hay
	 * Postcondiciones: Solo pinta en pantalla el menu
	 * 
	*/
	
	public static void pintarDecision () {
		System.out.println("Elija una opcion");
		System.out.println("1. Negro ");
		System.out.println("2. Rojo");
		System.out.println("3. J");
		System.out.println("4. Q");
		System.out.println("5. K");
		System.out.println("6. A");
	}
	
	/*
	 * Estudio
	 * Nec: No hay
	 * Dev: 1 numero // el numero de negros que han salido //Asociado al nombre
	 * Nec/Dev: No hay
	 * Requisitos: No hay
	 * 
	 * Interfaz
	 * Nombre: tirarDadosyComprobarNegros
	 * Comentario: Lanza los dados y comprueba en los seis dados el numero de veces que han salido negros
	 * Cabecera: int tirarDadosyComprobarNegros()
	 * Precondiciones: No hay
	 * Entrada: No hay
	 * Salida: 1 Numero //El numero de veces que salen los negros
	 * E/S: No hay
	 * Postcondiciones: Asociado al nombre. El numero de veces que salen los negros
	 * 
	*/
	
	public static int tirarDadosyComprobarNegros () {
		int cuenta = 0;
		Random random = new Random ();
		int dado1 = random.nextInt(6)+1;
		int dado2 = random.nextInt(6)+1;
		int dado3 = random.nextInt(6)+1;
		int dado4 = random.nextInt(6)+1;
		int dado5 = random.nextInt(6)+1;
		
		if (dado1 == 1) {
			cuenta++;
		}
			if (dado2 == 1) {
				cuenta++;
			}
				if (dado3 == 1) {
					cuenta++;
				}
					if (dado4 == 1) {
						cuenta++;
					}
						if (dado5 == 1) {
							cuenta++;
						}
							
							
		return cuenta;
	}
	
	/*
	 * Estudio
	 * Nec: No hay
	 * Dev: 1 numero // el numero de rojos que han salido //Asociado al nombre
	 * Nec/Dev: No hay
	 * Requisitos: No hay
	 * 
	 * Interfaz
	 * Nombre: tirarDadosyComprobarRojos
	 * Comentario: Lanza los dados y comprueba en los cinco dados el numero de veces que han salido rojos
	 * Cabecera: int tirarDadosyComprobarRojos()
	 * Precondiciones: No hay
	 * Entrada: No hay
	 * Salida: 1 Numero //El numero de veces que salen los rojos
	 * E/S: No hay
	 * Postcondiciones: Asociado al nombre. El numero de veces que salen los rojos
	 * 
	*/
	
	public static int tirarDadosyComprobarRojos () {
		int cuenta = 0;
		Random random = new Random ();
		int dado1 = random.nextInt(6)+1;
		int dado2 = random.nextInt(6)+1;
		int dado3 = random.nextInt(6)+1;
		int dado4 = random.nextInt(6)+1;
		int dado5 = random.nextInt(6)+1;
		if (dado1 == 2) {
			cuenta++;
		}
			if (dado2 == 2) {
				cuenta++;
			}
				if (dado3 == 2) {
					cuenta++;
				}
					if (dado4 == 2) {
						cuenta++;
					}
						if (dado5 == 2) {
							cuenta++;
						}
							
							
		return cuenta;
	}
	
	/*
	 * Estudio
	 * Nec: No hay
	 * Dev: 1 numero // el numero de jotas que han salido //Asociado al nombre
	 * Nec/Dev: No hay
	 * Requisitos: No hay
	 * 
	 * Interfaz
	 * Nombre: tirarDadosyComprobarJotas
	 * Comentario: Lanza los dados y comprueba en los cinco dados el numero de veces que han salido jotas
	 * Cabecera: int tirarDadosyComprobarJotas()
	 * Precondiciones: No hay
	 * Entrada: No hay
	 * Salida: 1 Numero //El numero de veces que salen los jotas
	 * E/S: No hay
	 * Postcondiciones: Asociado al nombre. El numero de veces que salen los jotas
	 * 
	*/
	
	public static int tirarDadosyComprobarJotas () {
		int cuenta = 0;
		Random random = new Random ();
		int dado1 = random.nextInt(6)+1;
		int dado2 = random.nextInt(6)+1;
		int dado3 = random.nextInt(6)+1;
		int dado4 = random.nextInt(6)+1;
		int dado5 = random.nextInt(6)+1;
		
		if (dado1 == 3) {
			cuenta++;
		}
			if (dado2 == 3) {
				cuenta++;
			}
				if (dado3 == 3) {
					cuenta++;
				}
					if (dado4 == 3) {
						cuenta++;
					}
						if (dado5 == 3) {
							cuenta++;
						}
							
							
		return cuenta;
	}
	
	/*
	 * Estudio
	 * Nec: No hay
	 * Dev: 1 numero // el numero de reinas que han salido //Asociado al nombre
	 * Nec/Dev: No hay
	 * Requisitos: No hay
	 * 
	 * Interfaz
	 * Nombre: tirarDadosyComprobarReinas
	 * Comentario: Lanza los dados y comprueba en los cinco dados el numero de veces que han salido reinas
	 * Cabecera: int tirarDadosyComprobarReinas()
	 * Precondiciones: No hay
	 * Entrada: No hay
	 * Salida: 1 Numero //El numero de veces que salen los reinas
	 * E/S: No hay
	 * Postcondiciones: Asociado al nombre. El numero de veces que salen los reinas
	 * 
	*/
	
	public static int tirarDadosyComprobarReinas () {
		int cuenta = 0;
		Random random = new Random ();
		int dado1 = random.nextInt(6)+1;
		int dado2 = random.nextInt(6)+1;
		int dado3 = random.nextInt(6)+1;
		int dado4 = random.nextInt(6)+1;
		int dado5 = random.nextInt(6)+1;
		
		if (dado1 == 4) {
			cuenta++;
		}
			if (dado2 == 4) {
				cuenta++;
			}
				if (dado3 == 4) {
					cuenta++;
				}
					if (dado4 == 4) {
						cuenta++;
					}
						if (dado5 == 4) {
							cuenta++;
						}
							
							
		return cuenta;
	}
	
	/*
	 * Estudio
	 * Nec: No hay
	 * Dev: 1 numero // el numero de reyes que han salido //Asociado al nombre
	 * Nec/Dev: No hay
	 * Requisitos: No hay
	 * 
	 * Interfaz
	 * Nombre: tirarDadosyComprobarReyes
	 * Comentario: Lanza los dados y comprueba en los cinco dados el numero de veces que han salido reyes
	 * Cabecera: int tirarDadosyComprobarReyes()
	 * Precondiciones: No hay
	 * Entrada: No hay
	 * Salida: 1 Numero //El numero de veces que salen los reyes
	 * E/S: No hay
	 * Postcondiciones: Asociado al nombre. El numero de veces que salen los reyes
	 * 
	*/
	
	public static int tirarDadosyComprobarReyes () {
		int cuenta = 0;
		Random random = new Random ();
		int dado1 = random.nextInt(6)+1;
		int dado2 = random.nextInt(6)+1;
		int dado3 = random.nextInt(6)+1;
		int dado4 = random.nextInt(6)+1;
		int dado5 = random.nextInt(6)+1;
		
		if (dado1 == 5) {
			cuenta++;
		}
			if (dado2 == 5) {
				cuenta++;
			}
				if (dado3 == 5) {
					cuenta++;
				}
					if (dado4 == 5) {
						cuenta++;
					}
						if (dado5 == 5) {
							cuenta++;
						}
							
							
		return cuenta;
	}
	
	/*
	 * Estudio
	 * Nec: No hay
	 * Dev: 1 numero // el numero de ases que han salido //Asociado al nombre
	 * Nec/Dev: No hay
	 * Requisitos: No hay
	 * 
	 * Interfaz
	 * Nombre: tirarDadosyComprobarAses
	 * Comentario: Lanza los dados y comprueba en los cinco dados el numero de veces que han salido ases
	 * Cabecera: int tirarDadosyComprobarAses()
	 * Precondiciones: No hay
	 * Entrada: No hay
	 * Salida: 1 Numero //El numero de veces que salen los ases
	 * E/S: No hay
	 * Postcondiciones: Asociado al nombre. El numero de veces que salen los ases
	 * 
	*/
	
	public static int tirarDadosyComprobarAses () {
		int cuenta = 0;
		Random random = new Random ();
		int dado1 = random.nextInt(6)+1;
		int dado2 = random.nextInt(6)+1;
		int dado3 = random.nextInt(6)+1;
		int dado4 = random.nextInt(6)+1;
		int dado5 = random.nextInt(6)+1;
		
		if (dado1 == 6) {
			cuenta++;
		}
			if (dado2 == 6) {
				cuenta++;
			}
				if (dado3 == 6) {
					cuenta++;
				}
					if (dado4 == 6) {
						cuenta++;
					}
						if (dado5 == 6) {
							cuenta++;
						}
							
							
		return cuenta;
	}
	
	/*
	 * Estudio
	 * Nec: 2 numeros //La suma de cada puntuacion //Por valor
	 * Dev: 1 Numero //Asociado al nombre - 0 Empate
	 * 									  - 1 Ganador J1
	 * 									  - 2 Ganador J2
	 * Nec/Dev: No hay
	 * Requisitos: No hay
	 * 
	 * Interfaz
	 * Nombre: comprobarGanador
	 * Comentario: Este subprograma decide quien es el ganador
	 * Cabecera: int comprobarGanador (int J1, int J2)
	 * Precondiciones: No hay
	 * Entrada: - int J1 //La suma total del J1
	 * 			- int J2 //La suma total del J2
	 * 
	 * Salida: - int ganador
	 * E/S: No hay
	 * Postcondiciones: Asociado al nombre, decide con un numero cual es el ganador o si la partida ha acabado en empate
	 * 
	*/
	
	public static int comprobarGanador (int J1, int J2) {
		int ganador = 0;
		
		if (J1 > J2) {
			ganador = 1;
		}
		else if (J2 > J1) {
				ganador = 2;
			 }
		return ganador;
	}
	
	
}

