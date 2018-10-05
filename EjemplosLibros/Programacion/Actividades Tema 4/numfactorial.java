public class numfactorial {
	
	public static int factorial (int num) {
		if (num == 0) {
			return 1;
		}
		
		return num * factorial(num - 1);
	}
	
	public static int iterativo (int num) {
		int factorial = 1;
		
		while (num > 0) {
			factorial *= num;
			num--;
		}
		return factorial;
	}
}

