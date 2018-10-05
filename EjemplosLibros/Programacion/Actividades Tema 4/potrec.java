public class potrec {
	public static int potencia (int x, int y) {
		if (y == 1) { //caso base
			return x; 
		}
		else { //reduccion de complejidad
			return x + potencia (x, y-1);
		}
	}
}

