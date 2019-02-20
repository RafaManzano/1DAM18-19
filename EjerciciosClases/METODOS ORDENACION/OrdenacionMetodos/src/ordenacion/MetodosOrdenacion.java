package ordenacion;

public class MetodosOrdenacion {

	//Burbuja
	/*
	 * Interfaz
	 * Nombre: Bubbles
	 * Comentario: Este subprograma ordena un array de enteros por el metodo de la burbuja
	 * Cabecera: public void bubbles (int[] array)
	 * Precondiciones: El array no puede estar vacio
	 * Entrada: No hay
	 * Salida: No hay
	 * E/S: Un array de entero
	 * Postcondiciones: El array ordenado
	 */
	
	/*
	 * PG Bubbles
	 * Inicio
	 * 	para(i=0 , mientras i < tamanhoArray, incremento 1)
	 *   	//hace subir al menor
	 *  	para (j = tamanhoArray - 1, mientras j > i,decremento 1)
	 *		 	si (array[j] < array[j-1])
	 *		 		//intercambio de elementos
	 *		 		aux = array[j];
	 *				array[j] = array[j-1];
     *		 		array[j-1] = aux;
	 *		 	Finsi
	 *		Finpara
	 *	Finpara
	 * Fin
	 */
	
	public static void bubbles(int[] array) {
		int aux = 0;
		
		for(int i = 0; i < array.length; i++) {
			for(int j = array.length - 1; j > i; j--) {
				if(array[j] < array[j-1]) {
					aux = array[j];
					array[j] = array[j-1];
					array[j-1] = aux;
				}
			}
		}
	}
	
	/*
	 * Interfaz
	 * Nombre: Plomada
	 * Comentario: Este subprograma ordena un array de enteros por el metodo de la plomada
	 * Cabecera: public void plomada (int[] array)
	 * Precondiciones: El array no puede estar vacio y no puede estar ordenado
	 * Entrada: No hay
	 * Salida: No hay
	 * E/S: Un array de entero
	 * Postcondiciones: El array ordenado
	 */
	
	/*
	 * PG Plomada
	 * Inicio
	 * 	para(i=0 , mientras i < tamanhoArray, i++)
	 *   	//hace caer al mayor
	 *   	para(j = tamanhoArray - 1; mientras j < i; j--) 
	 *   		Si(array[j] > array[j-1])
	 *   			//Intercambiamos posiciones
	 *   			aux = array[j-1]
	 *   			array[j-1] = array[j]
	 *   			array[j] = aux
	 *   		FinSi
	 *   	FinPara
	 *  FinPara
	 */
	
	public static void plomada(int[] array) {
		int aux = 0;
		
		for(int i = 0; i < array.length; i++) {
			for(int j = array.length - 1; j > i; j--) {
				if(array[j] > array[j-1]) {
					aux = array[j-1];
					array[j-1] = array[j];
					array[j] = aux;
				}
			}
		}
	}
	
	/*
	 * Interfaz
	 * Nombre: seleccionDirecta
	 * Comentario: Este subprograma ordena un array de enteros por el metodo de seleccion directa
	 * Cabecera: public void seleccionDirecta (int[] array)
	 * Precondiciones: El array no puede estar vacio y no puede estar ordenado
	 * Entrada: No hay
	 * Salida: No hay
	 * E/S: Un array de entero
	 * Postcondiciones: El array ordenado
	 */
	
	/*
	 * PG seleccionDirecta
	 * Inicio
	 * 	Para(i = 0; mientras i < tamanhoArray; i++)
	 * 		minimo = i
	 * 		Para (j = i + 1; mientras j < tamanhoArray; j++)
	 * 			Si(array[j] < array[minimo])
	 * 				minimo = j
	 * 			FinSi
	 * 		FinPara
	 * 		//Intercambiar para que el mas pequeño este en su lugar
	 * 		aux = array[i];
	 *		array[i] = array[minimo];
	 *		array[minimo] = aux;
	 *	FinPara
	 * Fin
	 */
	
	public static void seleccionDirecta(int[] array) {
		int aux;
		int minimo;
		
		for(int i = 0; i < array.length; i++) {
			minimo = i;
			for(int j = i + 1; j < array.length; j++) {
				if(array[j] < array[minimo]) {
					minimo = j;
				}
			}
			//Intercambiar para que el mas pequeño este en su lugar
			aux = array[i];
			array[i] = array[minimo];
		    array[minimo] = aux;
		}
	}
	
	/*
	 * Interfaz
	 * Nombre: insercionDirectaC
	 * Comentario: Este subprograma ordena un array de enteros por el metodo de insercion directa
	 * Cabecera: public void insercionDirecta (int[] array)
	 * Precondiciones: El array no puede estar vacio y no puede estar ordenado
	 * Entrada: No hay
	 * Salida: No hay
	 * E/S: Un array de entero
	 * Postcondiciones: El array ordenado
	 * NOTA: Con este metodo evalua las expresiones con cortocircuito por tanto si la primera es falsa no evaluara la segunda
	 */
	
	/* PG insercionDirecta
	 * Inicio
	 * 	Para(i = 1; mientras i < tamanhoArray; i++)
	 * 		Para(j = 1; mientras array[j - 1] > array [j] y j > 0; j--)
	 * 			//intercambio
	 * 			aux = array[j];
	 *          array[j] = array[j-1];
	 *          array[j-1] = aux;
	 *      FinPara
	 *  FinPara
	 * Fin
	 */
	
	public static void insercionDirectaC(int[] array) {
		int aux;
		
		for(int i = 1; i < array.length; i++) {
			for(int j = 1; array[j - 1] > array[j] && j > 0; j--) {
				//intercambio
				aux = array[j];
				array[j] = array[j-1];
				array[j-1] = aux;
			}
		}
	}
	
	/* PG insercionDirecta
	 * Inicio
	 * 	Para(i = 1; mientras i < tamanhoArray; i++)
	 * 		aux = array[i]
	 * 		Para(j = i - 1; mientras j > 0 y array[j] > aux; j--)
	 * 			//intercambio
	 *          array[j + 1] = array[j];
	 *          array[j] = aux;
	 *      FinPara
	 *  FinPara
	 * Fin
	 */
	public static void insercionDirecta(int[] array) {
		int aux;
		
		for(int i = 1; i < array.length; i++) {
			aux = array[i];
			for(int j = i - 1; j > 0 && array[j] > aux; j--) {
				//intercambio
				array[j + 1] = array[j];
				array[j] = aux;
			}
		}
	}
	
	/*
	 * Interfaz
	 * Nombre: pintarArray
	 * Comentario: Este subprograma pinta el array en la pantalla
	 * Cabecera: public void pintarArray (int[] array)
	 * Precondiciones: El array no puede estar vacio y no puede estar ordenado
	 * Entrada: Un array de enteros
	 * Salida: No hay
	 * E/S: No hay
	 * Postcondiciones: Solo pinta en pantalla el array
	 */
	
	public static void pintarArray(int[] array) {
		for(int i = 0; i < array.length; i++) {
			System.out.print(array[i] + " ");
		}
	}
	
}
