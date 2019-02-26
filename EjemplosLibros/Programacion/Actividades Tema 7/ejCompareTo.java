public class ejCompareTo {
	
	public static void main (String[] args) {
		
		String cad1 = "EMMA";
		String cad2 = "MARIA";
		System.out.println(cad1.compareTo("emma"));
		System.out.println(cad1.compareTo("EMMA"));
		System.out.println(cad1.compareTo("EMMA MORENO"));
		System.out.println(cad2.compareTo("MARIA AMPARO"));
		System.out.println(cad2.compareTo("MAREA"));
	}
}

