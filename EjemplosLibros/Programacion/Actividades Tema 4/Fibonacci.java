public class Fibonacci {
	
	public static int fibonacci (int i) {
		if (i > 1) {
			return fibonacci(i - 1) + fibonacci(i - 2);
		}
		else {
			return 1;
		}
	}
}

