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
				System.out.println("Has acertado dos numeros");
			break;
			case 3:
				System.out.println("Has acertado tres numeros");
			break;
		}
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
		System.out.println("1. Pista: Numeros pares y numeros impares");
		if(comb.getNumero1() % 2 == 0) {
			System.out.println("El primer numero es par");
		}
		else {
			System.out.println("El primer numero es impar");
		}
		
		if(comb.getNumero2() % 2 == 0) {
			System.out.println("El segundo numero es par");
		}
		else {
			System.out.println("El segundo numero es impar");
		}
		
		if(comb.getNumero3() % 2 == 0) {
			System.out.println("El tercero numero es par");
		}
		else {
			System.out.println("El tercero numero es impar");
		}
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
		int res;
		
		res = comb.getNumero1() + comb.getNumero2() + comb.getNumero3();
		
		return res;
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
		System.out.println("3. Pista: Estos son los numeros correctos pero estan desordenados ... o no. Quien sabe");
		System.out.println(comb.getNumero3() + " " + comb.getNumero1() + "  " + comb.getNumero2());
	}
	

}

