public class testCirculo {
	
	public static void main (String[] args) {
		
		Circulo c1 = new Circulo(1,2,11);
		Circulo c2 = new Circulo(1,2,9);
		Circulo c3 = new Circulo(1,2,3);
		Circulo c4 = new Circulo(1,2,9);
		
		System.out.println(c1.compareTo(c2));
		System.out.println(c2.compareTo(c4));
		System.out.println(c3.compareTo(c4));
		
		System.out.println(c1.toString());
		System.out.println(c2.toString());
		try {
		c2.setRadio(-9);
		}
		catch(ExcepcionCirculo err){
			System.out.println("ERROR!! " + err);
		}
		System.out.println(c2.toString());
		
		c1.setXCentro(3);
		c1.setYCentro(20);
		try {
		c1.setRadio(9);
		}
		catch(ExcepcionCirculo err){
			System.out.println("ERROR!! " + err);
		}
		
		System.out.println(c3.equals(c1));
		System.out.println(c4.equals(c1));
		
		
	}
}

