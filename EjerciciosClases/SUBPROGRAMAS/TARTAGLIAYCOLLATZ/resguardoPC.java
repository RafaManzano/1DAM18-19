/*
 * resguardoPC
 * 
 */


public class resguardoPC {
	
	/*
	 * Nec: No hay
	 * Dev: No hay
	 * Nec/Dev: No hay
	 * Requisitos: No hay
	 * 
	 * Interfaz
	 * Nombre: PresentarMenu
	 * Comentario: Muestra el menu principal
	 * Cabecera: void PresentarMenu();
	 * Precondiciones: No hay
	 * Entrada: No hay
	 * Salida: No hay
	 * E/S: No hay
	 * Postcondiciones: Solo pinta en pantalla
	 * 
	*/
	public static void PresentarMenu() {
		System.out.println("En resguardo");
	}
	
	/*
	 * Nec: 1 numero //Por valor
	 * Dev: 1 numero //Asociado al nombre
	 * Nec/Dev: No hay
	 * Requisitos: Numero mayor o igual que 0
	 * 
	 * Interfaz
	 * Nombre: CalcularFactorial
	 * Comentario: Calcular un numero factorial de forma recursiva 
	 * Cabecera: int calcularFactorial (int numero)
	 * Precondiciones: Numero mayor o igual que 0
	 * Entrada: - int numero //Numero para hacer el factorial
	 * Salida: - int factorial //Resultado del factorial
	 * E/S: No hay
	 * Postcondiciones: Asociado al nombre el resultado del factorial
	 *
	*/
	
	public static int calcularFactorial (int numero) {
		System.out.println("En resguardo");
		return 1;
	}
	
		/*
		 * Nec: 2 numero //Por valor
		 * Dev: 1 numero //Asociado al nombre
		 * Nec/Dev: No hay
		 * Requisitos: El numero debe ser 0 o mayor
		 * Formula: n! / m! * (n - m)!
		 * 
		 * Interfaz
		 * Nombre: binomioNewton
		 * Comentario: Realizamos la formula para hacer el binomio de Newton
		 * Cabecera: int binomioNewton (int n, int m)
		 * Precondiciones: El numero debe ser superior a 0 (0 incluido)
		 * Entrada: - int n
		 * 			- int m		 //La n y la m de la formula
		 * 
		 * Salida: - int resultado //El resultado del binomio
		 * E/S: No hay
		 * Postcondiciones: Asociado al nombre. El resultado del binomio
		 * 
		*/
		
	public static int binomioNewton (int numero) {
		System.out.println("En resguardo");
		return 1;
	}
	
		/*
		 * Nec: 1 numero //Por valor
		 * Dev: No hay
		 * Nec/Dev: No hay
		 * Requisitos: numFilas tiene que ser 0 o mayor
		 * 
		 * Interfaz
		 * Nombre: pintarPiramide
		 * Comentario: Pintamos la piramide
		 * Cabecera: void pintarPiramide();
		 * Precondiciones: numFilas tiene que ser 0 o mayor
		 * Entrada: - int numFilas //El numero de filas que queremos para pintar
		 * Salida: No hay 
		 * E/S: No hay
		 * Postcondiciones: Solo pinta la piramide
		 * 
		*/
		
		public static void pintarPiramide(int numFilas) {
			
			System.out.println("En resguardo");
			
		}
		
		
		/*
		 * Nec: 1 numero //Por valor
		 * Dev: 1 numero //Asociado al nombre
		 * Nec/Dev: No hay
		 * Requisitos: Numero es mayor o igual que 0
		 * 
		 * Interfaz
		 * Nombre: FormulaCollatz
		 * Comentario: Este realiza la conjetura de collatz
		 * Cabecera: int FormulaCollatz (int numero)
		 * Precondiciones: Numero es mayor o igual que 0
		 * Entrada: - int numero //Es el numero al que se le aplica la formula
		 * Salida: - int resultado //El resultado que da despues de realizar la formula
		 * E/S: No hay
		 * Postcondiciones: Asociado al nombre. El resultado de realizar la formula conjetura de collatz
		*/

		
		public static int FormulaCollatz (int numero) {
			System.out.println("En resguardo");
			
			return 1;
		}
		
		/*
		 * Nec: 1 numero //Por valor
		 * Dev: No hay
		 * Nec/Dev: No hay
		 * Requisitos: numero mayor que 0
		 * 
		 * Interfaz
		 * Nombre: pintarConjetura
		 * Comentario: Pinta la conjetura hasta que el resultado sea 1
		 * Cabecera: void pintarConjetura (int numero)
		 * Precondiciones: numero mayor que 0
		 * Entrada: - int numero //Es el numero al que se le hace la conjetura
		 * Salida: No hay
		 * E/S: No hay
		 * Postcondiciones: No hay solo pinta en pantalla 
		 * 
		*/
		 
		public static void pintarConjetura(int numero) {
			System.out.println("En resguardo");
		}
		
}

