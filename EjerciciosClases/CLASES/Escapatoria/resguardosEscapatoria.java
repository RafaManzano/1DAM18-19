public class resguardosEscapatoria {
	
	/*
	 * Interfaz
	 * Nombre: ComprobarCombinacion
	 * Comentario: Este metodo comprueba que la combinacion es correcta
	 * Cabecera: public int comprobarCombinacion(int numero1 , int numero2, int numero3, Cerrojo combinacion)
	 * Precondiciones: No hay
	 * Entrada: - int numero1
	 * 			- int numero2
	 * 			- int numero3
	 * 			- Cerrojo combiancion //Contiene la combinacion correcta
	 * Salida: - int resultado
	 * E/S: No hay
	 * Postcondiciones: Asociado al nombre,
	 * 					- 0 Ningun numero acertado
	 * 					- 1 Un numero acertado
	 * 					- 2 Dos numeros acertados
	 * 					- 3 Todos acertados y descubierta
	 * 
	*/
	
	public static int comprobarCombinacion(int numero1, int numero2, int numero3, Cerrojo combinacion) {
		System.out.println("En resguardo");
		return 1;
	}
	
	/*
	 * Interfaz
	 * Nombre: numerosAcertados
	 * Comentario: Este metodo pinta en pantalla el numero de aciertos que has obtenido
	 * Cabecera: public static void numerosAcertados (int numero)
	 * Precondiciones: No hay
	 * Entrada: - int numero //El numero de aciertos
	 * Salida: No hay
	 * E/S: No hay
	 * Postcondiciones: No hay, solo pinta en pantalla
	 * 
	*/
	public static void numerosAcertados(int numero) {
		System.out.println("En resguardo");
	}
	
	/*
	 * Interfaz
	 * Nombre: primeraPista
	 * Comentario: Este metodo pinta la primera pista en la pantalla
	 * Cabecera: public static void primeraPista(Cerrojo comb)
	 * Precondiciones: No hay
	 * Entrada: - Cerrojo comb //Es un objeto de cerrojo con la combinacion correcta para hacer la primera pista
	 * Salida: No hay
	 * E/S: No hay
	 * Postcondiciones: No hay, solo pinta en pantalla
	 * 
	*/
	
	public static void primeraPista (Cerrojo comb) {
		System.out.println("En resguardo");
	}	
	
	/*
	 * Interfaz
	 * Nombre: segundaPista
	 * Comentario: Este metodo pinta la segunda pista en la pantalla
	 * Cabecera: public static int segundaPista(Cerrojo comb)
	 * Precondiciones: No hay
	 * Entrada: - Cerrojo comb //Es un objeto de cerrojo con la combinacion correcta para hacer la segunda pista
	 * Salida: - int suma //Es la suma de los tres digitos
	 * E/S: No hay
	 * Postcondiciones: Asociado al nombre, es el resultado de la suma de los tres numeros de la combinacion
	 * 
	*/
	
	public static int segundaPista (Cerrojo comb) {
		System.out.println("En resguardo");
		return 1;
	}
	
	/*
	 * Interfaz
	 * Nombre: terceraPista
	 * Comentario: Este metodo pinta la tercera pista en la pantalla
	 * Cabecera: public static void terceraPista(Cerrojo comb)
	 * Precondiciones: No hay
	 * Entrada: - Cerrojo comb //Es un objeto de cerrojo con la combinacion correcta para hacer la segunda pista
	 * Salida: No hay
	 * E/S: No hay
	 * Postcondiciones: No hay, solo pinta en pantalla
	 * 
	*/
	
	public static void terceraPista(Cerrojo comb) {
		System.out.println("En resguardo");
	}
	

}

