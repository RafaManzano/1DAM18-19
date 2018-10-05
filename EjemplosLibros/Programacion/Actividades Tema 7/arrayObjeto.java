public class arrayObjeto {
	
	public static String [] lista; //Se ha puesto public para poder cambiarlo desde test
	final static int POS = 10;
	
	public static void muestra() {
		for (int i = 0; i < POS; i++) {
			System.out.println(lista[i] + " ");
		}
	}
	
}

