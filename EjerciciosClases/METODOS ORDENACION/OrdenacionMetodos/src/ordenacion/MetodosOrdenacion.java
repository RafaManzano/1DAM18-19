package ordenacion;

public class MetodosOrdenacion {

	//Burbuja
	/*
	 * Interfaz
	 * Nombre: Bubbles
	 * Comentario: Este subprograma ordena un array de enteros por el metodo de la burbuja
	 * Cabecera: public void bubbles (int[] array)
	 * Precondiciones: El array no puede estar vacio
	 * Entrada: Un array de enteros
	 * Salida: No hay
	 * E/S: No hay
	 * Postcondiciones: Cambia el estado del array 
	 */
	
	/*
	 * PG Bubbles
	 * Inicio
	 * 	para(i=0 , mientras i < tamanhoArray, incremento 1)
	 *   	//hace burbujear al menor
	 *  	para (j = tamanhoArray-1, mientras j > i,decremento 1)
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
	 * 
	 */
	
	public static void pintarArray(int[] array) {
		for(int i = 0; i < array.length; i++) {
			System.out.println(array[i]);
		}
	}
	
}
