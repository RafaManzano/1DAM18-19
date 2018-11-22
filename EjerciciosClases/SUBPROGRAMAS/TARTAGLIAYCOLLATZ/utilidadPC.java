/*
 * 
 * 
 */


public class utilidadPC {
	
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
		System.out.println("Elija una opcion");
		System.out.println("1. Piramide de Tartaglia");
		System.out.println("2. Conjetura de Collatz");
		System.out.println("0. Salir");
	}
	
	/*
	 * Nec: 1 numero
	 * Dev: 1 numero
	 * Nec/Dev: No hay
	 * Requisitos: No hay
	 * 
	 * Interfaz
	 * Nombre: CalcularFactorial
	 * Comentario: Calcular un numero factorial
	 * Cabecera: int calcularFactorial (int numero)
	 * Precondiciones: No hay
	 * Entrada: 1 int 
	 * Salida: 1 int 
	 * E/S: No hay
	 * Postcondiciones: Asociado al nombre el resultado del factorial
	 *
	
	
	public static int calcularFactorial(int numero) {
			int factorial = 1;
			
			if (numero == 0) {
				
			}
			
			else {
			factorial = numero * calcularFactorial(numero - 1); 
			}
			
			return factorial;
		}
	*/	
	
	public static int calcularFactorial(int numero) {
			int factorial = 1;
			
			while (numero!= 0) {
				factorial = factorial * numero;
				numero--;
			}
			
			return factorial;
		}
		
		/*
		 * Nec: 2 numero
		 * Dev: 1 numero
		 * Nec/Dev: No hay
		 * Requisitos: El numero debe ser 0 o mayor
		 * 
		 * Interfaz
		 * Nombre: binomioNewton
		 * Comentario: Realizamos la formula para hacer el binomio de Newton
		 * Cabecera: int binomioNewton (int numFilas, int m)
		 * Precondiciones: El numero debe ser superior a 0 (0 incluido)
		 * Entrada: 2 int
		 * Salida: 1 int 
		 * E/S: No hay
		 * Postcondiciones: Asociado al nombre. El resultado del binomio
		 * 
		*/
		
		public static int binomioNewton (int numFilas, int m) {
			int resultado;
			
			resultado = calcularFactorial(numFilas) / (calcularFactorial(m) * calcularFactorial(numFilas - m));
			return resultado;
		 }
		 
		/*
		 * Nec: 1 numero
		 * Dev: No hay
		 * Nec/Dev: No hay
		 * Requisitos: No hay
		 * 
		 * Interfaz
		 * Nombre: pintarPiramide
		 * Comentario: Pintamos la piramide
		 * Cabecera: void pintarPiramide();
		 * Precondiciones: No hay
		 * Entrada: 1 numero
		 * Salida: No hay 
		 * E/S: No hay
		 * Postcondiciones: Solo pinta la piramide
		 * 
		*/
		
		public static void pintarPiramide(int numFilas) {
			int m = 0;
			int altura = numFilas;
			for(int contador = 0; contador <= numFilas; numFilas--, altura--) {
				m = altura;
				for (int cont = 0; cont <= altura; cont++) {
				System.out.print(binomioNewton (numFilas, m) + " ");
				m--;
				}
			System.out.println();
			
		}
	}
				/*
		 * Nec: 1 numero
		 * Dev: 1 numero
		 * Nec/Dev: No hay
		 * 
		 * Interfaz
		 * Nombre: FormulaCollatz
		 * Comentario: Este realiza la conjetura de collatz
		 * Cabecera: int FormulaCollatz (int numero)
		 * Precondiciones: No hay
		 * Entrada: 1 numero (int)
		 * Salida: 1 numero (int)
		 * E/S: No hay
		 * Postcondiciones: Asociado al nombre. El resultado de realizar la formula conjetura de collatz
		*/
		
		public static int FormulaCollatz (int numero) {
			int resultado;
			
			if(numero % 2 == 0) {
				resultado = numero / 2;
			}
			
			else {
				resultado = (numero * 3) + 1;
			}
			
			return resultado;
		}
		
	}

