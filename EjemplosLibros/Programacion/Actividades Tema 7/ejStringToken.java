import java.util.*;

public class ejStringToken {
	
	public static void main (String[] args) {
		
		StringTokenizer str = new StringTokenizer("Hola buenos dias mi amore");
		System.out.println("La cadena str tiene " + str.countTokens() + " elementos");
		while(str.hasMoreTokens()) {
			System.out.println(str.nextToken());
		}
	}
}

