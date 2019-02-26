public class testTemperatura {
	//Al tener las propiedades basicas en private
	//tendria que hacer get and set, no es necesario para el ejemplo
	//por lo que nos quedamos con algo mal
	private static int[] temperaturas1;
	final static int POS = 10; //numero de posiciones del array
	
	public static void main (String[] args) {
		int dato = 0;
		int media = 0;
		
		temperaturas1 = new int[POS];
		for(int i = 0; i < POS; i++) { //Leer los valores de temperatura
			try {
				System.out.println("Introduzca Temperatura");
				String sdato = System.console().readLine();
				dato = Integer.parseInt(sdato);
			}
			catch(Exception e) {
				System.out.println("Error en la introducion de datos");
			}
			temperaturas1[i] = dato;
		}
		
		for(int i = 0; i < POS; i++) { //Hacer la media
			media = media + temperaturas1[i];
		}
		media = media / POS;
		System.out.println("La media de temperaturas es " + media);
	}
}

