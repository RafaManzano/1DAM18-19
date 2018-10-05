public class division0 {
	
	public static void main (String[] args) {
		int a = 2;
		int b = 0;
		int c;
		
		try {
			c = a/b;
		}
		catch(ArithmeticException e) {
			System.out.println("Error: " + e.getMessage());
			return;
		}
		System.out.println("Resultado: " + c);
	}
}

