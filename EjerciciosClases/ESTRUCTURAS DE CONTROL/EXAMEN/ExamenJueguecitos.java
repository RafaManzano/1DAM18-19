/*
 * Nombre del programa: ExamenJueguecitos
 * Breve Comentario: Un menu con 3 juegos diferentes
 * 
 * Analisis:
 * 	Entrada: - Opcion
 * 			 - Respuesta
 * 			 - Palo
 * 			 - Numero
 * 			 - Caracter
 * 			 - Carta
 * 			 - partida
 * 
 * 	Salida: - Mensajes con el usuario
 * 			- Mensajes ganador jugada parcial
 * 			- Mensaje ganador final
 * 
 * 	Requisitos: - opcion esta entre 0 y 3 ambos inclusive
 * 			    - respuesta tiene que ser s o n
 * 				- palo sera del 1 al 4 ambos inclusive (1. Oro, 2. Espada, 3. Bastos, 4. Copas)			
 * 				- numero debe ser impar entre 5 y 30 ambos inclusive
 * 				- caracter tiene que ser * o + o a
 * 				- carta del 1 al 12 // 10 , 11 y 12 son figuras
 * 				- partida tiene que ser mayor que 1
 * 
 * PG Level 0
 * Inicio
 * 	LeeryValidarOpcion
 * 	MientrasNoSeaSalir
 * 		Segun (opcion)
 * 		para caso 1:
 * 			PintarCuadrado
 * 		para caso 2:
 * 			Narcisista
 * 		para caso 3:
 * 			CartaMagica
 * 		FinSegun
 * 		LeeryValidarOpcion
 * 	FinMientras
 * Fin
 * 
 * Modulo PintarCuadrado
 * Inicio
 * 	LeeryValidarRespuesta
 * 	MientrasRespuestaSeaSi
 * 		LeeryValidarNumero
 * 		LeeryValidarCaracter
 * 		EmpezarPintarCuadrado
 * 		LeeryValidarRespuesta
 * 	FinMientras
 * Fin
 * 
 * //Narcicista esta en construccion puesto que no sabemos nada de el
 * 
 * Modulo CartaMagica
 * Inicio
 * 	LeeryValidarRespuesta
 * 	MientrasRespuestaSeaSi
 * 		LeeryValidarPartidas
 * 		Partida
 * 		MostrarGanador
 * 		LeeryValidarRespuesta
 * 	FinMientras
 * Fin
 * 
 * Modulo Partida
 * Inicio
 * 	Para (Partidas deseadas)
 * 		EscogerCartaAlAzar
 * 		ComprobarGanador
 * 		MostrarPuntuacion
 * 	FinPara
 * Fin
 */
 
import java.util.*; //Para la clase Scanner y Random
import java.io.*;
public class ExamenJueguecitos {
	
