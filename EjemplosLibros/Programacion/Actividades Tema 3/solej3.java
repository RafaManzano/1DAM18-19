public class solej3 {
	
	public static void main (String[] args) {
		
		int i;
		int j;
		int k;
		
		for (i = 1; i <= 3; i++) {
			for (k = 1; k <= 3 - i; k++) {
				System.out.print(" ");
			}
			
			for (j = 1; j <= 2 * (i - 1) + 1; j++) {
				System.out.print("*");
			}
			System.out.println("");
		}
	}
}

