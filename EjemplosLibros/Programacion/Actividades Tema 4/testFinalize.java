public class testFinalize {
	
	public static void main (String[] args) {
		for (int i = 0; i < 20; i++) {
			rectangulo r = new rectangulo (5,5);
		}
		System.runFinalization();
		System.gc();
	}
}

