public class metodosEqCl {
	
	public static void main (String[] args) {
		
		byte[] temp1 = {10,11,12,11,10,9,18,19,14,13,15,15};
		byte[] temp2 = (byte[])temp1.clone();
		byte[] temp3 = temp1;
		
		if(temp1.equals(temp2)){
			System.out.println("Temperatura1 es igual a Temperatura2");
		}
		
		else{
			System.out.println("Temperatura1 no es igual a Temperatura2");
		}
		
		if(temp1.equals(temp3)) {
			System.out.println("Temperatura1  es igual a Temperatura3");
		}
		
		else{
			System.out.println("Temperatura1 no es igual a Temperatura3");
		}
	}
}