	public static void main (String[] args) {
		
		//Declaracion de variables
		int opcion;
		char respuesta;
		int palo;
		int numero;
		char caracter;
		int carta;
		int rival;
		int partida;
		int puntuacionJ1 = 0;
		int puntuacionrival = 0;
		int gana = 1;
		int empate = 0;
		int turno = 1;
		Scanner teclado = new Scanner (System.in);
		Random random = new Random();
		
		/*
		 * Nombre: Opcion0a3
		 * VCB: Centinela
		 * Incializacion VCB: Lectura anticipada, antes de la primera iteracion
		 * Actualizacion VCB: Lectura final, fisicamente al final del bucle
		 * Condicion de salida: opcion >= 0 && opcion <= 3
		 * Condicion de entrada: opcion < 0 || opcion > 3
		 */
		//LeeryValidarOpcion
		do {
			System.out.println("Elija su opcion");
			System.out.println("1. Pintar Cuadrado");
			System.out.println("2. Narcisista");
			System.out.println("3. Carta Magica");
			System.out.println("0. Salir");
			opcion = teclado.nextInt();
		}
		while(opcion < 0 || opcion > 3);
		/*
		 * Nombre: OpcionSalir
		 * VCB: Centinela
		 * Incializacion VCB: Lectura anticipada, antes de la primera iteracion
		 * Actualizacion VCB: Lectura final, fisicamente al final del bucle
		 * Condicion de salida: opcion == 0
		 * Condicion de entrada: opcion != 0
		 */
		//MientrasOpcionNoSeaSalir
		while (opcion != 0) {
			switch (opcion) {
				case 1:
					//System.out.println("Pintar Cuadrado");
					/*
					*  Nombre: ValidarRespuesta
						 * VCB: Centinela
						 * Incializacion VCB: Lectura anticipada, antes de la primera iteracion
						 * Actualizacion VCB: Lectura final, fisicamente al final del bucle
						 * Condicion de salida: respuesta == 's' || respuesta == 'n'
						 * Condicion de entrada: respuesta != 's' && respuesta != 'n'
						*/
					//LeeryValidarRespuesta
					do {
						System.out.println("Desea ejecutar? (S/N)");
						respuesta = Character.toLowerCase(teclado.next().charAt(0));
					}
					while(respuesta != 's' && respuesta != 'n');
					
					/*
					*  Nombre: ValidarSi
						 * VCB: Centinela
						 * Incializacion VCB: Lectura anticipada, antes de la primera iteracion
						 * Actualizacion VCB: Lectura final, fisicamente al final del bucle
						 * Condicion de salida: respuesta == 'n'
						 * Condicion de entrada: respuesta == 's'
						*/
					//MientrasRespuestaSeaSi
					while(respuesta == 's') {
						
						/*
						*  Nombre: ValidarNumero
						 * VCB: Centinela
						 * Incializacion VCB: Lectura anticipada, antes de la primera iteracion
						 * Actualizacion VCB: Lectura final, fisicamente al final del bucle
						 * Condicion de salida: (numero >= 5 && numero <= 30) && numero % 2 != 0
						 * Condicion de entrada:(numero < 5 || numero > 30) || numero % 2 == 0
						*/
						//LeeryValidarNumero
						do {
							System.out.println("Introduzca su numero para las filas y las columnas (impares de 5 a 30)");
							numero = teclado.nextInt();
						}
						while((numero < 5 || numero > 30) || numero % 2 == 0);
						
						/*
						*  Nombre: ValidarCaracter
						 * VCB: Centinela
						 * Incializacion VCB: Lectura anticipada, antes de la primera iteracion
						 * Actualizacion VCB: Lectura final, fisicamente al final del bucle
						 * Condicion de salida: caracter == '*' || caracter == '+' || caracter == 'a'
						 * Condicion de entrada: caracter != '*' && caracter != '+' && caracter != 'a'
						*/
						//LeeryValidarCaracter
						do {
							System.out.println("Introduzca su caracter (* , + , a)");
							caracter = Character.toLowerCase(teclado.next().charAt(0));
						}
						while(caracter != '*' && caracter != '+' && caracter != 'a');
						
						//EmpezarPintarCuadrado
						System.out.println("En construccion");
						//LeeryValidarRespuesta
						do {
							System.out.println("Desea ejecutar? (S/N)");
							respuesta = Character.toLowerCase(teclado.next().charAt(0));
						}
						while(respuesta != 's' && respuesta != 'n');
					}
				break;
				
				case 2:
					//System.out.println("Narcisista");
					System.out.println("En construccion");
				break;
				
				case 3:
					//System.out.println("Carta Magica");
					/*
					*  Nombre: ValidarRespuesta
						 * VCB: Centinela
						 * Incializacion VCB: Lectura anticipada, antes de la primera iteracion
						 * Actualizacion VCB: Lectura final, fisicamente al final del bucle
						 * Condicion de salida: respuesta == 's' || respuesta == 'n'
						 * Condicion de entrada: respuesta != 's' && respuesta != 'n'
						*/
					//LeeryValidarRespuesta
					do {
						System.out.println("Desea ejecutar? (S/N)");
						respuesta = Character.toLowerCase(teclado.next().charAt(0));
					}
					while(respuesta != 's' && respuesta != 'n');
					
					/*
					*  Nombre: ValidarSi
						 * VCB: Centinela
						 * Incializacion VCB: Lectura anticipada, antes de la primera iteracion
						 * Actualizacion VCB: Lectura final, fisicamente al final del bucle
						 * Condicion de salida: respuesta == 'n'
						 * Condicion de entrada: respuesta == 's'
						*/
					//MientrasRespuestaSeaSi
					while(respuesta == 's') {
						
						/*
					*  Nombre: ValidarPartida
						 * VCB: Centinela
						 * Incializacion VCB: Lectura anticipada, antes de la primera iteracion
						 * Actualizacion VCB: Lectura final, fisicamente al final del bucle
						 * Condicion de salida: partida >= 1
						 * Condicion de entrada: partida < 1
						*/
						//LeeryValidarPartida
						do {
							System.out.println("Cuantas partidas se jugaran? (Minimo 1)");
							partida = teclado.nextInt();
						}
						while(partida < 1);
						//Partida
						/*
						 * Nombre: PartidaAJugar
						 * VCB: Contador
						 * Inicializacion VCB: Antes de la primera iteracion 0/1
						 * Actualizacion VCB: Al final de cada iteracion
						 * Condicion de salida: contador > partida
						 * Condicion de entrada: contador <= partida
						 * 
						*/
						//Para(Partidas deseadas)
						for (int contador = 0; contador <= partida; contador++) {
							//EscogerCartaAlAzar
							carta = random.nextInt(12)+1;
							//rival = random.nextInt(11)+1;
							palo = random.nextInt(4)+1;
							
							//ComprobarGanador
							if (turno == 1) { //Turno del J1
							if(palo == 2) {
								System.out.println("La carta es " + carta + " de espada");
								puntuacionJ1 += gana;
								turno = 1;
							}
							else if (palo == 1 && (carta == 10 || carta == 11 || carta == 12)) {
									System.out.println("La carta es " + carta + " de oros");
										puntuacionJ1 += gana;
										turno = 1;						
								 }
								 else if(palo == 3 && carta == 1) {
									 System.out.println("La carta es " + carta + " de bastos");
									 puntuacionJ1 += gana;
									 turno = 1;
									 }
									 
									 else if(palo == 3 && carta != 1) {
												System.out.println("La carta es " + carta + " de bastos");
												puntuacionrival += gana;
												turno = 2;
										  }
										  
										  else if(palo == 4 && carta == 2) {
											  System.out.println("La carta es " + carta + " de copas");
											  puntuacionrival += gana;
											  turno = 2;
												}
												
												else {
													System.out.println("La carta no es ninguna de las que pierden ni ganan");
													empate++;
													turno = 1;
												}
						}
						else { //Turno del rival
							if(palo == 2) {
								System.out.println("La carta es " + carta + " de espada");
								puntuacionrival += gana;
								turno = 2;
							}
							else if (palo == 1 && (carta == 10 || carta == 11 || carta == 12)) {
									System.out.println("La carta es " + carta + " de oros");
										puntuacionrival += gana;
										turno = 2;						
								 }
								 else if(palo == 3 && carta == 1) {
									 System.out.println("La carta es " + carta + " de bastos");
									 puntuacionrival += gana;
									 turno = 2;
									 }
									 
									 else if(palo == 3 && carta != 1) {
												System.out.println("La carta es " + carta + " de bastos");
												puntuacionJ1 += gana;
												turno = 1;
										  }
										  
										  else if(palo == 4 && carta == 2) {
											  System.out.println("La carta es " + carta + " de copas");
											 puntuacionJ1 += gana;
											  turno = 1;
												}
												
												else {
													System.out.println("La carta no es ninguna de las que pierden ni ganan");
													empate++;
													turno = 2;
												}
						}	
						
						/*					
						if (turno == 1) {
							puntuacionJ1 = gana;
						}
						else {
							puntuacionrival = pierde;
						}
						*/
						//MostrarPuntuacion
						System.out.println("Puntuaciones");
						System.out.println("Jugador : " + puntuacionJ1);
						System.out.println("Maquina: " + puntuacionrival);
						System.out.println("Empates: " + empate);
											
										  
									
						}
						
						//MostrarGanador
						if(puntuacionJ1 > puntuacionrival) {
							System.out.println("Felicidades, el Jugador ha ganado el juego");
						}
						else if(puntuacionJ1 < puntuacionrival) {
								System.out.println("Felicidades, la maquina  ha ganado el juego");
							 }
							 else {
								 System.out.println("Nadie ha ganado, ha habido un empate");
							 }
						puntuacionJ1 = 0;
						puntuacionrival = 0;
						empate = 0;
						/*
					*  Nombre: ValidarRespuesta
						 * VCB: Centinela
						 * Incializacion VCB: Lectura anticipada, antes de la primera iteracion
						 * Actualizacion VCB: Lectura final, fisicamente al final del bucle
						 * Condicion de salida: respuesta == 's' || respuesta == 'n'
						 * Condicion de entrada: respuesta != 's' && respuesta != 'n'
						*/
					//LeeryValidarRespuesta
					do {
						System.out.println("Desea ejecutar? (S/N)");
						respuesta = Character.toLowerCase(teclado.next().charAt(0));
					}
					while(respuesta != 's' && respuesta != 'n');
					}
				break;
			}
			
			/*
			 * Nombre: Opcion0a3
			 * VCB: Centinela
			 * Incializacion VCB: Lectura anticipada, antes de la primera iteracion
			 * Actualizacion VCB: Lectura final, fisicamente al final del bucle
			 * Condicion de salida: opcion >= 0 && opcion <= 3
			 * Condicion de entrada: opcion < 0 || opcion > 3
			 */
			//LeeryValidarOpcion
			do {
				System.out.println("Elija su opcion");
				System.out.println("1. Pintar Cuadrado");
				System.out.println("2. Narcisista");
				System.out.println("3. Carta Magica");
				System.out.println("0. Salir");
				opcion = teclado.nextInt();
			}
			while(opcion < 0 || opcion > 3);
		}
	}
}

