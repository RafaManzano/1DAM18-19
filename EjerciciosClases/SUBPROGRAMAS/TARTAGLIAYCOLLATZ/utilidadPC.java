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
	 * Entrada: 1 int //Numero para hacer el factorial
	 * Salida: 1 int //Resultado del factorial
	 * E/S: No hay
	 * Postcondiciones: Asociado al nombre el resultado del factorial
	 *
	*/
	
	public static int calcularFactorial(int numero) {
			int factorial = 1;
			
			if (numero == 0) {
				
			}
			
			else {
			factorial = numero * calcularFactorial(numero - 1); 
			}
			
			return factorial;
		}
	
	/*
	public static int calcularFactorial(int numero) {
			int factorial = 1;
			
			while (numero!= 0) {
				factorial = factorial * numero;
				numero--;
			}
			
			return factorial;
		}
		*/
		
		
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
		
		public static int binomioNewton (int n, int m) {
			int resultado;
			
			resultado = calcularFactorial(n) / (calcularFactorial(m) * calcularFactorial(n - m));
			return resultado;
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
			int resultado;
			
			if(numero % 2 == 0) {
				resultado = numero / 2;
			}
			
			else {
				resultado = (numero * 3) + 1;
			}
			
			return resultado;
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
		 * Entrada: - int numero
		 * Salida: No hay
		 * E/S: No hay
		 * Postcondiciones: No hay solo pinta en pantalla 
		 * 
		*/
		
		public static void pintarConjetura(int numero) {
			int res = 0;
			res = numero;
			System.out.println("El numero elegido es: " + numero);			
			//for (;res != 1;);
			while(res != 1) {
				res = FormulaCollatz(res);
				System.out.println(res);
			}
		}
	}


