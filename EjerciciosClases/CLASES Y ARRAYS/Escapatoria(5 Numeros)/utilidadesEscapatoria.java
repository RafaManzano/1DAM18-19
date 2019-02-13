public class utilidadesEscapatoria {
	
	/*
	 * Interfaz
	 * Nombre: ComprobarCombinacion
	 * Comentario: Este metodo comprueba que la combinacion es correcta
	 * Cabecera: public int comprobarCombinacion(int n1 , int n2, int n3, int n4, int n5, Cerrojo combinacion)
	 * Precondiciones: No hay
	 * Entrada: - int numero1
	 * 			- int numero2
	 * 			- int numero3
	 * 			- int numero4
	 * 			- int numero5
	 * 			- Cerrojo combiancion //Contiene la combinacion correcta
	 * Salida: - int resultado
	 * E/S: No hay
	 * Postcondiciones: Asociado al nombre,
	 * 					- 0 Ningun numero acertado
	 * 					- 1 Un numero acertado
	 * 					- 2 Dos numeros acertados
	 * 					- 3 Tres numeros acertados
	 * 					- 4 Cuatro numeros acertados
	 * 					- 5 Todos numeros acertados y descubierta
	 * 
	*/
	
	public static int comprobarCombinacion(int n1, int n2, int n3, int n4, int n5, Cerrojo combinacion) {
		int resultado = 0;
		
		if(n1 == combinacion.getNumero1() && n2 == combinacion.getNumero2() && n3 == combinacion.getNumero3() && n4 == combinacion.getNumero4() && n5 == combinacion.getNumero5()) {
			resultado = 5;
			combinacion.setOculto(false);
		}
		else if((n1 == combinacion.getNumero1() && n2 == combinacion.getNumero2() && n3 == combinacion.getNumero3() && n4 == combinacion.getNumero4()) || (n1 == combinacion.getNumero1() && n3 == combinacion.getNumero3() && n4 == combinacion.getNumero4() && n5 == combinacion.getNumero5()) || (n1 == combinacion.getNumero1() && n2 == combinacion.getNumero2() && n4 == combinacion.getNumero4() && n5 == combinacion.getNumero5()) || (n2 == combinacion.getNumero2() && n3 == combinacion.getNumero3() && n4 == combinacion.getNumero4() && n5 == combinacion.getNumero5()) || (n1 == combinacion.getNumero1() && n2 == combinacion.getNumero2() && n3 == combinacion.getNumero3() && n5 == combinacion.getNumero5())) {
			resultado = 4;
			}
			else if((n1 == combinacion.getNumero1() && n2 == combinacion.getNumero2() && n3 == combinacion.getNumero3()) || (n1 == combinacion.getNumero1() && n3 == combinacion.getNumero3() && n4 == combinacion.getNumero4()) || (n1 == combinacion.getNumero1() && n2 == combinacion.getNumero2() && n5 == combinacion.getNumero5()) || (n1 == combinacion.getNumero1() && n3 == combinacion.getNumero3() && n4 == combinacion.getNumero4()) || (n1 == combinacion.getNumero1() && n3 == combinacion.getNumero3() && n5 == combinacion.getNumero5()) || (n1 == combinacion.getNumero1() && n4 == combinacion.getNumero4() && n5 == combinacion.getNumero5()) || (n2 == combinacion.getNumero2() && n3 == combinacion.getNumero3() && n4 == combinacion.getNumero4()) || (n2 == combinacion.getNumero2() && n3 == combinacion.getNumero3() && n5 == combinacion.getNumero5()) || (n2 == combinacion.getNumero2() && n5 == combinacion.getNumero5() && n4 == combinacion.getNumero4()) || (n5 == combinacion.getNumero5() && n3 == combinacion.getNumero3() && n4 == combinacion.getNumero4())) {
				resultado = 3;
				}
				else if((n1 == combinacion.getNumero1() && n2 == combinacion.getNumero2()) || (n1 == combinacion.getNumero1() && n3 == combinacion.getNumero3()) || (n1 == combinacion.getNumero1() && n4 == combinacion.getNumero4()) || (n1 == combinacion.getNumero1() && n5 == combinacion.getNumero5()) || (n3 == combinacion.getNumero3() && n2 == combinacion.getNumero2()) || (n4 == combinacion.getNumero4() && n2 == combinacion.getNumero2()) || (n5 == combinacion.getNumero5() && n2 == combinacion.getNumero2()) || (n3 == combinacion.getNumero3() && n4 == combinacion.getNumero4()) || (n3 == combinacion.getNumero3() && n5 == combinacion.getNumero5()) ||(n4 == combinacion.getNumero4() && n5 == combinacion.getNumero5())) {
					resultado = 2;
				}
					else if(n1 == combinacion.getNumero1() || n2 == combinacion.getNumero2() || n3 == combinacion.getNumero3() || n4 == combinacion.getNumero4() || n5 == combinacion.getNumero5()) {
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
			case 4:
				System.out.println("Has acertado cuatro numeros");
			break;
			case 5:
				System.out.println("Has acertado cinco numeros");
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
		if(comb.getNumero4() % 2 == 0) {
			System.out.println("El cuarto numero es par");
		}
		else {
			System.out.println("El cuarto numero es impar");
		}
		if(comb.getNumero5() % 2 == 0) {
			System.out.println("El quinto numero es par");
		}
		else {
			System.out.println("El quinto numero es impar");
		}
	}	
	/*
	 * Interfaz
	 * Nombre: segundaPista
	 * Comentario: Este metodo pinta la segunda pista en la pantalla
	 * Cabecera: public static int segundaPista(Cerrojo comb)
	 * Precondiciones: No hay
	 * Entrada: - Cerrojo comb //Es un objeto de cerrojo con la combinacion correcta para hacer la segunda pista
	 * Salida: - int suma //Es la suma de los cinco digitos
	 * E/S: No hay
	 * Postcondiciones: Asociado al nombre, es el resultado de la suma de los cinco numeros de la combinacion
	 * 
	*/
	
	public static int segundaPista (Cerrojo comb) {
		int res;
		
		res = comb.getNumero1() + comb.getNumero2() + comb.getNumero3() + comb.getNumero4() + comb.getNumero5();
		
		return res;
	}
	
	/*
	 * Interfaz
	 * Nombre: terceraPista
	 * Comentario: Este metodo pinta la tercera pista en la pantalla 
	 * Cabecera: public int terceraPista (int numero, Cerrojo comb) 
	 * Precondiciones: numero tiene que ser entre 1 y 5
	 * Entrada: - int numero
	 * 			- Cerrojo comb //Es un objeto de cerrojo con la combinacion correcta para hacer la tercera pista
	 * Salida: - int res //El resultado despues de desbloquear el numero
	 * E/S: No hay
	 * Postcondiciones: Asociado al nombre, el numero que esconde el digito
	 * 
	*/
	
	public static int terceraPista(int numero, Cerrojo comb) {
		int res = 0;
		
		switch(numero) {
			case 1:
				res = comb.getNumero1();
			break;
			
			case 2:
				res = comb.getNumero2();
			break;
			
			case 3:
				res = comb.getNumero3();
			break;
			
			case 4:
				res = comb.getNumero4();
			break;
			
			case 5:
				res = comb.getNumero5();
			break;
		}
		return res;
	}
	
	/*
	 * Interfaz
	 * Nombre: cuartaPista
	 * Comentario: Este metodo pinta la cuarta pista en la pantalla
	 * Cabecera: public static void cuartaPista(Cerrojo comb)
	 * Precondiciones: No hay
	 * Entrada: - Cerrojo comb //Es un objeto de cerrojo con la combinacion correcta para hacer la cuarta pista
	 * Salida: No hay
	 * E/S: No hay
	 * Postcondiciones: No hay, solo pinta en pantalla
	 * 
	*/
	
	public static void cuartaPista(Cerrojo comb) {
		System.out.println("4. Pista: Estos son los numeros correctos pero estan desordenados ... o no. Quien sabe");
		System.out.println(comb.getNumero5() + " " + comb.getNumero3() + " " + comb.getNumero1() + " " + comb.getNumero2() + " " + comb.getNumero4());
	}
	

}

