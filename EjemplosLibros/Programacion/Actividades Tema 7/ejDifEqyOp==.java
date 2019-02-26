public class ejDifEqyOp{
	
	public static void main (String[] args) {
		String cad1 = "EMMA";
		String cad2 = new String("EMMA");
		
		if (cad1.equals(cad2)) {
			System.out.println("SON IGUALES");
		}
		else {
			System.out.println("SON DIFERENTES");
		}
		
		if(cad1 == cad2) {
			System.out.println("SON IGUALES");
		}
		else {
			System.out.println("SON DIFERENTES");
		}
	}
}

