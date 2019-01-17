public class metodosEscapatoria {
	
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
		int resultado = 0;
		
		if(numero1 == combinacion.getNumero1() && numero2 == combinacion.getNumero2() && numero3 == combinacion.getNumero3()) {
			resultado = 3;
			combinacion.setOculto(false);
		}
		else if((numero1 == combinacion.getNumero1() && numero2 == combinacion.getNumero2()) || (numero2 == combinacion.getNumero2() && numero3 == combinacion.getNumero3()) || (numero1 == combinacion.getNumero1() && numero3 == combinacion.getNumero3())) {
			resultado = 2;
			}
			else if(numero1 == combinacion.getNumero1() || numero2 == combinacion.getNumero2() || numero3 == combinacion.getNumero3()) {
				resultado = 1;
			}
			return resultado;
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
		switch(numero) {
			case 0:
				System.out.println("No has acertado ningun numero");
			break;
			case 1:
				System.out.println("Has acertado un numero");
			break;
			case 2:
				System.out.println("Has acertado dos numero");
			break;
			case 3:
				System.out.println("Has acertado tres numero");
			break;
		}
	}
}

